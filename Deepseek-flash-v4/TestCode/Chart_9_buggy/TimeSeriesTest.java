package org.jfree.data.time;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TimeSeriesTest {

    private TimeSeries series;

    @Before
    public void setUp() {
        series = new TimeSeries("Test Series");
    }

    @Test
    public void testConstructor() {
        assertEquals("Time", series.getDomainDescription());
        assertEquals("Value", series.getRangeDescription());
        assertEquals(0, series.getItemCount());
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
        assertEquals(Long.MAX_VALUE, series.getMaximumItemAge());
        assertEquals(Day.class, series.getTimePeriodClass());
        assertNotNull(series.getItems());
        assertTrue(series.getItems().isEmpty());
    }

    @Test
    public void testConstructorWithTimePeriodClass() {
        TimeSeries s = new TimeSeries("Test", Month.class);
        assertEquals(Month.class, s.getTimePeriodClass());
    }

    @Test
    public void testDomainDescription() {
        series.setDomainDescription("Domain");
        assertEquals("Domain", series.getDomainDescription());
        series.setDomainDescription(null);
        assertNull(series.getDomainDescription());
    }

    @Test
    public void testRangeDescription() {
        series.setRangeDescription("Range");
        assertEquals("Range", series.getRangeDescription());
        series.setRangeDescription(null);
        assertNull(series.getRangeDescription());
    }

    @Test
    public void testSetMaximumItemCountNegative() {
        try {
            series.setMaximumItemCount(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetMaximumItemCountZero() {
        series.add(new Day(1, 1, 2024), 1.0);
        series.add(new Day(2, 1, 2024), 2.0);
        series.setMaximumItemCount(0);
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testSetMaximumItemCount() {
        series.add(new Day(1, 1, 2024), 1.0);
        series.add(new Day(2, 1, 2024), 2.0);
        series.setMaximumItemCount(1);
        assertEquals(1, series.getItemCount());
        assertEquals(new Day(2, 1, 2024), series.getTimePeriod(0));
    }

    @Test
    public void testSetMaximumItemAgeNegative() {
        try {
            series.setMaximumItemAge(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetDataItemByIndex() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        TimeSeriesDataItem item = series.getDataItem(0);
        assertEquals(day, item.getPeriod());
        assertEquals(10.0, item.getValue().doubleValue(), 0.0);
    }

    @Test
    public void testGetDataItemByPeriod() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        TimeSeriesDataItem item = series.getDataItem(day);
        assertNotNull(item);
        assertEquals(day, item.getPeriod());
    }

    @Test
    public void testGetDataItemByNonExistentPeriod() {
        Day day = new Day(1, 1, 2024);
        Day otherDay = new Day(2, 1, 2024);
        series.add(day, 10.0);
        assertNull(series.getDataItem(otherDay));
    }

    @Test
    public void testGetTimePeriod() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        assertEquals(day, series.getTimePeriod(0));
    }

    @Test
    public void testGetNextTimePeriod() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        RegularTimePeriod next = series.getNextTimePeriod();
        assertNotNull(next);
        assertEquals(new Day(2, 1, 2024), next);
    }

    @Test
    public void testGetTimePeriods() {
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        Collection periods = series.getTimePeriods();
        assertEquals(2, periods.size());
        assertTrue(periods.contains(day1));
        assertTrue(periods.contains(day2));
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() {
        TimeSeries series1 = new TimeSeries("Series1");
        TimeSeries series2 = new TimeSeries("Series2");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        Day day3 = new Day(3, 1, 2024);
        series1.add(day1, 10.0);
        series1.add(day2, 20.0);
        series2.add(day2, 30.0);
        series2.add(day3, 40.0);
        Collection unique = series1.getTimePeriodsUniqueToOtherSeries(series2);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(day1));
    }

    @Test
    public void testGetIndex() {
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        assertEquals(0, series.getIndex(day1));
        assertEquals(1, series.getIndex(day2));
        assertEquals(-2, series.getIndex(new Day(15, 1, 2024)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndexNull() {
        series.getIndex(null);
    }

    @Test
    public void testGetValueByIndex() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 42.5);
        assertEquals(42.5, series.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testGetValueByPeriod() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 42.5);
        assertEquals(42.5, series.getValue(day).doubleValue(), 0.0);
    }

    @Test
    public void testAddNullItem() {
        try {
            series.add((TimeSeriesDataItem) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddWrongTimePeriodClass() {
        try {
            series.add(new TimeSeriesDataItem(new Hour(1, new Day(1, 1, 2024)), 1.0));
            fail("Expected SeriesException");
        } catch (SeriesException e) {
            // expected
        }
    }

    @Test
    public void testAddDuplicatePeriod() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        try {
            series.add(day, 20.0);
            fail("Expected SeriesException");
        } catch (SeriesException e) {
            // expected
        }
    }

    @Test
    public void testAddOutOfOrder() {
        Day day1 = new Day(2, 1, 2024);
        Day day2 = new Day(1, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        assertEquals(2, series.getItemCount());
        assertEquals(day2, series.getTimePeriod(0));
        assertEquals(day1, series.getTimePeriod(1));
    }

    @Test
    public void testAddWithNotifyAndMaxCount() {
        series.setMaximumItemCount(1);
        series.add(new Day(1, 1, 2024), 10.0);
        series.add(new Day(2, 1, 2024), 20.0);
        assertEquals(1, series.getItemCount());
        assertEquals(new Day(2, 1, 2024), series.getTimePeriod(0));
    }

    @Test
    public void testAddOrUpdateNewPeriod() {
        Day day = new Day(1, 1, 2024);
        TimeSeriesDataItem overwritten = series.addOrUpdate(day, 10.0);
        assertNull(overwritten);
        assertEquals(1, series.getItemCount());
        assertEquals(10.0, series.getValue(day).doubleValue(), 0.0);
    }

    @Test
    public void testAddOrUpdateExistingPeriod() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        TimeSeriesDataItem overwritten = series.addOrUpdate(day, 20.0);
        assertNotNull(overwritten);
        assertEquals(10.0, overwritten.getValue().doubleValue(), 0.0);
        assertEquals(1, series.getItemCount());
        assertEquals(20.0, series.getValue(day).doubleValue(), 0.0);
    }

    @Test
    public void testAddAndOrUpdateWithOverwrite() {
        TimeSeries series2 = new TimeSeries("Series2");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series2.add(day1, 100.0);
        series2.add(new Day(3, 1, 2024), 300.0);
        TimeSeries overwritten = series.addAndOrUpdate(series2);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(10.0, overwritten.getValue(day1).doubleValue(), 0.0);
        assertEquals(3, series.getItemCount());
        assertEquals(100.0, series.getValue(day1).doubleValue(), 0.0);
    }

    @Test
    public void testUpdateByPeriod() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        series.update(day, 20.0);
        assertEquals(20.0, series.getValue(day).doubleValue(), 0.0);
    }

    @Test
    public void testUpdateByIndex() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        series.update(0, 20.0);
        assertEquals(20.0, series.getValue(day).doubleValue(), 0.0);
    }

    @Test
    public void testRemoveAgedItems() {
        series.setMaximumItemAge(2);
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        Day day3 = new Day(3, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series.add(day3, 30.0);
        series.removeAgedItems(true);
        assertEquals(2, series.getItemCount());
        assertEquals(day2, series.getTimePeriod(0));
        assertEquals(day3, series.getTimePeriod(1));
    }

    @Test
    public void testRemoveAgedItemsWithLatest() {
        series.setMaximumItemAge(2);
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series.removeAgedItems(2, true);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testClear() {
        series.add(new Day(1, 1, 2024), 10.0);
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testDeleteByPeriod() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        series.delete(day);
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testDeleteByRange() {
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        Day day3 = new Day(3, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series.add(day3, 30.0);
        series.delete(1, 2);
        assertEquals(1, series.getItemCount());
        assertEquals(day1, series.getTimePeriod(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteInvalidRange() {
        series.delete(1, 0);
    }

    @Test
    public void testCreateCopyRange() throws CloneNotSupportedException {
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        Day day3 = new Day(3, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series.add(day3, 30.0);
        TimeSeries copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
        assertEquals(day1, copy.getTimePeriod(0));
        assertEquals(day2, copy.getTimePeriod(1));
        assertEquals("Test Series", copy.getKey());
    }

    @Test
    public void testCreateCopyRangeByPeriod() throws CloneNotSupportedException {
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        Day day3 = new Day(3, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series.add(day3, 30.0);
        TimeSeries copy = series.createCopy(day1, day2);
        assertEquals(2, copy.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyStartAfterEnd() throws CloneNotSupportedException {
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        series.createCopy(day2, day1);
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        series.add(new Day(1, 1, 2024), 10.0);
        TimeSeries clone = (TimeSeries) series.clone();
        assertEquals(series, clone);
        assertFalse(series == clone);
    }

    @Test
    public void testEquals() {
        TimeSeries s1 = new TimeSeries("Same");
        TimeSeries s2 = new TimeSeries("Same");
        assertTrue(s1.equals(s2));
        s1.add(new Day(1, 1, 2024), 10.0);
        assertFalse(s1.equals(s2));
        s2.add(new Day(1, 1, 2024), 10.0);
        assertTrue(s1.equals(s2));
        s1.setDomainDescription("Different");
        assertFalse(s1.equals(s2));
        s1.setDomainDescription("Time");
        s1.setRangeDescription("Different");
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(series.equals(null));
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(series.equals(series));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(series.equals("Not a TimeSeries"));
    }

    @Test
    public void testHashCode() {
        TimeSeries s1 = new TimeSeries("Same");
        TimeSeries s2 = new TimeSeries("Same");
        assertEquals(s1.hashCode(), s2.hashCode());
    }

    @Test
    public void testGetItemsUnmodifiable() {
        series.add(new Day(1, 1, 2024), 10.0);
        List items = series.getItems();
        try {
            items.clear();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
}