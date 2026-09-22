package org.jfree.data.time;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Collection;

public class TimeSeriesTest {

    @Test
    public void testGetItemCount() {
        TimeSeries ts = new TimeSeries("test");
        assertEquals(0, ts.getItemCount());
        ts.add(new Day(1, 1, 2024), 1.0);
        assertEquals(1, ts.getItemCount());
    }

    @Test
    public void testGetMaxItemCountDefault() {
        TimeSeries ts = new TimeSeries("test");
        assertEquals(Integer.MAX_VALUE, ts.getMaximumItemCount());
    }

    @Test
    public void testSetMaxItemCountWithNegative() {
        TimeSeries ts = new TimeSeries("test");
        try {
            ts.setMaximumItemCount(-1);
            fail("Expected IllegalArgumentException for negative count");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative 'maximum' argument.", e.getMessage());
        }
    }

    @Test
    public void testSetMaxItemCountTrimsData() {
        TimeSeries ts = new TimeSeries("test");
        ts.add(new Day(1, 1, 2024), 1.0);
        ts.add(new Day(2, 1, 2024), 2.0);
        ts.add(new Day(3, 1, 2024), 3.0);
        ts.setMaximumItemCount(2);
        assertEquals(2, ts.getItemCount());
        assertEquals(2.0, ts.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testSetMaxItemAgeNegative() {
        TimeSeries ts = new TimeSeries("test");
        try {
            ts.setMaximumItemAge(-1L);
            fail("Expected IllegalArgumentException for negative age");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative 'periods' argument.", e.getMessage());
        }
    }

    @Test
    public void testGetMinYInitialNaN() {
        TimeSeries ts = new TimeSeries("test");
        assertTrue(Double.isNaN(ts.getMinY()));
    }

    @Test
    public void testGetMaxYInitialNaN() {
        TimeSeries ts = new TimeSeries("test");
        assertTrue(Double.isNaN(ts.getMaxY()));
    }

    @Test
    public void testGetIndexWithNullPeriod() {
        TimeSeries ts = new TimeSeries("test");
        try {
            ts.getIndex((RegularTimePeriod) null);
            fail("Expected IllegalArgumentException for null period");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'period' argument.", e.getMessage());
        }
    }

    @Test
    public void testGetIndexWithExistingPeriod() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.add(day, 1.0);
        assertEquals(0, ts.getIndex(day));
    }

    @Test
    public void testGetValueByPeriod() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.add(day, 10.0);
        assertEquals(10.0, ts.getValue(day).doubleValue(), 0.0);
    }

    @Test
    public void testGetValueByIndex() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.add(day, 10.0);
        assertEquals(10.0, ts.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testAddNullItem() {
        TimeSeries ts = new TimeSeries("test");
        try {
            ts.add((TimeSeriesDataItem) null);
            fail("Expected IllegalArgumentException for null item");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'item' argument.", e.getMessage());
        }
    }

    @Test
    public void testAddFirstItemSetsTimePeriodClass() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.add(day, 1.0);
        assertEquals(day.getClass(), ts.getTimePeriodClass());
    }

    @Test
    public void testAddInOrderAtEnd() {
        TimeSeries ts = new TimeSeries("test");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        ts.add(day1, 1.0);
        ts.add(day2, 2.0);
        assertEquals(2, ts.getItemCount());
    }

    @Test
    public void testAddOutOfOrderInsert() {
        TimeSeries ts = new TimeSeries("test");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(3, 1, 2024);
        Day day3 = new Day(2, 1, 2024);
        ts.add(day1, 1.0);
        ts.add(day2, 3.0);
        ts.add(day3, 2.0);
        assertEquals(2.0, ts.getValue(day3).doubleValue(), 0.0);
    }

