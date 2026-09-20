package org.jfree.data.time;

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
        timeSeries10.removeAgedItems(false);
        timeSeries10.setRangeDescription("hi!");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
        java.lang.Class class22 = timeSeries10.getTimePeriodClass();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries10.addChangeListener(seriesChangeListener23);
        timeSeries10.removeAgedItems((long) (byte) 0, true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(class22);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int6 = timeSeries5.getMaximumItemCount();
        java.lang.Comparable comparable7 = timeSeries5.getKey();
        java.util.List list8 = timeSeries5.getItems();
        timeSeries1.data = list8;
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.createCopy((int) ' ', (int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries12.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.createCopy(1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.setMaximumItemCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        int int11 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy(regularTimePeriod12, regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.update(32, (java.lang.Number) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean4 = timeSeries3.getNotify();
        int int5 = timeSeries3.getMaximumItemCount();
        timeSeries3.setRangeDescription("hi!");
        java.lang.Class class8 = timeSeries3.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class8);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, class8);
        java.lang.Object obj11 = timeSeries10.clone();
        timeSeries10.setDescription("hi!");
        java.lang.Object obj14 = timeSeries10.clone();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(regularTimePeriod13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries9.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries9.add(regularTimePeriod14, (double) (-1.0f));
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
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        java.util.List list5 = timeSeries1.data;
        timeSeries1.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        java.util.List list13 = timeSeries11.getItems();
        timeSeries11.setKey((java.lang.Comparable) 0.0f);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries9.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries1.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean20 = timeSeries19.getNotify();
        timeSeries19.setMaximumItemCount(0);
        timeSeries19.setDescription("Time");
        java.lang.Comparable comparable25 = timeSeries19.getKey();
        long long26 = timeSeries19.getMaximumItemAge();
        timeSeries19.setDomainDescription("");
        java.lang.String str29 = timeSeries19.getRangeDescription();
        java.util.List list30 = timeSeries19.data;
        boolean boolean31 = timeSeries19.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries1.addAndOrUpdate(timeSeries19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + (byte) -1 + "'", comparable25, (byte) -1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(timeSeries32);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj3 = timeSeries1.clone();
        timeSeries1.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener6);
        int int8 = timeSeries1.getItemCount();
        java.lang.String str9 = timeSeries1.getDescription();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.addChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries16.removePropertyChangeListener(propertyChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        java.lang.String str24 = timeSeries20.getRangeDescription();
        timeSeries20.setDescription("");
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries16.addAndOrUpdate(timeSeries20);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries11.addAndOrUpdate(timeSeries20);
        int int29 = timeSeries28.getMaximumItemCount();
        timeSeries28.setMaximumItemAge((long) (byte) 10);
        java.lang.Comparable comparable32 = timeSeries28.getKey();
        java.util.List list33 = timeSeries28.getItems();
        timeSeries1.data = list33;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Value" + "'", str24, "Value");
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + "Overwritten values from: 10.0" + "'", comparable32, "Overwritten values from: 10.0");
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        timeSeries14.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener29 = null;
        timeSeries28.removePropertyChangeListener(propertyChangeListener29);
        boolean boolean31 = timeSeries28.getNotify();
        java.lang.String str32 = timeSeries28.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries28.addChangeListener(seriesChangeListener33);
        java.lang.String str35 = timeSeries28.getRangeDescription();
        java.util.Collection collection36 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries28);
        timeSeries28.clear();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Value" + "'", str32, "Value");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Value" + "'", str35, "Value");
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        int int6 = timeSeries1.getItemCount();
        java.util.List list7 = timeSeries1.data;
        int int8 = timeSeries1.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = timeSeries1.getTimePeriod(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        java.lang.Object obj13 = timeSeries1.clone();
        timeSeries1.fireSeriesChanged();
        boolean boolean15 = timeSeries1.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class4 = timeSeries3.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries3.addChangeListener(seriesChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener7);
        timeSeries3.setKey((java.lang.Comparable) "");
        java.lang.Object obj11 = timeSeries3.clone();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, (java.lang.Class) wildcardClass12);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        timeSeries16.setNotify(true);
        timeSeries16.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries14.addAndOrUpdate(timeSeries16);
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(timeSeries22);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean37 = timeSeries36.getNotify();
        int int38 = timeSeries36.getMaximumItemCount();
        java.util.List list39 = timeSeries36.data;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class45 = timeSeries44.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries44.addChangeListener(seriesChangeListener46);
        java.lang.Class class48 = timeSeries44.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class48);
        timeSeries36.timePeriodClass = class48;
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener51);
        timeSeries36.setDescription("hi!");
        java.lang.String str55 = timeSeries36.getDescription();
        java.lang.Class class56 = timeSeries36.timePeriodClass;
        timeSeries14.timePeriodClass = class56;
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class61 = timeSeries60.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries60.addChangeListener(seriesChangeListener62);
        java.lang.String str64 = timeSeries60.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class67 = timeSeries66.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener68 = null;
        timeSeries66.addChangeListener(seriesChangeListener68);
        org.jfree.data.time.TimeSeries timeSeries71 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class72 = timeSeries71.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener73 = null;
        timeSeries71.addChangeListener(seriesChangeListener73);
        org.jfree.data.time.TimeSeries timeSeries75 = timeSeries66.addAndOrUpdate(timeSeries71);
        java.lang.Class class76 = timeSeries75.getTimePeriodClass();
        timeSeries60.timePeriodClass = class76;
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class76);
        timeSeries14.timePeriodClass = class76;
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(class45);
        org.junit.Assert.assertNotNull(class48);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(class56);
        org.junit.Assert.assertNotNull(class61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Value" + "'", str64, "Value");
        org.junit.Assert.assertNotNull(class67);
        org.junit.Assert.assertNotNull(class72);
        org.junit.Assert.assertNotNull(timeSeries75);
        org.junit.Assert.assertNotNull(class76);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        int int24 = timeSeries1.getItemCount();
        java.util.List list25 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(true);
        java.lang.String str28 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) -1 + "'", comparable20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Time" + "'", str28, "Time");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.addChangeListener(seriesChangeListener13);
        java.lang.Class class15 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class15);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "", "", class15);
        timeSeries18.setNotify(true);
        java.lang.Comparable comparable21 = timeSeries18.getKey();
        timeSeries18.removeAgedItems(true);
        java.lang.Class class24 = timeSeries18.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0, class24);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.removeChangeListener(seriesChangeListener27);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 100.0d + "'", comparable21, 100.0d);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(class26);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries20.delete(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
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
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        long long77 = timeSeries76.getMaximumItemAge();
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
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 9223372036854775807L + "'", long77 == 9223372036854775807L);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        timeSeries20.setNotify(true);
        java.lang.String str29 = timeSeries20.getDomainDescription();
        java.lang.Class class30 = timeSeries20.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class30);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(timeSeries24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Time" + "'", str29, "Time");
        org.junit.Assert.assertNotNull(class30);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        java.lang.Comparable comparable47 = timeSeries37.getKey();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class50 = timeSeries49.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener51 = null;
        timeSeries49.addChangeListener(seriesChangeListener51);
        java.lang.String str53 = timeSeries49.getRangeDescription();
        int int54 = timeSeries49.getItemCount();
        java.util.List list55 = timeSeries49.data;
        int int56 = timeSeries49.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class68 = timeSeries67.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener69 = null;
        timeSeries67.addChangeListener(seriesChangeListener69);
        java.lang.Class class71 = timeSeries67.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class71);
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class71);
        org.jfree.data.time.TimeSeries timeSeries74 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "", "", class71);
        timeSeries74.clear();
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries49.addAndOrUpdate(timeSeries74);
        boolean boolean77 = timeSeries37.equals((java.lang.Object) timeSeries49);
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
        org.junit.Assert.assertEquals("'" + comparable47 + "' != '" + 10.0f + "'", comparable47, 10.0f);
        org.junit.Assert.assertNotNull(class50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value" + "'", str53, "Value");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(list55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertNotNull(class68);
        org.junit.Assert.assertNotNull(class71);
        org.junit.Assert.assertNotNull(timeSeries76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        timeSeries9.removePropertyChangeListener(propertyChangeListener13);
        int int15 = timeSeries9.getItemCount();
        timeSeries9.removeAgedItems(false);
        java.util.List list18 = timeSeries9.data;
        timeSeries7.data = list18;
        timeSeries7.setDomainDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener22);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod5, (double) 0.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
        timeSeries14.setKey((java.lang.Comparable) 100.0f);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number40 = timeSeries14.getValue(regularTimePeriod39);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, class13);
        java.lang.Class class16 = timeSeries15.getTimePeriodClass();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(class16);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        java.lang.Comparable comparable18 = timeSeries13.getKey();
        java.util.Collection collection19 = timeSeries13.getTimePeriods();
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + false + "'", comparable18, false);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "Time", class14);
        timeSeries17.setNotify(true);
        timeSeries17.fireSeriesChanged();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries17.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.add(regularTimePeriod23, 1.0d, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class6 = timeSeries5.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries5.addChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries5.getRangeDescription();
        timeSeries5.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries5.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean16 = timeSeries15.getNotify();
        int int17 = timeSeries15.getMaximumItemCount();
        java.util.List list18 = timeSeries15.data;
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries15.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class24 = timeSeries23.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries23.addChangeListener(seriesChangeListener25);
        java.lang.String str27 = timeSeries23.getRangeDescription();
        timeSeries23.fireSeriesChanged();
        java.lang.Class class29 = timeSeries23.getTimePeriodClass();
        timeSeries21.timePeriodClass = class29;
        java.lang.Class class31 = timeSeries21.getTimePeriodClass();
        java.lang.String str32 = timeSeries21.getDomainDescription();
        java.util.List list33 = timeSeries21.getItems();
        java.lang.Class class34 = timeSeries21.getTimePeriodClass();
        timeSeries5.timePeriodClass = class34;
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, class34);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        timeSeries38.removePropertyChangeListener(propertyChangeListener39);
        boolean boolean41 = timeSeries38.getNotify();
        boolean boolean42 = timeSeries38.getNotify();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class54 = timeSeries53.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        timeSeries53.addChangeListener(seriesChangeListener55);
        java.lang.Class class57 = timeSeries53.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class57);
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class57);
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "Time", class57);
        timeSeries38.timePeriodClass = class57;
        timeSeries36.timePeriodClass = class57;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) -1, "hi!", "Value", class57);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries66 = timeSeries63.createCopy((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(timeSeries21);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Value" + "'", str27, "Value");
        org.junit.Assert.assertNotNull(class29);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Time" + "'", str32, "Time");
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(class34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(class54);
        org.junit.Assert.assertNotNull(class57);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        long long8 = timeSeries1.getMaximumItemAge();
        timeSeries1.setDomainDescription("");
        java.lang.String str11 = timeSeries1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries1.removeChangeListener(seriesChangeListener12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.String str7 = timeSeries1.getDescription();
        timeSeries1.setDomainDescription("Value");
        timeSeries1.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        java.util.List list15 = timeSeries13.getItems();
        int int16 = timeSeries13.getItemCount();
        java.lang.Class class17 = timeSeries13.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.addAndOrUpdate(timeSeries13);
        java.util.List list19 = timeSeries18.data;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection22 = timeSeries21.getTimePeriods();
        boolean boolean24 = timeSeries21.equals((java.lang.Object) 100.0d);
        timeSeries21.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        timeSeries28.setNotify(true);
        boolean boolean32 = timeSeries21.equals((java.lang.Object) timeSeries28);
        timeSeries28.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class43 = timeSeries42.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class43);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class43);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int48 = timeSeries47.getMaximumItemCount();
        java.lang.Object obj49 = timeSeries47.clone();
        timeSeries47.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener52 = null;
        timeSeries47.removePropertyChangeListener(propertyChangeListener52);
        java.util.Collection collection54 = timeSeries45.getTimePeriodsUniqueToOtherSeries(timeSeries47);
        java.lang.Class class55 = timeSeries47.getTimePeriodClass();
        java.util.Collection collection56 = timeSeries28.getTimePeriodsUniqueToOtherSeries(timeSeries47);
        timeSeries28.removeAgedItems(true);
        java.lang.String str59 = timeSeries28.getRangeDescription();
        boolean boolean60 = timeSeries28.isEmpty();
        timeSeries28.setDescription("Overwritten values from: 10.0");
        java.util.List list63 = timeSeries28.data;
        timeSeries18.data = list63;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(class43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(class55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Value" + "'", str59, "Value");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(list63);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "Time", class14);
        timeSeries17.setNotify(true);
        timeSeries17.removeAgedItems((long) '4', true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries17.removeChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries29.addChangeListener(seriesChangeListener31);
        java.lang.Class class33 = timeSeries29.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class33);
        java.lang.Comparable comparable35 = timeSeries34.getKey();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean38 = timeSeries37.getNotify();
        int int39 = timeSeries37.getMaximumItemCount();
        java.util.List list40 = timeSeries37.data;
        timeSeries34.data = list40;
        boolean boolean42 = timeSeries17.equals((java.lang.Object) timeSeries34);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + 10 + "'", comparable35, 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        int int13 = timeSeries10.getMaximumItemCount();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update((int) (byte) 0, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        timeSeries1.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener17);
        java.util.List list19 = timeSeries1.getItems();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod20, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        timeSeries7.setNotify(true);
        timeSeries7.fireSeriesChanged();
        java.util.List list11 = timeSeries7.data;
        java.lang.String str12 = timeSeries7.getDomainDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Time" + "'", str12, "Time");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean37 = timeSeries36.getNotify();
        int int38 = timeSeries36.getMaximumItemCount();
        java.util.List list39 = timeSeries36.data;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class45 = timeSeries44.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries44.addChangeListener(seriesChangeListener46);
        java.lang.Class class48 = timeSeries44.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class48);
        timeSeries36.timePeriodClass = class48;
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener51);
        timeSeries36.setDescription("hi!");
        java.lang.String str55 = timeSeries36.getDescription();
        java.lang.Class class56 = timeSeries36.timePeriodClass;
        timeSeries14.timePeriodClass = class56;
        java.lang.Class class58 = timeSeries14.getTimePeriodClass();
        java.lang.String str59 = timeSeries14.getDescription();
        java.lang.Comparable comparable60 = timeSeries14.getKey();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(class45);
        org.junit.Assert.assertNotNull(class48);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(class56);
        org.junit.Assert.assertNotNull(class58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Time" + "'", str59, "Time");
        org.junit.Assert.assertEquals("'" + comparable60 + "' != '" + 2147483647 + "'", comparable60, 2147483647);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries7.removePropertyChangeListener(propertyChangeListener19);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries7.addChangeListener(seriesChangeListener21);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean4 = timeSeries3.getNotify();
        int int5 = timeSeries3.getMaximumItemCount();
        java.util.List list6 = timeSeries3.data;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener7);
        java.lang.String str9 = timeSeries3.getDescription();
        timeSeries3.setDomainDescription("Value");
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries3);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries3.removeChangeListener(seriesChangeListener13);
        timeSeries3.setKey((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        long long8 = timeSeries1.getMaximumItemAge();
        timeSeries1.setDescription("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
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
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries4.addChangeListener(seriesChangeListener6);
        java.lang.Class class8 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class8);
        java.lang.Comparable comparable10 = timeSeries9.getKey();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        int int14 = timeSeries12.getMaximumItemCount();
        java.util.List list15 = timeSeries12.data;
        timeSeries9.data = list15;
        timeSeries9.setDomainDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener19);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10 + "'", comparable10, 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.String str11 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries13.addAndOrUpdate(timeSeries18);
        java.lang.Class class23 = timeSeries22.getTimePeriodClass();
        timeSeries7.timePeriodClass = class23;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class23);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "", "Time", class23);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", class23);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class31 = timeSeries30.timePeriodClass;
        java.util.List list32 = timeSeries30.getItems();
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries30.createCopy((int) (byte) 0, 2147483647);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener38 = null;
        timeSeries37.removePropertyChangeListener(propertyChangeListener38);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int42 = timeSeries41.getMaximumItemCount();
        java.lang.Comparable comparable43 = timeSeries41.getKey();
        java.util.List list44 = timeSeries41.getItems();
        timeSeries37.data = list44;
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries35.addAndOrUpdate(timeSeries37);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean49 = timeSeries48.getNotify();
        int int50 = timeSeries48.getMaximumItemCount();
        java.util.List list51 = timeSeries48.data;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class57 = timeSeries56.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        timeSeries56.addChangeListener(seriesChangeListener58);
        java.lang.Class class60 = timeSeries56.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class60);
        timeSeries48.timePeriodClass = class60;
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        timeSeries48.addPropertyChangeListener(propertyChangeListener63);
        timeSeries48.setDescription("hi!");
        java.util.Collection collection67 = timeSeries48.getTimePeriods();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener68 = null;
        timeSeries48.addChangeListener(seriesChangeListener68);
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries35.addAndOrUpdate(timeSeries48);
        org.jfree.data.time.TimeSeries timeSeries72 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int73 = timeSeries72.getMaximumItemCount();
        timeSeries72.clear();
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int77 = timeSeries76.getMaximumItemCount();
        java.lang.Comparable comparable78 = timeSeries76.getKey();
        java.util.List list79 = timeSeries76.getItems();
        timeSeries72.data = list79;
        timeSeries48.data = list79;
        timeSeries28.data = list79;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod83 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries28.delete(regularTimePeriod83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + (byte) 10 + "'", comparable43, (byte) 10);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(timeSeries46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertNotNull(list51);
        org.junit.Assert.assertNotNull(class57);
        org.junit.Assert.assertNotNull(class60);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2147483647 + "'", int73 == 2147483647);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2147483647 + "'", int77 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable78 + "' != '" + (byte) 10 + "'", comparable78, (byte) 10);
        org.junit.Assert.assertNotNull(list79);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        boolean boolean14 = timeSeries1.getNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        boolean boolean13 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.removeChangeListener(seriesChangeListener16);
        long long18 = timeSeries15.getMaximumItemAge();
        timeSeries15.setKey((java.lang.Comparable) 2147483647);
        java.util.Collection collection21 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries15);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(timeSeriesDataItem22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        java.lang.Object obj13 = timeSeries1.clone();
        timeSeries1.fireSeriesChanged();
        java.lang.String str15 = timeSeries1.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.setMaximumItemCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'maximum' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        long long14 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries1.createCopy((int) (byte) 10, 32);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection20 = timeSeries19.getTimePeriods();
        boolean boolean22 = timeSeries19.equals((java.lang.Object) 100.0d);
        timeSeries19.setNotify(true);
        boolean boolean25 = timeSeries19.getNotify();
        timeSeries19.removeAgedItems(true);
        boolean boolean28 = timeSeries17.equals((java.lang.Object) true);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 9223372036854775807L + "'", long14 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        java.util.List list10 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) (byte) 100, false);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries1.addChangeListener(seriesChangeListener14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        timeSeries1.setKey((java.lang.Comparable) (byte) 10);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem25 = timeSeries1.addOrUpdate(regularTimePeriod23, (java.lang.Number) 10.0f);
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
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "", "", class14);
        timeSeries17.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries17.addChangeListener(seriesChangeListener20);
        int int22 = timeSeries17.getItemCount();
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.util.List list6 = timeSeries1.data;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        java.util.List list16 = timeSeries1.getItems();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod17, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        java.lang.String str6 = timeSeries2.getRangeDescription();
        timeSeries2.fireSeriesChanged();
        java.lang.Comparable comparable8 = timeSeries2.getKey();
        java.lang.String str9 = timeSeries2.getRangeDescription();
        java.lang.Class class10 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 97L, class10);
        java.lang.Comparable comparable12 = timeSeries11.getKey();
        timeSeries11.setDomainDescription("Overwritten values from: 10.0");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.delete(2147483647, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + 10.0f + "'", comparable8, 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 97L + "'", comparable12, 97L);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        java.util.List list2 = timeSeries1.data;
        boolean boolean3 = timeSeries1.isEmpty();
        timeSeries1.removeAgedItems((long) (short) -1, false);
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int7 = timeSeries6.getMaximumItemCount();
        java.lang.Comparable comparable8 = timeSeries6.getKey();
        java.util.List list9 = timeSeries6.getItems();
        timeSeries6.setKey((java.lang.Comparable) 0L);
        java.util.List list12 = timeSeries6.data;
        timeSeries1.data = list12;
        timeSeries1.setDomainDescription("hi!");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries1.getValue(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + (byte) 10 + "'", comparable8, (byte) 10);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        timeSeries1.setMaximumItemAge((long) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (byte) -1 + "'", comparable31, (byte) -1);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        long long21 = timeSeries9.getMaximumItemAge();
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + 10 + "'", comparable10, 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 9223372036854775807L + "'", long21 == 9223372036854775807L);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        boolean boolean10 = timeSeries1.getNotify();
        boolean boolean11 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy((int) ' ', 2147483647);
        java.lang.Class class15 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number17 = timeSeries1.getValue(regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(class15);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        java.util.List list33 = timeSeries1.data;
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
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(list33);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        int int19 = timeSeries18.getMaximumItemCount();
        timeSeries18.setMaximumItemAge((long) (byte) 10);
        timeSeries18.removeAgedItems(true);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        boolean boolean13 = timeSeries10.equals((java.lang.Object) 100.0d);
        timeSeries10.setMaximumItemAge((long) 'a');
        int int16 = timeSeries10.getItemCount();
        java.util.List list17 = timeSeries10.getItems();
        timeSeries10.setMaximumItemCount((int) '#');
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries1.addAndOrUpdate(timeSeries10);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries20.addChangeListener(seriesChangeListener21);
        java.lang.Class class23 = timeSeries20.timePeriodClass;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 10 + "'", comparable6, (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(class23);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        int int33 = timeSeries7.getMaximumItemCount();
        java.lang.String str34 = timeSeries7.getDescription();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        timeSeries1.fireSeriesChanged();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy((int) (byte) 1, (int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy(0, (int) (byte) 100);
        timeSeries14.removeAgedItems((long) (short) -1, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = timeSeries1.addOrUpdate(regularTimePeriod6, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries19.removeChangeListener(seriesChangeListener33);
        timeSeries19.setKey((java.lang.Comparable) (short) 0);
        boolean boolean37 = timeSeries19.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries19.removeChangeListener(seriesChangeListener33);
        timeSeries19.setKey((java.lang.Comparable) (short) 0);
        java.util.List list37 = timeSeries19.data;
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
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        timeSeries6.setKey((java.lang.Comparable) (-1L));
        timeSeries6.setNotify(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        boolean boolean41 = timeSeries40.getNotify();
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
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection31 = timeSeries30.getTimePeriods();
        java.util.Collection collection32 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries30);
        int int33 = timeSeries10.getItemCount();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        timeSeries20.setDescription("hi!");
        timeSeries20.removeAgedItems((long) (short) 0, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeSeries20);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        timeSeries13.clear();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection17 = timeSeries16.getTimePeriods();
        boolean boolean19 = timeSeries16.equals((java.lang.Object) 100.0d);
        timeSeries16.fireSeriesChanged();
        timeSeries16.setDomainDescription("Value");
        java.util.Collection collection23 = timeSeries16.getTimePeriods();
        java.util.List list24 = timeSeries16.data;
        timeSeries13.data = list24;
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        boolean boolean52 = timeSeries21.getNotify();
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 97L);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        java.lang.String str8 = timeSeries1.getDomainDescription();
        java.lang.String str9 = timeSeries1.getRangeDescription();
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        boolean boolean10 = timeSeries1.getNotify();
        boolean boolean11 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy((int) ' ', 2147483647);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod15, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeSeries14);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        timeSeries6.removeAgedItems((long) (short) 10, true);
        boolean boolean21 = timeSeries6.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.add(regularTimePeriod22, (java.lang.Number) 1L, true);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        timeSeries13.setMaximumItemCount((int) '4');
        long long27 = timeSeries13.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries13.add(regularTimePeriod28, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 9223372036854775807L + "'", long27 == 9223372036854775807L);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "Time", class14);
        timeSeries17.setNotify(true);
        timeSeries17.removeAgedItems((long) '4', true);
        long long23 = timeSeries17.getMaximumItemAge();
        boolean boolean24 = timeSeries17.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem27 = timeSeries17.addOrUpdate(regularTimePeriod25, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9223372036854775807L + "'", long23 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, "", "", class17);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(class17);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        boolean boolean18 = timeSeries14.getNotify();
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection24 = timeSeries23.getTimePeriods();
        java.lang.Class class25 = timeSeries23.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        timeSeries28.removeAgedItems(true);
        boolean boolean32 = timeSeries26.equals((java.lang.Object) timeSeries28);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class38 = timeSeries37.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener39 = null;
        timeSeries37.addChangeListener(seriesChangeListener39);
        java.lang.Class class41 = timeSeries37.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class41);
        java.lang.Comparable comparable43 = timeSeries42.getKey();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean46 = timeSeries45.getNotify();
        timeSeries45.setMaximumItemCount(0);
        timeSeries45.setDescription("Time");
        timeSeries45.setMaximumItemCount((int) (short) 1);
        java.util.Collection collection53 = timeSeries42.getTimePeriodsUniqueToOtherSeries(timeSeries45);
        org.jfree.data.time.TimeSeries timeSeries54 = timeSeries28.addAndOrUpdate(timeSeries42);
        java.lang.Class class55 = timeSeries54.timePeriodClass;
        java.lang.Object obj56 = timeSeries54.clone();
        java.util.Collection collection57 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries54);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertEquals("'" + comparable43 + "' != '" + 10 + "'", comparable43, 10);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(timeSeries54);
        org.junit.Assert.assertNotNull(class55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNotNull(collection57);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        timeSeries1.removeAgedItems(true);
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
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        timeSeries1.setKey((java.lang.Comparable) (byte) 0);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries1.addChangeListener(seriesChangeListener30);
        timeSeries1.setMaximumItemCount(0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(class24);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod14, (java.lang.Number) 35L);
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
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        timeSeries17.removeAgedItems(true);
        timeSeries17.setMaximumItemCount(0);
        timeSeries17.setNotify(false);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 100.0d + "'", comparable20, 100.0d);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        timeSeries1.setMaximumItemCount((int) (byte) 10);
        timeSeries1.setRangeDescription("Time");
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = timeSeries1.getValue(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod13, (java.lang.Number) 10L, true);
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
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries17 = timeSeries7.createCopy(regularTimePeriod15, regularTimePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        timeSeries1.fireSeriesChanged();
        java.lang.Object obj6 = timeSeries1.clone();
        timeSeries1.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int11 = timeSeries10.getMaximumItemCount();
        int int12 = timeSeries10.getMaximumItemCount();
        java.lang.Object obj13 = timeSeries10.clone();
        timeSeries10.clear();
        java.lang.Comparable comparable15 = timeSeries10.getKey();
        long long16 = timeSeries10.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean21 = timeSeries20.getNotify();
        int int22 = timeSeries20.getMaximumItemCount();
        timeSeries20.setRangeDescription("hi!");
        java.lang.Class class25 = timeSeries20.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class25);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, class25);
        boolean boolean28 = timeSeries10.equals((java.lang.Object) class25);
        timeSeries1.timePeriodClass = class25;
        org.jfree.data.time.TimeSeries timeSeries30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries31 = timeSeries1.addAndOrUpdate(timeSeries30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (byte) 10 + "'", comparable15, (byte) 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        java.lang.Class class34 = timeSeries14.timePeriodClass;
        long long35 = timeSeries14.getMaximumItemAge();
        int int36 = timeSeries14.getMaximumItemCount();
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
        org.junit.Assert.assertNotNull(class34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9223372036854775807L + "'", long35 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int15 = timeSeries14.getMaximumItemCount();
        int int16 = timeSeries14.getMaximumItemCount();
        java.lang.Object obj17 = timeSeries14.clone();
        timeSeries14.clear();
        java.util.List list19 = timeSeries14.data;
        timeSeries5.data = list19;
        int int21 = timeSeries5.getItemCount();
        java.lang.Class<?> wildcardClass22 = timeSeries5.getClass();
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.fireSeriesChanged();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.clear();
        java.lang.String str9 = timeSeries1.getDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        timeSeries1.removeAgedItems(true);
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class9 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int6 = timeSeries5.getMaximumItemCount();
        java.lang.Comparable comparable7 = timeSeries5.getKey();
        java.util.List list8 = timeSeries5.getItems();
        timeSeries1.data = list8;
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.createCopy((int) ' ', (int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries12.removeChangeListener(seriesChangeListener13);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries12.createCopy(1, (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class23 = timeSeries22.timePeriodClass;
        java.util.List list24 = timeSeries22.getItems();
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries22.createCopy((int) (byte) 0, 2147483647);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries29.removePropertyChangeListener(propertyChangeListener30);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int34 = timeSeries33.getMaximumItemCount();
        java.lang.Comparable comparable35 = timeSeries33.getKey();
        java.util.List list36 = timeSeries33.getItems();
        timeSeries29.data = list36;
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries27.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection41 = timeSeries40.getTimePeriods();
        boolean boolean43 = timeSeries40.equals((java.lang.Object) 100.0d);
        timeSeries40.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection48 = timeSeries47.getTimePeriods();
        timeSeries47.setNotify(true);
        boolean boolean51 = timeSeries40.equals((java.lang.Object) timeSeries47);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class54 = timeSeries53.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener55 = null;
        timeSeries53.addChangeListener(seriesChangeListener55);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class59 = timeSeries58.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries58.addChangeListener(seriesChangeListener60);
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries53.addAndOrUpdate(timeSeries58);
        java.util.Collection collection63 = timeSeries47.getTimePeriodsUniqueToOtherSeries(timeSeries58);
        timeSeries58.clear();
        timeSeries58.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries29.addAndOrUpdate(timeSeries58);
        org.jfree.data.time.TimeSeries timeSeries76 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class77 = timeSeries76.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener78 = null;
        timeSeries76.addChangeListener(seriesChangeListener78);
        java.lang.Class class80 = timeSeries76.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries81 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class80);
        org.jfree.data.time.TimeSeries timeSeries82 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class80);
        org.jfree.data.time.TimeSeries timeSeries83 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class80);
        timeSeries67.timePeriodClass = class80;
        org.jfree.data.time.TimeSeries timeSeries85 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "Value", class80);
        timeSeries17.timePeriodClass = class80;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertNotNull(timeSeries27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + (byte) 10 + "'", comparable35, (byte) 10);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(class54);
        org.junit.Assert.assertNotNull(class59);
        org.junit.Assert.assertNotNull(timeSeries62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertNotNull(class77);
        org.junit.Assert.assertNotNull(class80);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        timeSeries40.clear();
        java.lang.Class class42 = timeSeries40.getTimePeriodClass();
        java.lang.String str43 = timeSeries40.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod44 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries40.add(regularTimePeriod44, (double) 1.0f);
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
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Value" + "'", str43, "Value");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int9 = timeSeries8.getMaximumItemCount();
        int int10 = timeSeries8.getMaximumItemCount();
        java.lang.Object obj11 = timeSeries8.clone();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        timeSeries13.setDomainDescription("");
        boolean boolean17 = timeSeries8.equals((java.lang.Object) timeSeries13);
        int int18 = timeSeries8.getMaximumItemCount();
        timeSeries8.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean22 = timeSeries21.getNotify();
        timeSeries21.setMaximumItemCount(0);
        timeSeries21.setDescription("Time");
        java.lang.Comparable comparable27 = timeSeries21.getKey();
        timeSeries21.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class32 = timeSeries31.timePeriodClass;
        java.util.List list33 = timeSeries31.getItems();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries31.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection37 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries36);
        java.util.Collection collection38 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        timeSeries21.setMaximumItemCount((int) (byte) 10);
        java.lang.String str41 = timeSeries21.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean44 = timeSeries43.getNotify();
        int int45 = timeSeries43.getMaximumItemCount();
        java.util.List list46 = timeSeries43.data;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class52 = timeSeries51.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        timeSeries51.addChangeListener(seriesChangeListener53);
        java.lang.Class class55 = timeSeries51.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class55);
        timeSeries43.timePeriodClass = class55;
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        timeSeries43.addPropertyChangeListener(propertyChangeListener58);
        timeSeries43.setDescription("hi!");
        java.lang.String str62 = timeSeries43.getDescription();
        java.lang.Class class63 = timeSeries43.timePeriodClass;
        timeSeries21.timePeriodClass = class63;
        timeSeries1.timePeriodClass = class63;
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries67.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries1.addAndOrUpdate(timeSeries67);
        int int71 = timeSeries70.getMaximumItemCount();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (byte) -1 + "'", comparable27, (byte) -1);
        org.junit.Assert.assertNotNull(class32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Time" + "'", str41, "Time");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(class52);
        org.junit.Assert.assertNotNull(class55);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(class63);
        org.junit.Assert.assertNotNull(timeSeries70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2147483647 + "'", int71 == 2147483647);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries1.addChangeListener(seriesChangeListener12);
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener14);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Value" + "'", str10, "Value");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.removeAgedItems((long) (byte) 100, false);
        java.lang.String str6 = timeSeries1.getDescription();
        timeSeries1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemAge((long) 'a');
        boolean boolean7 = timeSeries1.getNotify();
        java.util.Collection collection8 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection11 = timeSeries10.getTimePeriods();
        boolean boolean13 = timeSeries10.equals((java.lang.Object) 100.0d);
        timeSeries10.setMaximumItemAge((long) 'a');
        int int16 = timeSeries10.getItemCount();
        java.util.List list17 = timeSeries10.getItems();
        timeSeries10.setMaximumItemCount((int) '#');
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries1.addAndOrUpdate(timeSeries10);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean23 = timeSeries22.getNotify();
        int int24 = timeSeries22.getMaximumItemCount();
        timeSeries22.setRangeDescription("hi!");
        java.lang.Class class27 = timeSeries22.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        timeSeries22.removePropertyChangeListener(propertyChangeListener28);
        timeSeries22.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class41 = timeSeries40.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries40.addChangeListener(seriesChangeListener42);
        java.lang.Class class44 = timeSeries40.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class44);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class44);
        timeSeries22.timePeriodClass = class44;
        java.util.List list49 = timeSeries22.data;
        timeSeries1.data = list49;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem53 = timeSeries1.addOrUpdate(regularTimePeriod51, (java.lang.Number) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 10 + "'", comparable6, (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertNotNull(list49);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        java.lang.String str22 = timeSeries10.getDescription();
        timeSeries10.setDomainDescription("Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        timeSeries1.setDescription("Value");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = timeSeries1.getIndex(regularTimePeriod14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        timeSeries28.setKey((java.lang.Comparable) (byte) 1);
        timeSeries28.clear();
        java.lang.Object obj32 = timeSeries28.clone();
        timeSeries28.setMaximumItemCount((int) (short) 1);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        boolean boolean9 = timeSeries6.equals((java.lang.Object) 100.0d);
        timeSeries6.fireSeriesChanged();
        timeSeries6.setDomainDescription("Value");
        java.util.Collection collection13 = timeSeries6.getTimePeriods();
        int int14 = timeSeries6.getMaximumItemCount();
        java.lang.Class<?> wildcardClass15 = timeSeries6.getClass();
        timeSeries1.timePeriodClass = wildcardClass15;
        java.lang.Comparable comparable17 = timeSeries1.getKey();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(0, (java.lang.Number) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (byte) -1 + "'", comparable17, (byte) -1);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        java.util.List list5 = timeSeries1.data;
        timeSeries1.setMaximumItemCount(1);
        int int8 = timeSeries1.getMaximumItemCount();
        java.util.List list9 = timeSeries1.data;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries2.setRangeDescription("Value");
        int int5 = timeSeries2.getMaximumItemCount();
        java.lang.Class class6 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), class6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        java.util.List list29 = timeSeries19.data;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries19.update((int) (short) 0, (java.lang.Number) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        timeSeries1.clear();
        java.lang.Object obj37 = timeSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        java.lang.Class class16 = timeSeries12.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class16);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean22 = timeSeries21.getNotify();
        int int23 = timeSeries21.getMaximumItemCount();
        timeSeries21.setRangeDescription("hi!");
        java.lang.Class class26 = timeSeries21.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class26);
        timeSeries18.timePeriodClass = class26;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class26);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, "", "Overwritten values from: 10.0", class26);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, class26);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(class26);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        boolean boolean13 = timeSeries1.getNotify();
        timeSeries1.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries1.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class44 = timeSeries43.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener45 = null;
        timeSeries43.addChangeListener(seriesChangeListener45);
        java.beans.PropertyChangeListener propertyChangeListener47 = null;
        timeSeries43.removePropertyChangeListener(propertyChangeListener47);
        timeSeries43.setKey((java.lang.Comparable) "");
        java.lang.Object obj51 = timeSeries43.clone();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass52);
        timeSeries40.timePeriodClass = wildcardClass52;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number56 = timeSeries40.getValue(regularTimePeriod55);
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
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.removeAgedItems((-1L), false);
        java.util.List list8 = timeSeries1.getItems();
        java.lang.Class class9 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int9 = timeSeries8.getMaximumItemCount();
        int int10 = timeSeries8.getMaximumItemCount();
        java.lang.Object obj11 = timeSeries8.clone();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        timeSeries13.setDomainDescription("");
        boolean boolean17 = timeSeries8.equals((java.lang.Object) timeSeries13);
        int int18 = timeSeries8.getMaximumItemCount();
        timeSeries8.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean22 = timeSeries21.getNotify();
        timeSeries21.setMaximumItemCount(0);
        timeSeries21.setDescription("Time");
        java.lang.Comparable comparable27 = timeSeries21.getKey();
        timeSeries21.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class32 = timeSeries31.timePeriodClass;
        java.util.List list33 = timeSeries31.getItems();
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries31.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection37 = timeSeries21.getTimePeriodsUniqueToOtherSeries(timeSeries36);
        java.util.Collection collection38 = timeSeries8.getTimePeriodsUniqueToOtherSeries(timeSeries21);
        timeSeries21.setMaximumItemCount((int) (byte) 10);
        java.lang.String str41 = timeSeries21.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean44 = timeSeries43.getNotify();
        int int45 = timeSeries43.getMaximumItemCount();
        java.util.List list46 = timeSeries43.data;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class52 = timeSeries51.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        timeSeries51.addChangeListener(seriesChangeListener53);
        java.lang.Class class55 = timeSeries51.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class55);
        timeSeries43.timePeriodClass = class55;
        java.beans.PropertyChangeListener propertyChangeListener58 = null;
        timeSeries43.addPropertyChangeListener(propertyChangeListener58);
        timeSeries43.setDescription("hi!");
        java.lang.String str62 = timeSeries43.getDescription();
        java.lang.Class class63 = timeSeries43.timePeriodClass;
        timeSeries21.timePeriodClass = class63;
        timeSeries1.timePeriodClass = class63;
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries67.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries1.addAndOrUpdate(timeSeries67);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem73 = timeSeries1.addOrUpdate(regularTimePeriod71, (java.lang.Number) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + (byte) -1 + "'", comparable27, (byte) -1);
        org.junit.Assert.assertNotNull(class32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Time" + "'", str41, "Time");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(class52);
        org.junit.Assert.assertNotNull(class55);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(class63);
        org.junit.Assert.assertNotNull(timeSeries70);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100);
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
        timeSeries21.setRangeDescription("Value");
        boolean boolean37 = timeSeries1.equals((java.lang.Object) "Value");
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.lang.String str40 = timeSeries39.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class43 = timeSeries42.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries42.addChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class48 = timeSeries47.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries47.addChangeListener(seriesChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries42.addAndOrUpdate(timeSeries47);
        java.lang.Class class52 = timeSeries51.getTimePeriodClass();
        timeSeries39.timePeriodClass = class52;
        timeSeries39.setKey((java.lang.Comparable) '4');
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries1.addAndOrUpdate(timeSeries39);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod57 = timeSeries56.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(class43);
        org.junit.Assert.assertNotNull(class48);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNotNull(class52);
        org.junit.Assert.assertNotNull(timeSeries56);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.fireSeriesChanged();
        timeSeries1.setDomainDescription("Value");
        java.util.Collection collection8 = timeSeries1.getTimePeriods();
        int int9 = timeSeries1.getMaximumItemCount();
        boolean boolean10 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemCount((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = timeSeries1.getDataItem((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        timeSeries19.setNotify(true);
        timeSeries19.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number31 = timeSeries19.getValue(regularTimePeriod30);
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
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener4 = null;
        timeSeries2.addChangeListener(seriesChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries2.addAndOrUpdate(timeSeries7);
        timeSeries11.setNotify(false);
        java.lang.Class<?> wildcardClass14 = timeSeries11.getClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass14);
        boolean boolean16 = timeSeries15.isEmpty();
        timeSeries15.setMaximumItemAge(100L);
        long long19 = timeSeries15.getMaximumItemAge();
        java.util.List list20 = timeSeries15.getItems();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(list20);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        boolean boolean5 = timeSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        java.lang.Class class12 = timeSeries1.timePeriodClass;
        timeSeries1.setMaximumItemCount(0);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod15, (java.lang.Number) 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Object obj3 = timeSeries2.clone();
        java.lang.String str4 = timeSeries2.getRangeDescription();
        java.lang.Class<?> wildcardClass5 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass5);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries6.addChangeListener(seriesChangeListener7);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Value" + "'", str4, "Value");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection39 = timeSeries38.getTimePeriods();
        timeSeries38.setNotify(true);
        timeSeries38.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries23.addAndOrUpdate(timeSeries38);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean47 = timeSeries46.getNotify();
        timeSeries46.setMaximumItemCount(0);
        timeSeries46.setDescription("Time");
        java.lang.Comparable comparable52 = timeSeries46.getKey();
        java.lang.Class class53 = timeSeries46.getTimePeriodClass();
        timeSeries44.timePeriodClass = class53;
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
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + comparable52 + "' != '" + (byte) -1 + "'", comparable52, (byte) -1);
        org.junit.Assert.assertNotNull(class53);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        timeSeries1.setDescription("Time");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod21, (java.lang.Number) 10L);
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
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        int int48 = timeSeries46.getItemCount();
        java.lang.String str49 = timeSeries46.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod50 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries46.add(regularTimePeriod50, (double) (byte) 0, false);
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.setKey((java.lang.Comparable) 10L);
        java.lang.String str5 = timeSeries1.getDescription();
        java.lang.Number number7 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) (byte) 100, number7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        timeSeries28.setRangeDescription("Value");
        java.util.Collection collection31 = timeSeries28.getTimePeriods();
        timeSeries28.fireSeriesChanged();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        long long19 = timeSeries18.getMaximumItemAge();
        timeSeries18.setRangeDescription("hi!");
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj3 = timeSeries1.clone();
        timeSeries1.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener6);
        int int8 = timeSeries1.getItemCount();
        java.lang.String str9 = timeSeries1.getDescription();
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
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries32.setRangeDescription("Value");
        java.util.List list35 = timeSeries32.getItems();
        boolean boolean36 = timeSeries17.equals((java.lang.Object) timeSeries32);
        java.util.List list37 = timeSeries17.getItems();
        timeSeries1.data = list37;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
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
        org.junit.Assert.assertNotNull(list35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        timeSeries17.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries17.getDataItem((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9223372036854775807L + "'", long22 == 9223372036854775807L);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean7 = timeSeries1.equals((java.lang.Object) (short) 10);
        boolean boolean8 = timeSeries1.getNotify();
        java.beans.PropertyChangeListener propertyChangeListener9 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        timeSeries12.setMaximumItemCount(0);
        timeSeries12.setDescription("Time");
        java.lang.String str18 = timeSeries12.getDomainDescription();
        timeSeries12.setNotify(true);
        java.lang.Comparable comparable21 = timeSeries12.getKey();
        java.lang.Class class22 = timeSeries12.timePeriodClass;
        timeSeries1.timePeriodClass = class22;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries1.addOrUpdate(regularTimePeriod24, (java.lang.Number) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + (byte) -1 + "'", comparable21, (byte) -1);
        org.junit.Assert.assertNotNull(class22);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        java.util.List list5 = timeSeries1.data;
        timeSeries1.setMaximumItemCount(1);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class5 = timeSeries4.timePeriodClass;
        java.util.List list6 = timeSeries4.getItems();
        org.jfree.data.time.TimeSeries timeSeries9 = timeSeries4.createCopy((int) (byte) 0, 2147483647);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries11.removePropertyChangeListener(propertyChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int16 = timeSeries15.getMaximumItemCount();
        java.lang.Comparable comparable17 = timeSeries15.getKey();
        java.util.List list18 = timeSeries15.getItems();
        timeSeries11.data = list18;
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries9.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection23 = timeSeries22.getTimePeriods();
        boolean boolean25 = timeSeries22.equals((java.lang.Object) 100.0d);
        timeSeries22.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection30 = timeSeries29.getTimePeriods();
        timeSeries29.setNotify(true);
        boolean boolean33 = timeSeries22.equals((java.lang.Object) timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class36 = timeSeries35.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener37 = null;
        timeSeries35.addChangeListener(seriesChangeListener37);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class41 = timeSeries40.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries40.addChangeListener(seriesChangeListener42);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries35.addAndOrUpdate(timeSeries40);
        java.util.Collection collection45 = timeSeries29.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        timeSeries40.clear();
        timeSeries40.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries11.addAndOrUpdate(timeSeries40);
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class59 = timeSeries58.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries58.addChangeListener(seriesChangeListener60);
        java.lang.Class class62 = timeSeries58.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class62);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class62);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class62);
        timeSeries49.timePeriodClass = class62;
        org.jfree.data.time.TimeSeries timeSeries67 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, "Value", "Value", class62);
        boolean boolean68 = timeSeries67.isEmpty();
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNotNull(timeSeries9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (byte) 10 + "'", comparable17, (byte) 10);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(class36);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(timeSeries49);
        org.junit.Assert.assertNotNull(class59);
        org.junit.Assert.assertNotNull(class62);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int34 = timeSeries33.getMaximumItemCount();
        int int35 = timeSeries33.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean38 = timeSeries37.getNotify();
        int int39 = timeSeries37.getMaximumItemCount();
        java.util.List list40 = timeSeries37.data;
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries37.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class46 = timeSeries45.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        timeSeries45.addChangeListener(seriesChangeListener47);
        java.lang.String str49 = timeSeries45.getRangeDescription();
        timeSeries45.fireSeriesChanged();
        java.lang.Class class51 = timeSeries45.getTimePeriodClass();
        timeSeries43.timePeriodClass = class51;
        boolean boolean53 = timeSeries33.equals((java.lang.Object) timeSeries43);
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class56 = timeSeries55.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries55.addChangeListener(seriesChangeListener57);
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class61 = timeSeries60.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener62 = null;
        timeSeries60.addChangeListener(seriesChangeListener62);
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries55.addAndOrUpdate(timeSeries60);
        timeSeries64.setNotify(false);
        timeSeries64.removeAgedItems(1L, true);
        timeSeries64.setKey((java.lang.Comparable) 0.0f);
        org.jfree.data.time.TimeSeries timeSeries72 = timeSeries43.addAndOrUpdate(timeSeries64);
        org.jfree.data.time.TimeSeries timeSeries73 = timeSeries31.addAndOrUpdate(timeSeries43);
        java.util.List list74 = timeSeries73.data;
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(timeSeries43);
        org.junit.Assert.assertNotNull(class46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Value" + "'", str49, "Value");
        org.junit.Assert.assertNotNull(class51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(class56);
        org.junit.Assert.assertNotNull(class61);
        org.junit.Assert.assertNotNull(timeSeries64);
        org.junit.Assert.assertNotNull(timeSeries72);
        org.junit.Assert.assertNotNull(timeSeries73);
        org.junit.Assert.assertNotNull(list74);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        timeSeries14.setDescription("Value");
        timeSeries14.setRangeDescription("Overwritten values from: 10.0");
        java.lang.Comparable comparable29 = timeSeries14.getKey();
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
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + (byte) -1 + "'", comparable29, (byte) -1);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int15 = timeSeries14.getMaximumItemCount();
        int int16 = timeSeries14.getMaximumItemCount();
        java.lang.Object obj17 = timeSeries14.clone();
        timeSeries14.clear();
        java.util.List list19 = timeSeries14.data;
        timeSeries5.data = list19;
        int int21 = timeSeries5.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection27 = timeSeries26.getTimePeriods();
        java.lang.Class class28 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class28);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection32 = timeSeries31.getTimePeriods();
        timeSeries31.removeAgedItems(true);
        boolean boolean35 = timeSeries29.equals((java.lang.Object) timeSeries31);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class41 = timeSeries40.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries40.addChangeListener(seriesChangeListener42);
        java.lang.Class class44 = timeSeries40.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class44);
        java.lang.Comparable comparable46 = timeSeries45.getKey();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean49 = timeSeries48.getNotify();
        timeSeries48.setMaximumItemCount(0);
        timeSeries48.setDescription("Time");
        timeSeries48.setMaximumItemCount((int) (short) 1);
        java.util.Collection collection56 = timeSeries45.getTimePeriodsUniqueToOtherSeries(timeSeries48);
        org.jfree.data.time.TimeSeries timeSeries57 = timeSeries31.addAndOrUpdate(timeSeries45);
        boolean boolean58 = timeSeries57.isEmpty();
        java.lang.String str59 = timeSeries57.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries60 = timeSeries5.addAndOrUpdate(timeSeries57);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertEquals("'" + comparable46 + "' != '" + 10 + "'", comparable46, 10);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Value" + "'", str59, "Value");
        org.junit.Assert.assertNotNull(timeSeries60);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        java.util.List list2 = timeSeries1.data;
        long long3 = timeSeries1.getMaximumItemAge();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number5 = timeSeries1.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(list2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9223372036854775807L + "'", long3 == 9223372036854775807L);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, class31);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener36);
        boolean boolean38 = timeSeries35.getNotify();
        boolean boolean39 = timeSeries35.getNotify();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class51 = timeSeries50.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener52 = null;
        timeSeries50.addChangeListener(seriesChangeListener52);
        java.lang.Class class54 = timeSeries50.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class54);
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class54);
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "Time", class54);
        timeSeries35.timePeriodClass = class54;
        timeSeries33.timePeriodClass = class54;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries33.removeChangeListener(seriesChangeListener60);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(class51);
        org.junit.Assert.assertNotNull(class54);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        java.lang.Class class5 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "hi!", "Overwritten values from: 10.0", "hi!", class5);
        org.junit.Assert.assertNotNull(class5);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        boolean boolean17 = timeSeries16.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener18 = null;
        timeSeries16.addPropertyChangeListener(propertyChangeListener18);
        org.jfree.data.time.TimeSeries timeSeries20 = timeSeries14.addAndOrUpdate(timeSeries16);
        org.jfree.data.time.TimeSeries timeSeries21 = timeSeries1.addAndOrUpdate(timeSeries16);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 10.0f + "'", comparable12, 10.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeSeries20);
        org.junit.Assert.assertNotNull(timeSeries21);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        java.lang.Comparable comparable12 = timeSeries1.getKey();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + 'a' + "'", comparable12, 'a');
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.clear();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem5 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.fireSeriesChanged();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        java.lang.String str8 = timeSeries1.getDomainDescription();
        timeSeries1.fireSeriesChanged();
        int int10 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem13 = timeSeries1.addOrUpdate(regularTimePeriod11, (java.lang.Number) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + 10.0f + "'", comparable7, 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Time" + "'", str8, "Time");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) 32);
        timeSeries6.setDomainDescription("Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        int int17 = timeSeries15.getMaximumItemCount();
        java.lang.Class<?> wildcardClass18 = timeSeries15.getClass();
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, (java.lang.Class) wildcardClass18);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        java.lang.Object obj44 = timeSeries24.clone();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries1.addAndOrUpdate(timeSeries24);
        org.junit.Assert.assertNotNull(class2);
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
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(timeSeries45);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        boolean boolean5 = timeSeries1.getNotify();
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.lang.String str7 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean10 = timeSeries9.getNotify();
        int int11 = timeSeries9.getMaximumItemCount();
        timeSeries9.setRangeDescription("hi!");
        java.lang.String str14 = timeSeries9.getDescription();
        timeSeries9.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries1.addAndOrUpdate(timeSeries9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        timeSeries1.setKey((java.lang.Comparable) 'a');
        java.lang.Class class12 = timeSeries1.getTimePeriodClass();
        timeSeries1.setDescription("hi!");
        timeSeries1.setDescription("Value");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        timeSeries1.setMaximumItemAge((long) (byte) 10);
        java.lang.String str23 = timeSeries1.getDomainDescription();
        java.lang.Class class24 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Time" + "'", str23, "Time");
        org.junit.Assert.assertNotNull(class24);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.String str2 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Time" + "'", str2, "Time");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        java.lang.Object obj13 = timeSeries1.clone();
        timeSeries1.fireSeriesChanged();
        timeSeries1.clear();
        timeSeries1.setDescription("");
        timeSeries1.removeAgedItems(100L, false);
        int int21 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 10, (int) '4');
        timeSeries6.fireSeriesChanged();
        timeSeries6.setNotify(true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries6.addChangeListener(seriesChangeListener10);
        timeSeries6.setDomainDescription("");
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries6.add(timeSeriesDataItem14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries1.setRangeDescription("Time");
        int int13 = timeSeries1.getMaximumItemCount();
        boolean boolean14 = timeSeries1.getNotify();
        timeSeries1.removeAgedItems(true);
        java.lang.String str17 = timeSeries1.getDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
        java.lang.String str37 = timeSeries9.getDescription();
        timeSeries9.setRangeDescription("");
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean48 = timeSeries47.getNotify();
        timeSeries47.setMaximumItemCount(0);
        timeSeries47.setDescription("Time");
        java.lang.Comparable comparable53 = timeSeries47.getKey();
        timeSeries47.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class58 = timeSeries57.timePeriodClass;
        java.util.List list59 = timeSeries57.getItems();
        org.jfree.data.time.TimeSeries timeSeries62 = timeSeries57.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection63 = timeSeries47.getTimePeriodsUniqueToOtherSeries(timeSeries62);
        timeSeries47.fireSeriesChanged();
        timeSeries47.clear();
        boolean boolean66 = timeSeries1.equals((java.lang.Object) timeSeries47);
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + comparable53 + "' != '" + (byte) -1 + "'", comparable53, (byte) -1);
        org.junit.Assert.assertNotNull(class58);
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(timeSeries62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean21 = timeSeries20.getNotify();
        int int22 = timeSeries20.getMaximumItemCount();
        timeSeries20.setRangeDescription("hi!");
        java.lang.Class class25 = timeSeries20.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener26);
        timeSeries20.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class39 = timeSeries38.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries38.addChangeListener(seriesChangeListener40);
        java.lang.Class class42 = timeSeries38.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class42);
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class42);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class42);
        timeSeries20.timePeriodClass = class42;
        timeSeries1.timePeriodClass = class42;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class58 = timeSeries57.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class58);
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class58);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int63 = timeSeries62.getMaximumItemCount();
        java.lang.Object obj64 = timeSeries62.clone();
        timeSeries62.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener67 = null;
        timeSeries62.removePropertyChangeListener(propertyChangeListener67);
        java.util.Collection collection69 = timeSeries60.getTimePeriodsUniqueToOtherSeries(timeSeries62);
        java.util.List list70 = timeSeries60.getItems();
        timeSeries49.data = list70;
        timeSeries1.data = list70;
        timeSeries1.setMaximumItemCount(0);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(class39);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNotNull(class58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(list70);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.fireSeriesChanged();
        java.lang.String str6 = timeSeries1.getDescription();
        java.lang.String str7 = timeSeries1.getRangeDescription();
        timeSeries1.setMaximumItemAge((long) 100);
        timeSeries1.setNotify(false);
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        boolean boolean3 = timeSeries1.isEmpty();
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
        java.lang.Object obj38 = timeSeries18.clone();
        timeSeries18.setMaximumItemAge((long) (short) 100);
        java.util.Collection collection41 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries44 = timeSeries1.createCopy(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        boolean boolean10 = timeSeries1.getNotify();
        java.lang.Class class11 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean14 = timeSeries13.getNotify();
        int int15 = timeSeries13.getMaximumItemCount();
        timeSeries13.setRangeDescription("hi!");
        java.lang.Class class18 = timeSeries13.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries13.removePropertyChangeListener(propertyChangeListener19);
        timeSeries13.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class32 = timeSeries31.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries31.addChangeListener(seriesChangeListener33);
        java.lang.Class class35 = timeSeries31.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class35);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class35);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class35);
        timeSeries13.timePeriodClass = class35;
        java.util.List list40 = timeSeries13.data;
        boolean boolean41 = timeSeries1.equals((java.lang.Object) timeSeries13);
        timeSeries13.setMaximumItemCount(100);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(class32);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        java.lang.String str5 = timeSeries1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.addChangeListener(seriesChangeListener6);
        java.lang.String str8 = timeSeries1.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int11 = timeSeries10.getMaximumItemCount();
        int int12 = timeSeries10.getMaximumItemCount();
        java.lang.Object obj13 = timeSeries10.clone();
        timeSeries10.clear();
        java.lang.Comparable comparable15 = timeSeries10.getKey();
        java.lang.Comparable comparable16 = timeSeries10.getKey();
        timeSeries10.setRangeDescription("");
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean21 = timeSeries20.getNotify();
        timeSeries20.setMaximumItemCount(0);
        timeSeries20.setDescription("Time");
        timeSeries20.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection30 = timeSeries29.getTimePeriods();
        boolean boolean32 = timeSeries29.equals((java.lang.Object) 100.0d);
        timeSeries29.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries29.removeChangeListener(seriesChangeListener35);
        java.lang.String str37 = timeSeries29.getDescription();
        boolean boolean38 = timeSeries29.getNotify();
        org.jfree.data.time.TimeSeries timeSeries39 = timeSeries20.addAndOrUpdate(timeSeries29);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries20.addPropertyChangeListener(propertyChangeListener40);
        java.util.Collection collection42 = timeSeries10.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        timeSeries20.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries1.addAndOrUpdate(timeSeries20);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod46 = timeSeries45.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Value" + "'", str8, "Value");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (byte) 10 + "'", comparable15, (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (byte) 10 + "'", comparable16, (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(timeSeries39);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(timeSeries45);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries1.setRangeDescription("Time");
        int int13 = timeSeries1.getMaximumItemCount();
        boolean boolean14 = timeSeries1.getNotify();
        long long15 = timeSeries1.getMaximumItemAge();
        java.lang.String str16 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9223372036854775807L + "'", long15 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.lang.String str6 = timeSeries1.getDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.addChangeListener(seriesChangeListener7);
        timeSeries1.setKey((java.lang.Comparable) 10L);
        java.lang.String str11 = timeSeries1.getDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class4 = timeSeries3.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries3.addChangeListener(seriesChangeListener5);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries18 = timeSeries9.addAndOrUpdate(timeSeries14);
        java.lang.Class class19 = timeSeries18.getTimePeriodClass();
        timeSeries3.timePeriodClass = class19;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class19);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", class19);
        java.util.List list23 = timeSeries22.data;
        int int24 = timeSeries22.getMaximumItemCount();
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries3.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries3.createCopy((int) (short) 0, (int) (byte) 100);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        timeSeries1.timePeriodClass = class9;
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(class9);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        java.util.List list31 = timeSeries17.data;
        java.util.List list32 = timeSeries17.getItems();
        timeSeries17.removeAgedItems(true);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 10 + "'", comparable23, (byte) 10);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        boolean boolean7 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class16);
        timeSeries1.timePeriodClass = class16;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int22 = timeSeries21.getMaximumItemCount();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        java.util.List list24 = timeSeries21.getItems();
        timeSeries1.data = list24;
        long long26 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        timeSeries28.setKey((java.lang.Comparable) 10L);
        timeSeries28.removeAgedItems(true);
        timeSeries28.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries1.addAndOrUpdate(timeSeries28);
        int int37 = timeSeries28.getMaximumItemCount();
        java.lang.Class class38 = timeSeries28.timePeriodClass;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 10 + "'", comparable23, (byte) 10);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(class38);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        java.lang.String str23 = timeSeries11.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        timeSeries11.addPropertyChangeListener(propertyChangeListener24);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries11.add(timeSeriesDataItem26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Time" + "'", str23, "Time");
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.removeAgedItems((long) 1, true);
        boolean boolean16 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.lang.String str22 = timeSeries18.getRangeDescription();
        boolean boolean23 = timeSeries18.isEmpty();
        boolean boolean24 = timeSeries18.isEmpty();
        boolean boolean25 = timeSeries18.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries1.addAndOrUpdate(timeSeries18);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem28 = timeSeries26.getDataItem((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeSeries26);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        java.util.List list17 = timeSeries16.data;
        timeSeries1.data = list17;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        timeSeries1.fireSeriesChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries27.addChangeListener(seriesChangeListener29);
        java.lang.String str31 = timeSeries27.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class34 = timeSeries33.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries33.addChangeListener(seriesChangeListener35);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class39 = timeSeries38.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener40 = null;
        timeSeries38.addChangeListener(seriesChangeListener40);
        org.jfree.data.time.TimeSeries timeSeries42 = timeSeries33.addAndOrUpdate(timeSeries38);
        java.lang.Class class43 = timeSeries42.getTimePeriodClass();
        timeSeries27.timePeriodClass = class43;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class43);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class43);
        timeSeries10.timePeriodClass = class43;
        timeSeries10.setDomainDescription("");
        timeSeries10.fireSeriesChanged();
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
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Value" + "'", str31, "Value");
        org.junit.Assert.assertNotNull(class34);
        org.junit.Assert.assertNotNull(class39);
        org.junit.Assert.assertNotNull(timeSeries42);
        org.junit.Assert.assertNotNull(class43);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
            timeSeries19.delete(regularTimePeriod44);
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
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        boolean boolean5 = timeSeries1.getNotify();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener6 = null;
        timeSeries1.removeChangeListener(seriesChangeListener6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        boolean boolean5 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class17 = timeSeries16.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries16.addChangeListener(seriesChangeListener18);
        java.lang.Class class20 = timeSeries16.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "Time", class20);
        timeSeries1.timePeriodClass = class20;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class27 = timeSeries26.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries26.addChangeListener(seriesChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class32 = timeSeries31.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries31.addChangeListener(seriesChangeListener33);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries26.addAndOrUpdate(timeSeries31);
        timeSeries35.setNotify(false);
        timeSeries35.removeAgedItems(1L, true);
        timeSeries35.setKey((java.lang.Comparable) 0.0f);
        timeSeries35.setKey((java.lang.Comparable) 10.0d);
        timeSeries35.setDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries1.addAndOrUpdate(timeSeries35);
        java.lang.String str48 = timeSeries35.getDescription();
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class52 = timeSeries51.timePeriodClass;
        java.util.List list53 = timeSeries51.getItems();
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class59 = timeSeries58.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener60 = null;
        timeSeries58.addChangeListener(seriesChangeListener60);
        java.lang.Class class62 = timeSeries58.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class62);
        timeSeries51.timePeriodClass = class62;
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, class62);
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries35.addAndOrUpdate(timeSeries65);
        java.util.List list67 = timeSeries35.data;
        java.util.Collection collection68 = timeSeries35.getTimePeriods();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(class32);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Time" + "'", str48, "Time");
        org.junit.Assert.assertNotNull(class52);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(class59);
        org.junit.Assert.assertNotNull(class62);
        org.junit.Assert.assertNotNull(timeSeries66);
        org.junit.Assert.assertNotNull(list67);
        org.junit.Assert.assertNotNull(collection68);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class4 = timeSeries3.timePeriodClass;
        java.util.List list5 = timeSeries3.getItems();
        timeSeries3.setKey((java.lang.Comparable) 0.0f);
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries1.addAndOrUpdate(timeSeries3);
        boolean boolean9 = timeSeries1.isEmpty();
        boolean boolean10 = timeSeries1.getNotify();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getItemCount();
        java.util.Collection collection4 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        timeSeries1.fireSeriesChanged();
        timeSeries1.setDomainDescription("Overwritten values from: 10.0");
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean13 = timeSeries12.getNotify();
        timeSeries12.setMaximumItemCount(0);
        timeSeries12.setDescription("Time");
        java.lang.Comparable comparable18 = timeSeries12.getKey();
        long long19 = timeSeries12.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection25 = timeSeries24.getTimePeriods();
        java.lang.Class class26 = timeSeries24.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class26);
        timeSeries12.timePeriodClass = class26;
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries1.addAndOrUpdate(timeSeries12);
        java.lang.Class class30 = timeSeries12.timePeriodClass;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + (byte) -1 + "'", comparable18, (byte) -1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9223372036854775807L + "'", long19 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(class30);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem34 = timeSeries15.addOrUpdate(regularTimePeriod32, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
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
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        java.util.List list5 = timeSeries1.data;
        boolean boolean6 = timeSeries1.getNotify();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod7 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        java.lang.String str22 = timeSeries21.getDomainDescription();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        timeSeries21.setNotify(true);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem19 = timeSeries17.getDataItem(regularTimePeriod18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        timeSeries1.fireSeriesChanged();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy((int) (byte) 1, (int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy(0, (int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class20);
        java.lang.Object obj22 = timeSeries21.clone();
        java.lang.String str23 = timeSeries21.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries21);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem26 = timeSeries21.getDataItem((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Time" + "'", str23, "Time");
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        java.lang.String str29 = timeSeries10.getDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class24);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.lang.String str6 = timeSeries1.getDescription();
        boolean boolean7 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class16);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int21 = timeSeries20.getMaximumItemCount();
        java.lang.Object obj22 = timeSeries20.clone();
        timeSeries20.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries20.removePropertyChangeListener(propertyChangeListener25);
        java.util.Collection collection27 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries20);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int30 = timeSeries29.getMaximumItemCount();
        int int31 = timeSeries29.getMaximumItemCount();
        java.lang.Object obj32 = timeSeries29.clone();
        java.util.List list33 = timeSeries29.data;
        timeSeries18.data = list33;
        timeSeries1.data = list33;
        timeSeries1.setRangeDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int44 = timeSeries43.getMaximumItemCount();
        int int45 = timeSeries43.getMaximumItemCount();
        java.lang.Object obj46 = timeSeries43.clone();
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class49 = timeSeries48.timePeriodClass;
        timeSeries48.setDomainDescription("");
        boolean boolean52 = timeSeries43.equals((java.lang.Object) timeSeries48);
        int int53 = timeSeries43.getMaximumItemCount();
        timeSeries43.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean57 = timeSeries56.getNotify();
        timeSeries56.setMaximumItemCount(0);
        timeSeries56.setDescription("Time");
        java.lang.Comparable comparable62 = timeSeries56.getKey();
        timeSeries56.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries66 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class67 = timeSeries66.timePeriodClass;
        java.util.List list68 = timeSeries66.getItems();
        org.jfree.data.time.TimeSeries timeSeries71 = timeSeries66.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection72 = timeSeries56.getTimePeriodsUniqueToOtherSeries(timeSeries71);
        java.util.Collection collection73 = timeSeries43.getTimePeriodsUniqueToOtherSeries(timeSeries56);
        timeSeries56.setNotify(true);
        java.lang.Class class76 = timeSeries56.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries77 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "hi!", "Overwritten values from: 10.0", class76);
        org.jfree.data.time.TimeSeries timeSeries78 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, class76);
        boolean boolean79 = timeSeries78.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries80 = timeSeries1.addAndOrUpdate(timeSeries78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertNotNull(class49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + comparable62 + "' != '" + (byte) -1 + "'", comparable62, (byte) -1);
        org.junit.Assert.assertNotNull(class67);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(timeSeries71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(class76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(timeSeries80);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
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
        java.lang.Object obj25 = timeSeries12.clone();
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.fireSeriesChanged();
        timeSeries1.setDomainDescription("Value");
        java.util.Collection collection8 = timeSeries1.getTimePeriods();
        int int9 = timeSeries1.getMaximumItemCount();
        java.util.List list10 = timeSeries1.getItems();
        timeSeries1.removeAgedItems(97L, false);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        java.lang.Object obj22 = timeSeries17.clone();
        java.lang.Object obj23 = timeSeries17.clone();
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(list21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class12);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean20 = timeSeries19.getNotify();
        int int21 = timeSeries19.getMaximumItemCount();
        timeSeries19.setRangeDescription("hi!");
        java.lang.Class class24 = timeSeries19.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class24);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, class24);
        timeSeries15.timePeriodClass = class24;
        timeSeries15.fireSeriesChanged();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem29 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(timeSeriesDataItem29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(class24);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        timeSeries1.setDomainDescription("Overwritten values from: 10.0");
        java.util.List list24 = timeSeries1.data;
        timeSeries1.clear();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Value" + "'", str21, "Value");
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemAge((long) 'a');
        int int7 = timeSeries1.getItemCount();
        java.util.List list8 = timeSeries1.getItems();
        timeSeries1.clear();
        java.lang.Class class10 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(class10);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setRangeDescription("");
        int int10 = timeSeries1.getMaximumItemCount();
        java.lang.String str11 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 10 + "'", comparable6, (byte) 10);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        timeSeries13.removeAgedItems((long) (-1), false);
        int int22 = timeSeries13.getMaximumItemCount();
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Time" + "'", str16, "Time");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update((int) '4', (java.lang.Number) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean6 = timeSeries5.getNotify();
        int int7 = timeSeries5.getMaximumItemCount();
        timeSeries5.setRangeDescription("hi!");
        java.lang.Class class10 = timeSeries5.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class10);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, "hi!", "hi!", class10);
        java.util.List list13 = timeSeries12.data;
        timeSeries12.setRangeDescription("Overwritten values from: 10.0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        java.beans.PropertyChangeListener propertyChangeListener37 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener37);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean44 = timeSeries43.getNotify();
        int int45 = timeSeries43.getMaximumItemCount();
        java.util.List list46 = timeSeries43.data;
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class52 = timeSeries51.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener53 = null;
        timeSeries51.addChangeListener(seriesChangeListener53);
        java.lang.Class class55 = timeSeries51.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class55);
        timeSeries43.timePeriodClass = class55;
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "hi!", "Value", class55);
        timeSeries9.timePeriodClass = class55;
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(class52);
        org.junit.Assert.assertNotNull(class55);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
        java.util.List list23 = timeSeries14.data;
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem24 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.add(timeSeriesDataItem24, false);
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
        org.junit.Assert.assertNotNull(list23);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        timeSeries16.setKey((java.lang.Comparable) 10.0d);
        boolean boolean19 = timeSeries16.isEmpty();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean26 = timeSeries25.getNotify();
        timeSeries25.setMaximumItemCount(0);
        timeSeries25.setDescription("Time");
        java.lang.Comparable comparable31 = timeSeries25.getKey();
        timeSeries25.setKey((java.lang.Comparable) 2147483647);
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
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean62 = timeSeries61.getNotify();
        java.util.List list63 = timeSeries61.getItems();
        timeSeries53.data = list63;
        java.lang.Object obj65 = null;
        boolean boolean66 = timeSeries53.equals(obj65);
        java.util.Collection collection67 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries53);
        java.util.List list68 = timeSeries25.getItems();
        timeSeries25.setDomainDescription("Overwritten values from: 10.0");
        java.util.Collection collection71 = timeSeries14.getTimePeriodsUniqueToOtherSeries(timeSeries25);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (byte) -1 + "'", comparable31, (byte) -1);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(class49);
        org.junit.Assert.assertNotNull(class54);
        org.junit.Assert.assertNotNull(timeSeries57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(list63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(list68);
        org.junit.Assert.assertNotNull(collection71);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener22);
        timeSeries1.setDomainDescription("Time");
        timeSeries1.setMaximumItemCount(100);
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
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        org.jfree.data.time.TimeSeries timeSeries17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries18 = timeSeries1.addAndOrUpdate(timeSeries17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        timeSeries1.removeAgedItems((long) '4', true);
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
        long long30 = timeSeries9.getMaximumItemAge();
        boolean boolean31 = timeSeries1.equals((java.lang.Object) timeSeries9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(timeSeries18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9223372036854775807L + "'", long30 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.String str11 = timeSeries7.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class14 = timeSeries13.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries13.addChangeListener(seriesChangeListener15);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries22 = timeSeries13.addAndOrUpdate(timeSeries18);
        java.lang.Class class23 = timeSeries22.getTimePeriodClass();
        timeSeries7.timePeriodClass = class23;
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0f, class23);
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
        timeSeries25.timePeriodClass = class41;
        boolean boolean44 = timeSeries1.equals((java.lang.Object) timeSeries25);
        timeSeries25.setMaximumItemCount(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Value" + "'", str11, "Value");
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertNotNull(timeSeries22);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(class36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Value" + "'", str39, "Value");
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
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
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem37 = timeSeries9.getDataItem(regularTimePeriod36);
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
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class12);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries15.addChangeListener(seriesChangeListener16);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
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
        timeSeries14.removeAgedItems(true);
        timeSeries14.setDomainDescription("Value");
        java.lang.Class class36 = timeSeries14.timePeriodClass;
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
        org.junit.Assert.assertNotNull(class36);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
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
        java.lang.Object obj24 = timeSeries1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Time" + "'", str19, "Time");
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (byte) -1 + "'", comparable20, (byte) -1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = timeSeries10.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        boolean boolean6 = timeSeries1.isEmpty();
        boolean boolean7 = timeSeries1.isEmpty();
        timeSeries1.setMaximumItemCount(2147483647);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener10);
        timeSeries1.setMaximumItemCount(2147483647);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number15 = timeSeries1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
        java.beans.PropertyChangeListener propertyChangeListener22 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener22);
        timeSeries1.setDomainDescription("Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries1.addChangeListener(seriesChangeListener26);
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
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.addAndOrUpdate(timeSeries5);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries1.addOrUpdate(regularTimePeriod10, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        java.util.List list10 = timeSeries1.data;
        timeSeries1.removeAgedItems((long) (byte) 100, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod14, (java.lang.Number) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        long long7 = timeSeries1.getMaximumItemAge();
        timeSeries1.setKey((java.lang.Comparable) (short) -1);
        java.util.Collection collection10 = timeSeries1.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod11, (java.lang.Number) 0L, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9223372036854775807L + "'", long7 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        timeSeries1.setDomainDescription("");
        boolean boolean5 = timeSeries1.isEmpty();
        java.util.List list6 = timeSeries1.data;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.clear();
        java.lang.String str4 = timeSeries1.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection7 = timeSeries6.getTimePeriods();
        boolean boolean9 = timeSeries6.equals((java.lang.Object) 100.0d);
        timeSeries6.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        timeSeries13.setNotify(true);
        boolean boolean17 = timeSeries6.equals((java.lang.Object) timeSeries13);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries24.addChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries19.addAndOrUpdate(timeSeries24);
        java.util.Collection collection29 = timeSeries13.getTimePeriodsUniqueToOtherSeries(timeSeries24);
        timeSeries24.clear();
        timeSeries24.setNotify(true);
        java.lang.String str33 = timeSeries24.getDomainDescription();
        java.lang.Class class34 = timeSeries24.getTimePeriodClass();
        timeSeries1.timePeriodClass = class34;
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean38 = timeSeries37.getNotify();
        int int39 = timeSeries37.getMaximumItemCount();
        timeSeries37.setRangeDescription("hi!");
        java.lang.Class class42 = timeSeries37.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener43 = null;
        timeSeries37.removePropertyChangeListener(propertyChangeListener43);
        timeSeries37.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class56 = timeSeries55.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries55.addChangeListener(seriesChangeListener57);
        java.lang.Class class59 = timeSeries55.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class59);
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class59);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class59);
        timeSeries37.timePeriodClass = class59;
        java.util.Collection collection64 = timeSeries37.getTimePeriods();
        timeSeries37.setDescription("");
        java.lang.Class class67 = timeSeries37.getTimePeriodClass();
        timeSeries1.timePeriodClass = class67;
        org.jfree.data.time.TimeSeries timeSeries70 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean71 = timeSeries70.getNotify();
        timeSeries70.setMaximumItemCount(0);
        timeSeries70.setDescription("Time");
        java.lang.String str76 = timeSeries70.getDomainDescription();
        java.lang.String str77 = timeSeries70.getDomainDescription();
        java.util.Collection collection78 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries70);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Time" + "'", str4, "Time");
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Time" + "'", str33, "Time");
        org.junit.Assert.assertNotNull(class34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNotNull(class56);
        org.junit.Assert.assertNotNull(class59);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(class67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Time" + "'", str76, "Time");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Time" + "'", str77, "Time");
        org.junit.Assert.assertNotNull(collection78);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries1.addChangeListener(seriesChangeListener8);
        java.lang.Object obj10 = timeSeries1.clone();
        java.util.List list11 = timeSeries1.getItems();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection58 = timeSeries57.getTimePeriods();
        java.lang.Class class59 = timeSeries57.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class59);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection63 = timeSeries62.getTimePeriods();
        timeSeries62.removeAgedItems(true);
        boolean boolean66 = timeSeries60.equals((java.lang.Object) timeSeries62);
        org.jfree.data.time.TimeSeries timeSeries69 = timeSeries60.createCopy((int) '#', (int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries10.addAndOrUpdate(timeSeries60);
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        timeSeries60.addPropertyChangeListener(propertyChangeListener71);
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
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(class59);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(timeSeries69);
        org.junit.Assert.assertNotNull(timeSeries70);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        java.lang.String str22 = timeSeries21.getDomainDescription();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean26 = timeSeries25.getNotify();
        timeSeries25.setMaximumItemCount(0);
        java.lang.Class<?> wildcardClass29 = timeSeries25.getClass();
        timeSeries21.timePeriodClass = wildcardClass29;
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Time" + "'", str22, "Time");
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + ' ' + "'", comparable23, ' ');
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        boolean boolean4 = timeSeries1.getNotify();
        boolean boolean5 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class17 = timeSeries16.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries16.addChangeListener(seriesChangeListener18);
        java.lang.Class class20 = timeSeries16.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class20);
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "Time", class20);
        timeSeries1.timePeriodClass = class20;
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class27 = timeSeries26.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries26.addChangeListener(seriesChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class32 = timeSeries31.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries31.addChangeListener(seriesChangeListener33);
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries26.addAndOrUpdate(timeSeries31);
        timeSeries35.setNotify(false);
        timeSeries35.removeAgedItems(1L, true);
        timeSeries35.setKey((java.lang.Comparable) 0.0f);
        timeSeries35.setKey((java.lang.Comparable) 10.0d);
        timeSeries35.setDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries47 = timeSeries1.addAndOrUpdate(timeSeries35);
        timeSeries47.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod49 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries47.add(regularTimePeriod49, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(class32);
        org.junit.Assert.assertNotNull(timeSeries35);
        org.junit.Assert.assertNotNull(timeSeries47);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        timeSeries17.removeAgedItems(true);
        timeSeries17.setMaximumItemCount(0);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.delete((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + 100.0d + "'", comparable20, 100.0d);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
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
        java.lang.Class class27 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection30 = timeSeries29.getTimePeriods();
        boolean boolean32 = timeSeries29.equals((java.lang.Object) 100.0d);
        timeSeries29.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection37 = timeSeries36.getTimePeriods();
        timeSeries36.setNotify(true);
        boolean boolean40 = timeSeries29.equals((java.lang.Object) timeSeries36);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class43 = timeSeries42.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries42.addChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class48 = timeSeries47.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries47.addChangeListener(seriesChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries42.addAndOrUpdate(timeSeries47);
        java.util.Collection collection52 = timeSeries36.getTimePeriodsUniqueToOtherSeries(timeSeries47);
        timeSeries47.clear();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries47.createCopy(1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass57 = timeSeries56.getClass();
        timeSeries1.timePeriodClass = wildcardClass57;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener59 = null;
        timeSeries1.removeChangeListener(seriesChangeListener59);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Time" + "'", str26, "Time");
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(class43);
        org.junit.Assert.assertNotNull(class48);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        java.lang.Object obj13 = timeSeries1.clone();
        timeSeries1.fireSeriesChanged();
        timeSeries1.clear();
        java.lang.Class class16 = timeSeries1.timePeriodClass;
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(class16);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        timeSeries7.setNotify(true);
        timeSeries7.setRangeDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = timeSeries7.getTimePeriod((-1));
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
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        timeSeries1.setDescription("");
        java.util.List list4 = timeSeries1.data;
        long long5 = timeSeries1.getMaximumItemAge();
        timeSeries1.removeAgedItems(false);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 9223372036854775807L + "'", long5 == 9223372036854775807L);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        int int44 = timeSeries40.getItemCount();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        timeSeries1.setMaximumItemAge(1L);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener12);
        java.lang.String str14 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Value" + "'", str14, "Value");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.util.List list4 = timeSeries1.getItems();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        java.lang.Class<?> wildcardClass9 = timeSeries1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 10 + "'", comparable3, (byte) 10);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries32.addChangeListener(seriesChangeListener34);
        java.util.Collection collection36 = timeSeries32.getTimePeriods();
        java.util.List list37 = timeSeries32.getItems();
        timeSeries32.removeAgedItems(35L, false);
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
        org.junit.Assert.assertNotNull(list37);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries8.setMaximumItemCount((int) (byte) 100);
        java.lang.Object obj15 = timeSeries8.clone();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        timeSeries10.clear();
        timeSeries10.setDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
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
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection24 = timeSeries23.getTimePeriods();
        java.lang.Class class25 = timeSeries23.getTimePeriodClass();
        java.util.Collection collection26 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        boolean boolean27 = timeSeries19.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection30 = timeSeries29.getTimePeriods();
        boolean boolean32 = timeSeries29.equals((java.lang.Object) 100.0d);
        timeSeries29.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection37 = timeSeries36.getTimePeriods();
        timeSeries36.setNotify(true);
        boolean boolean40 = timeSeries29.equals((java.lang.Object) timeSeries36);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class43 = timeSeries42.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries42.addChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class48 = timeSeries47.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries47.addChangeListener(seriesChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries42.addAndOrUpdate(timeSeries47);
        java.util.Collection collection52 = timeSeries36.getTimePeriodsUniqueToOtherSeries(timeSeries47);
        timeSeries47.clear();
        org.jfree.data.time.TimeSeries timeSeries56 = timeSeries47.createCopy(1, (int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries59 = timeSeries47.createCopy((int) '#', 2147483647);
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class69 = timeSeries68.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener70 = null;
        timeSeries68.addChangeListener(seriesChangeListener70);
        java.lang.Class class72 = timeSeries68.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class72);
        org.jfree.data.time.TimeSeries timeSeries74 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class72);
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class72);
        boolean boolean76 = timeSeries59.equals((java.lang.Object) (short) 100);
        timeSeries59.setDomainDescription("");
        timeSeries59.removeAgedItems((long) (byte) 100, false);
        int int82 = timeSeries59.getMaximumItemCount();
        java.util.Collection collection83 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(class43);
        org.junit.Assert.assertNotNull(class48);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(timeSeries56);
        org.junit.Assert.assertNotNull(timeSeries59);
        org.junit.Assert.assertNotNull(class69);
        org.junit.Assert.assertNotNull(class72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2147483647 + "'", int82 == 2147483647);
        org.junit.Assert.assertNotNull(collection83);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.addAndOrUpdate(timeSeries5);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem11 = timeSeries1.getDataItem((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemAge((long) 'a');
        int int7 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        timeSeries5.removeAgedItems(0L, false);
        boolean boolean16 = timeSeries5.getNotify();
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "Time", class14);
        timeSeries17.setNotify(true);
        timeSeries17.removeAgedItems((long) '4', true);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries17.addChangeListener(seriesChangeListener23);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries17.addChangeListener(seriesChangeListener25);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        java.lang.String str7 = timeSeries1.getDescription();
        timeSeries1.setDomainDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int13 = timeSeries12.getMaximumItemCount();
        int int14 = timeSeries12.getMaximumItemCount();
        java.lang.Object obj15 = timeSeries12.clone();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        timeSeries17.setDomainDescription("");
        boolean boolean21 = timeSeries12.equals((java.lang.Object) timeSeries17);
        int int22 = timeSeries12.getMaximumItemCount();
        timeSeries12.fireSeriesChanged();
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean26 = timeSeries25.getNotify();
        timeSeries25.setMaximumItemCount(0);
        timeSeries25.setDescription("Time");
        java.lang.Comparable comparable31 = timeSeries25.getKey();
        timeSeries25.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class36 = timeSeries35.timePeriodClass;
        java.util.List list37 = timeSeries35.getItems();
        org.jfree.data.time.TimeSeries timeSeries40 = timeSeries35.createCopy((int) (byte) 0, 2147483647);
        java.util.Collection collection41 = timeSeries25.getTimePeriodsUniqueToOtherSeries(timeSeries40);
        java.util.Collection collection42 = timeSeries12.getTimePeriodsUniqueToOtherSeries(timeSeries25);
        timeSeries25.setMaximumItemCount((int) (byte) 10);
        java.lang.String str45 = timeSeries25.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean48 = timeSeries47.getNotify();
        int int49 = timeSeries47.getMaximumItemCount();
        java.util.List list50 = timeSeries47.data;
        org.jfree.data.time.TimeSeries timeSeries55 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class56 = timeSeries55.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries55.addChangeListener(seriesChangeListener57);
        java.lang.Class class59 = timeSeries55.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class59);
        timeSeries47.timePeriodClass = class59;
        java.beans.PropertyChangeListener propertyChangeListener62 = null;
        timeSeries47.addPropertyChangeListener(propertyChangeListener62);
        timeSeries47.setDescription("hi!");
        java.lang.String str66 = timeSeries47.getDescription();
        java.lang.Class class67 = timeSeries47.timePeriodClass;
        timeSeries25.timePeriodClass = class67;
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, class67);
        timeSeries1.timePeriodClass = class67;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + comparable31 + "' != '" + (byte) -1 + "'", comparable31, (byte) -1);
        org.junit.Assert.assertNotNull(class36);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(timeSeries40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Time" + "'", str45, "Time");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(list50);
        org.junit.Assert.assertNotNull(class56);
        org.junit.Assert.assertNotNull(class59);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(class67);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean3 = timeSeries2.getNotify();
        int int4 = timeSeries2.getMaximumItemCount();
        java.util.List list5 = timeSeries2.data;
        org.jfree.data.time.TimeSeries timeSeries8 = timeSeries2.createCopy((int) '4', (int) (short) 100);
        timeSeries8.setNotify(true);
        java.lang.Class class11 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(timeSeries8);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        timeSeries1.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.RegularTimePeriod regularTimePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem6 = timeSeries1.addOrUpdate(regularTimePeriod4, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        timeSeries1.setRangeDescription("hi!");
        java.lang.Class class6 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener7);
        timeSeries1.setRangeDescription("Value");
        int int11 = timeSeries1.getItemCount();
        java.util.Collection collection12 = timeSeries1.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = timeSeries1.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
        timeSeries19.setNotify(true);
        timeSeries19.setKey((java.lang.Comparable) (-1.0d));
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener30);
        timeSeries19.setDescription("Value");
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
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        timeSeries1.setMaximumItemCount((int) '#');
        boolean boolean5 = timeSeries1.getNotify();
        timeSeries1.removeAgedItems((long) 2147483647, false);
        java.lang.String str9 = timeSeries1.getDescription();
        int int10 = timeSeries1.getItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener16 = null;
        timeSeries14.addChangeListener(seriesChangeListener16);
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class20 = timeSeries19.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener21 = null;
        timeSeries19.addChangeListener(seriesChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries14.addAndOrUpdate(timeSeries19);
        java.lang.String str24 = timeSeries23.getDescription();
        java.lang.Class class25 = timeSeries23.timePeriodClass;
        timeSeries23.setMaximumItemCount((int) (short) 10);
        org.jfree.data.time.TimeSeries timeSeries28 = timeSeries10.addAndOrUpdate(timeSeries23);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection31 = timeSeries30.getTimePeriods();
        boolean boolean33 = timeSeries30.equals((java.lang.Object) 100.0d);
        timeSeries30.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection38 = timeSeries37.getTimePeriods();
        timeSeries37.setNotify(true);
        boolean boolean41 = timeSeries30.equals((java.lang.Object) timeSeries37);
        timeSeries30.removeAgedItems((long) 1, true);
        boolean boolean45 = timeSeries30.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class48 = timeSeries47.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries47.addChangeListener(seriesChangeListener49);
        java.lang.String str51 = timeSeries47.getRangeDescription();
        boolean boolean52 = timeSeries47.isEmpty();
        boolean boolean53 = timeSeries47.isEmpty();
        boolean boolean54 = timeSeries47.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries55 = timeSeries30.addAndOrUpdate(timeSeries47);
        timeSeries30.setMaximumItemAge((long) 1);
        boolean boolean58 = timeSeries28.equals((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(timeSeries28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(class48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value" + "'", str51, "Value");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(timeSeries55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class4 = timeSeries3.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries3.addChangeListener(seriesChangeListener5);
        java.lang.String str7 = timeSeries3.getRangeDescription();
        timeSeries3.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries3.addChangeListener(seriesChangeListener10);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean14 = timeSeries13.getNotify();
        int int15 = timeSeries13.getMaximumItemCount();
        java.util.List list16 = timeSeries13.data;
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries13.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class22 = timeSeries21.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries21.addChangeListener(seriesChangeListener23);
        java.lang.String str25 = timeSeries21.getRangeDescription();
        timeSeries21.fireSeriesChanged();
        java.lang.Class class27 = timeSeries21.getTimePeriodClass();
        timeSeries19.timePeriodClass = class27;
        java.lang.Class class29 = timeSeries19.getTimePeriodClass();
        java.lang.String str30 = timeSeries19.getDomainDescription();
        java.util.List list31 = timeSeries19.getItems();
        java.lang.Class class32 = timeSeries19.getTimePeriodClass();
        timeSeries3.timePeriodClass = class32;
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class32);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, class32);
        timeSeries35.setKey((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertNotNull(class4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Value" + "'", str25, "Value");
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(class29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Time" + "'", str30, "Time");
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(class32);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class12);
        java.lang.Comparable comparable16 = timeSeries15.getKey();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries15.add(regularTimePeriod17, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 100 + "'", comparable16, (short) 100);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.lang.String str2 = timeSeries1.getRangeDescription();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.removeChangeListener(seriesChangeListener3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.fireSeriesChanged();
        timeSeries1.setDomainDescription("Value");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection14 = timeSeries13.getTimePeriods();
        java.lang.Class class15 = timeSeries13.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class15);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        timeSeries18.removeAgedItems(true);
        boolean boolean22 = timeSeries16.equals((java.lang.Object) timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries27.addChangeListener(seriesChangeListener29);
        java.lang.Class class31 = timeSeries27.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class31);
        java.lang.Comparable comparable33 = timeSeries32.getKey();
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean36 = timeSeries35.getNotify();
        timeSeries35.setMaximumItemCount(0);
        timeSeries35.setDescription("Time");
        timeSeries35.setMaximumItemCount((int) (short) 1);
        java.util.Collection collection43 = timeSeries32.getTimePeriodsUniqueToOtherSeries(timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries18.addAndOrUpdate(timeSeries32);
        boolean boolean45 = timeSeries44.isEmpty();
        java.util.List list46 = timeSeries44.data;
        boolean boolean47 = timeSeries1.equals((java.lang.Object) timeSeries44);
        boolean boolean48 = timeSeries44.isEmpty();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(class28);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertEquals("'" + comparable33 + "' != '" + 10 + "'", comparable33, 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        timeSeries19.setNotify(true);
        java.lang.String str28 = timeSeries19.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class40 = timeSeries39.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener41 = null;
        timeSeries39.addChangeListener(seriesChangeListener41);
        java.lang.Class class43 = timeSeries39.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class43);
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class43);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "", "", class43);
        timeSeries46.setNotify(true);
        java.lang.Comparable comparable49 = timeSeries46.getKey();
        timeSeries46.removeAgedItems(true);
        org.jfree.data.time.TimeSeries timeSeries52 = timeSeries19.addAndOrUpdate(timeSeries46);
        org.jfree.data.time.TimeSeries timeSeries57 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection58 = timeSeries57.getTimePeriods();
        java.lang.Class class59 = timeSeries57.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries60 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class59);
        org.jfree.data.time.TimeSeries timeSeries62 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class63 = timeSeries62.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener64 = null;
        timeSeries62.addChangeListener(seriesChangeListener64);
        java.lang.String str66 = timeSeries62.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries67 = timeSeries60.addAndOrUpdate(timeSeries62);
        int int68 = timeSeries60.getItemCount();
        java.lang.Comparable comparable69 = timeSeries60.getKey();
        org.jfree.data.time.TimeSeries timeSeries70 = timeSeries19.addAndOrUpdate(timeSeries60);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Time" + "'", str28, "Time");
        org.junit.Assert.assertNotNull(class40);
        org.junit.Assert.assertNotNull(class43);
        org.junit.Assert.assertEquals("'" + comparable49 + "' != '" + 100.0d + "'", comparable49, 100.0d);
        org.junit.Assert.assertNotNull(timeSeries52);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(class59);
        org.junit.Assert.assertNotNull(class63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Value" + "'", str66, "Value");
        org.junit.Assert.assertNotNull(timeSeries67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertEquals("'" + comparable69 + "' != '" + 0 + "'", comparable69, 0);
        org.junit.Assert.assertNotNull(timeSeries70);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        int int13 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 10 + "'", comparable12, (byte) 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int5 = timeSeries4.getMaximumItemCount();
        int int6 = timeSeries4.getMaximumItemCount();
        java.lang.Object obj7 = timeSeries4.clone();
        timeSeries4.clear();
        java.lang.Comparable comparable9 = timeSeries4.getKey();
        long long10 = timeSeries4.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean15 = timeSeries14.getNotify();
        int int16 = timeSeries14.getMaximumItemCount();
        timeSeries14.setRangeDescription("hi!");
        java.lang.Class class19 = timeSeries14.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1, class19);
        boolean boolean22 = timeSeries4.equals((java.lang.Object) class19);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Overwritten values from: 10.0", class19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + (byte) 10 + "'", comparable9, (byte) 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        java.util.List list20 = timeSeries10.getItems();
        timeSeries10.removeAgedItems(false);
        java.lang.Comparable comparable23 = timeSeries10.getKey();
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + '#' + "'", comparable23, '#');
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.util.List list4 = timeSeries1.getItems();
        int int5 = timeSeries1.getItemCount();
        java.util.Collection collection6 = timeSeries1.getTimePeriods();
        int int7 = timeSeries1.getMaximumItemCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 10 + "'", comparable3, (byte) 10);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 10, (int) '4');
        java.util.List list7 = timeSeries6.data;
        timeSeries6.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries6);
        org.junit.Assert.assertNotNull(list7);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
        timeSeries1.setDomainDescription("hi!");
        java.lang.String str19 = timeSeries1.getDescription();
        timeSeries1.removeAgedItems(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        java.lang.String str25 = timeSeries24.getDescription();
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        timeSeries24.removePropertyChangeListener(propertyChangeListener26);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries24.update(regularTimePeriod28, (java.lang.Number) 1.0d);
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
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener5 = null;
        timeSeries4.removeChangeListener(seriesChangeListener5);
        java.lang.Class class7 = timeSeries4.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), "hi!", "Overwritten values from: 10.0", class7);
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries1.setRangeDescription("Value");
        timeSeries1.clear();
        java.util.Collection collection5 = timeSeries1.getTimePeriods();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.RegularTimePeriod regularTimePeriod6 = timeSeries1.getNextTimePeriod();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.delete(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        java.lang.Comparable comparable0 = null;
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false);
        java.lang.Class<?> wildcardClass6 = timeSeries5.getClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries(comparable0, "Value", "Value", (java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries13.removePropertyChangeListener(propertyChangeListener17);
        boolean boolean19 = timeSeries13.isEmpty();
        java.lang.Class class20 = timeSeries13.getTimePeriodClass();
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(class20);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        timeSeries20.setRangeDescription("Time");
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
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        timeSeries1.setMaximumItemCount((int) (short) 1);
        timeSeries1.setMaximumItemCount(1);
        timeSeries1.setMaximumItemCount((int) (short) 1);
        java.lang.Object obj13 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        boolean boolean18 = timeSeries15.equals((java.lang.Object) 100.0d);
        timeSeries15.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection23 = timeSeries22.getTimePeriods();
        timeSeries22.setNotify(true);
        boolean boolean26 = timeSeries15.equals((java.lang.Object) timeSeries22);
        timeSeries22.setMaximumItemCount((int) (byte) 100);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class37 = timeSeries36.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class37);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class37);
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int42 = timeSeries41.getMaximumItemCount();
        java.lang.Object obj43 = timeSeries41.clone();
        timeSeries41.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        timeSeries41.removePropertyChangeListener(propertyChangeListener46);
        java.util.Collection collection48 = timeSeries39.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        java.lang.Class class49 = timeSeries41.getTimePeriodClass();
        java.util.Collection collection50 = timeSeries22.getTimePeriodsUniqueToOtherSeries(timeSeries41);
        timeSeries22.removeAgedItems(true);
        java.lang.String str53 = timeSeries22.getRangeDescription();
        boolean boolean54 = timeSeries1.equals((java.lang.Object) timeSeries22);
        long long55 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(class37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(class49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Value" + "'", str53, "Value");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 9223372036854775807L + "'", long55 == 9223372036854775807L);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem36 = timeSeries14.getDataItem(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
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
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
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
        timeSeries1.setDescription("Value");
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries20.addAndOrUpdate(timeSeries25);
        timeSeries20.setRangeDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries1.addAndOrUpdate(timeSeries20);
        java.lang.String str33 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(timeSeries32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Time" + "'", str33, "Time");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.lang.String str2 = timeSeries1.getRangeDescription();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        timeSeries1.setNotify(false);
        java.lang.String str6 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) -1 + "'", comparable3, (byte) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d);
        java.lang.String str2 = timeSeries1.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod3, (java.lang.Number) 0.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        timeSeries5.setNotify(true);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = timeSeries5.getIndex(regularTimePeriod15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertNotNull(timeSeries12);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries11.addChangeListener(seriesChangeListener13);
        java.lang.Class class15 = timeSeries11.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class15);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class15);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener18 = null;
        timeSeries17.addChangeListener(seriesChangeListener18);
        java.lang.String str20 = timeSeries17.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        timeSeries17.addPropertyChangeListener(propertyChangeListener21);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries24.addChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries29.addChangeListener(seriesChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries24.addAndOrUpdate(timeSeries29);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection36 = timeSeries35.getTimePeriods();
        boolean boolean38 = timeSeries35.equals((java.lang.Object) 100.0d);
        timeSeries35.setMaximumItemAge((long) 'a');
        boolean boolean41 = timeSeries24.equals((java.lang.Object) timeSeries35);
        java.beans.PropertyChangeListener propertyChangeListener42 = null;
        timeSeries24.addPropertyChangeListener(propertyChangeListener42);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries17.addAndOrUpdate(timeSeries24);
        timeSeries44.clear();
        java.lang.Class class46 = timeSeries44.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, class46);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "Time", class46);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Time" + "'", str20, "Time");
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(timeSeries44);
        org.junit.Assert.assertNotNull(class46);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        java.lang.String str15 = timeSeries14.getRangeDescription();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
        timeSeries1.setDescription("Value");
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class21 = timeSeries20.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries20.addChangeListener(seriesChangeListener22);
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries29 = timeSeries20.addAndOrUpdate(timeSeries25);
        timeSeries20.setRangeDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries32 = timeSeries1.addAndOrUpdate(timeSeries20);
        timeSeries32.removeAgedItems(false);
        timeSeries32.setNotify(false);
        timeSeries32.removeAgedItems(false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Value" + "'", str2, "Value");
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(timeSeries13);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(class21);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(timeSeries29);
        org.junit.Assert.assertNotNull(timeSeries32);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
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
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem33 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem33, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int32 = timeSeries31.getMaximumItemCount();
        java.lang.Object obj33 = timeSeries31.clone();
        int int34 = timeSeries31.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries31.createCopy((int) (byte) 1, (int) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries1.addAndOrUpdate(timeSeries37);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem39 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries38.add(timeSeriesDataItem39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(timeSeries38);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.List list3 = timeSeries1.getItems();
        int int4 = timeSeries1.getItemCount();
        java.lang.Class class5 = timeSeries1.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener6);
        long long8 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries15.addChangeListener(seriesChangeListener17);
        org.jfree.data.time.TimeSeries timeSeries19 = timeSeries10.addAndOrUpdate(timeSeries15);
        timeSeries10.setMaximumItemCount(1);
        timeSeries10.setRangeDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries25 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class26 = timeSeries25.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener27 = null;
        timeSeries25.addChangeListener(seriesChangeListener27);
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class31 = timeSeries30.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener32 = null;
        timeSeries30.addChangeListener(seriesChangeListener32);
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries25.addAndOrUpdate(timeSeries30);
        timeSeries30.setRangeDescription("Overwritten values from: 10.0");
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries10.addAndOrUpdate(timeSeries30);
        java.lang.Class class38 = timeSeries37.timePeriodClass;
        java.util.Collection collection39 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries37);
        java.beans.PropertyChangeListener propertyChangeListener40 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener40);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(class5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(timeSeries19);
        org.junit.Assert.assertNotNull(class26);
        org.junit.Assert.assertNotNull(class31);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(class38);
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener19);
        java.lang.String str21 = timeSeries1.getDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod22, (java.lang.Number) 100.0f);
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        java.lang.Class class9 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection13 = timeSeries12.getTimePeriods();
        timeSeries12.removeAgedItems(true);
        boolean boolean16 = timeSeries10.equals((java.lang.Object) timeSeries12);
        timeSeries12.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries29.addChangeListener(seriesChangeListener31);
        java.lang.Class class33 = timeSeries29.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class33);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class33);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class33);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), class33);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, class33);
        timeSeries12.timePeriodClass = class33;
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class42 = timeSeries41.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener43 = null;
        timeSeries41.addChangeListener(seriesChangeListener43);
        java.lang.String str45 = timeSeries41.getRangeDescription();
        boolean boolean46 = timeSeries41.isEmpty();
        boolean boolean47 = timeSeries41.isEmpty();
        boolean boolean48 = timeSeries41.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean51 = timeSeries50.getNotify();
        int int52 = timeSeries50.getMaximumItemCount();
        timeSeries50.setRangeDescription("hi!");
        java.lang.Class class55 = timeSeries50.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener56 = null;
        timeSeries50.removePropertyChangeListener(propertyChangeListener56);
        timeSeries50.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class69 = timeSeries68.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener70 = null;
        timeSeries68.addChangeListener(seriesChangeListener70);
        java.lang.Class class72 = timeSeries68.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries73 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class72);
        org.jfree.data.time.TimeSeries timeSeries74 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class72);
        org.jfree.data.time.TimeSeries timeSeries75 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class72);
        timeSeries50.timePeriodClass = class72;
        java.util.Collection collection77 = timeSeries50.getTimePeriods();
        boolean boolean78 = timeSeries41.equals((java.lang.Object) timeSeries50);
        org.jfree.data.time.TimeSeries timeSeries79 = timeSeries12.addAndOrUpdate(timeSeries50);
        java.lang.Class class80 = timeSeries12.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries81 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "", "hi!", class80);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(class33);
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Value" + "'", str45, "Value");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertNotNull(class55);
        org.junit.Assert.assertNotNull(class69);
        org.junit.Assert.assertNotNull(class72);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(timeSeries79);
        org.junit.Assert.assertNotNull(class80);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class11);
        timeSeries13.clear();
        timeSeries13.setDescription("hi!");
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
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
        java.lang.String str18 = timeSeries10.getDomainDescription();
        java.lang.Number number20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.update(100, number20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Time" + "'", str18, "Time");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        timeSeries7.setNotify(true);
        java.lang.Class class10 = timeSeries7.timePeriodClass;
        timeSeries7.setKey((java.lang.Comparable) (byte) 1);
        timeSeries7.removeAgedItems(true);
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries7.add(timeSeriesDataItem15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
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
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        timeSeries1.fireSeriesChanged();
        java.lang.Class class8 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.createCopy((int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(timeSeries11);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        timeSeries28.setKey((java.lang.Comparable) (short) -1);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.time.TimeSeries timeSeries43 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class44 = timeSeries43.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries45 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class44);
        org.jfree.data.time.TimeSeries timeSeries46 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class44);
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int49 = timeSeries48.getMaximumItemCount();
        java.lang.Object obj50 = timeSeries48.clone();
        timeSeries48.setDomainDescription("Value");
        java.beans.PropertyChangeListener propertyChangeListener53 = null;
        timeSeries48.removePropertyChangeListener(propertyChangeListener53);
        java.util.Collection collection55 = timeSeries46.getTimePeriodsUniqueToOtherSeries(timeSeries48);
        java.util.List list56 = timeSeries46.getItems();
        timeSeries35.data = list56;
        timeSeries28.data = list56;
        java.lang.String str59 = timeSeries28.getDomainDescription();
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
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Time" + "'", str59, "Time");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.util.List list4 = timeSeries1.getItems();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener5);
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener7);
        timeSeries1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 10 + "'", comparable3, (byte) 10);
        org.junit.Assert.assertNotNull(list4);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
        // The following exception was thrown during execution in test generation
        try {
            timeSeries31.delete(2147483647, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
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
        org.junit.Assert.assertNotNull(timeSeries31);
        org.junit.Assert.assertNotNull(class41);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.fireSeriesChanged();
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (short) 0);
        java.beans.PropertyChangeListener propertyChangeListener10 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries14 = timeSeries1.createCopy((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires start <= end.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
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
        timeSeries1.fireSeriesChanged();
        java.lang.String str19 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Value" + "'", str19, "Value");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener19);
        java.lang.Comparable comparable21 = timeSeries1.getKey();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries1.removeChangeListener(seriesChangeListener22);
        java.lang.String str24 = timeSeries1.getDomainDescription();
        java.lang.Class<?> wildcardClass25 = timeSeries1.getClass();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + 10.0f + "'", comparable21, 10.0f);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Time" + "'", str24, "Time");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
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
        timeSeries19.setNotify(true);
        java.lang.String str28 = timeSeries19.getDomainDescription();
        java.lang.String str29 = timeSeries19.getRangeDescription();
        timeSeries19.removeAgedItems(true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Time" + "'", str28, "Time");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Value" + "'", str29, "Value");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection8 = timeSeries7.getTimePeriods();
        java.lang.Class class9 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class9);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class13 = timeSeries12.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries12.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries12.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries10.addAndOrUpdate(timeSeries12);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100, class18);
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class18);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, class18);
        org.jfree.data.time.TimeSeries timeSeries22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries23 = timeSeries21.addAndOrUpdate(timeSeries22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Value" + "'", str16, "Value");
        org.junit.Assert.assertNotNull(timeSeries17);
        org.junit.Assert.assertNotNull(class18);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
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
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0d, class47);
        java.lang.String str51 = timeSeries50.getRangeDescription();
        // The following exception was thrown during execution in test generation
        try {
            timeSeries50.delete(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Value" + "'", str51, "Value");
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.addAndOrUpdate(timeSeries6);
        timeSeries1.setRangeDescription("Time");
        int int13 = timeSeries1.getItemCount();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries1.removeChangeListener(seriesChangeListener14);
        timeSeries1.clear();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
        int int13 = timeSeries1.getItemCount();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener14);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod16, 0.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        timeSeries1.clear();
        java.lang.Comparable comparable6 = timeSeries1.getKey();
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + (byte) 10 + "'", comparable6, (byte) 10);
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        int int21 = timeSeries1.getItemCount();
        timeSeries1.setNotify(true);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
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
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int15 = timeSeries14.getMaximumItemCount();
        int int16 = timeSeries14.getMaximumItemCount();
        java.lang.Object obj17 = timeSeries14.clone();
        timeSeries14.clear();
        java.util.List list19 = timeSeries14.data;
        timeSeries5.data = list19;
        int int21 = timeSeries5.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(regularTimePeriod22, (java.lang.Number) 32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Value" + "'", str9, "Value");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(list19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        boolean boolean7 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries10 = timeSeries1.createCopy((int) (short) 1, (int) ' ');
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeSeries10);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        boolean boolean7 = timeSeries1.getNotify();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class16);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class16);
        timeSeries1.timePeriodClass = class16;
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int22 = timeSeries21.getMaximumItemCount();
        java.lang.Comparable comparable23 = timeSeries21.getKey();
        java.util.List list24 = timeSeries21.getItems();
        timeSeries1.data = list24;
        long long26 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection29 = timeSeries28.getTimePeriods();
        timeSeries28.setKey((java.lang.Comparable) 10L);
        timeSeries28.removeAgedItems(true);
        timeSeries28.removeAgedItems(false);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries1.addAndOrUpdate(timeSeries28);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod37, (java.lang.Number) 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable23 + "' != '" + (byte) 10 + "'", comparable23, (byte) 10);
        org.junit.Assert.assertNotNull(list24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9223372036854775807L + "'", long26 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(timeSeries36);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        long long4 = timeSeries1.getMaximumItemAge();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries8.setRangeDescription("Value");
        boolean boolean11 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries8.fireSeriesChanged();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem15 = timeSeries8.addOrUpdate(regularTimePeriod13, (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.util.List list4 = timeSeries1.getItems();
        timeSeries1.setKey((java.lang.Comparable) 0L);
        java.lang.Class class7 = timeSeries1.timePeriodClass;
        java.util.List list8 = timeSeries1.getItems();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number10 = timeSeries1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 10 + "'", comparable3, (byte) 10);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(list8);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        timeSeries8.setNotify(true);
        boolean boolean12 = timeSeries1.equals((java.lang.Object) timeSeries8);
        timeSeries1.removeAgedItems((long) 1, true);
        boolean boolean16 = timeSeries1.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.lang.String str22 = timeSeries18.getRangeDescription();
        boolean boolean23 = timeSeries18.isEmpty();
        boolean boolean24 = timeSeries18.isEmpty();
        boolean boolean25 = timeSeries18.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries26 = timeSeries1.addAndOrUpdate(timeSeries18);
        java.util.Collection collection27 = timeSeries1.getTimePeriods();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(timeSeries26);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
            timeSeries15.add(timeSeriesDataItem18, true);
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
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        timeSeries23.removeAgedItems((long) (short) 1, false);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries29 = timeSeries23.createCopy(regularTimePeriod27, regularTimePeriod28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertNotNull(class17);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener10 = null;
        timeSeries8.addChangeListener(seriesChangeListener10);
        java.lang.Class class12 = timeSeries8.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class12);
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1, "Overwritten values from: 10.0", "hi!", class12);
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 100, class12);
        java.lang.Comparable comparable16 = timeSeries15.getKey();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener19 = null;
        timeSeries18.removeChangeListener(seriesChangeListener19);
        org.jfree.data.time.TimeSeries timeSeries23 = timeSeries18.createCopy((int) (short) 10, (int) '4');
        java.util.List list24 = timeSeries23.data;
        timeSeries15.data = list24;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = timeSeries15.getIndex(regularTimePeriod26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class9);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + (short) 100 + "'", comparable16, (short) 100);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(list24);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
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
        java.util.List list48 = timeSeries24.data;
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
        org.junit.Assert.assertNotNull(list48);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.fireSeriesChanged();
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (short) 0);
        boolean boolean10 = timeSeries1.isEmpty();
        int int11 = timeSeries1.getItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod12, (double) 100.0f, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
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
        timeSeries19.setDescription("Time");
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries29.addChangeListener(seriesChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class35 = timeSeries34.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries34.addChangeListener(seriesChangeListener36);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries29.addAndOrUpdate(timeSeries34);
        timeSeries29.setRangeDescription("Time");
        int int41 = timeSeries29.getMaximumItemCount();
        boolean boolean42 = timeSeries29.getNotify();
        org.jfree.data.time.TimeSeries timeSeries43 = timeSeries19.addAndOrUpdate(timeSeries29);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(timeSeries23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(timeSeries43);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener7 = null;
        timeSeries1.removeChangeListener(seriesChangeListener7);
        java.lang.String str9 = timeSeries1.getDescription();
        boolean boolean10 = timeSeries1.getNotify();
        java.lang.Class class11 = timeSeries1.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean14 = timeSeries13.getNotify();
        int int15 = timeSeries13.getMaximumItemCount();
        timeSeries13.setRangeDescription("hi!");
        java.lang.Class class18 = timeSeries13.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        timeSeries13.removePropertyChangeListener(propertyChangeListener19);
        timeSeries13.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class32 = timeSeries31.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener33 = null;
        timeSeries31.addChangeListener(seriesChangeListener33);
        java.lang.Class class35 = timeSeries31.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class35);
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class35);
        org.jfree.data.time.TimeSeries timeSeries38 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class35);
        timeSeries13.timePeriodClass = class35;
        java.util.List list40 = timeSeries13.data;
        boolean boolean41 = timeSeries1.equals((java.lang.Object) timeSeries13);
        timeSeries1.fireSeriesChanged();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(class18);
        org.junit.Assert.assertNotNull(class32);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
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
        boolean boolean16 = timeSeries1.isEmpty();
        java.lang.Class class17 = timeSeries1.timePeriodClass;
        timeSeries1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + (byte) 10 + "'", comparable12, (byte) 10);
        org.junit.Assert.assertNotNull(timeSeries15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(class17);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a');
        timeSeries8.setKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.time.TimeSeries timeSeries11 = timeSeries1.addAndOrUpdate(timeSeries8);
        boolean boolean12 = timeSeries1.getNotify();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeSeries11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        timeSeries1.fireSeriesChanged();
        java.lang.Class class7 = timeSeries1.getTimePeriodClass();
        timeSeries1.setMaximumItemCount((int) (short) 0);
        timeSeries1.setNotify(false);
        timeSeries1.removeAgedItems(true);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Value" + "'", str5, "Value");
        org.junit.Assert.assertNotNull(class7);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        java.lang.Comparable comparable3 = timeSeries1.getKey();
        java.util.List list4 = timeSeries1.getItems();
        timeSeries1.setKey((java.lang.Comparable) 0L);
        java.util.List list7 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class16 = timeSeries15.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener17 = null;
        timeSeries15.addChangeListener(seriesChangeListener17);
        java.lang.Class class19 = timeSeries15.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries20 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class19);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class19);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener22 = null;
        timeSeries21.addChangeListener(seriesChangeListener22);
        java.lang.String str24 = timeSeries21.getRangeDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries21.addPropertyChangeListener(propertyChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class29 = timeSeries28.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener30 = null;
        timeSeries28.addChangeListener(seriesChangeListener30);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class34 = timeSeries33.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener35 = null;
        timeSeries33.addChangeListener(seriesChangeListener35);
        org.jfree.data.time.TimeSeries timeSeries37 = timeSeries28.addAndOrUpdate(timeSeries33);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection40 = timeSeries39.getTimePeriods();
        boolean boolean42 = timeSeries39.equals((java.lang.Object) 100.0d);
        timeSeries39.setMaximumItemAge((long) 'a');
        boolean boolean45 = timeSeries28.equals((java.lang.Object) timeSeries39);
        java.beans.PropertyChangeListener propertyChangeListener46 = null;
        timeSeries28.addPropertyChangeListener(propertyChangeListener46);
        org.jfree.data.time.TimeSeries timeSeries48 = timeSeries21.addAndOrUpdate(timeSeries28);
        org.jfree.data.time.TimeSeries timeSeries49 = timeSeries1.addAndOrUpdate(timeSeries48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + (byte) 10 + "'", comparable3, (byte) 10);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(list7);
        org.junit.Assert.assertNotNull(class16);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Time" + "'", str24, "Time");
        org.junit.Assert.assertNotNull(class29);
        org.junit.Assert.assertNotNull(class34);
        org.junit.Assert.assertNotNull(timeSeries37);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(timeSeries48);
        org.junit.Assert.assertNotNull(timeSeries49);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "Time");
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean4 = timeSeries3.getNotify();
        int int5 = timeSeries3.getMaximumItemCount();
        java.util.List list6 = timeSeries3.data;
        java.beans.PropertyChangeListener propertyChangeListener7 = null;
        timeSeries3.removePropertyChangeListener(propertyChangeListener7);
        java.lang.String str9 = timeSeries3.getDescription();
        timeSeries3.setDomainDescription("Value");
        java.util.Collection collection12 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries3);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod13, (java.lang.Number) 100.0f, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        timeSeries6.setKey((java.lang.Comparable) 32);
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries6.createCopy((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(timeSeries15);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f, "hi!", "Time", class14);
        timeSeries17.setNotify(true);
        timeSeries17.fireSeriesChanged();
        java.lang.String str21 = timeSeries17.getRangeDescription();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries17.update(regularTimePeriod22, (java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Time" + "'", str21, "Time");
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        timeSeries1.setDomainDescription("Overwritten values from: 10.0");
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d);
        java.lang.Class class22 = timeSeries21.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener23 = null;
        timeSeries21.addPropertyChangeListener(propertyChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries1.addAndOrUpdate(timeSeries21);
        java.util.Collection collection26 = timeSeries21.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number28 = timeSeries21.getValue(regularTimePeriod27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertNotNull(timeSeries25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
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
        org.jfree.data.general.SeriesChangeListener seriesChangeListener15 = null;
        timeSeries10.addChangeListener(seriesChangeListener15);
        timeSeries10.setMaximumItemAge(97L);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries10.delete(regularTimePeriod19);
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
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#');
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        int int16 = timeSeries1.getItemCount();
        java.util.List list17 = timeSeries1.data;
        timeSeries1.setMaximumItemCount((int) (short) 10);
        java.util.List list20 = timeSeries1.getItems();
        java.lang.String str21 = timeSeries1.getDomainDescription();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Time" + "'", str21, "Time");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class class6 = timeSeries4.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0, "Time", "", class6);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.String str13 = timeSeries9.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries14 = timeSeries7.addAndOrUpdate(timeSeries9);
        java.lang.Class class15 = timeSeries14.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int18 = timeSeries17.getMaximumItemCount();
        java.lang.Comparable comparable19 = timeSeries17.getKey();
        java.util.List list20 = timeSeries17.getItems();
        timeSeries17.setKey((java.lang.Comparable) 0L);
        java.lang.Class class23 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries24 = timeSeries14.addAndOrUpdate(timeSeries17);
        timeSeries14.setNotify(false);
        timeSeries14.setNotify(false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNotNull(timeSeries14);
        org.junit.Assert.assertNotNull(class15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + (byte) 10 + "'", comparable19, (byte) 10);
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(timeSeries24);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.util.List list4 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.createCopy((int) '4', (int) (short) 100);
        long long8 = timeSeries1.getMaximumItemAge();
        timeSeries1.setDescription("");
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod11, (java.lang.Number) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 9223372036854775807L + "'", long8 == 9223372036854775807L);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        timeSeries1.fireSeriesChanged();
        timeSeries1.clear();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.update(regularTimePeriod20, (java.lang.Number) 10L);
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
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        java.util.List list5 = timeSeries1.data;
        timeSeries1.setNotify(true);
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) true);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class12 = timeSeries11.timePeriodClass;
        java.util.List list13 = timeSeries11.getItems();
        timeSeries11.setKey((java.lang.Comparable) 0.0f);
        org.jfree.data.time.TimeSeries timeSeries16 = timeSeries9.addAndOrUpdate(timeSeries11);
        org.jfree.data.time.TimeSeries timeSeries17 = timeSeries1.addAndOrUpdate(timeSeries9);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod18 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries20 = timeSeries17.createCopy(regularTimePeriod18, regularTimePeriod19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(list5);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(timeSeries17);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        timeSeries6.setKey((java.lang.Comparable) (-1L));
        timeSeries6.setMaximumItemCount((int) (short) 1);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class27 = timeSeries26.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries26.addChangeListener(seriesChangeListener28);
        java.lang.Class class30 = timeSeries26.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class30);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class30);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class30);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        timeSeries35.removePropertyChangeListener(propertyChangeListener36);
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int40 = timeSeries39.getMaximumItemCount();
        java.lang.Comparable comparable41 = timeSeries39.getKey();
        java.util.List list42 = timeSeries39.getItems();
        timeSeries35.data = list42;
        boolean boolean44 = timeSeries33.equals((java.lang.Object) timeSeries35);
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries6.addAndOrUpdate(timeSeries33);
        // The following exception was thrown during execution in test generation
        try {
            timeSeries45.delete((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable41 + "' != '" + (byte) 10 + "'", comparable41, (byte) 10);
        org.junit.Assert.assertNotNull(list42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(timeSeries45);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.removeAgedItems(false);
        timeSeries1.setDescription("");
        java.lang.String str7 = timeSeries1.getRangeDescription();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener2 = null;
        timeSeries1.removeChangeListener(seriesChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries6 = timeSeries1.createCopy((int) (short) 10, (int) '4');
        timeSeries6.setMaximumItemAge(0L);
        timeSeries6.setMaximumItemCount(1);
        timeSeries6.fireSeriesChanged();
        org.junit.Assert.assertNotNull(timeSeries6);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        org.jfree.data.time.TimeSeries timeSeries3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 0);
        boolean boolean4 = timeSeries3.isEmpty();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries3.addPropertyChangeListener(propertyChangeListener5);
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.addAndOrUpdate(timeSeries3);
        timeSeries1.setRangeDescription("");
        boolean boolean10 = timeSeries1.isEmpty();
        boolean boolean11 = timeSeries1.isEmpty();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeSeries1.getIndex(regularTimePeriod12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeSeries7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean6 = timeSeries5.getNotify();
        int int7 = timeSeries5.getMaximumItemCount();
        timeSeries5.setRangeDescription("hi!");
        java.lang.Class class10 = timeSeries5.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1.0d), class10);
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0f, "hi!", "hi!", class10);
        java.util.List list13 = timeSeries12.data;
        timeSeries12.setMaximumItemCount((int) (short) 10);
        long long16 = timeSeries12.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries12.add(regularTimePeriod17, 10.0d, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(class10);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 9223372036854775807L + "'", long16 == 9223372036854775807L);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
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
        timeSeries10.setMaximumItemCount((int) (short) 10);
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class19 = timeSeries18.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener20 = null;
        timeSeries18.addChangeListener(seriesChangeListener20);
        java.lang.String str22 = timeSeries18.getRangeDescription();
        timeSeries18.setDescription("");
        org.jfree.data.general.SeriesChangeListener seriesChangeListener25 = null;
        timeSeries18.addChangeListener(seriesChangeListener25);
        org.jfree.data.time.TimeSeries timeSeries28 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean29 = timeSeries28.getNotify();
        int int30 = timeSeries28.getMaximumItemCount();
        java.util.List list31 = timeSeries28.data;
        org.jfree.data.time.TimeSeries timeSeries34 = timeSeries28.createCopy((int) '4', (int) (short) 100);
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class37 = timeSeries36.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener38 = null;
        timeSeries36.addChangeListener(seriesChangeListener38);
        java.lang.String str40 = timeSeries36.getRangeDescription();
        timeSeries36.fireSeriesChanged();
        java.lang.Class class42 = timeSeries36.getTimePeriodClass();
        timeSeries34.timePeriodClass = class42;
        java.lang.Class class44 = timeSeries34.getTimePeriodClass();
        java.lang.String str45 = timeSeries34.getDomainDescription();
        java.util.List list46 = timeSeries34.getItems();
        java.lang.Class class47 = timeSeries34.getTimePeriodClass();
        timeSeries18.timePeriodClass = class47;
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1, class47);
        org.jfree.data.time.TimeSeries timeSeries50 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0.0f, class47);
        timeSeries10.timePeriodClass = class47;
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertNotNull(class19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Value" + "'", str22, "Value");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(timeSeries34);
        org.junit.Assert.assertNotNull(class37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Value" + "'", str40, "Value");
        org.junit.Assert.assertNotNull(class42);
        org.junit.Assert.assertNotNull(class44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Time" + "'", str45, "Time");
        org.junit.Assert.assertNotNull(list46);
        org.junit.Assert.assertNotNull(class47);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        java.lang.Class<?> wildcardClass4 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, (java.lang.Class) wildcardClass4);
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        java.lang.String str7 = timeSeries5.getRangeDescription();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries5.add(timeSeriesDataItem8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1.0d + "'", comparable6, 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
        org.jfree.data.time.TimeSeries timeSeries41 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection42 = timeSeries41.getTimePeriods();
        boolean boolean44 = timeSeries41.equals((java.lang.Object) 100.0d);
        timeSeries41.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries48 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection49 = timeSeries48.getTimePeriods();
        timeSeries48.setNotify(true);
        boolean boolean52 = timeSeries41.equals((java.lang.Object) timeSeries48);
        org.jfree.data.time.TimeSeries timeSeries53 = timeSeries8.addAndOrUpdate(timeSeries41);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem56 = timeSeries41.addOrUpdate(regularTimePeriod54, (double) 32);
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
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(timeSeries53);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setKey((java.lang.Comparable) "");
        java.lang.Object obj9 = timeSeries1.clone();
        long long10 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem12 = timeSeries1.getDataItem(regularTimePeriod11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9223372036854775807L + "'", long10 == 9223372036854775807L);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
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
        java.util.List list34 = timeSeries1.getItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(class6);
        org.junit.Assert.assertNotNull(class20);
        org.junit.Assert.assertNotNull(class23);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertNotNull(list34);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class11 = timeSeries10.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener12 = null;
        timeSeries10.addChangeListener(seriesChangeListener12);
        java.lang.Class class14 = timeSeries10.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class14);
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class14);
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "", "", class14);
        long long18 = timeSeries17.getMaximumItemAge();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem21 = timeSeries17.addOrUpdate(regularTimePeriod19, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9223372036854775807L + "'", long18 == 9223372036854775807L);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean3 = timeSeries2.getNotify();
        int int4 = timeSeries2.getMaximumItemCount();
        timeSeries2.setRangeDescription("hi!");
        java.lang.Class class7 = timeSeries2.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 2147483647, class7);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = timeSeries8.getValue(regularTimePeriod10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        org.jfree.data.time.TimeSeries timeSeries36 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean37 = timeSeries36.getNotify();
        int int38 = timeSeries36.getMaximumItemCount();
        java.util.List list39 = timeSeries36.data;
        org.jfree.data.time.TimeSeries timeSeries44 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class45 = timeSeries44.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener46 = null;
        timeSeries44.addChangeListener(seriesChangeListener46);
        java.lang.Class class48 = timeSeries44.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries49 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class48);
        timeSeries36.timePeriodClass = class48;
        java.beans.PropertyChangeListener propertyChangeListener51 = null;
        timeSeries36.addPropertyChangeListener(propertyChangeListener51);
        timeSeries36.setDescription("hi!");
        java.lang.String str55 = timeSeries36.getDescription();
        java.lang.Class class56 = timeSeries36.timePeriodClass;
        timeSeries14.timePeriodClass = class56;
        java.util.List list58 = timeSeries14.getItems();
        org.jfree.data.general.SeriesChangeListener seriesChangeListener59 = null;
        timeSeries14.removeChangeListener(seriesChangeListener59);
        timeSeries14.setRangeDescription("hi!");
        // The following exception was thrown during execution in test generation
        try {
            timeSeries14.update((int) (byte) 1, (java.lang.Number) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Time" + "'", str34, "Time");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertNotNull(class45);
        org.junit.Assert.assertNotNull(class48);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(class56);
        org.junit.Assert.assertNotNull(list58);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        timeSeries12.removeAgedItems((long) 1, false);
        java.lang.String str23 = timeSeries12.getDescription();
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 10.0f + "'", comparable19, 10.0f);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        int int3 = timeSeries1.getMaximumItemCount();
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries1.addPropertyChangeListener(propertyChangeListener4);
        java.util.List list6 = timeSeries1.data;
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        java.lang.Class class8 = timeSeries1.timePeriodClass;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(list6);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertNotNull(class8);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
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
            timeSeries8.update(regularTimePeriod12, (java.lang.Number) 9223372036854775807L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 9223372036854775807L + "'", long4 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        java.lang.Comparable comparable57 = timeSeries36.getKey();
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries59.setRangeDescription("Value");
        java.util.Collection collection62 = timeSeries36.getTimePeriodsUniqueToOtherSeries(timeSeries59);
        java.lang.Comparable comparable63 = timeSeries36.getKey();
        timeSeries36.setNotify(false);
        timeSeries36.removeAgedItems(true);
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
        org.junit.Assert.assertEquals("'" + comparable57 + "' != '" + (byte) -1 + "'", comparable57, (byte) -1);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertEquals("'" + comparable63 + "' != '" + (byte) -1 + "'", comparable63, (byte) -1);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
        int int33 = timeSeries7.getMaximumItemCount();
        org.jfree.data.time.RegularTimePeriod regularTimePeriod34 = null;
        org.jfree.data.time.RegularTimePeriod regularTimePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.time.TimeSeries timeSeries36 = timeSeries7.createCopy(regularTimePeriod34, regularTimePeriod35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'start' argument.");
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
        org.junit.Assert.assertNotNull(class32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.jfree.data.time.TimeSeries timeSeries7 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class8 = timeSeries7.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener9 = null;
        timeSeries7.addChangeListener(seriesChangeListener9);
        java.lang.Class class11 = timeSeries7.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries12 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class11);
        org.jfree.data.time.TimeSeries timeSeries13 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 100.0d, "hi!", "hi!", class11);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener14 = null;
        timeSeries13.addChangeListener(seriesChangeListener14);
        java.lang.String str16 = timeSeries13.getDescription();
        boolean boolean17 = timeSeries13.getNotify();
        java.lang.Class class18 = timeSeries13.getTimePeriodClass();
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(class18);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener5);
        timeSeries1.setKey((java.lang.Comparable) "");
        java.util.List list9 = timeSeries1.getItems();
        org.jfree.data.time.TimeSeriesDataItem timeSeriesDataItem10 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(timeSeriesDataItem10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'item' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        timeSeries1.clear();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.lang.String str6 = timeSeries5.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries7 = timeSeries1.addAndOrUpdate(timeSeries5);
        org.jfree.data.time.RegularTimePeriod regularTimePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            timeSeries1.add(regularTimePeriod8, (java.lang.Number) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'period' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Value" + "'", str6, "Value");
        org.junit.Assert.assertNotNull(timeSeries7);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean2 = timeSeries1.getNotify();
        timeSeries1.setMaximumItemCount(0);
        timeSeries1.setDescription("Time");
        java.lang.Comparable comparable7 = timeSeries1.getKey();
        timeSeries1.setKey((java.lang.Comparable) 2147483647);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        boolean boolean14 = timeSeries11.equals((java.lang.Object) 100.0d);
        timeSeries11.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        timeSeries18.setNotify(true);
        boolean boolean22 = timeSeries11.equals((java.lang.Object) timeSeries18);
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries24.addChangeListener(seriesChangeListener26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries29.addChangeListener(seriesChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries33 = timeSeries24.addAndOrUpdate(timeSeries29);
        java.util.Collection collection34 = timeSeries18.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        timeSeries29.clear();
        org.jfree.data.time.TimeSeries timeSeries37 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean38 = timeSeries37.getNotify();
        java.util.List list39 = timeSeries37.getItems();
        timeSeries29.data = list39;
        java.lang.Object obj41 = null;
        boolean boolean42 = timeSeries29.equals(obj41);
        java.util.Collection collection43 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        timeSeries1.setNotify(true);
        long long46 = timeSeries1.getMaximumItemAge();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) -1 + "'", comparable7, (byte) -1);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(timeSeries33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(list39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 9223372036854775807L + "'", long46 == 9223372036854775807L);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
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
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean25 = timeSeries24.getNotify();
        timeSeries24.setMaximumItemCount(0);
        timeSeries24.setDescription("Time");
        java.lang.Comparable comparable30 = timeSeries24.getKey();
        long long31 = timeSeries24.getMaximumItemAge();
        timeSeries24.setDescription("Value");
        boolean boolean34 = timeSeries17.equals((java.lang.Object) "Value");
        boolean boolean35 = timeSeries17.isEmpty();
        org.junit.Assert.assertNotNull(class11);
        org.junit.Assert.assertNotNull(class14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + comparable30 + "' != '" + (byte) -1 + "'", comparable30, (byte) -1);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 9223372036854775807L + "'", long31 == 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.beans.PropertyChangeListener propertyChangeListener2 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener2);
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int6 = timeSeries5.getMaximumItemCount();
        java.lang.Comparable comparable7 = timeSeries5.getKey();
        java.util.List list8 = timeSeries5.getItems();
        timeSeries1.data = list8;
        org.jfree.data.time.TimeSeries timeSeries12 = timeSeries1.createCopy((int) ' ', (int) ' ');
        java.lang.String str13 = timeSeries12.getRangeDescription();
        java.lang.String str14 = timeSeries12.getDescription();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + (byte) 10 + "'", comparable7, (byte) 10);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(timeSeries12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Value" + "'", str13, "Value");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
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
        java.lang.Comparable comparable27 = timeSeries10.getKey();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener31 = null;
        timeSeries29.addChangeListener(seriesChangeListener31);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class35 = timeSeries34.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener36 = null;
        timeSeries34.addChangeListener(seriesChangeListener36);
        org.jfree.data.time.TimeSeries timeSeries38 = timeSeries29.addAndOrUpdate(timeSeries34);
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection41 = timeSeries40.getTimePeriods();
        boolean boolean43 = timeSeries40.equals((java.lang.Object) 100.0d);
        timeSeries40.setMaximumItemAge((long) 'a');
        boolean boolean46 = timeSeries29.equals((java.lang.Object) timeSeries40);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener47 = null;
        timeSeries40.removeChangeListener(seriesChangeListener47);
        java.beans.PropertyChangeListener propertyChangeListener49 = null;
        timeSeries40.addPropertyChangeListener(propertyChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries10.addAndOrUpdate(timeSeries40);
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        java.lang.String str54 = timeSeries53.getRangeDescription();
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class57 = timeSeries56.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener58 = null;
        timeSeries56.addChangeListener(seriesChangeListener58);
        org.jfree.data.time.TimeSeries timeSeries61 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class62 = timeSeries61.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener63 = null;
        timeSeries61.addChangeListener(seriesChangeListener63);
        org.jfree.data.time.TimeSeries timeSeries65 = timeSeries56.addAndOrUpdate(timeSeries61);
        java.lang.Class class66 = timeSeries65.getTimePeriodClass();
        timeSeries53.timePeriodClass = class66;
        timeSeries53.setDescription("Value");
        timeSeries53.clear();
        java.beans.PropertyChangeListener propertyChangeListener71 = null;
        timeSeries53.removePropertyChangeListener(propertyChangeListener71);
        org.jfree.data.time.TimeSeries timeSeries75 = timeSeries53.createCopy((int) (byte) 10, (int) ' ');
        org.jfree.data.time.TimeSeries timeSeries76 = timeSeries40.addAndOrUpdate(timeSeries75);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertEquals("'" + comparable27 + "' != '" + '#' + "'", comparable27, '#');
        org.junit.Assert.assertNotNull(class30);
        org.junit.Assert.assertNotNull(class35);
        org.junit.Assert.assertNotNull(timeSeries38);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Value" + "'", str54, "Value");
        org.junit.Assert.assertNotNull(class57);
        org.junit.Assert.assertNotNull(class62);
        org.junit.Assert.assertNotNull(timeSeries65);
        org.junit.Assert.assertNotNull(class66);
        org.junit.Assert.assertNotNull(timeSeries75);
        org.junit.Assert.assertNotNull(timeSeries76);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class3 = timeSeries2.timePeriodClass;
        java.beans.PropertyChangeListener propertyChangeListener4 = null;
        timeSeries2.addPropertyChangeListener(propertyChangeListener4);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection9 = timeSeries8.getTimePeriods();
        boolean boolean11 = timeSeries8.equals((java.lang.Object) 100.0d);
        timeSeries8.setMaximumItemCount((int) ' ');
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        timeSeries15.setNotify(true);
        boolean boolean19 = timeSeries8.equals((java.lang.Object) timeSeries15);
        org.jfree.data.time.TimeSeries timeSeries21 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class22 = timeSeries21.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener23 = null;
        timeSeries21.addChangeListener(seriesChangeListener23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class27 = timeSeries26.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener28 = null;
        timeSeries26.addChangeListener(seriesChangeListener28);
        org.jfree.data.time.TimeSeries timeSeries30 = timeSeries21.addAndOrUpdate(timeSeries26);
        java.util.Collection collection31 = timeSeries15.getTimePeriodsUniqueToOtherSeries(timeSeries26);
        timeSeries26.clear();
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean35 = timeSeries34.getNotify();
        java.util.List list36 = timeSeries34.getItems();
        timeSeries26.data = list36;
        java.lang.Object obj38 = null;
        boolean boolean39 = timeSeries26.equals(obj38);
        org.jfree.data.time.TimeSeries timeSeries42 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class43 = timeSeries42.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener44 = null;
        timeSeries42.addChangeListener(seriesChangeListener44);
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class48 = timeSeries47.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener49 = null;
        timeSeries47.addChangeListener(seriesChangeListener49);
        org.jfree.data.time.TimeSeries timeSeries51 = timeSeries42.addAndOrUpdate(timeSeries47);
        java.lang.String str52 = timeSeries51.getDescription();
        java.lang.Class class53 = timeSeries51.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries54 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, class53);
        timeSeries26.timePeriodClass = class53;
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 0L, class53);
        timeSeries2.timePeriodClass = class53;
        org.jfree.data.time.TimeSeries timeSeries58 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1L, class53);
        timeSeries58.clear();
        org.junit.Assert.assertNotNull(class3);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(class22);
        org.junit.Assert.assertNotNull(class27);
        org.junit.Assert.assertNotNull(timeSeries30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(list36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(class43);
        org.junit.Assert.assertNotNull(class48);
        org.junit.Assert.assertNotNull(timeSeries51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(class53);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        org.jfree.data.time.TimeSeries timeSeries2 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection3 = timeSeries2.getTimePeriods();
        java.lang.Class<?> wildcardClass4 = timeSeries2.getClass();
        org.jfree.data.time.TimeSeries timeSeries5 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, (java.lang.Class) wildcardClass4);
        java.lang.Comparable comparable6 = timeSeries5.getKey();
        java.lang.String str7 = timeSeries5.getRangeDescription();
        timeSeries5.setDomainDescription("Overwritten values from: 10.0");
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + 1.0d + "'", comparable6, 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Value" + "'", str7, "Value");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int5 = timeSeries4.getMaximumItemCount();
        timeSeries4.clear();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int9 = timeSeries8.getMaximumItemCount();
        java.lang.Comparable comparable10 = timeSeries8.getKey();
        java.util.List list11 = timeSeries8.getItems();
        timeSeries4.data = list11;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener13 = null;
        timeSeries4.removeChangeListener(seriesChangeListener13);
        timeSeries4.setRangeDescription("Time");
        java.lang.Class<?> wildcardClass17 = timeSeries4.getClass();
        org.jfree.data.time.TimeSeries timeSeries18 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10L, "Overwritten values from: 10.0", "", (java.lang.Class) wildcardClass17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + (byte) 10 + "'", comparable10, (byte) 10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
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
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries19.removePropertyChangeListener(propertyChangeListener20);
        org.jfree.data.time.TimeSeries timeSeries23 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection24 = timeSeries23.getTimePeriods();
        java.lang.Class class25 = timeSeries23.getTimePeriodClass();
        java.util.Collection collection26 = timeSeries19.getTimePeriodsUniqueToOtherSeries(timeSeries23);
        timeSeries19.removeAgedItems((long) (short) 100, true);
        java.lang.Class class30 = timeSeries19.timePeriodClass;
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(class8);
        org.junit.Assert.assertNotNull(class12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Value" + "'", str15, "Value");
        org.junit.Assert.assertNotNull(timeSeries16);
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(class25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(class30);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
        timeSeries1.removeAgedItems(true);
        java.beans.PropertyChangeListener propertyChangeListener17 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener17);
        timeSeries1.removeAgedItems(false);
        org.junit.Assert.assertNotNull(class2);
        org.junit.Assert.assertNotNull(class7);
        org.junit.Assert.assertNotNull(timeSeries10);
    }
}

