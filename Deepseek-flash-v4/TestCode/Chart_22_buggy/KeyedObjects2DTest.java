package org.jfree.data;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class KeyedObjects2DTest {
    private KeyedObjects2D table;

    @Before
    public void setUp() {
        table = new KeyedObjects2D();
    }

    @Test
    public void testInitialState() {
        assertEquals(0, table.getRowCount());
        assertEquals(0, table.getColumnCount());
        assertTrue(table.getRowKeys().isEmpty());
        assertTrue(table.getColumnKeys().isEmpty());
    }

    @Test
    public void testSetObjectNewKeys() {
        table.setObject("Value1", "Row1", "Col1");
        assertEquals(1, table.getRowCount());
        assertEquals(1, table.getColumnCount());
        assertEquals("Value1", table.getObject("Row1", "Col1"));
        assertEquals("Value1", table.getObject(0, 0));
    }

    @Test
    public void testSetObjectMultipleRowsColumns() {
        table.setObject(1, "Row1", "Col1");
        table.setObject(2, "Row1", "Col2");
        table.setObject(3, "Row2", "Col1");
        table.setObject(4, "Row2", "Col2");
        
        assertEquals(2, table.getRowCount());
        assertEquals(2, table.getColumnCount());
        assertEquals(1, table.getObject(0, 0));
        assertEquals(4, table.getObject(1, 1));
    }

    @Test
    public void testSetObjectUpdateExisting() {
        table.setObject("Old", "Row1", "Col1");
        table.setObject("New", "Row1", "Col1");
        assertEquals("New", table.getObject("Row1", "Col1"));
        assertEquals(1, table.getRowCount());
        assertEquals(1, table.getColumnCount());
    }

    @Test
    public void testAddObject() {
        table.addObject("A", "Row1", "Col1");
        table.addObject("B", "Row1", "Col2");
        assertEquals(1, table.getRowCount());
        assertEquals(2, table.getColumnCount());
        assertEquals("A", table.getObject(0, 0));
        assertEquals("B", table.getObject(0, 1));
    }

    @Test
    public void testGetObjectByIndex() {
        table.setObject("Val", "R", "C");
        assertEquals("Val", table.getObject(0, 0));
        assertNull(table.getObject(0, 1));
        assertNull(table.getObject(1, 0));
    }

    @Test
    public void testGetObjectWithNullKeys() {
        try {
            table.getObject(null, "Col");
            fail("Expected IllegalArgumentException for null rowKey");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            table.getObject("Row", null);
            fail("Expected IllegalArgumentException for null columnKey");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetObjectWithUnknownKeys() {
        try {
            table.getObject("Unknown", "Column");
            fail("Expected UnknownKeyException");
        } catch (UnknownKeyException e) {
            // expected
        }
    }

    @Test
    public void testGetRowCount() {
        assertEquals(0, table.getRowCount());
        table.setObject("A", "R1", "C1");
        assertEquals(1, table.getRowCount());
        table.setObject("B", "R2", "C1");
        assertEquals(2, table.getRowCount());
    }

    @Test
    public void testGetColumnCount() {
        assertEquals(0, table.getColumnCount());
        table.setObject("A", "R1", "C1");
        assertEquals(1, table.getColumnCount());
        table.setObject("B", "R1", "C2");
        assertEquals(2, table.getColumnCount());
    }

    @Test
    public void testGetRowKey() {
        table.setObject("A", "Row1", "Col1");
        table.setObject("B", "Row2", "Col1");
        assertEquals("Row1", table.getRowKey(0));
        assertEquals("Row2", table.getRowKey(1));
    }

    @Test
    public void testGetRowIndex() {
        table.setObject("A", "Row1", "Col1");
        table.setObject("B", "Row2", "Col1");
        assertEquals(0, table.getRowIndex("Row1"));
        assertEquals(1, table.getRowIndex("Row2"));
        assertEquals(-1, table.getRowIndex("Unknown"));
    }

    @Test
    public void testGetRowKeys() {
        table.setObject("A", "R1", "C1");
        table.setObject("B", "R2", "C1");
        List keys = table.getRowKeys();
        assertEquals(2, keys.size());
        assertEquals("R1", keys.get(0));
        assertEquals("R2", keys.get(1));
    }

    @Test
    public void testGetColumnKey() {
        table.setObject("A", "Row1", "Col1");
        table.setObject("B", "Row1", "Col2");
        assertEquals("Col1", table.getColumnKey(0));
        assertEquals("Col2", table.getColumnKey(1));
    }

    @Test
    public void testGetColumnIndex() {
        table.setObject("A", "Row1", "Col1");
        table.setObject("B", "Row1", "Col2");
        assertEquals(0, table.getColumnIndex("Col1"));
        assertEquals(1, table.getColumnIndex("Col2"));
        assertEquals(-1, table.getColumnIndex("Unknown"));
    }

    @Test
    public void testGetColumnKeys() {
        table.setObject("A", "R1", "C1");
        table.setObject("B", "R1", "C2");
        List keys = table.getColumnKeys();
        assertEquals(2, keys.size());
        assertEquals("C1", keys.get(0));
        assertEquals("C2", keys.get(1));
    }

    @Test
    public void testRemoveColumnByKey() {
        table.setObject("A", "R1", "C1");
        table.setObject("B", "R1", "C2");
        table.setObject("C", "R2", "C1");
        table.setObject("D", "R2", "C2");
        
        table.removeColumn("C1");
        assertEquals(1, table.getColumnCount());
        assertNull(table.getObject("R1", "C1"));
        assertEquals("B", table.getObject("R1", "C2"));
        assertNull(table.getObject("R2", "C1"));
        assertEquals("D", table.getObject("R2", "C2"));
    }

    @Test
    public void testRemoveColumnByIndex() {
        table.setObject("A", "R1", "C1");
        table.setObject("B", "R1", "C2");
        table.removeColumn(0);
        assertEquals(1, table.getColumnCount());
        assertNull(table.getObject("R1", "C1"));
        assertEquals("B", table.getObject("R1", "C2"));
    }

    @Test
    public void testRemoveRowByKey() {
        table.setObject("A", "R1", "C1");
        table.setObject("B", "R2", "C1");
        table.removeRow("R1");
        assertEquals(1, table.getRowCount());
        assertNull(table.getObject("R1", "C1"));
        assertEquals("B", table.getObject("R2", "C1"));
    }

    @Test
    public void testRemoveRowByIndex() {
        table.setObject("A", "R1", "C1");
        table.setObject("B", "R2", "C1");
        table.removeRow(1);
        assertEquals(1, table.getRowCount());
        assertEquals("A", table.getObject("R1", "C1"));
        assertNull(table.getObject("R2", "C1"));
    }

    @Test
    public void testRemoveObjectLeavesEmptyRow() {
        table.setObject("A", "R1", "C1");
        table.setObject("B", "R2", "C1");
        table.removeObject("R1", "C1");
        assertEquals(1, table.getRowCount());
        assertEquals("B", table.getObject("R2", "C1"));
    }

    @Test
    public void testEqualsSameObject() {
        table.setObject("A", "R1", "C1");
        assertTrue(table.equals(table));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(table.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(table.equals("not a keyed object"));
    }

    @Test
    public void testEqualsDifferentRowKeys() {
        KeyedObjects2D table1 = new KeyedObjects2D();
        table1.setObject("A", "R1", "C1");
        KeyedObjects2D table2 = new KeyedObjects2D();
        table2.setObject("A", "R2", "C1");
        assertFalse(table1.equals(table2));
    }

    @Test
    public void testEqualsDifferentColumnKeys() {
        KeyedObjects2D table1 = new KeyedObjects2D();
        table1.setObject("A", "R1", "C1");
        KeyedObjects2D table2 = new KeyedObjects2D();
        table2.setObject("A", "R1", "C2");
        assertFalse(table1.equals(table2));
    }

    @Test
    public void testEqualsDifferentValues() {
        KeyedObjects2D table1 = new KeyedObjects2D();
        table1.setObject("A", "R1", "C1");
        KeyedObjects2D table2 = new KeyedObjects2D();
        table2.setObject("B", "R1", "C1");
        assertFalse(table1.equals(table2));
    }

    @Test
    public void testEqualsEmptyTables() {
        KeyedObjects2D table1 = new KeyedObjects2D();
        KeyedObjects2D table2 = new KeyedObjects2D();
        assertTrue(table1.equals(table2));
    }

    @Test
    public void testEqualsSameData() {
        KeyedObjects2D table1 = new KeyedObjects2D();
        table1.setObject("A", "R1", "C1");
        table1.setObject("B", "R2", "C2");
        KeyedObjects2D table2 = new KeyedObjects2D();
        table2.setObject("A", "R1", "C1");
        table2.setObject("B", "R2", "C2");
        assertTrue(table1.equals(table2));
    }

    @Test
    public void testHashCode() {
        KeyedObjects2D table1 = new KeyedObjects2D();
        table1.setObject("A", "R1", "C1");
        KeyedObjects2D table2 = new KeyedObjects2D();
        table2.setObject("A", "R1", "C1");
        assertEquals(table1.hashCode(), table2.hashCode());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        table.setObject("A", "R1", "C1");
        table.setObject("B", "R2", "C2");
        KeyedObjects2D clone = (KeyedObjects2D) table.clone();
        assertNotSame(table, clone);
        assertEquals(table, clone);
        assertEquals(table.getObject(0, 0), clone.getObject(0, 0));
        assertEquals(table.getObject(1, 1), clone.getObject(1, 1));
    }

    @Test
    public void testRemoveObjectKeyNotPresent() {
        table.setObject("A", "R1", "C1");
        table.removeObject("R1", "C1");
        // no exception expected, method should handle gracefully
        table.removeObject("R2", "C2");
    }
}