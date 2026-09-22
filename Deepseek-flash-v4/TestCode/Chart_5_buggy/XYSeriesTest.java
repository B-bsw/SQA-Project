package org.jfree.data.xy;

import org.junit.*;
import org.jfree.data.general.SeriesException;
import java.util.List;
import java.util.ArrayList;

public class XYSeriesTest {

    private XYSeries series;

    @Before
    public void setUp() {
        series = new XYSeries("Test Series");
    }

    @Test
    public void testConstructorWithKey() {
        XYSeries s = new XYSeries("Key");
        assertEquals("Key", s.getKey());
        assertEquals(0, s.getItemCount());
        assertTrue(s.getAutoSort());
        assertTrue(s.getAllowDuplicateXValues());
    }

    @Test
    public void testConstructorWithAutoSort() {
        XYSeries s = new XYSeries("Key", false);
        assertFalse(s.getAutoSort());
        assertTrue(s.getAllowDuplicateXValues());
    }

    @Test
    public void testConstructorWithAllParams() {
        XYSeries s = new XYSeries("Key", false, false);
        assertFalse(s.getAutoSort());
        assertFalse(s.getAllowDuplicateXValues());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullKey() {
        new XYSeries(null);
    }

    @Test
    public void testAddXYDataItem() {
        XYDataItem item = new XYDataItem(1.0, 2.0);
        series.add(item);
        assertEquals(1, series.getItemCount());
        assertEquals(item, series.getDataItem(0));
    }

    @Test
    public void testAddDoubleDouble() {
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        assertEquals(2, series.getItemCount());
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0);
        assertEquals(3.0, series.getY(1).doubleValue(), 0.0);
    }

    @Test
    public void testAddWithNullYValue() {
        series.add(1.0, null);
        assertEquals(1, series.getItemCount());
        assertNull(series.getY(0));
    }

