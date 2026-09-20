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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener3 = null;
        timeSeries1.addChangeListener(seriesChangeListener3);
        org.jfree.data.time.TimeSeries timeSeries6 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class7 = timeSeries6.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener8 = null;
        timeSeries6.addChangeListener(seriesChangeListener8);
        java.lang.String str10 = timeSeries6.getRangeDescription();
        java.lang.Class<?> wildcardClass11 = timeSeries6.getClass();
        timeSeries1.timePeriodClass = wildcardClass11;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries6", timeSeries1.equals(timeSeries6) ? timeSeries1.hashCode() == timeSeries6.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries4 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection5 = timeSeries4.getTimePeriods();
        boolean boolean7 = timeSeries4.equals((java.lang.Object) 100.0d);
        timeSeries4.setNotify(true);
        java.lang.Class<?> wildcardClass10 = timeSeries4.getClass();
        timeSeries1.timePeriodClass = wildcardClass10;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries4", timeSeries1.equals(timeSeries4) ? timeSeries1.hashCode() == timeSeries4.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener3);
        java.lang.Class class5 = null;
        timeSeries1.timePeriodClass = class5;
        java.util.List list7 = timeSeries1.data;
        org.jfree.data.time.TimeSeries timeSeries9 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class10 = timeSeries9.timePeriodClass;
        org.jfree.data.general.SeriesChangeListener seriesChangeListener11 = null;
        timeSeries9.addChangeListener(seriesChangeListener11);
        java.lang.String str13 = timeSeries9.getRangeDescription();
        boolean boolean14 = timeSeries9.isEmpty();
        org.jfree.data.time.TimeSeries timeSeries15 = timeSeries1.addAndOrUpdate(timeSeries9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries9", timeSeries1.equals(timeSeries9) ? timeSeries1.hashCode() == timeSeries9.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        java.util.Collection collection19 = timeSeries18.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        timeSeries18.removePropertyChangeListener(propertyChangeListener20);
        java.lang.Class class22 = null;
        timeSeries18.timePeriodClass = class22;
        java.util.List list24 = timeSeries18.data;
        org.jfree.data.time.TimeSeries timeSeries25 = timeSeries15.addAndOrUpdate(timeSeries18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries8 and timeSeries18", timeSeries8.equals(timeSeries18) ? timeSeries8.hashCode() == timeSeries18.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
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
        int int17 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection27 = timeSeries26.getTimePeriods();
        boolean boolean29 = timeSeries26.equals((java.lang.Object) 100.0d);
        timeSeries26.setNotify(true);
        java.lang.Class<?> wildcardClass32 = timeSeries26.getClass();
        org.jfree.data.time.TimeSeries timeSeries33 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries34 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, "hi!", "Value", (java.lang.Class) wildcardClass32);
        org.jfree.data.time.TimeSeries timeSeries35 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1L), (java.lang.Class) wildcardClass32);
        timeSeries1.timePeriodClass = wildcardClass32;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries7", timeSeries1.equals(timeSeries7) ? timeSeries1.hashCode() == timeSeries7.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        timeSeries11.removeAgedItems(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        timeSeries11.removeAgedItems((long) (byte) 1, true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 1);
        timeSeries47.setDescription("hi!");
        java.lang.Class<?> wildcardClass50 = timeSeries47.getClass();
        timeSeries45.timePeriodClass = wildcardClass50;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries26 and timeSeries45", timeSeries26.equals(timeSeries45) ? timeSeries26.hashCode() == timeSeries45.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection2 = timeSeries1.getTimePeriods();
        boolean boolean4 = timeSeries1.equals((java.lang.Object) 100.0d);
        timeSeries1.setNotify(true);
        java.util.Collection collection7 = timeSeries1.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        timeSeries1.removePropertyChangeListener(propertyChangeListener8);
        org.jfree.data.time.TimeSeries timeSeries11 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection12 = timeSeries11.getTimePeriods();
        java.lang.Class<?> wildcardClass13 = timeSeries11.getClass();
        timeSeries1.timePeriodClass = wildcardClass13;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries11", timeSeries1.equals(timeSeries11) ? timeSeries1.hashCode() == timeSeries11.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        org.jfree.data.time.TimeSeries timeSeries47 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int48 = timeSeries47.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries53 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries53.setRangeDescription("Value");
        java.lang.String str56 = timeSeries53.getDescription();
        java.util.List list57 = timeSeries53.data;
        org.jfree.data.time.TimeSeries timeSeries59 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        boolean boolean60 = timeSeries59.getNotify();
        int int61 = timeSeries59.getMaximumItemCount();
        java.util.List list62 = timeSeries59.data;
        java.util.Collection collection63 = timeSeries59.getTimePeriods();
        org.jfree.data.time.TimeSeries timeSeries64 = timeSeries53.addAndOrUpdate(timeSeries59);
        timeSeries53.setDescription("");
        java.lang.Class class67 = timeSeries53.timePeriodClass;
        java.lang.Class<?> wildcardClass68 = timeSeries53.getClass();
        org.jfree.data.time.TimeSeries timeSeries69 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 100, "hi!", "hi!", (java.lang.Class) wildcardClass68);
        timeSeries47.timePeriodClass = wildcardClass68;
        timeSeries9.timePeriodClass = wildcardClass68;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries9 and timeSeries34", timeSeries9.equals(timeSeries34) ? timeSeries9.hashCode() == timeSeries34.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        org.jfree.data.time.TimeSeries timeSeries56 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class57 = timeSeries56.timePeriodClass;
        java.util.List list58 = timeSeries56.getItems();
        timeSeries56.setDescription("Time");
        timeSeries56.setMaximumItemCount((int) (short) 1);
        java.beans.PropertyChangeListener propertyChangeListener63 = null;
        timeSeries56.removePropertyChangeListener(propertyChangeListener63);
        timeSeries56.setDomainDescription("hi!");
        org.jfree.data.time.TimeSeries timeSeries68 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        timeSeries68.setRangeDescription("Value");
        java.lang.String str71 = timeSeries68.getDescription();
        java.util.List list72 = timeSeries68.data;
        timeSeries68.setDescription("hi!");
        java.beans.PropertyChangeListener propertyChangeListener75 = null;
        timeSeries68.addPropertyChangeListener(propertyChangeListener75);
        org.jfree.data.time.TimeSeries timeSeries77 = timeSeries56.addAndOrUpdate(timeSeries68);
        org.jfree.data.time.TimeSeries timeSeries83 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection84 = timeSeries83.getTimePeriods();
        boolean boolean86 = timeSeries83.equals((java.lang.Object) 100.0d);
        timeSeries83.setNotify(true);
        java.lang.Class<?> wildcardClass89 = timeSeries83.getClass();
        org.jfree.data.time.TimeSeries timeSeries90 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (-1), "Value", "", (java.lang.Class) wildcardClass89);
        org.jfree.data.time.TimeSeries timeSeries91 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 'a', (java.lang.Class) wildcardClass89);
        timeSeries56.timePeriodClass = wildcardClass89;
        org.jfree.data.time.TimeSeries timeSeries93 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 10, (java.lang.Class) wildcardClass89);
        timeSeries52.timePeriodClass = wildcardClass89;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries34 and timeSeries90", timeSeries34.equals(timeSeries90) ? timeSeries34.hashCode() == timeSeries90.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        timeSeries34.fireSeriesChanged();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries31 and timeSeries34", timeSeries31.equals(timeSeries34) ? timeSeries31.hashCode() == timeSeries34.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        int int28 = timeSeries1.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries30 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection31 = timeSeries30.getTimePeriods();
        java.beans.PropertyChangeListener propertyChangeListener32 = null;
        timeSeries30.removePropertyChangeListener(propertyChangeListener32);
        java.lang.Class class34 = null;
        timeSeries30.timePeriodClass = class34;
        java.util.List list36 = timeSeries30.data;
        java.util.List list37 = timeSeries30.getItems();
        timeSeries1.data = list37;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries30", timeSeries1.equals(timeSeries30) ? timeSeries1.hashCode() == timeSeries30.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        org.jfree.data.time.TimeSeries timeSeries22 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class23 = timeSeries22.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries24 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class23);
        org.jfree.data.time.TimeSeries timeSeries26 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) -1);
        org.jfree.data.time.TimeSeries timeSeries27 = timeSeries24.addAndOrUpdate(timeSeries26);
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class30 = timeSeries29.timePeriodClass;
        timeSeries29.setDomainDescription("");
        timeSeries29.setKey((java.lang.Comparable) 100);
        timeSeries29.removeAgedItems((long) (byte) 1, false);
        java.util.Collection collection38 = timeSeries24.getTimePeriodsUniqueToOtherSeries(timeSeries29);
        java.lang.Class<?> wildcardClass39 = collection38.getClass();
        timeSeries1.timePeriodClass = wildcardClass39;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries13", timeSeries1.equals(timeSeries13) ? timeSeries1.hashCode() == timeSeries13.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        java.lang.Class class35 = timeSeries1.getTimePeriodClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries31 and timeSeries34", timeSeries31.equals(timeSeries34) ? timeSeries31.hashCode() == timeSeries34.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.jfree.data.time.TimeSeries timeSeries1 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class2 = timeSeries1.timePeriodClass;
        java.util.Collection collection3 = timeSeries1.getTimePeriods();
        timeSeries1.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries8 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class9 = timeSeries8.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries10 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class9);
        timeSeries10.setDescription("Value");
        org.jfree.data.time.TimeSeries timeSeries13 = timeSeries1.addAndOrUpdate(timeSeries10);
        long long14 = timeSeries1.getMaximumItemAge();
        org.jfree.data.time.TimeSeries timeSeries17 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.lang.Class class18 = timeSeries17.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries19 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (short) 1, class18);
        java.lang.Comparable comparable20 = timeSeries19.getKey();
        timeSeries19.removeAgedItems((long) 2147483647, false);
        java.lang.String str24 = timeSeries19.getDomainDescription();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        timeSeries19.addPropertyChangeListener(propertyChangeListener25);
        int int27 = timeSeries19.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries29 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) (byte) 10);
        int int30 = timeSeries29.getMaximumItemCount();
        org.jfree.data.time.TimeSeries timeSeries32 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection33 = timeSeries32.getTimePeriods();
        timeSeries32.setNotify(true);
        java.lang.Class class36 = timeSeries32.timePeriodClass;
        java.lang.Comparable comparable37 = timeSeries32.getKey();
        boolean boolean38 = timeSeries29.equals((java.lang.Object) timeSeries32);
        timeSeries32.removeAgedItems((long) 1, true);
        timeSeries32.setNotify(false);
        org.jfree.data.time.TimeSeries timeSeries44 = timeSeries19.addAndOrUpdate(timeSeries32);
        org.jfree.data.time.TimeSeries timeSeries51 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0f);
        java.util.Collection collection52 = timeSeries51.getTimePeriods();
        boolean boolean54 = timeSeries51.equals((java.lang.Object) 100.0d);
        timeSeries51.setMaximumItemCount((int) ' ');
        org.jfree.data.general.SeriesChangeListener seriesChangeListener57 = null;
        timeSeries51.addChangeListener(seriesChangeListener57);
        java.util.List list59 = timeSeries51.getItems();
        timeSeries51.setNotify(true);
        java.lang.Class class62 = timeSeries51.timePeriodClass;
        org.jfree.data.time.TimeSeries timeSeries63 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 9223372036854775807L, class62);
        org.jfree.data.time.TimeSeries timeSeries64 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) false, "Overwritten values from: 10.0", "Value", class62);
        org.jfree.data.time.TimeSeries timeSeries65 = new org.jfree.data.time.TimeSeries((java.lang.Comparable) 10.0d, class62);
        org.jfree.data.time.TimeSeries timeSeries66 = timeSeries19.addAndOrUpdate(timeSeries65);
        java.lang.Class<?> wildcardClass67 = timeSeries66.getClass();
        timeSeries1.timePeriodClass = wildcardClass67;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on timeSeries1 and timeSeries8", timeSeries1.equals(timeSeries8) ? timeSeries1.hashCode() == timeSeries8.hashCode() : true);
    }
}

