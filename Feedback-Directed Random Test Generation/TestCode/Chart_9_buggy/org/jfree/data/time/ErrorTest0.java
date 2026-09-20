package org.jfree.data.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        java.lang.Class<?> wildcardClass6 = timeSeries4.getClass();
        timeSeries1.timePeriodClass = wildcardClass6;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries4", timeSeries1.equals(timeSeries4) ? timeSeries1.hashCode() == timeSeries4.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        timeSeries18.removeAgedItems(9223372036854775807L, false);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        long long7 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        java.util.List list11 = timeSeries9.getItems();
        int int12 = timeSeries9.getItemCount();
        java.lang.Class class13 = timeSeries9.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener14 = null;
        timeSeries9.addPropertyChangeListener(propertyChangeListener14);
        java.util.Collection collection16 = timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries9", timeSeries1.equals(timeSeries9) ? timeSeries1.hashCode() == timeSeries9.hashCode() : true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        java.lang.String str5 = timeSeries1.getRangeDescription();
        int int6 = timeSeries1.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean9 = timeSeries8.getNotify();
        timeSeries8.setMaximumItemCount(0);
        timeSeries8.setDescription("Time");
        java.lang.String str14 = timeSeries8.getDomainDescription();
        org.jfree.data.time.TimeSeries timeSeries16 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean17 = timeSeries16.getNotify();
        int int18 = timeSeries16.getMaximumItemCount();
        java.util.List list19 = timeSeries16.data;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class25 = timeSeries24.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener26 = null;
        timeSeries24.addChangeListener(seriesChangeListener26);
        java.lang.Class class28 = timeSeries24.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class28);
        timeSeries16.timePeriodClass = class28;
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        timeSeries16.addPropertyChangeListener(propertyChangeListener31);
        timeSeries16.setDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries35 = timeSeries8.addAndOrUpdate(timeSeries16);
        java.lang.Class<?> wildcardClass36 = timeSeries16.getClass();
        timeSeries1.timePeriodClass = wildcardClass36;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries24", timeSeries1.equals(timeSeries24) ? timeSeries1.hashCode() == timeSeries24.hashCode() : true);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int2 = timeSeries1.getMaximumItemCount();
        int int3 = timeSeries1.getMaximumItemCount();
        java.lang.Object obj4 = timeSeries1.clone();
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        timeSeries6.setDomainDescription("");
        boolean boolean10 = timeSeries1.equals((java.lang.Object) timeSeries6);
        int int11 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries14 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection15 = timeSeries14.getTimePeriods();
        java.lang.Class<?> wildcardClass16 = timeSeries14.getClass();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 1.0d, (java.lang.Class) wildcardClass16);
        java.lang.Object obj18 = timeSeries17.clone();
        java.lang.Class class19 = timeSeries17.getTimePeriodClass();
        timeSeries1.timePeriodClass = class19;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and obj4", timeSeries1.equals(obj4) ? timeSeries1.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
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
        org.jfree.data.time.TimeSeries timeSeries15 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection16 = timeSeries15.getTimePeriods();
        boolean boolean18 = timeSeries15.equals((java.lang.Object) 100.0d);
        timeSeries15.setNotify(true);
        boolean boolean21 = timeSeries15.getNotify();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries31 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, "Value", "Time", class30);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', "Time", "hi!", class30);
        timeSeries15.timePeriodClass = class30;
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int36 = timeSeries35.getMaximumItemCount();
        java.lang.Comparable comparable37 = timeSeries35.getKey();
        java.util.List list38 = timeSeries35.getItems();
        timeSeries15.data = list38;
        java.lang.Class<?> wildcardClass40 = list38.getClass();
        timeSeries1.timePeriodClass = wildcardClass40;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and obj4", timeSeries1.equals(obj4) ? timeSeries1.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
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
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries27.addChangeListener(seriesChangeListener29);
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class33 = timeSeries32.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener34 = null;
        timeSeries32.addChangeListener(seriesChangeListener34);
        org.jfree.data.time.TimeSeries timeSeries36 = timeSeries27.addAndOrUpdate(timeSeries32);
        timeSeries36.setNotify(false);
        java.lang.Class<?> wildcardClass39 = timeSeries36.getClass();
        org.jfree.data.time.TimeSeries timeSeries40 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) "", (java.lang.Class) wildcardClass39);
        org.jfree.data.time.TimeSeries timeSeries41 = timeSeries17.addAndOrUpdate(timeSeries40);
        org.jfree.data.general.SeriesChangeListener seriesChangeListener42 = null;
        timeSeries17.addChangeListener(seriesChangeListener42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries36 and timeSeries41", timeSeries36.equals(timeSeries41) ? timeSeries36.hashCode() == timeSeries41.hashCode() : true);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        long long7 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean10 = timeSeries9.getNotify();
        int int11 = timeSeries9.getMaximumItemCount();
        timeSeries9.setRangeDescription("hi!");
        java.lang.Class class14 = timeSeries9.getTimePeriodClass();
        java.beans.PropertyChangeListener propertyChangeListener15 = null;
        timeSeries9.removePropertyChangeListener(propertyChangeListener15);
        timeSeries9.setRangeDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class28 = timeSeries27.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener29 = null;
        timeSeries27.addChangeListener(seriesChangeListener29);
        java.lang.Class class31 = timeSeries27.getTimePeriodClass();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10, "Time", "", class31);
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Time", "Time", class31);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) '#', class31);
        timeSeries9.timePeriodClass = class31;
        java.util.Collection collection36 = timeSeries9.getTimePeriods();
        boolean boolean37 = timeSeries9.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries39 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int40 = timeSeries39.getMaximumItemCount();
        java.lang.Object obj41 = timeSeries39.clone();
        int int42 = timeSeries39.getItemCount();
        org.jfree.data.time.TimeSeries timeSeries45 = timeSeries39.createCopy((int) (byte) 1, (int) (byte) 10);
        org.jfree.data.time.TimeSeries timeSeries46 = timeSeries9.addAndOrUpdate(timeSeries45);
        boolean boolean47 = timeSeries1.equals((java.lang.Object) timeSeries46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries27", timeSeries1.equals(timeSeries27) ? timeSeries1.hashCode() == timeSeries27.hashCode() : true);
    }
}

