package org.jfree.data.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.removeChangeListener(seriesChangeListener9);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, class19);
        java.util.Collection collection22 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        timeSeries1.setNotify(false);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(true);
        timeSeries1.setDomainDescription("Value");
        timeSeries1.setDomainDescription("Overwritten values from: 0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        timeSeries1.setRangeDescription("Value");
        java.lang.Class class13 = timeSeries1.timePeriodClass;
        timeSeries1.setNotify(true);
        java.lang.String str16 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        timeSeries1.setNotify(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.util.List list6 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setMaximumItemCount(0);
        timeSeries8.setKey((java.lang.Comparable) 0.0d);
        boolean boolean14 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class18);
        timeSeries19.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries8.addAndOrUpdate(timeSeries19);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries8.addChangeListener(seriesChangeListener23);
        boolean boolean25 = timeSeries8.getNotify();
        timeSeries8.removeAgedItems(false);
        java.util.Collection collection28 = timeSeries8.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem29, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setRangeDescription("Time");
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        timeSeries7.setDomainDescription("");
        java.lang.String str11 = timeSeries7.getDescription();
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries7);
        int int13 = timeSeries7.getMaximumItemCount();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setRangeDescription("hi!");
        boolean boolean12 = timeSeries3.equals((java.lang.Object) timeSeries8);
        java.lang.Class class13 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 10", class13);
        timeSeries15.clear();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.addAndOrUpdate(timeSeries14);
        boolean boolean16 = timeSeries12.getNotify();
        java.util.List list17 = timeSeries12.data;
        boolean boolean18 = timeSeries1.equals((java.lang.Object) list17);
        java.lang.Comparable comparable19 = timeSeries1.getKey();
        timeSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + false + "'", comparable19, false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        boolean boolean8 = timeSeries1.isEmpty();
        timeSeries1.setNotify(false);
        boolean boolean11 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        boolean boolean16 = timeSeries13.equals((java.lang.Object) 100.0d);
        timeSeries13.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries13.addChangeListener(seriesChangeListener19);
        java.util.List list21 = timeSeries13.getItems();
        timeSeries13.setNotify(true);
        java.lang.Comparable comparable24 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries1.addAndOrUpdate(timeSeries13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries28 = timeSeries13.createCopy((int) 'a', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 10.0f + "'", comparable24, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class4 = timeSeries3.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries3.addChangeListener(seriesChangeListener5);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        boolean boolean8 = timeSeries3.isEmpty();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        boolean boolean10 = timeSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        timeSeries3.setRangeDescription("Value");
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        timeSeries19.setNotify(true);
        java.lang.Class class23 = timeSeries19.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class23);
        timeSeries3.timePeriodClass = class23;
        java.lang.Class<?> wildcardClass27 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass27);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries29.removeChangeListener(seriesChangeListener30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries29.add(regularTimePeriod32, (double) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        timeSeries7.setRangeDescription("hi!");
        boolean boolean11 = timeSeries2.equals((java.lang.Object) timeSeries7);
        java.lang.Class class12 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class12);
        timeSeries13.setDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod16, (double) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.addOrUpdate(regularTimePeriod2, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        java.util.List list7 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean10 = timeSeries9.getNotify();
        timeSeries9.setRangeDescription("hi!");
        boolean boolean13 = timeSeries9.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.addAndOrUpdate(timeSeries9);
        timeSeries9.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod17, (java.lang.Number) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        long long8 = timeSeries6.getMaximumItemAge();
        java.lang.String str9 = timeSeries6.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        boolean boolean14 = timeSeries11.equals((java.lang.Object) 100.0d);
        timeSeries11.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        timeSeries18.setNotify(true);
        boolean boolean22 = timeSeries11.equals((java.lang.Object) timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) ' ', (int) '#');
        java.util.Collection collection26 = timeSeries6.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        java.util.List list27 = timeSeries25.data;
        boolean boolean28 = timeSeries1.equals((java.lang.Object) timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries25.createCopy((int) (short) 1, (int) '#');
        long long32 = timeSeries25.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class35 = timeSeries34.timePeriodClass;
        java.util.List list36 = timeSeries34.data;
        timeSeries25.data = list36;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9223372036854775807L + "'", long32 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setDomainDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy(regularTimePeriod4, regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        java.lang.String str6 = timeSeries1.getRangeDescription();
        timeSeries1.setDescription("Overwritten values from: -1");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        boolean boolean9 = timeSeries6.equals((java.lang.Object) 100.0d);
        timeSeries6.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        timeSeries13.setNotify(true);
        boolean boolean17 = timeSeries6.equals((java.lang.Object) timeSeries13);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries6.createCopy((int) ' ', (int) '#');
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        java.util.List list22 = timeSeries20.data;
        java.util.Collection collection23 = timeSeries20.getTimePeriods();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.fireSeriesChanged();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setDomainDescription("hi!");
        int int7 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        long long11 = timeSeries9.getMaximumItemAge();
        timeSeries9.removeAgedItems(false);
        timeSeries9.setKey((java.lang.Comparable) 'a');
        timeSeries9.fireSeriesChanged();
        java.util.Collection collection17 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        timeSeries1.setMaximumItemAge((long) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeSeries1.getIndex(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod4, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        java.util.List list10 = timeSeries1.getItems();
        timeSeries1.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        java.util.List list16 = timeSeries14.getItems();
        timeSeries14.setDescription("Time");
        timeSeries14.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.createCopy((int) 'a', 2147483647);
        java.util.List list24 = timeSeries23.getItems();
        timeSeries1.data = list24;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = timeSeries1.getIndex(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        timeSeries7.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable15 = timeSeries7.getKey();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        boolean boolean23 = timeSeries20.equals((java.lang.Object) 100.0d);
        timeSeries20.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection28 = timeSeries27.getTimePeriods();
        timeSeries27.setNotify(true);
        boolean boolean31 = timeSeries20.equals((java.lang.Object) timeSeries27);
        timeSeries20.fireSeriesChanged();
        java.util.Collection collection33 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        java.util.Collection collection34 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        int int35 = timeSeries17.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries17.createCopy((int) (short) 0, 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries38.add(regularTimePeriod39, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 9223372036854775807L + "'", comparable15, 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        java.lang.String str9 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean12 = timeSeries11.getNotify();
        int int13 = timeSeries11.getMaximumItemCount();
        java.util.List list14 = timeSeries11.data;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries11.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        java.util.List list21 = timeSeries19.getItems();
        timeSeries19.setDescription("Time");
        int int24 = timeSeries19.getItemCount();
        java.util.Collection collection25 = timeSeries19.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries11.addAndOrUpdate(timeSeries19);
        int int27 = timeSeries11.getMaximumItemCount();
        boolean boolean28 = timeSeries1.equals((java.lang.Object) timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class31 = timeSeries30.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries30.addChangeListener(seriesChangeListener32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection38 = timeSeries37.getTimePeriods();
        long long39 = timeSeries37.getMaximumItemAge();
        java.util.Collection collection40 = timeSeries30.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener41);
        timeSeries37.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries11.addAndOrUpdate(timeSeries37);
        java.lang.String str46 = timeSeries37.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener47);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 9223372036854775807L + "'", long39 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Value" + "'", str46, "Value");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        boolean boolean11 = timeSeries4.isEmpty();
        java.lang.String str12 = timeSeries4.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries4.addChangeListener(seriesChangeListener13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries4.createCopy((-1), 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        int int13 = timeSeries8.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod14, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.removeAgedItems((long) '#', true);
        java.lang.Class class16 = timeSeries1.getTimePeriodClass();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries1.addOrUpdate(regularTimePeriod19, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class16);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        timeSeries7.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable15 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries7.removeChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 9223372036854775807L + "'", comparable15, 9223372036854775807L);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = timeSeries1.getRangeDescription();
        boolean boolean12 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate(regularTimePeriod13, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        long long8 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        boolean boolean14 = timeSeries1.equals((java.lang.Object) seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries16.setRangeDescription("Value");
        boolean boolean19 = timeSeries16.getNotify();
        timeSeries16.setDomainDescription("Time");
        timeSeries16.clear();
        java.lang.Class class23 = timeSeries16.timePeriodClass;
        timeSeries1.timePeriodClass = class23;
        boolean boolean25 = timeSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries1.removeChangeListener(seriesChangeListener26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem3 = timeSeries1.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        int int5 = timeSeries1.getMaximumItemCount();
        java.util.List list6 = timeSeries1.data;
        timeSeries1.setNotify(true);
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries7.setRangeDescription("Value");
        java.lang.String str10 = timeSeries7.getDescription();
        java.lang.Comparable comparable11 = timeSeries7.getKey();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        boolean boolean16 = timeSeries13.equals((java.lang.Object) 100.0d);
        timeSeries13.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries13.addChangeListener(seriesChangeListener19);
        java.util.List list21 = timeSeries13.getItems();
        timeSeries7.data = list21;
        boolean boolean23 = timeSeries1.equals((java.lang.Object) list21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        boolean boolean4 = timeSeries1.getNotify();
        timeSeries1.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy(32, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        java.util.List list7 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean10 = timeSeries9.getNotify();
        timeSeries9.setRangeDescription("hi!");
        boolean boolean13 = timeSeries9.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.delete(32, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems(true);
        boolean boolean9 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean12 = timeSeries11.getNotify();
        java.util.List list13 = timeSeries11.getItems();
        timeSeries1.data = list13;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries1.addOrUpdate(regularTimePeriod15, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        java.util.List list8 = timeSeries6.getItems();
        timeSeries6.clear();
        timeSeries6.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries12.addChangeListener(seriesChangeListener18);
        java.util.List list20 = timeSeries12.getItems();
        timeSeries6.data = list20;
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        java.util.List list26 = timeSeries24.getItems();
        timeSeries24.clear();
        java.lang.String str28 = timeSeries24.getRangeDescription();
        java.util.List list29 = timeSeries24.getItems();
        timeSeries6.data = list29;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries6.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.lang.Comparable comparable5 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        java.util.List list15 = timeSeries7.getItems();
        timeSeries1.data = list15;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries1.removeChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int21 = timeSeries20.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection24 = timeSeries23.getTimePeriods();
        timeSeries23.setNotify(true);
        java.lang.Class class27 = timeSeries23.timePeriodClass;
        java.lang.Comparable comparable28 = timeSeries23.getKey();
        boolean boolean29 = timeSeries20.equals((java.lang.Object) timeSeries23);
        boolean boolean30 = timeSeries23.isEmpty();
        int int31 = timeSeries23.getMaximumItemCount();
        timeSeries23.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries1.addAndOrUpdate(timeSeries23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries23.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10.0f + "'", comparable5, 10.0f);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 10.0f + "'", comparable28, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries1.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        int int8 = timeSeries1.getItemCount();
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        java.util.Collection collection10 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        long long18 = timeSeries16.getMaximumItemAge();
        java.lang.Class class19 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "", class19);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries1.addAndOrUpdate(timeSeries21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = timeSeries21.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.String str7 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean5 = timeSeries4.getNotify();
        int int6 = timeSeries4.getMaximumItemCount();
        java.util.List list7 = timeSeries4.data;
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries4.createCopy((int) '4', (int) (short) 100);
        java.util.List list11 = timeSeries10.getItems();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        boolean boolean16 = timeSeries13.equals((java.lang.Object) 100.0d);
        timeSeries13.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        timeSeries20.setNotify(true);
        boolean boolean24 = timeSeries13.equals((java.lang.Object) timeSeries20);
        timeSeries13.fireSeriesChanged();
        java.util.List list26 = timeSeries13.data;
        timeSeries10.data = list26;
        timeSeries1.data = list26;
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemAge((long) 'a');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries1.addOrUpdate(regularTimePeriod33, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        timeSeries1.removeAgedItems(true);
        timeSeries1.setKey((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        java.lang.Comparable comparable10 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries12.getRangeDescription();
        boolean boolean17 = timeSeries12.isEmpty();
        java.util.Collection collection18 = timeSeries12.getTimePeriods();
        boolean boolean19 = timeSeries12.isEmpty();
        boolean boolean20 = timeSeries12.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries12.removeChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection25 = timeSeries24.getTimePeriods();
        boolean boolean27 = timeSeries24.equals((java.lang.Object) 100.0d);
        timeSeries24.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries12.addAndOrUpdate(timeSeries24);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries24.removePropertyChangeListener(propertyChangeListener31);
        java.util.List list33 = timeSeries24.getItems();
        timeSeries1.data = list33;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (byte) -1 + "'", comparable10, (byte) -1);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.setNotify(true);
        java.lang.Class class7 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class7);
        java.util.List list10 = timeSeries9.data;
        boolean boolean11 = timeSeries9.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries9.removeChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        timeSeries15.setNotify(true);
        java.lang.Class class19 = timeSeries15.timePeriodClass;
        java.util.List list20 = timeSeries15.getItems();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean23 = timeSeries22.getNotify();
        timeSeries22.setMaximumItemCount(0);
        timeSeries22.setKey((java.lang.Comparable) 0.0d);
        boolean boolean28 = timeSeries15.equals((java.lang.Object) timeSeries22);
        boolean boolean29 = timeSeries22.isEmpty();
        timeSeries22.removeAgedItems((long) 32, false);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection35 = timeSeries34.getTimePeriods();
        long long36 = timeSeries34.getMaximumItemAge();
        timeSeries34.removeAgedItems(false);
        timeSeries34.setKey((java.lang.Comparable) 'a');
        timeSeries34.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries22.addAndOrUpdate(timeSeries34);
        boolean boolean43 = timeSeries9.equals((java.lang.Object) timeSeries42);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        timeSeries9.removePropertyChangeListener(propertyChangeListener44);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 9223372036854775807L + "'", long36 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        java.lang.String str8 = timeSeries1.getDescription();
        java.util.List list9 = timeSeries1.data;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        int int8 = timeSeries6.getMaximumItemCount();
        java.util.List list9 = timeSeries6.data;
        boolean boolean10 = timeSeries6.getNotify();
        java.util.Collection collection11 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        timeSeries1.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        boolean boolean18 = timeSeries15.equals((java.lang.Object) 100.0d);
        timeSeries15.setNotify(true);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection24 = timeSeries23.getTimePeriods();
        boolean boolean26 = timeSeries23.equals((java.lang.Object) 100.0d);
        timeSeries23.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries23.addChangeListener(seriesChangeListener29);
        java.util.List list31 = timeSeries23.getItems();
        timeSeries23.setNotify(true);
        timeSeries23.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries23.addChangeListener(seriesChangeListener35);
        java.util.Collection collection37 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        timeSeries23.setDescription("Time");
        int int40 = timeSeries23.getMaximumItemCount();
        java.util.List list41 = timeSeries23.data;
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries23.addPropertyChangeListener(propertyChangeListener42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertNotNull(list41);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        boolean boolean11 = timeSeries4.isEmpty();
        java.lang.String str12 = timeSeries4.getDescription();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        boolean boolean19 = timeSeries14.isEmpty();
        java.util.Collection collection20 = timeSeries14.getTimePeriods();
        boolean boolean21 = timeSeries14.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener22);
        timeSeries14.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries4.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        boolean boolean31 = timeSeries28.equals((java.lang.Object) 100.0d);
        timeSeries28.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection36 = timeSeries35.getTimePeriods();
        timeSeries35.setNotify(true);
        boolean boolean39 = timeSeries28.equals((java.lang.Object) timeSeries35);
        timeSeries28.fireSeriesChanged();
        java.util.List list41 = timeSeries28.getItems();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection44 = timeSeries43.getTimePeriods();
        timeSeries43.setNotify(true);
        java.lang.Class class47 = timeSeries43.timePeriodClass;
        java.util.List list48 = timeSeries43.getItems();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean51 = timeSeries50.getNotify();
        timeSeries50.setMaximumItemCount(0);
        timeSeries50.setKey((java.lang.Comparable) 0.0d);
        boolean boolean56 = timeSeries43.equals((java.lang.Object) timeSeries50);
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class60 = timeSeries59.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class60);
        timeSeries61.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries50.addAndOrUpdate(timeSeries61);
        java.util.Collection collection65 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries50);
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries26.addAndOrUpdate(timeSeries50);
        int int67 = timeSeries66.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod68 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries66.add(regularTimePeriod68, (java.lang.Number) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(class47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(class60);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, class1);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean6 = timeSeries5.getNotify();
        int int7 = timeSeries5.getMaximumItemCount();
        java.util.List list8 = timeSeries5.data;
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries5.createCopy((int) '4', (int) (short) 100);
        long long12 = timeSeries5.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries5.equals((java.lang.Object) seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries20.setRangeDescription("Value");
        boolean boolean23 = timeSeries20.getNotify();
        timeSeries20.setDomainDescription("Time");
        timeSeries20.clear();
        java.lang.Class class27 = timeSeries20.timePeriodClass;
        timeSeries5.timePeriodClass = class27;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "Value", "", class27);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", class27);
        timeSeries30.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number33 = timeSeries30.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(class27);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        timeSeries1.removeAgedItems((long) (byte) 1, true);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy(0, 32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.delete(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(timeSeries11);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class3);
        java.util.List list5 = timeSeries4.getItems();
        java.lang.Class<?> wildcardClass6 = timeSeries4.getClass();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        boolean boolean9 = timeSeries6.equals((java.lang.Object) 100.0d);
        timeSeries6.setNotify(true);
        java.lang.Class<?> wildcardClass12 = timeSeries6.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, (java.lang.Class) wildcardClass12);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        java.util.List list8 = timeSeries6.getItems();
        timeSeries6.clear();
        timeSeries6.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries12.addChangeListener(seriesChangeListener18);
        java.util.List list20 = timeSeries12.getItems();
        timeSeries6.data = list20;
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries25 = timeSeries1.createCopy(regularTimePeriod23, regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        long long14 = timeSeries12.getMaximumItemAge();
        java.lang.String str15 = timeSeries12.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        long long19 = timeSeries17.getMaximumItemAge();
        java.lang.String str20 = timeSeries17.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection23 = timeSeries22.getTimePeriods();
        boolean boolean25 = timeSeries22.equals((java.lang.Object) 100.0d);
        timeSeries22.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection30 = timeSeries29.getTimePeriods();
        timeSeries29.setNotify(true);
        boolean boolean33 = timeSeries22.equals((java.lang.Object) timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries22.createCopy((int) ' ', (int) '#');
        java.util.Collection collection37 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries36);
        java.util.List list38 = timeSeries36.data;
        boolean boolean39 = timeSeries12.equals((java.lang.Object) timeSeries36);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries36.createCopy((int) (short) 1, (int) '#');
        long long43 = timeSeries36.getMaximumItemAge();
        java.lang.Class class44 = timeSeries36.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries1.addAndOrUpdate(timeSeries36);
        int int46 = timeSeries36.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries36.add(regularTimePeriod47, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 9223372036854775807L + "'", long43 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        timeSeries1.setMaximumItemAge((long) (byte) 10);
        java.lang.String str11 = timeSeries1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(32, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        java.lang.String str9 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean12 = timeSeries11.getNotify();
        int int13 = timeSeries11.getMaximumItemCount();
        java.util.List list14 = timeSeries11.data;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries11.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        java.util.List list21 = timeSeries19.getItems();
        timeSeries19.setDescription("Time");
        int int24 = timeSeries19.getItemCount();
        java.util.Collection collection25 = timeSeries19.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries11.addAndOrUpdate(timeSeries19);
        int int27 = timeSeries11.getMaximumItemCount();
        boolean boolean28 = timeSeries1.equals((java.lang.Object) timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class31 = timeSeries30.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries30.addChangeListener(seriesChangeListener32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection38 = timeSeries37.getTimePeriods();
        long long39 = timeSeries37.getMaximumItemAge();
        java.util.Collection collection40 = timeSeries30.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener41);
        timeSeries37.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries11.addAndOrUpdate(timeSeries37);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries11.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 9223372036854775807L + "'", long39 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries45);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.setNotify(true);
        java.lang.Class class7 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class7);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        timeSeries1.removeAgedItems(false);
        java.lang.Comparable comparable12 = timeSeries1.getKey();
        long long13 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.addOrUpdate(regularTimePeriod14, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) -1 + "'", comparable12, (byte) -1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        timeSeries1.timePeriodClass = class5;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod7, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        long long8 = timeSeries1.getMaximumItemAge();
        boolean boolean9 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems(true);
        timeSeries1.setDomainDescription("Overwritten values from: 0");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries1.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        timeSeries1.setMaximumItemCount((int) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries1.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setKey((java.lang.Comparable) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10.0f + "'", comparable6, 10.0f);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        timeSeries7.setDomainDescription("");
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        timeSeries7.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        boolean boolean16 = timeSeries13.equals((java.lang.Object) 100.0d);
        timeSeries13.setNotify(true);
        java.lang.Class class19 = timeSeries13.getTimePeriodClass();
        long long20 = timeSeries13.getMaximumItemAge();
        timeSeries13.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries7.addAndOrUpdate(timeSeries13);
        org.jfree.data.time.TimeSeries timeSeries24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection25 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 0 + "'", comparable10, (short) 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries23);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        timeSeries7.setDomainDescription("");
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        timeSeries7.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        boolean boolean16 = timeSeries13.equals((java.lang.Object) 100.0d);
        timeSeries13.setNotify(true);
        java.lang.Class class19 = timeSeries13.getTimePeriodClass();
        long long20 = timeSeries13.getMaximumItemAge();
        timeSeries13.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries7.addAndOrUpdate(timeSeries13);
        java.lang.Comparable comparable24 = timeSeries23.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.update(regularTimePeriod25, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 0 + "'", comparable10, (short) 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + "Overwritten values from: 0" + "'", comparable24, "Overwritten values from: 0");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.lang.Comparable comparable5 = timeSeries1.getKey();
        boolean boolean6 = timeSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries1.addOrUpdate(regularTimePeriod10, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10.0f + "'", comparable5, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d));
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
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class class2 = timeSeries1.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.removeAgedItems(false);
        timeSeries1.setDescription("Time");
        timeSeries1.setKey((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemAge((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries1.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries4.fireSeriesChanged();
        timeSeries4.removeAgedItems(false);
        java.lang.String str8 = timeSeries4.getDescription();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        timeSeries10.setNotify(true);
        int int14 = timeSeries10.getItemCount();
        java.lang.Class class15 = timeSeries10.getTimePeriodClass();
        timeSeries4.timePeriodClass = class15;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "", "Value", class15);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        boolean boolean5 = timeSeries2.equals((java.lang.Object) 100.0d);
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.setNotify(true);
        boolean boolean13 = timeSeries2.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries2.createCopy((int) ' ', (int) '#');
        int int17 = timeSeries16.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener23);
        java.lang.Class class25 = timeSeries19.getTimePeriodClass();
        timeSeries16.timePeriodClass = class25;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class25);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class25);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(100);
        timeSeries1.setRangeDescription("Value");
        java.lang.Class class8 = timeSeries1.timePeriodClass;
        timeSeries1.setRangeDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.String str10 = timeSeries6.getDescription();
        timeSeries6.clear();
        int int12 = timeSeries6.getMaximumItemCount();
        timeSeries6.fireSeriesChanged();
        timeSeries6.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries6.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        int int5 = timeSeries1.getItemCount();
        java.lang.String str6 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setRangeDescription("hi!");
        boolean boolean12 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries8);
        int int14 = timeSeries8.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries16.setRangeDescription("Value");
        java.lang.String str19 = timeSeries16.getDescription();
        java.util.List list20 = timeSeries16.data;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean23 = timeSeries22.getNotify();
        int int24 = timeSeries22.getMaximumItemCount();
        java.util.List list25 = timeSeries22.data;
        java.util.Collection collection26 = timeSeries22.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries16.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries8.addAndOrUpdate(timeSeries16);
        java.lang.Class class29 = null;
        timeSeries8.timePeriodClass = class29;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        timeSeries1.removeAgedItems(false);
        timeSeries1.setKey((java.lang.Comparable) "Overwritten values from: -1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.lang.Comparable comparable5 = timeSeries1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10.0f + "'", comparable5, 10.0f);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        boolean boolean6 = timeSeries1.getNotify();
        java.lang.String str7 = timeSeries1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = timeSeries1.getIndex(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        int int6 = timeSeries1.getItemCount();
        java.lang.String str7 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy(regularTimePeriod8, regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        int int5 = timeSeries1.getItemCount();
        java.lang.String str6 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setRangeDescription("hi!");
        boolean boolean12 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries8);
        int int14 = timeSeries8.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries16.setRangeDescription("Value");
        java.lang.String str19 = timeSeries16.getDescription();
        java.util.List list20 = timeSeries16.data;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean23 = timeSeries22.getNotify();
        int int24 = timeSeries22.getMaximumItemCount();
        java.util.List list25 = timeSeries22.data;
        java.util.Collection collection26 = timeSeries22.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries16.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries8.addAndOrUpdate(timeSeries16);
        timeSeries8.removeAgedItems(false);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        java.util.List list7 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean10 = timeSeries9.getNotify();
        timeSeries9.setRangeDescription("hi!");
        boolean boolean13 = timeSeries9.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries14.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        timeSeries9.setDomainDescription("");
        timeSeries9.setKey((java.lang.Comparable) 100);
        timeSeries9.removeAgedItems((long) (byte) 1, false);
        java.util.Collection collection18 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        java.lang.String str19 = timeSeries4.getRangeDescription();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        int int8 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.getDataItem(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        boolean boolean6 = timeSeries1.equals((java.lang.Object) ' ');
        timeSeries1.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        java.util.List list12 = timeSeries10.getItems();
        timeSeries10.clear();
        java.lang.String str14 = timeSeries10.getRangeDescription();
        java.util.List list15 = timeSeries10.getItems();
        timeSeries1.data = list15;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        long long8 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries12.addChangeListener(seriesChangeListener18);
        java.util.List list20 = timeSeries12.getItems();
        timeSeries12.setNotify(true);
        java.util.Collection collection23 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod24, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.util.List list6 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setMaximumItemCount(0);
        timeSeries8.setKey((java.lang.Comparable) 0.0d);
        boolean boolean14 = timeSeries1.equals((java.lang.Object) timeSeries8);
        boolean boolean15 = timeSeries8.isEmpty();
        timeSeries8.removeAgedItems((long) 32, false);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        long long22 = timeSeries20.getMaximumItemAge();
        timeSeries20.removeAgedItems(false);
        timeSeries20.setKey((java.lang.Comparable) 'a');
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries8.addAndOrUpdate(timeSeries20);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries28.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries28.getDataItem(regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(true);
        java.lang.String str6 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        boolean boolean14 = timeSeries11.equals((java.lang.Object) 100.0d);
        timeSeries11.setNotify(true);
        java.lang.Class class17 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), "hi!", "Overwritten values from: 10", class17);
        boolean boolean19 = timeSeries1.equals((java.lang.Object) class17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        boolean boolean11 = timeSeries8.equals((java.lang.Object) 100.0d);
        timeSeries8.setNotify(true);
        java.lang.Class<?> wildcardClass14 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass14);
        long long18 = timeSeries17.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = timeSeries17.getValue(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        java.lang.String str5 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(true);
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        boolean boolean11 = timeSeries8.equals((java.lang.Object) 100.0d);
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries1.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        timeSeries7.setDomainDescription("");
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod13, (double) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 0 + "'", comparable10, (short) 0);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        int int5 = timeSeries1.getItemCount();
        java.lang.String str6 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.String str12 = timeSeries8.getRangeDescription();
        boolean boolean13 = timeSeries8.isEmpty();
        java.util.Collection collection14 = timeSeries8.getTimePeriods();
        boolean boolean15 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        java.lang.Number number18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries1.addOrUpdate(regularTimePeriod17, number18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        long long13 = timeSeries7.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class17 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class17);
        java.lang.Comparable comparable19 = timeSeries18.getKey();
        java.util.Collection collection20 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener21);
        java.lang.String str23 = timeSeries18.getDescription();
        timeSeries18.setNotify(true);
        java.lang.Comparable comparable26 = timeSeries18.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries18.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 1 + "'", comparable19, (short) 1);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + comparable26 + "' != '" + (short) 1 + "'", comparable26, (short) 1);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        timeSeries7.setRangeDescription("hi!");
        java.lang.Class class13 = timeSeries7.timePeriodClass;
        timeSeries1.timePeriodClass = class13;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries1.addChangeListener(seriesChangeListener15);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries7.setMaximumItemCount((int) (short) 0);
        java.util.List list10 = timeSeries7.getItems();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.util.List list6 = timeSeries1.getItems();
        timeSeries1.setKey((java.lang.Comparable) (byte) 1);
        java.lang.String str9 = timeSeries1.getDescription();
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod12, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        boolean boolean11 = timeSeries8.equals((java.lang.Object) 100.0d);
        timeSeries8.setNotify(true);
        java.lang.Class<?> wildcardClass14 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass14);
        long long18 = timeSeries17.getMaximumItemAge();
        java.lang.String str19 = timeSeries17.getDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        long long22 = timeSeries21.getMaximumItemAge();
        boolean boolean23 = timeSeries21.isEmpty();
        java.util.Collection collection24 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries21.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setKey((java.lang.Comparable) (short) 100);
        boolean boolean4 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, class6);
        boolean boolean9 = timeSeries8.getNotify();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.addChangeListener(seriesChangeListener13);
        timeSeries11.setNotify(true);
        timeSeries11.setRangeDescription("");
        boolean boolean19 = timeSeries11.getNotify();
        java.util.Collection collection20 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        timeSeries11.setDescription("Time");
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        long long8 = timeSeries1.getMaximumItemAge();
        java.lang.String str9 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        boolean boolean17 = timeSeries14.equals((java.lang.Object) 100.0d);
        timeSeries14.setNotify(true);
        java.lang.Class<?> wildcardClass20 = timeSeries14.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass20);
        java.util.List list22 = timeSeries21.getItems();
        java.lang.Class class23 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries25.fireSeriesChanged();
        timeSeries25.removeAgedItems(false);
        timeSeries25.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries21.addAndOrUpdate(timeSeries25);
        timeSeries21.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries1.addAndOrUpdate(timeSeries21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(timeSeries34);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.lang.Comparable comparable5 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        java.util.List list15 = timeSeries7.getItems();
        timeSeries1.data = list15;
        timeSeries1.removeAgedItems(false);
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10.0f + "'", comparable5, 10.0f);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        timeSeries1.setKey((java.lang.Comparable) 100);
        timeSeries1.setMaximumItemAge((long) (short) 10);
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        boolean boolean10 = timeSeries1.getNotify();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        int int5 = timeSeries1.getMaximumItemCount();
        java.util.List list6 = timeSeries1.data;
        timeSeries1.setNotify(true);
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        java.lang.String str10 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.addAndOrUpdate(timeSeries9);
        timeSeries9.setKey((java.lang.Comparable) "Time");
        java.lang.Class class13 = timeSeries9.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, "Time", "Time", class13);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.update((int) (byte) 0, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        timeSeries7.setRangeDescription("hi!");
        java.lang.Class class13 = timeSeries7.timePeriodClass;
        timeSeries1.timePeriodClass = class13;
        timeSeries1.removeAgedItems(true);
        timeSeries1.fireSeriesChanged();
        java.lang.String str18 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        long long8 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener9);
        int int11 = timeSeries1.getItemCount();
        java.lang.String str12 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        boolean boolean10 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        java.util.List list14 = timeSeries12.getItems();
        timeSeries12.removeAgedItems(true);
        timeSeries12.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.addAndOrUpdate(timeSeries12);
        int int20 = timeSeries19.getMaximumItemCount();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries13.setRangeDescription("Value");
        java.lang.String str16 = timeSeries13.getDescription();
        java.util.List list17 = timeSeries13.data;
        timeSeries13.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries1.addAndOrUpdate(timeSeries13);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int25 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection28 = timeSeries27.getTimePeriods();
        timeSeries27.setNotify(true);
        java.lang.Class class31 = timeSeries27.timePeriodClass;
        java.lang.Comparable comparable32 = timeSeries27.getKey();
        boolean boolean33 = timeSeries24.equals((java.lang.Object) timeSeries27);
        timeSeries24.fireSeriesChanged();
        int int35 = timeSeries24.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection45 = timeSeries44.getTimePeriods();
        boolean boolean47 = timeSeries44.equals((java.lang.Object) 100.0d);
        timeSeries44.setNotify(true);
        java.lang.Class<?> wildcardClass50 = timeSeries44.getClass();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass50);
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass50);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass50);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries24.addAndOrUpdate(timeSeries53);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection63 = timeSeries62.getTimePeriods();
        boolean boolean65 = timeSeries62.equals((java.lang.Object) 100.0d);
        timeSeries62.setNotify(true);
        java.lang.Class<?> wildcardClass68 = timeSeries62.getClass();
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass68);
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass68);
        timeSeries24.timePeriodClass = wildcardClass68;
        timeSeries1.timePeriodClass = wildcardClass68;
        timeSeries1.setKey((java.lang.Comparable) true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod75 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem77 = timeSeries1.addOrUpdate(regularTimePeriod75, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 10.0f + "'", comparable32, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries7.setRangeDescription("Value");
        java.lang.String str10 = timeSeries7.getDescription();
        java.lang.Comparable comparable11 = timeSeries7.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class16);
        timeSeries17.setDescription("Value");
        java.util.List list20 = timeSeries17.getItems();
        timeSeries12.data = list20;
        timeSeries12.setKey((java.lang.Comparable) (short) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries12.addOrUpdate(regularTimePeriod24, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        boolean boolean4 = timeSeries1.getNotify();
        timeSeries1.setDomainDescription("Time");
        timeSeries1.clear();
        java.util.List list8 = timeSeries1.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems(true);
        boolean boolean9 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean12 = timeSeries11.getNotify();
        java.util.List list13 = timeSeries11.getItems();
        timeSeries1.data = list13;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((-1), (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        java.lang.String str8 = timeSeries1.getDescription();
        timeSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        long long10 = timeSeries8.getMaximumItemAge();
        java.util.Collection collection11 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        java.lang.String str12 = timeSeries1.getDescription();
        int int13 = timeSeries1.getItemCount();
        java.util.Collection collection14 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        timeSeries4.removeAgedItems((long) 1, true);
        timeSeries4.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.delete(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class4 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.addAndOrUpdate(timeSeries7);
        timeSeries7.setKey((java.lang.Comparable) "Time");
        java.lang.String str11 = timeSeries7.getDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        boolean boolean16 = timeSeries13.equals((java.lang.Object) 100.0d);
        timeSeries13.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        timeSeries20.setNotify(true);
        boolean boolean24 = timeSeries13.equals((java.lang.Object) timeSeries20);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries13.createCopy((int) ' ', (int) '#');
        int int28 = timeSeries27.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class31 = timeSeries30.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries30.addChangeListener(seriesChangeListener32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener34);
        java.lang.Class class36 = timeSeries30.getTimePeriodClass();
        timeSeries27.timePeriodClass = class36;
        timeSeries7.timePeriodClass = class36;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, class36);
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(class36);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries7.setMaximumItemAge((long) (short) 10);
        java.util.List list10 = timeSeries7.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod11, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        long long4 = timeSeries2.getMaximumItemAge();
        java.lang.Class class5 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class5);
        timeSeries6.setDomainDescription("Time");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.addAndOrUpdate(timeSeries11);
        java.util.List list13 = timeSeries12.data;
        timeSeries1.data = list13;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = timeSeries8.getItems();
        timeSeries8.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.setMaximumItemAge((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.clear();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.removeAgedItems((long) '#', true);
        java.lang.String str16 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.lang.String str22 = timeSeries18.getRangeDescription();
        boolean boolean23 = timeSeries18.isEmpty();
        java.util.Collection collection24 = timeSeries18.getTimePeriods();
        boolean boolean25 = timeSeries18.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener26);
        timeSeries18.setRangeDescription("Value");
        timeSeries18.clear();
        timeSeries18.removeAgedItems(true);
        boolean boolean33 = timeSeries1.equals((java.lang.Object) timeSeries18);
        timeSeries18.removeAgedItems((long) (byte) 10, false);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setKey((java.lang.Comparable) 0.0d);
        boolean boolean7 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.String str13 = timeSeries9.getRangeDescription();
        boolean boolean14 = timeSeries9.isEmpty();
        java.util.Collection collection15 = timeSeries9.getTimePeriods();
        boolean boolean16 = timeSeries9.isEmpty();
        boolean boolean17 = timeSeries9.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries9.removeChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        boolean boolean24 = timeSeries21.equals((java.lang.Object) 100.0d);
        timeSeries21.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries9.addAndOrUpdate(timeSeries21);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener28);
        java.util.List list30 = timeSeries21.getItems();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries1.addAndOrUpdate(timeSeries21);
        timeSeries31.removeAgedItems((long) (byte) 10, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        int int10 = timeSeries1.getItemCount();
        int int11 = timeSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class class2 = timeSeries1.getTimePeriodClass();
        int int3 = timeSeries1.getItemCount();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        timeSeries6.setNotify(true);
        int int10 = timeSeries6.getItemCount();
        java.lang.String str11 = timeSeries6.getDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean14 = timeSeries13.getNotify();
        timeSeries13.setRangeDescription("hi!");
        boolean boolean17 = timeSeries13.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries6.addAndOrUpdate(timeSeries13);
        int int19 = timeSeries13.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries21.setRangeDescription("Value");
        java.lang.String str24 = timeSeries21.getDescription();
        java.util.List list25 = timeSeries21.data;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean28 = timeSeries27.getNotify();
        int int29 = timeSeries27.getMaximumItemCount();
        java.util.List list30 = timeSeries27.data;
        java.util.Collection collection31 = timeSeries27.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries21.addAndOrUpdate(timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries13.addAndOrUpdate(timeSeries21);
        java.lang.Class<?> wildcardClass34 = timeSeries33.getClass();
        timeSeries1.timePeriodClass = wildcardClass34;
        timeSeries1.setDomainDescription("");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries1.removeChangeListener(seriesChangeListener14);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        long long13 = timeSeries7.getMaximumItemAge();
        boolean boolean14 = timeSeries7.getNotify();
        boolean boolean15 = timeSeries7.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries7.getValue(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.removeAgedItems((long) '#', true);
        java.lang.String str16 = timeSeries1.getDomainDescription();
        java.util.Collection collection17 = timeSeries1.getTimePeriods();
        timeSeries1.setKey((java.lang.Comparable) false);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries7.setRangeDescription("Value");
        java.lang.String str10 = timeSeries7.getDescription();
        java.lang.Comparable comparable11 = timeSeries7.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        java.util.List list13 = timeSeries7.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries7.createCopy((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        timeSeries7.setDomainDescription("");
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        timeSeries7.fireSeriesChanged();
        timeSeries7.setNotify(false);
        java.lang.Class class17 = null;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "", "Value", class17);
        timeSeries18.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries7.addAndOrUpdate(timeSeries18);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 0 + "'", comparable10, (short) 0);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        int int8 = timeSeries6.getMaximumItemCount();
        java.util.List list9 = timeSeries6.data;
        boolean boolean10 = timeSeries6.getNotify();
        java.util.Collection collection11 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        timeSeries1.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        boolean boolean18 = timeSeries15.equals((java.lang.Object) 100.0d);
        timeSeries15.setNotify(true);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.util.List list22 = timeSeries15.getItems();
        java.lang.Comparable comparable23 = timeSeries15.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 10.0f + "'", comparable23, 10.0f);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setDescription("hi!");
        timeSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        boolean boolean9 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems(1L, true);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries11.addAndOrUpdate(timeSeries13);
        timeSeries13.setKey((java.lang.Comparable) "Time");
        java.lang.Class class17 = timeSeries13.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, "Time", "Time", class17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, class17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "Overwritten values from: 10", "Time", class17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = timeSeries20.getValue(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(class17);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        java.util.List list14 = timeSeries12.getItems();
        timeSeries12.setDescription("Time");
        timeSeries12.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener19);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries23.fireSeriesChanged();
        timeSeries23.removeAgedItems(false);
        timeSeries23.setDomainDescription("hi!");
        int int29 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries12.addAndOrUpdate(timeSeries23);
        timeSeries12.setRangeDescription("Overwritten values from: 10");
        java.lang.Class<?> wildcardClass33 = timeSeries12.getClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.util.List list6 = timeSeries1.getItems();
        timeSeries1.setKey((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries10.fireSeriesChanged();
        java.lang.String str12 = timeSeries10.getRangeDescription();
        java.lang.Comparable comparable13 = timeSeries10.getKey();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries10.createCopy((int) (byte) 0, (int) (short) 0);
        java.util.Collection collection17 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (byte) 10 + "'", comparable13, (byte) 10);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        timeSeries7.fireSeriesChanged();
        boolean boolean14 = timeSeries7.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod15, (double) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        timeSeries1.setNotify(true);
        timeSeries1.fireSeriesChanged();
        timeSeries1.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries1.createCopy(regularTimePeriod15, regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        timeSeries7.setDomainDescription("");
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        timeSeries7.fireSeriesChanged();
        timeSeries7.setNotify(false);
        int int14 = timeSeries7.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod15, (java.lang.Number) 1.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 0 + "'", comparable10, (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        long long8 = timeSeries6.getMaximumItemAge();
        java.lang.Class class9 = timeSeries6.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class9);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "", class9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), class9);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class3);
        java.util.List list5 = timeSeries4.getItems();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries4.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.fireSeriesChanged();
        java.util.List list14 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries16.removeChangeListener(seriesChangeListener17);
        timeSeries16.setDescription("");
        int int21 = timeSeries16.getMaximumItemCount();
        java.util.Collection collection22 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries16.getTimePeriod((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.util.List list8 = timeSeries7.getItems();
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener10);
        boolean boolean12 = timeSeries7.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod13, 100.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) -1 + "'", comparable9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        java.lang.Comparable comparable5 = timeSeries4.getKey();
        timeSeries4.removeAgedItems((long) 2147483647, false);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = timeSeries4.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 1 + "'", comparable5, (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        timeSeries1.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries1.removeChangeListener(seriesChangeListener12);
        java.lang.Comparable comparable14 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 10.0f + "'", comparable14, 10.0f);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        timeSeries1.removeAgedItems((long) (byte) 100, true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries1.removeChangeListener(seriesChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod13, (double) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        java.lang.String str9 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean12 = timeSeries11.getNotify();
        int int13 = timeSeries11.getMaximumItemCount();
        java.util.List list14 = timeSeries11.data;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries11.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        java.util.List list21 = timeSeries19.getItems();
        timeSeries19.setDescription("Time");
        int int24 = timeSeries19.getItemCount();
        java.util.Collection collection25 = timeSeries19.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries11.addAndOrUpdate(timeSeries19);
        int int27 = timeSeries11.getMaximumItemCount();
        boolean boolean28 = timeSeries1.equals((java.lang.Object) timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class31 = timeSeries30.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries30.addChangeListener(seriesChangeListener32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection38 = timeSeries37.getTimePeriods();
        long long39 = timeSeries37.getMaximumItemAge();
        java.util.Collection collection40 = timeSeries30.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener41);
        timeSeries37.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries11.addAndOrUpdate(timeSeries37);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener46);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem48 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(timeSeriesDataItem48, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 9223372036854775807L + "'", long39 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries45);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        int int5 = timeSeries1.getItemCount();
        java.lang.String str6 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setRangeDescription("hi!");
        boolean boolean12 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries8);
        java.util.List list14 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod15, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries7.setMaximumItemCount((int) (short) 0);
        java.util.List list10 = timeSeries7.getItems();
        java.lang.String str11 = timeSeries7.getRangeDescription();
        timeSeries7.removeAgedItems(100L, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod15, (double) 32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        java.lang.String str8 = timeSeries4.getRangeDescription();
        boolean boolean9 = timeSeries4.isEmpty();
        java.util.Collection collection10 = timeSeries4.getTimePeriods();
        boolean boolean11 = timeSeries4.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener12);
        timeSeries4.setRangeDescription("Value");
        timeSeries4.clear();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        timeSeries20.setNotify(true);
        java.lang.Class class24 = timeSeries20.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class24);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class24);
        timeSeries4.timePeriodClass = class24;
        java.lang.Class class28 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "Value", "", class28);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries29.removeChangeListener(seriesChangeListener30);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(class28);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        java.util.List list2 = timeSeries1.getItems();
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.util.List list2 = timeSeries1.data;
        java.lang.Class class3 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod4, (double) 1.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(class3);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries4.fireSeriesChanged();
        timeSeries4.removeAgedItems(false);
        java.lang.String str8 = timeSeries4.getDescription();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        timeSeries10.setNotify(true);
        int int14 = timeSeries10.getItemCount();
        java.lang.Class class15 = timeSeries10.getTimePeriodClass();
        timeSeries4.timePeriodClass = class15;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "", "Value", class15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class9);
        timeSeries10.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        boolean boolean18 = timeSeries15.equals((java.lang.Object) 100.0d);
        timeSeries15.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries15.addChangeListener(seriesChangeListener21);
        java.util.List list23 = timeSeries15.getItems();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection26 = timeSeries25.getTimePeriods();
        timeSeries25.setNotify(true);
        java.lang.Class class29 = timeSeries25.timePeriodClass;
        java.lang.Comparable comparable30 = timeSeries25.getKey();
        timeSeries25.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class class35 = timeSeries34.getTimePeriodClass();
        timeSeries25.timePeriodClass = class35;
        java.lang.String str37 = timeSeries25.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries15.addAndOrUpdate(timeSeries25);
        boolean boolean39 = timeSeries10.equals((java.lang.Object) timeSeries25);
        timeSeries25.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number42 = timeSeries25.getValue(regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(class29);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + 10.0f + "'", comparable30, 10.0f);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Time" + "'", str37, "Time");
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries1.createCopy((int) ' ', (int) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries15.getDataItem(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        int int5 = timeSeries1.getItemCount();
        java.lang.String str6 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setRangeDescription("hi!");
        boolean boolean12 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries8);
        int int14 = timeSeries8.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries16.setRangeDescription("Value");
        java.lang.String str19 = timeSeries16.getDescription();
        java.util.List list20 = timeSeries16.data;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean23 = timeSeries22.getNotify();
        int int24 = timeSeries22.getMaximumItemCount();
        java.util.List list25 = timeSeries22.data;
        java.util.Collection collection26 = timeSeries22.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries16.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries8.addAndOrUpdate(timeSeries16);
        java.lang.Class class29 = timeSeries16.getTimePeriodClass();
        timeSeries16.removeAgedItems(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.add(timeSeriesDataItem32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(class29);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(0L, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, (double) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        timeSeries1.setNotify(true);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries1.addChangeListener(seriesChangeListener13);
        timeSeries1.setKey((java.lang.Comparable) 1L);
        java.lang.String str17 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean20 = timeSeries19.getNotify();
        timeSeries19.setRangeDescription("hi!");
        boolean boolean23 = timeSeries19.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        java.util.List list29 = timeSeries27.getItems();
        timeSeries27.setDescription("Time");
        timeSeries27.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries27.removePropertyChangeListener(propertyChangeListener34);
        java.util.List list36 = timeSeries27.getItems();
        timeSeries27.setNotify(false);
        boolean boolean39 = timeSeries19.equals((java.lang.Object) timeSeries27);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class43 = timeSeries42.timePeriodClass;
        timeSeries42.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class48 = timeSeries47.timePeriodClass;
        java.util.List list49 = timeSeries47.getItems();
        timeSeries47.clear();
        timeSeries47.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection54 = timeSeries53.getTimePeriods();
        boolean boolean56 = timeSeries53.equals((java.lang.Object) 100.0d);
        timeSeries53.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener59 = null;
        timeSeries53.addChangeListener(seriesChangeListener59);
        java.util.List list61 = timeSeries53.getItems();
        timeSeries47.data = list61;
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries42.addAndOrUpdate(timeSeries47);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class66 = timeSeries65.timePeriodClass;
        java.util.List list67 = timeSeries65.getItems();
        timeSeries65.clear();
        java.lang.String str69 = timeSeries65.getRangeDescription();
        java.util.List list70 = timeSeries65.getItems();
        timeSeries47.data = list70;
        timeSeries19.data = list70;
        timeSeries1.data = list70;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(class43);
        org.junit.Assert.assertNotNull(class48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(list61);
        org.junit.Assert.assertNotNull(timeSeries63);
        org.junit.Assert.assertNotNull(class66);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Value" + "'", str69, "Value");
        org.junit.Assert.assertNotNull(list70);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        timeSeries4.setDescription("Value");
        java.util.List list7 = timeSeries4.getItems();
        int int8 = timeSeries4.getMaximumItemCount();
        java.lang.String str9 = timeSeries4.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeSeries4.getIndex(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        timeSeries1.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        long long8 = timeSeries1.getMaximumItemAge();
        boolean boolean9 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod12, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        timeSeries1.removeAgedItems(true);
        java.util.List list8 = timeSeries1.data;
        timeSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries1.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries13.setRangeDescription("Value");
        java.lang.String str16 = timeSeries13.getDescription();
        java.util.List list17 = timeSeries13.data;
        timeSeries13.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries1.addAndOrUpdate(timeSeries13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries1.getDataItem(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        java.util.List list14 = timeSeries12.getItems();
        timeSeries12.setDescription("Time");
        timeSeries12.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener19);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries23.fireSeriesChanged();
        timeSeries23.removeAgedItems(false);
        timeSeries23.setDomainDescription("hi!");
        int int29 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries12.addAndOrUpdate(timeSeries23);
        timeSeries12.setMaximumItemAge((long) 100);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener33);
        long long35 = timeSeries12.getMaximumItemAge();
        long long36 = timeSeries12.getMaximumItemAge();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        java.lang.String str6 = timeSeries1.getRangeDescription();
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        timeSeries1.removeAgedItems((long) ' ', false);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        boolean boolean17 = timeSeries14.equals((java.lang.Object) 100.0d);
        timeSeries14.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        timeSeries21.setNotify(true);
        boolean boolean25 = timeSeries14.equals((java.lang.Object) timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries14.createCopy((int) ' ', (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries28.addChangeListener(seriesChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries1.addAndOrUpdate(timeSeries28);
        int int32 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection35 = timeSeries34.getTimePeriods();
        timeSeries34.setNotify(true);
        java.lang.Class class38 = timeSeries34.timePeriodClass;
        java.util.List list39 = timeSeries34.getItems();
        timeSeries34.setKey((java.lang.Comparable) (byte) 1);
        java.lang.String str42 = timeSeries34.getDescription();
        timeSeries34.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries1.addAndOrUpdate(timeSeries34);
        java.lang.Class class46 = timeSeries45.getTimePeriodClass();
        java.lang.Class class47 = timeSeries45.getTimePeriodClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(class46);
        org.junit.Assert.assertNotNull(class47);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(100);
        timeSeries1.setRangeDescription("Value");
        java.lang.Class class8 = timeSeries1.timePeriodClass;
        timeSeries1.setRangeDescription("Time");
        timeSeries1.setDomainDescription("Overwritten values from: 10");
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries1.createCopy((int) ' ', (int) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        int int5 = timeSeries1.getMaximumItemCount();
        java.util.List list6 = timeSeries1.data;
        timeSeries1.setNotify(true);
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries1.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.lang.String str8 = timeSeries7.getDescription();
        java.lang.String str9 = timeSeries7.getDomainDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        timeSeries7.setRangeDescription("hi!");
        boolean boolean11 = timeSeries2.equals((java.lang.Object) timeSeries7);
        java.lang.Class class12 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.removeChangeListener(seriesChangeListener14);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setNotify(true);
        java.lang.Class<?> wildcardClass13 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass13);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        java.lang.Class class18 = timeSeries15.timePeriodClass;
        boolean boolean19 = timeSeries15.getNotify();
        timeSeries15.setDescription("Value");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.util.List list8 = timeSeries7.getItems();
        timeSeries7.setMaximumItemAge((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update(32, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setMaximumItemAge((long) (short) 10);
        java.util.List list12 = timeSeries1.data;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        timeSeries7.setKey((java.lang.Comparable) 9223372036854775807L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries7.addChangeListener(seriesChangeListener15);
        java.lang.String str17 = timeSeries7.getDescription();
        timeSeries7.setDomainDescription("Overwritten values from: -1");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        timeSeries1.setRangeDescription("hi!");
        boolean boolean7 = timeSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        timeSeries1.setDomainDescription("Value");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        java.lang.Comparable comparable4 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 'a' + "'", comparable4, 'a');
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, class6);
        boolean boolean9 = timeSeries8.getNotify();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.addChangeListener(seriesChangeListener13);
        timeSeries11.setNotify(true);
        timeSeries11.setRangeDescription("");
        boolean boolean19 = timeSeries11.getNotify();
        java.util.Collection collection20 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update((int) (byte) 10, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        boolean boolean5 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries1.getDataItem(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        java.util.List list7 = timeSeries5.getItems();
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeSeries1.getIndex(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(timeSeries8);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(100);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy(0, 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        int int5 = timeSeries1.getItemCount();
        java.lang.String str6 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setRangeDescription("hi!");
        boolean boolean12 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries8);
        int int14 = timeSeries8.getMaximumItemCount();
        timeSeries8.setDomainDescription("Time");
        java.lang.Class class17 = timeSeries8.getTimePeriodClass();
        int int18 = timeSeries8.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = timeSeries8.getValue(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        boolean boolean4 = timeSeries1.getNotify();
        java.lang.Comparable comparable5 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10.0f + "'", comparable5, 10.0f);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        timeSeries6.setNotify(true);
        java.lang.Class class10 = timeSeries6.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class10);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "hi!", "Value", class10);
        boolean boolean14 = timeSeries13.isEmpty();
        boolean boolean15 = timeSeries13.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries13.addOrUpdate(regularTimePeriod16, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        boolean boolean8 = timeSeries1.isEmpty();
        timeSeries1.setNotify(false);
        boolean boolean11 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        boolean boolean16 = timeSeries13.equals((java.lang.Object) 100.0d);
        timeSeries13.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries13.addChangeListener(seriesChangeListener19);
        java.util.List list21 = timeSeries13.getItems();
        timeSeries13.setNotify(true);
        java.lang.Comparable comparable24 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries1.addAndOrUpdate(timeSeries13);
        java.lang.Class<?> wildcardClass26 = timeSeries25.getClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 10.0f + "'", comparable24, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        boolean boolean8 = timeSeries1.isEmpty();
        timeSeries1.setKey((java.lang.Comparable) 10);
        timeSeries1.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod13, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.clear();
        java.lang.String str14 = timeSeries1.getDescription();
        timeSeries1.removeAgedItems(0L, true);
        timeSeries1.setRangeDescription("");
        long long20 = timeSeries1.getMaximumItemAge();
        timeSeries1.setNotify(false);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries13.setRangeDescription("Value");
        java.lang.String str16 = timeSeries13.getDescription();
        java.util.List list17 = timeSeries13.data;
        timeSeries13.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries1.addAndOrUpdate(timeSeries13);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int25 = timeSeries24.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection28 = timeSeries27.getTimePeriods();
        timeSeries27.setNotify(true);
        java.lang.Class class31 = timeSeries27.timePeriodClass;
        java.lang.Comparable comparable32 = timeSeries27.getKey();
        boolean boolean33 = timeSeries24.equals((java.lang.Object) timeSeries27);
        timeSeries24.fireSeriesChanged();
        int int35 = timeSeries24.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection45 = timeSeries44.getTimePeriods();
        boolean boolean47 = timeSeries44.equals((java.lang.Object) 100.0d);
        timeSeries44.setNotify(true);
        java.lang.Class<?> wildcardClass50 = timeSeries44.getClass();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass50);
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass50);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass50);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries24.addAndOrUpdate(timeSeries53);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection63 = timeSeries62.getTimePeriods();
        boolean boolean65 = timeSeries62.equals((java.lang.Object) 100.0d);
        timeSeries62.setNotify(true);
        java.lang.Class<?> wildcardClass68 = timeSeries62.getClass();
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass68);
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass68);
        timeSeries24.timePeriodClass = wildcardClass68;
        timeSeries1.timePeriodClass = wildcardClass68;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener73 = null;
        timeSeries1.addChangeListener(seriesChangeListener73);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 10.0f + "'", comparable32, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        int int5 = timeSeries1.getItemCount();
        java.lang.String str6 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setRangeDescription("hi!");
        boolean boolean12 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries8);
        int int14 = timeSeries8.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries16.setRangeDescription("Value");
        java.lang.String str19 = timeSeries16.getDescription();
        java.util.List list20 = timeSeries16.data;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean23 = timeSeries22.getNotify();
        int int24 = timeSeries22.getMaximumItemCount();
        java.util.List list25 = timeSeries22.data;
        java.util.Collection collection26 = timeSeries22.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries16.addAndOrUpdate(timeSeries22);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries8.addAndOrUpdate(timeSeries16);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener29);
        timeSeries16.setKey((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.clear();
        timeSeries1.removeAgedItems((long) (byte) 0, false);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.lang.Class<?> wildcardClass4 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        timeSeries1.setRangeDescription("hi!");
        boolean boolean7 = timeSeries1.getNotify();
        int int8 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(100);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy(0, 2147483647);
        timeSeries10.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        java.util.List list16 = timeSeries14.getItems();
        timeSeries14.setDescription("Time");
        timeSeries14.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener21);
        timeSeries14.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries26.setRangeDescription("Value");
        java.lang.String str29 = timeSeries26.getDescription();
        java.util.List list30 = timeSeries26.data;
        timeSeries26.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries26.addPropertyChangeListener(propertyChangeListener33);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries14.addAndOrUpdate(timeSeries26);
        boolean boolean36 = timeSeries10.equals((java.lang.Object) timeSeries26);
        timeSeries10.setKey((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        timeSeries6.setRangeDescription("hi!");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        boolean boolean11 = timeSeries6.getNotify();
        java.util.List list12 = timeSeries6.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries6.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        timeSeries1.setRangeDescription("hi!");
        boolean boolean7 = timeSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (byte) 10, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.Class class4 = timeSeries1.timePeriodClass;
        boolean boolean5 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod6, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        timeSeries1.setMaximumItemCount((int) '4');
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        timeSeries1.clear();
        java.lang.String str12 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        timeSeries7.setMaximumItemCount((int) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        int int14 = timeSeries12.getMaximumItemCount();
        java.util.List list15 = timeSeries12.data;
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries12.createCopy((int) '4', (int) (short) 100);
        java.util.List list19 = timeSeries18.getItems();
        java.lang.Comparable comparable20 = timeSeries18.getKey();
        java.lang.Object obj21 = null;
        boolean boolean22 = timeSeries18.equals(obj21);
        java.util.List list23 = timeSeries18.getItems();
        timeSeries7.data = list23;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries7.getTimePeriod((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) -1 + "'", comparable20, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        timeSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries1.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.removeAgedItems(false);
        timeSeries1.setDescription("Time");
        timeSeries1.setKey((java.lang.Comparable) (byte) 1);
        timeSeries1.setMaximumItemAge((long) (short) 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries1.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod14, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        timeSeries1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        timeSeries1.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        boolean boolean21 = timeSeries18.equals((java.lang.Object) 100.0d);
        timeSeries18.setNotify(true);
        java.lang.Class<?> wildcardClass24 = timeSeries18.getClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, (java.lang.Class) wildcardClass24);
        java.util.Collection collection29 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        java.lang.String str30 = timeSeries28.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = timeSeries28.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Time" + "'", str30, "Time");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        java.lang.Comparable comparable5 = timeSeries4.getKey();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setNotify(true);
        java.lang.Class class13 = timeSeries7.getTimePeriodClass();
        timeSeries4.timePeriodClass = class13;
        timeSeries4.setDomainDescription("Overwritten values from: 10");
        java.lang.String str17 = timeSeries4.getRangeDescription();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 1 + "'", comparable5, (short) 1);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        boolean boolean11 = timeSeries4.isEmpty();
        java.lang.String str12 = timeSeries4.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries4.addChangeListener(seriesChangeListener13);
        java.lang.String str15 = timeSeries4.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        java.util.Collection collection19 = timeSeries17.getTimePeriods();
        timeSeries17.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class25);
        timeSeries26.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries17.addAndOrUpdate(timeSeries26);
        timeSeries29.setMaximumItemAge((long) '4');
        timeSeries29.setDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries29.addChangeListener(seriesChangeListener34);
        java.util.Collection collection36 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries4.setRangeDescription("Value");
        java.lang.String str7 = timeSeries4.getDescription();
        java.lang.Comparable comparable8 = timeSeries4.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        boolean boolean13 = timeSeries10.equals((java.lang.Object) 100.0d);
        timeSeries10.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries10.addChangeListener(seriesChangeListener16);
        java.util.List list18 = timeSeries10.getItems();
        timeSeries4.data = list18;
        java.lang.Class<?> wildcardClass20 = list18.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "", (java.lang.Class) wildcardClass20);
        int int22 = timeSeries21.getItemCount();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0f + "'", comparable8, 10.0f);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.String str10 = timeSeries6.getDescription();
        timeSeries6.clear();
        int int12 = timeSeries6.getMaximumItemCount();
        timeSeries6.fireSeriesChanged();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener14);
        timeSeries6.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.add(regularTimePeriod18, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        timeSeries6.setRangeDescription("hi!");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        boolean boolean11 = timeSeries6.getNotify();
        java.lang.Class class12 = timeSeries6.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        int int16 = timeSeries14.getMaximumItemCount();
        java.util.List list17 = timeSeries14.data;
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries14.createCopy((int) '4', (int) (short) 100);
        java.util.List list21 = timeSeries20.getItems();
        java.lang.Comparable comparable22 = timeSeries20.getKey();
        java.lang.Object obj23 = null;
        boolean boolean24 = timeSeries20.equals(obj23);
        timeSeries20.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries6.addAndOrUpdate(timeSeries20);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.delete(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (byte) -1 + "'", comparable22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        int int8 = timeSeries6.getMaximumItemCount();
        java.util.List list9 = timeSeries6.data;
        boolean boolean10 = timeSeries6.getNotify();
        java.util.Collection collection11 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        timeSeries1.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        boolean boolean18 = timeSeries15.equals((java.lang.Object) 100.0d);
        timeSeries15.setNotify(true);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        boolean boolean22 = timeSeries15.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = timeSeries15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        long long8 = timeSeries6.getMaximumItemAge();
        java.lang.String str9 = timeSeries6.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        boolean boolean14 = timeSeries11.equals((java.lang.Object) 100.0d);
        timeSeries11.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        timeSeries18.setNotify(true);
        boolean boolean22 = timeSeries11.equals((java.lang.Object) timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) ' ', (int) '#');
        java.util.Collection collection26 = timeSeries6.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        java.util.List list27 = timeSeries25.data;
        boolean boolean28 = timeSeries1.equals((java.lang.Object) timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries25.createCopy((int) (short) 1, (int) '#');
        long long32 = timeSeries25.getMaximumItemAge();
        timeSeries25.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(regularTimePeriod34, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9223372036854775807L + "'", long32 == 9223372036854775807L);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        timeSeries7.setRangeDescription("hi!");
        boolean boolean11 = timeSeries2.equals((java.lang.Object) timeSeries7);
        boolean boolean12 = timeSeries7.getNotify();
        java.lang.Class class13 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, class13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(regularTimePeriod15, (double) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        java.util.List list15 = timeSeries7.getItems();
        timeSeries1.data = list15;
        java.lang.String str17 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        timeSeries1.setDescription("hi!");
        java.lang.Comparable comparable10 = timeSeries1.getKey();
        int int11 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0f + "'", comparable10, 10.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        java.lang.Class<?> wildcardClass7 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass7);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Overwritten values from: 10", (java.lang.Class) wildcardClass7);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        java.lang.String str9 = timeSeries1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries1.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        int int8 = timeSeries6.getMaximumItemCount();
        java.util.List list9 = timeSeries6.data;
        boolean boolean10 = timeSeries6.getNotify();
        java.util.Collection collection11 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        timeSeries1.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        boolean boolean18 = timeSeries15.equals((java.lang.Object) 100.0d);
        timeSeries15.setNotify(true);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection24 = timeSeries23.getTimePeriods();
        boolean boolean26 = timeSeries23.equals((java.lang.Object) 100.0d);
        timeSeries23.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries23.addChangeListener(seriesChangeListener29);
        java.util.List list31 = timeSeries23.getItems();
        timeSeries23.setNotify(true);
        timeSeries23.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries23.addChangeListener(seriesChangeListener35);
        java.util.Collection collection37 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        timeSeries23.setDescription("Time");
        int int40 = timeSeries23.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries43 = timeSeries23.createCopy((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(true);
        java.lang.String str6 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        boolean boolean14 = timeSeries11.equals((java.lang.Object) 100.0d);
        timeSeries11.setNotify(true);
        java.lang.Class class17 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), "hi!", "Overwritten values from: 10", class17);
        boolean boolean19 = timeSeries1.equals((java.lang.Object) class17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod20, (java.lang.Number) 9223372036854775807L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        timeSeries7.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable15 = timeSeries7.getKey();
        long long16 = timeSeries7.getMaximumItemAge();
        boolean boolean17 = timeSeries7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries7.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 9223372036854775807L + "'", comparable15, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        boolean boolean10 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod11, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.removeChangeListener(seriesChangeListener9);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries1.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        boolean boolean9 = timeSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        timeSeries1.setMaximumItemCount((int) ' ');
        timeSeries1.setKey((java.lang.Comparable) 100.0f);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod16, (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        java.util.List list14 = timeSeries12.getItems();
        timeSeries12.setDescription("Time");
        timeSeries12.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener19);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        java.lang.String str22 = timeSeries12.getDomainDescription();
        timeSeries12.setRangeDescription("");
        java.util.Collection collection25 = timeSeries12.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries27.addChangeListener(seriesChangeListener29);
        java.lang.String str31 = timeSeries27.getRangeDescription();
        boolean boolean32 = timeSeries27.isEmpty();
        java.util.Collection collection33 = timeSeries27.getTimePeriods();
        boolean boolean34 = timeSeries27.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries27.removePropertyChangeListener(propertyChangeListener35);
        timeSeries27.setRangeDescription("Value");
        timeSeries27.clear();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection44 = timeSeries43.getTimePeriods();
        timeSeries43.setNotify(true);
        java.lang.Class class47 = timeSeries43.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class47);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class47);
        timeSeries27.timePeriodClass = class47;
        boolean boolean51 = timeSeries12.equals((java.lang.Object) class47);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod52, (double) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(class47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        java.lang.String str9 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean12 = timeSeries11.getNotify();
        int int13 = timeSeries11.getMaximumItemCount();
        java.util.List list14 = timeSeries11.data;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries11.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        java.util.List list21 = timeSeries19.getItems();
        timeSeries19.setDescription("Time");
        int int24 = timeSeries19.getItemCount();
        java.util.Collection collection25 = timeSeries19.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries11.addAndOrUpdate(timeSeries19);
        int int27 = timeSeries11.getMaximumItemCount();
        boolean boolean28 = timeSeries1.equals((java.lang.Object) timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class31 = timeSeries30.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries30.addChangeListener(seriesChangeListener32);
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection38 = timeSeries37.getTimePeriods();
        long long39 = timeSeries37.getMaximumItemAge();
        java.util.Collection collection40 = timeSeries30.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries37.addPropertyChangeListener(propertyChangeListener41);
        timeSeries37.setMaximumItemAge((long) 10);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries11.addAndOrUpdate(timeSeries37);
        int int46 = timeSeries37.getMaximumItemCount();
        timeSeries37.removeAgedItems(true);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 9223372036854775807L + "'", long39 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        boolean boolean7 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        timeSeries11.setNotify(true);
        boolean boolean15 = timeSeries4.equals((java.lang.Object) timeSeries11);
        timeSeries4.fireSeriesChanged();
        java.util.Collection collection17 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries1.getDataItem(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(0L, false);
        int int7 = timeSeries1.getMaximumItemCount();
        timeSeries1.setDomainDescription("Value");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.String str10 = timeSeries6.getDescription();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        timeSeries19.setNotify(true);
        boolean boolean23 = timeSeries12.equals((java.lang.Object) timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries12.createCopy((int) ' ', (int) '#');
        int int27 = timeSeries26.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries29.addChangeListener(seriesChangeListener31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries29.removePropertyChangeListener(propertyChangeListener33);
        java.lang.Class class35 = timeSeries29.getTimePeriodClass();
        timeSeries26.timePeriodClass = class35;
        timeSeries6.timePeriodClass = class35;
        timeSeries6.setMaximumItemAge(100L);
        timeSeries6.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries43.setRangeDescription("Value");
        java.lang.String str46 = timeSeries43.getDescription();
        java.util.List list47 = timeSeries43.data;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean50 = timeSeries49.getNotify();
        int int51 = timeSeries49.getMaximumItemCount();
        java.util.List list52 = timeSeries49.data;
        java.util.Collection collection53 = timeSeries49.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries43.addAndOrUpdate(timeSeries49);
        timeSeries43.setDescription("");
        int int57 = timeSeries43.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.util.List list60 = timeSeries59.data;
        timeSeries43.data = list60;
        java.util.Collection collection62 = timeSeries6.getTimePeriodsUniqueToOtherSeries(timeSeries43);
        java.util.Collection collection63 = timeSeries6.getTimePeriods();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        timeSeries1.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries1.createCopy(0, (int) (byte) 0);
        timeSeries17.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.delete(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.setDescription("");
        java.util.Collection collection6 = timeSeries1.getTimePeriods();
        timeSeries1.setMaximumItemAge((long) (short) 100);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.createCopy(regularTimePeriod10, regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean5 = timeSeries4.getNotify();
        int int6 = timeSeries4.getMaximumItemCount();
        java.util.List list7 = timeSeries4.data;
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries4.createCopy((int) '4', (int) (short) 100);
        java.util.List list11 = timeSeries10.getItems();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        boolean boolean16 = timeSeries13.equals((java.lang.Object) 100.0d);
        timeSeries13.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        timeSeries20.setNotify(true);
        boolean boolean24 = timeSeries13.equals((java.lang.Object) timeSeries20);
        timeSeries13.fireSeriesChanged();
        java.util.List list26 = timeSeries13.data;
        timeSeries10.data = list26;
        timeSeries1.data = list26;
        timeSeries1.setDescription("Time");
        boolean boolean31 = timeSeries1.getNotify();
        java.util.List list32 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries35 = timeSeries1.createCopy(regularTimePeriod33, regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries1.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        boolean boolean11 = timeSeries4.isEmpty();
        java.lang.String str12 = timeSeries4.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries4.addChangeListener(seriesChangeListener13);
        java.lang.Class class15 = timeSeries4.timePeriodClass;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.Class class10 = timeSeries6.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        timeSeries12.removeAgedItems(true);
        boolean boolean16 = timeSeries12.isEmpty();
        timeSeries12.clear();
        java.util.Collection collection18 = timeSeries6.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        timeSeries12.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries12.removeChangeListener(seriesChangeListener21);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.String str10 = timeSeries6.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener11);
        int int13 = timeSeries6.getItemCount();
        long long14 = timeSeries6.getMaximumItemAge();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        boolean boolean9 = timeSeries6.equals((java.lang.Object) 100.0d);
        timeSeries6.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries6.addChangeListener(seriesChangeListener12);
        java.util.List list14 = timeSeries6.getItems();
        java.lang.String str15 = timeSeries6.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries6.addChangeListener(seriesChangeListener16);
        java.lang.Class class18 = timeSeries6.timePeriodClass;
        timeSeries1.timePeriodClass = class18;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries21.setRangeDescription("Value");
        java.lang.String str24 = timeSeries21.getDescription();
        java.util.List list25 = timeSeries21.data;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean28 = timeSeries27.getNotify();
        int int29 = timeSeries27.getMaximumItemCount();
        java.util.List list30 = timeSeries27.data;
        java.util.Collection collection31 = timeSeries27.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries21.addAndOrUpdate(timeSeries27);
        timeSeries21.setDescription("");
        int int35 = timeSeries21.getMaximumItemCount();
        timeSeries21.setDescription("Overwritten values from: 10");
        boolean boolean38 = timeSeries21.getNotify();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection45 = timeSeries44.getTimePeriods();
        long long46 = timeSeries44.getMaximumItemAge();
        java.lang.Class class47 = timeSeries44.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class47);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "", class47);
        boolean boolean50 = timeSeries21.equals((java.lang.Object) timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "");
        java.util.List list53 = timeSeries52.getItems();
        timeSeries21.data = list53;
        timeSeries1.data = list53;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 9223372036854775807L + "'", long46 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(list53);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        boolean boolean3 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 0, (int) (byte) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, (java.lang.Number) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(false);
        java.lang.String str6 = timeSeries1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        java.lang.String str6 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = timeSeries8.getItems();
        timeSeries8.setMaximumItemCount((int) '4');
        timeSeries8.setMaximumItemAge(10L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries8.getDataItem(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.util.List list2 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        java.lang.String str8 = timeSeries4.getRangeDescription();
        boolean boolean9 = timeSeries4.isEmpty();
        boolean boolean10 = timeSeries4.isEmpty();
        java.lang.Class class11 = timeSeries4.getTimePeriodClass();
        timeSeries4.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        java.util.List list17 = timeSeries15.getItems();
        timeSeries15.setDescription("Time");
        timeSeries15.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries15.removePropertyChangeListener(propertyChangeListener22);
        java.util.Collection collection24 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        java.lang.String str25 = timeSeries15.getDomainDescription();
        boolean boolean26 = timeSeries1.equals((java.lang.Object) str25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = timeSeries1.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Time" + "'", str25, "Time");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean5 = timeSeries4.getNotify();
        int int6 = timeSeries4.getMaximumItemCount();
        java.util.List list7 = timeSeries4.data;
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries4.createCopy((int) '4', (int) (short) 100);
        java.util.List list11 = timeSeries10.getItems();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        boolean boolean16 = timeSeries13.equals((java.lang.Object) 100.0d);
        timeSeries13.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        timeSeries20.setNotify(true);
        boolean boolean24 = timeSeries13.equals((java.lang.Object) timeSeries20);
        timeSeries13.fireSeriesChanged();
        java.util.List list26 = timeSeries13.data;
        timeSeries10.data = list26;
        timeSeries1.data = list26;
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemAge((long) 'a');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries1.getDataItem(regularTimePeriod33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        java.lang.String str13 = timeSeries1.getDescription();
        java.lang.String str14 = timeSeries1.getDomainDescription();
        timeSeries1.clear();
        timeSeries1.setNotify(false);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        timeSeries1.setKey((java.lang.Comparable) (short) 1);
        timeSeries1.setDomainDescription("");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        boolean boolean9 = timeSeries6.equals((java.lang.Object) 100.0d);
        timeSeries6.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        timeSeries13.setNotify(true);
        boolean boolean17 = timeSeries6.equals((java.lang.Object) timeSeries13);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries6.createCopy((int) ' ', (int) '#');
        int int21 = timeSeries20.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class24 = timeSeries23.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries23.addChangeListener(seriesChangeListener25);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries23.removePropertyChangeListener(propertyChangeListener27);
        java.lang.Class class29 = timeSeries23.getTimePeriodClass();
        timeSeries20.timePeriodClass = class29;
        boolean boolean31 = timeSeries1.equals((java.lang.Object) class29);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries33.setRangeDescription("Value");
        java.lang.String str36 = timeSeries33.getDescription();
        java.util.List list37 = timeSeries33.data;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean40 = timeSeries39.getNotify();
        int int41 = timeSeries39.getMaximumItemCount();
        java.util.List list42 = timeSeries39.data;
        java.util.Collection collection43 = timeSeries39.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries33.addAndOrUpdate(timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection47 = timeSeries46.getTimePeriods();
        boolean boolean49 = timeSeries46.equals((java.lang.Object) 100.0d);
        timeSeries46.setMaximumItemCount((int) ' ');
        java.lang.Class class52 = timeSeries46.getTimePeriodClass();
        timeSeries33.timePeriodClass = class52;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class56 = timeSeries55.timePeriodClass;
        java.util.List list57 = timeSeries55.getItems();
        timeSeries55.setDescription("Time");
        int int60 = timeSeries55.getItemCount();
        java.util.Collection collection61 = timeSeries55.getTimePeriods();
        boolean boolean62 = timeSeries33.equals((java.lang.Object) collection61);
        org.jfree.data.time.TimeSeries timeSeries63 = timeSeries1.addAndOrUpdate(timeSeries33);
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(class29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(class52);
        org.junit.Assert.assertNotNull(class56);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(timeSeries63);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        java.lang.String str6 = timeSeries1.getRangeDescription();
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        timeSeries1.removeAgedItems((long) ' ', false);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries1.addChangeListener(seriesChangeListener13);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        boolean boolean8 = timeSeries7.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries7.getDataItem(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        timeSeries7.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.String str15 = timeSeries7.getDomainDescription();
        java.lang.Comparable comparable16 = timeSeries7.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod17, (double) '#', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 9223372036854775807L + "'", comparable16, 9223372036854775807L);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        java.lang.String str8 = timeSeries1.getRangeDescription();
        java.lang.String str9 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        long long13 = timeSeries11.getMaximumItemAge();
        java.lang.String str14 = timeSeries11.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        boolean boolean19 = timeSeries16.equals((java.lang.Object) 100.0d);
        timeSeries16.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection24 = timeSeries23.getTimePeriods();
        timeSeries23.setNotify(true);
        boolean boolean27 = timeSeries16.equals((java.lang.Object) timeSeries23);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries16.createCopy((int) ' ', (int) '#');
        int int31 = timeSeries30.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class34 = timeSeries33.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries33.addChangeListener(seriesChangeListener35);
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries33.removePropertyChangeListener(propertyChangeListener37);
        java.lang.Class class39 = timeSeries33.getTimePeriodClass();
        timeSeries30.timePeriodClass = class39;
        boolean boolean41 = timeSeries11.equals((java.lang.Object) class39);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries43.setRangeDescription("Value");
        java.lang.String str46 = timeSeries43.getDescription();
        java.util.List list47 = timeSeries43.data;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean50 = timeSeries49.getNotify();
        int int51 = timeSeries49.getMaximumItemCount();
        java.util.List list52 = timeSeries49.data;
        java.util.Collection collection53 = timeSeries49.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries43.addAndOrUpdate(timeSeries49);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection57 = timeSeries56.getTimePeriods();
        boolean boolean59 = timeSeries56.equals((java.lang.Object) 100.0d);
        timeSeries56.setMaximumItemCount((int) ' ');
        java.lang.Class class62 = timeSeries56.getTimePeriodClass();
        timeSeries43.timePeriodClass = class62;
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class66 = timeSeries65.timePeriodClass;
        java.util.List list67 = timeSeries65.getItems();
        timeSeries65.setDescription("Time");
        int int70 = timeSeries65.getItemCount();
        java.util.Collection collection71 = timeSeries65.getTimePeriods();
        boolean boolean72 = timeSeries43.equals((java.lang.Object) collection71);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries11.addAndOrUpdate(timeSeries43);
        java.util.List list74 = timeSeries43.data;
        timeSeries1.data = list74;
        java.lang.String str76 = timeSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(class34);
        org.junit.Assert.assertNotNull(class39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(class62);
        org.junit.Assert.assertNotNull(class66);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertNotNull(list74);
        org.junit.Assert.assertNull(str76);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod4, (double) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        timeSeries1.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod11, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean6 = timeSeries5.getNotify();
        int int7 = timeSeries5.getMaximumItemCount();
        java.util.List list8 = timeSeries5.data;
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries5.createCopy((int) '4', (int) (short) 100);
        long long12 = timeSeries5.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries5.equals((java.lang.Object) seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries20.setRangeDescription("Value");
        boolean boolean23 = timeSeries20.getNotify();
        timeSeries20.setDomainDescription("Time");
        timeSeries20.clear();
        java.lang.Class class27 = timeSeries20.timePeriodClass;
        timeSeries5.timePeriodClass = class27;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "Value", "", class27);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", class27);
        timeSeries30.clear();
        java.lang.String str32 = timeSeries30.getDomainDescription();
        java.util.List list33 = timeSeries30.data;
        java.lang.String str34 = timeSeries30.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries30.add(regularTimePeriod35, (java.lang.Number) 100L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Time" + "'", str32, "Time");
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        boolean boolean10 = timeSeries1.getNotify();
        timeSeries1.setKey((java.lang.Comparable) 100.0d);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        java.util.Collection collection12 = timeSeries10.getTimePeriods();
        timeSeries10.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class18);
        timeSeries19.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries10.addAndOrUpdate(timeSeries19);
        timeSeries22.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries7.addAndOrUpdate(timeSeries22);
        timeSeries25.removeAgedItems(true);
        java.lang.Class<?> wildcardClass28 = timeSeries25.getClass();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        timeSeries1.setNotify(false);
        java.lang.Class class11 = timeSeries1.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries1.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        long long10 = timeSeries8.getMaximumItemAge();
        java.util.Collection collection11 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        java.lang.Comparable comparable12 = timeSeries1.getKey();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0f + "'", comparable12, 10.0f);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        boolean boolean5 = timeSeries2.equals((java.lang.Object) 100.0d);
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries2.addChangeListener(seriesChangeListener8);
        java.util.List list10 = timeSeries2.getItems();
        timeSeries2.setNotify(true);
        java.lang.Class class13 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, class13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(regularTimePeriod15, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener6);
        timeSeries1.removeAgedItems(false);
        java.util.List list10 = timeSeries1.data;
        timeSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries7.setRangeDescription("Value");
        java.lang.String str10 = timeSeries7.getDescription();
        java.lang.Comparable comparable11 = timeSeries7.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        java.util.List list13 = timeSeries7.data;
        java.util.List list14 = timeSeries7.data;
        timeSeries7.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries18.setRangeDescription("Value");
        java.lang.String str21 = timeSeries18.getDescription();
        java.util.List list22 = timeSeries18.data;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean25 = timeSeries24.getNotify();
        int int26 = timeSeries24.getMaximumItemCount();
        java.util.List list27 = timeSeries24.data;
        java.util.Collection collection28 = timeSeries24.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries18.addAndOrUpdate(timeSeries24);
        long long30 = timeSeries24.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class34 = timeSeries33.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class34);
        java.lang.Comparable comparable36 = timeSeries35.getKey();
        java.util.Collection collection37 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        int int38 = timeSeries24.getMaximumItemCount();
        timeSeries24.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries41.setRangeDescription("Value");
        java.lang.String str44 = timeSeries41.getDescription();
        java.util.List list45 = timeSeries41.data;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean48 = timeSeries47.getNotify();
        int int49 = timeSeries47.getMaximumItemCount();
        java.util.List list50 = timeSeries47.data;
        java.util.Collection collection51 = timeSeries47.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries41.addAndOrUpdate(timeSeries47);
        timeSeries47.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.String str55 = timeSeries47.getDomainDescription();
        java.util.List list56 = timeSeries47.getItems();
        timeSeries24.data = list56;
        timeSeries7.data = list56;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem59 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class34);
        org.junit.Assert.assertEquals("'" + comparable36 + "' != '" + (short) 1 + "'", comparable36, (short) 1);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Time" + "'", str55, "Time");
        org.junit.Assert.assertNotNull(list56);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod6, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.addChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        java.lang.String str13 = timeSeries1.getDescription();
        timeSeries1.fireSeriesChanged();
        timeSeries1.clear();
        java.lang.Class class16 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(class16);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        timeSeries1.setMaximumItemCount((int) '4');
        timeSeries1.setMaximumItemCount((int) (short) 100);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries13.setRangeDescription("Value");
        java.lang.String str16 = timeSeries13.getDescription();
        java.util.List list17 = timeSeries13.data;
        timeSeries13.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries1.addAndOrUpdate(timeSeries13);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        boolean boolean31 = timeSeries28.equals((java.lang.Object) 100.0d);
        timeSeries28.setNotify(true);
        java.lang.Class<?> wildcardClass34 = timeSeries28.getClass();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass34);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass34);
        timeSeries1.timePeriodClass = wildcardClass34;
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries1.createCopy((int) (byte) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = timeSeries40.getTimePeriod((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        java.util.List list8 = timeSeries6.getItems();
        timeSeries6.clear();
        timeSeries6.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries12.addChangeListener(seriesChangeListener18);
        java.util.List list20 = timeSeries12.getItems();
        timeSeries6.data = list20;
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        java.util.List list26 = timeSeries24.getItems();
        timeSeries24.clear();
        java.lang.String str28 = timeSeries24.getRangeDescription();
        java.util.List list29 = timeSeries24.getItems();
        timeSeries6.data = list29;
        timeSeries6.setKey((java.lang.Comparable) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener33);
        java.util.Collection collection35 = timeSeries6.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = timeSeries6.getIndex(regularTimePeriod36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.Class class10 = timeSeries6.timePeriodClass;
        timeSeries6.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.add(regularTimePeriod13, (java.lang.Number) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        boolean boolean4 = timeSeries1.getNotify();
        java.lang.Comparable comparable5 = timeSeries1.getKey();
        java.util.List list6 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        java.lang.Number number8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, number8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10.0f + "'", comparable5, 10.0f);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setNotify(true);
        java.lang.Class<?> wildcardClass13 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass13);
        timeSeries15.setDescription("Time");
        java.lang.String str18 = timeSeries15.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries15.addOrUpdate(regularTimePeriod19, (double) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        long long13 = timeSeries7.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class17 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class17);
        java.lang.Comparable comparable19 = timeSeries18.getKey();
        java.util.Collection collection20 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener21);
        java.lang.String str23 = timeSeries18.getDescription();
        java.lang.String str24 = timeSeries18.getDomainDescription();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 1 + "'", comparable19, (short) 1);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Time" + "'", str24, "Time");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setNotify(true);
        java.lang.Class<?> wildcardClass13 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, (java.lang.Class) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = timeSeries17.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        java.lang.Comparable comparable5 = timeSeries4.getKey();
        timeSeries4.removeAgedItems((long) 2147483647, false);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener10);
        int int12 = timeSeries4.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int15 = timeSeries14.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        timeSeries17.setNotify(true);
        java.lang.Class class21 = timeSeries17.timePeriodClass;
        java.lang.Comparable comparable22 = timeSeries17.getKey();
        boolean boolean23 = timeSeries14.equals((java.lang.Object) timeSeries17);
        timeSeries17.removeAgedItems((long) 1, true);
        timeSeries17.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries4.addAndOrUpdate(timeSeries17);
        timeSeries29.fireSeriesChanged();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 1 + "'", comparable5, (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 10.0f + "'", comparable22, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        timeSeries1.removeAgedItems((long) (byte) 100, true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener9);
        java.util.Collection collection11 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries1.addOrUpdate(regularTimePeriod12, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        timeSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.String str10 = timeSeries6.getDescription();
        timeSeries6.clear();
        int int12 = timeSeries6.getMaximumItemCount();
        int int13 = timeSeries6.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.update(regularTimePeriod14, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries8.addAndOrUpdate(timeSeries10);
        timeSeries10.setKey((java.lang.Comparable) "Time");
        java.lang.Class class14 = timeSeries10.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, "Time", "Time", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class14);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(class14);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        timeSeries1.setDescription("Overwritten values from: -1");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        long long10 = timeSeries8.getMaximumItemAge();
        timeSeries8.removeAgedItems(false);
        timeSeries8.setKey((java.lang.Comparable) 'a');
        timeSeries8.fireSeriesChanged();
        int int16 = timeSeries8.getItemCount();
        java.lang.Class class17 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "hi!", "Time", class17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 10.0", "Overwritten values from: -1", "Overwritten values from: -1", class17);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(class17);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int5 = timeSeries4.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        timeSeries7.setNotify(true);
        java.lang.Class class11 = timeSeries7.timePeriodClass;
        java.lang.Comparable comparable12 = timeSeries7.getKey();
        boolean boolean13 = timeSeries4.equals((java.lang.Object) timeSeries7);
        timeSeries4.fireSeriesChanged();
        java.lang.Class<?> wildcardClass15 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "", "Value", (java.lang.Class) wildcardClass15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0f + "'", comparable12, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        long long9 = timeSeries1.getMaximumItemAge();
        java.lang.String str10 = timeSeries1.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, (-1.0d), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        long long13 = timeSeries7.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = timeSeries7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class9);
        timeSeries10.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries10);
        java.lang.Class class14 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        timeSeries16.setNotify(true);
        java.lang.Class class20 = timeSeries16.timePeriodClass;
        java.lang.Comparable comparable21 = timeSeries16.getKey();
        timeSeries16.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean26 = timeSeries25.getNotify();
        timeSeries25.setMaximumItemCount(0);
        timeSeries25.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries31.setRangeDescription("Value");
        java.lang.String str34 = timeSeries31.getDescription();
        java.lang.Comparable comparable35 = timeSeries31.getKey();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries25.addAndOrUpdate(timeSeries31);
        java.util.List list37 = timeSeries31.data;
        timeSeries16.data = list37;
        timeSeries1.data = list37;
        boolean boolean40 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 10.0f + "'", comparable21, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10.0f + "'", comparable35, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        timeSeries9.setDomainDescription("");
        timeSeries9.setKey((java.lang.Comparable) 100);
        timeSeries9.removeAgedItems((long) (byte) 1, false);
        java.util.Collection collection18 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries20.setRangeDescription("Value");
        java.lang.String str23 = timeSeries20.getDescription();
        java.util.List list24 = timeSeries20.data;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean27 = timeSeries26.getNotify();
        int int28 = timeSeries26.getMaximumItemCount();
        java.util.List list29 = timeSeries26.data;
        java.util.Collection collection30 = timeSeries26.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries20.addAndOrUpdate(timeSeries26);
        timeSeries26.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable34 = timeSeries26.getKey();
        timeSeries26.setKey((java.lang.Comparable) (byte) 0);
        boolean boolean37 = timeSeries4.equals((java.lang.Object) timeSeries26);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + 9223372036854775807L + "'", comparable34, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        java.util.Collection collection5 = timeSeries1.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.removeChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        boolean boolean12 = timeSeries9.equals((java.lang.Object) 100.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries9.addChangeListener(seriesChangeListener13);
        java.util.Collection collection15 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        int int16 = timeSeries9.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.util.List list6 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setMaximumItemCount(0);
        timeSeries8.setKey((java.lang.Comparable) 0.0d);
        boolean boolean14 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class18);
        timeSeries19.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries8.addAndOrUpdate(timeSeries19);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries8.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean29 = timeSeries28.getNotify();
        int int30 = timeSeries28.getMaximumItemCount();
        java.util.List list31 = timeSeries28.data;
        timeSeries28.setRangeDescription("hi!");
        java.lang.Class class34 = timeSeries28.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', class34);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, class34);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries8.addAndOrUpdate(timeSeries36);
        java.util.Collection collection38 = timeSeries37.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries37.addOrUpdate(regularTimePeriod39, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(class34);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        long long8 = timeSeries6.getMaximumItemAge();
        java.lang.String str9 = timeSeries6.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        boolean boolean14 = timeSeries11.equals((java.lang.Object) 100.0d);
        timeSeries11.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        timeSeries18.setNotify(true);
        boolean boolean22 = timeSeries11.equals((java.lang.Object) timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) ' ', (int) '#');
        java.util.Collection collection26 = timeSeries6.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        java.util.List list27 = timeSeries25.data;
        boolean boolean28 = timeSeries1.equals((java.lang.Object) timeSeries25);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries1.removeChangeListener(seriesChangeListener29);
        java.lang.String str31 = timeSeries1.getDescription();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        timeSeries1.fireSeriesChanged();
        int int12 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        boolean boolean24 = timeSeries21.equals((java.lang.Object) 100.0d);
        timeSeries21.setNotify(true);
        java.lang.Class<?> wildcardClass27 = timeSeries21.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries1.addAndOrUpdate(timeSeries30);
        timeSeries31.setDescription("Time");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries31.add(timeSeriesDataItem34, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timeSeries1.getNotify();
        long long8 = timeSeries1.getMaximumItemAge();
        java.lang.String str9 = timeSeries1.getDescription();
        boolean boolean10 = timeSeries1.getNotify();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        timeSeries1.setDescription("");
        boolean boolean15 = timeSeries1.getNotify();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries13.setRangeDescription("Value");
        java.lang.String str16 = timeSeries13.getDescription();
        java.util.List list17 = timeSeries13.data;
        timeSeries13.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries1.addAndOrUpdate(timeSeries13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod23, (java.lang.Number) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        java.util.Collection collection10 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, (java.lang.Number) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        java.lang.String str6 = timeSeries1.getRangeDescription();
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        timeSeries1.removeAgedItems((long) ' ', false);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        boolean boolean17 = timeSeries14.equals((java.lang.Object) 100.0d);
        timeSeries14.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        timeSeries21.setNotify(true);
        boolean boolean25 = timeSeries14.equals((java.lang.Object) timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries14.createCopy((int) ' ', (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries28.addChangeListener(seriesChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries1.addAndOrUpdate(timeSeries28);
        int int32 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection35 = timeSeries34.getTimePeriods();
        timeSeries34.setNotify(true);
        java.lang.Class class38 = timeSeries34.timePeriodClass;
        java.util.List list39 = timeSeries34.getItems();
        timeSeries34.setKey((java.lang.Comparable) (byte) 1);
        java.lang.String str42 = timeSeries34.getDescription();
        timeSeries34.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries1.addAndOrUpdate(timeSeries34);
        java.lang.Class class46 = timeSeries45.getTimePeriodClass();
        int int47 = timeSeries45.getItemCount();
        java.util.List list48 = timeSeries45.data;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(class46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(list48);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        timeSeries1.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries1.createCopy(0, (int) (byte) 0);
        java.lang.String str18 = timeSeries17.getDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries17.createCopy((int) '4', (int) 'a');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class5);
        timeSeries6.setMaximumItemCount((int) '4');
        timeSeries6.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        boolean boolean14 = timeSeries11.equals((java.lang.Object) 100.0d);
        timeSeries11.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        timeSeries18.setNotify(true);
        boolean boolean22 = timeSeries11.equals((java.lang.Object) timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries11.createCopy((int) ' ', (int) '#');
        java.util.List list26 = timeSeries11.getItems();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class36 = timeSeries35.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class36);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class36);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Value", "Value", class36);
        timeSeries11.timePeriodClass = class36;
        boolean boolean41 = timeSeries6.equals((java.lang.Object) class36);
        long long42 = timeSeries6.getMaximumItemAge();
        java.util.List list43 = timeSeries6.data;
        java.util.List list44 = timeSeries6.getItems();
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(class36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 9223372036854775807L + "'", long42 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(list44);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.addOrUpdate(regularTimePeriod6, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        timeSeries1.clear();
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.util.List list6 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setMaximumItemCount(0);
        timeSeries8.setKey((java.lang.Comparable) 0.0d);
        boolean boolean14 = timeSeries1.equals((java.lang.Object) timeSeries8);
        boolean boolean15 = timeSeries8.isEmpty();
        timeSeries8.removeAgedItems((long) 32, false);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        long long22 = timeSeries20.getMaximumItemAge();
        timeSeries20.removeAgedItems(false);
        timeSeries20.setKey((java.lang.Comparable) 'a');
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries8.addAndOrUpdate(timeSeries20);
        timeSeries28.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.update((int) (byte) 1, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.setDescription("");
        java.util.Collection collection6 = timeSeries1.getTimePeriods();
        timeSeries1.setMaximumItemAge((long) (short) 100);
        timeSeries1.fireSeriesChanged();
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        timeSeries7.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable15 = timeSeries7.getKey();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        boolean boolean23 = timeSeries20.equals((java.lang.Object) 100.0d);
        timeSeries20.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection28 = timeSeries27.getTimePeriods();
        timeSeries27.setNotify(true);
        boolean boolean31 = timeSeries20.equals((java.lang.Object) timeSeries27);
        timeSeries20.fireSeriesChanged();
        java.util.Collection collection33 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        java.util.Collection collection34 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        int int35 = timeSeries17.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries17.createCopy((int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = timeSeries17.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 9223372036854775807L + "'", comparable15, 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class4 = timeSeries3.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries3.addChangeListener(seriesChangeListener5);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        boolean boolean8 = timeSeries3.isEmpty();
        java.util.Collection collection9 = timeSeries3.getTimePeriods();
        boolean boolean10 = timeSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener11);
        timeSeries3.setRangeDescription("Value");
        timeSeries3.clear();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        timeSeries19.setNotify(true);
        java.lang.Class class23 = timeSeries19.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class23);
        timeSeries3.timePeriodClass = class23;
        java.lang.Class<?> wildcardClass27 = timeSeries3.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', (java.lang.Class) wildcardClass27);
        timeSeries29.setRangeDescription("Overwritten values from: 10.0");
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries1.createCopy((int) ' ', (int) '#');
        java.util.List list16 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class26);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Value", "Value", class26);
        timeSeries1.timePeriodClass = class26;
        java.lang.String str31 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries1.getDataItem((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        boolean boolean6 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems(false);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        long long4 = timeSeries2.getMaximumItemAge();
        java.lang.Class class5 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class5);
        timeSeries6.setRangeDescription("Value");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.util.List list8 = timeSeries7.getItems();
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries7.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries7.createCopy(10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) -1 + "'", comparable9, (byte) -1);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        timeSeries1.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class9);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, class9);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class9);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), class9);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        timeSeries1.setRangeDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener13);
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        boolean boolean5 = timeSeries2.equals((java.lang.Object) 100.0d);
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.setNotify(true);
        boolean boolean13 = timeSeries2.equals((java.lang.Object) timeSeries9);
        timeSeries2.removeAgedItems((long) '#', true);
        java.lang.Class class17 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class17);
        java.lang.String str19 = timeSeries18.getRangeDescription();
        timeSeries18.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries18.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setNotify(true);
        java.lang.Class<?> wildcardClass13 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        boolean boolean20 = timeSeries17.equals((java.lang.Object) 100.0d);
        timeSeries17.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries17.addChangeListener(seriesChangeListener23);
        boolean boolean25 = timeSeries15.equals((java.lang.Object) timeSeries17);
        java.lang.String str26 = timeSeries15.getDomainDescription();
        timeSeries15.setKey((java.lang.Comparable) "Time");
        timeSeries15.setMaximumItemAge(1L);
        timeSeries15.setKey((java.lang.Comparable) 1L);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(timeSeriesDataItem33, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        long long13 = timeSeries7.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class17 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class17);
        java.lang.Comparable comparable19 = timeSeries18.getKey();
        java.util.Collection collection20 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        int int21 = timeSeries7.getMaximumItemCount();
        timeSeries7.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries24.setRangeDescription("Value");
        java.lang.String str27 = timeSeries24.getDescription();
        java.util.List list28 = timeSeries24.data;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean31 = timeSeries30.getNotify();
        int int32 = timeSeries30.getMaximumItemCount();
        java.util.List list33 = timeSeries30.data;
        java.util.Collection collection34 = timeSeries30.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries24.addAndOrUpdate(timeSeries30);
        timeSeries30.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.String str38 = timeSeries30.getDomainDescription();
        java.util.List list39 = timeSeries30.getItems();
        timeSeries7.data = list39;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = timeSeries7.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 1 + "'", comparable19, (short) 1);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Time" + "'", str38, "Time");
        org.junit.Assert.assertNotNull(list39);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "", "Value", class3);
        java.lang.Class class5 = timeSeries4.getTimePeriodClass();
        timeSeries4.setKey((java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries4.createCopy((int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(class5);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        int int5 = timeSeries1.getItemCount();
        java.lang.String str6 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setRangeDescription("hi!");
        boolean boolean12 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries8);
        java.util.List list14 = timeSeries1.getItems();
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.setDomainDescription("Time");
        boolean boolean8 = timeSeries1.getNotify();
        long long9 = timeSeries1.getMaximumItemAge();
        java.lang.Class class10 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.removeAgedItems(false);
        boolean boolean5 = timeSeries1.getNotify();
        java.util.List list6 = timeSeries1.data;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.fireSeriesChanged();
        java.util.List list14 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries16.setDescription("hi!");
        java.util.Collection collection19 = timeSeries16.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries1.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod21, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(timeSeries20);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.String str10 = timeSeries6.getDescription();
        timeSeries6.clear();
        int int12 = timeSeries6.getMaximumItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.add(timeSeriesDataItem13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries4.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.Class class4 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        java.util.List list8 = timeSeries6.getItems();
        timeSeries6.clear();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        boolean boolean14 = timeSeries11.equals((java.lang.Object) 100.0d);
        timeSeries11.setMaximumItemCount((int) ' ');
        java.lang.Class class17 = timeSeries11.getTimePeriodClass();
        java.util.List list18 = timeSeries11.getItems();
        timeSeries6.data = list18;
        timeSeries6.setDomainDescription("");
        java.util.List list22 = timeSeries6.data;
        timeSeries1.data = list22;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries1.addOrUpdate(regularTimePeriod24, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.fireSeriesChanged();
        timeSeries1.removeAgedItems(false);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setMaximumItemAge(10L);
        java.lang.Comparable comparable9 = timeSeries1.getKey();
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 10 + "'", comparable9, (byte) 10);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class12);
        java.lang.Comparable comparable14 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        boolean boolean19 = timeSeries16.equals((java.lang.Object) 100.0d);
        timeSeries16.setNotify(true);
        java.lang.Class class22 = timeSeries16.getTimePeriodClass();
        timeSeries13.timePeriodClass = class22;
        timeSeries7.timePeriodClass = class22;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = timeSeries7.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 1 + "'", comparable14, (short) 1);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(class22);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setRangeDescription("hi!");
        boolean boolean5 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemCount(10);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        java.util.List list11 = timeSeries9.getItems();
        timeSeries9.setDescription("Time");
        timeSeries9.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries9.createCopy((int) 'a', 2147483647);
        java.util.List list19 = timeSeries18.getItems();
        timeSeries1.data = list19;
        timeSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries1.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries4.removeChangeListener(seriesChangeListener11);
        long long13 = timeSeries4.getMaximumItemAge();
        java.util.Collection collection14 = timeSeries4.getTimePeriods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setKey((java.lang.Comparable) 0.0d);
        boolean boolean7 = timeSeries1.getNotify();
        java.util.List list8 = timeSeries1.data;
        int int9 = timeSeries1.getItemCount();
        timeSeries1.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number13 = timeSeries1.getValue(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.fireSeriesChanged();
        timeSeries1.setDescription("Overwritten values from: -1");
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean3 = timeSeries2.getNotify();
        int int4 = timeSeries2.getMaximumItemCount();
        java.util.List list5 = timeSeries2.data;
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries2.createCopy((int) '4', (int) (short) 100);
        java.util.List list9 = timeSeries8.getItems();
        java.lang.Class class10 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, class10);
        timeSeries11.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.lang.String str6 = timeSeries1.getDomainDescription();
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        java.util.List list8 = timeSeries1.data;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.removeChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (short) 0, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        java.util.List list15 = timeSeries7.getItems();
        timeSeries1.data = list15;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean19 = timeSeries18.getNotify();
        int int20 = timeSeries18.getMaximumItemCount();
        java.util.List list21 = timeSeries18.data;
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries18.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries18.removeChangeListener(seriesChangeListener25);
        boolean boolean27 = timeSeries1.equals((java.lang.Object) seriesChangeListener25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        boolean boolean10 = timeSeries1.getNotify();
        java.lang.String str11 = timeSeries1.getDomainDescription();
        java.util.Collection collection12 = timeSeries1.getTimePeriods();
        timeSeries1.setMaximumItemAge((long) (byte) 10);
        java.lang.String str15 = timeSeries1.getRangeDescription();
        timeSeries1.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        timeSeries19.setNotify(true);
        int int23 = timeSeries19.getItemCount();
        java.lang.String str24 = timeSeries19.getDescription();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class27 = timeSeries26.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries26.addChangeListener(seriesChangeListener28);
        java.lang.String str30 = timeSeries26.getRangeDescription();
        boolean boolean31 = timeSeries26.isEmpty();
        java.util.Collection collection32 = timeSeries26.getTimePeriods();
        boolean boolean33 = timeSeries26.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries19.addAndOrUpdate(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries19.createCopy((int) (byte) 10, (int) '4');
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean40 = timeSeries39.getNotify();
        timeSeries39.setRangeDescription("hi!");
        boolean boolean43 = timeSeries39.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries45.setRangeDescription("Value");
        java.lang.String str48 = timeSeries45.getDescription();
        java.util.List list49 = timeSeries45.data;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean52 = timeSeries51.getNotify();
        int int53 = timeSeries51.getMaximumItemCount();
        java.util.List list54 = timeSeries51.data;
        java.util.Collection collection55 = timeSeries51.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries45.addAndOrUpdate(timeSeries51);
        timeSeries51.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable59 = timeSeries51.getKey();
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection62 = timeSeries61.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection65 = timeSeries64.getTimePeriods();
        boolean boolean67 = timeSeries64.equals((java.lang.Object) 100.0d);
        timeSeries64.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection72 = timeSeries71.getTimePeriods();
        timeSeries71.setNotify(true);
        boolean boolean75 = timeSeries64.equals((java.lang.Object) timeSeries71);
        timeSeries64.fireSeriesChanged();
        java.util.Collection collection77 = timeSeries61.getTimePeriodsUniqueToOtherSeries(timeSeries64);
        java.util.Collection collection78 = timeSeries51.getTimePeriodsUniqueToOtherSeries(timeSeries61);
        boolean boolean79 = timeSeries39.equals((java.lang.Object) timeSeries51);
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries19.addAndOrUpdate(timeSeries51);
        java.util.List list81 = timeSeries19.data;
        timeSeries1.data = list81;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Value" + "'", str30, "Value");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertEquals("'" + comparable59 + "' != '" + 9223372036854775807L + "'", comparable59, 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(timeSeries80);
        org.junit.Assert.assertNotNull(list81);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        timeSeries1.setNotify(true);
        timeSeries1.setRangeDescription("");
        java.lang.Class class9 = timeSeries1.timePeriodClass;
        java.lang.Class<?> wildcardClass10 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.String str10 = timeSeries6.getDescription();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        timeSeries19.setNotify(true);
        boolean boolean23 = timeSeries12.equals((java.lang.Object) timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries12.createCopy((int) ' ', (int) '#');
        int int27 = timeSeries26.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries29.addChangeListener(seriesChangeListener31);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries29.removePropertyChangeListener(propertyChangeListener33);
        java.lang.Class class35 = timeSeries29.getTimePeriodClass();
        timeSeries26.timePeriodClass = class35;
        timeSeries6.timePeriodClass = class35;
        timeSeries6.setMaximumItemAge(100L);
        timeSeries6.setDescription("");
        int int42 = timeSeries6.getMaximumItemCount();
        java.util.List list43 = timeSeries6.getItems();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean46 = timeSeries45.getNotify();
        java.util.List list47 = timeSeries45.getItems();
        timeSeries45.removeAgedItems((long) 2147483647, true);
        java.util.Collection collection51 = timeSeries6.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(collection51);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        boolean boolean8 = timeSeries1.isEmpty();
        timeSeries1.setKey((java.lang.Comparable) 10);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        boolean boolean21 = timeSeries18.equals((java.lang.Object) 100.0d);
        timeSeries18.setNotify(true);
        java.lang.Class<?> wildcardClass24 = timeSeries18.getClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, (java.lang.Class) wildcardClass24);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, (java.lang.Class) wildcardClass24);
        boolean boolean29 = timeSeries1.equals((java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        java.lang.Comparable comparable10 = timeSeries1.getKey();
        java.lang.Class<?> wildcardClass11 = timeSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (byte) -1 + "'", comparable10, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.util.List list6 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setMaximumItemCount(0);
        timeSeries8.setKey((java.lang.Comparable) 0.0d);
        boolean boolean14 = timeSeries1.equals((java.lang.Object) timeSeries8);
        boolean boolean15 = timeSeries8.isEmpty();
        timeSeries8.removeAgedItems((long) 32, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries8.addOrUpdate(regularTimePeriod19, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        int int8 = timeSeries6.getMaximumItemCount();
        java.util.List list9 = timeSeries6.data;
        boolean boolean10 = timeSeries6.getNotify();
        java.util.Collection collection11 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        timeSeries13.setNotify(true);
        java.lang.Class class17 = timeSeries13.timePeriodClass;
        java.lang.Comparable comparable18 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries6.addAndOrUpdate(timeSeries13);
        java.lang.Class class20 = timeSeries13.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10.0f + "'", comparable18, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(class20);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        boolean boolean8 = timeSeries5.equals((java.lang.Object) 100.0d);
        timeSeries5.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        timeSeries12.setNotify(true);
        boolean boolean16 = timeSeries5.equals((java.lang.Object) timeSeries12);
        timeSeries5.fireSeriesChanged();
        java.util.List list18 = timeSeries5.getItems();
        boolean boolean19 = timeSeries1.equals((java.lang.Object) list18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries1.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        java.lang.String str6 = timeSeries1.getRangeDescription();
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        timeSeries1.removeAgedItems((long) ' ', false);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        boolean boolean17 = timeSeries14.equals((java.lang.Object) 100.0d);
        timeSeries14.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        timeSeries21.setNotify(true);
        boolean boolean25 = timeSeries14.equals((java.lang.Object) timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries14.createCopy((int) ' ', (int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries28.addChangeListener(seriesChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries1.addAndOrUpdate(timeSeries28);
        int int32 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        boolean boolean5 = timeSeries2.equals((java.lang.Object) 100.0d);
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.setNotify(true);
        boolean boolean13 = timeSeries2.equals((java.lang.Object) timeSeries9);
        timeSeries2.fireSeriesChanged();
        java.util.List list15 = timeSeries2.data;
        java.lang.Class<?> wildcardClass16 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, (java.lang.Class) wildcardClass16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries17.addOrUpdate(regularTimePeriod18, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        timeSeries1.fireSeriesChanged();
        java.lang.Comparable comparable12 = timeSeries1.getKey();
        int int13 = timeSeries1.getMaximumItemCount();
        java.lang.Class class14 = timeSeries1.timePeriodClass;
        java.lang.Class class15 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 10 + "'", comparable12, (byte) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getDescription();
        timeSeries1.setNotify(true);
        int int9 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries1.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        boolean boolean6 = timeSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        timeSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        timeSeries1.clear();
        java.lang.String str10 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries13.setRangeDescription("Value");
        java.lang.String str16 = timeSeries13.getDescription();
        java.util.List list17 = timeSeries13.data;
        timeSeries13.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries1.addAndOrUpdate(timeSeries13);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        boolean boolean31 = timeSeries28.equals((java.lang.Object) 100.0d);
        timeSeries28.setNotify(true);
        java.lang.Class<?> wildcardClass34 = timeSeries28.getClass();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass34);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass34);
        timeSeries1.timePeriodClass = wildcardClass34;
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries1.createCopy((int) (byte) 0, (int) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = timeSeries1.getIndex(regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(timeSeries40);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        timeSeries7.setDomainDescription("");
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 0 + "'", comparable10, (short) 0);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        boolean boolean7 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setNotify(true);
        java.lang.Class<?> wildcardClass10 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass10);
        java.util.List list12 = timeSeries11.getItems();
        java.lang.Class class13 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries15.fireSeriesChanged();
        timeSeries15.removeAgedItems(false);
        timeSeries15.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries15);
        java.lang.String str22 = timeSeries21.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class26);
        java.lang.Comparable comparable28 = timeSeries27.getKey();
        java.lang.Class class29 = timeSeries27.getTimePeriodClass();
        timeSeries21.timePeriodClass = class29;
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + (short) 1 + "'", comparable28, (short) 1);
        org.junit.Assert.assertNotNull(class29);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        int int8 = timeSeries6.getMaximumItemCount();
        java.util.List list9 = timeSeries6.data;
        boolean boolean10 = timeSeries6.getNotify();
        java.util.Collection collection11 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        timeSeries1.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        boolean boolean18 = timeSeries15.equals((java.lang.Object) 100.0d);
        timeSeries15.setNotify(true);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection24 = timeSeries23.getTimePeriods();
        boolean boolean26 = timeSeries23.equals((java.lang.Object) 100.0d);
        timeSeries23.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries23.addChangeListener(seriesChangeListener29);
        java.util.List list31 = timeSeries23.getItems();
        timeSeries23.setNotify(true);
        timeSeries23.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries23.addChangeListener(seriesChangeListener35);
        java.util.Collection collection37 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        timeSeries23.setDescription("Time");
        int int40 = timeSeries23.getMaximumItemCount();
        java.util.List list41 = timeSeries23.data;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem42 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.add(timeSeriesDataItem42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertNotNull(list41);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        java.util.List list8 = timeSeries1.data;
        timeSeries1.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries1.getValue(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.fireSeriesChanged();
        timeSeries1.setNotify(false);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        timeSeries7.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable15 = timeSeries7.getKey();
        timeSeries7.setKey((java.lang.Comparable) (byte) 0);
        timeSeries7.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = timeSeries7.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 9223372036854775807L + "'", comparable15, 9223372036854775807L);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.clear();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries1.removeChangeListener(seriesChangeListener16);
        timeSeries1.setNotify(true);
        long long20 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        timeSeries6.setNotify(true);
        java.lang.Class class10 = timeSeries6.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class10);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 10", "Overwritten values from: 0", "Value", class10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", class10);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        timeSeries11.setNotify(true);
        int int15 = timeSeries11.getItemCount();
        java.lang.String str16 = timeSeries11.getDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries1.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod18, (java.lang.Number) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.removeChangeListener(seriesChangeListener9);
        timeSeries1.fireSeriesChanged();
        java.lang.String str12 = timeSeries1.getRangeDescription();
        timeSeries1.setDescription("");
        java.util.List list15 = timeSeries1.data;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean5 = timeSeries4.getNotify();
        timeSeries4.setRangeDescription("hi!");
        boolean boolean8 = timeSeries4.isEmpty();
        timeSeries4.setMaximumItemCount(10);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class18);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, class18);
        timeSeries4.timePeriodClass = class18;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: -1", "Overwritten values from: 10", "hi!", class18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(class18);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "");
        java.util.List list2 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = timeSeries1.getValue(regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        java.util.List list15 = timeSeries7.getItems();
        timeSeries1.data = list15;
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        timeSeries7.setRangeDescription("hi!");
        boolean boolean11 = timeSeries2.equals((java.lang.Object) timeSeries7);
        java.lang.Class class12 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class12);
        timeSeries13.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        java.util.Collection collection19 = timeSeries17.getTimePeriods();
        timeSeries17.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class25);
        timeSeries26.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries17.addAndOrUpdate(timeSeries26);
        java.lang.Class class30 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection33 = timeSeries32.getTimePeriods();
        timeSeries32.setNotify(true);
        java.lang.Class class36 = timeSeries32.timePeriodClass;
        java.lang.Comparable comparable37 = timeSeries32.getKey();
        timeSeries32.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean42 = timeSeries41.getNotify();
        timeSeries41.setMaximumItemCount(0);
        timeSeries41.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries47.setRangeDescription("Value");
        java.lang.String str50 = timeSeries47.getDescription();
        java.lang.Comparable comparable51 = timeSeries47.getKey();
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries41.addAndOrUpdate(timeSeries47);
        java.util.List list53 = timeSeries47.data;
        timeSeries32.data = list53;
        timeSeries17.data = list53;
        boolean boolean56 = timeSeries17.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries13.addAndOrUpdate(timeSeries17);
        java.lang.Comparable comparable58 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.setKey(comparable58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(class36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 10.0f + "'", comparable37, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + 10.0f + "'", comparable51, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(timeSeries57);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        boolean boolean10 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        java.util.List list14 = timeSeries12.getItems();
        timeSeries12.removeAgedItems(true);
        timeSeries12.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.addAndOrUpdate(timeSeries12);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update((int) (byte) 1, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener4);
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class9);
        timeSeries10.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        boolean boolean18 = timeSeries15.equals((java.lang.Object) 100.0d);
        timeSeries15.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries15.addChangeListener(seriesChangeListener21);
        java.util.List list23 = timeSeries15.getItems();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection26 = timeSeries25.getTimePeriods();
        timeSeries25.setNotify(true);
        java.lang.Class class29 = timeSeries25.timePeriodClass;
        java.lang.Comparable comparable30 = timeSeries25.getKey();
        timeSeries25.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class class35 = timeSeries34.getTimePeriodClass();
        timeSeries25.timePeriodClass = class35;
        java.lang.String str37 = timeSeries25.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries15.addAndOrUpdate(timeSeries25);
        boolean boolean39 = timeSeries10.equals((java.lang.Object) timeSeries25);
        java.lang.String str40 = timeSeries10.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int42 = timeSeries10.getIndex(regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(class29);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + 10.0f + "'", comparable30, 10.0f);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Time" + "'", str37, "Time");
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f));
        timeSeries1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries4.setRangeDescription("Value");
        java.lang.String str7 = timeSeries4.getDescription();
        java.lang.Comparable comparable8 = timeSeries4.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        boolean boolean13 = timeSeries10.equals((java.lang.Object) 100.0d);
        timeSeries10.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries10.addChangeListener(seriesChangeListener16);
        java.util.List list18 = timeSeries10.getItems();
        timeSeries4.data = list18;
        java.lang.Class<?> wildcardClass20 = list18.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "", (java.lang.Class) wildcardClass20);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(timeSeriesDataItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0f + "'", comparable8, 10.0f);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        boolean boolean10 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        long long14 = timeSeries12.getMaximumItemAge();
        timeSeries12.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean19 = timeSeries18.getNotify();
        int int20 = timeSeries18.getMaximumItemCount();
        java.util.List list21 = timeSeries18.data;
        timeSeries18.setRangeDescription("hi!");
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        timeSeries12.timePeriodClass = class24;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries27.setRangeDescription("Value");
        java.lang.String str30 = timeSeries27.getDescription();
        java.util.List list31 = timeSeries27.data;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean34 = timeSeries33.getNotify();
        int int35 = timeSeries33.getMaximumItemCount();
        java.util.List list36 = timeSeries33.data;
        java.util.Collection collection37 = timeSeries33.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries27.addAndOrUpdate(timeSeries33);
        timeSeries33.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable41 = timeSeries33.getKey();
        timeSeries33.setKey((java.lang.Comparable) (byte) 0);
        java.util.Collection collection44 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries33);
        java.util.Collection collection45 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        boolean boolean46 = timeSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries49 = timeSeries1.createCopy((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + 9223372036854775807L + "'", comparable41, 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        java.util.List list15 = timeSeries7.getItems();
        timeSeries1.data = list15;
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.lang.Class class19 = timeSeries1.timePeriodClass;
        boolean boolean20 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod21, (java.lang.Number) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean11 = timeSeries10.getNotify();
        timeSeries10.setMaximumItemCount(0);
        timeSeries10.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries16.setRangeDescription("Value");
        java.lang.String str19 = timeSeries16.getDescription();
        java.lang.Comparable comparable20 = timeSeries16.getKey();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries10.addAndOrUpdate(timeSeries16);
        java.util.List list22 = timeSeries16.data;
        timeSeries1.data = list22;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod24, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10.0f + "'", comparable6, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 10.0f + "'", comparable20, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        timeSeries6.setRangeDescription("hi!");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        boolean boolean11 = timeSeries6.getNotify();
        java.lang.Class class12 = timeSeries6.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries6.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setRangeDescription("Time");
        java.util.List list5 = timeSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries1.getTimePeriod(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        timeSeries1.setDomainDescription("");
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener11);
        timeSeries1.setMaximumItemCount((int) (short) 100);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        long long5 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.addOrUpdate(regularTimePeriod6, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.String str10 = timeSeries6.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener11);
        timeSeries6.removeAgedItems((long) (-1), false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.add(timeSeriesDataItem16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        timeSeries1.setDomainDescription("Time");
        timeSeries1.setDescription("Value");
        java.lang.Class class15 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries6.setRangeDescription("Value");
        java.lang.String str9 = timeSeries6.getDescription();
        java.lang.Comparable comparable10 = timeSeries6.getKey();
        boolean boolean11 = timeSeries6.getNotify();
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        timeSeries6.setRangeDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries6.getDataItem(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0f + "'", comparable10, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        boolean boolean7 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        timeSeries11.setNotify(true);
        boolean boolean15 = timeSeries4.equals((java.lang.Object) timeSeries11);
        timeSeries4.fireSeriesChanged();
        java.util.List list17 = timeSeries4.getItems();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries19.removeChangeListener(seriesChangeListener20);
        timeSeries19.setDescription("");
        int int24 = timeSeries19.getMaximumItemCount();
        java.util.Collection collection25 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.Class<?> wildcardClass26 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "Value", "hi!", (java.lang.Class) wildcardClass26);
        java.lang.String str28 = timeSeries27.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem30 = timeSeries27.getDataItem(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        timeSeries4.removeAgedItems((long) 1, true);
        timeSeries4.setNotify(false);
        timeSeries4.setMaximumItemAge((long) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class21);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries22.addAndOrUpdate(timeSeries24);
        timeSeries25.setMaximumItemAge((long) (short) 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries25.removeChangeListener(seriesChangeListener28);
        java.util.List list30 = timeSeries25.data;
        timeSeries4.data = list30;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries8 = timeSeries1.createCopy((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        long long13 = timeSeries12.getMaximumItemAge();
        timeSeries12.setKey((java.lang.Comparable) (short) 0);
        timeSeries12.removeAgedItems(false);
        timeSeries12.fireSeriesChanged();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.setNotify(true);
        java.lang.Class class7 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class7);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class7);
        int int10 = timeSeries9.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries9.createCopy((int) (short) 1, (int) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries13.addOrUpdate(regularTimePeriod14, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.util.List list6 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setMaximumItemCount(0);
        timeSeries8.setKey((java.lang.Comparable) 0.0d);
        boolean boolean14 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class18);
        timeSeries19.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries8.addAndOrUpdate(timeSeries19);
        int int23 = timeSeries19.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries19.createCopy((int) ' ', (int) ' ');
        timeSeries26.setDomainDescription("Value");
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        timeSeries1.removeAgedItems((long) (byte) 100, true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeSeries1.getIndex(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.util.List list8 = timeSeries7.getItems();
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        java.lang.Object obj10 = null;
        boolean boolean11 = timeSeries7.equals(obj10);
        timeSeries7.removeAgedItems(true);
        timeSeries7.setMaximumItemCount(2147483647);
        java.lang.String str16 = timeSeries7.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries7.addChangeListener(seriesChangeListener17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) -1 + "'", comparable9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        int int8 = timeSeries6.getMaximumItemCount();
        java.util.List list9 = timeSeries6.data;
        boolean boolean10 = timeSeries6.getNotify();
        java.util.Collection collection11 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        timeSeries1.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        boolean boolean18 = timeSeries15.equals((java.lang.Object) 100.0d);
        timeSeries15.setNotify(true);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        boolean boolean22 = timeSeries15.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries15.addChangeListener(seriesChangeListener23);
        timeSeries15.removeAgedItems(false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries15.removeChangeListener(seriesChangeListener27);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod29, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        boolean boolean7 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setNotify(true);
        java.lang.Class<?> wildcardClass10 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass10);
        java.util.List list12 = timeSeries11.getItems();
        java.lang.Class class13 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries15.fireSeriesChanged();
        timeSeries15.removeAgedItems(false);
        timeSeries15.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries15);
        timeSeries21.setMaximumItemCount((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries21.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        timeSeries1.setNotify(true);
        timeSeries1.setRangeDescription("");
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        boolean boolean9 = timeSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        java.util.List list12 = timeSeries1.getItems();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        boolean boolean9 = timeSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        boolean boolean16 = timeSeries13.equals((java.lang.Object) 100.0d);
        timeSeries13.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.addAndOrUpdate(timeSeries13);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries13.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Class class22 = timeSeries13.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries27.addAndOrUpdate(timeSeries29);
        timeSeries29.setKey((java.lang.Comparable) "Time");
        java.lang.String str33 = timeSeries29.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries29.addPropertyChangeListener(propertyChangeListener34);
        int int36 = timeSeries29.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries13.addAndOrUpdate(timeSeries29);
        java.lang.String str38 = timeSeries13.getRangeDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        java.lang.Comparable comparable9 = timeSeries1.getKey();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener2);
        int int4 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries1.addOrUpdate(regularTimePeriod5, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.removeAgedItems((long) '#', true);
        java.lang.String str16 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.lang.String str22 = timeSeries18.getRangeDescription();
        boolean boolean23 = timeSeries18.isEmpty();
        java.util.Collection collection24 = timeSeries18.getTimePeriods();
        boolean boolean25 = timeSeries18.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener26);
        timeSeries18.setRangeDescription("Value");
        timeSeries18.clear();
        timeSeries18.removeAgedItems(true);
        boolean boolean33 = timeSeries1.equals((java.lang.Object) timeSeries18);
        timeSeries18.setNotify(true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setNotify(true);
        java.lang.Class<?> wildcardClass13 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        boolean boolean20 = timeSeries17.equals((java.lang.Object) 100.0d);
        timeSeries17.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries17.addChangeListener(seriesChangeListener23);
        boolean boolean25 = timeSeries15.equals((java.lang.Object) timeSeries17);
        java.lang.String str26 = timeSeries15.getDomainDescription();
        timeSeries15.setKey((java.lang.Comparable) "Time");
        timeSeries15.setMaximumItemAge(1L);
        long long31 = timeSeries15.getMaximumItemAge();
        timeSeries15.setDescription("hi!");
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries7.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete((int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries1.addOrUpdate(regularTimePeriod15, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.removeAgedItems(false);
        boolean boolean5 = timeSeries1.getNotify();
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        java.util.List list15 = timeSeries7.getItems();
        timeSeries1.data = list15;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean19 = timeSeries18.getNotify();
        timeSeries18.setRangeDescription("hi!");
        java.util.List list22 = timeSeries18.getItems();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries1.addAndOrUpdate(timeSeries18);
        java.lang.Comparable comparable24 = timeSeries18.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = timeSeries18.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (byte) -1 + "'", comparable24, (byte) -1);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        boolean boolean4 = timeSeries1.getNotify();
        timeSeries1.setDomainDescription("Time");
        timeSeries1.clear();
        timeSeries1.removeAgedItems(false);
        timeSeries1.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        timeSeries1.setNotify(true);
        java.lang.Class class12 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries17.addChangeListener(seriesChangeListener19);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener21);
        java.lang.Comparable comparable23 = timeSeries17.getKey();
        java.lang.Class<?> wildcardClass24 = timeSeries17.getClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "Value", "Overwritten values from: 10", (java.lang.Class) wildcardClass24);
        java.util.List list26 = timeSeries25.data;
        timeSeries1.data = list26;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeries1.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 10.0f + "'", comparable23, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.fireSeriesChanged();
        java.util.List list14 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        timeSeries16.setNotify(true);
        java.lang.Class class20 = timeSeries16.timePeriodClass;
        java.util.List list21 = timeSeries16.getItems();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean24 = timeSeries23.getNotify();
        timeSeries23.setMaximumItemCount(0);
        timeSeries23.setKey((java.lang.Comparable) 0.0d);
        boolean boolean29 = timeSeries16.equals((java.lang.Object) timeSeries23);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class33 = timeSeries32.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class33);
        timeSeries34.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries23.addAndOrUpdate(timeSeries34);
        java.util.Collection collection38 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries23.createCopy(0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries41.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(timeSeries41);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        int int10 = timeSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener11);
        int int13 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod14, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.setNotify(true);
        java.lang.Class class7 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class7);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        java.lang.Class<?> wildcardClass10 = collection9.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass10);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries3.setRangeDescription("Value");
        timeSeries3.setKey((java.lang.Comparable) false);
        boolean boolean8 = timeSeries3.isEmpty();
        boolean boolean9 = timeSeries3.isEmpty();
        timeSeries3.setMaximumItemCount((int) (byte) 1);
        java.util.Collection collection12 = timeSeries3.getTimePeriods();
        java.util.List list13 = timeSeries3.data;
        timeSeries1.data = list13;
        int int15 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        long long10 = timeSeries8.getMaximumItemAge();
        java.util.Collection collection11 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        timeSeries8.clear();
        timeSeries8.setRangeDescription("Overwritten values from: -1");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.util.List list6 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setMaximumItemCount(0);
        timeSeries8.setKey((java.lang.Comparable) 0.0d);
        boolean boolean14 = timeSeries1.equals((java.lang.Object) timeSeries8);
        boolean boolean15 = timeSeries8.isEmpty();
        timeSeries8.removeAgedItems((long) 32, false);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        long long22 = timeSeries20.getMaximumItemAge();
        timeSeries20.removeAgedItems(false);
        timeSeries20.setKey((java.lang.Comparable) 'a');
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries8.addAndOrUpdate(timeSeries20);
        java.lang.Object obj29 = null;
        boolean boolean30 = timeSeries20.equals(obj29);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        long long8 = timeSeries1.getMaximumItemAge();
        java.lang.String str9 = timeSeries1.getRangeDescription();
        java.lang.String str10 = timeSeries1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries1.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        timeSeries7.setRangeDescription("hi!");
        java.lang.Class class13 = timeSeries7.timePeriodClass;
        timeSeries1.timePeriodClass = class13;
        timeSeries1.removeAgedItems(true);
        timeSeries1.removeAgedItems(false);
        timeSeries1.setMaximumItemAge((long) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod21, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.addAndOrUpdate(timeSeries14);
        boolean boolean16 = timeSeries12.getNotify();
        java.util.List list17 = timeSeries12.data;
        boolean boolean18 = timeSeries1.equals((java.lang.Object) list17);
        java.lang.Comparable comparable19 = timeSeries1.getKey();
        java.lang.String str20 = timeSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + false + "'", comparable19, false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        int int5 = timeSeries1.getItemCount();
        java.lang.String str6 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setRangeDescription("hi!");
        boolean boolean12 = timeSeries8.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean16 = timeSeries15.getNotify();
        java.util.List list17 = timeSeries15.getItems();
        timeSeries15.clear();
        java.util.Collection collection19 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        long long8 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (byte) 1, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.removeAgedItems((long) '#', true);
        timeSeries1.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries1.addOrUpdate(regularTimePeriod18, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener13);
        java.util.List list15 = timeSeries8.getItems();
        timeSeries8.setMaximumItemCount((int) '4');
        timeSeries8.setMaximumItemAge(10L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries8.getValue(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.fireSeriesChanged();
        timeSeries1.removeAgedItems(false);
        java.util.Collection collection5 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeSeries1.getIndex(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        timeSeries1.fireSeriesChanged();
        int int12 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        boolean boolean24 = timeSeries21.equals((java.lang.Object) 100.0d);
        timeSeries21.setNotify(true);
        java.lang.Class<?> wildcardClass27 = timeSeries21.getClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass27);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries1.addAndOrUpdate(timeSeries30);
        timeSeries30.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = timeSeries30.getTimePeriod((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        java.util.List list14 = timeSeries12.getItems();
        timeSeries12.setDescription("Time");
        timeSeries12.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener19);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        java.lang.String str22 = timeSeries12.getDomainDescription();
        timeSeries12.setRangeDescription("");
        java.util.Collection collection25 = timeSeries12.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries27.addChangeListener(seriesChangeListener29);
        java.lang.String str31 = timeSeries27.getRangeDescription();
        boolean boolean32 = timeSeries27.isEmpty();
        java.util.Collection collection33 = timeSeries27.getTimePeriods();
        boolean boolean34 = timeSeries27.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries27.removePropertyChangeListener(propertyChangeListener35);
        timeSeries27.setRangeDescription("Value");
        timeSeries27.clear();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection44 = timeSeries43.getTimePeriods();
        timeSeries43.setNotify(true);
        java.lang.Class class47 = timeSeries43.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class47);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class47);
        timeSeries27.timePeriodClass = class47;
        boolean boolean51 = timeSeries12.equals((java.lang.Object) class47);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries12.getDataItem(regularTimePeriod52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(class47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        timeSeries1.setDomainDescription("");
        java.lang.Comparable comparable12 = timeSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) -1 + "'", comparable12, (byte) -1);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries1.getDataItem(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.fireSeriesChanged();
        timeSeries1.removeAgedItems(false);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setMaximumItemAge(10L);
        java.lang.Class class9 = timeSeries1.timePeriodClass;
        timeSeries1.setNotify(true);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        timeSeries5.setNotify(true);
        java.lang.Class class9 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class9);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        java.lang.Class<?> wildcardClass12 = collection11.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Value", "Value", (java.lang.Class) wildcardClass12);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        java.lang.String str6 = timeSeries1.getDomainDescription();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = timeSeries1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries1.getValue(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        java.lang.String str6 = timeSeries1.getRangeDescription();
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        timeSeries1.removeAgedItems((long) ' ', false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.createCopy(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class12);
        java.lang.Comparable comparable14 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        boolean boolean19 = timeSeries16.equals((java.lang.Object) 100.0d);
        timeSeries16.setNotify(true);
        java.lang.Class class22 = timeSeries16.getTimePeriodClass();
        timeSeries13.timePeriodClass = class22;
        timeSeries7.timePeriodClass = class22;
        timeSeries7.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete(regularTimePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 1 + "'", comparable14, (short) 1);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(class22);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.fireSeriesChanged();
        java.util.List list14 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries16.setDescription("hi!");
        java.util.Collection collection19 = timeSeries16.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries1.addAndOrUpdate(timeSeries16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries1.createCopy((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(timeSeries20);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        java.util.List list11 = timeSeries1.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod12, (java.lang.Number) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries7.setMaximumItemCount((int) (short) 0);
        java.util.List list10 = timeSeries7.getItems();
        java.lang.String str11 = timeSeries7.getRangeDescription();
        timeSeries7.removeAgedItems(100L, true);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries16.removeChangeListener(seriesChangeListener17);
        timeSeries16.removeAgedItems(false);
        timeSeries16.clear();
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries7.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean29 = timeSeries28.getNotify();
        int int30 = timeSeries28.getMaximumItemCount();
        java.util.List list31 = timeSeries28.data;
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries28.createCopy((int) '4', (int) (short) 100);
        long long35 = timeSeries28.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class38 = timeSeries37.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries37.addChangeListener(seriesChangeListener39);
        boolean boolean41 = timeSeries28.equals((java.lang.Object) seriesChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries43.setRangeDescription("Value");
        boolean boolean46 = timeSeries43.getNotify();
        timeSeries43.setDomainDescription("Time");
        timeSeries43.clear();
        java.lang.Class class50 = timeSeries43.timePeriodClass;
        timeSeries28.timePeriodClass = class50;
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "Value", "", class50);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", class50);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener54 = null;
        timeSeries53.removeChangeListener(seriesChangeListener54);
        java.util.Collection collection56 = timeSeries7.getTimePeriodsUniqueToOtherSeries(timeSeries53);
        boolean boolean57 = timeSeries53.getNotify();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9223372036854775807L + "'", long35 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(class50);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy((int) 'a', 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries10.addOrUpdate(regularTimePeriod11, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class9);
        java.lang.Comparable comparable11 = timeSeries10.getKey();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        boolean boolean16 = timeSeries13.equals((java.lang.Object) 100.0d);
        timeSeries13.setNotify(true);
        java.lang.Class class19 = timeSeries13.getTimePeriodClass();
        timeSeries10.timePeriodClass = class19;
        timeSeries1.timePeriodClass = class19;
        java.util.List list22 = timeSeries1.getItems();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 1 + "'", comparable11, (short) 1);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        timeSeries1.setDomainDescription("");
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries1.addChangeListener(seriesChangeListener11);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.removeAgedItems(false);
        timeSeries1.clear();
        java.lang.String str7 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setDescription("hi!");
        java.util.Collection collection4 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy(10, (int) '4');
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean10 = timeSeries9.getNotify();
        java.util.List list11 = timeSeries9.getItems();
        timeSeries9.removeAgedItems(true);
        timeSeries9.setDomainDescription("Value");
        timeSeries9.removeAgedItems(true);
        long long18 = timeSeries9.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries7.addAndOrUpdate(timeSeries9);
        java.lang.String str20 = timeSeries9.getRangeDescription();
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setRangeDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries6.getRangeDescription();
        boolean boolean11 = timeSeries6.isEmpty();
        java.util.Collection collection12 = timeSeries6.getTimePeriods();
        boolean boolean13 = timeSeries6.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener14);
        timeSeries6.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries1.setDomainDescription("Overwritten values from: -1");
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        timeSeries1.setMaximumItemCount(0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10.0f + "'", comparable6, 10.0f);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.fireSeriesChanged();
        java.util.List list14 = timeSeries1.data;
        int int15 = timeSeries1.getItemCount();
        boolean boolean16 = timeSeries1.getNotify();
        timeSeries1.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod18, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        boolean boolean8 = timeSeries5.equals((java.lang.Object) 100.0d);
        timeSeries5.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        timeSeries12.setNotify(true);
        boolean boolean16 = timeSeries5.equals((java.lang.Object) timeSeries12);
        timeSeries5.removeAgedItems((long) '#', true);
        java.lang.Class class20 = timeSeries5.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, "Overwritten values from: 10.0", "hi!", class20);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(class20);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        java.lang.Comparable comparable5 = timeSeries4.getKey();
        timeSeries4.removeAgedItems((long) 2147483647, false);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener10);
        int int12 = timeSeries4.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int15 = timeSeries14.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        timeSeries17.setNotify(true);
        java.lang.Class class21 = timeSeries17.timePeriodClass;
        java.lang.Comparable comparable22 = timeSeries17.getKey();
        boolean boolean23 = timeSeries14.equals((java.lang.Object) timeSeries17);
        timeSeries17.removeAgedItems((long) 1, true);
        timeSeries17.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries4.addAndOrUpdate(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries31.setRangeDescription("Value");
        java.lang.String str34 = timeSeries31.getDescription();
        java.lang.Comparable comparable35 = timeSeries31.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries31.addChangeListener(seriesChangeListener36);
        java.util.Collection collection38 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries31.add(timeSeriesDataItem39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 1 + "'", comparable5, (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 10.0f + "'", comparable22, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10.0f + "'", comparable35, 10.0f);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        boolean boolean6 = timeSeries1.getNotify();
        java.lang.String str7 = timeSeries1.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod8, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        timeSeries1.setNotify(true);
        timeSeries1.fireSeriesChanged();
        timeSeries1.setDescription("Time");
        boolean boolean15 = timeSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.createCopy((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        int int2 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod3, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        boolean boolean7 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setNotify(true);
        java.lang.Class<?> wildcardClass10 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass10);
        java.util.List list12 = timeSeries11.getItems();
        java.lang.Class class13 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries15.fireSeriesChanged();
        timeSeries15.removeAgedItems(false);
        timeSeries15.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries11.addAndOrUpdate(timeSeries15);
        timeSeries15.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries26 = timeSeries15.createCopy(regularTimePeriod24, regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        timeSeries1.removeAgedItems(false);
        java.lang.Comparable comparable12 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int15 = timeSeries14.getMaximumItemCount();
        timeSeries14.clear();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        java.util.List list20 = timeSeries18.getItems();
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries14.addAndOrUpdate(timeSeries18);
        java.util.Collection collection22 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.lang.Class<?> wildcardClass23 = timeSeries14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) -1 + "'", comparable12, (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        java.lang.String str11 = timeSeries1.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        java.util.List list8 = timeSeries7.getItems();
        java.lang.Class class9 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class9);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "", "Overwritten values from: 10.0", class9);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener6);
        java.lang.Comparable comparable8 = timeSeries2.getKey();
        boolean boolean9 = timeSeries2.isEmpty();
        timeSeries2.setKey((java.lang.Comparable) 10);
        timeSeries2.setMaximumItemCount(0);
        java.lang.Class<?> wildcardClass14 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod16, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0f + "'", comparable8, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        timeSeries7.setKey((java.lang.Comparable) 9223372036854775807L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries7.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        timeSeries4.removeAgedItems((long) 1, true);
        timeSeries4.setNotify(false);
        timeSeries4.clear();
        java.lang.String str17 = timeSeries4.getDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean4 = timeSeries3.getNotify();
        int int5 = timeSeries3.getMaximumItemCount();
        java.util.List list6 = timeSeries3.data;
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', class9);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, class9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries11.removeChangeListener(seriesChangeListener12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries11.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean6 = timeSeries5.getNotify();
        int int7 = timeSeries5.getMaximumItemCount();
        java.util.List list8 = timeSeries5.data;
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries5.createCopy((int) '4', (int) (short) 100);
        long long12 = timeSeries5.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        boolean boolean18 = timeSeries5.equals((java.lang.Object) seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries20.setRangeDescription("Value");
        boolean boolean23 = timeSeries20.getNotify();
        timeSeries20.setDomainDescription("Time");
        timeSeries20.clear();
        java.lang.Class class27 = timeSeries20.timePeriodClass;
        timeSeries5.timePeriodClass = class27;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "Value", "", class27);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", class27);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries30.removeChangeListener(seriesChangeListener31);
        timeSeries30.removeAgedItems(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(class27);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        boolean boolean10 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        java.util.List list14 = timeSeries12.data;
        timeSeries1.data = list14;
        timeSeries1.removeAgedItems(false);
        java.lang.String str18 = timeSeries1.getDescription();
        java.lang.String str19 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        int int6 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        java.lang.Comparable comparable15 = timeSeries1.getKey();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0f + "'", comparable15, 10.0f);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        long long7 = timeSeries5.getMaximumItemAge();
        java.lang.Class class8 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "", class8);
        timeSeries10.removeAgedItems((long) '#', false);
        timeSeries10.fireSeriesChanged();
        timeSeries10.setMaximumItemAge(0L);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        java.util.List list6 = timeSeries1.data;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        int int8 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = timeSeries1.getIndex(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        int int8 = timeSeries6.getMaximumItemCount();
        java.util.List list9 = timeSeries6.data;
        boolean boolean10 = timeSeries6.getNotify();
        java.util.Collection collection11 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        timeSeries13.setNotify(true);
        java.lang.Class class17 = timeSeries13.timePeriodClass;
        java.lang.Comparable comparable18 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries6.addAndOrUpdate(timeSeries13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod20, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10.0f + "'", comparable18, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries19);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.fireSeriesChanged();
        java.util.List list14 = timeSeries1.data;
        int int15 = timeSeries1.getItemCount();
        boolean boolean16 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries1.createCopy((int) (byte) 1, (int) 'a');
        java.util.List list20 = timeSeries1.data;
        timeSeries1.setRangeDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries1.removeChangeListener(seriesChangeListener23);
        int int25 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        java.util.List list8 = timeSeries6.getItems();
        timeSeries1.data = list8;
        java.lang.Class class10 = timeSeries1.timePeriodClass;
        timeSeries1.setMaximumItemCount(1);
        int int13 = timeSeries1.getItemCount();
        boolean boolean14 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries1.addOrUpdate(regularTimePeriod15, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.util.List list8 = timeSeries7.getItems();
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        java.lang.Object obj10 = null;
        boolean boolean11 = timeSeries7.equals(obj10);
        timeSeries7.removeAgedItems(true);
        timeSeries7.setMaximumItemCount(2147483647);
        java.lang.String str16 = timeSeries7.getRangeDescription();
        java.util.Collection collection17 = timeSeries7.getTimePeriods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) -1 + "'", comparable9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        boolean boolean8 = timeSeries5.equals((java.lang.Object) 100.0d);
        timeSeries5.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        timeSeries12.setNotify(true);
        boolean boolean16 = timeSeries5.equals((java.lang.Object) timeSeries12);
        timeSeries5.fireSeriesChanged();
        java.util.List list18 = timeSeries5.getItems();
        boolean boolean19 = timeSeries1.equals((java.lang.Object) list18);
        java.lang.String str20 = timeSeries1.getDescription();
        int int21 = timeSeries1.getItemCount();
        timeSeries1.setMaximumItemAge((long) (byte) 100);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        boolean boolean5 = timeSeries2.equals((java.lang.Object) 100.0d);
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.setNotify(true);
        boolean boolean13 = timeSeries2.equals((java.lang.Object) timeSeries9);
        timeSeries2.removeAgedItems((long) '#', true);
        java.lang.Class class17 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class17);
        java.lang.String str19 = timeSeries18.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries18.getDataItem((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        boolean boolean11 = timeSeries4.isEmpty();
        java.lang.String str12 = timeSeries4.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries4.addChangeListener(seriesChangeListener13);
        java.lang.String str15 = timeSeries4.getRangeDescription();
        java.lang.Class<?> wildcardClass16 = timeSeries4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        timeSeries1.setDomainDescription("Time");
        timeSeries1.setDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries7.setMaximumItemAge((long) (short) 10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries7.removeChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = timeSeries7.getKey();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Overwritten values from: 1" + "'", comparable12, "Overwritten values from: 1");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        boolean boolean9 = timeSeries6.equals((java.lang.Object) 100.0d);
        timeSeries6.setNotify(true);
        java.lang.Class<?> wildcardClass12 = timeSeries6.getClass();
        timeSeries1.timePeriodClass = wildcardClass12;
        timeSeries1.setKey((java.lang.Comparable) 100L);
        long long16 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setKey((java.lang.Comparable) 0.0d);
        boolean boolean7 = timeSeries1.getNotify();
        java.util.List list8 = timeSeries1.data;
        int int9 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.createCopy(regularTimePeriod10, regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.removeAgedItems(false);
        timeSeries1.setDescription("Time");
        int int8 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries10.getRangeDescription();
        boolean boolean15 = timeSeries10.isEmpty();
        java.util.Collection collection16 = timeSeries10.getTimePeriods();
        boolean boolean17 = timeSeries10.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener18);
        java.lang.String str20 = timeSeries10.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class23 = timeSeries22.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries22.addChangeListener(seriesChangeListener24);
        java.lang.String str26 = timeSeries22.getRangeDescription();
        boolean boolean27 = timeSeries22.isEmpty();
        java.util.Collection collection28 = timeSeries22.getTimePeriods();
        boolean boolean29 = timeSeries22.isEmpty();
        java.util.Collection collection30 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries10.addChangeListener(seriesChangeListener31);
        java.util.Collection collection33 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Value" + "'", str26, "Value");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        boolean boolean14 = timeSeries11.equals((java.lang.Object) 100.0d);
        timeSeries11.setNotify(true);
        java.lang.Class<?> wildcardClass17 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        boolean boolean24 = timeSeries21.equals((java.lang.Object) 100.0d);
        timeSeries21.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries21.addChangeListener(seriesChangeListener27);
        boolean boolean29 = timeSeries19.equals((java.lang.Object) timeSeries21);
        int int30 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries1.addAndOrUpdate(timeSeries21);
        java.lang.String str32 = timeSeries31.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int34 = timeSeries31.getIndex(regularTimePeriod33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Time" + "'", str32, "Time");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemCount((int) (byte) 1);
        long long10 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemAge(100L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate(regularTimePeriod13, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        java.util.List list8 = timeSeries6.getItems();
        timeSeries6.clear();
        timeSeries6.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries12.addChangeListener(seriesChangeListener18);
        java.util.List list20 = timeSeries12.getItems();
        timeSeries6.data = list20;
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.update(regularTimePeriod23, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(true);
        java.lang.String str6 = timeSeries1.getDomainDescription();
        timeSeries1.setRangeDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(0L, false);
        int int7 = timeSeries1.getMaximumItemCount();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        timeSeries1.setDescription("");
        int int15 = timeSeries1.getMaximumItemCount();
        int int16 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setRangeDescription("hi!");
        boolean boolean5 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        java.util.List list11 = timeSeries9.getItems();
        timeSeries9.setDescription("Time");
        timeSeries9.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries9.removePropertyChangeListener(propertyChangeListener16);
        java.util.List list18 = timeSeries9.getItems();
        timeSeries9.setNotify(false);
        boolean boolean21 = timeSeries1.equals((java.lang.Object) timeSeries9);
        timeSeries9.removeAgedItems((long) 1, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries9.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        int int8 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.util.List list11 = timeSeries10.data;
        java.util.List list12 = timeSeries10.getItems();
        timeSeries1.data = list12;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(100, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        boolean boolean9 = timeSeries6.equals((java.lang.Object) 100.0d);
        timeSeries6.setMaximumItemCount((int) ' ');
        java.lang.Class class12 = timeSeries6.getTimePeriodClass();
        java.util.List list13 = timeSeries6.getItems();
        timeSeries1.data = list13;
        timeSeries1.setDomainDescription("");
        timeSeries1.setRangeDescription("Value");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        int int8 = timeSeries4.getItemCount();
        java.lang.String str9 = timeSeries4.getDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean12 = timeSeries11.getNotify();
        timeSeries11.setRangeDescription("hi!");
        boolean boolean15 = timeSeries11.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries4.addAndOrUpdate(timeSeries11);
        int int17 = timeSeries11.getMaximumItemCount();
        timeSeries11.setDomainDescription("Time");
        java.lang.Class class20 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "hi!", class20);
        timeSeries21.fireSeriesChanged();
        timeSeries21.setDescription("Time");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(class20);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), class1);
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener3);
        java.lang.Comparable comparable5 = timeSeries2.getKey();
        java.lang.String str6 = timeSeries2.getDomainDescription();
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (-1L) + "'", comparable5, (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.String str8 = timeSeries1.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, (double) 1.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        timeSeries1.removeAgedItems(false);
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        boolean boolean10 = timeSeries1.getNotify();
        java.lang.String str11 = timeSeries1.getDomainDescription();
        java.util.Collection collection12 = timeSeries1.getTimePeriods();
        timeSeries1.setMaximumItemAge((long) (byte) 10);
        timeSeries1.setMaximumItemCount((int) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries1.addChangeListener(seriesChangeListener17);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        java.util.List list2 = timeSeries1.getItems();
        boolean boolean3 = timeSeries1.getNotify();
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        java.util.List list9 = timeSeries7.getItems();
        timeSeries7.removeAgedItems(true);
        java.lang.String str12 = timeSeries7.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        boolean boolean20 = timeSeries17.equals((java.lang.Object) 100.0d);
        timeSeries17.setNotify(true);
        java.lang.Class class23 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), "hi!", "Overwritten values from: 10", class23);
        boolean boolean25 = timeSeries7.equals((java.lang.Object) class23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "Time", "Value", class23);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Overwritten values from: 10", "Overwritten values from: -1", class23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries27.add(regularTimePeriod28, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        timeSeries6.setRangeDescription("hi!");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        boolean boolean11 = timeSeries6.getNotify();
        java.lang.Class class12 = timeSeries6.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        int int16 = timeSeries14.getMaximumItemCount();
        java.util.List list17 = timeSeries14.data;
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries14.createCopy((int) '4', (int) (short) 100);
        java.util.List list21 = timeSeries20.getItems();
        java.lang.Comparable comparable22 = timeSeries20.getKey();
        java.lang.Object obj23 = null;
        boolean boolean24 = timeSeries20.equals(obj23);
        timeSeries20.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries6.addAndOrUpdate(timeSeries20);
        timeSeries6.fireSeriesChanged();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (byte) -1 + "'", comparable22, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(timeSeries27);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setNotify(true);
        java.lang.Class<?> wildcardClass13 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        boolean boolean20 = timeSeries17.equals((java.lang.Object) 100.0d);
        timeSeries17.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries17.addChangeListener(seriesChangeListener23);
        boolean boolean25 = timeSeries15.equals((java.lang.Object) timeSeries17);
        java.lang.String str26 = timeSeries15.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        boolean boolean31 = timeSeries28.equals((java.lang.Object) 100.0d);
        timeSeries28.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection36 = timeSeries35.getTimePeriods();
        timeSeries35.setNotify(true);
        boolean boolean39 = timeSeries28.equals((java.lang.Object) timeSeries35);
        timeSeries28.removeAgedItems((long) '#', true);
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries15.addAndOrUpdate(timeSeries28);
        timeSeries28.setNotify(false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(timeSeries43);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        java.util.List list7 = timeSeries1.data;
        java.util.List list8 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setKey((java.lang.Comparable) 10);
        timeSeries1.setDomainDescription("hi!");
        java.lang.Class<?> wildcardClass6 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        java.lang.String str5 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        long long7 = timeSeries1.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries7.removeAgedItems(false);
        timeSeries7.setRangeDescription("Overwritten values from: -1");
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean8 = timeSeries7.getNotify();
        int int9 = timeSeries7.getMaximumItemCount();
        java.util.List list10 = timeSeries7.data;
        java.util.Collection collection11 = timeSeries7.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries7);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        boolean boolean17 = timeSeries14.equals((java.lang.Object) 100.0d);
        timeSeries14.setMaximumItemCount((int) ' ');
        java.lang.Class class20 = timeSeries14.getTimePeriodClass();
        timeSeries1.timePeriodClass = class20;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class24 = timeSeries23.timePeriodClass;
        java.util.List list25 = timeSeries23.getItems();
        timeSeries23.setDescription("Time");
        int int28 = timeSeries23.getItemCount();
        java.util.Collection collection29 = timeSeries23.getTimePeriods();
        boolean boolean30 = timeSeries1.equals((java.lang.Object) collection29);
        timeSeries1.setKey((java.lang.Comparable) "");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        boolean boolean14 = timeSeries11.equals((java.lang.Object) 100.0d);
        timeSeries11.setNotify(true);
        java.lang.Class<?> wildcardClass17 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        boolean boolean24 = timeSeries21.equals((java.lang.Object) 100.0d);
        timeSeries21.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries21.addChangeListener(seriesChangeListener27);
        boolean boolean29 = timeSeries19.equals((java.lang.Object) timeSeries21);
        int int30 = timeSeries21.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries1.addAndOrUpdate(timeSeries21);
        java.lang.String str32 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        boolean boolean9 = timeSeries6.equals((java.lang.Object) 100.0d);
        timeSeries6.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        timeSeries13.setNotify(true);
        boolean boolean17 = timeSeries6.equals((java.lang.Object) timeSeries13);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries6.createCopy((int) ' ', (int) '#');
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        java.util.List list22 = timeSeries20.data;
        timeSeries20.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = timeSeries20.getTimePeriod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(list22);
    }
}