    @Test
    public void testAddDuplicatePeriodThrows() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.add(day, 1.0);
        try {
            ts.add(day, 2.0);
            fail("Expected SeriesException for duplicate period");
        } catch (SeriesException e) {
            assertTrue(e.getMessage().contains("Duplicate"));
        }
    }

    @Test
    public void testAddWithDifferentTimePeriodClassThrows() {
        TimeSeries ts = new TimeSeries("test");
        ts.add(new Day(1, 1, 2024), 1.0);
        try {
            ts.add(new Hour(1, new Day(1, 1, 2024)), 2.0);
            fail("Expected SeriesException for different time period class");
        } catch (SeriesException e) {
            assertTrue(e.getMessage().contains("expecting"));
        }
    }

    @Test
    public void testRemoveAgedItems() {
        TimeSeries ts = new TimeSeries("test");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        Day day3 = new Day(3, 1, 2024);
        ts.add(day1, 1.0);
        ts.add(day2, 2.0);
        ts.add(day3, 3.0);
        ts.setMaximumItemAge(1L);
        ts.removeAgedItems(true);
        assertEquals(2, ts.getItemCount());
        assertEquals(day2, ts.getTimePeriod(0));
    }

    @Test
    public void testRemoveAgedItemsWithEmptyData() {
        TimeSeries ts = new TimeSeries("test");
        ts.removeAgedItems(1L, true);
        assertEquals(0, ts.getItemCount());
    }

    @Test
    public void testClearWithData() {
        TimeSeries ts = new TimeSeries("test");
        ts.add(new Day(1, 1, 2024), 1.0);
        ts.clear();
        assertEquals(0, ts.getItemCount());
    }

    @Test
    public void testClearWithEmptyData() {
        TimeSeries ts = new TimeSeries("test");
        ts.clear();
        assertEquals(0, ts.getItemCount());
    }

    @Test
    public void testDeleteByPeriod() {
        TimeSeries ts = new TimeSeries("test");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        ts.add(day1, 1.0);
        ts.add(day2, 2.0);
        ts.delete(day1);
        assertEquals(1, ts.getItemCount());
        assertEquals(day2, ts.getTimePeriod(0));
    }

    @Test
    public void testDeleteRangeStartGreaterThanEnd() {
        TimeSeries ts = new TimeSeries("test");
        try {
            ts.delete(1, 0);
            fail("Expected IllegalArgumentException for start > end");
        } catch (IllegalArgumentException e) {
            assertEquals("Requires start <= end.", e.getMessage());
        }
    }

    @Test
    public void testCreateCopyStartNegative() {
        TimeSeries ts = new TimeSeries("test");
        try {
            ts.createCopy(-1, 0);
            fail("Expected IllegalArgumentException for negative start");
        } catch (IllegalArgumentException | CloneNotSupportedException e) {
            if (e instanceof IllegalArgumentException) {
                assertEquals("Requires start >= 0.", e.getMessage());
            } else {
                fail("Unexpected exception type");
            }
        }
    }

    @Test
    public void testCreateCopyNullStart() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.add(day, 1.0);
        try {
            ts.createCopy((RegularTimePeriod) null, day);
            fail("Expected IllegalArgumentException for null start");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'start' argument.", e.getMessage());
        } catch (CloneNotSupportedException e) {
            fail("Unexpected CloneNotSupportedException");
        }
    }

    @Test
    public void testCreateCopyWithStartAfterEnd() {
        TimeSeries ts = new TimeSeries("test");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        ts.add(day1, 1.0);
        ts.add(day2, 2.0);
        try {
            ts.createCopy(day2, day1);
            fail("Expected IllegalArgumentException for start > end");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("start on or before end"));
        } catch (CloneNotSupportedException e) {
            fail("Unexpected CloneNotSupportedException");
        }
    }

    @Test
    public void testCreateCopySubrange() throws CloneNotSupportedException {
        TimeSeries ts = new TimeSeries("test");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        Day day3 = new Day(3, 1, 2024);
        ts.add(day1, 1.0);
        ts.add(day2, 2.0);
        ts.add(day3, 3.0);
        TimeSeries copy = ts.createCopy(1, 2);
        assertEquals(2, copy.getItemCount());
        assertEquals(2.0, copy.getValue(0).doubleValue(), 0.0);
        assertEquals(3.0, copy.getValue(1).doubleValue(), 0.0);
    }

    @Test
    public void testEqualsSelf() {
        TimeSeries ts = new TimeSeries("test");
        assertTrue(ts.equals(ts));
    }

    @Test
    public void testEqualsNonSeries() {
        TimeSeries ts = new TimeSeries("test");
        assertFalse(ts.equals(new Object()));
    }

    @Test
    public void testEqualsSameData() {
        TimeSeries ts1 = new TimeSeries("test");
        TimeSeries ts2 = new TimeSeries("test");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(1, 1, 2024);
        ts1.add(day1, 1.0);
        ts2.add(day2, 1.0);
        assertTrue(ts1.equals(ts2));
    }

    @Test
    public void testEqualsDifferentDomainDescription() {
        TimeSeries ts1 = new TimeSeries("test", "Domain1", "Range");
        TimeSeries ts2 = new TimeSeries("test", "Domain2", "Range");
        assertFalse(ts1.equals(ts2));
    }

    @Test
    public void testEqualsDifferentRangeDescription() {
        TimeSeries ts1 = new TimeSeries("test", "Domain", "Range1");
        TimeSeries ts2 = new TimeSeries("test", "Domain", "Range2");
        assertFalse(ts1.equals(ts2));
    }

    @Test
    public void testUpdateExistingPeriod() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.add(day, 1.0);
        ts.update(day, 2.0);
        assertEquals(2.0, ts.getValue(day).doubleValue(), 0.0);
    }

    @Test
    public void testUpdateNonExistentPeriodThrows() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        try {
            ts.update(day, 2.0);
            fail("Expected SeriesException for non-existent period");
        } catch (SeriesException e) {
            assertTrue(e.getMessage().contains("no existing value"));
        }
    }

    @Test
    public void testAddOrUpdateNewItem() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.addOrUpdate(day, 1.0);
        assertEquals(1, ts.getItemCount());
        assertEquals(1.0, ts.getValue(day).doubleValue(), 0.0);
    }

    @Test
    public void testAddOrUpdateExistingItem() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.add(day, 1.0);
        TimeSeriesDataItem old = ts.addOrUpdate(day, 2.0);
        assertEquals(1, ts.getItemCount());
        assertEquals(2.0, ts.getValue(day).doubleValue(), 0.0);
        assertNotNull(old);
        assertEquals(1.0, old.getValue().doubleValue(), 0.0);
    }

    @Test
    public void testGetTimePeriodsUniqueToOtherSeries() {
        TimeSeries ts1 = new TimeSeries("ts1");
        TimeSeries ts2 = new TimeSeries("ts2");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        Day day3 = new Day(3, 1, 2024);
        ts1.add(day1, 1.0);
        ts1.add(day2, 2.0);
        ts2.add(day2, 2.0);
        ts2.add(day3, 3.0);
        Collection unique = ts1.getTimePeriodsUniqueToOtherSeries(ts2);
        assertEquals(1, unique.size());
        assertTrue(unique.contains(day1));
    }

    @Test
    public void testGetTimePeriodsEmpty() {
        TimeSeries ts = new TimeSeries("test");
        assertTrue(ts.getTimePeriods().isEmpty());
    }

    @Test
    public void testGetTimePeriodsWithData() {
        TimeSeries ts = new TimeSeries("test");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        ts.add(day1, 1.0);
        ts.add(day2, 2.0);
        Collection periods = ts.getTimePeriods();
        assertEquals(2, periods.size());
        assertTrue(periods.contains(day1));
        assertTrue(periods.contains(day2));
    }

    @Test
    public void testGetNextTimePeriodWithData() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.add(day, 1.0);
        RegularTimePeriod next = ts.getNextTimePeriod();
        assertNotNull(next);
        assertTrue(next.compareTo(day) > 0);
    }

    @Test
    public void testGetItemsUnmodifiable() {
        TimeSeries ts = new TimeSeries("test");
        Day day1 = new Day(1, 1, 2024);
        Day day2 = new Day(2, 1, 2024);
        ts.add(day1, 1.0);
        ts.add(day2, 2.0);
        List items = ts.getItems();
        assertEquals(2, items.size());
        try {
            items.add(new TimeSeriesDataItem(new Day(3,1,2024), 3.0));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    public void testGetDomainDescription() {
        TimeSeries ts = new TimeSeries("test", "Domain", "Range");
        assertEquals("Domain", ts.getDomainDescription());
    }

    @Test
    public void testSetDomainDescription() {
        TimeSeries ts = new TimeSeries("test");
        ts.setDomainDescription("NewDomain");
        assertEquals("NewDomain", ts.getDomainDescription());
    }

    @Test
    public void testGetRangeDescription() {
        TimeSeries ts = new TimeSeries("test", "Domain", "Range");
        assertEquals("Range", ts.getRangeDescription());
    }

    @Test
    public void testSetRangeDescription() {
        TimeSeries ts = new TimeSeries("test");
        ts.setRangeDescription("NewRange");
        assertEquals("NewRange", ts.getRangeDescription());
    }

    @Test
    public void testGetTimePeriodClassInitialNull() {
        TimeSeries ts = new TimeSeries("test");
        assertNull(ts.getTimePeriodClass());
    }

    @Test
    public void testGetDataItemClone() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.add(day, 1.0);
        TimeSeriesDataItem item = ts.getDataItem(0);
        item.setValue(10.0);
        assertEquals(1.0, ts.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testGetDataItemByPeriodFound() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.add(day, 1.0);
        assertNotNull(ts.getDataItem(day));
    }

    @Test
    public void testGetDataItemByPeriodNotFound() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.add(day, 1.0);
        assertNull(ts.getDataItem(new Day(2, 1, 2024)));
    }

    @Test
    public void testHashCodeDifferenceWithDifferentData() {
        TimeSeries ts1 = new TimeSeries("test");
        TimeSeries ts2 = new TimeSeries("test");
        assertNotSame(ts1.hashCode(), ts2.hashCode());
    }

    @Test
    public void testAddOrUpdateWithNumberOfItemsOverflow() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.setMaximumItemCount(1);
        ts.addOrUpdate(day, 1.0);
        Day day2 = new Day(2, 1, 2024);
        ts.add(day2, 2.0);
        assertEquals(1, ts.getItemCount());
        assertEquals(day2, ts.getTimePeriod(0));
    }

    @Test
    public void testUpdateWithNaNValue() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.add(day, 1.0);
        ts.update(day, Double.NaN);
        assertTrue(Double.isNaN(ts.getValue(day).doubleValue()));
    }

    @Test
    public void testGetValueNullValue() {
        TimeSeries ts = new TimeSeries("test");
        Day day = new Day(1, 1, 2024);
        ts.addOrUpdate(day, (Number) null);
        assertNull(ts.getValue(day));
    }
}