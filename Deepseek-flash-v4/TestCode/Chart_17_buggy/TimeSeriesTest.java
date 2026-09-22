package org.jfree.data.time;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Collection;
import java.util.List;

public class TimeSeriesTest {
    private TimeSeries series;

    @Before
    public void setUp() {
        series = new TimeSeries("Test Series");
    }

    @Test
    public void testConstructorDefaults() {
        assertEquals("Time", series.getDomainDescription());
        assertEquals("Value", series.getRangeDescription());
        assertEquals(Day.class, series.getTimePeriodClass());
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testGetItemCountEmptySeries() {
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testAddAndItemCount() {
        series.add(new Day(1, 1, 2024), 10.0);
        series.add(new Day(2, 1, 2024), 20.0);
        assertEquals(2, series.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullItem() {
        series.add(null);
    }

    @Test(expected = SeriesException.class)
    public void testAddWrongTimePeriodClass() {
        series.add(new TimeSeriesDataItem(new Hour(1, new Day(1, 1, 2024)), 10.0), false);
    }

    @Test
    public void testAddDuplicatePeriodThrowsSeriesException() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        try {
            series.add(day, 20.0);
            fail("Expected SeriesException for duplicate period");
        } catch (SeriesException e) {
            // expected
        }
    }

    @Test
    public void testAddOrUpdate() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        TimeSeriesDataItem result = series.addOrUpdate(day, 20.0);
        assertNotNull(result);
        assertEquals(10.0, result.getValue().doubleValue(), 0.0);
        assertEquals(20.0, series.getValue(day).doubleValue(), 0.0);
    }

    @Test
    public void testAddOrUpdateNewPeriod() {
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        series.add(day1, 10.0);
        TimeSeriesDataItem result = series.addOrUpdate(day2, 20.0);
        assertNull(result);
        assertEquals(2, series.getItemCount());
    }

    @Test
    public void testGetValueByIndex() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        assertEquals(10.0, series.getValue(0).doubleValue(), 0.0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueInvalidIndex() {
        series.getValue(0);
    }

    @Test
    public void testGetValueByPeriod() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        assertEquals(10.0, series.getValue(day).doubleValue(), 0.0);
    }

    @Test
    public void testGetValueNonExistentPeriod() {
        assertNull(series.getValue(new Day(1, 1, 2024))); 
    }

    @Test
    public void testDeleteByPeriod() {
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series.delete(day1);
        assertEquals(1, series.getItemCount());
        assertNull(series.getValue(day1));
    }

    @Test
    public void testDeleteByRange() {
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        Day day3 = new Day(3, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series.add(day3, 30.0);
        series.delete(0, 1);
        assertEquals(1, series.getItemCount());
        assertEquals(30.0, series.getValue(0).doubleValue(), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteInvalidRange() {
        series.delete(1, 0);
    }

    @Test
    public void testCreateCopy() throws CloneNotSupportedException {
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        TimeSeries copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
        assertEquals(series, copy);
    }

    @Test
    public void testCreateCopyByPeriod() throws CloneNotSupportedException {
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        Day day3 = new Day(3, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series.add(day3, 30.0);
        TimeSeries copy = series.createCopy(day1, day3);
        assertEquals(3, copy.getItemCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyInvalidStart() throws CloneNotSupportedException {
        series.createCopy(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCopyNullStart() throws CloneNotSupportedException {
        series.createCopy(null, new Day(1, 1, 2024));
    }

    @Test
    public void testEquals() {
        TimeSeries series2 = new TimeSeries("Test Series");
        series2.setDomainDescription(series.getDomainDescription());
        series2.setRangeDescription(series.getRangeDescription());
        series2.setMaximumItemAge(series.getMaximumItemAge());
        series2.setMaximumItemCount(series.getMaximumItemCount());
        assertEquals(series, series2);
    }

    @Test
    public void testEqualsDifferentObject() {
        assertFalse(series.equals("Test"));
        assertFalse(series.equals(null));
    }

    @Test
    public void testEqualsDifferentData() {
        TimeSeries series2 = new TimeSeries("Test Series");
        series.add(new Day(1, 1, 2024), 10.0);
        assertFalse(series.equals(series2));
    }

    @Test
    public void testHashCode() {
        TimeSeries series2 = new TimeSeries("Test Series");
        series2.setDomainDescription(series.getDomainDescription());
        series2.setRangeDescription(series.getRangeDescription());
        series2.setMaximumItemAge(series.getMaximumItemAge());
        series2.setMaximumItemCount(series.getMaximumItemCount());
        assertEquals(series.hashCode(), series2.hashCode());
    }

    @Test
    public void testClear() {
        series.add(new Day(1, 1, 2024), 10.0);
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testUpdate() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        series.update(day, 20.0);
        assertEquals(20.0, series.getValue(day).doubleValue(), 0.0);
    }

    @Test
    public void testUpdateByIndex() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        series.update(0, 25.0);
        assertEquals(25.0, series.getValue(0).doubleValue(), 0.0);
    }

    @Test(expected = SeriesException.class)
    public void testUpdateNonExistentPeriod() {
        series.update(new Day(2, 1, 2024), 20.0);
    }

    @Test
    public void testGetItems() {
        series.add(new Day(1, 1, 2024), 10.0);
        List items = series.getItems();
        assertEquals(1, items.size());
        assertNotNull(items);
        try {
            items.add(new TimeSeriesDataItem(new Day(2, 2, 2024), 89.0));
            fail("Expected UnsupportedOperationException for unmodifiable list");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testRemoveAgedItems() {
        series.setMaximumItemAge(5);
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(10, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        series.removeAgedItems(true);
        assertTrue(series.getItemCount() <= 1);
    }

    @Test
    public void testGetTimePeriod() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        assertEquals(day, series.getTimePeriod(0));
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
    public void testGetNextTimePeriod() {
        Day day = new Day(1, 1, 2024);
        series.add(day, 10.0);
        assertEquals(new Day(2, 1, 2024), series.getNextTimePeriod());
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() {
        TimeSeries series2 = new TimeSeries("Other");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        series.add(day1, 10.0);
        series2.add(day1, 5.0);
        series2.add(day2, 15.0);
        Collection unique = series2.getTimePeriodsUniqueToOtherSeries(series);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(day2));
    }

    @Test
    public void testGetIndex() {
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        series.add(day1, 10.0);
        series.add(day2, 20.0);
        assertEquals(0, series.getIndex(day1));
        assertEquals(1, series.getIndex(day2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndexNullPeriod() {
        series.getIndex(null);
    }

    @Test
    public void testAddAndOrUpdate() {
        TimeSeries series2 = new TimeSeries("Other");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        series.add(day1, 10.0);
        series2.add(day1, 5.0);
        series2.add(day2, 15.0);
        TimeSeries overwritten = series.addAndOrUpdate(series2);
        assertEquals(1, overwritten.getItemCount());
        assertEquals(5.0, series.getValue(day1).doubleValue(), 0.0);
        assertEquals(2, series.getItemCount());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        series.add(new Day(1, 1, 2024), 10.0);
        TimeSeries clone = (TimeSeries) series.clone();
        assertNotSame(series, clone);
        assertEquals(series, clone);
    }

    @Test
    public void testSetDomainDescription() {
        series.setDomainDescription("New Domain");
        assertEquals("New Domain", series.getDomainDescription());
    }

    @Test
    public void testSetRangeDescription() {
        series.setRangeDescription("New Range");
        assertEquals("New Range", series.getRangeDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemCountNegative() {
        series.setMaximumItemCount(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMaximumItemAgeNegative() {
        series.setMaximumItemAge(-1);
    }

    @Test
    public void testSetMaximumItemCountTrimming() {
        series.setMaximumItemCount(2);
        series.add(new Day(1, 1, 2024), 10.0);
        series.add(new Day(2, 1, 2024), 20.0);
        series.add(new Day(3, 1, 2024), 30.0);
        series.setMaximumItemCount(2);
        assertEquals(2, series.getItemCount());
        assertEquals(10.0, series.getValue(0).doubleValue(), 0.0);
        assertEquals(20.0, series.getValue(1).doubleValue(), 0.0);
    }
}