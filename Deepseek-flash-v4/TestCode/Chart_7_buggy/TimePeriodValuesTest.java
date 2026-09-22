package org.jfree.data.time;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jfree.data.general.SeriesChangeEvent;
import org.jfree.data.general.SeriesChangeListener;
import java.util.Date;

public class TimePeriodValuesTest {

    private TimePeriodValues series;
    private SeriesChangeListener listener;
    private boolean eventFired;
    private SeriesChangeEvent lastEvent;

    @Before
    public void setUp() {
        series = new TimePeriodValues("Test Series");
        listener = new SeriesChangeListener() {
            @Override
            public void seriesChanged(SeriesChangeEvent event) {
                eventFired = true;
                lastEvent = event;
            }
        };
        series.addChangeListener(listener);
        eventFired = false;
        lastEvent = null;
    }

    @After
    public void tearDown() {
        series.removeChangeListener(listener);
    }

    @Test
    public void testConstructorWithName() {
        assertEquals("Test Series", series.getKey());
        assertEquals("Time", series.getDomainDescription());
        assertEquals("Value", series.getRangeDescription());
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testConstructorWithDomainAndRange() {
        TimePeriodValues custom = new TimePeriodValues("Test", "Domain", "Range");
        assertEquals("Domain", custom.getDomainDescription());
        assertEquals("Range", custom.getRangeDescription());
    }

    @Test
    public void testConstructorWithNullName() {
        try {
            new TimePeriodValues(null);
            fail("Expected IllegalArgumentException for null name");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetSetDomainDescription() {
        assertEquals("Time", series.getDomainDescription());
        series.setDomainDescription("New Domain");
        assertEquals("New Domain", series.getDomainDescription());
        assertTrue(eventFired);
    }

    @Test
    public void testGetSetRangeDescription() {
        assertEquals("Value", series.getRangeDescription());
        series.setRangeDescription("New Range");
        assertEquals("New Range", series.getRangeDescription());
        assertTrue(eventFired);
    }

    @Test
    public void testSetDomainDescriptionWithNull() {
        series.setDomainDescription(null);
        assertNull(series.getDomainDescription());
    }

    @Test
    public void testSetRangeDescriptionWithNull() {
        series.setRangeDescription(null);
        assertNull(series.getRangeDescription());
    }

    @Test
    public void testAddItemAndGetItemCount() {
        TimePeriod period = new SimpleTimePeriod(1000, 2000);
        series.add(period, 10.5);
        assertEquals(1, series.getItemCount());
        TimePeriodValue item = series.getDataItem(0);
        assertNotNull(item);
        assertEquals(period, item.getPeriod());
        assertEquals(10.5, item.getValue().doubleValue(), 0.0001);
    }

    @Test
    public void testAddMultipleItems() {
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p2 = new SimpleTimePeriod(3000, 4000);
        TimePeriod p3 = new SimpleTimePeriod(5000, 6000);
        series.add(p1, 10);
        series.add(p2, 20);
        series.add(p3, 30);
        assertEquals(3, series.getItemCount());
        assertTrue(eventFired);
    }

    @Test
    public void testAddItemWithNullPeriod() {
        try {
            series.add((TimePeriod) null, 10.0);
            fail("Expected IllegalArgumentException for null period");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddItemWithNullTimePeriodValue() {
        try {
            series.add((TimePeriodValue) null);
            fail("Expected IllegalArgumentException for null item");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAddItemWithNumberValue() {
        TimePeriod period = new SimpleTimePeriod(1000, 2000);
        series.add(period, Double.valueOf(42.5));
        assertEquals(1, series.getItemCount());
        assertEquals(42.5, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testAddItemWithNullNumberValue() {
        TimePeriod period = new SimpleTimePeriod(1000, 2000);
        series.add(period, (Number) null);
        assertEquals(1, series.getItemCount());
        assertNull(series.getValue(0));
    }

    @Test
    public void testGetDataItemByIndex() {
        TimePeriod period = new SimpleTimePeriod(1000, 2000);
        series.add(period, 15.5);
        TimePeriodValue item = series.getDataItem(0);
        assertEquals(period, item.getPeriod());
        assertEquals(15.5, item.getValue().doubleValue(), 0.0001);
    }

    @Test
    public void testGetDataItemOutOfBounds() {
        try {
            series.getDataItem(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testGetTimePeriod() {
        TimePeriod period = new SimpleTimePeriod(1000, 2000);
        series.add(period, 1.0);
        assertEquals(period, series.getTimePeriod(0));
    }

    @Test
    public void testGetValue() {
        TimePeriod period = new SimpleTimePeriod(1000, 2000);
        series.add(period, 99.99);
        assertEquals(99.99, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testGetValueNull() {
        TimePeriod period = new SimpleTimePeriod(1000, 2000);
        series.add(period, (Number) null);
        assertNull(series.getValue(0));
    }

    @Test
    public void testUpdateValue() {
        TimePeriod period = new SimpleTimePeriod(1000, 2000);
        series.add(period, 10.0);
        series.update(0, 20.0);
        assertEquals(20.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testUpdateValueAtInvalidIndex() {
        TimePeriod period = new SimpleTimePeriod(1000, 2000);
        series.add(period, 10.0);
        try {
            series.update(5, 15.0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testDeleteItems() {
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p2 = new SimpleTimePeriod(3000, 4000);
        TimePeriod p3 = new SimpleTimePeriod(5000, 6000);
        series.add(p1, 10);
        series.add(p2, 20);
        series.add(p3, 30);
        series.delete(0, 1);
        assertEquals(1, series.getItemCount());
        assertEquals(30.0, series.getValue(0).doubleValue(), 0.0001);
    }

    @Test
    public void testDeleteAllItems() {
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p2 = new SimpleTimePeriod(3000, 4000);
        series.add(p1, 10);
        series.add(p2, 20);
        series.delete(0, 1);
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testDeleteOutOfBounds() {
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        series.add(p1, 10);
        try {
            series.delete(0, 5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testGetMinStartIndex() {
        assertEquals(-1, series.getMinStartIndex());
        TimePeriod p1 = new SimpleTimePeriod(3000, 4000);
        TimePeriod p2 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p3 = new SimpleTimePeriod(2000, 3000);
        series.add(p1, 10);
        series.add(p2, 20);
        series.add(p3, 30);
        assertEquals(1, series.getMinStartIndex());
    }

    @Test
    public void testGetMaxStartIndex() {
        assertEquals(-1, series.getMaxStartIndex());
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p2 = new SimpleTimePeriod(3000, 4000);
        TimePeriod p3 = new SimpleTimePeriod(2000, 3000);
        series.add(p1, 10);
        series.add(p2, 20);
        series.add(p3, 30);
        assertEquals(1, series.getMaxStartIndex());
    }

    @Test
    public void testGetMinMiddleIndex() {
        assertEquals(-1, series.getMinMiddleIndex());
        TimePeriod p1 = new SimpleTimePeriod(1000, 3000);
        TimePeriod p2 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p3 = new SimpleTimePeriod(3000, 4000);
        series.add(p1, 10);
        series.add(p2, 20);
        series.add(p3, 30);
        assertEquals(1, series.getMinMiddleIndex());
    }

    @Test
    public void testGetMaxMiddleIndex() {
        assertEquals(-1, series.getMaxMiddleIndex());
        TimePeriod p1 = new SimpleTimePeriod(1000, 3000);
        TimePeriod p2 = new SimpleTimePeriod(2000, 4000);
        TimePeriod p3 = new SimpleTimePeriod(1000, 2000);
        series.add(p1, 10);
        series.add(p2, 20);
        series.add(p3, 30);
        assertEquals(1, series.getMaxMiddleIndex());
    }

    @Test
    public void testGetMinEndIndex() {
        assertEquals(-1, series.getMinEndIndex());
        TimePeriod p1 = new SimpleTimePeriod(3000, 5000);
        TimePeriod p2 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p3 = new SimpleTimePeriod(2000, 3000);
        series.add(p1, 10);
        series.add(p2, 20);
        series.add(p3, 30);
        assertEquals(1, series.getMinEndIndex());
    }

    @Test
    public void testGetMaxEndIndex() {
        assertEquals(-1, series.getMaxEndIndex());
        TimePeriod p1 = new SimpleTimePeriod(3000, 5000);
        TimePeriod p2 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p3 = new SimpleTimePeriod(2000, 6000);
        series.add(p1, 10);
        series.add(p2, 20);
        series.add(p3, 30);
        assertEquals(2, series.getMaxEndIndex());
    }

    @Test
    public void testBoundaryIndexesAfterDeletion() {
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p2 = new SimpleTimePeriod(300, 400);
        TimePeriod p3 = new SimpleTimePeriod(5000, 6000);
        TimePeriod p4 = new SimpleTimePeriod(2000, 3000);
        series.add(p1, 10);
        series.add(p2, 20);
        series.add(p3, 30);
        series.add(p4, 40);
        series.delete(0, 0);
        assertEquals(0, series.getMinStartIndex());
        assertEquals(1, series.getMaxStartIndex());
        assertEquals(0, series.getMinEndIndex());
        assertEquals(1, series.getMaxEndIndex());
    }

    @Test
    public void testAddItemFiresChangeEvent() {
        TimePeriod period = new SimpleTimePeriod(1000, 2000);
        assertFalse(eventFired);
        series.add(period, 10.0);
        assertTrue(eventFired);
        assertNotNull(lastEvent);
    }

    @Test
    public void testEquals() {
        TimePeriodValues series1 = new TimePeriodValues("Test");
        TimePeriodValues series2 = new TimePeriodValues("Test");
        assertTrue(series1.equals(series2));
        assertFalse(series1.equals(null));
        assertFalse(series1.equals("Not a TimePeriodValues"));
        assertTrue(series1.equals(series1));
    }

    @Test
    public void testEqualsWithDifferentData() {
        TimePeriodValues series1 = new TimePeriodValues("Test");
        TimePeriodValues series2 = new TimePeriodValues("Test");
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p2 = new SimpleTimePeriod(2000, 3000);
        series1.add(p1, 1);
        series2.add(p2, 2);
        assertFalse(series1.equals(series2));
    }

    @Test
    public void testEqualsWithDifferentDomain() {
        TimePeriodValues series1 = new TimePeriodValues("Test", "Domain1", "Range");
        TimePeriodValues series2 = new TimePeriodValues("Test", "Domain2", "Range");
        assertFalse(series1.equals(series2));
    }

    @Test
    public void testEqualsWithDifferentRange() {
        TimePeriodValues series1 = new TimePeriodValues("Test", "Domain", "Range1");
        TimePeriodValues series2 = new TimePeriodValues("Test", "Domain", "Range2");
        assertFalse(series1.equals(series2));
    }

    @Test
    public void testEqualsWithDifferentNames() {
        TimePeriodValues series1 = new TimePeriodValues("Test1");
        TimePeriodValues series2 = new TimePeriodValues("Test2");
        assertFalse(series1.equals(series2));
        assertFalse(series1.equals(new Object()));
    }

    @Test
    public void testClone() {
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p2 = new SimpleTimePeriod(3000, 4000);
        series.add(p1, 10.0);
        series.add(p2, 20.0);
        try {
            Object cloned = series.clone();
            assertNotNull(cloned);
            assertNotSame(series, cloned);
            TimePeriodValues clonedSeries = (TimePeriodValues) cloned;
            assertEquals(series.getItemCount(), clonedSeries.getItemCount());
            assertTrue(series.equals(clonedSeries));
        } catch (CloneNotSupportedException e) {
            fail("Clone not supported");
        }
    }

    @Test
    public void testCreateCopy() {
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p2 = new SimpleTimePeriod(3000, 4000);
        TimePeriod p3 = new SimpleTimePeriod(5000, 6000);
        series.add(p1, 10);
        series.add(p2, 20);
        series.add(p3, 30);
        TimePeriodValues copy = series.createCopy(0, 1);
        assertNotNull(copy);
        assertEquals(2, copy.getItemCount());
        assertEquals(10.0, copy.getValue(0).doubleValue(), 0.0001);
        assertEquals(20.0, copy.getValue(1).doubleValue(), 0.0001);
    }

    @Test
    public void testCreateCopyAll() {
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p2 = new SimpleTimePeriod(3000, 4000);
        series.add(p1, 10);
        series.add(p2, 20);
        TimePeriodValues copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
        assertTrue(series.equals(copy));
    }

    @Test
    public void testCreateCopyWithInvalidRange() {
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        series.add(p1, 10);
        try {
            series.createCopy(1, 0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testCreateCopyWithNegativeIndices() {
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        series.add(p1, 10);
        try {
            series.createCopy(-1, 0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAddMultipleSingleItemBounds() {
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        series.add(p1, 10);
        assertEquals(0, series.getMinStartIndex());
        assertEquals(0, series.getMaxStartIndex());
        assertEquals(0, series.getMinMiddleIndex());
        assertEquals(0, series.getMaxMiddleIndex());
        assertEquals(0, series.getMinEndIndex());
        assertEquals(0, series.getMaxEndIndex());
    }

    @Test
    public void testAddAllSameStartDifferentEnds() {
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p2 = new SimpleTimePeriod(1000, 3000);
        TimePeriod p3 = new SimpleTimePeriod(1000, 1500);
        series.add(p1, 10);
        series.add(p2, 20);
        series.add(p3, 30);
        assertEquals(0, series.getMinStartIndex());
        assertEquals(0, series.getMaxStartIndex());
        assertEquals(2, series.getMinEndIndex());
        assertEquals(1, series.getMaxEndIndex());
    }

    @Test
    public void testAddAllSameEndsDifferentStarts() {
        TimePeriod p1 = new SimpleTimePeriod(1000, 2000);
        TimePeriod p2 = new SimpleTimePeriod(500, 2000);
        TimePeriod p3 = new SimpleTimePeriod(1500, 2000);
        series.add(p1, 10);
        series.add(p2, 20);
        series.add(p3, 30);
        assertEquals(1, series.getMinStartIndex());
        assertEquals(2, series.getMaxStartIndex());
        assertEquals(0, series.getMinEndIndex());
        assertEquals(0, series.getMaxEndIndex());
    }
}