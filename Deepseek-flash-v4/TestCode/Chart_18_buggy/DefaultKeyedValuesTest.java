package org.jfree.data;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class DefaultKeyedValuesTest {

    private DefaultKeyedValues data;

    @Before
    public void setUp() {
        data = new DefaultKeyedValues();
    }

    @Test
    public void testInitialState() {
        assertEquals(0, data.getItemCount());
        assertEquals(0, data.getKeys().size());
        assertEquals(-1, data.getIndex("Nonexistent"));
    }

    @Test
    public void testAddValueAndGetValue() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.5);
        data.addValue("C", 3.0);
        assertEquals(3, data.getItemCount());
        assertEquals(1.0, data.getValue(0).doubleValue(), 0.0);
        assertEquals(2.5, data.getValue("B").doubleValue(), 0.0);
        assertEquals("C", data.getKey(2));
    }

    @Test
    public void testSetValueUpdate() {
        data.setValue("X", 10.0);
        data.setValue("X", 20.0);
        assertEquals(1, data.getItemCount());
        assertEquals(20.0, data.getValue("X").doubleValue(), 0.0);
        assertEquals(0, data.getIndex("X"));
    }

    @Test
    public void testSetValueNull() {
        data.setValue("Key", (Number) null);
        assertEquals(1, data.getItemCount());
        assertNull(data.getValue("Key"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIndexWithNullKey() {
        data.getIndex(null);
    }

    @Test(expected = UnknownKeyException.class)
    public void testGetValueWithUnknownKey() {
        data.getValue("Unknown");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetValueWithInvalidIndex() {
        data.getValue(0);
    }

    @Test
    public void testInsertValue() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.insertValue(1, "C", 3.0);
        assertEquals(3, data.getItemCount());
        assertEquals("C", data.getKey(1));
        assertEquals(3.0, data.getValue(1).doubleValue(), 0.0);
        assertEquals("B", data.getKey(2));
    }

    @Test
    public void testInsertValueAtEnd() {
        data.addValue("A", 1.0);
        data.insertValue(1, "B", 2.0);
        assertEquals(2, data.getItemCount());
        assertEquals("B", data.getKey(1));
    }

    @Test
    public void testInsertValueUpdateAtSamePosition() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.insertValue(0, "A", 100.0);
        assertEquals(2, data.getItemCount());
        assertEquals(100.0, data.getValue(0).doubleValue(), 0.0);
        assertEquals("A", data.getKey(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInsertValueOutOfBounds() {
        data.insertValue(1, "A", 1.0);
    }

    @Test
    public void testInsertValueMovesExistingKey() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.insertValue(1, "A", 3.0);
        assertEquals(2, data.getItemCount());
        assertEquals("A", data.getKey(1));
        assertEquals("B", data.getKey(0));
    }

    @Test
    public void testRemoveValueByIndex() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.addValue("C", 3.0);
        data.removeValue(1);
        assertEquals(2, data.getItemCount());
        assertEquals("C", data.getKey(1));
        assertEquals(-1, data.getIndex("B"));
    }

    @Test
    public void testRemoveValueByKey() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.removeValue("A");
        assertEquals(1, data.getItemCount());
        assertEquals("B", data.getKey(0));
    }

    @Test
    public void testRemoveValueUnknownKey() {
        data.addValue("A", 1.0);
        data.removeValue("Z"); // Should not throw
        assertEquals(1, data.getItemCount());
    }

    @Test
    public void testClear() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        data.clear();
        assertEquals(0, data.getItemCount());
        assertTrue(data.getKeys().isEmpty());
    }

    @Test
    public void testSortByKeysAscending() {
        data.addValue("B", 2.0);
        data.addValue("A", 1.0);
        data.addValue("C", 3.0);
        data.sortByKeys(org.jfree.chart.util.SortOrder.ASCENDING);
        assertEquals("A", data.getKey(0));
        assertEquals("B", data.getKey(1));
        assertEquals("C", data.getKey(2));
    }

    @Test
    public void testSortByKeysDescending() {
        data.addValue("B", 2.0);
        data.addValue("A", 1.0);
        data.addValue("C", 3.0);
        data.sortByKeys(org.jfree.chart.util.SortOrder.DESCENDING);
        assertEquals("C", data.getKey(0));
        assertEquals("B", data.getKey(1));
        assertEquals("A", data.getKey(2));
    }

    @Test
    public void testSortByValuesAscending() {
        data.addValue("B", 2.0);
        data.addValue("A", 1.0);
        data.addValue("C", 3.0);
        data.sortByValues(org.jfree.chart.util.SortOrder.ASCENDING);
        assertEquals("A", data.getKey(0));
        assertEquals(1.0, data.getValue(0).doubleValue(), 0.0);
    }

    @Test
    public void testSortByValuesDescendingWithNull() {
        data.addValue("B", 2.0);
        data.addValue("A", (Number) null);
        data.sortByValues(org.jfree.chart.util.SortOrder.DESCENDING);
        assertEquals("B", data.getKey(0));
        assertNull(data.getValue(1));
    }

    @Test
    public void testEquals() {
        data.addValue("A", 1.0);
        DefaultKeyedValues other = new DefaultKeyedValues();
        other.addValue("A", 1.0);
        assertEquals(data, other);
    }

    @Test
    public void testEqualsDifferentOrder() {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        DefaultKeyedValues other = new DefaultKeyedValues();
        other.addValue("B", 2.0);
        other.addValue("A", 1.0);
        assertNotEquals(data, other);
    }

    @Test
    public void testEqualsWithNullValue() {
        data.addValue("A", (Number) null);
        DefaultKeyedValues other = new DefaultKeyedValues();
        other.addValue("A", (Number) null);
        assertEquals(data, other);
    }

    @Test
    public void testEqualsSameObject() {
        assertEquals(data, data);
    }

    @Test
    public void testEqualsNonInstance() {
        assertNotEquals("Not a DefaultKeyedValues", data);
    }

    @Test
    public void testHashCode() {
        data.addValue("A", 1.0);
        DefaultKeyedValues other = new DefaultKeyedValues();
        other.addValue("A", 1.0);
        assertEquals(data.hashCode(), other.hashCode());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        data.addValue("A", 1.0);
        data.addValue("B", 2.0);
        DefaultKeyedValues cloned = (DefaultKeyedValues) data.clone();
        assertEquals(data, cloned);
        assertNotSame(data, cloned);
        data.removeValue("A");
        assertEquals(1, data.getItemCount());
        assertEquals(2, cloned.getItemCount());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveValueWithInvalidIndex() {
        data.removeValue(0);
    }
}