package org.jfree.data.time;

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
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.Class class3 = timeSeries1.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class3);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries1.createCopy((int) ' ', (int) '#');
        int int16 = timeSeries15.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener22);
        java.lang.Class class24 = timeSeries18.getTimePeriodClass();
        timeSeries15.timePeriodClass = class24;
        timeSeries15.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(class24);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        java.lang.Comparable comparable23 = timeSeries15.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod24, (java.lang.Number) 100.0d, false);
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
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + 10.0f + "'", comparable23, 10.0f);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries1.addOrUpdate(regularTimePeriod18, (java.lang.Number) (byte) 10);
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        boolean boolean10 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        int int14 = timeSeries12.getMaximumItemCount();
        java.util.List list15 = timeSeries12.data;
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries12.createCopy((int) '4', (int) (short) 100);
        java.util.Collection collection19 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod20, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        long long4 = timeSeries2.getMaximumItemAge();
        java.lang.Class class5 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class5);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        long long17 = timeSeries15.getMaximumItemAge();
        java.util.Collection collection18 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.clear();
        java.lang.Class<?> wildcardClass20 = timeSeries15.getClass();
        boolean boolean21 = timeSeries6.equals((java.lang.Object) timeSeries15);
        timeSeries15.setRangeDescription("Overwritten values from: 10");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        timeSeries1.addPropertyChangeListener(propertyChangeListener17);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        long long8 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.getDataItem(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        boolean boolean31 = timeSeries1.getNotify();
        java.lang.String str32 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries35 = timeSeries1.createCopy(regularTimePeriod33, regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        timeSeries7.setNotify(true);
        java.lang.Class class11 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class11);
        timeSeries12.setDomainDescription("");
        boolean boolean15 = timeSeries4.equals((java.lang.Object) "");
        boolean boolean16 = timeSeries4.getNotify();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod16, (java.lang.Number) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        boolean boolean11 = timeSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) 'a', (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        java.util.List list20 = timeSeries7.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update(0, (java.lang.Number) 1L);
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
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 9223372036854775807L + "'", comparable15, 9223372036854775807L);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy((int) 'a', 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries1.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        java.lang.Class class12 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Time", "Time", class12);
        java.lang.String str15 = timeSeries14.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.addAndOrUpdate(timeSeries14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = timeSeries16.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.removeChangeListener(seriesChangeListener9);
        java.lang.String str11 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod8, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries7.setMaximumItemCount((int) (short) 0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection24 = timeSeries23.getTimePeriods();
        boolean boolean26 = timeSeries23.equals((java.lang.Object) 100.0d);
        timeSeries23.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection31 = timeSeries30.getTimePeriods();
        timeSeries30.setNotify(true);
        boolean boolean34 = timeSeries23.equals((java.lang.Object) timeSeries30);
        timeSeries23.fireSeriesChanged();
        java.util.List list36 = timeSeries23.data;
        java.lang.Class class37 = timeSeries23.timePeriodClass;
        timeSeries12.timePeriodClass = class37;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem41 = timeSeries12.addOrUpdate(regularTimePeriod39, 100.0d);
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
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(class37);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        java.lang.Comparable comparable5 = timeSeries4.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 1 + "'", comparable5, (short) 1);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        timeSeries8.setDescription("Time");
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.fireSeriesChanged();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod4, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.fireSeriesChanged();
        timeSeries1.removeAgedItems(false);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries1.getValue(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
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
        java.lang.String str22 = timeSeries1.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries1.addOrUpdate(regularTimePeriod17, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries1.getValue(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = timeSeries16.getValue(regularTimePeriod30);
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod17, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        int int5 = timeSeries1.getItemCount();
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.createCopy(regularTimePeriod7, regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        timeSeries1.setMaximumItemCount((int) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate(regularTimePeriod9, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        java.lang.String str8 = timeSeries1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries1.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (short) 0, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.removeAgedItems(false);
        java.lang.Comparable comparable5 = timeSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries1.getDataItem((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (byte) 10 + "'", comparable5, (byte) 10);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.lang.Comparable comparable5 = timeSeries1.getKey();
        java.lang.Class<?> wildcardClass6 = timeSeries1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10.0f + "'", comparable5, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, 0.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        java.util.List list11 = timeSeries9.getItems();
        timeSeries9.setDescription("Time");
        int int14 = timeSeries9.getItemCount();
        java.util.Collection collection15 = timeSeries9.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = timeSeries1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        boolean boolean6 = timeSeries1.equals((java.lang.Object) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.createCopy(regularTimePeriod7, regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        int int8 = timeSeries1.getItemCount();
        boolean boolean9 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class5);
        timeSeries6.removeAgedItems(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.add(timeSeriesDataItem9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
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
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setMaximumItemCount((int) '#');
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Time", "hi!", class8);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries9.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 0 + "'", comparable10, (short) 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        timeSeries4.removeAgedItems((long) 1, true);
        java.lang.String str14 = timeSeries4.getDomainDescription();
        java.lang.Comparable comparable15 = timeSeries4.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries4.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0f + "'", comparable15, 10.0f);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.removeAgedItems(false);
        timeSeries1.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries1.getValue(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setDescription("hi!");
        java.util.Collection collection4 = timeSeries1.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) '#', (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod5, (java.lang.Number) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.lang.Comparable comparable0 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        java.util.List list4 = timeSeries2.getItems();
        timeSeries2.clear();
        timeSeries2.fireSeriesChanged();
        java.lang.String str7 = timeSeries2.getRangeDescription();
        java.lang.Class class8 = timeSeries2.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries(comparable0, class8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
            timeSeries1.add(regularTimePeriod11, (double) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean3 = timeSeries2.getNotify();
        int int4 = timeSeries2.getMaximumItemCount();
        java.util.List list5 = timeSeries2.data;
        timeSeries2.setRangeDescription("hi!");
        java.lang.Class class8 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries9.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        boolean boolean8 = timeSeries1.isEmpty();
        timeSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries1.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        java.util.List list6 = timeSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.removeAgedItems(false);
        timeSeries1.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        timeSeries1.fireSeriesChanged();
        int int9 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries1.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        timeSeries1.setDescription("hi!");
        timeSeries1.setMaximumItemCount((int) (byte) 10);
        timeSeries1.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries1.getTimePeriod(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        boolean boolean31 = timeSeries1.getNotify();
        java.lang.String str32 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod33, (double) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, class6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.add(timeSeriesDataItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.util.List list8 = timeSeries7.getItems();
        java.lang.Class class9 = timeSeries7.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries7.addChangeListener(seriesChangeListener10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries7.removeChangeListener(seriesChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        java.lang.String str10 = timeSeries1.getDomainDescription();
        boolean boolean12 = timeSeries1.equals((java.lang.Object) (-1.0f));
        timeSeries1.setDomainDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        boolean boolean31 = timeSeries1.getNotify();
        java.lang.Comparable comparable32 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 10.0f + "'", comparable32, 10.0f);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(2147483647, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        java.lang.Comparable comparable10 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (byte) -1 + "'", comparable10, (byte) -1);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setMaximumItemCount((int) '#');
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Time", "hi!", class8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod10, (java.lang.Number) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setRangeDescription("hi!");
        timeSeries1.setDomainDescription("Value");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries1.addOrUpdate(regularTimePeriod15, (java.lang.Number) (byte) 0);
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.lang.Comparable comparable5 = timeSeries1.getKey();
        boolean boolean6 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries1.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10.0f + "'", comparable5, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.lang.String str18 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        boolean boolean10 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        int int14 = timeSeries12.getMaximumItemCount();
        java.util.List list15 = timeSeries12.data;
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries12.createCopy((int) '4', (int) (short) 100);
        java.util.Collection collection19 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries12.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.Class class3 = timeSeries1.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class3);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        java.lang.Class<?> wildcardClass19 = collection18.getClass();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setNotify(true);
        java.lang.Class<?> wildcardClass13 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass13);
        timeSeries15.setDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.createCopy((int) (short) 10, (int) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries15.createCopy(regularTimePeriod21, regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(timeSeries20);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries12.getDataItem(regularTimePeriod24);
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        boolean boolean5 = timeSeries1.isEmpty();
        timeSeries1.setKey((java.lang.Comparable) 1L);
        java.lang.String str8 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class class2 = timeSeries1.getTimePeriodClass();
        int int3 = timeSeries1.getItemCount();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
            timeSeries7.delete(regularTimePeriod13);
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        java.lang.String str15 = timeSeries1.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries1.addOrUpdate(regularTimePeriod16, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.Class class4 = timeSeries1.timePeriodClass;
        boolean boolean5 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod6, (java.lang.Number) (-1.0d));
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(true);
        int int6 = timeSeries1.getItemCount();
        java.util.List list7 = timeSeries1.data;
        int int8 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.getDataItem(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries1.addOrUpdate(regularTimePeriod16, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        boolean boolean6 = timeSeries1.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        boolean boolean14 = timeSeries11.equals((java.lang.Object) 100.0d);
        timeSeries11.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        timeSeries18.setNotify(true);
        boolean boolean22 = timeSeries11.equals((java.lang.Object) timeSeries18);
        timeSeries11.fireSeriesChanged();
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        boolean boolean25 = timeSeries1.equals((java.lang.Object) timeSeries11);
        timeSeries1.setMaximumItemCount((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        java.util.List list38 = timeSeries6.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = timeSeries6.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, (double) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (short) 1, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        timeSeries7.setDescription("Time");
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class6);
        timeSeries8.setMaximumItemAge((long) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries8.getDataItem(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class9);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Value", "Value", class9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.createCopy((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        boolean boolean5 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) '#', (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.String str8 = timeSeries1.getDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.fireSeriesChanged();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setRangeDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        java.lang.String str9 = timeSeries1.getDomainDescription();
        timeSeries1.removeAgedItems((long) (short) -1, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate(regularTimePeriod13, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        timeSeries4.setDescription("Value");
        java.util.List list7 = timeSeries4.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.update(regularTimePeriod8, (java.lang.Number) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L);
        java.util.List list2 = timeSeries1.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.getDataItem(regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(regularTimePeriod15, (java.lang.Number) (byte) 0);
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        timeSeries6.setRangeDescription("hi!");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        java.lang.Class class11 = timeSeries1.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries1.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        long long7 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (java.lang.Number) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.fireSeriesChanged();
        timeSeries1.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.addOrUpdate(regularTimePeriod8, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        int int31 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = timeSeries1.getNextTimePeriod();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries2.setRangeDescription("Value");
        boolean boolean5 = timeSeries2.getNotify();
        timeSeries2.setDomainDescription("Time");
        timeSeries2.clear();
        java.lang.Class class9 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, class9);
        timeSeries10.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries10.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries1.addOrUpdate(regularTimePeriod4, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        int int21 = timeSeries18.getItemCount();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        java.lang.Class<?> wildcardClass4 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        java.lang.Comparable comparable15 = timeSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10.0f + "'", comparable15, 10.0f);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        timeSeries1.removeAgedItems(false);
        long long12 = timeSeries1.getMaximumItemAge();
        java.lang.Class class13 = timeSeries1.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        timeSeries1.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries1.addOrUpdate(regularTimePeriod12, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        long long20 = timeSeries19.getMaximumItemAge();
        timeSeries19.setNotify(true);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9223372036854775807L + "'", long20 == 9223372036854775807L);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries7.setMaximumItemCount((int) (short) 0);
        java.util.List list10 = timeSeries7.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod11, (java.lang.Number) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        java.lang.Number number27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(regularTimePeriod26, number27, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem16, true);
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.addChangeListener(seriesChangeListener10);
        timeSeries1.setKey((java.lang.Comparable) 0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod14, (java.lang.Number) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.fireSeriesChanged();
        java.lang.String str3 = timeSeries1.getRangeDescription();
        java.lang.Comparable comparable4 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries1.getDataItem(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 10 + "'", comparable4, (byte) 10);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries1.getValue(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
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
            timeSeries6.update((int) (short) -1, (java.lang.Number) 10.0d);
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(true);
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        boolean boolean11 = timeSeries8.equals((java.lang.Object) 100.0d);
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        int int13 = timeSeries8.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod14, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.update((int) '#', (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setKey((java.lang.Comparable) 1.0f);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.addOrUpdate(regularTimePeriod6, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        timeSeries11.setNotify(true);
        java.lang.Class class15 = timeSeries11.timePeriodClass;
        java.lang.Comparable comparable16 = timeSeries11.getKey();
        timeSeries11.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class class21 = timeSeries20.getTimePeriodClass();
        timeSeries11.timePeriodClass = class21;
        java.lang.String str23 = timeSeries11.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries1.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.update(regularTimePeriod25, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 10.0f + "'", comparable16, 10.0f);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Time" + "'", str23, "Time");
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        timeSeries7.setNotify(true);
        java.lang.Class class11 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class11);
        timeSeries12.setDomainDescription("");
        boolean boolean15 = timeSeries4.equals((java.lang.Object) "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod16, (double) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        int int26 = timeSeries25.getItemCount();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        java.util.List list11 = timeSeries9.getItems();
        timeSeries9.setDescription("Time");
        int int14 = timeSeries9.getItemCount();
        java.util.Collection collection15 = timeSeries9.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection25 = timeSeries24.getTimePeriods();
        boolean boolean27 = timeSeries24.equals((java.lang.Object) 100.0d);
        timeSeries24.setNotify(true);
        java.lang.Class<?> wildcardClass30 = timeSeries24.getClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass30);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass30);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection35 = timeSeries34.getTimePeriods();
        boolean boolean37 = timeSeries34.equals((java.lang.Object) 100.0d);
        timeSeries34.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries34.addChangeListener(seriesChangeListener40);
        boolean boolean42 = timeSeries32.equals((java.lang.Object) timeSeries34);
        boolean boolean43 = timeSeries1.equals((java.lang.Object) boolean42);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem44, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setMaximumItemCount((int) '#');
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 10", "", "Overwritten values from: 10", class8);
        java.lang.Class<?> wildcardClass10 = timeSeries9.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        boolean boolean9 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems((long) '4', true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries1.getValue(regularTimePeriod13);
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
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        boolean boolean4 = timeSeries1.getNotify();
        timeSeries1.setDomainDescription("Time");
        timeSeries1.clear();
        java.lang.Class class8 = timeSeries1.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, (java.lang.Number) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class9);
        timeSeries10.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries1.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        java.util.Collection collection13 = timeSeries6.getTimePeriods();
        timeSeries6.setMaximumItemCount(100);
        java.util.Collection collection16 = timeSeries6.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries6.getDataItem(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries1.createCopy(regularTimePeriod21, regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(timeSeriesDataItem26, true);
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
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(true);
        timeSeries1.setDomainDescription("Value");
        timeSeries1.removeAgedItems(true);
        long long10 = timeSeries1.getMaximumItemAge();
        java.lang.String str11 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(32, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries25.setRangeDescription("Value");
        java.lang.String str28 = timeSeries25.getDescription();
        java.util.List list29 = timeSeries25.data;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean32 = timeSeries31.getNotify();
        int int33 = timeSeries31.getMaximumItemCount();
        java.util.List list34 = timeSeries31.data;
        java.util.Collection collection35 = timeSeries31.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries25.addAndOrUpdate(timeSeries31);
        timeSeries31.fireSeriesChanged();
        java.util.Collection collection38 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number40 = timeSeries19.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        timeSeries1.setDescription("hi!");
        java.lang.Comparable comparable10 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0f + "'", comparable10, 10.0f);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) (-1.0d));
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10.0f + "'", comparable6, 10.0f);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(100);
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, (java.lang.Number) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setNotify(true);
        java.lang.Class<?> wildcardClass13 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, (java.lang.Class) wildcardClass13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries17.getValue(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.update(regularTimePeriod26, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        timeSeries1.setNotify(true);
        java.lang.Comparable comparable12 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries1.getDataItem(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0f + "'", comparable12, 10.0f);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        java.lang.String str17 = timeSeries13.getRangeDescription();
        boolean boolean18 = timeSeries13.isEmpty();
        java.util.Collection collection19 = timeSeries13.getTimePeriods();
        boolean boolean20 = timeSeries13.isEmpty();
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries24 = timeSeries1.createCopy(regularTimePeriod22, regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setMaximumItemCount((int) '#');
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 10", "", "Overwritten values from: 10", class8);
        timeSeries9.setDomainDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.setMaximumItemAge((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        java.lang.String str6 = timeSeries1.getDomainDescription();
        timeSeries1.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.add(regularTimePeriod24, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.delete(regularTimePeriod19);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.Class class4 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        java.util.List list8 = timeSeries6.data;
        timeSeries1.data = list8;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries8.addPropertyChangeListener(propertyChangeListener13);
        int int15 = timeSeries8.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries23.removeChangeListener(seriesChangeListener24);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries23.getNextTimePeriod();
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
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries1.getDataItem((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        boolean boolean15 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod16, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        timeSeries1.setDescription("Value");
        timeSeries1.setRangeDescription("Value");
        timeSeries1.fireSeriesChanged();
        java.lang.Class<?> wildcardClass20 = timeSeries1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        java.lang.String str9 = timeSeries1.getDomainDescription();
        java.lang.String str10 = timeSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries1.addChangeListener(seriesChangeListener11);
        timeSeries1.removeAgedItems(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "", "Value", class6);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.update((int) (short) 0, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        java.util.List list7 = timeSeries2.getItems();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean10 = timeSeries9.getNotify();
        timeSeries9.setMaximumItemCount(0);
        timeSeries9.setKey((java.lang.Comparable) 0.0d);
        boolean boolean15 = timeSeries2.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class19);
        timeSeries20.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries9.addAndOrUpdate(timeSeries20);
        int int24 = timeSeries20.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries26.setRangeDescription("Value");
        java.lang.String str29 = timeSeries26.getDescription();
        java.util.List list30 = timeSeries26.data;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean33 = timeSeries32.getNotify();
        int int34 = timeSeries32.getMaximumItemCount();
        java.util.List list35 = timeSeries32.data;
        java.util.Collection collection36 = timeSeries32.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries26.addAndOrUpdate(timeSeries32);
        timeSeries32.fireSeriesChanged();
        java.util.Collection collection39 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        java.lang.Class class40 = timeSeries20.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, class40);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries41.add(regularTimePeriod42, (double) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(class40);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.lang.String str6 = timeSeries1.getDomainDescription();
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener2);
        timeSeries1.setKey((java.lang.Comparable) '4');
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        java.lang.String str10 = timeSeries1.getDomainDescription();
        java.util.Collection collection11 = timeSeries1.getTimePeriods();
        java.util.List list12 = timeSeries1.data;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        int int6 = timeSeries1.getItemCount();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (short) -1, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setRangeDescription("hi!");
        boolean boolean5 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries7.setRangeDescription("Value");
        java.lang.String str10 = timeSeries7.getDescription();
        java.util.List list11 = timeSeries7.data;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean14 = timeSeries13.getNotify();
        int int15 = timeSeries13.getMaximumItemCount();
        java.util.List list16 = timeSeries13.data;
        java.util.Collection collection17 = timeSeries13.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries7.addAndOrUpdate(timeSeries13);
        timeSeries13.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable21 = timeSeries13.getKey();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection24 = timeSeries23.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection27 = timeSeries26.getTimePeriods();
        boolean boolean29 = timeSeries26.equals((java.lang.Object) 100.0d);
        timeSeries26.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection34 = timeSeries33.getTimePeriods();
        timeSeries33.setNotify(true);
        boolean boolean37 = timeSeries26.equals((java.lang.Object) timeSeries33);
        timeSeries26.fireSeriesChanged();
        java.util.Collection collection39 = timeSeries23.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.util.Collection collection40 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        boolean boolean41 = timeSeries1.equals((java.lang.Object) timeSeries13);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem43 = timeSeries13.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 9223372036854775807L + "'", comparable21, 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
            timeSeries6.delete((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        timeSeries1.fireSeriesChanged();
        timeSeries1.removeAgedItems((long) (byte) 100, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries1.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        boolean boolean10 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        int int14 = timeSeries12.getMaximumItemCount();
        java.util.List list15 = timeSeries12.data;
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries12.createCopy((int) '4', (int) (short) 100);
        java.util.Collection collection19 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = timeSeries1.getIndex(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener2);
        timeSeries1.removeAgedItems((long) (short) 100, true);
        long long7 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        java.util.List list7 = timeSeries1.data;
        java.util.List list8 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate(regularTimePeriod9, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        int int26 = timeSeries15.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod27, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setKey((java.lang.Comparable) 0.0d);
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        java.lang.String str8 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener15);
        java.lang.String str17 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.util.List list8 = timeSeries7.getItems();
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries7.getDataItem(regularTimePeriod10);
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
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        timeSeries1.setKey((java.lang.Comparable) 100);
        timeSeries1.setMaximumItemAge((long) (short) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeSeries1.getIndex(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        timeSeries1.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (byte) 100, 2147483647);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        timeSeries1.setMaximumItemCount(1);
        timeSeries1.setMaximumItemAge(0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        boolean boolean5 = timeSeries1.isEmpty();
        timeSeries1.setKey((java.lang.Comparable) 1L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        boolean boolean7 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setNotify(true);
        java.lang.Class<?> wildcardClass10 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries11.addOrUpdate(regularTimePeriod12, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries1.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.addOrUpdate(regularTimePeriod7, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        long long2 = timeSeries1.getMaximumItemAge();
        java.lang.String str3 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Time" + "'", str3, "Time");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        boolean boolean7 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setNotify(true);
        java.lang.Class<?> wildcardClass10 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass10);
        java.lang.String str12 = timeSeries11.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod13, (java.lang.Number) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        timeSeries4.removeAgedItems((long) 1, true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries4.getNextTimePeriod();
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
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        timeSeries22.setDescription("hi!");
        int int28 = timeSeries22.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = timeSeries22.getTimePeriod((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        timeSeries4.setDescription("Value");
        java.util.List list7 = timeSeries4.getItems();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.setNotify(true);
        java.lang.Class class13 = timeSeries9.timePeriodClass;
        java.lang.Comparable comparable14 = timeSeries9.getKey();
        timeSeries9.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean19 = timeSeries18.getNotify();
        timeSeries18.setMaximumItemCount(0);
        timeSeries18.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries24.setRangeDescription("Value");
        java.lang.String str27 = timeSeries24.getDescription();
        java.lang.Comparable comparable28 = timeSeries24.getKey();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries18.addAndOrUpdate(timeSeries24);
        java.util.List list30 = timeSeries24.data;
        timeSeries9.data = list30;
        timeSeries4.data = list30;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod33, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 10.0f + "'", comparable14, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + 10.0f + "'", comparable28, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
            timeSeries1.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.lang.String str6 = timeSeries1.getDomainDescription();
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
            java.lang.Object obj12 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = timeSeries12.getTimePeriod(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        timeSeries1.removeAgedItems((long) (byte) 100, true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        long long23 = timeSeries21.getMaximumItemAge();
        java.lang.Class class24 = timeSeries21.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class24);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "", class24);
        timeSeries7.timePeriodClass = class24;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) -1 + "'", comparable9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class24);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(32, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (double) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        long long14 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries1.createCopy(regularTimePeriod15, regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.util.List list8 = timeSeries7.getItems();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        boolean boolean13 = timeSeries10.equals((java.lang.Object) 100.0d);
        timeSeries10.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        timeSeries17.setNotify(true);
        boolean boolean21 = timeSeries10.equals((java.lang.Object) timeSeries17);
        timeSeries10.fireSeriesChanged();
        java.util.List list23 = timeSeries10.data;
        timeSeries7.data = list23;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update((int) '#', (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        timeSeries1.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.Class class4 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        java.util.List list8 = timeSeries6.data;
        timeSeries1.data = list8;
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy(regularTimePeriod12, regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate(regularTimePeriod9, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        timeSeries1.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod10, (java.lang.Number) (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        long long31 = timeSeries6.getMaximumItemAge();
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
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        java.lang.String str18 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.delete(regularTimePeriod40);
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
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, 0.0d);
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
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod17, 100.0d, true);
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
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        long long2 = timeSeries1.getMaximumItemAge();
        boolean boolean3 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = timeSeries1.getIndex(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean3 = timeSeries2.getNotify();
        int int4 = timeSeries2.getMaximumItemCount();
        java.util.List list5 = timeSeries2.data;
        timeSeries2.setRangeDescription("hi!");
        java.lang.Class class8 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', class8);
        timeSeries9.removeAgedItems(true);
        int int12 = timeSeries9.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod13, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.delete(regularTimePeriod29);
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.setDescription("");
        timeSeries1.fireSeriesChanged();
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        timeSeries1.removeAgedItems((long) (byte) 0, false);
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
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        int int2 = timeSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = timeSeries1.getTimePeriod((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.update(regularTimePeriod22, (java.lang.Number) 10.0f);
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        java.util.List list8 = timeSeries6.getItems();
        timeSeries1.data = list8;
        timeSeries1.setMaximumItemCount((int) 'a');
        timeSeries1.setDomainDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries1.getTimePeriod((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        timeSeries4.setDescription("Value");
        java.util.List list7 = timeSeries4.getItems();
        java.lang.Class<?> wildcardClass8 = list7.getClass();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries1.getDataItem(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        java.lang.Comparable comparable17 = timeSeries8.getKey();
        timeSeries8.setNotify(false);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 10.0f + "'", comparable17, 10.0f);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        java.lang.String str10 = timeSeries1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries1.addChangeListener(seriesChangeListener11);
        timeSeries1.setMaximumItemAge(100L);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        java.lang.Comparable comparable8 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0f + "'", comparable8, 10.0f);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
            timeSeries7.delete(regularTimePeriod13);
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete(100, (int) (short) 0);
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.String str10 = timeSeries6.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeSeries6.getIndex(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        timeSeries1.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.update(regularTimePeriod10, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries1.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        boolean boolean15 = timeSeries1.getNotify();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.Class class10 = timeSeries6.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeSeries6.getIndex(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod13, (java.lang.Number) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        java.lang.Comparable comparable5 = timeSeries4.getKey();
        timeSeries4.removeAgedItems((long) 2147483647, false);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        timeSeries4.setDescription("Overwritten values from: 10");
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 1 + "'", comparable5, (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.fireSeriesChanged();
        timeSeries1.setNotify(false);
        long long8 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy(regularTimePeriod9, regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        java.lang.String str31 = timeSeries23.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.add(regularTimePeriod32, 0.0d, true);
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        boolean boolean4 = timeSeries1.getNotify();
        timeSeries1.setDomainDescription("Time");
        timeSeries1.clear();
        java.lang.Class class8 = timeSeries1.timePeriodClass;
        java.lang.Class class9 = timeSeries1.getTimePeriodClass();
        java.lang.String str10 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        timeSeries1.setDescription("Value");
        timeSeries1.setRangeDescription("Value");
        timeSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = timeSeries1.clone();
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
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries6.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ');
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        java.lang.Comparable comparable17 = timeSeries8.getKey();
        java.util.List list18 = timeSeries8.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete(regularTimePeriod19);
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
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + 10.0f + "'", comparable17, 10.0f);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        timeSeries1.fireSeriesChanged();
        int int9 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        java.util.List list8 = timeSeries6.getItems();
        timeSeries1.data = list8;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries1.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        int int6 = timeSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries1.getValue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        boolean boolean5 = timeSeries1.getNotify();
        java.util.List list6 = timeSeries1.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries1.getValue(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        timeSeries1.setMaximumItemCount((int) '4');
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries1.removeChangeListener(seriesChangeListener11);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        timeSeries7.setMaximumItemAge((long) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries26 = timeSeries7.createCopy(regularTimePeriod24, regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 1 + "'", comparable19, (short) 1);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        boolean boolean5 = timeSeries1.isEmpty();
        timeSeries1.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
            java.lang.Number number15 = timeSeries7.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(100);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy(0, 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, (java.lang.Number) 100.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        java.util.List list8 = timeSeries6.getItems();
        timeSeries1.data = list8;
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        long long4 = timeSeries2.getMaximumItemAge();
        java.lang.Class class5 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class5);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        long long17 = timeSeries15.getMaximumItemAge();
        java.util.Collection collection18 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        timeSeries15.clear();
        java.lang.Class<?> wildcardClass20 = timeSeries15.getClass();
        boolean boolean21 = timeSeries6.equals((java.lang.Object) timeSeries15);
        timeSeries15.fireSeriesChanged();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.lang.Comparable comparable5 = timeSeries1.getKey();
        boolean boolean6 = timeSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + 10.0f + "'", comparable5, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        timeSeries16.clear();
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
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        boolean boolean11 = timeSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries7.addAndOrUpdate(timeSeries9);
        timeSeries9.setKey((java.lang.Comparable) "Time");
        java.lang.String str13 = timeSeries9.getDescription();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        boolean boolean18 = timeSeries15.equals((java.lang.Object) 100.0d);
        timeSeries15.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection23 = timeSeries22.getTimePeriods();
        timeSeries22.setNotify(true);
        boolean boolean26 = timeSeries15.equals((java.lang.Object) timeSeries22);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries15.createCopy((int) ' ', (int) '#');
        int int30 = timeSeries29.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class33 = timeSeries32.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries32.addChangeListener(seriesChangeListener34);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries32.removePropertyChangeListener(propertyChangeListener36);
        java.lang.Class class38 = timeSeries32.getTimePeriodClass();
        timeSeries29.timePeriodClass = class38;
        timeSeries9.timePeriodClass = class38;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Value", "Value", class38);
        timeSeries41.setKey((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(class38);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class3);
        java.util.List list5 = timeSeries4.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries4.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(0L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        java.lang.String str20 = timeSeries1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries1.addChangeListener(seriesChangeListener21);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        java.lang.Class class29 = timeSeries25.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries25.removeChangeListener(seriesChangeListener30);
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
        org.junit.Assert.assertNotNull(class29);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean7 = timeSeries2.isEmpty();
        java.util.Collection collection8 = timeSeries2.getTimePeriods();
        boolean boolean9 = timeSeries2.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener10);
        timeSeries2.setRangeDescription("Value");
        timeSeries2.clear();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        timeSeries18.setNotify(true);
        java.lang.Class class22 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class22);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class22);
        timeSeries2.timePeriodClass = class22;
        java.lang.Class<?> wildcardClass26 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, (java.lang.Class) wildcardClass26);
        timeSeries27.setDomainDescription("Time");
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(timeSeriesDataItem26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        timeSeries5.setNotify(true);
        java.lang.Class class9 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class9);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Time", "Time", class9);
        java.lang.String str12 = timeSeries11.getDomainDescription();
        java.lang.String str13 = timeSeries11.getDescription();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        timeSeries15.setNotify(true);
        java.lang.Class class19 = timeSeries15.timePeriodClass;
        java.lang.Comparable comparable20 = timeSeries15.getKey();
        timeSeries15.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean25 = timeSeries24.getNotify();
        timeSeries24.setMaximumItemCount(0);
        timeSeries24.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries30.setRangeDescription("Value");
        java.lang.String str33 = timeSeries30.getDescription();
        java.lang.Comparable comparable34 = timeSeries30.getKey();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries24.addAndOrUpdate(timeSeries30);
        java.util.List list36 = timeSeries30.data;
        timeSeries15.data = list36;
        timeSeries11.data = list36;
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 10.0f + "'", comparable20, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + 10.0f + "'", comparable34, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        long long6 = timeSeries1.getMaximumItemAge();
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        int int31 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries1.getDataItem(regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.add(regularTimePeriod21, (java.lang.Number) 10.0f, false);
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
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (short) 1 + "'", comparable19, (short) 1);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class5);
        timeSeries6.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries6.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.setRangeDescription("hi!");
        int int4 = timeSeries1.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries1.addChangeListener(seriesChangeListener5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        java.util.List list8 = timeSeries6.getItems();
        timeSeries1.data = list8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries1.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        java.util.List list8 = timeSeries1.data;
        timeSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        java.lang.Comparable comparable5 = timeSeries4.getKey();
        timeSeries4.removeAgedItems((long) 2147483647, false);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener10);
        int int12 = timeSeries4.getMaximumItemCount();
        timeSeries4.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries4.getDataItem(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 1 + "'", comparable5, (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        java.util.List list8 = timeSeries6.getItems();
        timeSeries1.data = list8;
        java.lang.Class class10 = timeSeries1.timePeriodClass;
        timeSeries1.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod19, (java.lang.Number) (short) 100, false);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries1.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        timeSeries1.setKey((java.lang.Comparable) "Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) -1 + "'", comparable12, (byte) -1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.lang.Class class1 = null;
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, class1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries5 = timeSeries2.createCopy(regularTimePeriod3, regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.delete(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        timeSeries1.removeAgedItems(true);
        boolean boolean10 = timeSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.Class class10 = timeSeries6.timePeriodClass;
        timeSeries6.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries6.addOrUpdate(regularTimePeriod12, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = timeSeries16.addOrUpdate(regularTimePeriod29, (java.lang.Number) 2147483647);
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(100);
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod10, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod12, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.clear();
        timeSeries1.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.util.List list8 = timeSeries7.getItems();
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        java.lang.Object obj10 = null;
        boolean boolean11 = timeSeries7.equals(obj10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries7.getDataItem(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) -1 + "'", comparable9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        java.util.List list9 = timeSeries1.getItems();
        java.lang.Class class10 = timeSeries1.getTimePeriodClass();
        long long11 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.add(regularTimePeriod23, (java.lang.Number) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries21.addPropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries26 = timeSeries21.createCopy(regularTimePeriod24, regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.setRangeDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries1.addOrUpdate(regularTimePeriod4, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries25.setRangeDescription("Value");
        java.lang.String str28 = timeSeries25.getDescription();
        java.util.List list29 = timeSeries25.data;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean32 = timeSeries31.getNotify();
        int int33 = timeSeries31.getMaximumItemCount();
        java.util.List list34 = timeSeries31.data;
        java.util.Collection collection35 = timeSeries31.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries25.addAndOrUpdate(timeSeries31);
        timeSeries31.fireSeriesChanged();
        java.util.Collection collection38 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries31.addChangeListener(seriesChangeListener39);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        timeSeries1.removeAgedItems(100L, false);
        java.util.Collection collection8 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        timeSeries10.setNotify(true);
        java.lang.Class class14 = timeSeries10.timePeriodClass;
        java.util.List list15 = timeSeries10.getItems();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean18 = timeSeries17.getNotify();
        timeSeries17.setMaximumItemCount(0);
        timeSeries17.setKey((java.lang.Comparable) 0.0d);
        boolean boolean23 = timeSeries10.equals((java.lang.Object) timeSeries17);
        boolean boolean24 = timeSeries1.equals((java.lang.Object) timeSeries10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries1.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        timeSeries1.setDescription("Overwritten values from: 10");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeSeries1.getIndex(regularTimePeriod18);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setKey((java.lang.Comparable) 0.0d);
        boolean boolean7 = timeSeries1.getNotify();
        java.util.List list8 = timeSeries1.data;
        int int9 = timeSeries1.getItemCount();
        timeSeries1.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries1.getTimePeriod((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timeSeries1.getNotify();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setRangeDescription("hi!");
        boolean boolean5 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemCount(10);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class15);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, class15);
        timeSeries1.timePeriodClass = class15;
        java.lang.String str20 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        timeSeries1.setMaximumItemCount(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        timeSeries1.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        java.lang.Comparable comparable8 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, (java.lang.Number) (-1.0d), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0f + "'", comparable8, 10.0f);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod23, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        timeSeries1.setMaximumItemCount(32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod24, (java.lang.Number) (byte) 0);
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
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(class20);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = timeSeries1.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
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
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        timeSeries7.setNotify(true);
        java.lang.Class class11 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class11);
        timeSeries12.setDomainDescription("");
        boolean boolean15 = timeSeries4.equals((java.lang.Object) "");
        timeSeries4.setKey((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        timeSeries7.setDomainDescription("");
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        timeSeries19.setNotify(true);
        boolean boolean23 = timeSeries12.equals((java.lang.Object) timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries12.createCopy((int) ' ', (int) '#');
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries28.setRangeDescription("Value");
        java.lang.String str31 = timeSeries28.getDescription();
        java.lang.Comparable comparable32 = timeSeries28.getKey();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection35 = timeSeries34.getTimePeriods();
        boolean boolean37 = timeSeries34.equals((java.lang.Object) 100.0d);
        timeSeries34.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries34.addChangeListener(seriesChangeListener40);
        java.util.List list42 = timeSeries34.getItems();
        timeSeries28.data = list42;
        timeSeries26.data = list42;
        java.lang.String str45 = timeSeries26.getRangeDescription();
        boolean boolean46 = timeSeries7.equals((java.lang.Object) timeSeries26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod47 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod47, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 0 + "'", comparable10, (short) 0);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 10.0f + "'", comparable32, 10.0f);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Value" + "'", str45, "Value");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        timeSeries6.setNotify(true);
        java.lang.Class class10 = timeSeries6.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class10);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "hi!", "Value", class10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy(regularTimePeriod14, regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        timeSeries1.removeAgedItems((long) (byte) 100, true);
        timeSeries1.setRangeDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries1.getTimePeriod((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class3);
        int int5 = timeSeries4.getItemCount();
        timeSeries4.setMaximumItemAge(9223372036854775807L);
        timeSeries4.setRangeDescription("Time");
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class class2 = timeSeries1.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        int int31 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        java.util.List list8 = timeSeries7.data;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries7.getTimePeriod((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        java.lang.Class class17 = timeSeries9.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries9.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(class17);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.addAndOrUpdate(timeSeries14);
        timeSeries14.setKey((java.lang.Comparable) "Time");
        java.lang.String str18 = timeSeries14.getDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        boolean boolean23 = timeSeries20.equals((java.lang.Object) 100.0d);
        timeSeries20.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection28 = timeSeries27.getTimePeriods();
        timeSeries27.setNotify(true);
        boolean boolean31 = timeSeries20.equals((java.lang.Object) timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries20.createCopy((int) ' ', (int) '#');
        int int35 = timeSeries34.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class38 = timeSeries37.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries37.addChangeListener(seriesChangeListener39);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries37.removePropertyChangeListener(propertyChangeListener41);
        java.lang.Class class43 = timeSeries37.getTimePeriodClass();
        timeSeries34.timePeriodClass = class43;
        timeSeries14.timePeriodClass = class43;
        java.util.List list46 = timeSeries14.data;
        timeSeries1.data = list46;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod48, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(class43);
        org.junit.Assert.assertNotNull(list46);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries1.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        timeSeries1.removeAgedItems(true);
        java.util.List list8 = timeSeries1.data;
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setRangeDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod11);
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setRangeDescription("Time");
        int int5 = timeSeries1.getItemCount();
        boolean boolean6 = timeSeries1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        timeSeries1.removeAgedItems(true);
        java.util.Collection collection8 = timeSeries1.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        timeSeries22.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable30 = timeSeries22.getKey();
        timeSeries22.setKey((java.lang.Comparable) (byte) 0);
        java.util.Collection collection33 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod34, (java.lang.Number) 10.0d);
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + 9223372036854775807L + "'", comparable30, 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries1.getDataItem(regularTimePeriod13);
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener6);
        timeSeries1.removeAgedItems(false);
        java.util.List list10 = timeSeries1.data;
        boolean boolean11 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        java.util.List list2 = timeSeries1.getItems();
        java.lang.Class class3 = timeSeries1.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy(regularTimePeriod4, regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(class3);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        boolean boolean31 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries1.getDataItem(regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        long long7 = timeSeries5.getMaximumItemAge();
        java.lang.Class class8 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "", class8);
        timeSeries10.clear();
        timeSeries10.removeAgedItems((long) (-1), true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        java.lang.String str10 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable4 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod5, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) -1 + "'", comparable4, (byte) -1);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        timeSeries1.fireSeriesChanged();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(true);
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        boolean boolean11 = timeSeries8.equals((java.lang.Object) 100.0d);
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        boolean boolean7 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setNotify(true);
        java.lang.Class<?> wildcardClass10 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass10);
        java.util.List list12 = timeSeries11.getItems();
        java.lang.Class class13 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries11.createCopy(regularTimePeriod14, regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        timeSeries6.setRangeDescription("hi!");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        boolean boolean11 = timeSeries6.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.delete((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries28 = timeSeries18.createCopy(regularTimePeriod26, regularTimePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries7.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        java.lang.Comparable comparable22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.setKey(comparable22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        timeSeries1.setMaximumItemCount(32);
        java.lang.String str24 = timeSeries1.getRangeDescription();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        timeSeries1.removeAgedItems(false);
        long long12 = timeSeries1.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries1.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9223372036854775807L + "'", long12 == 9223372036854775807L);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries7.addOrUpdate(regularTimePeriod26, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = timeSeries22.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        int int26 = timeSeries15.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries7.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries1.addOrUpdate(regularTimePeriod15, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        java.lang.String str9 = timeSeries1.getDomainDescription();
        java.lang.String str10 = timeSeries1.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries1.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.delete((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
            java.lang.Number number21 = timeSeries7.getValue((int) (short) 0);
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
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 9223372036854775807L + "'", comparable15, 9223372036854775807L);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.util.List list8 = timeSeries7.getItems();
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        java.lang.Number number13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.update(regularTimePeriod12, number13);
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
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class3);
        int int5 = timeSeries4.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        timeSeries7.setNotify(true);
        int int11 = timeSeries7.getItemCount();
        java.lang.String str12 = timeSeries7.getDescription();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        timeSeries14.setRangeDescription("hi!");
        boolean boolean18 = timeSeries14.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries7.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries4.addAndOrUpdate(timeSeries14);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = timeSeries20.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries20);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.Class class4 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class4);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        timeSeries1.setDescription("");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeSeries1.getIndex(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class3);
        int int5 = timeSeries4.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener6);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        timeSeries1.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeSeries1.getIndex(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        boolean boolean5 = timeSeries1.getNotify();
        java.util.List list6 = timeSeries1.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        java.lang.String str6 = timeSeries1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (byte) 100, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        timeSeries1.fireSeriesChanged();
        int int9 = timeSeries1.getItemCount();
        java.lang.Class class10 = timeSeries1.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries1.getTimePeriod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.setDescription("");
        java.util.Collection collection6 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.fireSeriesChanged();
        java.lang.String str3 = timeSeries1.getRangeDescription();
        java.lang.Comparable comparable4 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 10 + "'", comparable4, (byte) 10);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class3);
        int int5 = timeSeries4.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        timeSeries7.setNotify(true);
        int int11 = timeSeries7.getItemCount();
        java.lang.String str12 = timeSeries7.getDescription();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        timeSeries14.setRangeDescription("hi!");
        boolean boolean18 = timeSeries14.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries7.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries4.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.add(regularTimePeriod21, (java.lang.Number) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(timeSeries20);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        java.util.List list10 = timeSeries1.getItems();
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        boolean boolean11 = timeSeries4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries4.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        java.util.List list10 = timeSeries1.getItems();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate(regularTimePeriod13, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.removeChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        timeSeries12.setMaximumItemCount(0);
        timeSeries12.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries18.setRangeDescription("Value");
        java.lang.String str21 = timeSeries18.getDescription();
        java.lang.Comparable comparable22 = timeSeries18.getKey();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries12.addAndOrUpdate(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class27 = timeSeries26.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class27);
        timeSeries28.setDescription("Value");
        java.util.List list31 = timeSeries28.getItems();
        timeSeries23.data = list31;
        timeSeries7.data = list31;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem34, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + 10.0f + "'", comparable22, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        java.lang.String str13 = timeSeries1.getDescription();
        timeSeries1.setKey((java.lang.Comparable) (-1L));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.createCopy(regularTimePeriod16, regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
            int int20 = timeSeries8.getIndex(regularTimePeriod19);
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
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        java.lang.String str9 = timeSeries1.getDomainDescription();
        timeSeries1.removeAgedItems((long) 100, true);
        timeSeries1.setDescription("Overwritten values from: 10");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod13, (java.lang.Number) (-1L), true);
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number29 = timeSeries1.getValue(regularTimePeriod28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
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
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        boolean boolean5 = timeSeries1.isEmpty();
        timeSeries1.setKey((java.lang.Comparable) 1L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (java.lang.Number) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        timeSeries1.removeAgedItems(true);
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
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getDescription();
        timeSeries1.setNotify(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries4.addOrUpdate(regularTimePeriod16, (double) '4');
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
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries12.addOrUpdate(regularTimePeriod22, (java.lang.Number) (-1.0f));
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
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        java.lang.Class<?> wildcardClass21 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        timeSeries12.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(timeSeriesDataItem14);
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        int int9 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries12.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        boolean boolean6 = timeSeries1.equals((java.lang.Object) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        boolean boolean14 = timeSeries11.equals((java.lang.Object) 100.0d);
        timeSeries11.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        timeSeries18.setNotify(true);
        boolean boolean22 = timeSeries11.equals((java.lang.Object) timeSeries18);
        timeSeries11.fireSeriesChanged();
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        boolean boolean25 = timeSeries1.equals((java.lang.Object) timeSeries11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod26, (java.lang.Number) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
            timeSeries6.delete(regularTimePeriod23);
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
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        java.lang.Comparable comparable5 = timeSeries4.getKey();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(regularTimePeriod7, (java.lang.Number) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 1 + "'", comparable5, (short) 1);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.addChangeListener(seriesChangeListener2);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod4, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        timeSeries20.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.add(regularTimePeriod24, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        timeSeries1.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.getDataItem(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean4 = timeSeries3.getNotify();
        int int5 = timeSeries3.getMaximumItemCount();
        java.util.List list6 = timeSeries3.data;
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class9 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', class9);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, class9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(regularTimePeriod12, (java.lang.Number) 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        java.util.Collection collection5 = timeSeries1.getTimePeriods();
        java.lang.String str6 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.createCopy((int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.update(regularTimePeriod23, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        java.lang.Class<?> wildcardClass16 = timeSeries7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) -1 + "'", comparable9, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries8.addChangeListener(seriesChangeListener16);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
            java.lang.Number number17 = timeSeries15.getValue(regularTimePeriod16);
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
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries1.createCopy((int) ' ', (int) '#');
        int int16 = timeSeries15.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener22);
        java.lang.Class class24 = timeSeries18.getTimePeriodClass();
        timeSeries15.timePeriodClass = class24;
        timeSeries15.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod27, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(class24);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class9);
        timeSeries10.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries10);
        java.lang.Class<?> wildcardClass14 = timeSeries10.getClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.data;
        java.lang.Class<?> wildcardClass4 = list3.getClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setMaximumItemCount((int) '#');
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 10", "", "Overwritten values from: 10", class8);
        timeSeries9.setDomainDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries9.addOrUpdate(regularTimePeriod12, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean5 = timeSeries4.getNotify();
        int int6 = timeSeries4.getMaximumItemCount();
        java.util.List list7 = timeSeries4.data;
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries4.createCopy((int) '4', (int) (short) 100);
        long long11 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        boolean boolean17 = timeSeries4.equals((java.lang.Object) seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries19.setRangeDescription("Value");
        boolean boolean22 = timeSeries19.getNotify();
        timeSeries19.setDomainDescription("Time");
        timeSeries19.clear();
        java.lang.Class class26 = timeSeries19.timePeriodClass;
        timeSeries4.timePeriodClass = class26;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "Value", "", class26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = timeSeries28.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(class26);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        timeSeries7.removeAgedItems((long) (short) 1, false);
        boolean boolean19 = timeSeries7.equals((java.lang.Object) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries7.addOrUpdate(regularTimePeriod20, (double) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        long long9 = timeSeries1.getMaximumItemAge();
        boolean boolean10 = timeSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries1.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        timeSeries13.setKey((java.lang.Comparable) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries13.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        java.lang.String str19 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(0, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.addChangeListener(seriesChangeListener10);
        timeSeries1.setKey((java.lang.Comparable) 0L);
        timeSeries1.setMaximumItemCount(0);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries1.addChangeListener(seriesChangeListener18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        boolean boolean14 = timeSeries1.getNotify();
        java.lang.String str15 = timeSeries1.getDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        boolean boolean5 = timeSeries1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        timeSeries1.setMaximumItemCount((int) '4');
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        timeSeries12.setNotify(true);
        int int16 = timeSeries12.getItemCount();
        java.lang.String str17 = timeSeries12.getDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean20 = timeSeries19.getNotify();
        timeSeries19.setRangeDescription("hi!");
        boolean boolean23 = timeSeries19.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries12.addAndOrUpdate(timeSeries19);
        int int25 = timeSeries19.getMaximumItemCount();
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
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries19.addAndOrUpdate(timeSeries27);
        boolean boolean40 = timeSeries1.equals((java.lang.Object) timeSeries39);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = timeSeries39.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries12.addAndOrUpdate(timeSeries14);
        timeSeries14.setKey((java.lang.Comparable) "Time");
        java.lang.String str18 = timeSeries14.getDescription();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        boolean boolean23 = timeSeries20.equals((java.lang.Object) 100.0d);
        timeSeries20.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection28 = timeSeries27.getTimePeriods();
        timeSeries27.setNotify(true);
        boolean boolean31 = timeSeries20.equals((java.lang.Object) timeSeries27);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries20.createCopy((int) ' ', (int) '#');
        int int35 = timeSeries34.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class38 = timeSeries37.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries37.addChangeListener(seriesChangeListener39);
        java.beans.PropertyChangeListener propertyChangeListener41 = null;
        timeSeries37.removePropertyChangeListener(propertyChangeListener41);
        java.lang.Class class43 = timeSeries37.getTimePeriodClass();
        timeSeries34.timePeriodClass = class43;
        timeSeries14.timePeriodClass = class43;
        java.util.List list46 = timeSeries14.data;
        timeSeries1.data = list46;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean50 = timeSeries49.getNotify();
        java.util.List list51 = timeSeries49.getItems();
        timeSeries1.data = list51;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries55 = timeSeries1.createCopy(regularTimePeriod53, regularTimePeriod54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(class43);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(list51);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        java.lang.String str20 = timeSeries15.getDescription();
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        boolean boolean19 = timeSeries16.equals((java.lang.Object) 100.0d);
        timeSeries16.setMaximumItemCount((int) ' ');
        java.lang.Class<?> wildcardClass22 = timeSeries16.getClass();
        timeSeries4.timePeriodClass = wildcardClass22;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = timeSeries4.getIndex(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 1 + "'", comparable5, (short) 1);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        timeSeries15.setNotify(true);
        int int19 = timeSeries15.getItemCount();
        java.lang.Class class20 = timeSeries15.getTimePeriodClass();
        timeSeries7.timePeriodClass = class20;
        java.util.List list22 = timeSeries7.getItems();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        timeSeries1.setMaximumItemAge(0L);
        timeSeries1.setMaximumItemCount(100);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        java.lang.String str6 = timeSeries1.getDomainDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy(regularTimePeriod8, regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries7.getDataItem(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
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
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        boolean boolean10 = timeSeries1.getNotify();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.delete((int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod18, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        java.util.List list22 = timeSeries1.getItems();
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
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getDescription();
        timeSeries1.setNotify(true);
        int int9 = timeSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.addChangeListener(seriesChangeListener10);
        timeSeries1.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod14, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        timeSeries1.setMaximumItemCount(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.removeChangeListener(seriesChangeListener9);
        timeSeries1.removeAgedItems((long) 10, false);
        java.lang.Class<?> wildcardClass14 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10.0f + "'", comparable6, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        long long8 = timeSeries1.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = timeSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries4.getDataItem(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        java.util.List list10 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
            timeSeries8.add(regularTimePeriod19, (double) 100);
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
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(class26);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class5);
        timeSeries6.setMaximumItemCount((int) '4');
        timeSeries6.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries6.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.add(regularTimePeriod12, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(100);
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class class2 = timeSeries1.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        boolean boolean5 = timeSeries1.isEmpty();
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        int int10 = timeSeries8.getMaximumItemCount();
        java.util.List list11 = timeSeries8.data;
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean14 = timeSeries13.getNotify();
        int int15 = timeSeries13.getMaximumItemCount();
        java.util.List list16 = timeSeries13.data;
        boolean boolean17 = timeSeries13.getNotify();
        java.util.Collection collection18 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        timeSeries8.setDescription("");
        java.lang.String str21 = timeSeries8.getDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries8.createCopy((int) (short) 10, 32);
        boolean boolean25 = timeSeries1.equals((java.lang.Object) 32);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod26, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        java.lang.String str9 = timeSeries1.getDomainDescription();
        java.lang.String str10 = timeSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries1.addChangeListener(seriesChangeListener11);
        timeSeries1.removeAgedItems(false);
        timeSeries1.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.addAndOrUpdate(timeSeries17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(100);
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.addOrUpdate(regularTimePeriod7, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        java.util.List list8 = timeSeries6.getItems();
        timeSeries1.data = list8;
        timeSeries1.setMaximumItemCount((int) 'a');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries1.addChangeListener(seriesChangeListener12);
        timeSeries1.removeAgedItems((long) (short) 1, false);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.delete(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries15.addOrUpdate(regularTimePeriod25, (java.lang.Number) 10L);
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        java.lang.String str10 = timeSeries6.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeSeries6.getIndex(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.setRangeDescription("hi!");
        int int4 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = timeSeries1.getIndex(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
            timeSeries7.add(regularTimePeriod11, (double) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
            int int34 = timeSeries1.getIndex(regularTimePeriod33);
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean3 = timeSeries2.getNotify();
        int int4 = timeSeries2.getMaximumItemCount();
        java.util.List list5 = timeSeries2.data;
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries2.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries2.removeChangeListener(seriesChangeListener9);
        timeSeries2.removeAgedItems(false);
        long long13 = timeSeries2.getMaximumItemAge();
        java.lang.Class class14 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = timeSeries15.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class14);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean3 = timeSeries2.getNotify();
        int int4 = timeSeries2.getMaximumItemCount();
        java.util.List list5 = timeSeries2.data;
        timeSeries2.setRangeDescription("hi!");
        java.lang.Class class8 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class8);
        boolean boolean10 = timeSeries9.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod11, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        java.lang.Class class10 = timeSeries1.timePeriodClass;
        boolean boolean11 = timeSeries1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        timeSeries1.removeAgedItems((long) (byte) 100, true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener11);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries8.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.addChangeListener(seriesChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries1.addOrUpdate(regularTimePeriod12, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries29 = timeSeries1.createCopy(regularTimePeriod27, regularTimePeriod28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(class23);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        boolean boolean31 = timeSeries28.equals((java.lang.Object) 100.0d);
        timeSeries28.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection36 = timeSeries35.getTimePeriods();
        timeSeries35.setNotify(true);
        boolean boolean39 = timeSeries28.equals((java.lang.Object) timeSeries35);
        timeSeries28.removeAgedItems((long) '#', true);
        java.lang.Class class43 = timeSeries28.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class43);
        boolean boolean45 = timeSeries15.equals((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(class43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class class2 = timeSeries1.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        timeSeries1.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timeSeries1.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean5 = timeSeries4.getNotify();
        int int6 = timeSeries4.getMaximumItemCount();
        java.util.List list7 = timeSeries4.data;
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries4.createCopy((int) '4', (int) (short) 100);
        long long11 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        boolean boolean17 = timeSeries4.equals((java.lang.Object) seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries19.setRangeDescription("Value");
        boolean boolean22 = timeSeries19.getNotify();
        timeSeries19.setDomainDescription("Time");
        timeSeries19.clear();
        java.lang.Class class26 = timeSeries19.timePeriodClass;
        timeSeries4.timePeriodClass = class26;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "Value", "", class26);
        timeSeries28.setMaximumItemCount(2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = timeSeries28.getIndex(regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(class26);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        timeSeries1.setDescription("hi!");
        java.lang.Comparable comparable10 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries1.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0f + "'", comparable10, 10.0f);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        timeSeries7.setMaximumItemAge(100L);
        timeSeries7.setDescription("");
        int int43 = timeSeries7.getMaximumItemCount();
        java.lang.Class<?> wildcardClass44 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass44);
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems((long) 2147483647, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries1.addChangeListener(seriesChangeListener11);
        timeSeries1.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setKey((java.lang.Comparable) 0.0d);
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        java.lang.String str8 = timeSeries1.getDescription();
        java.lang.Class<?> wildcardClass9 = timeSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy((int) (byte) -1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        java.util.List list11 = timeSeries9.getItems();
        timeSeries9.setDescription("Time");
        timeSeries9.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries9.removePropertyChangeListener(propertyChangeListener16);
        boolean boolean18 = timeSeries9.getNotify();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        java.util.List list22 = timeSeries20.data;
        timeSeries9.data = list22;
        timeSeries1.data = list22;
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener25);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        boolean boolean17 = timeSeries8.getNotify();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        boolean boolean7 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setNotify(true);
        java.lang.Class<?> wildcardClass10 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass10);
        java.util.List list12 = timeSeries11.getItems();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.delete(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int6 = timeSeries5.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        java.lang.Class class12 = timeSeries8.timePeriodClass;
        java.lang.Comparable comparable13 = timeSeries8.getKey();
        boolean boolean14 = timeSeries5.equals((java.lang.Object) timeSeries8);
        timeSeries5.fireSeriesChanged();
        java.lang.Class<?> wildcardClass16 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, "", "Value", (java.lang.Class) wildcardClass16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass16);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10.0f + "'", comparable13, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        timeSeries1.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.getDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.delete((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries1.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class27 = timeSeries26.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class27);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "", "Value", class27);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        timeSeries13.timePeriodClass = class30;
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
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(class30);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        java.util.List list10 = timeSeries8.getItems();
        timeSeries8.setDescription("Time");
        java.lang.Comparable comparable13 = timeSeries8.getKey();
        timeSeries8.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        boolean boolean20 = timeSeries17.equals((java.lang.Object) 100.0d);
        timeSeries17.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection25 = timeSeries24.getTimePeriods();
        timeSeries24.setNotify(true);
        boolean boolean28 = timeSeries17.equals((java.lang.Object) timeSeries24);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries17.createCopy((int) ' ', (int) '#');
        java.util.List list32 = timeSeries17.getItems();
        timeSeries8.data = list32;
        timeSeries1.data = list32;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + 10.0f + "'", comparable13, 10.0f);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d);
        int int2 = timeSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        timeSeries1.setMaximumItemCount(32);
        java.util.Collection collection24 = timeSeries1.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries1.removeChangeListener(seriesChangeListener25);
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
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        timeSeries1.fireSeriesChanged();
        boolean boolean9 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        timeSeries1.fireSeriesChanged();
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        java.util.List list26 = timeSeries24.getItems();
        timeSeries24.setDescription("Time");
        timeSeries24.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries24.createCopy((int) 'a', 2147483647);
        java.util.List list34 = timeSeries33.getItems();
        timeSeries20.data = list34;
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
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
            org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = timeSeries11.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setKey((java.lang.Comparable) 10);
        timeSeries1.setKey((java.lang.Comparable) 100);
        timeSeries1.clear();
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        boolean boolean5 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        java.lang.Class class24 = timeSeries1.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = timeSeries1.getNextTimePeriod();
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
        org.junit.Assert.assertNotNull(class24);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        timeSeries13.setNotify(true);
        java.lang.Class class17 = timeSeries13.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Time", "Time", class17);
        java.lang.String str20 = timeSeries19.getDomainDescription();
        java.util.Collection collection21 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.Comparable comparable22 = timeSeries4.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries25 = timeSeries4.createCopy(regularTimePeriod23, regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (short) 1 + "'", comparable22, (short) 1);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = timeSeries16.getIndex(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries7.getTimePeriod((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries7.setMaximumItemCount((int) (short) 0);
        java.util.List list10 = timeSeries7.getItems();
        java.lang.Class class11 = timeSeries7.timePeriodClass;
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        int int24 = timeSeries23.getMaximumItemCount();
        java.util.Collection collection25 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int28 = timeSeries27.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection31 = timeSeries30.getTimePeriods();
        timeSeries30.setNotify(true);
        java.lang.Class class34 = timeSeries30.timePeriodClass;
        java.lang.Comparable comparable35 = timeSeries30.getKey();
        boolean boolean36 = timeSeries27.equals((java.lang.Object) timeSeries30);
        timeSeries30.removeAgedItems((long) 1, true);
        timeSeries30.setNotify(false);
        timeSeries30.setMaximumItemAge((long) (short) 1);
        java.util.Collection collection44 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries1.addOrUpdate(regularTimePeriod45, (java.lang.Number) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(class34);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10.0f + "'", comparable35, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(collection44);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy(32, (int) '#');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        boolean boolean4 = timeSeries1.getNotify();
        timeSeries1.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.getDataItem(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy(32, (int) '#');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod11, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 10");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        java.util.List list11 = timeSeries9.getItems();
        timeSeries9.setDescription("Time");
        int int14 = timeSeries9.getItemCount();
        java.util.Collection collection15 = timeSeries9.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.addAndOrUpdate(timeSeries9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries1.removeChangeListener(seriesChangeListener17);
        timeSeries1.clear();
        timeSeries1.setKey((java.lang.Comparable) "Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        java.lang.Class class29 = timeSeries8.timePeriodClass;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(class29);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        timeSeries6.setRangeDescription("hi!");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.createCopy(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        timeSeries1.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries1.getDataItem(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        timeSeries5.setNotify(true);
        java.lang.Class class9 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class9);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Time", "Time", class9);
        java.lang.String str12 = timeSeries11.getDomainDescription();
        java.lang.String str13 = timeSeries11.getDescription();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries11.createCopy((int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(timeSeries16);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        int int31 = timeSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener32);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        boolean boolean8 = timeSeries1.isEmpty();
        boolean boolean9 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setKey((java.lang.Comparable) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries1.getDataItem((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.util.List list6 = timeSeries1.getItems();
        timeSeries1.setKey((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.Class class4 = timeSeries1.timePeriodClass;
        boolean boolean5 = timeSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        timeSeries1.fireSeriesChanged();
        timeSeries1.removeAgedItems((long) (byte) 100, true);
        int int12 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        timeSeries1.setMaximumItemCount(32);
        timeSeries1.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod25, (double) 1L);
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
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(class20);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        java.util.List list8 = timeSeries6.getItems();
        timeSeries1.data = list8;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod10, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = timeSeries16.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
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
    }
}

