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
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        boolean boolean10 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
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
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        java.lang.Class class18 = timeSeries14.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class18);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries20.addChangeListener(seriesChangeListener21);
        int int23 = timeSeries20.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean26 = timeSeries25.getNotify();
        int int27 = timeSeries25.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries25.addPropertyChangeListener(propertyChangeListener28);
        java.util.List list30 = timeSeries25.data;
        timeSeries20.data = list30;
        timeSeries1.data = list30;
        timeSeries1.setDomainDescription("Overwritten values from: 10.0");
        timeSeries1.setRangeDescription("Overwritten values from: 10.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Object obj14 = timeSeries12.clone();
        timeSeries12.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener17);
        java.util.Collection collection19 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        java.lang.Class class20 = timeSeries12.getTimePeriodClass();
        timeSeries12.setMaximumItemCount((int) 'a');
        timeSeries12.setMaximumItemAge((long) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number26 = timeSeries12.getValue(regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(class20);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        int int11 = timeSeries1.getMaximumItemCount();
        timeSeries1.fireSeriesChanged();
        timeSeries1.removeAgedItems((long) 10, false);
        java.lang.Object obj16 = timeSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = timeSeries1.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries10.setNotify(false);
        timeSeries10.removeAgedItems(1L, true);
        timeSeries10.setKey((java.lang.Comparable) 0.0f);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries10.getValue(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (byte) 0, 2147483647);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Comparable comparable14 = timeSeries12.getKey();
        java.util.List list15 = timeSeries12.getItems();
        timeSeries8.data = list15;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries6.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        boolean boolean22 = timeSeries19.equals((java.lang.Object) 100.0d);
        timeSeries19.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection27 = timeSeries26.getTimePeriods();
        timeSeries26.setNotify(true);
        boolean boolean30 = timeSeries19.equals((java.lang.Object) timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class33 = timeSeries32.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries32.addChangeListener(seriesChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class38 = timeSeries37.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries37.addChangeListener(seriesChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries32.addAndOrUpdate(timeSeries37);
        java.util.Collection collection42 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        timeSeries37.clear();
        timeSeries37.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries8.addAndOrUpdate(timeSeries37);
        java.lang.Comparable comparable47 = timeSeries8.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.update((-1), (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 10 + "'", comparable14, (byte) 10);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + (byte) -1 + "'", comparable47, (byte) -1);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        timeSeries1.fireSeriesChanged();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy((int) (byte) 1, (int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy(0, (int) (byte) 100);
        int int15 = timeSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        boolean boolean7 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries4.removeChangeListener(seriesChangeListener10);
        java.lang.String str12 = timeSeries4.getDescription();
        boolean boolean13 = timeSeries4.getNotify();
        java.lang.Class class14 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "hi!", "", class14);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(class14);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        long long8 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        java.lang.Class class15 = timeSeries13.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class15);
        timeSeries1.timePeriodClass = class15;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries1.addOrUpdate(regularTimePeriod18, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        java.lang.String str8 = timeSeries4.getRangeDescription();
        boolean boolean9 = timeSeries4.isEmpty();
        boolean boolean10 = timeSeries4.isEmpty();
        timeSeries4.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        timeSeries4.timePeriodClass = class15;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, "Overwritten values from: 10.0", "Value", class15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries17.addOrUpdate(regularTimePeriod18, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (byte) 0, 2147483647);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Comparable comparable14 = timeSeries12.getKey();
        java.util.List list15 = timeSeries12.getItems();
        timeSeries8.data = list15;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries6.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        java.lang.Class<?> wildcardClass22 = timeSeries20.getClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries17.addAndOrUpdate(timeSeries23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.add(regularTimePeriod25, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 10 + "'", comparable14, (byte) 10);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        boolean boolean10 = timeSeries1.getNotify();
        java.lang.String str11 = timeSeries1.getDomainDescription();
        java.lang.String str12 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        timeSeries1.removeAgedItems((long) 100, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy(1, (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries33 = timeSeries19.createCopy(regularTimePeriod31, regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        timeSeries1.timePeriodClass = class13;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener16);
        long long18 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = timeSeries1.getValue(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        long long8 = timeSeries1.getMaximumItemAge();
        timeSeries1.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class5);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries6.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        int int6 = timeSeries1.getItemCount();
        java.util.List list7 = timeSeries1.data;
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class14);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), class14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, class14);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(timeSeriesDataItem20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue(regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries8.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class23 = timeSeries22.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class23);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int28 = timeSeries27.getMaximumItemCount();
        java.lang.Object obj29 = timeSeries27.clone();
        timeSeries27.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries27.removePropertyChangeListener(propertyChangeListener32);
        java.util.Collection collection34 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        java.lang.Class class35 = timeSeries27.getTimePeriodClass();
        java.util.Collection collection36 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        timeSeries8.removeAgedItems(true);
        java.lang.String str39 = timeSeries8.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod40 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int41 = timeSeries8.getIndex(regularTimePeriod40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value" + "'", str39, "Value");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        java.lang.Class class23 = timeSeries19.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class23);
        timeSeries1.timePeriodClass = class23;
        java.util.Collection collection28 = timeSeries1.getTimePeriods();
        timeSeries1.setDescription("");
        long long31 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries1.addOrUpdate(regularTimePeriod32, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        java.lang.Class class10 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        java.lang.String str17 = timeSeries13.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries11.addAndOrUpdate(timeSeries13);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, class19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "hi!", class19);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(timeSeriesDataItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(class19);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        int int11 = timeSeries1.getMaximumItemCount();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        timeSeries14.setMaximumItemCount(0);
        timeSeries14.setDescription("Time");
        java.lang.Comparable comparable20 = timeSeries14.getKey();
        timeSeries14.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        java.util.List list26 = timeSeries24.getItems();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries24.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection30 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.util.Collection collection31 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) ' ', (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) -1 + "'", comparable20, (byte) -1);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        timeSeries7.setNotify(true);
        java.lang.Class class10 = timeSeries7.timePeriodClass;
        timeSeries7.setKey((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(regularTimePeriod13, (double) (-1), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries10.getRangeDescription();
        timeSeries10.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries6.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.removeAgedItems((long) 1, true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(2147483647, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        int int16 = timeSeries14.getMaximumItemCount();
        java.util.List list17 = timeSeries14.data;
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries14.createCopy((int) '4', (int) (short) 100);
        java.util.Collection collection21 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries14.addChangeListener(seriesChangeListener22);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = timeSeries14.getTimePeriod((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries1.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        java.util.List list13 = timeSeries11.getItems();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries11.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection17 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries16.addOrUpdate(regularTimePeriod18, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class12);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries15.getDataItem(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, (java.lang.Number) 10.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        int int6 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean6 = timeSeries5.getNotify();
        int int7 = timeSeries5.getMaximumItemCount();
        java.util.List list8 = timeSeries5.data;
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries5.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        java.lang.String str17 = timeSeries13.getRangeDescription();
        timeSeries13.fireSeriesChanged();
        java.lang.Class class19 = timeSeries13.getTimePeriodClass();
        timeSeries11.timePeriodClass = class19;
        boolean boolean21 = timeSeries1.equals((java.lang.Object) timeSeries11);
        java.lang.Comparable comparable22 = timeSeries11.getKey();
        java.lang.String str23 = timeSeries11.getDescription();
        java.lang.Class<?> wildcardClass24 = timeSeries11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + (byte) -1 + "'", comparable22, (byte) -1);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean28 = timeSeries27.getNotify();
        java.util.List list29 = timeSeries27.getItems();
        timeSeries19.data = list29;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries33 = timeSeries19.createCopy(regularTimePeriod31, regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean17 = timeSeries16.getNotify();
        int int18 = timeSeries16.getMaximumItemCount();
        timeSeries16.setRangeDescription("hi!");
        java.lang.Class class21 = timeSeries16.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class21);
        timeSeries13.timePeriodClass = class21;
        timeSeries13.setDomainDescription("Time");
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(class21);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.util.List list6 = timeSeries1.data;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        int int4 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries1.getDataItem(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean28 = timeSeries27.getNotify();
        java.util.List list29 = timeSeries27.getItems();
        timeSeries19.data = list29;
        java.lang.Object obj31 = null;
        boolean boolean32 = timeSeries19.equals(obj31);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class36 = timeSeries35.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries35.addChangeListener(seriesChangeListener37);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class41 = timeSeries40.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries40.addChangeListener(seriesChangeListener42);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries35.addAndOrUpdate(timeSeries40);
        java.lang.String str45 = timeSeries44.getDescription();
        java.lang.Class class46 = timeSeries44.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class46);
        timeSeries19.timePeriodClass = class46;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number50 = timeSeries19.getValue(regularTimePeriod49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(class36);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(class46);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy(1, (int) (byte) 100);
        int int29 = timeSeries28.getItemCount();
        timeSeries28.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries13.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries20.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        boolean boolean34 = timeSeries31.equals((java.lang.Object) 100.0d);
        timeSeries31.setMaximumItemAge((long) 'a');
        boolean boolean37 = timeSeries20.equals((java.lang.Object) timeSeries31);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries13.addAndOrUpdate(timeSeries20);
        java.lang.Comparable comparable41 = timeSeries20.getKey();
        timeSeries20.removeAgedItems(100L, false);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + 10.0f + "'", comparable41, 10.0f);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.Class class5 = timeSeries1.getTimePeriodClass();
        timeSeries1.setNotify(false);
        timeSeries1.removeAgedItems((long) ' ', false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = timeSeries1.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 10, (int) '4');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.add(regularTimePeriod7, (double) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (byte) 0, 2147483647);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Comparable comparable14 = timeSeries12.getKey();
        java.util.List list15 = timeSeries12.getItems();
        timeSeries8.data = list15;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries6.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        java.lang.Class<?> wildcardClass22 = timeSeries20.getClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, (java.lang.Class) wildcardClass22);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries17.addAndOrUpdate(timeSeries23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.createCopy(regularTimePeriod25, regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 10 + "'", comparable14, (byte) 10);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod14, (java.lang.Number) 100L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries5.getRangeDescription();
        boolean boolean10 = timeSeries5.isEmpty();
        boolean boolean11 = timeSeries5.isEmpty();
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate(regularTimePeriod13, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.clear();
        java.lang.String str4 = timeSeries1.getDescription();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.lang.Class class22 = timeSeries18.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class22);
        java.lang.Comparable comparable24 = timeSeries23.getKey();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean27 = timeSeries26.getNotify();
        timeSeries26.setMaximumItemCount(0);
        timeSeries26.setDescription("Time");
        timeSeries26.setMaximumItemCount((int) (short) 1);
        java.util.Collection collection34 = timeSeries23.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries9.addAndOrUpdate(timeSeries23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries35.getDataItem(regularTimePeriod36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 10 + "'", comparable24, 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(timeSeries35);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(100, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 10 + "'", comparable6, (byte) 10);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        boolean boolean13 = timeSeries10.equals((java.lang.Object) 100.0d);
        timeSeries10.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries10.removeChangeListener(seriesChangeListener16);
        java.lang.String str18 = timeSeries10.getDescription();
        boolean boolean19 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries1.addAndOrUpdate(timeSeries10);
        boolean boolean21 = timeSeries20.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener15);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries10.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        boolean boolean17 = timeSeries14.equals((java.lang.Object) 100.0d);
        timeSeries14.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        timeSeries21.setNotify(true);
        boolean boolean25 = timeSeries14.equals((java.lang.Object) timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries27.addChangeListener(seriesChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class33 = timeSeries32.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries32.addChangeListener(seriesChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries27.addAndOrUpdate(timeSeries32);
        java.util.Collection collection37 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        timeSeries32.clear();
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries32.createCopy(1, (int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries10.addAndOrUpdate(timeSeries41);
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener43);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean47 = timeSeries46.getNotify();
        int int48 = timeSeries46.getMaximumItemCount();
        java.util.List list49 = timeSeries46.data;
        timeSeries46.setMaximumItemCount((int) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries10.addAndOrUpdate(timeSeries46);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem55 = timeSeries46.addOrUpdate(regularTimePeriod53, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(timeSeries52);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int5 = timeSeries4.getMaximumItemCount();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Object obj7 = timeSeries4.clone();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        timeSeries9.setDomainDescription("");
        boolean boolean13 = timeSeries4.equals((java.lang.Object) timeSeries9);
        int int14 = timeSeries4.getMaximumItemCount();
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean18 = timeSeries17.getNotify();
        timeSeries17.setMaximumItemCount(0);
        timeSeries17.setDescription("Time");
        java.lang.Comparable comparable23 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        java.util.List list29 = timeSeries27.getItems();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection33 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        java.util.Collection collection34 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        timeSeries17.setNotify(true);
        java.lang.Class class37 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "hi!", "Overwritten values from: 10.0", class37);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries38.removePropertyChangeListener(propertyChangeListener39);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) -1 + "'", comparable23, (byte) -1);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(class37);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        timeSeries1.timePeriodClass = class13;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener16);
        timeSeries1.setDescription("hi!");
        java.lang.String str20 = timeSeries1.getDescription();
        java.lang.Class class21 = timeSeries1.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod22, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(class21);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.addChangeListener(seriesChangeListener13);
        java.lang.Class class15 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class15);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "", "", class15);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class15);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries22 = timeSeries19.createCopy((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Object obj14 = timeSeries12.clone();
        timeSeries12.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener17);
        java.util.Collection collection19 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        timeSeries10.setKey((java.lang.Comparable) 9223372036854775807L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number23 = timeSeries10.getValue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class13);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class13);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), class13);
        timeSeries17.clear();
        timeSeries17.clear();
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setKey((java.lang.Comparable) 10L);
        timeSeries1.removeAgedItems(true);
        timeSeries1.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.addOrUpdate(regularTimePeriod9, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy(1, (int) (byte) 100);
        int int29 = timeSeries28.getItemCount();
        timeSeries28.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.update((int) (short) 10, (java.lang.Number) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class12);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.setMaximumItemAge((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        timeSeries10.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries10.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.lang.Class class3 = null;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "hi!", "", class3);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, (java.lang.Number) 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
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
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setKey((java.lang.Comparable) 10L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        java.lang.Number number6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, number6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemAge((long) 'a');
        boolean boolean18 = timeSeries1.equals((java.lang.Object) timeSeries12);
        timeSeries1.removeAgedItems(true);
        timeSeries1.removeAgedItems((long) (short) 10, true);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries5.addAndOrUpdate(timeSeries10);
        java.lang.String str15 = timeSeries14.getDescription();
        java.lang.Class class16 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class16);
        java.util.Collection collection18 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries17.getDataItem(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.update(regularTimePeriod16, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        int int6 = timeSeries1.getItemCount();
        java.util.List list7 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        java.lang.String str10 = timeSeries9.getRangeDescription();
        boolean boolean11 = timeSeries1.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod12, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        boolean boolean13 = timeSeries10.equals((java.lang.Object) 100.0d);
        timeSeries10.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries10.removeChangeListener(seriesChangeListener16);
        java.lang.String str18 = timeSeries10.getDescription();
        boolean boolean19 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries1.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = timeSeries10.getDataItem(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeSeries20);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.String str7 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean10 = timeSeries9.getNotify();
        int int11 = timeSeries9.getMaximumItemCount();
        java.util.List list12 = timeSeries9.data;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries17.addChangeListener(seriesChangeListener19);
        java.lang.Class class21 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class21);
        timeSeries9.timePeriodClass = class21;
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener24);
        timeSeries9.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries1.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener31);
        boolean boolean33 = timeSeries30.getNotify();
        java.lang.String str34 = timeSeries30.getRangeDescription();
        java.util.List list35 = timeSeries30.getItems();
        timeSeries1.data = list35;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = timeSeries1.addOrUpdate(regularTimePeriod37, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(list35);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean3 = timeSeries2.getNotify();
        int int4 = timeSeries2.getMaximumItemCount();
        timeSeries2.setRangeDescription("hi!");
        java.lang.Class class7 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class7);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        boolean boolean8 = timeSeries5.equals((java.lang.Object) 100.0d);
        timeSeries5.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        timeSeries12.setNotify(true);
        boolean boolean16 = timeSeries5.equals((java.lang.Object) timeSeries12);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class24 = timeSeries23.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries23.addChangeListener(seriesChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries18.addAndOrUpdate(timeSeries23);
        java.util.Collection collection28 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        timeSeries23.clear();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean32 = timeSeries31.getNotify();
        java.util.List list33 = timeSeries31.getItems();
        timeSeries23.data = list33;
        java.lang.Object obj35 = null;
        boolean boolean36 = timeSeries23.equals(obj35);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class40 = timeSeries39.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries39.addChangeListener(seriesChangeListener41);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class45 = timeSeries44.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries44.addChangeListener(seriesChangeListener46);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries39.addAndOrUpdate(timeSeries44);
        java.lang.String str49 = timeSeries48.getDescription();
        java.lang.Class class50 = timeSeries48.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class50);
        timeSeries23.timePeriodClass = class50;
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, class50);
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "", "Value", class50);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(class40);
        org.junit.Assert.assertNotNull(class45);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(class50);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries1.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        timeSeries9.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries9.createCopy(0, (int) (byte) 100);
        long long19 = timeSeries9.getMaximumItemAge();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean6 = timeSeries5.getNotify();
        int int7 = timeSeries5.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener8);
        java.util.List list10 = timeSeries5.data;
        timeSeries1.data = list10;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries1.removeChangeListener(seriesChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod14, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = timeSeries1.getDataItem(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "Time", class14);
        timeSeries17.setNotify(true);
        timeSeries17.clear();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener21);
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener23);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Object obj14 = timeSeries12.clone();
        timeSeries12.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener17);
        java.util.Collection collection19 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        boolean boolean20 = timeSeries10.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem21, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, class6);
        java.lang.String str9 = timeSeries8.getDescription();
        boolean boolean10 = timeSeries8.getNotify();
        java.lang.Class<?> wildcardClass11 = timeSeries8.getClass();
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        timeSeries1.setRangeDescription("Time");
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "Time", class14);
        timeSeries17.setNotify(true);
        timeSeries17.clear();
        java.util.List list21 = timeSeries17.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod22, (java.lang.Number) 10.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(list21);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (byte) 0, 2147483647);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Comparable comparable14 = timeSeries12.getKey();
        java.util.List list15 = timeSeries12.getItems();
        timeSeries8.data = list15;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries6.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        boolean boolean22 = timeSeries19.equals((java.lang.Object) 100.0d);
        timeSeries19.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection27 = timeSeries26.getTimePeriods();
        timeSeries26.setNotify(true);
        boolean boolean30 = timeSeries19.equals((java.lang.Object) timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class33 = timeSeries32.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries32.addChangeListener(seriesChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class38 = timeSeries37.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries37.addChangeListener(seriesChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries32.addAndOrUpdate(timeSeries37);
        java.util.Collection collection42 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        timeSeries37.clear();
        timeSeries37.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries8.addAndOrUpdate(timeSeries37);
        boolean boolean47 = timeSeries46.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        timeSeries46.addChangeListener(seriesChangeListener48);
        java.util.List list50 = timeSeries46.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries46.delete(regularTimePeriod51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 10 + "'", comparable14, (byte) 10);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(list50);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(2147483647, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener6);
        timeSeries2.setKey((java.lang.Comparable) "");
        java.lang.Object obj10 = timeSeries2.clone();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries12.addOrUpdate(regularTimePeriod13, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = timeSeries1.data;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries7.createCopy((int) '#', (int) (byte) 100);
        boolean boolean17 = timeSeries7.getNotify();
        java.util.List list18 = timeSeries7.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.delete((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean6 = timeSeries5.getNotify();
        int int7 = timeSeries5.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener8);
        java.util.List list10 = timeSeries5.data;
        timeSeries1.data = list10;
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries9.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        boolean boolean23 = timeSeries20.equals((java.lang.Object) 100.0d);
        timeSeries20.setMaximumItemAge((long) 'a');
        boolean boolean26 = timeSeries9.equals((java.lang.Object) timeSeries20);
        timeSeries9.removeAgedItems(true);
        timeSeries9.fireSeriesChanged();
        java.util.Collection collection30 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        int int31 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = timeSeries1.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        timeSeries1.timePeriodClass = class13;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener16);
        long long18 = timeSeries1.getMaximumItemAge();
        java.lang.String str19 = timeSeries1.getDomainDescription();
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (byte) 0, 2147483647);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Comparable comparable14 = timeSeries12.getKey();
        java.util.List list15 = timeSeries12.getItems();
        timeSeries8.data = list15;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries6.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        boolean boolean22 = timeSeries19.equals((java.lang.Object) 100.0d);
        timeSeries19.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection27 = timeSeries26.getTimePeriods();
        timeSeries26.setNotify(true);
        boolean boolean30 = timeSeries19.equals((java.lang.Object) timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class33 = timeSeries32.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries32.addChangeListener(seriesChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class38 = timeSeries37.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries37.addChangeListener(seriesChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries32.addAndOrUpdate(timeSeries37);
        java.util.Collection collection42 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        timeSeries37.clear();
        timeSeries37.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries8.addAndOrUpdate(timeSeries37);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class52 = timeSeries51.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        timeSeries51.addChangeListener(seriesChangeListener53);
        java.lang.Class class55 = timeSeries51.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class55);
        java.lang.Comparable comparable57 = timeSeries56.getKey();
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean60 = timeSeries59.getNotify();
        int int61 = timeSeries59.getMaximumItemCount();
        java.util.List list62 = timeSeries59.data;
        timeSeries56.data = list62;
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries8.addAndOrUpdate(timeSeries56);
        java.util.List list65 = timeSeries56.data;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 10 + "'", comparable14, (byte) 10);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNotNull(class52);
        org.junit.Assert.assertNotNull(class55);
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + 10 + "'", comparable57, 10);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertNotNull(list65);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        timeSeries1.timePeriodClass = class13;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener16);
        long long18 = timeSeries1.getMaximumItemAge();
        java.lang.String str19 = timeSeries1.getDomainDescription();
        java.lang.Comparable comparable20 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) -1 + "'", comparable20, (byte) -1);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        int int16 = timeSeries14.getMaximumItemCount();
        java.util.List list17 = timeSeries14.data;
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries14.createCopy((int) '4', (int) (short) 100);
        java.util.Collection collection21 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        int int22 = timeSeries14.getItemCount();
        java.lang.Comparable comparable23 = timeSeries14.getKey();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean27 = timeSeries26.getNotify();
        int int28 = timeSeries26.getMaximumItemCount();
        timeSeries26.setRangeDescription("hi!");
        java.lang.Class class31 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class31);
        boolean boolean33 = timeSeries14.equals((java.lang.Object) timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection36 = timeSeries35.getTimePeriods();
        boolean boolean38 = timeSeries35.equals((java.lang.Object) 100.0d);
        timeSeries35.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection43 = timeSeries42.getTimePeriods();
        timeSeries42.setNotify(true);
        boolean boolean46 = timeSeries35.equals((java.lang.Object) timeSeries42);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class49 = timeSeries48.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener50 = null;
        timeSeries48.addChangeListener(seriesChangeListener50);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class54 = timeSeries53.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        timeSeries53.addChangeListener(seriesChangeListener55);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries48.addAndOrUpdate(timeSeries53);
        java.util.Collection collection58 = timeSeries42.getTimePeriodsUniqueToOtherSeries(timeSeries53);
        timeSeries53.clear();
        timeSeries53.setKey((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries32.addAndOrUpdate(timeSeries53);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod63 = null;
        java.lang.Number number64 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries62.add(regularTimePeriod63, number64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) -1 + "'", comparable23, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(class49);
        org.junit.Assert.assertNotNull(class54);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(timeSeries62);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        java.lang.Object obj5 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int8 = timeSeries7.getMaximumItemCount();
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        java.util.List list10 = timeSeries7.getItems();
        timeSeries7.setKey((java.lang.Comparable) 0L);
        java.util.List list13 = timeSeries7.data;
        timeSeries1.data = list13;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = timeSeries1.getValue(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 10 + "'", comparable9, (byte) 10);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list13);
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
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean28 = timeSeries27.getNotify();
        java.util.List list29 = timeSeries27.getItems();
        timeSeries19.data = list29;
        java.lang.Object obj31 = null;
        boolean boolean32 = timeSeries19.equals(obj31);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class36 = timeSeries35.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries35.addChangeListener(seriesChangeListener37);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class41 = timeSeries40.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries40.addChangeListener(seriesChangeListener42);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries35.addAndOrUpdate(timeSeries40);
        java.lang.String str45 = timeSeries44.getDescription();
        java.lang.Class class46 = timeSeries44.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class46);
        timeSeries19.timePeriodClass = class46;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries19.removeChangeListener(seriesChangeListener49);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries19.addChangeListener(seriesChangeListener51);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(class36);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(class46);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean7 = timeSeries2.isEmpty();
        boolean boolean8 = timeSeries2.isEmpty();
        timeSeries2.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        timeSeries2.timePeriodClass = class13;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class13);
        timeSeries15.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(timeSeriesDataItem18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.addChangeListener(seriesChangeListener13);
        java.lang.Class class15 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class15);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "", "", class15);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.update(regularTimePeriod20, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        java.lang.Class class23 = timeSeries19.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class23);
        timeSeries1.timePeriodClass = class23;
        java.util.Collection collection28 = timeSeries1.getTimePeriods();
        timeSeries1.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = timeSeries1.getValue(regularTimePeriod31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        java.util.List list13 = timeSeries11.getItems();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries11.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection17 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        java.lang.Comparable comparable18 = timeSeries16.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.add(timeSeriesDataItem19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10.0f + "'", comparable18, 10.0f);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setRangeDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.getDataItem((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 10 + "'", comparable6, (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setKey((java.lang.Comparable) "");
        java.lang.Object obj9 = timeSeries1.clone();
        java.util.Collection collection10 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener14);
        java.lang.Class class16 = null;
        timeSeries12.timePeriodClass = class16;
        long long18 = timeSeries12.getMaximumItemAge();
        java.util.List list19 = timeSeries12.data;
        boolean boolean20 = timeSeries1.equals((java.lang.Object) list19);
        timeSeries1.setDomainDescription("hi!");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean4 = timeSeries3.getNotify();
        int int5 = timeSeries3.getMaximumItemCount();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, class8);
        boolean boolean11 = timeSeries10.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update((int) (byte) -1, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        timeSeries1.timePeriodClass = class13;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener16);
        long long18 = timeSeries1.getMaximumItemAge();
        java.lang.String str19 = timeSeries1.getDomainDescription();
        java.lang.Comparable comparable20 = timeSeries1.getKey();
        int int21 = timeSeries1.getMaximumItemCount();
        timeSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) -1 + "'", comparable20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries5.addAndOrUpdate(timeSeries10);
        java.lang.Class class15 = timeSeries14.getTimePeriodClass();
        timeSeries1.timePeriodClass = class15;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries1.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries7.addAndOrUpdate(timeSeries12);
        java.lang.Class class17 = timeSeries16.getTimePeriodClass();
        timeSeries1.timePeriodClass = class17;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod19, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(class17);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        java.lang.Comparable comparable11 = timeSeries10.getKey();
        int int12 = timeSeries10.getItemCount();
        timeSeries10.setDomainDescription("Value");
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + '#' + "'", comparable11, '#');
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        java.lang.Class class23 = timeSeries19.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class23);
        timeSeries1.timePeriodClass = class23;
        java.util.Collection collection28 = timeSeries1.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemAge((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries1.setMaximumItemCount(1);
        timeSeries1.setRangeDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class17 = timeSeries16.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries16.addChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class22 = timeSeries21.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries21.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries16.addAndOrUpdate(timeSeries21);
        timeSeries21.setRangeDescription("Overwritten values from: 10.0");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries1.addAndOrUpdate(timeSeries21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeries28.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        timeSeries1.timePeriodClass = class13;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener16);
        long long18 = timeSeries1.getMaximumItemAge();
        java.lang.String str19 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int22 = timeSeries21.getMaximumItemCount();
        int int23 = timeSeries21.getMaximumItemCount();
        java.lang.Object obj24 = timeSeries21.clone();
        timeSeries21.clear();
        java.util.List list26 = timeSeries21.data;
        timeSeries1.data = list26;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod28, (double) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        java.lang.String str6 = timeSeries1.getDescription();
        java.lang.Object obj7 = timeSeries1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        timeSeries9.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int18 = timeSeries17.getMaximumItemCount();
        timeSeries17.setMaximumItemCount((int) '#');
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class24 = timeSeries23.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries23.addChangeListener(seriesChangeListener25);
        java.lang.String str27 = timeSeries23.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries29.addChangeListener(seriesChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class35 = timeSeries34.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries34.addChangeListener(seriesChangeListener36);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries29.addAndOrUpdate(timeSeries34);
        java.lang.Class class39 = timeSeries38.getTimePeriodClass();
        timeSeries23.timePeriodClass = class39;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class39);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean44 = timeSeries43.getNotify();
        int int45 = timeSeries43.getMaximumItemCount();
        java.util.List list46 = timeSeries43.data;
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries43.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class52 = timeSeries51.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        timeSeries51.addChangeListener(seriesChangeListener53);
        java.lang.String str55 = timeSeries51.getRangeDescription();
        timeSeries51.fireSeriesChanged();
        java.lang.Class class57 = timeSeries51.getTimePeriodClass();
        timeSeries49.timePeriodClass = class57;
        timeSeries41.timePeriodClass = class57;
        boolean boolean60 = timeSeries17.equals((java.lang.Object) timeSeries41);
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries9.addAndOrUpdate(timeSeries41);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod62 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number63 = timeSeries61.getValue(regularTimePeriod62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(class39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(class52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Value" + "'", str55, "Value");
        org.junit.Assert.assertNotNull(class57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(timeSeries61);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        boolean boolean5 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries1.getDataItem((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean28 = timeSeries27.getNotify();
        java.util.List list29 = timeSeries27.getItems();
        timeSeries19.data = list29;
        java.lang.Class class31 = timeSeries19.timePeriodClass;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(class31);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries8.setRangeDescription("Value");
        boolean boolean11 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries8.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.delete((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        java.lang.Class class8 = timeSeries6.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.addChangeListener(seriesChangeListener13);
        java.lang.String str15 = timeSeries11.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries9.addAndOrUpdate(timeSeries11);
        java.lang.Class class17 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, class17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class17);
        timeSeries19.setNotify(true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(class17);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.String str12 = timeSeries11.getDescription();
        java.lang.Class class13 = timeSeries11.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class13);
        timeSeries14.clear();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int22 = timeSeries21.getMaximumItemCount();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        java.util.List list24 = timeSeries21.getItems();
        timeSeries17.data = list24;
        boolean boolean26 = timeSeries15.equals((java.lang.Object) timeSeries17);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = timeSeries17.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 10 + "'", comparable23, (byte) 10);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
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
        boolean boolean7 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        timeSeries1.timePeriodClass = class12;
        timeSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries1.addChangeListener(seriesChangeListener16);
        timeSeries1.setMaximumItemAge((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        java.lang.Class class7 = timeSeries5.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class7);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries12 = timeSeries9.createCopy((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Object obj14 = timeSeries12.clone();
        timeSeries12.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener17);
        java.util.Collection collection19 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int22 = timeSeries21.getMaximumItemCount();
        int int23 = timeSeries21.getMaximumItemCount();
        java.lang.Object obj24 = timeSeries21.clone();
        java.util.List list25 = timeSeries21.data;
        timeSeries10.data = list25;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update(0, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(list25);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "", "", class14);
        timeSeries17.setNotify(true);
        java.lang.Comparable comparable20 = timeSeries17.getKey();
        timeSeries17.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.delete(regularTimePeriod23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 100.0d + "'", comparable20, 100.0d);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        timeSeries1.setMaximumItemCount(1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, (java.lang.Number) 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemCount((int) (byte) 1);
        timeSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj3 = timeSeries1.clone();
        timeSeries1.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener6);
        timeSeries1.removeAgedItems(100L, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries1.removeChangeListener(seriesChangeListener13);
        java.lang.String str15 = timeSeries1.getDomainDescription();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries1.getDataItem(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class12);
        java.lang.Comparable comparable16 = timeSeries15.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries15.addChangeListener(seriesChangeListener17);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 100 + "'", comparable16, (short) 100);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.lang.String str3 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
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
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemCount(2147483647);
        timeSeries1.setMaximumItemCount(10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 10, (-1));
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.fireSeriesChanged();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.fireSeriesChanged();
        java.lang.Class class15 = timeSeries9.getTimePeriodClass();
        timeSeries7.timePeriodClass = class15;
        java.lang.Class class17 = timeSeries7.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries7.getDataItem((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class17);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        int int16 = timeSeries14.getMaximumItemCount();
        java.util.List list17 = timeSeries14.data;
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries14.createCopy((int) '4', (int) (short) 100);
        java.util.Collection collection21 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        int int22 = timeSeries14.getItemCount();
        java.lang.Comparable comparable23 = timeSeries14.getKey();
        java.util.Collection collection24 = timeSeries14.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(timeSeriesDataItem25, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) -1 + "'", comparable23, (byte) -1);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        timeSeries7.setNotify(true);
        java.lang.Class class10 = timeSeries7.timePeriodClass;
        timeSeries7.setKey((java.lang.Comparable) (byte) 1);
        timeSeries7.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries7.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class8);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        timeSeries12.setMaximumItemCount(0);
        timeSeries12.setDescription("Time");
        timeSeries12.setMaximumItemCount((int) (short) 1);
        java.util.Collection collection20 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        timeSeries12.removeAgedItems(false);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10 + "'", comparable10, 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        boolean boolean3 = timeSeries1.isEmpty();
        boolean boolean4 = timeSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, class6);
        java.lang.String str9 = timeSeries8.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod10, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (java.lang.Number) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        timeSeries10.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries10.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener15);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener17);
        timeSeries8.setMaximumItemAge((long) 0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.addAndOrUpdate(timeSeries9);
        java.lang.String str14 = timeSeries13.getDescription();
        java.lang.Class class15 = timeSeries13.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries17.addChangeListener(seriesChangeListener19);
        java.lang.String str21 = timeSeries17.getRangeDescription();
        boolean boolean22 = timeSeries17.isEmpty();
        boolean boolean23 = timeSeries17.isEmpty();
        timeSeries17.setMaximumItemCount(2147483647);
        java.util.Collection collection26 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class31 = timeSeries30.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries30.addChangeListener(seriesChangeListener32);
        java.lang.String str34 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class37 = timeSeries36.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries36.addChangeListener(seriesChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class42 = timeSeries41.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries41.addChangeListener(seriesChangeListener43);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries36.addAndOrUpdate(timeSeries41);
        java.lang.Class class46 = timeSeries45.getTimePeriodClass();
        timeSeries30.timePeriodClass = class46;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class46);
        timeSeries13.timePeriodClass = class46;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "", "Overwritten values from: 10.0", class46);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries51.getDataItem(regularTimePeriod52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(class37);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(class46);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries5.addAndOrUpdate(timeSeries10);
        java.lang.Class class15 = timeSeries14.getTimePeriodClass();
        timeSeries1.timePeriodClass = class15;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeSeries1.getIndex(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemAge((long) 'a');
        boolean boolean18 = timeSeries1.equals((java.lang.Object) timeSeries12);
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class23 = timeSeries22.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries22.addChangeListener(seriesChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries27.addChangeListener(seriesChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries22.addAndOrUpdate(timeSeries27);
        timeSeries22.setMaximumItemCount((int) (short) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries22.removeChangeListener(seriesChangeListener34);
        java.lang.String str36 = timeSeries22.getDomainDescription();
        timeSeries22.removeAgedItems(true);
        boolean boolean39 = timeSeries1.equals((java.lang.Object) true);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Time" + "'", str36, "Time");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries13.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries20.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        boolean boolean34 = timeSeries31.equals((java.lang.Object) 100.0d);
        timeSeries31.setMaximumItemAge((long) 'a');
        boolean boolean37 = timeSeries20.equals((java.lang.Object) timeSeries31);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries13.addAndOrUpdate(timeSeries20);
        java.lang.Comparable comparable41 = timeSeries20.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number43 = timeSeries20.getValue(regularTimePeriod42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + 10.0f + "'", comparable41, 10.0f);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        boolean boolean5 = timeSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int12 = timeSeries11.getMaximumItemCount();
        int int13 = timeSeries11.getMaximumItemCount();
        java.lang.Object obj14 = timeSeries11.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class17 = timeSeries16.timePeriodClass;
        timeSeries16.setDomainDescription("");
        boolean boolean20 = timeSeries11.equals((java.lang.Object) timeSeries16);
        int int21 = timeSeries11.getMaximumItemCount();
        timeSeries11.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean25 = timeSeries24.getNotify();
        timeSeries24.setMaximumItemCount(0);
        timeSeries24.setDescription("Time");
        java.lang.Comparable comparable30 = timeSeries24.getKey();
        timeSeries24.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class35 = timeSeries34.timePeriodClass;
        java.util.List list36 = timeSeries34.getItems();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection40 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        java.util.Collection collection41 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        timeSeries24.setNotify(true);
        java.lang.Class class44 = timeSeries24.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries1.addAndOrUpdate(timeSeries24);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries24.addChangeListener(seriesChangeListener46);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod48 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.add(regularTimePeriod48, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (byte) -1 + "'", comparable30, (byte) -1);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertNotNull(timeSeries45);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        timeSeries1.timePeriodClass = class13;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener16);
        long long18 = timeSeries1.getMaximumItemAge();
        java.lang.String str19 = timeSeries1.getDomainDescription();
        java.lang.Comparable comparable20 = timeSeries1.getKey();
        int int21 = timeSeries1.getMaximumItemCount();
        timeSeries1.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries1.addOrUpdate(regularTimePeriod24, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) -1 + "'", comparable20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setKey((java.lang.Comparable) "");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries1.getTimePeriod(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries2.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries8.addAndOrUpdate(timeSeries13);
        java.lang.Class class18 = timeSeries17.getTimePeriodClass();
        timeSeries2.timePeriodClass = class18;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class18);
        timeSeries20.removeAgedItems((long) 2147483647, false);
        java.lang.String str24 = timeSeries20.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.add(regularTimePeriod25, (java.lang.Number) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        timeSeries1.fireSeriesChanged();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy((int) (byte) 1, (int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy(0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries14.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.util.List list4 = timeSeries1.getItems();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        int int9 = timeSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 10 + "'", comparable3, (byte) 10);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries5.getRangeDescription();
        boolean boolean10 = timeSeries5.isEmpty();
        boolean boolean11 = timeSeries5.isEmpty();
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries5);
        java.lang.String str13 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean12 = timeSeries11.getNotify();
        int int13 = timeSeries11.getMaximumItemCount();
        java.util.List list14 = timeSeries11.data;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries11.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.fireSeriesChanged();
        java.lang.Class class25 = timeSeries19.getTimePeriodClass();
        timeSeries17.timePeriodClass = class25;
        java.lang.Class class27 = timeSeries17.getTimePeriodClass();
        java.lang.String str28 = timeSeries17.getDomainDescription();
        java.util.List list29 = timeSeries17.getItems();
        java.lang.Class class30 = timeSeries17.getTimePeriodClass();
        timeSeries1.timePeriodClass = class30;
        java.lang.Class class32 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Time" + "'", str28, "Time");
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(class32);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int5 = timeSeries4.getMaximumItemCount();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Object obj7 = timeSeries4.clone();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        timeSeries9.setDomainDescription("");
        boolean boolean13 = timeSeries4.equals((java.lang.Object) timeSeries9);
        int int14 = timeSeries4.getMaximumItemCount();
        timeSeries4.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean18 = timeSeries17.getNotify();
        timeSeries17.setMaximumItemCount(0);
        timeSeries17.setDescription("Time");
        java.lang.Comparable comparable23 = timeSeries17.getKey();
        timeSeries17.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        java.util.List list29 = timeSeries27.getItems();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries27.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection33 = timeSeries17.getTimePeriodsUniqueToOtherSeries(timeSeries32);
        java.util.Collection collection34 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        timeSeries17.setNotify(true);
        java.lang.Class class37 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "hi!", "Overwritten values from: 10.0", class37);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries38.delete(regularTimePeriod39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) -1 + "'", comparable23, (byte) -1);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(class37);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        int int16 = timeSeries13.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean19 = timeSeries18.getNotify();
        int int20 = timeSeries18.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries18.addPropertyChangeListener(propertyChangeListener21);
        java.util.List list23 = timeSeries18.data;
        timeSeries13.data = list23;
        java.util.List list25 = timeSeries13.data;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean28 = timeSeries27.getNotify();
        int int29 = timeSeries27.getMaximumItemCount();
        java.util.List list30 = timeSeries27.data;
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries27.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class36 = timeSeries35.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries35.addChangeListener(seriesChangeListener37);
        java.lang.String str39 = timeSeries35.getRangeDescription();
        timeSeries35.fireSeriesChanged();
        java.lang.Class class41 = timeSeries35.getTimePeriodClass();
        timeSeries33.timePeriodClass = class41;
        java.lang.Class class43 = timeSeries33.getTimePeriodClass();
        java.lang.String str44 = timeSeries33.getDomainDescription();
        java.util.List list45 = timeSeries33.getItems();
        timeSeries13.data = list45;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem48 = timeSeries13.getDataItem((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(class36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value" + "'", str39, "Value");
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(class43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Time" + "'", str44, "Time");
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        java.lang.Object obj9 = timeSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        java.util.List list2 = timeSeries1.data;
        timeSeries1.setMaximumItemAge(10L);
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries5);
        java.util.Collection collection13 = timeSeries5.getTimePeriods();
        timeSeries5.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries5.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        boolean boolean5 = timeSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        java.lang.String str10 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries1.addOrUpdate(regularTimePeriod11, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        int int11 = timeSeries1.getMaximumItemCount();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        timeSeries14.setMaximumItemCount(0);
        timeSeries14.setDescription("Time");
        java.lang.Comparable comparable20 = timeSeries14.getKey();
        timeSeries14.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        java.util.List list26 = timeSeries24.getItems();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries24.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection30 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.util.Collection collection31 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        timeSeries14.setNotify(true);
        boolean boolean34 = timeSeries14.getNotify();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean37 = timeSeries36.getNotify();
        timeSeries36.setMaximumItemCount(0);
        timeSeries36.setDescription("Time");
        timeSeries36.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection46 = timeSeries45.getTimePeriods();
        boolean boolean48 = timeSeries45.equals((java.lang.Object) 100.0d);
        timeSeries45.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries45.removeChangeListener(seriesChangeListener51);
        java.lang.String str53 = timeSeries45.getDescription();
        boolean boolean54 = timeSeries45.getNotify();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries36.addAndOrUpdate(timeSeries45);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries14.addAndOrUpdate(timeSeries36);
        timeSeries36.setMaximumItemCount((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) -1 + "'", comparable20, (byte) -1);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertNotNull(timeSeries56);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class9);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, class9);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (short) 1, (java.lang.Number) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "Time", class14);
        timeSeries17.setNotify(true);
        timeSeries17.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod21, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        boolean boolean5 = timeSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int12 = timeSeries11.getMaximumItemCount();
        int int13 = timeSeries11.getMaximumItemCount();
        java.lang.Object obj14 = timeSeries11.clone();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class17 = timeSeries16.timePeriodClass;
        timeSeries16.setDomainDescription("");
        boolean boolean20 = timeSeries11.equals((java.lang.Object) timeSeries16);
        int int21 = timeSeries11.getMaximumItemCount();
        timeSeries11.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean25 = timeSeries24.getNotify();
        timeSeries24.setMaximumItemCount(0);
        timeSeries24.setDescription("Time");
        java.lang.Comparable comparable30 = timeSeries24.getKey();
        timeSeries24.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class35 = timeSeries34.timePeriodClass;
        java.util.List list36 = timeSeries34.getItems();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries34.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection40 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        java.util.Collection collection41 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        timeSeries24.setNotify(true);
        java.lang.Class class44 = timeSeries24.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries1.addAndOrUpdate(timeSeries24);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem46 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.add(timeSeriesDataItem46, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (byte) -1 + "'", comparable30, (byte) -1);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertNotNull(timeSeries45);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int22 = timeSeries21.getMaximumItemCount();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        java.util.List list24 = timeSeries21.getItems();
        timeSeries17.data = list24;
        boolean boolean26 = timeSeries15.equals((java.lang.Object) timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        java.lang.Class class30 = timeSeries28.getTimePeriodClass();
        timeSeries15.timePeriodClass = class30;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries34 = timeSeries15.createCopy(regularTimePeriod32, regularTimePeriod33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 10 + "'", comparable23, (byte) 10);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(class30);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        long long7 = timeSeries1.getMaximumItemAge();
        timeSeries1.setRangeDescription("hi!");
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.fireSeriesChanged();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        java.lang.Object obj8 = timeSeries1.clone();
        boolean boolean9 = timeSeries1.isEmpty();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.addOrUpdate(regularTimePeriod2, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        timeSeries9.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries9.createCopy(0, (int) (byte) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod19, (java.lang.Number) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        java.util.List list4 = timeSeries2.getItems();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        timeSeries2.timePeriodClass = class13;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, class13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.add(regularTimePeriod17, (java.lang.Number) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemAge((long) '#');
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries15.addChangeListener(seriesChangeListener17);
        java.lang.Class class19 = timeSeries15.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class19);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class19);
        timeSeries1.timePeriodClass = class19;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class29 = timeSeries28.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class29);
        timeSeries1.timePeriodClass = class29;
        java.lang.Class<?> wildcardClass32 = timeSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(class29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.fireSeriesChanged();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        java.lang.String str8 = timeSeries1.getDomainDescription();
        timeSeries1.removeAgedItems(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int6 = timeSeries5.getMaximumItemCount();
        java.lang.Comparable comparable7 = timeSeries5.getKey();
        java.util.List list8 = timeSeries5.getItems();
        timeSeries1.data = list8;
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.createCopy((int) ' ', (int) ' ');
        java.lang.String str13 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int22 = timeSeries21.getMaximumItemCount();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        java.util.List list24 = timeSeries21.getItems();
        timeSeries17.data = list24;
        boolean boolean26 = timeSeries15.equals((java.lang.Object) timeSeries17);
        timeSeries17.setMaximumItemAge((long) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener29);
        java.lang.String str31 = timeSeries17.getDomainDescription();
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 10 + "'", comparable23, (byte) 10);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Time" + "'", str31, "Time");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        boolean boolean4 = timeSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.addAndOrUpdate(timeSeries3);
        int int8 = timeSeries7.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        java.lang.Class class17 = timeSeries13.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class17);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), class17);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, class17);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Overwritten values from: 10.0", "hi!", class17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.add(regularTimePeriod24, (java.lang.Number) 0L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(class17);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        java.lang.Class class17 = timeSeries13.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class17);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), class17);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, class17);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Overwritten values from: 10.0", "hi!", class17);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries26 = timeSeries23.createCopy(regularTimePeriod24, regularTimePeriod25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(class17);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.clear();
        timeSeries1.setDomainDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries10.setNotify(false);
        timeSeries10.removeAgedItems(1L, true);
        timeSeries10.setKey((java.lang.Comparable) 0.0f);
        java.lang.String str18 = timeSeries10.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod19, (java.lang.Number) 1L, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setKey((java.lang.Comparable) "");
        java.util.List list9 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod10, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj3 = timeSeries1.clone();
        timeSeries1.setDomainDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries1.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        boolean boolean4 = timeSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.addAndOrUpdate(timeSeries3);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries7.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        java.lang.Class class23 = timeSeries19.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class23);
        timeSeries1.timePeriodClass = class23;
        java.util.Collection collection28 = timeSeries1.getTimePeriods();
        timeSeries1.setDescription("");
        java.lang.Class class31 = timeSeries1.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (byte) 10, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(class31);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = timeSeries1.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod7, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class5);
        java.lang.Object obj7 = timeSeries6.clone();
        timeSeries6.setDescription("Overwritten values from: 10.0");
        boolean boolean10 = timeSeries6.isEmpty();
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.addAndOrUpdate(timeSeries9);
        java.lang.String str14 = timeSeries13.getDescription();
        java.lang.Class class15 = timeSeries13.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries17.addChangeListener(seriesChangeListener19);
        java.lang.String str21 = timeSeries17.getRangeDescription();
        boolean boolean22 = timeSeries17.isEmpty();
        boolean boolean23 = timeSeries17.isEmpty();
        timeSeries17.setMaximumItemCount(2147483647);
        java.util.Collection collection26 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class31 = timeSeries30.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries30.addChangeListener(seriesChangeListener32);
        java.lang.String str34 = timeSeries30.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class37 = timeSeries36.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries36.addChangeListener(seriesChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class42 = timeSeries41.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries41.addChangeListener(seriesChangeListener43);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries36.addAndOrUpdate(timeSeries41);
        java.lang.Class class46 = timeSeries45.getTimePeriodClass();
        timeSeries30.timePeriodClass = class46;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class46);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class46);
        timeSeries13.timePeriodClass = class46;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "", "Overwritten values from: 10.0", class46);
        java.lang.Class class52 = timeSeries51.timePeriodClass;
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(class37);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNotNull(class46);
        org.junit.Assert.assertNotNull(class52);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.fireSeriesChanged();
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (short) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.addChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.lang.String str15 = timeSeries14.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries17.addChangeListener(seriesChangeListener19);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class23 = timeSeries22.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener24 = null;
        timeSeries22.addChangeListener(seriesChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries17.addAndOrUpdate(timeSeries22);
        java.lang.Class class27 = timeSeries26.getTimePeriodClass();
        timeSeries14.timePeriodClass = class27;
        timeSeries14.setKey((java.lang.Comparable) '4');
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries1.addAndOrUpdate(timeSeries14);
        timeSeries14.setKey((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0f + "'", comparable12, 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(timeSeries31);
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
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.String str13 = timeSeries9.getRangeDescription();
        timeSeries9.fireSeriesChanged();
        java.lang.Class class15 = timeSeries9.getTimePeriodClass();
        timeSeries7.timePeriodClass = class15;
        java.lang.Class class17 = timeSeries7.getTimePeriodClass();
        java.lang.String str18 = timeSeries7.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int20 = timeSeries7.getIndex(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries8.setRangeDescription("Value");
        boolean boolean11 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries1.addOrUpdate(regularTimePeriod12, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems((long) 2147483647, true);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        boolean boolean5 = timeSeries1.getNotify();
        boolean boolean6 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        timeSeries1.clear();
        timeSeries1.setMaximumItemCount(2147483647);
        timeSeries1.setRangeDescription("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean7 = timeSeries2.isEmpty();
        boolean boolean8 = timeSeries2.isEmpty();
        timeSeries2.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        timeSeries2.timePeriodClass = class13;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class13);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        timeSeries10.setRangeDescription("Value");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class5);
        java.lang.Object obj7 = timeSeries6.clone();
        long long8 = timeSeries6.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries6.addOrUpdate(regularTimePeriod9, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        java.util.List list4 = timeSeries2.getItems();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        timeSeries2.timePeriodClass = class13;
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, class13);
        timeSeries16.removeAgedItems((long) (byte) -1, false);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (byte) 0, 2147483647);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        java.lang.Class class2 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries1.addOrUpdate(regularTimePeriod5, (java.lang.Number) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 10, (int) '4');
        timeSeries6.fireSeriesChanged();
        timeSeries6.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries6.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.String str7 = timeSeries1.getDescription();
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.util.List list10 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.String str7 = timeSeries1.getDescription();
        timeSeries1.setDomainDescription("Value");
        timeSeries1.setNotify(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries1.removeChangeListener(seriesChangeListener13);
        java.lang.String str15 = timeSeries1.getDomainDescription();
        timeSeries1.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener18);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries5.addAndOrUpdate(timeSeries10);
        java.lang.String str15 = timeSeries14.getDescription();
        java.lang.Class class16 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class16);
        java.util.Collection collection18 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries17);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(timeSeriesDataItem19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        boolean boolean13 = timeSeries10.equals((java.lang.Object) 100.0d);
        timeSeries10.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries10.removeChangeListener(seriesChangeListener16);
        java.lang.String str18 = timeSeries10.getDescription();
        boolean boolean19 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries1.addAndOrUpdate(timeSeries10);
        boolean boolean21 = timeSeries10.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod22, (double) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        boolean boolean13 = timeSeries10.equals((java.lang.Object) 100.0d);
        timeSeries10.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries10.removeChangeListener(seriesChangeListener16);
        java.lang.String str18 = timeSeries10.getDescription();
        boolean boolean19 = timeSeries10.getNotify();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries1.addAndOrUpdate(timeSeries10);
        boolean boolean21 = timeSeries20.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries1.setMaximumItemCount(1);
        timeSeries1.setRangeDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class17 = timeSeries16.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries16.addChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class22 = timeSeries21.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries21.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries16.addAndOrUpdate(timeSeries21);
        timeSeries21.setRangeDescription("Overwritten values from: 10.0");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries1.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.delete(regularTimePeriod29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemAge((long) 'a');
        boolean boolean18 = timeSeries1.equals((java.lang.Object) timeSeries12);
        java.lang.Comparable comparable19 = timeSeries12.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries22 = timeSeries12.createCopy(regularTimePeriod20, regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10.0f + "'", comparable19, 10.0f);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries7.createCopy((int) '#', (int) (byte) 100);
        boolean boolean17 = timeSeries16.isEmpty();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries7.createCopy((int) '#', (int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.lang.String str22 = timeSeries18.getRangeDescription();
        boolean boolean23 = timeSeries18.isEmpty();
        boolean boolean24 = timeSeries18.isEmpty();
        timeSeries18.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class29 = timeSeries28.timePeriodClass;
        timeSeries18.timePeriodClass = class29;
        timeSeries7.timePeriodClass = class29;
        java.lang.String str32 = timeSeries7.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem35 = timeSeries7.addOrUpdate(regularTimePeriod33, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(class29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Time" + "'", str32, "Time");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 0, (int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries6.createCopy(1, 1);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        timeSeries6.setDescription("");
        timeSeries6.fireSeriesChanged();
        timeSeries6.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries6.getDataItem(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        boolean boolean8 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean11 = timeSeries10.getNotify();
        int int12 = timeSeries10.getMaximumItemCount();
        timeSeries10.setRangeDescription("hi!");
        java.lang.Class class15 = timeSeries10.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener16);
        timeSeries10.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class29 = timeSeries28.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries28.addChangeListener(seriesChangeListener30);
        java.lang.Class class32 = timeSeries28.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class32);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class32);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class32);
        timeSeries10.timePeriodClass = class32;
        java.util.Collection collection37 = timeSeries10.getTimePeriods();
        boolean boolean38 = timeSeries1.equals((java.lang.Object) timeSeries10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod39, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class29);
        org.junit.Assert.assertNotNull(class32);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.String str7 = timeSeries1.getDescription();
        timeSeries1.setMaximumItemCount((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries1.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        java.lang.Comparable comparable15 = timeSeries14.getKey();
        java.util.Collection collection16 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.lang.Object obj17 = timeSeries14.clone();
        timeSeries14.clear();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + 10 + "'", comparable15, 10);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemAge((long) 'a');
        int int7 = timeSeries1.getItemCount();
        timeSeries1.setDescription("Overwritten values from: 10.0");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = timeSeries1.getTimePeriod((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries2.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries8.addAndOrUpdate(timeSeries13);
        java.lang.Class class18 = timeSeries17.getTimePeriodClass();
        timeSeries2.timePeriodClass = class18;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = timeSeries20.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(class18);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries9.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection21 = timeSeries20.getTimePeriods();
        boolean boolean23 = timeSeries20.equals((java.lang.Object) 100.0d);
        timeSeries20.setMaximumItemAge((long) 'a');
        boolean boolean26 = timeSeries9.equals((java.lang.Object) timeSeries20);
        timeSeries9.removeAgedItems(true);
        timeSeries9.fireSeriesChanged();
        java.util.Collection collection30 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries9.addChangeListener(seriesChangeListener31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        boolean boolean10 = timeSeries1.getNotify();
        java.lang.String str11 = timeSeries1.getDomainDescription();
        timeSeries1.setKey((java.lang.Comparable) 1);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener14);
        timeSeries1.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeSeries1.getIndex(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        long long8 = timeSeries1.getMaximumItemAge();
        timeSeries1.setDomainDescription("");
        timeSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        timeSeries6.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries6.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries13.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries20.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        boolean boolean34 = timeSeries31.equals((java.lang.Object) 100.0d);
        timeSeries31.setMaximumItemAge((long) 'a');
        boolean boolean37 = timeSeries20.equals((java.lang.Object) timeSeries31);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries13.addAndOrUpdate(timeSeries20);
        java.lang.Comparable comparable41 = timeSeries20.getKey();
        java.lang.Object obj42 = timeSeries20.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number44 = timeSeries20.getValue(regularTimePeriod43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + 10.0f + "'", comparable41, 10.0f);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        timeSeries1.timePeriodClass = class13;
        timeSeries1.setKey((java.lang.Comparable) 1L);
        java.lang.Class<?> wildcardClass18 = timeSeries1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries10.getRangeDescription();
        boolean boolean15 = timeSeries10.isEmpty();
        boolean boolean16 = timeSeries10.isEmpty();
        boolean boolean17 = timeSeries10.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean20 = timeSeries19.getNotify();
        int int21 = timeSeries19.getMaximumItemCount();
        timeSeries19.setRangeDescription("hi!");
        java.lang.Class class24 = timeSeries19.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener25);
        timeSeries19.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class38 = timeSeries37.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries37.addChangeListener(seriesChangeListener39);
        java.lang.Class class41 = timeSeries37.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class41);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class41);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class41);
        timeSeries19.timePeriodClass = class41;
        java.util.Collection collection46 = timeSeries19.getTimePeriods();
        boolean boolean47 = timeSeries10.equals((java.lang.Object) timeSeries19);
        boolean boolean48 = timeSeries1.equals((java.lang.Object) timeSeries19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        timeSeries1.removeAgedItems(true);
        timeSeries1.setMaximumItemCount((int) '4');
        java.util.List list6 = timeSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = timeSeries1.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        int int4 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, (java.lang.Number) 1L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        timeSeries9.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class27 = timeSeries26.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries26.addChangeListener(seriesChangeListener28);
        java.lang.Class class30 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class30);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class30);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class30);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), class30);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, class30);
        timeSeries9.timePeriodClass = class30;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class39 = timeSeries38.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries38.addChangeListener(seriesChangeListener40);
        java.lang.String str42 = timeSeries38.getRangeDescription();
        boolean boolean43 = timeSeries38.isEmpty();
        boolean boolean44 = timeSeries38.isEmpty();
        boolean boolean45 = timeSeries38.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean48 = timeSeries47.getNotify();
        int int49 = timeSeries47.getMaximumItemCount();
        timeSeries47.setRangeDescription("hi!");
        java.lang.Class class52 = timeSeries47.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        timeSeries47.removePropertyChangeListener(propertyChangeListener53);
        timeSeries47.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class66 = timeSeries65.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener67 = null;
        timeSeries65.addChangeListener(seriesChangeListener67);
        java.lang.Class class69 = timeSeries65.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class69);
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class69);
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class69);
        timeSeries47.timePeriodClass = class69;
        java.util.Collection collection74 = timeSeries47.getTimePeriods();
        boolean boolean75 = timeSeries38.equals((java.lang.Object) timeSeries47);
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries9.addAndOrUpdate(timeSeries47);
        boolean boolean77 = timeSeries9.isEmpty();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(class39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value" + "'", str42, "Value");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(class52);
        org.junit.Assert.assertNotNull(class66);
        org.junit.Assert.assertNotNull(class69);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(timeSeries76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.createCopy(regularTimePeriod11, regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.util.List list4 = timeSeries1.getItems();
        timeSeries1.setDomainDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int22 = timeSeries21.getMaximumItemCount();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        java.util.List list24 = timeSeries21.getItems();
        timeSeries17.data = list24;
        boolean boolean26 = timeSeries15.equals((java.lang.Object) timeSeries17);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        java.lang.Class class30 = timeSeries28.getTimePeriodClass();
        timeSeries15.timePeriodClass = class30;
        timeSeries15.removeAgedItems(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(timeSeriesDataItem34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 10 + "'", comparable23, (byte) 10);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(class30);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries8.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class23 = timeSeries22.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class23);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int28 = timeSeries27.getMaximumItemCount();
        java.lang.Object obj29 = timeSeries27.clone();
        timeSeries27.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries27.removePropertyChangeListener(propertyChangeListener32);
        java.util.Collection collection34 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        java.lang.Class class35 = timeSeries27.getTimePeriodClass();
        java.util.Collection collection36 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries27);
        timeSeries27.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj3 = timeSeries1.clone();
        timeSeries1.setDomainDescription("Value");
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        boolean boolean11 = timeSeries8.equals((java.lang.Object) 100.0d);
        timeSeries8.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        timeSeries15.setNotify(true);
        boolean boolean19 = timeSeries8.equals((java.lang.Object) timeSeries15);
        timeSeries15.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class30);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class30);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int35 = timeSeries34.getMaximumItemCount();
        java.lang.Object obj36 = timeSeries34.clone();
        timeSeries34.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries34.removePropertyChangeListener(propertyChangeListener39);
        java.util.Collection collection41 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries34);
        java.lang.Class class42 = timeSeries34.getTimePeriodClass();
        java.util.Collection collection43 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries1.addAndOrUpdate(timeSeries34);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = timeSeries34.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 10 + "'", comparable6, (byte) 10);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.clear();
        timeSeries1.setDomainDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int12 = timeSeries11.getMaximumItemCount();
        timeSeries11.clear();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class22 = timeSeries21.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries21.addChangeListener(seriesChangeListener23);
        java.lang.Class class25 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class25);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class25);
        boolean boolean28 = timeSeries11.equals((java.lang.Object) false);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class35 = timeSeries34.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries34.addChangeListener(seriesChangeListener36);
        java.lang.String str38 = timeSeries34.getRangeDescription();
        timeSeries34.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries30.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean44 = timeSeries43.getNotify();
        int int45 = timeSeries43.getMaximumItemCount();
        java.util.List list46 = timeSeries43.data;
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries43.createCopy((int) '4', (int) (short) 100);
        java.util.Collection collection50 = timeSeries34.getTimePeriodsUniqueToOtherSeries(timeSeries43);
        int int51 = timeSeries43.getItemCount();
        java.lang.Comparable comparable52 = timeSeries43.getKey();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean56 = timeSeries55.getNotify();
        int int57 = timeSeries55.getMaximumItemCount();
        timeSeries55.setRangeDescription("hi!");
        java.lang.Class class60 = timeSeries55.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class60);
        boolean boolean62 = timeSeries43.equals((java.lang.Object) timeSeries61);
        boolean boolean63 = timeSeries11.equals((java.lang.Object) boolean62);
        boolean boolean64 = timeSeries1.equals((java.lang.Object) boolean63);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod65 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod65, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Value" + "'", str38, "Value");
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + comparable52 + "' != '" + (byte) -1 + "'", comparable52, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertNotNull(class60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int6 = timeSeries5.getMaximumItemCount();
        java.lang.Comparable comparable7 = timeSeries5.getKey();
        java.util.List list8 = timeSeries5.getItems();
        timeSeries1.data = list8;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        java.util.Collection collection12 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.addChangeListener(seriesChangeListener13);
        java.lang.Class class15 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class15);
        boolean boolean18 = timeSeries1.equals((java.lang.Object) false);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries24.addChangeListener(seriesChangeListener26);
        java.lang.String str28 = timeSeries24.getRangeDescription();
        timeSeries24.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries20.addAndOrUpdate(timeSeries24);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean34 = timeSeries33.getNotify();
        int int35 = timeSeries33.getMaximumItemCount();
        java.util.List list36 = timeSeries33.data;
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries33.createCopy((int) '4', (int) (short) 100);
        java.util.Collection collection40 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries33);
        int int41 = timeSeries33.getItemCount();
        java.lang.Comparable comparable42 = timeSeries33.getKey();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean46 = timeSeries45.getNotify();
        int int47 = timeSeries45.getMaximumItemCount();
        timeSeries45.setRangeDescription("hi!");
        java.lang.Class class50 = timeSeries45.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class50);
        boolean boolean52 = timeSeries33.equals((java.lang.Object) timeSeries51);
        boolean boolean53 = timeSeries1.equals((java.lang.Object) boolean52);
        timeSeries1.setMaximumItemCount(100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries1.addChangeListener(seriesChangeListener56);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod58 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod58, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Value" + "'", str28, "Value");
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + comparable42 + "' != '" + (byte) -1 + "'", comparable42, (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertNotNull(class50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemAge((long) 'a');
        boolean boolean18 = timeSeries1.equals((java.lang.Object) timeSeries12);
        timeSeries1.removeAgedItems(true);
        timeSeries1.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number24 = timeSeries1.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int3 = timeSeries2.getMaximumItemCount();
        timeSeries2.clear();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int7 = timeSeries6.getMaximumItemCount();
        java.lang.Comparable comparable8 = timeSeries6.getKey();
        java.util.List list9 = timeSeries6.getItems();
        timeSeries2.data = list9;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries2.removeChangeListener(seriesChangeListener11);
        timeSeries2.setRangeDescription("Time");
        java.lang.Class<?> wildcardClass15 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 10.0", (java.lang.Class) wildcardClass15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) 10 + "'", comparable8, (byte) 10);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemAge((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        timeSeries1.clear();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) '4', (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        timeSeries1.removeAgedItems(true);
        timeSeries1.setDomainDescription("Overwritten values from: 10.0");
        timeSeries1.setDomainDescription("Time");
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        long long8 = timeSeries1.getMaximumItemAge();
        timeSeries1.setDomainDescription("");
        java.lang.String str11 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean14 = timeSeries13.getNotify();
        java.util.List list15 = timeSeries13.getItems();
        timeSeries1.data = list15;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class<?> wildcardClass3 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries4.getDataItem(regularTimePeriod5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        boolean boolean10 = timeSeries1.getNotify();
        java.lang.String str11 = timeSeries1.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod12, (java.lang.Number) (-1.0f), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Object obj14 = timeSeries12.clone();
        timeSeries12.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener17);
        java.util.Collection collection19 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        timeSeries10.setDomainDescription("");
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.String str7 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean10 = timeSeries9.getNotify();
        int int11 = timeSeries9.getMaximumItemCount();
        java.util.List list12 = timeSeries9.data;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries17.addChangeListener(seriesChangeListener19);
        java.lang.Class class21 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class21);
        timeSeries9.timePeriodClass = class21;
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener24);
        timeSeries9.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries1.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class33 = timeSeries32.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries32.addChangeListener(seriesChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class38 = timeSeries37.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries37.addChangeListener(seriesChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries32.addAndOrUpdate(timeSeries37);
        java.lang.Class class42 = timeSeries41.getTimePeriodClass();
        timeSeries30.timePeriodClass = class42;
        timeSeries1.timePeriodClass = class42;
        timeSeries1.setMaximumItemCount((int) '#');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        timeSeries1.addChangeListener(seriesChangeListener47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(class42);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.util.List list4 = timeSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = timeSeries1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 10 + "'", comparable3, (byte) 10);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.lang.Class class22 = timeSeries18.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class22);
        java.lang.Comparable comparable24 = timeSeries23.getKey();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean27 = timeSeries26.getNotify();
        timeSeries26.setMaximumItemCount(0);
        timeSeries26.setDescription("Time");
        timeSeries26.setMaximumItemCount((int) (short) 1);
        java.util.Collection collection34 = timeSeries23.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries9.addAndOrUpdate(timeSeries23);
        java.util.List list36 = timeSeries23.data;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = timeSeries23.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 10 + "'", comparable24, 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.removeAgedItems((long) (byte) 100, true);
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.getDataItem(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries1.setMaximumItemCount(1);
        timeSeries1.setRangeDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class17 = timeSeries16.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries16.addChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class22 = timeSeries21.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries21.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries16.addAndOrUpdate(timeSeries21);
        timeSeries21.setRangeDescription("Overwritten values from: 10.0");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries1.addAndOrUpdate(timeSeries21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod29, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries28);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.Class class5 = timeSeries1.getTimePeriodClass();
        java.lang.String str6 = timeSeries1.getDescription();
        java.util.List list7 = timeSeries1.getItems();
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod10, (java.lang.Number) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.String str7 = timeSeries1.getDescription();
        java.lang.Comparable comparable8 = timeSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) -1 + "'", comparable8, (byte) -1);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries10.createCopy(0, 1);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int6 = timeSeries5.getMaximumItemCount();
        java.lang.Comparable comparable7 = timeSeries5.getKey();
        java.util.List list8 = timeSeries5.getItems();
        timeSeries1.data = list8;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries1.createCopy(1, (int) 'a');
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.delete(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 10 + "'", comparable12, (byte) 10);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean4 = timeSeries3.getNotify();
        int int5 = timeSeries3.getMaximumItemCount();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, class8);
        boolean boolean11 = timeSeries10.isEmpty();
        java.util.List list12 = timeSeries10.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries10.getDataItem(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class11);
        boolean boolean13 = timeSeries1.equals((java.lang.Object) "Time");
        timeSeries1.setKey((java.lang.Comparable) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries7.addAndOrUpdate(timeSeries12);
        java.lang.Class class17 = timeSeries16.getTimePeriodClass();
        timeSeries1.timePeriodClass = class17;
        timeSeries1.setRangeDescription("Overwritten values from: 10.0");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries1.createCopy(regularTimePeriod21, regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(class17);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int6 = timeSeries5.getMaximumItemCount();
        java.lang.Comparable comparable7 = timeSeries5.getKey();
        java.util.List list8 = timeSeries5.getItems();
        timeSeries1.data = list8;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.removeAgedItems(false);
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 10 + "'", comparable6, (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        java.lang.Class class23 = timeSeries19.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class23);
        timeSeries1.timePeriodClass = class23;
        java.util.Collection collection28 = timeSeries1.getTimePeriods();
        timeSeries1.setDescription("");
        java.lang.Comparable comparable31 = timeSeries1.getKey();
        timeSeries1.removeAgedItems((long) 32, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (byte) -1 + "'", comparable31, (byte) -1);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        long long7 = timeSeries1.getMaximumItemAge();
        java.util.List list8 = timeSeries1.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, (java.lang.Number) 2147483647, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        java.lang.Comparable comparable11 = timeSeries10.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod12, (java.lang.Number) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + '#' + "'", comparable11, '#');
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries1.removeChangeListener(seriesChangeListener13);
        java.lang.String str15 = timeSeries1.getDomainDescription();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection23 = timeSeries22.getTimePeriods();
        java.lang.Class class24 = timeSeries22.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class24);
        java.lang.Object obj26 = timeSeries25.clone();
        boolean boolean27 = timeSeries1.equals((java.lang.Object) timeSeries25);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy(regularTimePeriod5, regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        boolean boolean5 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems((long) (short) 1, true);
        java.lang.String str9 = timeSeries1.getDescription();
        int int10 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries1.addOrUpdate(regularTimePeriod11, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        timeSeries10.fireSeriesChanged();
        timeSeries10.setDescription("");
        java.lang.Class class15 = timeSeries10.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class24 = timeSeries23.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class24);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class24);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int29 = timeSeries28.getMaximumItemCount();
        java.lang.Object obj30 = timeSeries28.clone();
        timeSeries28.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries28.removePropertyChangeListener(propertyChangeListener33);
        java.util.Collection collection35 = timeSeries26.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        java.lang.Class class36 = timeSeries28.getTimePeriodClass();
        timeSeries10.timePeriodClass = class36;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(class36);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        timeSeries10.fireSeriesChanged();
        timeSeries10.setDescription("");
        java.lang.Class class15 = timeSeries10.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update(regularTimePeriod18, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries10.setNotify(false);
        timeSeries10.removeAgedItems(1L, true);
        timeSeries10.setDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod18, (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (byte) 0, 2147483647);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Comparable comparable14 = timeSeries12.getKey();
        java.util.List list15 = timeSeries12.getItems();
        timeSeries8.data = list15;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries6.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean20 = timeSeries19.getNotify();
        int int21 = timeSeries19.getMaximumItemCount();
        java.util.List list22 = timeSeries19.data;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries27.addChangeListener(seriesChangeListener29);
        java.lang.Class class31 = timeSeries27.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class31);
        timeSeries19.timePeriodClass = class31;
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener34);
        timeSeries19.setDescription("hi!");
        java.util.Collection collection38 = timeSeries19.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries19.addChangeListener(seriesChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries6.addAndOrUpdate(timeSeries19);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int44 = timeSeries43.getMaximumItemCount();
        timeSeries43.clear();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int48 = timeSeries47.getMaximumItemCount();
        java.lang.Comparable comparable49 = timeSeries47.getKey();
        java.util.List list50 = timeSeries47.getItems();
        timeSeries43.data = list50;
        timeSeries19.data = list50;
        timeSeries19.setNotify(true);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 10 + "'", comparable14, (byte) 10);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + (byte) 10 + "'", comparable49, (byte) 10);
        org.junit.Assert.assertNotNull(list50);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeSeries1.getIndex(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        java.lang.Class class7 = timeSeries5.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries10.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries8.addAndOrUpdate(timeSeries10);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, class16);
        boolean boolean18 = timeSeries17.getNotify();
        java.util.List list19 = timeSeries17.getItems();
        boolean boolean20 = timeSeries17.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = timeSeries17.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        timeSeries1.setMaximumItemAge(1L);
        java.lang.String str12 = timeSeries1.getDescription();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.lang.Class class22 = timeSeries18.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class22);
        java.lang.Comparable comparable24 = timeSeries23.getKey();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean27 = timeSeries26.getNotify();
        timeSeries26.setMaximumItemCount(0);
        timeSeries26.setDescription("Time");
        timeSeries26.setMaximumItemCount((int) (short) 1);
        java.util.Collection collection34 = timeSeries23.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries9.addAndOrUpdate(timeSeries23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.update(regularTimePeriod36, (java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 10 + "'", comparable24, 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(timeSeries35);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.String str12 = timeSeries11.getDescription();
        java.lang.Class class13 = timeSeries11.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class13);
        timeSeries14.setKey((java.lang.Comparable) 0L);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        timeSeries1.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class20);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int25 = timeSeries24.getMaximumItemCount();
        java.lang.Object obj26 = timeSeries24.clone();
        timeSeries24.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries24.removePropertyChangeListener(propertyChangeListener29);
        java.util.Collection collection31 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.util.List list32 = timeSeries22.getItems();
        timeSeries22.removeAgedItems(false);
        java.util.Collection collection35 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.update(regularTimePeriod36, (java.lang.Number) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.lang.String str11 = timeSeries10.getDescription();
        java.lang.Class class12 = timeSeries10.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        boolean boolean19 = timeSeries14.isEmpty();
        boolean boolean20 = timeSeries14.isEmpty();
        timeSeries14.setMaximumItemCount(2147483647);
        java.util.Collection collection23 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete(regularTimePeriod24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(collection23);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        long long7 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean12 = timeSeries11.getNotify();
        int int13 = timeSeries11.getMaximumItemCount();
        timeSeries11.setRangeDescription("hi!");
        java.lang.Class class16 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, class16);
        boolean boolean19 = timeSeries1.equals((java.lang.Object) class16);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries1.getValue(regularTimePeriod20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 10 + "'", comparable6, (byte) 10);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        boolean boolean10 = timeSeries1.getNotify();
        boolean boolean11 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod12, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemAge((long) 'a');
        boolean boolean18 = timeSeries1.equals((java.lang.Object) timeSeries12);
        timeSeries1.removeAgedItems(true);
        timeSeries1.clear();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.lang.String str2 = timeSeries1.getDomainDescription();
        timeSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries14.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.createCopy((int) (short) 0, (int) (byte) 100);
        timeSeries19.clear();
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries1.getTimePeriod((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Object obj14 = timeSeries12.clone();
        timeSeries12.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener17);
        java.util.Collection collection19 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        java.lang.Class class20 = timeSeries12.getTimePeriodClass();
        timeSeries12.setMaximumItemCount((int) 'a');
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean25 = timeSeries24.getNotify();
        int int26 = timeSeries24.getMaximumItemCount();
        java.util.List list27 = timeSeries24.data;
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries24.createCopy((int) '4', (int) (short) 100);
        long long31 = timeSeries24.getMaximumItemAge();
        boolean boolean32 = timeSeries12.equals((java.lang.Object) long31);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries35 = timeSeries12.createCopy(regularTimePeriod33, regularTimePeriod34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries9.getDataItem(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 2147483647 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        java.util.List list13 = timeSeries11.getItems();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries11.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection17 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        boolean boolean18 = timeSeries16.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.update(0, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.util.List list4 = timeSeries1.getItems();
        java.lang.Object obj5 = timeSeries1.clone();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 10 + "'", comparable3, (byte) 10);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.addChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries6.addAndOrUpdate(timeSeries11);
        java.lang.String str16 = timeSeries15.getDescription();
        java.lang.Class class17 = timeSeries15.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class17);
        java.util.Collection collection19 = timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        timeSeries21.setRangeDescription("hi!");
        java.lang.Class class26 = timeSeries21.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener27);
        timeSeries21.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class40 = timeSeries39.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries39.addChangeListener(seriesChangeListener41);
        java.lang.Class class43 = timeSeries39.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class43);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class43);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class43);
        timeSeries21.timePeriodClass = class43;
        timeSeries2.timePeriodClass = class43;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class43);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(class40);
        org.junit.Assert.assertNotNull(class43);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = timeSeries7.getTimePeriod(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries10.setMaximumItemCount((int) (short) 1);
        timeSeries10.setDomainDescription("");
        timeSeries10.setNotify(false);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy(1, (int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries19.createCopy((int) '#', 2147483647);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class41 = timeSeries40.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries40.addChangeListener(seriesChangeListener42);
        java.lang.Class class44 = timeSeries40.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class44);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class44);
        boolean boolean48 = timeSeries31.equals((java.lang.Object) (short) 100);
        timeSeries31.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number52 = timeSeries31.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        int int4 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.addAndOrUpdate(timeSeries5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemAge((long) 'a');
        int int7 = timeSeries1.getItemCount();
        timeSeries1.setDescription("Overwritten values from: 10.0");
        java.lang.String str10 = timeSeries1.getDescription();
        timeSeries1.setKey((java.lang.Comparable) 1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries1.addOrUpdate(regularTimePeriod13, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Overwritten values from: 10.0" + "'", str10, "Overwritten values from: 10.0");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) ' ', (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        boolean boolean5 = timeSeries2.equals((java.lang.Object) 100.0d);
        timeSeries2.fireSeriesChanged();
        timeSeries2.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries15.addChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.addAndOrUpdate(timeSeries15);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries29.addChangeListener(seriesChangeListener31);
        java.lang.Class class33 = timeSeries29.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class33);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class33);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class33);
        timeSeries19.timePeriodClass = class33;
        timeSeries2.timePeriodClass = class33;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, class33);
        boolean boolean40 = timeSeries39.isEmpty();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries5.addAndOrUpdate(timeSeries10);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        boolean boolean16 = timeSeries1.equals((java.lang.Object) timeSeries14);
        java.lang.Object obj17 = timeSeries14.clone();
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemAge((long) 'a');
        boolean boolean18 = timeSeries1.equals((java.lang.Object) timeSeries12);
        timeSeries1.removeAgedItems(true);
        timeSeries1.fireSeriesChanged();
        long long22 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(0);
        java.lang.Class<?> wildcardClass25 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.util.List list4 = timeSeries1.getItems();
        timeSeries1.setKey((java.lang.Comparable) 0L);
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 10 + "'", comparable3, (byte) 10);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        timeSeries1.timePeriodClass = class12;
        java.lang.Object obj15 = timeSeries1.clone();
        timeSeries1.setMaximumItemAge((long) (short) 100);
        timeSeries1.setMaximumItemAge(10L);
        boolean boolean20 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries1.createCopy(regularTimePeriod21, regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        timeSeries1.setMaximumItemCount(10);
        int int9 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        int int16 = timeSeries14.getMaximumItemCount();
        java.util.List list17 = timeSeries14.data;
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries14.createCopy((int) '4', (int) (short) 100);
        java.util.Collection collection21 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        timeSeries5.fireSeriesChanged();
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Object obj14 = timeSeries12.clone();
        timeSeries12.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener17);
        java.util.Collection collection19 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        java.lang.Class class20 = timeSeries12.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = timeSeries12.addOrUpdate(regularTimePeriod21, (double) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(class20);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        boolean boolean8 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.removeAgedItems(9223372036854775807L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries10.getRangeDescription();
        timeSeries10.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries6.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.addAndOrUpdate(timeSeries10);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.delete((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        java.lang.Class class9 = timeSeries5.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class9);
        java.lang.Comparable comparable11 = timeSeries10.getKey();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean14 = timeSeries13.getNotify();
        int int15 = timeSeries13.getMaximumItemCount();
        java.util.List list16 = timeSeries13.data;
        timeSeries10.data = list16;
        java.lang.Class<?> wildcardClass18 = list16.getClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), (java.lang.Class) wildcardClass18);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10 + "'", comparable11, 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries10.addChangeListener(seriesChangeListener11);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (byte) 0, 2147483647);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Comparable comparable14 = timeSeries12.getKey();
        java.util.List list15 = timeSeries12.getItems();
        timeSeries8.data = list15;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries6.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean20 = timeSeries19.getNotify();
        int int21 = timeSeries19.getMaximumItemCount();
        java.util.List list22 = timeSeries19.data;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries27.addChangeListener(seriesChangeListener29);
        java.lang.Class class31 = timeSeries27.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class31);
        timeSeries19.timePeriodClass = class31;
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener34);
        timeSeries19.setDescription("hi!");
        java.util.Collection collection38 = timeSeries19.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries19.addChangeListener(seriesChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries6.addAndOrUpdate(timeSeries19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number43 = timeSeries6.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 10 + "'", comparable14, (byte) 10);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(timeSeries41);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean28 = timeSeries27.getNotify();
        java.util.List list29 = timeSeries27.getItems();
        timeSeries19.data = list29;
        java.lang.Object obj31 = null;
        boolean boolean32 = timeSeries19.equals(obj31);
        timeSeries19.setKey((java.lang.Comparable) 10.0d);
        int int35 = timeSeries19.getMaximumItemCount();
        timeSeries19.setMaximumItemAge((long) (byte) 0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries8.setMaximumItemCount((int) (byte) 100);
        int int15 = timeSeries8.getItemCount();
        java.lang.Comparable comparable16 = timeSeries8.getKey();
        java.lang.Comparable comparable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.setKey(comparable17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + 10.0f + "'", comparable16, 10.0f);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.lang.String str2 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries4.addAndOrUpdate(timeSeries9);
        java.lang.Class class14 = timeSeries13.getTimePeriodClass();
        timeSeries1.timePeriodClass = class14;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class24 = timeSeries23.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class24);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class24);
        timeSeries1.timePeriodClass = class24;
        timeSeries1.setRangeDescription("Overwritten values from: 10.0");
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(class24);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries1.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        long long8 = timeSeries1.getMaximumItemAge();
        timeSeries1.setDomainDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries1.addOrUpdate(regularTimePeriod11, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = timeSeries1.getDataItem(regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        java.lang.String str5 = timeSeries1.getDomainDescription();
        int int6 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemAge((long) 'a');
        boolean boolean18 = timeSeries1.equals((java.lang.Object) timeSeries12);
        java.lang.Comparable comparable19 = timeSeries12.getKey();
        int int20 = timeSeries12.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod21, (double) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10.0f + "'", comparable19, 10.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int6 = timeSeries5.getMaximumItemCount();
        java.lang.Comparable comparable7 = timeSeries5.getKey();
        java.util.List list8 = timeSeries5.getItems();
        timeSeries1.data = list8;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        boolean boolean8 = timeSeries5.equals((java.lang.Object) 100.0d);
        timeSeries5.fireSeriesChanged();
        timeSeries5.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries13.addAndOrUpdate(timeSeries18);
        java.util.Collection collection23 = timeSeries22.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class33 = timeSeries32.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries32.addChangeListener(seriesChangeListener34);
        java.lang.Class class36 = timeSeries32.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class36);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class36);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class36);
        timeSeries22.timePeriodClass = class36;
        timeSeries5.timePeriodClass = class36;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, class36);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, "Value", "Overwritten values from: 10.0", class36);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(class36);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = timeSeries1.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class8);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries9.addOrUpdate(regularTimePeriod11, (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10 + "'", comparable10, 10);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj3 = timeSeries1.clone();
        timeSeries1.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener6);
        int int8 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries1.getValue(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener3);
        java.lang.String str5 = timeSeries1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Time" + "'", str5, "Time");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean4 = timeSeries3.getNotify();
        int int5 = timeSeries3.getMaximumItemCount();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, class8);
        boolean boolean11 = timeSeries10.isEmpty();
        int int12 = timeSeries10.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries10.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        java.util.List list10 = timeSeries1.getItems();
        java.lang.Class class11 = timeSeries1.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries1.getTimePeriod((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        timeSeries1.clear();
        int int12 = timeSeries1.getItemCount();
        timeSeries1.setMaximumItemAge((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = timeSeries1.getTimePeriod((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries13.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries20.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        boolean boolean34 = timeSeries31.equals((java.lang.Object) 100.0d);
        timeSeries31.setMaximumItemAge((long) 'a');
        boolean boolean37 = timeSeries20.equals((java.lang.Object) timeSeries31);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries13.addAndOrUpdate(timeSeries20);
        java.lang.Object obj41 = timeSeries20.clone();
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener42);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = timeSeries1.getIndex(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.addChangeListener(seriesChangeListener13);
        java.lang.Class class15 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class15);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "", "", class15);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class15);
        timeSeries19.clear();
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.util.List list5 = timeSeries1.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod6, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        java.lang.Class class23 = timeSeries19.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class23);
        timeSeries1.timePeriodClass = class23;
        java.util.Collection collection28 = timeSeries1.getTimePeriods();
        timeSeries1.setDescription("");
        long long31 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemAge(1L);
        java.lang.Comparable comparable34 = timeSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (byte) 100, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (byte) -1 + "'", comparable34, (byte) -1);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = timeSeries1.getTimePeriod((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean28 = timeSeries27.getNotify();
        java.util.List list29 = timeSeries27.getItems();
        timeSeries19.data = list29;
        java.lang.Object obj31 = null;
        boolean boolean32 = timeSeries19.equals(obj31);
        java.util.Collection collection33 = timeSeries19.getTimePeriods();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        java.util.List list10 = timeSeries1.getItems();
        java.lang.Class class11 = timeSeries1.getTimePeriodClass();
        int int12 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries1.createCopy(0, 32);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        long long7 = timeSeries1.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean7 = timeSeries2.isEmpty();
        boolean boolean8 = timeSeries2.isEmpty();
        timeSeries2.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        timeSeries2.timePeriodClass = class13;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", class13);
        java.lang.String str16 = timeSeries15.getDescription();
        java.lang.String str17 = timeSeries15.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod18, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.clear();
        timeSeries1.setDomainDescription("Time");
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertNotNull(class2);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.lang.String str2 = timeSeries1.getDomainDescription();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int22 = timeSeries21.getMaximumItemCount();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        java.util.List list24 = timeSeries21.getItems();
        timeSeries17.data = list24;
        boolean boolean26 = timeSeries15.equals((java.lang.Object) timeSeries17);
        timeSeries17.setMaximumItemAge((long) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem32 = timeSeries17.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 10 + "'", comparable23, (byte) 10);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        java.lang.String str5 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number7 = timeSeries1.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.util.List list4 = timeSeries1.getItems();
        int int5 = timeSeries1.getItemCount();
        java.util.Collection collection6 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 10 + "'", comparable3, (byte) 10);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        int int11 = timeSeries1.getMaximumItemCount();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        timeSeries14.setMaximumItemCount(0);
        timeSeries14.setDescription("Time");
        java.lang.Comparable comparable20 = timeSeries14.getKey();
        timeSeries14.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        java.util.List list26 = timeSeries24.getItems();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries24.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection30 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.util.Collection collection31 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        timeSeries14.setMaximumItemCount((int) (byte) 10);
        java.lang.String str34 = timeSeries14.getDomainDescription();
        timeSeries14.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries14.removeChangeListener(seriesChangeListener36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) -1 + "'", comparable20, (byte) -1);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries13.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.util.List list4 = timeSeries1.getItems();
        timeSeries1.setKey((java.lang.Comparable) 0L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.addOrUpdate(regularTimePeriod7, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 10 + "'", comparable3, (byte) 10);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.lang.String str11 = timeSeries10.getDescription();
        java.lang.Class class12 = timeSeries10.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        java.lang.String str18 = timeSeries14.getRangeDescription();
        boolean boolean19 = timeSeries14.isEmpty();
        boolean boolean20 = timeSeries14.isEmpty();
        timeSeries14.setMaximumItemCount(2147483647);
        java.util.Collection collection23 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        java.lang.Comparable comparable24 = timeSeries10.getKey();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Value" + "'", str18, "Value");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + "Overwritten values from: 10.0" + "'", comparable24, "Overwritten values from: 10.0");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        java.lang.String str8 = timeSeries1.getDomainDescription();
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
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class8);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        timeSeries12.setMaximumItemCount(0);
        timeSeries12.setDescription("Time");
        timeSeries12.setMaximumItemCount((int) (short) 1);
        java.util.Collection collection20 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries12.createCopy(regularTimePeriod21, regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10 + "'", comparable10, 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        int int11 = timeSeries1.getMaximumItemCount();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        timeSeries14.setMaximumItemCount(0);
        timeSeries14.setDescription("Time");
        java.lang.Comparable comparable20 = timeSeries14.getKey();
        timeSeries14.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        java.util.List list26 = timeSeries24.getItems();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries24.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection30 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.util.Collection collection31 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        timeSeries14.setNotify(true);
        java.lang.Object obj34 = timeSeries14.clone();
        timeSeries14.setMaximumItemAge((long) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number38 = timeSeries14.getValue(regularTimePeriod37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) -1 + "'", comparable20, (byte) -1);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries1.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.lang.Class class22 = timeSeries18.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class22);
        java.lang.Comparable comparable24 = timeSeries23.getKey();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean27 = timeSeries26.getNotify();
        timeSeries26.setMaximumItemCount(0);
        timeSeries26.setDescription("Time");
        timeSeries26.setMaximumItemCount((int) (short) 1);
        java.util.Collection collection34 = timeSeries23.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries9.addAndOrUpdate(timeSeries23);
        boolean boolean36 = timeSeries35.isEmpty();
        java.util.List list37 = timeSeries35.data;
        java.util.Collection collection38 = timeSeries35.getTimePeriods();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 10 + "'", comparable24, 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        java.util.List list2 = timeSeries1.data;
        org.junit.Assert.assertNotNull(list2);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        timeSeries1.fireSeriesChanged();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy((int) (byte) 1, (int) (byte) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries1.addOrUpdate(regularTimePeriod12, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(timeSeries11);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        int int11 = timeSeries1.getMaximumItemCount();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        timeSeries14.setMaximumItemCount(0);
        timeSeries14.setDescription("Time");
        java.lang.Comparable comparable20 = timeSeries14.getKey();
        timeSeries14.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        java.util.List list26 = timeSeries24.getItems();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries24.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection30 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.util.Collection collection31 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        timeSeries14.setNotify(true);
        boolean boolean34 = timeSeries14.getNotify();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean37 = timeSeries36.getNotify();
        timeSeries36.setMaximumItemCount(0);
        timeSeries36.setDescription("Time");
        timeSeries36.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection46 = timeSeries45.getTimePeriods();
        boolean boolean48 = timeSeries45.equals((java.lang.Object) 100.0d);
        timeSeries45.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries45.removeChangeListener(seriesChangeListener51);
        java.lang.String str53 = timeSeries45.getDescription();
        boolean boolean54 = timeSeries45.getNotify();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries36.addAndOrUpdate(timeSeries45);
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries14.addAndOrUpdate(timeSeries36);
        java.lang.Class<?> wildcardClass57 = timeSeries14.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) -1 + "'", comparable20, (byte) -1);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        timeSeries1.setDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        timeSeries1.timePeriodClass = class13;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener16);
        long long18 = timeSeries1.getMaximumItemAge();
        java.lang.String str19 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int22 = timeSeries21.getMaximumItemCount();
        int int23 = timeSeries21.getMaximumItemCount();
        java.lang.Object obj24 = timeSeries21.clone();
        timeSeries21.clear();
        java.util.List list26 = timeSeries21.data;
        timeSeries1.data = list26;
        int int28 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener6);
        timeSeries2.setKey((java.lang.Comparable) "");
        java.lang.Object obj10 = timeSeries2.clone();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass11);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = timeSeries12.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean12 = timeSeries11.getNotify();
        int int13 = timeSeries11.getMaximumItemCount();
        java.util.List list14 = timeSeries11.data;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries11.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        java.lang.String str23 = timeSeries19.getRangeDescription();
        timeSeries19.fireSeriesChanged();
        java.lang.Class class25 = timeSeries19.getTimePeriodClass();
        timeSeries17.timePeriodClass = class25;
        java.lang.Class class27 = timeSeries17.getTimePeriodClass();
        java.lang.String str28 = timeSeries17.getDomainDescription();
        java.util.List list29 = timeSeries17.getItems();
        java.lang.Class class30 = timeSeries17.getTimePeriodClass();
        timeSeries1.timePeriodClass = class30;
        boolean boolean32 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod33, (java.lang.Number) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Time" + "'", str28, "Time");
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        java.lang.Class class23 = timeSeries19.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class23);
        timeSeries1.timePeriodClass = class23;
        java.util.Collection collection28 = timeSeries1.getTimePeriods();
        boolean boolean29 = timeSeries1.isEmpty();
        java.lang.String str30 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = timeSeries1.getValue(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        boolean boolean8 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        timeSeries1.setMaximumItemAge(10L);
        timeSeries1.setMaximumItemCount(2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries1.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        long long8 = timeSeries1.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries1.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "Time", class14);
        timeSeries17.setNotify(true);
        timeSeries17.clear();
        boolean boolean21 = timeSeries17.getNotify();
        long long22 = timeSeries17.getMaximumItemAge();
        java.lang.Class class23 = timeSeries17.timePeriodClass;
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class23);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        timeSeries1.clear();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod14, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod25, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.util.List list4 = timeSeries1.getItems();
        int int5 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod6, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        java.lang.Class class7 = timeSeries5.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class7);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class7);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries9.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        boolean boolean6 = timeSeries3.equals((java.lang.Object) 100.0d);
        timeSeries3.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        timeSeries10.setNotify(true);
        boolean boolean14 = timeSeries3.equals((java.lang.Object) timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class17 = timeSeries16.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries16.addChangeListener(seriesChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class22 = timeSeries21.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries21.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries16.addAndOrUpdate(timeSeries21);
        java.util.Collection collection26 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        timeSeries21.clear();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean30 = timeSeries29.getNotify();
        java.util.List list31 = timeSeries29.getItems();
        timeSeries21.data = list31;
        java.lang.Object obj33 = null;
        boolean boolean34 = timeSeries21.equals(obj33);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class38 = timeSeries37.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries37.addChangeListener(seriesChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class43 = timeSeries42.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries42.addChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries37.addAndOrUpdate(timeSeries42);
        java.lang.String str47 = timeSeries46.getDescription();
        java.lang.Class class48 = timeSeries46.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class48);
        timeSeries21.timePeriodClass = class48;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, class48);
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class48);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(class43);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(class48);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        java.lang.Class class4 = timeSeries1.timePeriodClass;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class4);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        java.lang.Class class11 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        timeSeries14.removeAgedItems(true);
        boolean boolean18 = timeSeries12.equals((java.lang.Object) timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class24 = timeSeries23.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries23.addChangeListener(seriesChangeListener25);
        java.lang.Class class27 = timeSeries23.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class27);
        java.lang.Comparable comparable29 = timeSeries28.getKey();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean32 = timeSeries31.getNotify();
        timeSeries31.setMaximumItemCount(0);
        timeSeries31.setDescription("Time");
        timeSeries31.setMaximumItemCount((int) (short) 1);
        java.util.Collection collection39 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries14.addAndOrUpdate(timeSeries28);
        boolean boolean41 = timeSeries40.isEmpty();
        java.util.List list42 = timeSeries40.data;
        timeSeries1.data = list42;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 10 + "'", comparable29, 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries7.createCopy((int) '#', (int) (byte) 100);
        boolean boolean17 = timeSeries7.getNotify();
        java.util.List list18 = timeSeries7.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries7.addOrUpdate(regularTimePeriod19, (java.lang.Number) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class5);
        java.lang.Object obj7 = timeSeries6.clone();
        long long8 = timeSeries6.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries6.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries13.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries20.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        boolean boolean34 = timeSeries31.equals((java.lang.Object) 100.0d);
        timeSeries31.setMaximumItemAge((long) 'a');
        boolean boolean37 = timeSeries20.equals((java.lang.Object) timeSeries31);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries13.addAndOrUpdate(timeSeries20);
        java.lang.Class<?> wildcardClass41 = timeSeries13.getClass();
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        java.lang.Comparable comparable12 = timeSeries10.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries10.addOrUpdate(regularTimePeriod13, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Overwritten values from: 10.0" + "'", comparable12, "Overwritten values from: 10.0");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.fireSeriesChanged();
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod10, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        timeSeries1.removeAgedItems((long) '4', true);
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        java.lang.Class<?> wildcardClass9 = timeSeries1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        timeSeries1.setRangeDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries8 = timeSeries1.createCopy(regularTimePeriod6, regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries2.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries8.addAndOrUpdate(timeSeries13);
        java.lang.Class class18 = timeSeries17.getTimePeriodClass();
        timeSeries2.timePeriodClass = class18;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class18);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean23 = timeSeries22.getNotify();
        int int24 = timeSeries22.getMaximumItemCount();
        java.util.List list25 = timeSeries22.data;
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries22.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class31 = timeSeries30.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries30.addChangeListener(seriesChangeListener32);
        java.lang.String str34 = timeSeries30.getRangeDescription();
        timeSeries30.fireSeriesChanged();
        java.lang.Class class36 = timeSeries30.getTimePeriodClass();
        timeSeries28.timePeriodClass = class36;
        timeSeries20.timePeriodClass = class36;
        timeSeries20.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.add(regularTimePeriod41, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(class36);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj3 = timeSeries1.clone();
        int int4 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) (byte) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.getDataItem((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries14.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries14.createCopy((int) (short) 0, (int) (byte) 100);
        timeSeries19.clear();
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod22, (double) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        int int11 = timeSeries1.getMaximumItemCount();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        timeSeries14.setMaximumItemCount(0);
        timeSeries14.setDescription("Time");
        java.lang.Comparable comparable20 = timeSeries14.getKey();
        timeSeries14.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        java.util.List list26 = timeSeries24.getItems();
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries24.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection30 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.util.Collection collection31 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        timeSeries14.setNotify(true);
        boolean boolean34 = timeSeries14.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener35);
        java.lang.Comparable comparable37 = timeSeries14.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) -1 + "'", comparable20, (byte) -1);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + 2147483647 + "'", comparable37, 2147483647);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        timeSeries10.fireSeriesChanged();
        timeSeries10.setDescription("");
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries10.removePropertyChangeListener(propertyChangeListener15);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        java.lang.Class class7 = timeSeries5.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries10.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries8.addAndOrUpdate(timeSeries10);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, class16);
        java.lang.Comparable comparable18 = timeSeries17.getKey();
        timeSeries17.setMaximumItemAge(0L);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 100 + "'", comparable18, 100);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        int int16 = timeSeries14.getMaximumItemCount();
        java.util.List list17 = timeSeries14.data;
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries14.createCopy((int) '4', (int) (short) 100);
        java.util.Collection collection21 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        long long22 = timeSeries14.getMaximumItemAge();
        int int23 = timeSeries14.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = timeSeries14.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.lang.String str11 = timeSeries10.getDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean14 = timeSeries13.getNotify();
        int int15 = timeSeries13.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener16);
        boolean boolean18 = timeSeries10.equals((java.lang.Object) propertyChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class22 = timeSeries21.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries21.addChangeListener(seriesChangeListener23);
        java.lang.String str25 = timeSeries21.getRangeDescription();
        boolean boolean26 = timeSeries21.isEmpty();
        boolean boolean27 = timeSeries21.isEmpty();
        timeSeries21.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class32 = timeSeries31.timePeriodClass;
        timeSeries21.timePeriodClass = class32;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", class32);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries10.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries34.add(regularTimePeriod36, (java.lang.Number) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(class32);
        org.junit.Assert.assertNotNull(timeSeries35);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries13.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries20.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        boolean boolean34 = timeSeries31.equals((java.lang.Object) 100.0d);
        timeSeries31.setMaximumItemAge((long) 'a');
        boolean boolean37 = timeSeries20.equals((java.lang.Object) timeSeries31);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries13.addAndOrUpdate(timeSeries20);
        java.lang.Object obj41 = timeSeries20.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries20.removeChangeListener(seriesChangeListener42);
        java.lang.Comparable comparable44 = timeSeries20.getKey();
        java.lang.Class<?> wildcardClass45 = comparable44.getClass();
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + 10.0f + "'", comparable44, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class14);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), class14);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, class14);
        timeSeries19.setMaximumItemAge((long) '4');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(timeSeriesDataItem22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        java.lang.Class class23 = timeSeries19.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class23);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class23);
        timeSeries1.timePeriodClass = class23;
        java.util.Collection collection28 = timeSeries1.getTimePeriods();
        timeSeries1.setDescription("");
        long long31 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemAge(1L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries36 = timeSeries1.createCopy(regularTimePeriod34, regularTimePeriod35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean6 = timeSeries5.getNotify();
        int int7 = timeSeries5.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener8);
        java.util.List list10 = timeSeries5.data;
        timeSeries1.data = list10;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries1.removeChangeListener(seriesChangeListener12);
        timeSeries1.removeAgedItems(1L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries1.getDataItem(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class5);
        java.lang.Object obj7 = timeSeries6.clone();
        long long8 = timeSeries6.getMaximumItemAge();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener9);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.delete(100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (short) 0, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 10 + "'", comparable6, (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        timeSeries7.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class18);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class18);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int23 = timeSeries22.getMaximumItemCount();
        java.lang.Object obj24 = timeSeries22.clone();
        timeSeries22.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries22.removePropertyChangeListener(propertyChangeListener27);
        java.util.Collection collection29 = timeSeries20.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        timeSeries20.setKey((java.lang.Comparable) 9223372036854775807L);
        boolean boolean32 = timeSeries7.equals((java.lang.Object) timeSeries20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.add(regularTimePeriod33, (java.lang.Number) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        timeSeries1.timePeriodClass = class13;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener16);
        timeSeries1.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries21.removePropertyChangeListener(propertyChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int26 = timeSeries25.getMaximumItemCount();
        java.lang.Comparable comparable27 = timeSeries25.getKey();
        java.util.List list28 = timeSeries25.getItems();
        timeSeries21.data = list28;
        boolean boolean30 = timeSeries1.equals((java.lang.Object) timeSeries21);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int33 = timeSeries32.getMaximumItemCount();
        int int34 = timeSeries32.getMaximumItemCount();
        java.lang.Object obj35 = timeSeries32.clone();
        timeSeries32.clear();
        java.lang.Comparable comparable37 = timeSeries32.getKey();
        long long38 = timeSeries32.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean43 = timeSeries42.getNotify();
        int int44 = timeSeries42.getMaximumItemCount();
        timeSeries42.setRangeDescription("hi!");
        java.lang.Class class47 = timeSeries42.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class47);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, class47);
        boolean boolean50 = timeSeries32.equals((java.lang.Object) class47);
        timeSeries21.timePeriodClass = class47;
        timeSeries21.setKey((java.lang.Comparable) 2147483647);
        timeSeries21.setRangeDescription("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (byte) 10 + "'", comparable27, (byte) 10);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + (byte) 10 + "'", comparable37, (byte) 10);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 9223372036854775807L + "'", long38 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(class47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int22 = timeSeries21.getMaximumItemCount();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        java.util.List list24 = timeSeries21.getItems();
        timeSeries17.data = list24;
        boolean boolean26 = timeSeries15.equals((java.lang.Object) timeSeries17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = timeSeries17.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 10 + "'", comparable23, (byte) 10);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (byte) 0, 2147483647);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Comparable comparable14 = timeSeries12.getKey();
        java.util.List list15 = timeSeries12.getItems();
        timeSeries8.data = list15;
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries6.addAndOrUpdate(timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean20 = timeSeries19.getNotify();
        int int21 = timeSeries19.getMaximumItemCount();
        java.util.List list22 = timeSeries19.data;
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries27.addChangeListener(seriesChangeListener29);
        java.lang.Class class31 = timeSeries27.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class31);
        timeSeries19.timePeriodClass = class31;
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener34);
        timeSeries19.setDescription("hi!");
        java.util.Collection collection38 = timeSeries19.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries19.addChangeListener(seriesChangeListener39);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries6.addAndOrUpdate(timeSeries19);
        timeSeries19.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.add(regularTimePeriod44, (java.lang.Number) 2147483647, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (byte) 10 + "'", comparable14, (byte) 10);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(timeSeries41);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries10.setMaximumItemCount((int) (short) 1);
        timeSeries10.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete((int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        long long8 = timeSeries1.getMaximumItemAge();
        timeSeries1.setDomainDescription("");
        java.lang.String str11 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries13.removePropertyChangeListener(propertyChangeListener14);
        boolean boolean16 = timeSeries13.getNotify();
        java.lang.String str17 = timeSeries13.getRangeDescription();
        java.util.List list18 = timeSeries13.getItems();
        timeSeries1.data = list18;
        java.lang.String str20 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod21, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true, class6);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        boolean boolean5 = timeSeries1.getNotify();
        timeSeries1.removeAgedItems((long) 2147483647, false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (short) 10, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries7.createCopy((int) '#', (int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.lang.String str22 = timeSeries18.getRangeDescription();
        boolean boolean23 = timeSeries18.isEmpty();
        boolean boolean24 = timeSeries18.isEmpty();
        timeSeries18.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class29 = timeSeries28.timePeriodClass;
        timeSeries18.timePeriodClass = class29;
        timeSeries7.timePeriodClass = class29;
        java.lang.Class class32 = timeSeries7.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries7.addChangeListener(seriesChangeListener33);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(class29);
        org.junit.Assert.assertNotNull(class32);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries8.setRangeDescription("Value");
        boolean boolean11 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod5, (java.lang.Number) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        boolean boolean8 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        timeSeries1.setMaximumItemAge(10L);
        java.lang.Class class13 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.String str7 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean10 = timeSeries9.getNotify();
        int int11 = timeSeries9.getMaximumItemCount();
        java.util.List list12 = timeSeries9.data;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries17.addChangeListener(seriesChangeListener19);
        java.lang.Class class21 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class21);
        timeSeries9.timePeriodClass = class21;
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener24);
        timeSeries9.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries1.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener31);
        boolean boolean33 = timeSeries30.getNotify();
        java.lang.String str34 = timeSeries30.getRangeDescription();
        java.util.List list35 = timeSeries30.getItems();
        timeSeries1.data = list35;
        boolean boolean37 = timeSeries1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Value" + "'", str34, "Value");
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemCount(2147483647);
        boolean boolean10 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemAge((long) 10);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int6 = timeSeries5.getMaximumItemCount();
        int int7 = timeSeries5.getMaximumItemCount();
        java.lang.Object obj8 = timeSeries5.clone();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        timeSeries10.setDomainDescription("");
        boolean boolean14 = timeSeries5.equals((java.lang.Object) timeSeries10);
        int int15 = timeSeries5.getMaximumItemCount();
        timeSeries5.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean19 = timeSeries18.getNotify();
        timeSeries18.setMaximumItemCount(0);
        timeSeries18.setDescription("Time");
        java.lang.Comparable comparable24 = timeSeries18.getKey();
        timeSeries18.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class29 = timeSeries28.timePeriodClass;
        java.util.List list30 = timeSeries28.getItems();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries28.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection34 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries33);
        java.util.Collection collection35 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        timeSeries18.setNotify(true);
        java.lang.Class class38 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "hi!", "Overwritten values from: 10.0", class38);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, class38);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries40.delete(regularTimePeriod41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (byte) -1 + "'", comparable24, (byte) -1);
        org.junit.Assert.assertNotNull(class29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(class38);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.util.List list4 = timeSeries1.getItems();
        timeSeries1.setKey((java.lang.Comparable) 0L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        timeSeries1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 10 + "'", comparable3, (byte) 10);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries2.addAndOrUpdate(timeSeries7);
        java.lang.String str12 = timeSeries11.getDescription();
        java.lang.Class class13 = timeSeries11.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class13);
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries14.removePropertyChangeListener(propertyChangeListener15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(regularTimePeriod17, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries2.getRangeDescription();
        boolean boolean7 = timeSeries2.isEmpty();
        boolean boolean8 = timeSeries2.isEmpty();
        timeSeries2.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        timeSeries2.timePeriodClass = class13;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class13);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.removeChangeListener(seriesChangeListener16);
        timeSeries15.removeAgedItems((long) (short) 1, false);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setKey((java.lang.Comparable) (byte) -1);
        timeSeries1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemAge((long) 'a');
        boolean boolean18 = timeSeries1.equals((java.lang.Object) timeSeries12);
        timeSeries1.removeAgedItems(true);
        timeSeries1.fireSeriesChanged();
        long long22 = timeSeries1.getMaximumItemAge();
        timeSeries1.clear();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        java.lang.Class class24 = timeSeries20.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class24);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class24);
        timeSeries10.timePeriodClass = class24;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeries10.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class24);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries2.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries8.addAndOrUpdate(timeSeries13);
        java.lang.Class class18 = timeSeries17.getTimePeriodClass();
        timeSeries2.timePeriodClass = class18;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class18);
        timeSeries20.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class24 = timeSeries23.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries23.addChangeListener(seriesChangeListener25);
        java.lang.Class class27 = timeSeries23.getTimePeriodClass();
        boolean boolean28 = timeSeries20.equals((java.lang.Object) class27);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.add(timeSeriesDataItem29, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.addChangeListener(seriesChangeListener6);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries1.getDescription();
        boolean boolean11 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.util.Collection collection24 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        timeSeries19.clear();
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.createCopy(1, (int) (byte) 100);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener29);
        long long31 = timeSeries19.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = timeSeries19.getDataItem(regularTimePeriod32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean3 = timeSeries2.getNotify();
        int int4 = timeSeries2.getMaximumItemCount();
        timeSeries2.setRangeDescription("hi!");
        java.lang.Class class7 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, class7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeSeries8.getIndex(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemAge((long) 'a');
        boolean boolean18 = timeSeries1.equals((java.lang.Object) timeSeries12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries1.addChangeListener(seriesChangeListener19);
        timeSeries1.setRangeDescription("Time");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int22 = timeSeries21.getMaximumItemCount();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        java.util.List list24 = timeSeries21.getItems();
        timeSeries17.data = list24;
        boolean boolean26 = timeSeries15.equals((java.lang.Object) timeSeries17);
        timeSeries17.setMaximumItemAge((long) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener29);
        timeSeries17.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener33);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 10 + "'", comparable23, (byte) 10);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        long long8 = timeSeries1.getMaximumItemAge();
        timeSeries1.setDomainDescription("");
        java.lang.String str11 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries13.removePropertyChangeListener(propertyChangeListener14);
        boolean boolean16 = timeSeries13.getNotify();
        java.lang.String str17 = timeSeries13.getRangeDescription();
        java.util.List list18 = timeSeries13.getItems();
        timeSeries1.data = list18;
        java.lang.String str20 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number22 = timeSeries1.getValue(regularTimePeriod21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Value" + "'", str20, "Value");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.addChangeListener(seriesChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean10 = timeSeries9.getNotify();
        int int11 = timeSeries9.getMaximumItemCount();
        java.util.List list12 = timeSeries9.data;
        timeSeries9.setMaximumItemCount((int) (byte) 10);
        timeSeries9.setRangeDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries1.addAndOrUpdate(timeSeries9);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = timeSeries9.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.util.List list4 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, (double) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 10 + "'", comparable3, (byte) 10);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean5 = timeSeries4.getNotify();
        timeSeries4.setMaximumItemCount(0);
        timeSeries4.setDescription("Time");
        java.lang.Comparable comparable10 = timeSeries4.getKey();
        long long11 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        java.lang.Class class18 = timeSeries16.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class18);
        timeSeries4.timePeriodClass = class18;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Overwritten values from: 10.0", "Overwritten values from: 10.0", class18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (byte) -1 + "'", comparable10, (byte) -1);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 9223372036854775807L + "'", long11 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(class18);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
        int int6 = timeSeries1.getItemCount();
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Object obj14 = timeSeries12.clone();
        timeSeries12.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener17);
        java.util.Collection collection19 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        java.lang.Class class20 = timeSeries12.getTimePeriodClass();
        timeSeries12.setMaximumItemCount((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.delete((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(class20);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        java.lang.String str8 = timeSeries1.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, (double) (-1L), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries13.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeSeries13.getIndex(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.removeAgedItems(true);
        boolean boolean13 = timeSeries7.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.lang.Class class22 = timeSeries18.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class22);
        java.lang.Comparable comparable24 = timeSeries23.getKey();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean27 = timeSeries26.getNotify();
        timeSeries26.setMaximumItemCount(0);
        timeSeries26.setDescription("Time");
        timeSeries26.setMaximumItemCount((int) (short) 1);
        java.util.Collection collection34 = timeSeries23.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries9.addAndOrUpdate(timeSeries23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = timeSeries9.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + 10 + "'", comparable24, 10);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(timeSeries35);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries6.setRangeDescription("Overwritten values from: 10.0");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.add(regularTimePeriod13, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries2.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        int int14 = timeSeries12.getMaximumItemCount();
        java.util.List list15 = timeSeries12.data;
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries12.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        java.lang.String str24 = timeSeries20.getRangeDescription();
        timeSeries20.fireSeriesChanged();
        java.lang.Class class26 = timeSeries20.getTimePeriodClass();
        timeSeries18.timePeriodClass = class26;
        java.lang.Class class28 = timeSeries18.getTimePeriodClass();
        java.lang.String str29 = timeSeries18.getDomainDescription();
        java.util.List list30 = timeSeries18.getItems();
        java.lang.Class class31 = timeSeries18.getTimePeriodClass();
        timeSeries2.timePeriodClass = class31;
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class31);
        timeSeries33.fireSeriesChanged();
        java.lang.Class<?> wildcardClass35 = timeSeries33.getClass();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Time" + "'", str29, "Time");
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 0, (int) (byte) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeSeries1.getIndex(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.lang.String str3 = timeSeries2.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries5.addAndOrUpdate(timeSeries10);
        java.lang.Class class15 = timeSeries14.getTimePeriodClass();
        timeSeries2.timePeriodClass = class15;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class25);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class25);
        timeSeries2.timePeriodClass = class25;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class25);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        boolean boolean5 = timeSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.removeChangeListener(seriesChangeListener6);
        timeSeries1.fireSeriesChanged();
        int int9 = timeSeries1.getItemCount();
        long long10 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries1.addOrUpdate(regularTimePeriod11, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.String str7 = timeSeries1.getDomainDescription();
        timeSeries1.setNotify(true);
        java.lang.Comparable comparable10 = timeSeries1.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.createCopy(regularTimePeriod11, regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Time" + "'", str7, "Time");
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (byte) -1 + "'", comparable10, (byte) -1);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries17.removePropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int22 = timeSeries21.getMaximumItemCount();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        java.util.List list24 = timeSeries21.getItems();
        timeSeries17.data = list24;
        boolean boolean26 = timeSeries15.equals((java.lang.Object) timeSeries17);
        timeSeries17.setMaximumItemAge((long) (short) 100);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection33 = timeSeries32.getTimePeriods();
        boolean boolean35 = timeSeries32.equals((java.lang.Object) 100.0d);
        timeSeries32.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection40 = timeSeries39.getTimePeriods();
        timeSeries39.setNotify(true);
        boolean boolean43 = timeSeries32.equals((java.lang.Object) timeSeries39);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class46 = timeSeries45.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        timeSeries45.addChangeListener(seriesChangeListener47);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class51 = timeSeries50.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries50.addChangeListener(seriesChangeListener52);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries45.addAndOrUpdate(timeSeries50);
        java.util.Collection collection55 = timeSeries39.getTimePeriodsUniqueToOtherSeries(timeSeries50);
        timeSeries50.clear();
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean59 = timeSeries58.getNotify();
        java.util.List list60 = timeSeries58.getItems();
        timeSeries50.data = list60;
        java.lang.Object obj62 = null;
        boolean boolean63 = timeSeries50.equals(obj62);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener64 = null;
        timeSeries50.removeChangeListener(seriesChangeListener64);
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries17.addAndOrUpdate(timeSeries50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number68 = timeSeries66.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 10 + "'", comparable23, (byte) 10);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(class46);
        org.junit.Assert.assertNotNull(class51);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(list60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(timeSeries66);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Object obj14 = timeSeries12.clone();
        timeSeries12.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener17);
        java.util.Collection collection19 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        java.lang.Class class20 = timeSeries12.getTimePeriodClass();
        timeSeries12.setMaximumItemCount((int) 'a');
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean25 = timeSeries24.getNotify();
        int int26 = timeSeries24.getMaximumItemCount();
        java.util.List list27 = timeSeries24.data;
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries24.createCopy((int) '4', (int) (short) 100);
        long long31 = timeSeries24.getMaximumItemAge();
        boolean boolean32 = timeSeries12.equals((java.lang.Object) long31);
        timeSeries12.clear();
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setKey((java.lang.Comparable) 10L);
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.getDataItem(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setKey((java.lang.Comparable) 10L);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        timeSeries1.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class20);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int25 = timeSeries24.getMaximumItemCount();
        java.lang.Object obj26 = timeSeries24.clone();
        timeSeries24.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries24.removePropertyChangeListener(propertyChangeListener29);
        java.util.Collection collection31 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        java.util.List list32 = timeSeries22.getItems();
        timeSeries22.removeAgedItems(false);
        java.util.Collection collection35 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = timeSeries1.getValue(regularTimePeriod36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        timeSeries1.clear();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemAge((long) 'a');
        boolean boolean18 = timeSeries1.equals((java.lang.Object) timeSeries12);
        timeSeries1.removeAgedItems(true);
        java.lang.String str21 = timeSeries1.getRangeDescription();
        java.util.Collection collection22 = timeSeries1.getTimePeriods();
        java.lang.Class<?> wildcardClass23 = collection22.getClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int5 = timeSeries4.getMaximumItemCount();
        java.lang.Object obj6 = timeSeries4.clone();
        timeSeries4.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener9);
        java.lang.Class<?> wildcardClass11 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Value", "Overwritten values from: 10.0", (java.lang.Class) wildcardClass11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.setRangeDescription("Value");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class<?> wildcardClass3 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass3);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        java.lang.Class class11 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        timeSeries14.removeAgedItems(true);
        boolean boolean18 = timeSeries12.equals((java.lang.Object) timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class24 = timeSeries23.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries23.addChangeListener(seriesChangeListener25);
        java.lang.Class class27 = timeSeries23.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class27);
        java.lang.Comparable comparable29 = timeSeries28.getKey();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean32 = timeSeries31.getNotify();
        timeSeries31.setMaximumItemCount(0);
        timeSeries31.setDescription("Time");
        timeSeries31.setMaximumItemCount((int) (short) 1);
        java.util.Collection collection39 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries14.addAndOrUpdate(timeSeries28);
        boolean boolean41 = timeSeries40.isEmpty();
        java.lang.String str42 = timeSeries40.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries4.addAndOrUpdate(timeSeries40);
        boolean boolean44 = timeSeries43.getNotify();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 10 + "'", comparable29, 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value" + "'", str42, "Value");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        timeSeries1.timePeriodClass = class13;
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener16);
        timeSeries1.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries1.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem17 = timeSeries15.getDataItem(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries5.addAndOrUpdate(timeSeries10);
        java.lang.Class class15 = timeSeries14.getTimePeriodClass();
        timeSeries1.timePeriodClass = class15;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class11);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries13.createCopy(regularTimePeriod14, regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean3 = timeSeries2.getNotify();
        int int4 = timeSeries2.getMaximumItemCount();
        timeSeries2.setRangeDescription("hi!");
        java.lang.Class class7 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class7);
        int int9 = timeSeries8.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries8.getDataItem(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class8);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        java.lang.Object obj14 = timeSeries12.clone();
        timeSeries12.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries12.removePropertyChangeListener(propertyChangeListener17);
        java.util.Collection collection19 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries12);
        java.lang.Class class20 = timeSeries12.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries12.addPropertyChangeListener(propertyChangeListener21);
        timeSeries12.setMaximumItemAge((long) '#');
        timeSeries12.clear();
        java.lang.Class class27 = null;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", class27);
        boolean boolean29 = timeSeries12.equals((java.lang.Object) timeSeries28);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries28.addPropertyChangeListener(propertyChangeListener30);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class12);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean18 = timeSeries17.getNotify();
        int int19 = timeSeries17.getMaximumItemCount();
        timeSeries17.setRangeDescription("hi!");
        java.lang.Class class22 = timeSeries17.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class22);
        timeSeries14.timePeriodClass = class22;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class22);
        java.lang.Class<?> wildcardClass26 = timeSeries25.getClass();
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries13.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries20.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        boolean boolean34 = timeSeries31.equals((java.lang.Object) 100.0d);
        timeSeries31.setMaximumItemAge((long) 'a');
        boolean boolean37 = timeSeries20.equals((java.lang.Object) timeSeries31);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries13.addAndOrUpdate(timeSeries20);
        boolean boolean41 = timeSeries20.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number43 = timeSeries20.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        java.lang.Class class16 = null;
        timeSeries13.timePeriodClass = class16;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod18, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries13.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries20.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        boolean boolean34 = timeSeries31.equals((java.lang.Object) 100.0d);
        timeSeries31.setMaximumItemAge((long) 'a');
        boolean boolean37 = timeSeries20.equals((java.lang.Object) timeSeries31);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries13.addAndOrUpdate(timeSeries20);
        java.lang.Object obj41 = timeSeries20.clone();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries20.removeChangeListener(seriesChangeListener42);
        java.lang.Comparable comparable44 = timeSeries20.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem47 = timeSeries20.addOrUpdate(regularTimePeriod45, (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + 10.0f + "'", comparable44, 10.0f);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.fireSeriesChanged();
        java.lang.String str5 = timeSeries1.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries8 = timeSeries1.createCopy(regularTimePeriod6, regularTimePeriod7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries13.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries20.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        boolean boolean34 = timeSeries31.equals((java.lang.Object) 100.0d);
        timeSeries31.setMaximumItemAge((long) 'a');
        boolean boolean37 = timeSeries20.equals((java.lang.Object) timeSeries31);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries13.addAndOrUpdate(timeSeries20);
        java.lang.Comparable comparable41 = timeSeries20.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.add(regularTimePeriod42, (double) 2147483647, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + 10.0f + "'", comparable41, 10.0f);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "", "Time", class11);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener11);
        java.util.List list13 = timeSeries1.data;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemAge((long) 'a');
        int int7 = timeSeries1.getItemCount();
        timeSeries1.setRangeDescription("Value");
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        int int16 = timeSeries14.getMaximumItemCount();
        java.util.List list17 = timeSeries14.data;
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries14.createCopy((int) '4', (int) (short) 100);
        java.util.Collection collection21 = timeSeries5.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        int int22 = timeSeries14.getItemCount();
        java.lang.Comparable comparable23 = timeSeries14.getKey();
        java.util.Collection collection24 = timeSeries14.getTimePeriods();
        java.lang.Class class25 = timeSeries14.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries14.addOrUpdate(regularTimePeriod26, (java.lang.Number) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) -1 + "'", comparable23, (byte) -1);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(class25);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class11);
        boolean boolean13 = timeSeries1.equals((java.lang.Object) "Time");
        int int14 = timeSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries1.removeChangeListener(seriesChangeListener15);
        long long17 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod9, (double) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 10 + "'", comparable6, (byte) 10);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries10.setMaximumItemCount((int) (short) 1);
        timeSeries10.setDomainDescription("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = timeSeries10.getDataItem(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        long long6 = timeSeries1.getMaximumItemAge();
        java.util.List list7 = timeSeries1.getItems();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        timeSeries1.setDomainDescription("Time");
        boolean boolean13 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries1.getValue(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        boolean boolean5 = timeSeries2.equals((java.lang.Object) 100.0d);
        timeSeries2.fireSeriesChanged();
        timeSeries2.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries15.addChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.addAndOrUpdate(timeSeries15);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries29.addChangeListener(seriesChangeListener31);
        java.lang.Class class33 = timeSeries29.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class33);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class33);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class33);
        timeSeries19.timePeriodClass = class33;
        timeSeries2.timePeriodClass = class33;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, class33);
        timeSeries39.setRangeDescription("");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(class33);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L));
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = timeSeries1.getValue(regularTimePeriod3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        java.lang.Object obj7 = timeSeries1.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries1.getValue((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 10, (int) '4');
        timeSeries6.clear();
        java.lang.String str8 = timeSeries6.getDescription();
        java.lang.Class class9 = timeSeries6.getTimePeriodClass();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        timeSeries1.timePeriodClass = class12;
        java.lang.Object obj15 = timeSeries1.clone();
        timeSeries1.setMaximumItemAge((long) (short) 100);
        timeSeries1.setMaximumItemAge(10L);
        int int20 = timeSeries1.getItemCount();
        timeSeries1.setKey((java.lang.Comparable) 10.0f);
        timeSeries1.removeAgedItems((long) (byte) 1, true);
        java.lang.String str26 = timeSeries1.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod27, (java.lang.Number) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Time" + "'", str26, "Time");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        java.util.List list13 = timeSeries11.getItems();
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries11.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection17 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries16);
        boolean boolean18 = timeSeries16.isEmpty();
        timeSeries16.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.setMaximumItemAge((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem4 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        int int7 = timeSeries1.getItemCount();
        timeSeries1.removeAgedItems(false);
        java.util.List list10 = timeSeries1.data;
        boolean boolean11 = timeSeries1.getNotify();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.clear();
        timeSeries1.setDomainDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries11);
        timeSeries11.setKey((java.lang.Comparable) '4');
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int6 = timeSeries5.getMaximumItemCount();
        java.lang.Comparable comparable7 = timeSeries5.getKey();
        java.util.List list8 = timeSeries5.getItems();
        timeSeries1.data = list8;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.removeChangeListener(seriesChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        boolean boolean10 = timeSeries1.getNotify();
        java.lang.Class class11 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries1.getDataItem(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries5.addAndOrUpdate(timeSeries10);
        java.lang.Class class15 = timeSeries14.getTimePeriodClass();
        timeSeries1.timePeriodClass = class15;
        timeSeries1.removeAgedItems(false);
        timeSeries1.setMaximumItemAge((long) 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj3 = timeSeries1.clone();
        timeSeries1.setDomainDescription("Value");
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        boolean boolean11 = timeSeries8.equals((java.lang.Object) 100.0d);
        timeSeries8.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        timeSeries15.setNotify(true);
        boolean boolean19 = timeSeries8.equals((java.lang.Object) timeSeries15);
        timeSeries15.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class30);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class30);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int35 = timeSeries34.getMaximumItemCount();
        java.lang.Object obj36 = timeSeries34.clone();
        timeSeries34.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries34.removePropertyChangeListener(propertyChangeListener39);
        java.util.Collection collection41 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries34);
        java.lang.Class class42 = timeSeries34.getTimePeriodClass();
        java.util.Collection collection43 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries1.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class47 = timeSeries46.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener48 = null;
        timeSeries46.addChangeListener(seriesChangeListener48);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class52 = timeSeries51.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        timeSeries51.addChangeListener(seriesChangeListener53);
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries46.addAndOrUpdate(timeSeries51);
        timeSeries46.setMaximumItemCount(1);
        org.jfree.data.time.TimeSeries timeSeries58 = timeSeries34.addAndOrUpdate(timeSeries46);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod59 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries34.add(regularTimePeriod59, (double) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 10 + "'", comparable6, (byte) 10);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(class47);
        org.junit.Assert.assertNotNull(class52);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertNotNull(timeSeries58);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class13);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class13);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), class13);
        timeSeries17.clear();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries20.addAndOrUpdate(timeSeries25);
        timeSeries25.fireSeriesChanged();
        timeSeries25.clear();
        boolean boolean32 = timeSeries17.equals((java.lang.Object) timeSeries25);
        java.lang.Class class33 = timeSeries25.timePeriodClass;
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(class33);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean4 = timeSeries3.getNotify();
        int int5 = timeSeries3.getMaximumItemCount();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, class8);
        boolean boolean11 = timeSeries10.isEmpty();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(timeSeriesDataItem12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries1.setMaximumItemCount((int) (short) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries1.removeChangeListener(seriesChangeListener13);
        java.lang.String str15 = timeSeries1.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.Class class5 = timeSeries1.getTimePeriodClass();
        timeSeries1.setNotify(false);
        java.lang.Comparable comparable8 = timeSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0f + "'", comparable8, 10.0f);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        java.lang.String str8 = timeSeries1.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        java.lang.Class class11 = timeSeries10.getTimePeriodClass();
        timeSeries10.fireSeriesChanged();
        timeSeries10.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.add(regularTimePeriod15, (java.lang.Number) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean7 = timeSeries1.equals((java.lang.Object) (short) 10);
        boolean boolean8 = timeSeries1.getNotify();
        java.lang.Object obj9 = timeSeries1.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        java.lang.Class class7 = timeSeries5.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.String str14 = timeSeries10.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries8.addAndOrUpdate(timeSeries10);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, class16);
        boolean boolean18 = timeSeries17.getNotify();
        java.util.List list19 = timeSeries17.getItems();
        java.lang.String str20 = timeSeries17.getDomainDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries17.createCopy(regularTimePeriod21, regularTimePeriod22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries13.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries13.addPropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries20.addAndOrUpdate(timeSeries25);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        boolean boolean34 = timeSeries31.equals((java.lang.Object) 100.0d);
        timeSeries31.setMaximumItemAge((long) 'a');
        boolean boolean37 = timeSeries20.equals((java.lang.Object) timeSeries31);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries13.addAndOrUpdate(timeSeries20);
        java.lang.Comparable comparable41 = timeSeries20.getKey();
        java.lang.Object obj42 = timeSeries20.clone();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries20.addOrUpdate(regularTimePeriod43, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + 10.0f + "'", comparable41, 10.0f);
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class<?> wildcardClass3 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass3);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        java.lang.Class class11 = timeSeries9.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        timeSeries14.removeAgedItems(true);
        boolean boolean18 = timeSeries12.equals((java.lang.Object) timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class24 = timeSeries23.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries23.addChangeListener(seriesChangeListener25);
        java.lang.Class class27 = timeSeries23.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class27);
        java.lang.Comparable comparable29 = timeSeries28.getKey();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean32 = timeSeries31.getNotify();
        timeSeries31.setMaximumItemCount(0);
        timeSeries31.setDescription("Time");
        timeSeries31.setMaximumItemCount((int) (short) 1);
        java.util.Collection collection39 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries31);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries14.addAndOrUpdate(timeSeries28);
        boolean boolean41 = timeSeries40.isEmpty();
        java.lang.String str42 = timeSeries40.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries4.addAndOrUpdate(timeSeries40);
        java.lang.Class class44 = timeSeries4.getTimePeriodClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 10 + "'", comparable29, 10);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Value" + "'", str42, "Value");
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(class44);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        boolean boolean15 = timeSeries12.equals((java.lang.Object) 100.0d);
        timeSeries12.setMaximumItemAge((long) 'a');
        boolean boolean18 = timeSeries1.equals((java.lang.Object) timeSeries12);
        java.lang.Comparable comparable19 = timeSeries12.getKey();
        timeSeries12.setMaximumItemCount(2147483647);
        timeSeries12.setKey((java.lang.Comparable) 100.0d);
        timeSeries12.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries12.removeChangeListener(seriesChangeListener26);
        timeSeries12.setNotify(false);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10.0f + "'", comparable19, 10.0f);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries5.addAndOrUpdate(timeSeries10);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        boolean boolean16 = timeSeries1.equals((java.lang.Object) timeSeries14);
        java.util.Collection collection17 = timeSeries14.getTimePeriods();
        java.lang.Class class18 = timeSeries14.getTimePeriodClass();
        java.lang.String str19 = timeSeries14.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        boolean boolean5 = timeSeries2.equals((java.lang.Object) 100.0d);
        timeSeries2.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.setNotify(true);
        boolean boolean13 = timeSeries2.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries15.addChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries15.addAndOrUpdate(timeSeries20);
        java.util.Collection collection25 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        timeSeries20.clear();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean29 = timeSeries28.getNotify();
        java.util.List list30 = timeSeries28.getItems();
        timeSeries20.data = list30;
        java.lang.Object obj32 = null;
        boolean boolean33 = timeSeries20.equals(obj32);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class37 = timeSeries36.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries36.addChangeListener(seriesChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class42 = timeSeries41.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries41.addChangeListener(seriesChangeListener43);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries36.addAndOrUpdate(timeSeries41);
        java.lang.String str46 = timeSeries45.getDescription();
        java.lang.Class class47 = timeSeries45.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class47);
        timeSeries20.timePeriodClass = class47;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, class47);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries50.removeChangeListener(seriesChangeListener51);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(class37);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(class47);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        java.util.List list8 = timeSeries7.data;
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean4 = timeSeries3.getNotify();
        int int5 = timeSeries3.getMaximumItemCount();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, class8);
        timeSeries10.setDescription("Overwritten values from: 10.0");
        timeSeries10.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class11);
        boolean boolean13 = timeSeries1.equals((java.lang.Object) "Time");
        int int14 = timeSeries1.getItemCount();
        timeSeries1.setDescription("Overwritten values from: 10.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.addChangeListener(seriesChangeListener13);
        java.lang.Class class15 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class15);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class15);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), class15);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, class15);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', class15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = timeSeries21.addOrUpdate(regularTimePeriod22, (java.lang.Number) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class15);
    }
}

