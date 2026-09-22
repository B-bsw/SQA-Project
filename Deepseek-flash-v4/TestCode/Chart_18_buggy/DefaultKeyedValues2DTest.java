package org.jfree.data;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class DefaultKeyedValues2DTest {

    private DefaultKeyedValues2D values2D;

    @Before
    public void setUp() {
        values2D = new DefaultKeyedValues2D();
    }

    @Test
    public void testConstructorDefault() {
        DefaultKeyedValues2D v2 = new DefaultKeyedValues2D();
        assertEquals(0, v2.getRowCount());
        assertEquals(0, v2.getColumnCount());
    }

    @Test
    public void testConstructorWithSortFlag() {
        DefaultKeyedValues2D v2 = new DefaultKeyedValues2D(true);
        assertEquals(0, v2.getRowCount());
        assertEquals(0, v2.getColumnCount());
        assertTrue(v2.getRowKeys().isEmpty());
        assertTrue(v2.getColumnKeys().isEmpty());
    }

    @Test
    public void testGetValueWithNullRowKey() {
        try {
            values2D.getValue(null, "column");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'rowKey' argument.", e.getMessage());
        }
    }

    @Test
    public void testGetValueWithNullColumnKey() {
        try {
            values2D.getValue("row", null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'columnKey' argument.", e.getMessage());
        }
    }

    @Test
    public void testGetValueWithUnknownColumnKey() {
        values2D.addValue(1, "row", "col");
        try {
            values2D.getValue("row", "unknown");
            fail("Expected UnknownKeyException");
        } catch (UnknownKeyException e) {
            assertTrue(e.getMessage().contains("Unrecognised columnKey"));
        }
    }

    @Test
    public void testGetValueWithUnknownRowKey() {
        values2D.addValue(1, "row", "col");
        try {
            values2D.getValue("unknown", "col");
            fail("Expected UnknownKeyException");
        } catch (UnknownKeyException e) {
            assertTrue(e.getMessage().contains("Unrecognised rowKey"));
        }
    }

    @Test
    public void testGetValueNormal() {
        values2D.addValue(10, "row1", "col1");
        values2D.addValue(20, "row2", "col2");
        assertEquals(10, values2D.getValue("row1", "col1").intValue());
        assertEquals(20, values2D.getValue("row2", "col2").intValue());
    }

    @Test
    public void testSetValueNewRowAndColumn() {
        values2D.setValue(5, "row1", "col1");
        assertEquals(1, values2D.getRowCount());
        assertEquals(1, values2D.getColumnCount());
        assertEquals(5, values2D.getValue(0, 0).intValue());
    }

    @Test
    public void testSetValueUpdateExisting() {
        values2D.setValue(5, "row1", "col1");
        values2D.setValue(10, "row1", "col1");
        assertEquals(1, values2D.getRowCount());
        assertEquals(1, values2D.getColumnCount());
        assertEquals(10, values2D.getValue(0, 0).intValue());
    }

    @Test
    public void testSetValueAddRowWhenSorted() {
        DefaultKeyedValues2D sorted = new DefaultKeyedValues2D(true);
        sorted.setValue(1, "b", "col");
        sorted.setValue(2, "a", "col");
        assertEquals(2, sorted.getRowCount());
        assertEquals("a", sorted.getRowKey(0));
        assertEquals("b", sorted.getRowKey(1));
    }

    @Test
    public void testAddValueNullValue() {
        values2D.addValue(null, "row", "col");
        assertNull(values2D.getValue("row", "col"));
    }

    @Test
    public void testRemoveValueSingleEntry() {
        values2D.addValue(1, "row", "col");
        values2D.removeValue("row", "col");
        assertEquals(0, values2D.getRowCount());
        assertEquals(0, values2D.getColumnCount());
    }

    @Test
    public void testRemoveValueRowStillHasValues() {
        values2D.addValue(1, "row", "col1");
        values2D.addValue(2, "row", "col2");
        values2D.removeValue("row", "col1");
        assertEquals(1, values2D.getRowCount());
        assertEquals(1, values2D.getColumnCount());
        assertEquals(2, values2D.getValue("row", "col2").intValue());
    }

    @Test
    public void testRemoveValueColumnStillHasValues() {
        values2D.addValue(1, "row1", "col");
        values2D.addValue(2, "row2", "col");
        values2D.removeValue("row1", "col");
        assertEquals(1, values2D.getRowCount());
        assertEquals(1, values2D.getColumnCount());
        assertEquals(2, values2D.getValue("row2", "col").intValue());
    }

    @Test
    public void testRemoveRowByIndex() {
        values2D.addValue(1, "row1", "col1");
        values2D.addValue(2, "row2", "col2");
        values2D.removeRow(0);
        assertEquals(1, values2D.getRowCount());
        assertEquals("row2", values2D.getRowKey(0));
    }

    @Test
    public void testRemoveRowByKey() {
        values2D.addValue(1, "row1", "col1");
        values2D.addValue(2, "row2", "col2");
        values2D.removeRow("row1");
        assertEquals(1, values2D.getRowCount());
        assertEquals(2, values2D.getValue("row2", "col2").intValue());
    }

    @Test
    public void testRemoveColumnByIndex() {
        values2D.addValue(1, "row", "col1");
        values2D.addValue(2, "row", "col2");
        values2D.removeColumn(0);
        assertEquals(1, values2D.getColumnCount());
        assertEquals("col2", values2D.getColumnKey(0));
    }

    @Test
    public void testClear() {
        values2D.addValue(1, "row", "col");
        values2D.clear();
        assertEquals(0, values2D.getRowCount());
        assertEquals(0, values2D.getColumnCount());
    }

    @Test
    public void testGetRowIndex() {
        values2D.addValue(1, "b", "col");
        values2D.addValue(2, "a", "col");
        assertEquals(1, values2D.getRowIndex("b"));
        assertEquals(0, values2D.getRowIndex("a"));
    }

    @Test
    public void testGetRowIndexNullKey() {
        try {
            values2D.getRowIndex(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Null 'key' argument.", e.getMessage());
        }
    }

    @Test
    public void testGetRowKey() {
        values2D.addValue(1, "row", "col");
        assertEquals("row", values2D.getRowKey(0));
    }

    @Test
    public void testGetColumnKey() {
        values2D.addValue(1, "row", "col");
        assertEquals("col", values2D.getColumnKey(0));
    }

    @Test
    public void testGetColumnIndex() {
        values2D.addValue(1, "row", "col1");
        values2D.addValue(2, "row", "col2");
        assertEquals(0, values2D.getColumnIndex("col1"));
        assertEquals(1, values2D.getColumnIndex("col2"));
        assertEquals(-1, values2D.getColumnIndex("col3"));
    }

    @Test
    public void testGetRowKeysUnmodifiable() {
        values2D.addValue(1, "row", "col");
        try {
            values2D.getRowKeys().add("newRow");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetColumnKeysUnmodifiable() {
        values2D.addValue(1, "row", "col");
        try {
            values2D.getColumnKeys().add("newCol");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testEqualsSameObject() {
        values2D.addValue(1, "row", "col");
        assertTrue(values2D.equals(values2D));
    }

    @Test
    public void testEqualsNull() {
        values2D.addValue(1, "row", "col");
        assertFalse(values2D.equals(null));
    }

    @Test
    public void testEqualsNonKeyedValues2D() {
        values2D.addValue(1, "row", "col");
        assertFalse(values2D.equals("not a table"));
    }

    @Test
    public void testEqualsDifferentRows() {
        DefaultKeyedValues2D v1 = new DefaultKeyedValues2D();
        DefaultKeyedValues2D v2 = new DefaultKeyedValues2D();
        v1.addValue(1, "row", "col");
        v2.addValue(2, "row", "col");
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEqualsDifferentColumns() {
        DefaultKeyedValues2D v1 = new DefaultKeyedValues2D();
        DefaultKeyedValues2D v2 = new DefaultKeyedValues2D();
        v1.addValue(1, "row", "col1");
        v2.addValue(1, "row", "col2");
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEqualsDifferentValues() {
        DefaultKeyedValues2D v1 = new DefaultKeyedValues2D();
        DefaultKeyedValues2D v2 = new DefaultKeyedValues2D();
        v1.addValue(1, "row", "col");
        v2.addValue(2, "row", "col");
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEqualsSameValues() {
        DefaultKeyedValues2D v1 = new DefaultKeyedValues2D();
        DefaultKeyedValues2D v2 = new DefaultKeyedValues2D();
        v1.addValue(1, "row", "col");
        v2.addValue(1, "row", "col");
        assertTrue(v1.equals(v2));
    }

    @Test
    public void testEqualsSingleRowDifferentColumnCount() {
        DefaultKeyedValues2D v1 = new DefaultKeyedValues2D();
        DefaultKeyedValues2D v2 = new DefaultKeyedValues2D();
        v1.addValue(1, "row", "col1");
        v2.addValue(1, "row", "col2");
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEqualsSingleColumnDifferentRowCount() {
        DefaultKeyedValues2D v1 = new DefaultKeyedValues2D();
        DefaultKeyedValues2D v2 = new DefaultKeyedValues2D();
        v1.addValue(1, "row1", "col");
        v2.addValue(1, "row2", "col");
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testHashCode() {
        values2D.addValue(1, "row", "col");
        assertNotNull(values2D.hashCode());
        DefaultKeyedValues2D v2 = new DefaultKeyedValues2D();
        v2.addValue(1, "row", "col");
        assertEquals(v2.hashCode(), values2D.hashCode());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        values2D.addValue(1, "row", "col");
        DefaultKeyedValues2D clone = (DefaultKeyedValues2D) values2D.clone();
        assertNotSame(values2D, clone);
        assertEquals(values2D.getRowCount(), clone.getRowCount());
        assertEquals(values2D.getColumnCount(), clone.getColumnCount());
        assertEquals(values2D.getValue(0, 0), clone.getValue(0, 0));
    }

    @Test
    public void testGetRowCountEmpty() {
        assertEquals(0, values2D.getRowCount());
    }

    @Test
    public void testGetColumnCountEmpty() {
        assertEquals(0, values2D.getColumnCount());
    }

    @Test
    public void testGetValueOutOfRangeRow() {
        values2D.addValue(1, "row", "col");
        try {
            values2D.getValue(5, 0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testRemoveRowIndexOutOfRange() {
        values2D.addValue(1, "row", "col");
        try {
            values2D.removeRow(5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testRemoveColumnIndexOutOfRange() {
        values2D.addValue(1, "row", "col");
        try {
            values2D.removeColumn(5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testRemoveColumnByKeyWithUnknownKey() {
        values2D.addValue(1, "row", "col");
        values2D.removeColumn("unknownKey");
        assertEquals(1, values2D.getColumnCount());
    }
}