    @Test
    public void testAddWithNotifyFalse() {
        series.add(1.0, 2.0, false);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAddWithDuplicateXValueAllowed() {
        series.add(1.0, 2.0);
        series.add(1.0, 5.0);
        assertEquals(2, series.getItemCount());
    }

    @Test(expected = SeriesException.class)
    public void testAddWithDuplicateXValueNotAllowed() {
        XYSeries s = new XYSeries("Key", true, false);
        s.add(1.0, 2.0);
        s.add(1.0, 5.0);
    }

    @Test
    public void testAddValueExceedsMaximumItemCount() {
        series.setMaximumItemCount(2);
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        assertEquals(2, series.getItemCount());
        assertEquals(2.0, series.getX(0).doubleValue(), 0.0);
    }

    @Test
    public void testGetItemCountEmpty() {
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testGetItems() {
        series.add(1.0, 2.0);
        List items = series.getItems();
        assertEquals(1, items.size());
        assertEquals(new XYDataItem(1.0, 2.0), items.get(0));
    }

    @Test
    public void testGetMaximumItemCountDefault() {
        assertEquals(Integer.MAX_VALUE, series.getMaximumItemCount());
    }

    @Test
    public void testSetMaximumItemCountWithRemoval() {
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        series.setMaximumItemCount(2);
        assertEquals(2, series.getItemCount());
        assertEquals(2.0, series.getX(0).doubleValue(), 0.0);
        assertEquals(3.0, series.getX(1).doubleValue(), 0.0);
    }

    @Test
    public void testSetMaximumItemCountNoRemoval() {
        series.add(1.0, 1.0);
        series.setMaximumItemCount(5);
        assertEquals(1, series.getItemCount());
    }

    @Test
    public void testAddOrUpdateWithUpdate() {
        series.addOrUpdate(1.0, 2.0);
        XYDataItem result = series.addOrUpdate(1.0, 3.0);
        assertNotNull(result);
        assertEquals(2.0, result.getY().doubleValue(), 0.0);
        assertEquals(1, series.getItemCount());
        assertEquals(3.0, series.getY(0).doubleValue(), 0.0);
    }

    @Test
    public void testAddOrUpdateWithAdd() {
        series.addOrUpdate(1.0, 2.0);
        assertEquals(1, series.getItemCount());
        assertEquals(2.0, series.getY(0).doubleValue(), 0.0);
    }

    @Test
    public void testAddOrUpdateNullX() {
        XYDataItem result = series.addOrUpdate(null, 3.0);
        assertNull(result);
    }

    @Test
    public void testAddOrUpdateNoDuplicateAllowed() {
        XYSeries s = new XYSeries("Key", true, false);
        s.add(1.0, 2.0);
        s.add(2.0, 4.0);
        XYDataItem result = s.addOrUpdate(1.0, 3.0);
        assertNotNull(result);
        assertEquals(2.0, result.getY().doubleValue(), 0.0);
        assertEquals(2, s.getItemCount());
        assertEquals(3.0, s.getY(0).doubleValue(), 0.0);
    }

    @Test
    public void testRemoveXYDataItem() {
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        XYDataItem removed = series.remove(0);
        assertNotNull(removed);
        assertEquals(1, series.getItemCount());
        assertEquals(2.0, series.getX(0).doubleValue(), 0.0);
    }

    @Test
    public void testRemoveByXValue() {
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        XYDataItem removed = series.remove(1.0);
        assertNotNull(removed);
        assertEquals(1, series.getItemCount());
        assertEquals(2.0, series.getX(0).doubleValue(), 0.0);
    }

    @Test
    public void testRemoveNonExistentXValue() {
        series.add(1.0, 2.0);
        XYDataItem removed = series.remove(2.0);
        assertNull(removed);
    }

    @Test
    public void testClear() {
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testClearEmptySeries() {
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void testGetDataItem() {
        series.add(1.0, 2.0);
        XYDataItem item = series.getDataItem(0);
        assertNotNull(item);
        assertEquals(1.0, item.getX().doubleValue(), 0.0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetDataItemOutOfBounds() {
        series.getDataItem(0);
    }

    @Test
    public void testGetX() {
        series.add(1.0, 2.0);
        assertEquals(1.0, series.getX(0).doubleValue(), 0.0);
    }

    @Test
    public void testGetY() {
        series.add(1.0, null);
        assertNull(series.getY(0));
        series.add(2.0, 3.0);
        assertEquals(3.0, series.getY(1).doubleValue(), 0.0);
    }

    @Test
    public void testUpdateByIndex() {
        series.add(1.0, 2.0);
        series.updateByIndex(0, 5.0);
        assertEquals(5.0, series.getY(0).doubleValue(), 0.0);
    }

    @Test
    public void testUpdate() {
        series.add(1.0, 2.0);
        series.update(1.0, 5.0);
        assertEquals(5.0, series.getY(0).doubleValue(), 0.0);
    }

    @Test(expected = SeriesException.class)
    public void testUpdateNonExistentX() {
        series.update(5.0, 5.0);
    }

    @Test
    public void testIndexOfWithNull() {
        series.add(1.0, 2.0);
        assertEquals(0, series.indexOf(new Double(1.0)));
        assertTrue(series.indexOf(new Double(5.0)) < 0);
    }

    @Test
    public void testIndexOfWithXYDataItem() {
        series.add(1.0, 2.0);
        series.add(3.0, 4.0);
        assertEquals(0, series.indexOf(new XYDataItem(1.0, 2.0)));
        assertEquals(1, series.indexOf(new XYDataItem(3.0, 4.0)));
        assertEquals(-1, series.indexOf(new XYDataItem(5.0, 6.0)));
    }

    @Test
    public void testToArray() {
        series.add(1.0, 2.0);
        series.add(3.0, null);
        double[][] result = series.toArray();
        assertEquals(2, result[0].length);
        assertEquals(1.0, result[0][0], 0.0);
        assertEquals(2.0, result[1][0], 0.0);
        assertTrue(Double.isNaN(result[1][1]));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        series.add(1.0, 2.0);
        Object clone = series.clone();
        assertTrue(clone instanceof XYSeries);
        XYSeries clonedSeries = (XYSeries) clone;
        assertEquals(series.getItemCount(), clonedSeries.getItemCount());
        assertEquals(series.getKey(), clonedSeries.getKey());
    }

    @Test
    public void testCreateCopy() {
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.add(3.0, 4.0);
        XYSeries copy = series.createCopy(0, 1);
        assertEquals(2, copy.getItemCount());
        assertEquals(1.0, copy.getX(0).doubleValue(), 0.0);
        assertEquals(2.0, copy.getX(1).doubleValue(), 0.0);
    }

    @Test
    public void testCreateCopySingleItem() {
        series.add(1.0, 2.0);
        XYSeries copy = series.createCopy(0, 0);
        assertEquals(1, copy.getItemCount());
    }

    @Test
    public void testEquals() {
        XYSeries s1 = new XYSeries("Series");
        s1.add(1.0, 1.0);
        XYSeries s2 = new XYSeries("Series");
        s2.add(1.0, 1.0);
        assertTrue(s1.equals(s2));
    }

    @Test
    public void testEqualsNotInstance() {
        assertFalse(series.equals(new Object()));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(series.equals(null));
    }

    @Test
    public void testEqualsDifferentKey() {
        XYSeries s1 = new XYSeries("Series 1");
        s1.add(1.0, 1.0);
        XYSeries s2 = new XYSeries("Series 2");
        s2.add(1.0, 1.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsDifferentAutoSort() {
        XYSeries s1 = new XYSeries("Series", true);
        s1.add(1.0, 1.0);
        XYSeries s2 = new XYSeries("Series", false);
        s2.add(1.0, 1.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsDifferentAllowDuplicate() {
        XYSeries s1 = new XYSeries("Series", true, true);
        s1.add(1.0, 1.0);
        XYSeries s2 = new XYSeries("Series", true, false);
        s2.add(1.0, 1.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testEqualsDifferentData() {
        XYSeries s1 = new XYSeries("Series");
        s1.add(1.0, 1.0);
        XYSeries s2 = new XYSeries("Series");
        s2.add(1.0, 2.0);
        assertFalse(s1.equals(s2));
    }

    @Test
    public void testHashCode() {
        XYSeries s1 = new XYSeries("Series");
        s1.add(1.0, 1.0);
        XYSeries s2 = new XYSeries("Series");
        s2.add(1.0, 1.0);
        assertEquals(s1.hashCode(), s2.hashCode());
    }

    @Test
    public void testGetAutoSort() {
        XYSeries s1 = new XYSeries("Series", true);
        assertTrue(s1.getAutoSort());
        s1.setAutoSort(false);
        assertFalse(s1.getAutoSort());
    }
}