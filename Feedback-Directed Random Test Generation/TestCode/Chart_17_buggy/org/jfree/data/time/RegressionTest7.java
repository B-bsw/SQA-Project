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
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        java.lang.Comparable comparable8 = timeSeries1.getKey();
        java.lang.String str9 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + false + "'", comparable8, false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries6.removePropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean12 = timeSeries11.getNotify();
        timeSeries11.setRangeDescription("hi!");
        boolean boolean15 = timeSeries6.equals((java.lang.Object) timeSeries11);
        java.lang.Class class16 = timeSeries6.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 10", class16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, "Overwritten values from: 10", "hi!", class16);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, class6);
        long long9 = timeSeries8.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries8.getValue(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 9223372036854775807L + "'", long9 == 9223372036854775807L);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str4 = timeSeries1.getDescription();
        java.util.List list5 = timeSeries1.data;
        timeSeries1.setDescription("hi!");
        timeSeries1.setMaximumItemCount((int) (byte) 10);
        timeSeries1.setRangeDescription("hi!");
        int int12 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        boolean boolean17 = timeSeries14.equals((java.lang.Object) 100.0d);
        timeSeries14.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.addChangeListener(seriesChangeListener20);
        java.util.List list22 = timeSeries14.getItems();
        boolean boolean23 = timeSeries1.equals((java.lang.Object) timeSeries14);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        timeSeries31.setDescription("Overwritten values from: 10.0");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
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
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean32 = timeSeries31.getNotify();
        timeSeries31.setMaximumItemCount(0);
        timeSeries31.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries37.setRangeDescription("Value");
        java.lang.String str40 = timeSeries37.getDescription();
        java.lang.Comparable comparable41 = timeSeries37.getKey();
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries31.addAndOrUpdate(timeSeries37);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class46 = timeSeries45.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class46);
        timeSeries47.setDescription("Value");
        java.util.List list50 = timeSeries47.getItems();
        timeSeries42.data = list50;
        timeSeries17.data = list50;
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + 10.0f + "'", comparable41, 10.0f);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(class46);
        org.junit.Assert.assertNotNull(list50);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        java.util.List list14 = timeSeries1.data;
        timeSeries1.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        java.util.List list10 = timeSeries1.getItems();
        timeSeries1.setNotify(false);
        java.util.Collection collection13 = timeSeries1.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries16 = timeSeries1.createCopy((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        java.util.Collection collection10 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setNotify(false);
        timeSeries1.setDomainDescription("");
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener17);
        long long19 = timeSeries1.getMaximumItemAge();
        java.lang.Comparable comparable20 = timeSeries1.getKey();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 10.0f + "'", comparable20, 10.0f);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        timeSeries1.setNotify(true);
        java.lang.Class class12 = timeSeries1.timePeriodClass;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries1.getValue(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        timeSeries8.clear();
        timeSeries8.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod21, (java.lang.Number) (byte) 10, false);
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
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(timeSeriesDataItem13, false);
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
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        timeSeries8.clear();
        java.lang.String str19 = timeSeries8.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = timeSeries8.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        boolean boolean4 = timeSeries1.getNotify();
        timeSeries1.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        boolean boolean14 = timeSeries11.equals((java.lang.Object) 100.0d);
        timeSeries11.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        timeSeries18.setNotify(true);
        boolean boolean22 = timeSeries11.equals((java.lang.Object) timeSeries18);
        int int23 = timeSeries18.getItemCount();
        java.lang.Class class24 = timeSeries18.getTimePeriodClass();
        timeSeries18.setRangeDescription("Value");
        timeSeries18.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries6.addAndOrUpdate(timeSeries18);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(timeSeries29);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        int int15 = timeSeries4.getItemCount();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries4.add(timeSeriesDataItem16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 1 + "'", comparable5, (short) 1);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        timeSeries1.setKey((java.lang.Comparable) 100);
        timeSeries1.setMaximumItemAge((long) (short) 10);
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        timeSeries7.setMaximumItemCount((int) (byte) 1);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries7.removeChangeListener(seriesChangeListener11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.addChangeListener(seriesChangeListener10);
        int int12 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        boolean boolean20 = timeSeries17.equals((java.lang.Object) 100.0d);
        timeSeries17.setNotify(true);
        java.lang.Class<?> wildcardClass23 = timeSeries17.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass23);
        java.util.List list25 = timeSeries24.getItems();
        java.lang.Class<?> wildcardClass26 = timeSeries24.getClass();
        boolean boolean27 = timeSeries1.equals((java.lang.Object) timeSeries24);
        java.lang.Class class28 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int31 = timeSeries30.getMaximumItemCount();
        timeSeries30.clear();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries34.setRangeDescription("Value");
        boolean boolean37 = timeSeries34.getNotify();
        timeSeries34.setDomainDescription("Time");
        timeSeries34.clear();
        java.lang.Class class41 = timeSeries34.timePeriodClass;
        java.lang.Class class42 = timeSeries34.getTimePeriodClass();
        timeSeries30.timePeriodClass = class42;
        boolean boolean44 = timeSeries30.getNotify();
        java.util.Collection collection45 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        java.util.List list46 = timeSeries1.data;
        java.lang.String str47 = timeSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        timeSeries6.setDescription("Overwritten values from: 1");
        timeSeries6.setDomainDescription("hi!");
        timeSeries6.removeAgedItems((long) (byte) 0, false);
        java.lang.Class<?> wildcardClass17 = timeSeries6.getClass();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(true);
        timeSeries1.clear();
        timeSeries1.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class9);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Value", "Value", class9);
        boolean boolean13 = timeSeries12.getNotify();
        int int14 = timeSeries12.getMaximumItemCount();
        java.util.List list15 = timeSeries12.getItems();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.delete((int) (short) 1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        long long40 = timeSeries23.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod42 = timeSeries23.getTimePeriod((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 9223372036854775807L + "'", long40 == 9223372036854775807L);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        timeSeries1.setMaximumItemCount((int) '4');
        timeSeries1.removeAgedItems((long) (short) 10, false);
        timeSeries1.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        timeSeries15.setNotify(true);
        java.lang.Class class19 = timeSeries15.timePeriodClass;
        java.util.List list20 = timeSeries15.getItems();
        timeSeries15.setKey((java.lang.Comparable) (byte) 1);
        java.lang.String str23 = timeSeries15.getDescription();
        timeSeries15.setMaximumItemCount((int) (byte) 100);
        java.lang.Class class26 = timeSeries15.timePeriodClass;
        boolean boolean27 = timeSeries1.equals((java.lang.Object) class26);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection70 = timeSeries69.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        timeSeries69.removePropertyChangeListener(propertyChangeListener71);
        java.lang.Class class73 = null;
        timeSeries69.timePeriodClass = class73;
        timeSeries69.setMaximumItemCount(2147483647);
        org.jfree.data.time.TimeSeries timeSeries79 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class80 = timeSeries79.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries81 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class80);
        java.lang.Comparable comparable82 = timeSeries81.getKey();
        org.jfree.data.time.TimeSeries timeSeries84 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection85 = timeSeries84.getTimePeriods();
        boolean boolean87 = timeSeries84.equals((java.lang.Object) 100.0d);
        timeSeries84.setNotify(true);
        java.lang.Class class90 = timeSeries84.getTimePeriodClass();
        timeSeries81.timePeriodClass = class90;
        timeSeries69.timePeriodClass = class90;
        timeSeries69.removeAgedItems((long) 2147483647, false);
        org.jfree.data.time.TimeSeries timeSeries96 = timeSeries66.addAndOrUpdate(timeSeries69);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod97 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod98 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries99 = timeSeries96.createCopy(regularTimePeriod97, regularTimePeriod98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(class80);
        org.junit.Assert.assertEquals("'" + comparable82 + "' != '" + (short) 1 + "'", comparable82, (short) 1);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(class90);
        org.junit.Assert.assertNotNull(timeSeries96);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int6 = timeSeries5.getMaximumItemCount();
        timeSeries5.setMaximumItemCount((int) '#');
        java.lang.Class class9 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Time", "hi!", class9);
        java.lang.Comparable comparable11 = timeSeries10.getKey();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean14 = timeSeries13.getNotify();
        int int15 = timeSeries13.getMaximumItemCount();
        java.util.List list16 = timeSeries13.data;
        timeSeries13.setRangeDescription("hi!");
        java.lang.Class class19 = timeSeries13.timePeriodClass;
        timeSeries10.timePeriodClass = class19;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class19);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (short) 0 + "'", comparable11, (short) 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(class19);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        java.util.List list26 = timeSeries11.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        timeSeries1.setKey((java.lang.Comparable) (byte) 100);
        long long33 = timeSeries1.getMaximumItemAge();
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
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9223372036854775807L + "'", long33 == 9223372036854775807L);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        boolean boolean10 = timeSeries7.equals((java.lang.Object) 100.0d);
        timeSeries7.setNotify(true);
        java.lang.Class<?> wildcardClass13 = timeSeries7.getClass();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass13);
        timeSeries15.setDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries15.createCopy((int) (short) 10, (int) (short) 10);
        boolean boolean21 = timeSeries15.isEmpty();
        java.lang.String str22 = timeSeries15.getRangeDescription();
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        timeSeries12.setNotify(true);
        int int16 = timeSeries12.getItemCount();
        java.lang.String str17 = timeSeries12.getDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        java.lang.String str23 = timeSeries19.getRangeDescription();
        boolean boolean24 = timeSeries19.isEmpty();
        java.util.Collection collection25 = timeSeries19.getTimePeriods();
        boolean boolean26 = timeSeries19.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries12.addAndOrUpdate(timeSeries19);
        long long28 = timeSeries19.getMaximumItemAge();
        java.util.Collection collection29 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries19);
        java.lang.Class class30 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem31 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9223372036854775807L + "'", long28 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(class30);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries7.getDataItem(regularTimePeriod18);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1));
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener2);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        long long2 = timeSeries1.getMaximumItemAge();
        timeSeries1.setRangeDescription("Overwritten values from: 10.0");
        long long5 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean5 = timeSeries4.getNotify();
        int int6 = timeSeries4.getMaximumItemCount();
        java.util.List list7 = timeSeries4.data;
        timeSeries4.setRangeDescription("hi!");
        java.lang.Class class10 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Overwritten values from: 0", "Value", class10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class class2 = timeSeries1.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        boolean boolean5 = timeSeries1.isEmpty();
        int int6 = timeSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries1.getTimePeriod(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        boolean boolean7 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        timeSeries11.setNotify(true);
        boolean boolean15 = timeSeries4.equals((java.lang.Object) timeSeries11);
        timeSeries4.fireSeriesChanged();
        java.util.List list17 = timeSeries4.data;
        java.lang.Class<?> wildcardClass18 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "Time", "Time", (java.lang.Class) wildcardClass18);
        timeSeries19.removeAgedItems(true);
        boolean boolean22 = timeSeries19.getNotify();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setMaximumItemAge((long) (short) 10);
        long long12 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        java.lang.Comparable comparable5 = timeSeries4.getKey();
        timeSeries4.removeAgedItems((long) 2147483647, false);
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries4.addPropertyChangeListener(propertyChangeListener10);
        int int12 = timeSeries4.getMaximumItemCount();
        timeSeries4.setMaximumItemCount(10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries4.addChangeListener(seriesChangeListener15);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 1 + "'", comparable5, (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        int int9 = timeSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries1.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        boolean boolean5 = timeSeries2.equals((java.lang.Object) 100.0d);
        timeSeries2.setMaximumItemCount((int) ' ');
        java.lang.Class class8 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, class8);
        int int10 = timeSeries9.getItemCount();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries14.setRangeDescription("Value");
        java.lang.String str17 = timeSeries14.getDescription();
        java.lang.Comparable comparable18 = timeSeries14.getKey();
        boolean boolean19 = timeSeries14.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries14.removeChangeListener(seriesChangeListener20);
        java.util.Collection collection22 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries14);
        boolean boolean23 = timeSeries14.isEmpty();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10.0f + "'", comparable18, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        int int15 = timeSeries1.getItemCount();
        timeSeries1.setNotify(false);
        java.util.List list18 = timeSeries1.getItems();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setKey((java.lang.Comparable) 0.0d);
        boolean boolean7 = timeSeries1.getNotify();
        java.lang.Comparable comparable8 = timeSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 0.0d + "'", comparable8, 0.0d);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        int int35 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number37 = timeSeries1.getValue(regularTimePeriod36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        timeSeries16.setMaximumItemCount((int) (byte) 0);
        timeSeries16.setDescription("Overwritten values from: -1");
        boolean boolean21 = timeSeries7.equals((java.lang.Object) timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries26.setRangeDescription("Value");
        timeSeries26.setKey((java.lang.Comparable) false);
        boolean boolean31 = timeSeries26.isEmpty();
        java.util.Collection collection32 = timeSeries26.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries26.addChangeListener(seriesChangeListener33);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries26.addChangeListener(seriesChangeListener35);
        int int37 = timeSeries26.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection43 = timeSeries42.getTimePeriods();
        boolean boolean45 = timeSeries42.equals((java.lang.Object) 100.0d);
        timeSeries42.setNotify(true);
        java.lang.Class<?> wildcardClass48 = timeSeries42.getClass();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass48);
        java.util.List list50 = timeSeries49.getItems();
        java.lang.Class<?> wildcardClass51 = timeSeries49.getClass();
        boolean boolean52 = timeSeries26.equals((java.lang.Object) timeSeries49);
        java.lang.Class class53 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "Overwritten values from: 0", class53);
        timeSeries16.timePeriodClass = class53;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod56 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries16.add(regularTimePeriod56, (double) (byte) 0, false);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(class53);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        boolean boolean4 = timeSeries1.getNotify();
        timeSeries1.setDomainDescription("Time");
        timeSeries1.clear();
        java.lang.Class class8 = timeSeries1.timePeriodClass;
        java.lang.Class class9 = timeSeries1.getTimePeriodClass();
        java.lang.String str10 = timeSeries1.getDescription();
        timeSeries1.removeAgedItems(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean5 = timeSeries4.getNotify();
        int int6 = timeSeries4.getMaximumItemCount();
        java.util.List list7 = timeSeries4.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean10 = timeSeries9.getNotify();
        int int11 = timeSeries9.getMaximumItemCount();
        java.util.List list12 = timeSeries9.data;
        boolean boolean13 = timeSeries9.getNotify();
        java.util.Collection collection14 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        java.lang.Comparable comparable15 = timeSeries4.getKey();
        long long16 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        long long23 = timeSeries21.getMaximumItemAge();
        timeSeries21.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean28 = timeSeries27.getNotify();
        int int29 = timeSeries27.getMaximumItemCount();
        java.util.List list30 = timeSeries27.data;
        timeSeries27.setRangeDescription("hi!");
        java.lang.Class class33 = timeSeries27.timePeriodClass;
        timeSeries21.timePeriodClass = class33;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries36.setRangeDescription("Value");
        java.lang.String str39 = timeSeries36.getDescription();
        java.util.List list40 = timeSeries36.data;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean43 = timeSeries42.getNotify();
        int int44 = timeSeries42.getMaximumItemCount();
        java.util.List list45 = timeSeries42.data;
        java.util.Collection collection46 = timeSeries42.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries36.addAndOrUpdate(timeSeries42);
        timeSeries42.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable50 = timeSeries42.getKey();
        timeSeries42.setKey((java.lang.Comparable) (byte) 0);
        java.util.Collection collection53 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        java.lang.Comparable comparable54 = timeSeries42.getKey();
        java.lang.Class class55 = timeSeries42.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Overwritten values from: 10.0", "Overwritten values from: 10", class55);
        boolean boolean57 = timeSeries4.equals((java.lang.Object) class55);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "Overwritten values from: 1", "Overwritten values from: 0.0", class55);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (byte) -1 + "'", comparable15, (byte) -1);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertEquals("'" + comparable50 + "' != '" + 9223372036854775807L + "'", comparable50, 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + (byte) 0 + "'", comparable54, (byte) 0);
        org.junit.Assert.assertNotNull(class55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean40 = timeSeries39.getNotify();
        java.util.List list41 = timeSeries39.getItems();
        timeSeries39.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries39.addChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class49 = timeSeries48.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class49);
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries50.addAndOrUpdate(timeSeries52);
        timeSeries52.setKey((java.lang.Comparable) "Time");
        java.lang.String str56 = timeSeries52.getDescription();
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection59 = timeSeries58.getTimePeriods();
        boolean boolean61 = timeSeries58.equals((java.lang.Object) 100.0d);
        timeSeries58.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection66 = timeSeries65.getTimePeriods();
        timeSeries65.setNotify(true);
        boolean boolean69 = timeSeries58.equals((java.lang.Object) timeSeries65);
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries58.createCopy((int) ' ', (int) '#');
        int int73 = timeSeries72.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class76 = timeSeries75.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener77 = null;
        timeSeries75.addChangeListener(seriesChangeListener77);
        java.beans.PropertyChangeListener propertyChangeListener79 = null;
        timeSeries75.removePropertyChangeListener(propertyChangeListener79);
        java.lang.Class class81 = timeSeries75.getTimePeriodClass();
        timeSeries72.timePeriodClass = class81;
        timeSeries52.timePeriodClass = class81;
        java.util.List list84 = timeSeries52.data;
        timeSeries39.data = list84;
        timeSeries39.setMaximumItemAge((long) (byte) 10);
        java.util.Collection collection88 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries39);
        timeSeries39.setMaximumItemCount((int) ' ');
        timeSeries39.clear();
        timeSeries39.setDomainDescription("Overwritten values from: 10.0");
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertNotNull(class49);
        org.junit.Assert.assertNotNull(timeSeries53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(timeSeries72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(class76);
        org.junit.Assert.assertNotNull(class81);
        org.junit.Assert.assertNotNull(list84);
        org.junit.Assert.assertNotNull(collection88);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        boolean boolean7 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        timeSeries11.setNotify(true);
        boolean boolean15 = timeSeries4.equals((java.lang.Object) timeSeries11);
        timeSeries4.fireSeriesChanged();
        java.util.List list17 = timeSeries4.data;
        java.lang.Class<?> wildcardClass18 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "Time", "Time", (java.lang.Class) wildcardClass18);
        timeSeries19.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        timeSeries23.setDescription("hi!");
        int int26 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean29 = timeSeries28.getNotify();
        java.util.List list30 = timeSeries28.getItems();
        timeSeries28.setKey((java.lang.Comparable) 1.0d);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries28.addChangeListener(seriesChangeListener33);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class38 = timeSeries37.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class38);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries39.addAndOrUpdate(timeSeries41);
        timeSeries41.setKey((java.lang.Comparable) "Time");
        java.lang.String str45 = timeSeries41.getDescription();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection48 = timeSeries47.getTimePeriods();
        boolean boolean50 = timeSeries47.equals((java.lang.Object) 100.0d);
        timeSeries47.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection55 = timeSeries54.getTimePeriods();
        timeSeries54.setNotify(true);
        boolean boolean58 = timeSeries47.equals((java.lang.Object) timeSeries54);
        org.jfree.data.time.TimeSeries timeSeries61 = timeSeries47.createCopy((int) ' ', (int) '#');
        int int62 = timeSeries61.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class65 = timeSeries64.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener66 = null;
        timeSeries64.addChangeListener(seriesChangeListener66);
        java.beans.PropertyChangeListener propertyChangeListener68 = null;
        timeSeries64.removePropertyChangeListener(propertyChangeListener68);
        java.lang.Class class70 = timeSeries64.getTimePeriodClass();
        timeSeries61.timePeriodClass = class70;
        timeSeries41.timePeriodClass = class70;
        java.util.List list73 = timeSeries41.data;
        timeSeries28.data = list73;
        timeSeries23.data = list73;
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries19.addAndOrUpdate(timeSeries23);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod77 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem79 = timeSeries76.addOrUpdate(regularTimePeriod77, (java.lang.Number) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(timeSeries61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(class65);
        org.junit.Assert.assertNotNull(class70);
        org.junit.Assert.assertNotNull(list73);
        org.junit.Assert.assertNotNull(timeSeries76);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries5.removePropertyChangeListener(propertyChangeListener9);
        java.lang.Comparable comparable11 = timeSeries5.getKey();
        boolean boolean12 = timeSeries5.isEmpty();
        timeSeries5.setKey((java.lang.Comparable) 10);
        timeSeries5.setMaximumItemCount(0);
        java.lang.Class<?> wildcardClass17 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 32, (java.lang.Class) wildcardClass17);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "Overwritten values from: 1", "Time", (java.lang.Class) wildcardClass17);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.util.List list8 = timeSeries7.getItems();
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries12.setDomainDescription("");
        java.util.List list15 = timeSeries12.data;
        timeSeries7.data = list15;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) -1 + "'", comparable9, (byte) -1);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (byte) -1 + "'", comparable10, (byte) -1);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        timeSeries1.setMaximumItemCount(0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10.0f + "'", comparable6, 10.0f);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        java.lang.String str17 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        boolean boolean22 = timeSeries19.equals((java.lang.Object) 100.0d);
        timeSeries19.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection27 = timeSeries26.getTimePeriods();
        timeSeries26.setNotify(true);
        boolean boolean30 = timeSeries19.equals((java.lang.Object) timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries19.createCopy((int) ' ', (int) '#');
        java.util.List list34 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries1.addAndOrUpdate(timeSeries19);
        timeSeries35.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(timeSeries35);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        java.util.List list4 = timeSeries2.getItems();
        timeSeries2.setDescription("Time");
        timeSeries2.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        timeSeries2.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries14.setRangeDescription("Value");
        java.lang.String str17 = timeSeries14.getDescription();
        java.util.List list18 = timeSeries14.data;
        timeSeries14.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries2.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection30 = timeSeries29.getTimePeriods();
        boolean boolean32 = timeSeries29.equals((java.lang.Object) 100.0d);
        timeSeries29.setNotify(true);
        java.lang.Class<?> wildcardClass35 = timeSeries29.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass35);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass35);
        timeSeries2.timePeriodClass = wildcardClass35;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass35);
        long long40 = timeSeries39.getMaximumItemAge();
        timeSeries39.removeAgedItems(false);
        int int43 = timeSeries39.getMaximumItemCount();
        java.lang.Class class44 = timeSeries39.getTimePeriodClass();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 9223372036854775807L + "'", long40 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(class44);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.getDataItem(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10.0f + "'", comparable6, 10.0f);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener6);
        java.lang.String str8 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        timeSeries12.setMaximumItemAge((long) (byte) 0);
        long long24 = timeSeries12.getMaximumItemAge();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.fireSeriesChanged();
        java.lang.String str3 = timeSeries1.getRangeDescription();
        java.lang.Comparable comparable4 = timeSeries1.getKey();
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) (byte) 0, (int) (short) 0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = timeSeries7.getValue(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Value" + "'", str3, "Value");
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + (byte) 10 + "'", comparable4, (byte) 10);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = timeSeries1.getIndex(regularTimePeriod16);
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
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        java.lang.String str8 = timeSeries1.getRangeDescription();
        java.util.List list9 = timeSeries1.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.addChangeListener(seriesChangeListener10);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class17 = timeSeries16.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.addAndOrUpdate(timeSeries20);
        timeSeries20.setKey((java.lang.Comparable) "Time");
        java.lang.String str24 = timeSeries20.getDescription();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection27 = timeSeries26.getTimePeriods();
        boolean boolean29 = timeSeries26.equals((java.lang.Object) 100.0d);
        timeSeries26.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection34 = timeSeries33.getTimePeriods();
        timeSeries33.setNotify(true);
        boolean boolean37 = timeSeries26.equals((java.lang.Object) timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries26.createCopy((int) ' ', (int) '#');
        int int41 = timeSeries40.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class44 = timeSeries43.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        timeSeries43.addChangeListener(seriesChangeListener45);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        timeSeries43.removePropertyChangeListener(propertyChangeListener47);
        java.lang.Class class49 = timeSeries43.getTimePeriodClass();
        timeSeries40.timePeriodClass = class49;
        timeSeries20.timePeriodClass = class49;
        timeSeries20.setMaximumItemAge(100L);
        timeSeries20.setDescription("");
        int int56 = timeSeries20.getMaximumItemCount();
        java.util.List list57 = timeSeries20.getItems();
        timeSeries1.data = list57;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertNotNull(class49);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.fireSeriesChanged();
        boolean boolean6 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.String str11 = timeSeries7.getRangeDescription();
        boolean boolean12 = timeSeries7.isEmpty();
        java.util.Collection collection13 = timeSeries7.getTimePeriods();
        boolean boolean14 = timeSeries7.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener15);
        timeSeries7.setRangeDescription("Value");
        timeSeries7.clear();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection24 = timeSeries23.getTimePeriods();
        timeSeries23.setNotify(true);
        java.lang.Class class27 = timeSeries23.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class27);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class27);
        timeSeries7.timePeriodClass = class27;
        java.lang.Class class31 = timeSeries7.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "Value", "", class31);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Overwritten values from: 10", class31);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries36 = timeSeries33.createCopy((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(class31);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int4 = timeSeries3.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        timeSeries6.setNotify(true);
        java.lang.Class class10 = timeSeries6.timePeriodClass;
        java.lang.Comparable comparable11 = timeSeries6.getKey();
        boolean boolean12 = timeSeries3.equals((java.lang.Object) timeSeries6);
        timeSeries3.fireSeriesChanged();
        java.lang.Class class14 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, class14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeSeries16.getIndex(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + 10.0f + "'", comparable11, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class14);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
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
            timeSeries1.add(regularTimePeriod9, (double) 'a');
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
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
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
        boolean boolean17 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean20 = timeSeries19.getNotify();
        java.util.List list21 = timeSeries19.getItems();
        timeSeries19.removeAgedItems(true);
        int int24 = timeSeries19.getItemCount();
        java.util.List list25 = timeSeries19.data;
        timeSeries1.data = list25;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean29 = timeSeries28.getNotify();
        java.util.List list30 = timeSeries28.getItems();
        timeSeries28.removeAgedItems(true);
        java.lang.String str33 = timeSeries28.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection39 = timeSeries38.getTimePeriods();
        boolean boolean41 = timeSeries38.equals((java.lang.Object) 100.0d);
        timeSeries38.setNotify(true);
        java.lang.Class class44 = timeSeries38.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), "hi!", "Overwritten values from: 10", class44);
        boolean boolean46 = timeSeries28.equals((java.lang.Object) class44);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries1.addAndOrUpdate(timeSeries28);
        timeSeries47.clear();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Time" + "'", str33, "Time");
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(timeSeries47);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries9.setRangeDescription("Value");
        java.lang.String str12 = timeSeries9.getDescription();
        java.util.List list13 = timeSeries9.data;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean16 = timeSeries15.getNotify();
        int int17 = timeSeries15.getMaximumItemCount();
        java.util.List list18 = timeSeries15.data;
        java.util.Collection collection19 = timeSeries15.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries9.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection23 = timeSeries22.getTimePeriods();
        boolean boolean25 = timeSeries22.equals((java.lang.Object) 100.0d);
        timeSeries22.setMaximumItemCount((int) ' ');
        java.lang.Class class28 = timeSeries22.getTimePeriodClass();
        timeSeries9.timePeriodClass = class28;
        timeSeries9.setMaximumItemCount(32);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection34 = timeSeries33.getTimePeriods();
        timeSeries33.setNotify(true);
        int int37 = timeSeries33.getItemCount();
        java.lang.String str38 = timeSeries33.getDescription();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean41 = timeSeries40.getNotify();
        timeSeries40.setRangeDescription("hi!");
        boolean boolean44 = timeSeries40.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries33.addAndOrUpdate(timeSeries40);
        int int46 = timeSeries40.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries9.addAndOrUpdate(timeSeries40);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries1.addAndOrUpdate(timeSeries40);
        long long49 = timeSeries40.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem52 = timeSeries40.addOrUpdate(regularTimePeriod50, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(timeSeries45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 9223372036854775807L + "'", long49 == 9223372036854775807L);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number32 = timeSeries12.getValue(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries30);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod2, (double) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        timeSeries1.removeAgedItems((long) 0, true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Time" + "'", str14, "Time");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        timeSeries8.setDescription("");
        boolean boolean28 = timeSeries8.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener17);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries1.addChangeListener(seriesChangeListener19);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        org.jfree.data.time.TimeSeries timeSeries31 = timeSeries1.createCopy((int) (short) 1, (int) (short) 10);
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
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        boolean boolean4 = timeSeries1.getNotify();
        timeSeries1.setDomainDescription("Time");
        timeSeries1.clear();
        timeSeries1.setDescription("Overwritten values from: -1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.setMaximumItemCount((int) '#');
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", "Overwritten values from: 0", "Overwritten values from: 10.0", class8);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries23.add(timeSeriesDataItem24, true);
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
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
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
        java.util.List list33 = timeSeries25.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(regularTimePeriod34, 0.0d);
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
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries7.setMaximumItemAge((long) (short) 10);
        java.util.List list10 = timeSeries7.data;
        int int11 = timeSeries7.getItemCount();
        boolean boolean12 = timeSeries7.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries7.addChangeListener(seriesChangeListener13);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
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
        timeSeries20.setMaximumItemAge((long) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries20.removeChangeListener(seriesChangeListener26);
        java.lang.String str28 = timeSeries20.getDomainDescription();
        boolean boolean29 = timeSeries20.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Time" + "'", str28, "Time");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        java.util.List list7 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.setRangeDescription("Time");
        java.util.List list13 = timeSeries9.data;
        timeSeries1.data = list13;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries1.removeChangeListener(seriesChangeListener15);
        java.util.List list17 = timeSeries1.data;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries8.removePropertyChangeListener(propertyChangeListener21);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        java.util.List list7 = timeSeries1.data;
        boolean boolean8 = timeSeries1.getNotify();
        boolean boolean9 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.createCopy((int) (short) 1, (int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        java.lang.String str17 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        boolean boolean22 = timeSeries19.equals((java.lang.Object) 100.0d);
        timeSeries19.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection27 = timeSeries26.getTimePeriods();
        timeSeries26.setNotify(true);
        boolean boolean30 = timeSeries19.equals((java.lang.Object) timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries19.createCopy((int) ' ', (int) '#');
        java.util.List list34 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries1.addAndOrUpdate(timeSeries19);
        int int36 = timeSeries1.getMaximumItemCount();
        timeSeries1.setNotify(false);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        timeSeries4.removeAgedItems((long) 1, true);
        timeSeries4.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries4.removeChangeListener(seriesChangeListener15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        java.util.List list2 = timeSeries1.data;
        long long3 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        boolean boolean8 = timeSeries5.equals((java.lang.Object) 100.0d);
        timeSeries5.setNotify(true);
        java.lang.Class class11 = timeSeries5.getTimePeriodClass();
        timeSeries1.timePeriodClass = class11;
        java.util.List list13 = timeSeries1.data;
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries6.setRangeDescription("Value");
        boolean boolean9 = timeSeries6.getNotify();
        timeSeries6.setDomainDescription("Time");
        timeSeries6.clear();
        java.lang.Class class13 = timeSeries6.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, class13);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class13);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) ' ', "Overwritten values from: 10", "Overwritten values from: 0.0", class13);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        timeSeries1.fireSeriesChanged();
        boolean boolean12 = timeSeries1.getNotify();
        java.lang.Comparable comparable13 = timeSeries1.getKey();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + (byte) 10 + "'", comparable13, (byte) 10);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        boolean boolean8 = timeSeries5.equals((java.lang.Object) 100.0d);
        timeSeries5.setNotify(true);
        java.lang.Class<?> wildcardClass11 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass11);
        java.util.List list14 = timeSeries13.data;
        timeSeries13.setDomainDescription("Time");
        java.lang.String str17 = timeSeries13.getDescription();
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        int int67 = timeSeries26.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries26.createCopy(1, 100);
        timeSeries26.setMaximumItemCount((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertNotNull(timeSeries70);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class class2 = timeSeries1.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        boolean boolean5 = timeSeries1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem7 = timeSeries1.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        java.lang.String str10 = timeSeries1.getDomainDescription();
        boolean boolean12 = timeSeries1.equals((java.lang.Object) (-1.0f));
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
        timeSeries1.setDescription("Overwritten values from: 1");
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
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
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
        timeSeries19.removeAgedItems((long) (short) 10, false);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection31 = timeSeries30.getTimePeriods();
        boolean boolean33 = timeSeries30.equals((java.lang.Object) 100.0d);
        timeSeries30.setNotify(true);
        java.lang.Class<?> wildcardClass36 = timeSeries30.getClass();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass36);
        java.util.List list38 = timeSeries37.getItems();
        java.lang.Class<?> wildcardClass39 = timeSeries37.getClass();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', "Value", "", (java.lang.Class) wildcardClass39);
        timeSeries40.fireSeriesChanged();
        java.util.List list42 = timeSeries40.data;
        timeSeries19.data = list42;
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
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(list42);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setRangeDescription("hi!");
        boolean boolean5 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        timeSeries9.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        long long19 = timeSeries17.getMaximumItemAge();
        java.lang.Class class20 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "", class20);
        timeSeries22.removeAgedItems((long) '#', false);
        java.util.Collection collection26 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        java.util.Collection collection27 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries22);
        int int28 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
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
        java.lang.Class class15 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries1.removeChangeListener(seriesChangeListener16);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean5 = timeSeries4.getNotify();
        timeSeries4.setRangeDescription("hi!");
        java.lang.Class<?> wildcardClass8 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, "Overwritten values from: 0", "Value", (java.lang.Class) wildcardClass8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        timeSeries11.setNotify(true);
        int int15 = timeSeries11.getItemCount();
        java.lang.String str16 = timeSeries11.getDescription();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean19 = timeSeries18.getNotify();
        timeSeries18.setRangeDescription("hi!");
        boolean boolean22 = timeSeries18.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries11.addAndOrUpdate(timeSeries18);
        int int24 = timeSeries18.getMaximumItemCount();
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
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries18.addAndOrUpdate(timeSeries26);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries26.removePropertyChangeListener(propertyChangeListener39);
        java.lang.Comparable comparable41 = timeSeries26.getKey();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class44 = timeSeries43.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        timeSeries43.addChangeListener(seriesChangeListener45);
        java.lang.String str47 = timeSeries43.getRangeDescription();
        timeSeries43.setDomainDescription("Time");
        boolean boolean50 = timeSeries43.getNotify();
        long long51 = timeSeries43.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries26.addAndOrUpdate(timeSeries43);
        java.util.Collection collection53 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod54, (java.lang.Number) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + 10.0f + "'", comparable41, 10.0f);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value" + "'", str47, "Value");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 9223372036854775807L + "'", long51 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.removeChangeListener(seriesChangeListener8);
        boolean boolean10 = timeSeries1.getNotify();
        timeSeries1.setKey((java.lang.Comparable) 100.0d);
        long long13 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems((long) 0, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 9223372036854775807L + "'", long13 == 9223372036854775807L);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        timeSeries1.setMaximumItemCount(1);
        boolean boolean4 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        int int20 = timeSeries19.getItemCount();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        timeSeries1.setRangeDescription("Value");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
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
        timeSeries8.clear();
        int int19 = timeSeries8.getMaximumItemCount();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setRangeDescription("hi!");
        boolean boolean5 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener6);
        timeSeries1.setRangeDescription("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod27, (double) 2147483647, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
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
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        java.lang.String str16 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        java.lang.Number number18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod17, number18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        timeSeries1.fireSeriesChanged();
        java.lang.Class class12 = timeSeries1.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        timeSeries17.setNotify(true);
        java.lang.Class class21 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class21);
        timeSeries22.setDomainDescription("");
        java.lang.Comparable comparable25 = timeSeries22.getKey();
        timeSeries22.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        boolean boolean31 = timeSeries28.equals((java.lang.Object) 100.0d);
        timeSeries28.setNotify(true);
        java.lang.Class class34 = timeSeries28.getTimePeriodClass();
        long long35 = timeSeries28.getMaximumItemAge();
        timeSeries28.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries22.addAndOrUpdate(timeSeries28);
        java.util.Collection collection39 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        timeSeries28.removeAgedItems((long) (-1), true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (short) 0 + "'", comparable25, (short) 0);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(class34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9223372036854775807L + "'", long35 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        int int6 = timeSeries1.getItemCount();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries9.setRangeDescription("Value");
        java.lang.String str12 = timeSeries9.getDescription();
        java.util.List list13 = timeSeries9.data;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean16 = timeSeries15.getNotify();
        int int17 = timeSeries15.getMaximumItemCount();
        java.util.List list18 = timeSeries15.data;
        java.util.Collection collection19 = timeSeries15.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries9.addAndOrUpdate(timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection23 = timeSeries22.getTimePeriods();
        boolean boolean25 = timeSeries22.equals((java.lang.Object) 100.0d);
        timeSeries22.setMaximumItemCount((int) ' ');
        java.lang.Class class28 = timeSeries22.getTimePeriodClass();
        timeSeries9.timePeriodClass = class28;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class32 = timeSeries31.timePeriodClass;
        java.util.List list33 = timeSeries31.getItems();
        timeSeries31.setDescription("Time");
        timeSeries31.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries31.removePropertyChangeListener(propertyChangeListener38);
        timeSeries31.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries43.setRangeDescription("Value");
        java.lang.String str46 = timeSeries43.getDescription();
        java.util.List list47 = timeSeries43.data;
        timeSeries43.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener50 = null;
        timeSeries43.addPropertyChangeListener(propertyChangeListener50);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries31.addAndOrUpdate(timeSeries43);
        java.util.List list53 = timeSeries52.data;
        timeSeries9.data = list53;
        timeSeries9.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries1.addAndOrUpdate(timeSeries9);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(class32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(timeSeries57);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        boolean boolean7 = timeSeries1.getNotify();
        long long8 = timeSeries1.getMaximumItemAge();
        java.lang.String str9 = timeSeries1.getDescription();
        timeSeries1.setNotify(false);
        timeSeries1.setMaximumItemCount(100);
        java.lang.Comparable comparable14 = timeSeries1.getKey();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 10.0f + "'", comparable14, 10.0f);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener20);
        java.lang.String str22 = timeSeries6.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = timeSeries6.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        timeSeries20.setMaximumItemAge((long) (short) 100);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = timeSeries20.getIndex(regularTimePeriod26);
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
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        timeSeries17.setMaximumItemCount((int) 'a');
        int int41 = timeSeries17.getMaximumItemCount();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        boolean boolean8 = timeSeries5.equals((java.lang.Object) 100.0d);
        timeSeries5.setNotify(true);
        java.lang.Class<?> wildcardClass11 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass11);
        boolean boolean14 = timeSeries13.getNotify();
        timeSeries13.setDomainDescription("");
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries25.getDataItem(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.setDomainDescription("Time");
        timeSeries1.removeAgedItems(0L, false);
        timeSeries1.setMaximumItemAge((long) '#');
        timeSeries1.setMaximumItemCount((int) (byte) 10);
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        int int34 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class37 = timeSeries36.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries36.addChangeListener(seriesChangeListener38);
        java.lang.String str40 = timeSeries36.getRangeDescription();
        boolean boolean41 = timeSeries36.isEmpty();
        java.util.Collection collection42 = timeSeries36.getTimePeriods();
        boolean boolean43 = timeSeries36.isEmpty();
        boolean boolean44 = timeSeries36.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        timeSeries36.removeChangeListener(seriesChangeListener45);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection49 = timeSeries48.getTimePeriods();
        boolean boolean51 = timeSeries48.equals((java.lang.Object) 100.0d);
        timeSeries48.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries36.addAndOrUpdate(timeSeries48);
        java.util.Collection collection55 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries36);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener56 = null;
        timeSeries22.removeChangeListener(seriesChangeListener56);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(class37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(collection55);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
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
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod17, 0.0d);
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
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemAge(0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        timeSeries23.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries23.removePropertyChangeListener(propertyChangeListener30);
        timeSeries23.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries35.setRangeDescription("Value");
        java.lang.String str38 = timeSeries35.getDescription();
        java.util.List list39 = timeSeries35.data;
        timeSeries35.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries35.addPropertyChangeListener(propertyChangeListener42);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries23.addAndOrUpdate(timeSeries35);
        java.util.List list45 = timeSeries44.data;
        timeSeries1.data = list45;
        timeSeries1.removeAgedItems((long) 32, true);
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
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(list45);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        timeSeries6.setDescription("Overwritten values from: 1");
        timeSeries6.setDomainDescription("hi!");
        timeSeries6.removeAgedItems((long) (byte) 0, false);
        java.lang.String str17 = timeSeries6.getDescription();
        java.lang.Class class18 = timeSeries6.timePeriodClass;
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Overwritten values from: 1" + "'", str17, "Overwritten values from: 1");
        org.junit.Assert.assertNotNull(class18);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        timeSeries37.setDescription("hi!");
        int int49 = timeSeries37.getItemCount();
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
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
            java.lang.Object obj18 = timeSeries17.clone();
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
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
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
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries16.setRangeDescription("Value");
        boolean boolean19 = timeSeries16.getNotify();
        timeSeries16.setDomainDescription("Time");
        timeSeries16.clear();
        java.lang.Class class23 = timeSeries16.timePeriodClass;
        timeSeries1.timePeriodClass = class23;
        long long25 = timeSeries1.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(0, (java.lang.Number) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9223372036854775807L + "'", long25 == 9223372036854775807L);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "Overwritten values from: 10", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries1.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(timeSeriesDataItem18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L));
        java.lang.Class<?> wildcardClass2 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.addChangeListener(seriesChangeListener10);
        int int12 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        boolean boolean20 = timeSeries17.equals((java.lang.Object) 100.0d);
        timeSeries17.setNotify(true);
        java.lang.Class<?> wildcardClass23 = timeSeries17.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass23);
        java.util.List list25 = timeSeries24.getItems();
        java.lang.Class<?> wildcardClass26 = timeSeries24.getClass();
        boolean boolean27 = timeSeries1.equals((java.lang.Object) timeSeries24);
        java.lang.Class class28 = timeSeries1.getTimePeriodClass();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod29 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(class28);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        java.util.List list10 = timeSeries8.getItems();
        timeSeries8.removeAgedItems(true);
        java.lang.String str13 = timeSeries8.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        boolean boolean21 = timeSeries18.equals((java.lang.Object) 100.0d);
        timeSeries18.setNotify(true);
        java.lang.Class class24 = timeSeries18.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), "hi!", "Overwritten values from: 10", class24);
        boolean boolean26 = timeSeries8.equals((java.lang.Object) class24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "Time", "Value", class24);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Overwritten values from: 10", "Overwritten values from: -1", class24);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, class24);
        timeSeries29.fireSeriesChanged();
        java.lang.Comparable comparable31 = timeSeries29.getKey();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries34 = timeSeries29.createCopy((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Time" + "'", str13, "Time");
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + 100 + "'", comparable31, 100);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        int int6 = timeSeries1.getItemCount();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems((long) (byte) -1, false);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.addChangeListener(seriesChangeListener10);
        int int12 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        boolean boolean20 = timeSeries17.equals((java.lang.Object) 100.0d);
        timeSeries17.setNotify(true);
        java.lang.Class<?> wildcardClass23 = timeSeries17.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass23);
        java.util.List list25 = timeSeries24.getItems();
        java.lang.Class<?> wildcardClass26 = timeSeries24.getClass();
        boolean boolean27 = timeSeries1.equals((java.lang.Object) timeSeries24);
        java.lang.Class class28 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int31 = timeSeries30.getMaximumItemCount();
        timeSeries30.clear();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries34.setRangeDescription("Value");
        boolean boolean37 = timeSeries34.getNotify();
        timeSeries34.setDomainDescription("Time");
        timeSeries34.clear();
        java.lang.Class class41 = timeSeries34.timePeriodClass;
        java.lang.Class class42 = timeSeries34.getTimePeriodClass();
        timeSeries30.timePeriodClass = class42;
        boolean boolean44 = timeSeries30.getNotify();
        java.util.Collection collection45 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        java.util.List list46 = timeSeries1.data;
        java.lang.String str47 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Time" + "'", str47, "Time");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        boolean boolean21 = timeSeries11.getNotify();
        boolean boolean22 = timeSeries11.isEmpty();
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        timeSeries1.setRangeDescription("hi!");
        boolean boolean7 = timeSeries1.getNotify();
        int int8 = timeSeries1.getItemCount();
        timeSeries1.setKey((java.lang.Comparable) 0.0f);
        java.lang.String str11 = timeSeries1.getDomainDescription();
        timeSeries1.removeAgedItems(0L, true);
        timeSeries1.fireSeriesChanged();
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
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class42 = timeSeries41.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class42);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class42);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Value", "Value", class42);
        timeSeries17.timePeriodClass = class42;
        int int47 = timeSeries17.getItemCount();
        timeSeries17.setNotify(true);
        int int50 = timeSeries17.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries1.addAndOrUpdate(timeSeries17);
        timeSeries1.setNotify(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertNotNull(timeSeries51);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        timeSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.addChangeListener(seriesChangeListener4);
        boolean boolean6 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        boolean boolean4 = timeSeries1.getNotify();
        timeSeries1.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean11 = timeSeries10.getNotify();
        int int12 = timeSeries10.getMaximumItemCount();
        java.util.List list13 = timeSeries10.data;
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries10.createCopy((int) '4', (int) (short) 100);
        int int17 = timeSeries10.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeSeries18);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        timeSeries1.setMaximumItemAge((long) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        java.util.Collection collection22 = timeSeries7.getTimePeriods();
        timeSeries7.setMaximumItemAge((long) (short) 10);
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
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        boolean boolean3 = timeSeries1.isEmpty();
        java.lang.Comparable comparable4 = timeSeries1.getKey();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + 100.0d + "'", comparable4, 100.0d);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.setMaximumItemCount(100);
        timeSeries1.setRangeDescription("Value");
        java.lang.String str8 = timeSeries1.getDomainDescription();
        timeSeries1.removeAgedItems((long) (byte) -1, false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy((-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        java.lang.String str8 = timeSeries4.getRangeDescription();
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Comparable comparable10 = timeSeries4.getKey();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        long long15 = timeSeries13.getMaximumItemAge();
        java.lang.Class class16 = timeSeries13.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class16);
        timeSeries4.timePeriodClass = class16;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 0", "Overwritten values from: 1", "Overwritten values from: 0", class16);
        java.lang.String str20 = timeSeries19.getRangeDescription();
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0f + "'", comparable10, 10.0f);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Overwritten values from: 0" + "'", str20, "Overwritten values from: 0");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
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
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries16.setRangeDescription("Value");
        boolean boolean19 = timeSeries16.getNotify();
        timeSeries16.setDomainDescription("Time");
        timeSeries16.clear();
        java.lang.Class class23 = timeSeries16.timePeriodClass;
        timeSeries1.timePeriodClass = class23;
        long long25 = timeSeries1.getMaximumItemAge();
        timeSeries1.setNotify(true);
        int int28 = timeSeries1.getItemCount();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9223372036854775807L + "'", long25 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        timeSeries19.removeAgedItems((long) (short) 10, false);
        timeSeries19.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100);
        timeSeries26.setMaximumItemCount((int) '#');
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection31 = timeSeries30.getTimePeriods();
        boolean boolean33 = timeSeries30.equals((java.lang.Object) 100.0d);
        timeSeries30.setMaximumItemCount((int) ' ');
        java.lang.Class class36 = timeSeries30.getTimePeriodClass();
        timeSeries26.timePeriodClass = class36;
        timeSeries19.timePeriodClass = class36;
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
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(class36);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries1.setDescription("hi!");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries1.removeChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries1.getDescription();
        timeSeries1.setNotify(true);
        java.lang.Class class9 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        long long6 = timeSeries4.getMaximumItemAge();
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean11 = timeSeries10.getNotify();
        int int12 = timeSeries10.getMaximumItemCount();
        java.util.List list13 = timeSeries10.data;
        timeSeries10.setRangeDescription("hi!");
        java.lang.Class class16 = timeSeries10.timePeriodClass;
        timeSeries4.timePeriodClass = class16;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", "Overwritten values from: 10", "", class16);
        timeSeries18.setMaximumItemAge((long) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class24 = timeSeries23.timePeriodClass;
        java.util.List list25 = timeSeries23.getItems();
        timeSeries23.setDescription("Time");
        timeSeries23.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries23.removePropertyChangeListener(propertyChangeListener30);
        boolean boolean32 = timeSeries23.getNotify();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection35 = timeSeries34.getTimePeriods();
        long long36 = timeSeries34.getMaximumItemAge();
        timeSeries34.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean41 = timeSeries40.getNotify();
        int int42 = timeSeries40.getMaximumItemCount();
        java.util.List list43 = timeSeries40.data;
        timeSeries40.setRangeDescription("hi!");
        java.lang.Class class46 = timeSeries40.timePeriodClass;
        timeSeries34.timePeriodClass = class46;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries49.setRangeDescription("Value");
        java.lang.String str52 = timeSeries49.getDescription();
        java.util.List list53 = timeSeries49.data;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean56 = timeSeries55.getNotify();
        int int57 = timeSeries55.getMaximumItemCount();
        java.util.List list58 = timeSeries55.data;
        java.util.Collection collection59 = timeSeries55.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries49.addAndOrUpdate(timeSeries55);
        timeSeries55.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable63 = timeSeries55.getKey();
        timeSeries55.setKey((java.lang.Comparable) (byte) 0);
        java.util.Collection collection66 = timeSeries34.getTimePeriodsUniqueToOtherSeries(timeSeries55);
        java.util.Collection collection67 = timeSeries23.getTimePeriodsUniqueToOtherSeries(timeSeries34);
        java.lang.Class<?> wildcardClass68 = timeSeries23.getClass();
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, (java.lang.Class) wildcardClass68);
        timeSeries18.timePeriodClass = wildcardClass68;
        java.lang.String str71 = timeSeries18.getDomainDescription();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 9223372036854775807L + "'", long36 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(list43);
        org.junit.Assert.assertNotNull(class46);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertEquals("'" + comparable63 + "' != '" + 9223372036854775807L + "'", comparable63, 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Overwritten values from: 10" + "'", str71, "Overwritten values from: 10");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        long long10 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        java.util.List list12 = timeSeries8.data;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(regularTimePeriod13, (java.lang.Number) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries4.removePropertyChangeListener(propertyChangeListener6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean10 = timeSeries9.getNotify();
        timeSeries9.setRangeDescription("hi!");
        boolean boolean13 = timeSeries4.equals((java.lang.Object) timeSeries9);
        boolean boolean14 = timeSeries9.getNotify();
        java.lang.Class class15 = timeSeries9.timePeriodClass;
        java.util.Collection collection16 = timeSeries9.getTimePeriods();
        timeSeries9.setMaximumItemCount(100);
        timeSeries9.clear();
        java.lang.Class<?> wildcardClass20 = timeSeries9.getClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, "", "Overwritten values from: 1", (java.lang.Class) wildcardClass20);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection10 = timeSeries9.getTimePeriods();
        timeSeries9.setNotify(true);
        java.lang.Class class13 = timeSeries9.timePeriodClass;
        java.lang.Comparable comparable14 = timeSeries9.getKey();
        boolean boolean15 = timeSeries1.equals((java.lang.Object) timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod16, (java.lang.Number) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 10.0f + "'", comparable14, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries2.setRangeDescription("Value");
        boolean boolean5 = timeSeries2.getNotify();
        timeSeries2.setDomainDescription("Time");
        timeSeries2.clear();
        java.lang.Class class9 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, class9);
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries10.addPropertyChangeListener(propertyChangeListener11);
        timeSeries10.setMaximumItemAge((long) (byte) 1);
        boolean boolean15 = timeSeries10.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        java.util.List list31 = timeSeries29.getItems();
        timeSeries29.clear();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection35 = timeSeries34.getTimePeriods();
        boolean boolean37 = timeSeries34.equals((java.lang.Object) 100.0d);
        timeSeries34.setMaximumItemCount((int) ' ');
        java.lang.Class class40 = timeSeries34.getTimePeriodClass();
        java.util.List list41 = timeSeries34.getItems();
        timeSeries29.data = list41;
        boolean boolean43 = timeSeries29.getNotify();
        timeSeries29.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        timeSeries29.removeChangeListener(seriesChangeListener45);
        boolean boolean47 = timeSeries1.equals((java.lang.Object) timeSeries29);
        timeSeries29.setDomainDescription("Overwritten values from: -1");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int51 = timeSeries29.getIndex(regularTimePeriod50);
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
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(class40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = timeSeries1.getDataItem(regularTimePeriod9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        java.lang.String str25 = timeSeries7.getDescription();
        java.lang.String str26 = timeSeries7.getDomainDescription();
        java.lang.String str27 = timeSeries7.getDomainDescription();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = timeSeries7.getDataItem((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Time" + "'", str26, "Time");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Time" + "'", str27, "Time");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number18 = timeSeries1.getValue(regularTimePeriod17);
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
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        timeSeries1.setMaximumItemCount(1);
        timeSeries1.setMaximumItemAge(0L);
        java.lang.Class class6 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        long long10 = timeSeries8.getMaximumItemAge();
        timeSeries8.removeAgedItems(false);
        timeSeries8.setKey((java.lang.Comparable) 'a');
        timeSeries8.fireSeriesChanged();
        int int16 = timeSeries8.getItemCount();
        java.util.Collection collection17 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        int int18 = timeSeries8.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries8.addChangeListener(seriesChangeListener19);
        java.lang.Class class21 = timeSeries8.timePeriodClass;
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(class21);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class6);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries8.addOrUpdate(regularTimePeriod9, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        java.util.Collection collection5 = timeSeries1.getTimePeriods();
        boolean boolean6 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.createCopy((int) (short) 10, (int) '#');
        timeSeries1.setKey((java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems((long) 2147483647, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        timeSeries12.setMaximumItemCount(0);
        timeSeries12.setKey((java.lang.Comparable) 0.0d);
        boolean boolean18 = timeSeries12.getNotify();
        java.util.List list19 = timeSeries12.data;
        int int20 = timeSeries12.getItemCount();
        timeSeries12.setRangeDescription("");
        boolean boolean23 = timeSeries1.equals((java.lang.Object) "");
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        java.lang.String str8 = timeSeries4.getRangeDescription();
        java.lang.String str9 = timeSeries4.getDomainDescription();
        java.lang.Comparable comparable10 = timeSeries4.getKey();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        long long15 = timeSeries13.getMaximumItemAge();
        java.lang.Class class16 = timeSeries13.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class16);
        timeSeries4.timePeriodClass = class16;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 0", "Overwritten values from: 1", "Overwritten values from: 0", class16);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Time" + "'", str9, "Time");
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0f + "'", comparable10, 10.0f);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class16);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        int int9 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection11 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeSeries6.getIndex(regularTimePeriod8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection6 = timeSeries5.getTimePeriods();
        timeSeries5.setNotify(true);
        java.lang.Class class9 = timeSeries5.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class9);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time", "Time", "Time", class9);
        timeSeries11.setMaximumItemAge((long) '4');
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        timeSeries15.setNotify(true);
        int int19 = timeSeries15.getItemCount();
        java.lang.String str20 = timeSeries15.getDescription();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean23 = timeSeries22.getNotify();
        timeSeries22.setRangeDescription("hi!");
        boolean boolean26 = timeSeries22.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries15.addAndOrUpdate(timeSeries22);
        int int28 = timeSeries22.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries30.setRangeDescription("Value");
        java.lang.String str33 = timeSeries30.getDescription();
        java.util.List list34 = timeSeries30.data;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean37 = timeSeries36.getNotify();
        int int38 = timeSeries36.getMaximumItemCount();
        java.util.List list39 = timeSeries36.data;
        java.util.Collection collection40 = timeSeries36.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries30.addAndOrUpdate(timeSeries36);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries22.addAndOrUpdate(timeSeries30);
        timeSeries42.fireSeriesChanged();
        java.lang.String str44 = timeSeries42.getDescription();
        java.util.Collection collection45 = timeSeries11.getTimePeriodsUniqueToOtherSeries(timeSeries42);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        java.lang.Class<?> wildcardClass51 = timeSeries50.getClass();
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, "hi!", "hi!", (java.lang.Class) wildcardClass51);
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        timeSeries52.addPropertyChangeListener(propertyChangeListener53);
        java.lang.Class class55 = timeSeries52.timePeriodClass;
        boolean boolean56 = timeSeries42.equals((java.lang.Object) timeSeries52);
        java.util.List list57 = timeSeries42.getItems();
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(timeSeries41);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(class55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries27.update(regularTimePeriod28, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class4 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class4);
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        timeSeries5.removeAgedItems((long) 2147483647, false);
        java.lang.String str10 = timeSeries5.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        timeSeries5.addPropertyChangeListener(propertyChangeListener11);
        int int13 = timeSeries5.getMaximumItemCount();
        timeSeries5.clear();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries5.removeChangeListener(seriesChangeListener15);
        long long17 = timeSeries5.getMaximumItemAge();
        java.lang.Class class18 = timeSeries5.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, class18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number21 = timeSeries19.getValue(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (short) 1 + "'", comparable6, (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class18);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        java.util.List list8 = timeSeries7.data;
        java.lang.Class class9 = timeSeries7.getTimePeriodClass();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        timeSeries1.setMaximumItemAge((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) (short) 100, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 10.0f + "'", comparable6, 10.0f);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.addAndOrUpdate(timeSeries12);
        timeSeries12.setKey((java.lang.Comparable) "Time");
        java.lang.Class class16 = timeSeries12.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, "Time", "Time", class16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, "Time", "hi!", class16);
        timeSeries18.setDomainDescription("Overwritten values from: 10");
        java.util.List list21 = timeSeries18.getItems();
        int int22 = timeSeries18.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        java.lang.Number number24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries18.update(regularTimePeriod23, number24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        long long29 = timeSeries28.getMaximumItemAge();
        timeSeries28.setDescription("Overwritten values from: 0");
        java.lang.String str32 = timeSeries28.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener33 = null;
        timeSeries28.removePropertyChangeListener(propertyChangeListener33);
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
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 9223372036854775807L + "'", long29 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        timeSeries1.setRangeDescription("Overwritten values from: 10");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries11.setRangeDescription("Value");
        timeSeries11.setKey((java.lang.Comparable) false);
        boolean boolean16 = timeSeries11.isEmpty();
        java.util.Collection collection17 = timeSeries11.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries11.addChangeListener(seriesChangeListener18);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries11.addChangeListener(seriesChangeListener20);
        int int22 = timeSeries11.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection28 = timeSeries27.getTimePeriods();
        boolean boolean30 = timeSeries27.equals((java.lang.Object) 100.0d);
        timeSeries27.setNotify(true);
        java.lang.Class<?> wildcardClass33 = timeSeries27.getClass();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass33);
        java.util.List list35 = timeSeries34.getItems();
        java.lang.Class<?> wildcardClass36 = timeSeries34.getClass();
        boolean boolean37 = timeSeries11.equals((java.lang.Object) timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class40 = timeSeries39.timePeriodClass;
        java.util.List list41 = timeSeries39.getItems();
        timeSeries39.setDescription("Time");
        timeSeries39.setMaximumItemCount((int) (short) 1);
        int int46 = timeSeries39.getItemCount();
        java.util.Collection collection47 = timeSeries39.getTimePeriods();
        java.util.Collection collection48 = timeSeries39.getTimePeriods();
        java.lang.Class<?> wildcardClass49 = collection48.getClass();
        timeSeries34.timePeriodClass = wildcardClass49;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0f), "", "Overwritten values from: 10", (java.lang.Class) wildcardClass49);
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Value", "Overwritten values from: 10", (java.lang.Class) wildcardClass49);
        java.util.Collection collection53 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries56 = timeSeries1.createCopy((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(class40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(collection53);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        java.lang.String str15 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        boolean boolean21 = timeSeries18.equals((java.lang.Object) 100.0d);
        timeSeries18.setMaximumItemCount((int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean28 = timeSeries27.getNotify();
        timeSeries27.setRangeDescription("hi!");
        boolean boolean31 = timeSeries27.isEmpty();
        timeSeries27.setMaximumItemCount(10);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class41 = timeSeries40.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class41);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class41);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100L, class41);
        timeSeries27.timePeriodClass = class41;
        timeSeries18.timePeriodClass = class41;
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, class41);
        timeSeries1.timePeriodClass = class41;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(class41);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection4 = timeSeries3.getTimePeriods();
        timeSeries3.setNotify(true);
        java.lang.Class class7 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class7);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        java.util.Collection collection13 = timeSeries11.getTimePeriods();
        timeSeries11.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class19);
        timeSeries20.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries11.addAndOrUpdate(timeSeries20);
        timeSeries23.setKey((java.lang.Comparable) "hi!");
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries8.addAndOrUpdate(timeSeries23);
        timeSeries23.setDescription("hi!");
        java.lang.Class class29 = timeSeries23.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Overwritten values from: 0", class29);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(class29);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
        java.util.Collection collection15 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.util.List list18 = timeSeries17.data;
        timeSeries1.data = list18;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        java.util.List list24 = timeSeries21.data;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean27 = timeSeries26.getNotify();
        int int28 = timeSeries26.getMaximumItemCount();
        java.util.List list29 = timeSeries26.data;
        boolean boolean30 = timeSeries26.getNotify();
        java.util.Collection collection31 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        java.util.Collection collection32 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        timeSeries1.setKey((java.lang.Comparable) "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection32);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        timeSeries1.setMaximumItemCount(1);
        timeSeries1.setMaximumItemAge(0L);
        java.lang.Class class6 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        long long10 = timeSeries8.getMaximumItemAge();
        timeSeries8.removeAgedItems(false);
        timeSeries8.setKey((java.lang.Comparable) 'a');
        timeSeries8.fireSeriesChanged();
        int int16 = timeSeries8.getItemCount();
        java.util.Collection collection17 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries8);
        int int18 = timeSeries8.getMaximumItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries8.addChangeListener(seriesChangeListener19);
        boolean boolean21 = timeSeries8.isEmpty();
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        boolean boolean42 = timeSeries41.getNotify();
        java.lang.Comparable comparable43 = timeSeries41.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem45 = timeSeries41.getDataItem(regularTimePeriod44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + '#' + "'", comparable43, '#');
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        timeSeries1.setMaximumItemCount(2147483647);
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
        timeSeries1.timePeriodClass = class22;
        boolean boolean25 = timeSeries1.isEmpty();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries1.addChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class31 = timeSeries30.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class31);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries32.addAndOrUpdate(timeSeries34);
        java.util.List list36 = timeSeries35.data;
        timeSeries1.data = list36;
        timeSeries1.removeAgedItems(false);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 1 + "'", comparable14, (short) 1);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class4 = timeSeries3.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries5.addAndOrUpdate(timeSeries7);
        timeSeries8.setMaximumItemAge((long) (short) 10);
        timeSeries8.setKey((java.lang.Comparable) 0);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries8.addChangeListener(seriesChangeListener13);
        java.lang.Class<?> wildcardClass15 = timeSeries8.getClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass15);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeSeries16.getIndex(regularTimePeriod17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
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
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
        java.lang.Comparable comparable34 = timeSeries22.getKey();
        java.lang.Class class35 = timeSeries22.timePeriodClass;
        int int36 = timeSeries22.getMaximumItemCount();
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
        org.junit.Assert.assertEquals("'" + comparable34 + "' != '" + (byte) 0 + "'", comparable34, (byte) 0);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
        long long17 = timeSeries8.getMaximumItemAge();
        timeSeries8.setKey((java.lang.Comparable) 9223372036854775807L);
        timeSeries8.setMaximumItemAge((long) (byte) 100);
        timeSeries8.clear();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9223372036854775807L + "'", long17 == 9223372036854775807L);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.util.List list8 = timeSeries7.getItems();
        java.lang.Class class9 = timeSeries7.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries7.addChangeListener(seriesChangeListener10);
        java.lang.Comparable comparable12 = timeSeries7.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) -1 + "'", comparable12, (byte) -1);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection50 = timeSeries49.getTimePeriods();
        boolean boolean52 = timeSeries49.equals((java.lang.Object) 100.0d);
        timeSeries49.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        timeSeries49.addChangeListener(seriesChangeListener55);
        java.util.List list57 = timeSeries49.getItems();
        timeSeries49.setNotify(true);
        java.lang.Class class60 = timeSeries49.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, class60);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Overwritten values from: 10.0", "Value", class60);
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class60);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, "Overwritten values from: 1", "Overwritten values from: 10", class60);
        java.util.Collection collection65 = timeSeries6.getTimePeriodsUniqueToOtherSeries(timeSeries64);
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
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(list57);
        org.junit.Assert.assertNotNull(class60);
        org.junit.Assert.assertNotNull(collection65);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        timeSeries1.setMaximumItemCount((int) '4');
        timeSeries1.setMaximumItemCount((int) (byte) 100);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) (short) -1);
        timeSeries1.clear();
        java.util.List list14 = timeSeries1.data;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        timeSeries1.setRangeDescription("hi!");
        boolean boolean7 = timeSeries1.getNotify();
        int int8 = timeSeries1.getItemCount();
        java.lang.String str9 = timeSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class5);
        timeSeries6.removeAgedItems(false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries6.addOrUpdate(regularTimePeriod9, (double) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries6.setRangeDescription("Value");
        java.lang.String str9 = timeSeries6.getDescription();
        java.lang.Comparable comparable10 = timeSeries6.getKey();
        boolean boolean11 = timeSeries6.getNotify();
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries6);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries6.addPropertyChangeListener(propertyChangeListener13);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10.0f + "'", comparable10, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        long long8 = timeSeries6.getMaximumItemAge();
        timeSeries6.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        int int14 = timeSeries12.getMaximumItemCount();
        java.util.List list15 = timeSeries12.data;
        timeSeries12.setRangeDescription("hi!");
        java.lang.Class class18 = timeSeries12.timePeriodClass;
        timeSeries6.timePeriodClass = class18;
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", "Overwritten values from: 10", "", class18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '4', class18);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class18);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries22.add(timeSeriesDataItem23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(class18);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        java.lang.String str17 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries19.setRangeDescription("Value");
        java.lang.String str22 = timeSeries19.getDescription();
        java.util.List list23 = timeSeries19.data;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean26 = timeSeries25.getNotify();
        int int27 = timeSeries25.getMaximumItemCount();
        java.util.List list28 = timeSeries25.data;
        java.util.Collection collection29 = timeSeries25.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries19.addAndOrUpdate(timeSeries25);
        boolean boolean31 = timeSeries1.equals((java.lang.Object) timeSeries19);
        java.lang.Comparable comparable32 = timeSeries1.getKey();
        timeSeries1.removeAgedItems(0L, false);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 10.0f + "'", comparable32, 10.0f);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        long long6 = timeSeries4.getMaximumItemAge();
        timeSeries4.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean11 = timeSeries10.getNotify();
        int int12 = timeSeries10.getMaximumItemCount();
        java.util.List list13 = timeSeries10.data;
        timeSeries10.setRangeDescription("hi!");
        java.lang.Class class16 = timeSeries10.timePeriodClass;
        timeSeries4.timePeriodClass = class16;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries19.setRangeDescription("Value");
        java.lang.String str22 = timeSeries19.getDescription();
        java.util.List list23 = timeSeries19.data;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean26 = timeSeries25.getNotify();
        int int27 = timeSeries25.getMaximumItemCount();
        java.util.List list28 = timeSeries25.data;
        java.util.Collection collection29 = timeSeries25.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries19.addAndOrUpdate(timeSeries25);
        timeSeries25.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable33 = timeSeries25.getKey();
        timeSeries25.setKey((java.lang.Comparable) (byte) 0);
        java.util.Collection collection36 = timeSeries4.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        java.lang.Comparable comparable37 = timeSeries25.getKey();
        java.lang.Class class38 = timeSeries25.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Overwritten values from: 10.0", "Overwritten values from: 10", class38);
        timeSeries39.setRangeDescription("Overwritten values from: 10");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(list28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + 9223372036854775807L + "'", comparable33, 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + (byte) 0 + "'", comparable37, (byte) 0);
        org.junit.Assert.assertNotNull(class38);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        java.lang.String str16 = timeSeries1.getDomainDescription();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod18, (java.lang.Number) 2147483647);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener5);
        java.lang.String str7 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.String str13 = timeSeries9.getRangeDescription();
        boolean boolean14 = timeSeries9.isEmpty();
        boolean boolean15 = timeSeries9.isEmpty();
        java.lang.Class class16 = timeSeries9.getTimePeriodClass();
        timeSeries9.setMaximumItemCount((int) (byte) 0);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        java.util.List list22 = timeSeries20.getItems();
        timeSeries20.setDescription("Time");
        timeSeries20.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener27);
        java.util.Collection collection29 = timeSeries9.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        boolean boolean34 = timeSeries31.equals((java.lang.Object) 100.0d);
        timeSeries31.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection39 = timeSeries38.getTimePeriods();
        timeSeries38.setNotify(true);
        boolean boolean42 = timeSeries31.equals((java.lang.Object) timeSeries38);
        timeSeries31.fireSeriesChanged();
        java.util.List list44 = timeSeries31.data;
        java.lang.Class class45 = timeSeries31.timePeriodClass;
        timeSeries20.timePeriodClass = class45;
        java.lang.String str47 = timeSeries20.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries1.addAndOrUpdate(timeSeries20);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int50 = timeSeries48.getIndex(regularTimePeriod49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(class45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Value" + "'", str47, "Value");
        org.junit.Assert.assertNotNull(timeSeries48);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries7.setMaximumItemCount((int) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries7.addPropertyChangeListener(propertyChangeListener10);
        java.lang.Comparable comparable12 = timeSeries7.getKey();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Overwritten values from: 1" + "'", comparable12, "Overwritten values from: 1");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
        timeSeries23.clear();
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
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
        timeSeries19.setKey((java.lang.Comparable) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = timeSeries19.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        timeSeries4.setNotify(true);
        java.lang.Class class8 = timeSeries4.timePeriodClass;
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries4);
        timeSeries4.removeAgedItems((long) 1, true);
        java.lang.Comparable comparable14 = timeSeries4.getKey();
        timeSeries4.setRangeDescription("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10.0f + "'", comparable9, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + 10.0f + "'", comparable14, 10.0f);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
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
        timeSeries12.clear();
        java.lang.Comparable comparable32 = timeSeries12.getKey();
        timeSeries12.setDescription("Time");
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
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + 10.0f + "'", comparable32, 10.0f);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        java.lang.String str10 = timeSeries1.getDomainDescription();
        java.util.Collection collection11 = timeSeries1.getTimePeriods();
        java.util.Collection collection12 = timeSeries1.getTimePeriods();
        java.lang.Class class13 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.fireSeriesChanged();
        timeSeries1.removeAgedItems(false);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setMaximumItemAge(10L);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        timeSeries1.removeAgedItems(false);
        long long13 = timeSeries1.getMaximumItemAge();
        java.lang.String str14 = timeSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems((long) 2147483647, true);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.addChangeListener(seriesChangeListener9);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries1.removeChangeListener(seriesChangeListener11);
        timeSeries1.setRangeDescription("Value");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
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
        java.lang.Comparable comparable29 = timeSeries15.getKey();
        java.util.Collection collection30 = timeSeries15.getTimePeriods();
        boolean boolean31 = timeSeries8.equals((java.lang.Object) timeSeries15);
        java.lang.Class class32 = timeSeries15.timePeriodClass;
        timeSeries15.fireSeriesChanged();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + 10.0f + "'", comparable29, 10.0f);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(class32);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 97);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
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
        java.lang.Class class16 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", class16);
        java.lang.String str18 = timeSeries17.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries17.addChangeListener(seriesChangeListener19);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod10, (java.lang.Number) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        int int13 = timeSeries8.getItemCount();
        java.lang.Class class14 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries8.add(timeSeriesDataItem15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(class14);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries10.addAndOrUpdate(timeSeries12);
        timeSeries12.setKey((java.lang.Comparable) "Time");
        java.lang.Class class16 = timeSeries12.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, "Time", "Time", class16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, "Time", "hi!", class16);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries21 = timeSeries18.createCopy((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(class16);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        java.lang.String str10 = timeSeries1.getDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Time" + "'", str10, "Time");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        java.lang.Comparable comparable5 = timeSeries4.getKey();
        java.lang.Class class6 = timeSeries4.timePeriodClass;
        java.lang.String str7 = timeSeries4.getDescription();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + (short) 1 + "'", comparable5, (short) 1);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        timeSeries1.removeAgedItems((long) (byte) 100, true);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener9);
        java.lang.String str11 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        java.lang.String str6 = timeSeries1.getDomainDescription();
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        java.util.List list8 = timeSeries1.data;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries1.removeChangeListener(seriesChangeListener9);
        java.util.List list11 = timeSeries1.getItems();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Time" + "'", str6, "Time");
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setRangeDescription("");
        timeSeries1.clear();
        java.util.Collection collection10 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries12.setRangeDescription("Value");
        java.lang.String str15 = timeSeries12.getDescription();
        java.util.List list16 = timeSeries12.data;
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean19 = timeSeries18.getNotify();
        int int20 = timeSeries18.getMaximumItemCount();
        java.util.List list21 = timeSeries18.data;
        java.util.Collection collection22 = timeSeries18.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries12.addAndOrUpdate(timeSeries18);
        java.util.Collection collection24 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        timeSeries18.setDescription("Value");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
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
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        boolean boolean20 = timeSeries17.equals((java.lang.Object) 100.0d);
        timeSeries17.setMaximumItemCount((int) ' ');
        java.lang.Class class23 = timeSeries17.getTimePeriodClass();
        java.util.List list24 = timeSeries17.getItems();
        timeSeries1.data = list24;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
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
            int int20 = timeSeries17.getIndex(regularTimePeriod19);
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
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries4.addAndOrUpdate(timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) "Time");
        timeSeries6.setDescription("Overwritten values from: 1");
        timeSeries6.setDomainDescription("hi!");
        timeSeries6.removeAgedItems(false);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setRangeDescription("Time");
        int int5 = timeSeries1.getItemCount();
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem9 = timeSeries1.addOrUpdate(regularTimePeriod7, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        boolean boolean20 = timeSeries17.equals((java.lang.Object) 100.0d);
        timeSeries17.setMaximumItemCount((int) ' ');
        java.lang.Class class23 = timeSeries17.getTimePeriodClass();
        java.util.List list24 = timeSeries17.getItems();
        timeSeries1.data = list24;
        java.util.Collection collection26 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries31.setRangeDescription("Value");
        java.lang.String str34 = timeSeries31.getDescription();
        java.lang.Comparable comparable35 = timeSeries31.getKey();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection38 = timeSeries37.getTimePeriods();
        boolean boolean40 = timeSeries37.equals((java.lang.Object) 100.0d);
        timeSeries37.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries37.addChangeListener(seriesChangeListener43);
        java.util.List list45 = timeSeries37.getItems();
        timeSeries31.data = list45;
        java.lang.Class<?> wildcardClass47 = list45.getClass();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10, "", "", (java.lang.Class) wildcardClass47);
        timeSeries48.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries1.addAndOrUpdate(timeSeries48);
        boolean boolean52 = timeSeries1.getNotify();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10.0f + "'", comparable35, 10.0f);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(list45);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        java.lang.String str8 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int11 = timeSeries10.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        timeSeries13.setNotify(true);
        java.lang.Class class17 = timeSeries13.timePeriodClass;
        java.lang.Comparable comparable18 = timeSeries13.getKey();
        boolean boolean19 = timeSeries10.equals((java.lang.Object) timeSeries13);
        timeSeries13.removeAgedItems((long) 1, true);
        timeSeries13.setNotify(false);
        timeSeries13.setMaximumItemAge((long) (short) 1);
        java.util.Collection collection27 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries13);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem28, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + 10.0f + "'", comparable18, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L);
        java.util.List list5 = timeSeries4.data;
        java.lang.Class<?> wildcardClass6 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, "Overwritten values from: 0", "Overwritten values from: -1", (java.lang.Class) wildcardClass6);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647);
        timeSeries1.setMaximumItemAge((long) 2147483647);
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.removeChangeListener(seriesChangeListener6);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
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
        java.lang.String str15 = timeSeries1.getDomainDescription();
        java.util.Collection collection16 = timeSeries1.getTimePeriods();
        java.lang.String str17 = timeSeries1.getDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Time" + "'", str11, "Time");
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean7 = timeSeries6.getNotify();
        java.util.List list8 = timeSeries6.getItems();
        timeSeries1.data = list8;
        timeSeries1.setMaximumItemCount((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (short) -1, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class27 = timeSeries26.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class27);
        timeSeries28.setMaximumItemCount((int) '4');
        timeSeries28.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection34 = timeSeries33.getTimePeriods();
        boolean boolean36 = timeSeries33.equals((java.lang.Object) 100.0d);
        timeSeries33.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection41 = timeSeries40.getTimePeriods();
        timeSeries40.setNotify(true);
        boolean boolean44 = timeSeries33.equals((java.lang.Object) timeSeries40);
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries33.createCopy((int) ' ', (int) '#');
        java.util.List list48 = timeSeries33.getItems();
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class58 = timeSeries57.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", class58);
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class58);
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, "Value", "Value", class58);
        timeSeries33.timePeriodClass = class58;
        boolean boolean63 = timeSeries28.equals((java.lang.Object) class58);
        long long64 = timeSeries28.getMaximumItemAge();
        boolean boolean65 = timeSeries1.equals((java.lang.Object) long64);
        java.beans.PropertyChangeListener propertyChangeListener66 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener66);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertNotNull(list48);
        org.junit.Assert.assertNotNull(class58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 9223372036854775807L + "'", long64 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.add(regularTimePeriod28, (java.lang.Number) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener2);
        timeSeries1.removeAgedItems((long) (short) 100, true);
        long long7 = timeSeries1.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        java.lang.String str17 = timeSeries16.getDescription();
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Time" + "'", str15, "Time");
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
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
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries45.createCopy(1, (int) '#');
        timeSeries48.setDomainDescription("");
        timeSeries48.setMaximumItemAge((long) '4');
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
        org.junit.Assert.assertNotNull(timeSeries48);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        int int63 = timeSeries43.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener64 = null;
        timeSeries43.removePropertyChangeListener(propertyChangeListener64);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries43.update((int) (byte) 1, (java.lang.Number) (-1.0f));
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        timeSeries1.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries1.addChangeListener(seriesChangeListener33);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(timeSeries31);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        java.lang.Class<?> wildcardClass4 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', (java.lang.Class) wildcardClass4);
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
        int int20 = timeSeries14.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries22.setRangeDescription("Value");
        java.lang.String str25 = timeSeries22.getDescription();
        java.util.List list26 = timeSeries22.data;
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean29 = timeSeries28.getNotify();
        int int30 = timeSeries28.getMaximumItemCount();
        java.util.List list31 = timeSeries28.data;
        java.util.Collection collection32 = timeSeries28.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries22.addAndOrUpdate(timeSeries28);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries14.addAndOrUpdate(timeSeries22);
        java.lang.Class class35 = timeSeries22.getTimePeriodClass();
        timeSeries5.timePeriodClass = class35;
        boolean boolean37 = timeSeries5.isEmpty();
        java.lang.Class class38 = timeSeries5.timePeriodClass;
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(class38);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
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
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean52 = timeSeries51.getNotify();
        int int53 = timeSeries51.getMaximumItemCount();
        java.util.List list54 = timeSeries51.data;
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries51.createCopy((int) '4', (int) (short) 100);
        long long58 = timeSeries51.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class61 = timeSeries60.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries60.addChangeListener(seriesChangeListener62);
        boolean boolean64 = timeSeries51.equals((java.lang.Object) seriesChangeListener62);
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries66.setRangeDescription("Value");
        boolean boolean69 = timeSeries66.getNotify();
        timeSeries66.setDomainDescription("Time");
        timeSeries66.clear();
        java.lang.Class class73 = timeSeries66.timePeriodClass;
        timeSeries51.timePeriodClass = class73;
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, "Value", "", class73);
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", class73);
        timeSeries76.clear();
        boolean boolean78 = timeSeries76.getNotify();
        org.jfree.data.time.TimeSeries timeSeries79 = timeSeries1.addAndOrUpdate(timeSeries76);
        timeSeries1.setDescription("Overwritten values from: 1");
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertNotNull(list54);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 9223372036854775807L + "'", long58 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(class73);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(timeSeries79);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        timeSeries28.setMaximumItemAge((long) '4');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.add(timeSeriesDataItem33, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        java.util.List list4 = timeSeries2.getItems();
        timeSeries2.setDescription("Time");
        timeSeries2.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries2.removePropertyChangeListener(propertyChangeListener9);
        timeSeries2.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries14.setRangeDescription("Value");
        java.lang.String str17 = timeSeries14.getDescription();
        java.util.List list18 = timeSeries14.data;
        timeSeries14.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries14.addPropertyChangeListener(propertyChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries2.addAndOrUpdate(timeSeries14);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection30 = timeSeries29.getTimePeriods();
        boolean boolean32 = timeSeries29.equals((java.lang.Object) 100.0d);
        timeSeries29.setNotify(true);
        java.lang.Class<?> wildcardClass35 = timeSeries29.getClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass35);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass35);
        timeSeries2.timePeriodClass = wildcardClass35;
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass35);
        long long40 = timeSeries39.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries39.addChangeListener(seriesChangeListener41);
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 9223372036854775807L + "'", long40 == 9223372036854775807L);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setRangeDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy(regularTimePeriod5, regularTimePeriod6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        timeSeries1.setMaximumItemAge((long) (byte) 100);
        timeSeries1.setMaximumItemCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        timeSeries1.setMaximumItemAge((long) (byte) 1);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(class13);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        timeSeries1.setNotify(false);
        boolean boolean8 = timeSeries1.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        java.lang.Class<?> wildcardClass11 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        java.util.List list2 = timeSeries1.data;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.removeAgedItems((long) '4', true);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(true);
        java.lang.Class class5 = timeSeries1.timePeriodClass;
        timeSeries1.removeAgedItems((long) (byte) 1, true);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy(0, 32);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries16.setRangeDescription("Value");
        timeSeries16.setKey((java.lang.Comparable) false);
        boolean boolean21 = timeSeries16.isEmpty();
        java.util.Collection collection22 = timeSeries16.getTimePeriods();
        java.lang.String str23 = timeSeries16.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection26 = timeSeries25.getTimePeriods();
        long long27 = timeSeries25.getMaximumItemAge();
        timeSeries25.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean32 = timeSeries31.getNotify();
        int int33 = timeSeries31.getMaximumItemCount();
        java.util.List list34 = timeSeries31.data;
        timeSeries31.setRangeDescription("hi!");
        java.lang.Class class37 = timeSeries31.timePeriodClass;
        timeSeries25.timePeriodClass = class37;
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries40.setRangeDescription("Value");
        java.lang.String str43 = timeSeries40.getDescription();
        java.util.List list44 = timeSeries40.data;
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean47 = timeSeries46.getNotify();
        int int48 = timeSeries46.getMaximumItemCount();
        java.util.List list49 = timeSeries46.data;
        java.util.Collection collection50 = timeSeries46.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries40.addAndOrUpdate(timeSeries46);
        timeSeries46.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable54 = timeSeries46.getKey();
        timeSeries46.setKey((java.lang.Comparable) (byte) 0);
        java.util.Collection collection57 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries46);
        java.lang.Comparable comparable58 = timeSeries46.getKey();
        java.lang.Class class59 = timeSeries46.timePeriodClass;
        timeSeries16.timePeriodClass = class59;
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", "hi!", "Overwritten values from: 0", class59);
        timeSeries1.timePeriodClass = class59;
        java.util.Collection collection63 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Value" + "'", str23, "Value");
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(class37);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertEquals("'" + comparable54 + "' != '" + 9223372036854775807L + "'", comparable54, 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertEquals("'" + comparable58 + "' != '" + (byte) 0 + "'", comparable58, (byte) 0);
        org.junit.Assert.assertNotNull(class59);
        org.junit.Assert.assertNotNull(collection63);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
        timeSeries6.setDescription("Overwritten values from: 0");
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection44 = timeSeries43.getTimePeriods();
        long long45 = timeSeries43.getMaximumItemAge();
        timeSeries43.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries49.setRangeDescription("Value");
        java.lang.String str52 = timeSeries49.getDescription();
        java.util.List list53 = timeSeries49.data;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean56 = timeSeries55.getNotify();
        int int57 = timeSeries55.getMaximumItemCount();
        java.util.List list58 = timeSeries55.data;
        java.util.Collection collection59 = timeSeries55.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries49.addAndOrUpdate(timeSeries55);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection63 = timeSeries62.getTimePeriods();
        boolean boolean65 = timeSeries62.equals((java.lang.Object) 100.0d);
        timeSeries62.setMaximumItemCount((int) ' ');
        java.lang.Class class68 = timeSeries62.getTimePeriodClass();
        timeSeries49.timePeriodClass = class68;
        timeSeries43.timePeriodClass = class68;
        timeSeries6.timePeriodClass = class68;
        timeSeries6.setMaximumItemAge((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.setMaximumItemAge((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'periods' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 9223372036854775807L + "'", long45 == 9223372036854775807L);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(timeSeries60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(class68);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        timeSeries2.setNotify(true);
        java.lang.Class class6 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class6);
        timeSeries7.setDomainDescription("");
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        timeSeries7.fireSeriesChanged();
        timeSeries7.setNotify(false);
        java.util.Collection collection14 = timeSeries7.getTimePeriods();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (short) 0 + "'", comparable10, (short) 0);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        java.util.List list8 = timeSeries7.getItems();
        java.lang.Comparable comparable9 = timeSeries7.getKey();
        java.lang.Comparable comparable10 = timeSeries7.getKey();
        java.lang.Comparable comparable11 = timeSeries7.getKey();
        timeSeries7.setNotify(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) -1 + "'", comparable9, (byte) -1);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (byte) -1 + "'", comparable10, (byte) -1);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + (byte) -1 + "'", comparable11, (byte) -1);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
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
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries13.createCopy(10, (int) (short) 10);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries25.add(timeSeriesDataItem26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(timeSeries25);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
        int int16 = timeSeries1.getItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.setKey((java.lang.Comparable) false);
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries1.addChangeListener(seriesChangeListener10);
        int int12 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        boolean boolean20 = timeSeries17.equals((java.lang.Object) 100.0d);
        timeSeries17.setNotify(true);
        java.lang.Class<?> wildcardClass23 = timeSeries17.getClass();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass23);
        java.util.List list25 = timeSeries24.getItems();
        java.lang.Class<?> wildcardClass26 = timeSeries24.getClass();
        boolean boolean27 = timeSeries1.equals((java.lang.Object) timeSeries24);
        java.lang.Class class28 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener29);
        java.lang.Comparable comparable31 = timeSeries1.getKey();
        java.lang.String str32 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + false + "'", comparable31, false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class3);
        org.junit.Assert.assertNotNull(class3);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener32);
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
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        timeSeries7.setMaximumItemCount(97);
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
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
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
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener13);
        timeSeries1.setKey((java.lang.Comparable) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem18 = timeSeries1.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
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
        java.lang.String str17 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        boolean boolean22 = timeSeries19.equals((java.lang.Object) 100.0d);
        timeSeries19.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection27 = timeSeries26.getTimePeriods();
        timeSeries26.setNotify(true);
        boolean boolean30 = timeSeries19.equals((java.lang.Object) timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries19.createCopy((int) ' ', (int) '#');
        java.util.List list34 = timeSeries19.getItems();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries1.addAndOrUpdate(timeSeries19);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener36);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries19.addChangeListener(seriesChangeListener38);
        long long40 = timeSeries19.getMaximumItemAge();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Value" + "'", str12, "Value");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Time" + "'", str17, "Time");
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(list34);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 9223372036854775807L + "'", long40 == 9223372036854775807L);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        timeSeries1.removeAgedItems(true);
        timeSeries1.setDescription("Overwritten values from: 10");
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        timeSeries1.setRangeDescription("hi!");
        java.util.Collection collection8 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        java.lang.Class class32 = timeSeries21.timePeriodClass;
        timeSeries21.setKey((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries21.add(regularTimePeriod35, (double) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(class32);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        timeSeries1.clear();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        long long6 = timeSeries1.getMaximumItemAge();
        java.util.List list7 = timeSeries1.data;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        timeSeries1.fireSeriesChanged();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setRangeDescription("Value");
        int int7 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (java.lang.Number) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        java.util.List list9 = timeSeries1.getItems();
        timeSeries1.setNotify(true);
        timeSeries1.fireSeriesChanged();
        java.util.List list13 = timeSeries1.getItems();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener14);
        java.beans.PropertyChangeListener propertyChangeListener16 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection23 = timeSeries22.getTimePeriods();
        long long24 = timeSeries22.getMaximumItemAge();
        timeSeries22.setMaximumItemCount(100);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean29 = timeSeries28.getNotify();
        int int30 = timeSeries28.getMaximumItemCount();
        java.util.List list31 = timeSeries28.data;
        timeSeries28.setRangeDescription("hi!");
        java.lang.Class class34 = timeSeries28.timePeriodClass;
        timeSeries22.timePeriodClass = class34;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries37.setRangeDescription("Value");
        java.lang.String str40 = timeSeries37.getDescription();
        java.util.List list41 = timeSeries37.data;
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean44 = timeSeries43.getNotify();
        int int45 = timeSeries43.getMaximumItemCount();
        java.util.List list46 = timeSeries43.data;
        java.util.Collection collection47 = timeSeries43.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries37.addAndOrUpdate(timeSeries43);
        timeSeries43.setKey((java.lang.Comparable) 9223372036854775807L);
        java.lang.Comparable comparable51 = timeSeries43.getKey();
        timeSeries43.setKey((java.lang.Comparable) (byte) 0);
        java.util.Collection collection54 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries43);
        java.lang.Comparable comparable55 = timeSeries43.getKey();
        java.lang.Class class56 = timeSeries43.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Value", "hi!", "Value", class56);
        timeSeries1.timePeriodClass = class56;
        java.util.List list59 = timeSeries1.data;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9223372036854775807L + "'", long24 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(class34);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(list41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertEquals("'" + comparable51 + "' != '" + 9223372036854775807L + "'", comparable51, 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertEquals("'" + comparable55 + "' != '" + (byte) 0 + "'", comparable55, (byte) 0);
        org.junit.Assert.assertNotNull(class56);
        org.junit.Assert.assertNotNull(list59);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        java.util.Collection collection5 = timeSeries1.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.removeChangeListener(seriesChangeListener6);
        int int8 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        java.lang.String str17 = timeSeries13.getRangeDescription();
        boolean boolean18 = timeSeries13.isEmpty();
        java.util.Collection collection19 = timeSeries13.getTimePeriods();
        boolean boolean20 = timeSeries13.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries13.removePropertyChangeListener(propertyChangeListener21);
        timeSeries13.setRangeDescription("Value");
        timeSeries13.clear();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection30 = timeSeries29.getTimePeriods();
        timeSeries29.setNotify(true);
        java.lang.Class class33 = timeSeries29.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class33);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', class33);
        timeSeries13.timePeriodClass = class33;
        java.lang.Class class37 = timeSeries13.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "Value", "", class37);
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries1.addAndOrUpdate(timeSeries38);
        java.lang.Comparable comparable40 = timeSeries38.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries38.removeChangeListener(seriesChangeListener41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Value" + "'", str17, "Value");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(class37);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + (byte) 100 + "'", comparable40, (byte) 100);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.removeAgedItems(false);
        long long6 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries1.createCopy((int) (short) 10, (int) ' ');
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 9223372036854775807L + "'", long6 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries9);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setDomainDescription("Overwritten values from: 10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
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
        int int18 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem20 = timeSeries1.getDataItem(regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        timeSeries1.clear();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener9);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        long long3 = timeSeries1.getMaximumItemAge();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        int int5 = timeSeries1.getMaximumItemCount();
        java.util.List list6 = timeSeries1.data;
        timeSeries1.setNotify(true);
        java.util.Collection collection9 = timeSeries1.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        timeSeries12.setNotify(true);
        java.lang.Class class16 = timeSeries12.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class16);
        java.util.Collection collection18 = timeSeries17.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class22 = timeSeries21.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class22);
        java.lang.Comparable comparable24 = timeSeries23.getKey();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection27 = timeSeries26.getTimePeriods();
        boolean boolean29 = timeSeries26.equals((java.lang.Object) 100.0d);
        timeSeries26.setNotify(true);
        java.lang.Class class32 = timeSeries26.getTimePeriodClass();
        timeSeries23.timePeriodClass = class32;
        timeSeries17.timePeriodClass = class32;
        java.lang.String str35 = timeSeries17.getDescription();
        java.lang.String str36 = timeSeries17.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries38.setRangeDescription("Value");
        java.lang.String str41 = timeSeries38.getDescription();
        java.util.List list42 = timeSeries38.data;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean45 = timeSeries44.getNotify();
        int int46 = timeSeries44.getMaximumItemCount();
        java.util.List list47 = timeSeries44.data;
        java.util.Collection collection48 = timeSeries44.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries38.addAndOrUpdate(timeSeries44);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection52 = timeSeries51.getTimePeriods();
        boolean boolean54 = timeSeries51.equals((java.lang.Object) 100.0d);
        timeSeries51.setMaximumItemCount((int) ' ');
        java.lang.Class class57 = timeSeries51.getTimePeriodClass();
        timeSeries38.timePeriodClass = class57;
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class61 = timeSeries60.timePeriodClass;
        java.util.List list62 = timeSeries60.getItems();
        timeSeries60.setDescription("Time");
        int int65 = timeSeries60.getItemCount();
        java.util.Collection collection66 = timeSeries60.getTimePeriods();
        boolean boolean67 = timeSeries38.equals((java.lang.Object) collection66);
        timeSeries38.setKey((java.lang.Comparable) "");
        timeSeries38.setMaximumItemAge((long) '#');
        java.util.List list72 = timeSeries38.getItems();
        timeSeries17.data = list72;
        timeSeries1.data = list72;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertEquals("'" + comparable24 + "' != '" + (short) 1 + "'", comparable24, (short) 1);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(class32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Time" + "'", str36, "Time");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(class57);
        org.junit.Assert.assertNotNull(class61);
        org.junit.Assert.assertNotNull(list62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(list72);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
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
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries23.setRangeDescription("Value");
        timeSeries23.setKey((java.lang.Comparable) false);
        boolean boolean28 = timeSeries23.isEmpty();
        java.util.Collection collection29 = timeSeries23.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries23.addChangeListener(seriesChangeListener30);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries23.addChangeListener(seriesChangeListener32);
        int int34 = timeSeries23.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection40 = timeSeries39.getTimePeriods();
        boolean boolean42 = timeSeries39.equals((java.lang.Object) 100.0d);
        timeSeries39.setNotify(true);
        java.lang.Class<?> wildcardClass45 = timeSeries39.getClass();
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass45);
        java.util.List list47 = timeSeries46.getItems();
        java.lang.Class<?> wildcardClass48 = timeSeries46.getClass();
        boolean boolean49 = timeSeries23.equals((java.lang.Object) timeSeries46);
        java.lang.Class class50 = timeSeries23.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries52 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int53 = timeSeries52.getMaximumItemCount();
        timeSeries52.clear();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries56.setRangeDescription("Value");
        boolean boolean59 = timeSeries56.getNotify();
        timeSeries56.setDomainDescription("Time");
        timeSeries56.clear();
        java.lang.Class class63 = timeSeries56.timePeriodClass;
        java.lang.Class class64 = timeSeries56.getTimePeriodClass();
        timeSeries52.timePeriodClass = class64;
        boolean boolean66 = timeSeries52.getNotify();
        java.util.Collection collection67 = timeSeries23.getTimePeriodsUniqueToOtherSeries(timeSeries52);
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class70 = timeSeries69.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener71 = null;
        timeSeries69.addChangeListener(seriesChangeListener71);
        java.beans.PropertyChangeListener propertyChangeListener73 = null;
        timeSeries69.removePropertyChangeListener(propertyChangeListener73);
        timeSeries69.setRangeDescription("");
        java.util.List list77 = timeSeries69.getItems();
        timeSeries52.data = list77;
        boolean boolean79 = timeSeries1.equals((java.lang.Object) timeSeries52);
        timeSeries52.removeAgedItems(true);
        timeSeries52.setMaximumItemCount((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(list47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(class50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(class63);
        org.junit.Assert.assertNotNull(class64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(class70);
        org.junit.Assert.assertNotNull(list77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setKey((java.lang.Comparable) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = timeSeries1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }
}

