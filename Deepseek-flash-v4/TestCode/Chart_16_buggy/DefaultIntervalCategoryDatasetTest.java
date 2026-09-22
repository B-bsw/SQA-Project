package org.jfree.data.category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.jfree.data.UnknownKeyException;
import org.junit.Before;
import org.junit.Test;

public class DefaultIntervalCategoryDatasetTest {

    private DefaultIntervalCategoryDataset dataset;
    private static final Number[][] START_DATA = {{1.0, 2.0}, {3.0, 4.0}};
    private static final Number[][] END_DATA = {{1.5, 2.5}, {3.5, 4.5}};
    private static final Comparable[] SERIES_KEYS = {"S1", "S2"};
    private static final Comparable[] CATEGORY_KEYS = {"C1", "C2"};

    @Before
    public void setUp() {
        dataset = new DefaultIntervalCategoryDataset(SERIES_KEYS, CATEGORY_KEYS, START_DATA, END_DATA);
    }

    @Test
    public void testConstructorWithNullKeys() {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset((Comparable[]) null, null, START_DATA, END_DATA);
        assertEquals(2, d.getSeriesCount());
        assertEquals(2, d.getCategoryCount());
        assertNotNull(d.getRowKey(0));
        assertNotNull(d.getColumnKey(0));
    }

    @Test
    public void testConstructorWithMismatchedSeriesCount() {
        try {
            new DefaultIntervalCategoryDataset(new Number[][]{{1.0}}, new Number[][]{{1.0}, {2.0}});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithMismatchedCategoryCount() {
        try {
            new DefaultIntervalCategoryDataset(new Number[][]{{1.0, 2.0}}, new Number[][]{{1.0}});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithNullData() {
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset((Number[][]) null, null);
        assertEquals(0, d.getSeriesCount());
        assertEquals(0, d.getCategoryCount());
    }

    @Test
    public void testConstructorWithSeriesKeyMismatch() {
        try {
            new DefaultIntervalCategoryDataset(new Comparable[]{"S1"}, null, START_DATA, END_DATA);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithCategoryKeyMismatch() {
        try {
            new DefaultIntervalCategoryDataset(null, new Comparable[]{"C1"}, START_DATA, END_DATA);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetSeriesCount() {
        assertEquals(2, dataset.getSeriesCount());
        DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset((Number[][]) null, null);
        assertEquals(0, empty.getSeriesCount());
    }

    @Test
    public void testGetSeriesIndex() {
        assertEquals(0, dataset.getSeriesIndex("S1"));
        assertEquals(1, dataset.getSeriesIndex("S2"));
        assertEquals(-1, dataset.getSeriesIndex("S3"));
    }

    @Test
    public void testGetSeriesKey() {
        assertEquals("S1", dataset.getSeriesKey(0));
        assertEquals("S2", dataset.getSeriesKey(1));
        try {
            dataset.getSeriesKey(2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.getSeriesKey(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetSeriesKeys() {
        Comparable[] newKeys = {"A", "B"};
        dataset.setSeriesKeys(newKeys);
        assertSame(newKeys, dataset.seriesKeys);
        try {
            dataset.setSeriesKeys(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.setSeriesKeys(new Comparable[]{"A"});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetCategoryCount() {
        assertEquals(2, dataset.getCategoryCount());
        DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset((Number[][]) null, null);
        assertEquals(0, empty.getCategoryCount());
    }

    @Test
    public void testGetColumnKeys() {
        List keys = dataset.getColumnKeys();
        assertEquals(2, keys.size());
        try {
            keys.add("C3");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        DefaultIntervalCategoryDataset nullData = new DefaultIntervalCategoryDataset((Number[][]) null, null);
        assertNotNull(nullData.getColumnKeys());
        assertEquals(0, nullData.getColumnKeys().size());
    }

    @Test
    public void testSetCategoryKeys() {
        Comparable[] newKeys = {"X", "Y"};
        dataset.setCategoryKeys(newKeys);
        assertSame(newKeys, dataset.categoryKeys);
        try {
            dataset.setCategoryKeys(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.setCategoryKeys(new Comparable[]{"A"});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.setCategoryKeys(new Comparable[]{"A", null});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetValueByKey() {
        assertEquals(1.5, dataset.getValue("S1", "C1"));
        assertEquals(2.5, dataset.getValue("S1", "C2"));
        assertEquals(3.5, dataset.getValue("S2", "C1"));
        assertEquals(4.5, dataset.getValue("S2", "C2"));
        try {
            dataset.getValue("S3", "C1");
            fail("Expected UnknownKeyException");
        } catch (UnknownKeyException e) {
            // expected
        }
        try {
            dataset.getValue("S1", "C3");
            fail("Expected UnknownKeyException");
        } catch (UnknownKeyException e) {
            // expected
        }
    }

    @Test
    public void testGetValueByIndex() {
        assertEquals(1.5, dataset.getValue(0, 0));
        assertEquals(2.5, dataset.getValue(0, 1));
        assertEquals(3.5, dataset.getValue(1, 0));
        assertEquals(4.5, dataset.getValue(1, 1));
    }

    @Test
    public void testGetStartValueByKey() {
        assertEquals(1.0, dataset.getStartValue("S1", "C1"));
        assertEquals(2.0, dataset.getStartValue("S1", "C2"));
        assertEquals(3.0, dataset.getStartValue("S2", "C1"));
        assertEquals(4.0, dataset.getStartValue("S2", "C2"));
        try {
            dataset.getStartValue("S3", "C1");
            fail("Expected UnknownKeyException");
        } catch (UnknownKeyException e) {
            // expected
        }
        try {
            dataset.getStartValue("S1", "C3");
            fail("Expected UnknownKeyException");
        } catch (UnknownKeyException e) {
            // expected
        }
    }

    @Test
    public void testGetStartValueByIndex() {
        assertEquals(1.0, dataset.getStartValue(0, 0));
        assertEquals(2.0, dataset.getStartValue(0, 1));
        assertEquals(3.0, dataset.getStartValue(1, 0));
        assertEquals(4.0, dataset.getStartValue(1, 1));
        try {
            dataset.getStartValue(-1, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.getStartValue(0, -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.getStartValue(2, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.getStartValue(0, 2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetEndValueByKey() {
        assertEquals(1.5, dataset.getEndValue("S1", "C1"));
        assertEquals(2.5, dataset.getEndValue("S1", "C2"));
        assertEquals(3.5, dataset.getEndValue("S2", "C1"));
        assertEquals(4.5, dataset.getEndValue("S2", "C2"));
        try {
            dataset.getEndValue("S3", "C1");
            fail("Expected UnknownKeyException");
        } catch (UnknownKeyException e) {
            // expected
        }
        try {
            dataset.getEndValue("S1", "C3");
            fail("Expected UnknownKeyException");
        } catch (UnknownKeyException e) {
            // expected
        }
    }

    @Test
    public void testGetEndValueByIndex() {
        assertEquals(1.5, dataset.getEndValue(0, 0));
        assertEquals(2.5, dataset.getEndValue(0, 1));
        assertEquals(3.5, dataset.getEndValue(1, 0));
        assertEquals(4.5, dataset.getEndValue(1, 1));
        try {
            dataset.getEndValue(-1, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.getEndValue(0, -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.getEndValue(2, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.getEndValue(0, 2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetStartValue() {
        dataset.setStartValue(0, "C1", 10.0);
        assertEquals(10.0, dataset.getStartValue(0, 0));
        try {
            dataset.setStartValue(-1, "C1", 1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.setStartValue(2, "C1", 1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.setStartValue(0, "C3", 1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetEndValue() {
        dataset.setEndValue(0, "C1", 10.0);
        assertEquals(10.0, dataset.getEndValue(0, 0));
        try {
            dataset.setEndValue(-1, "C1", 1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.setEndValue(2, "C1", 1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.setEndValue(0, "C3", 1.0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetCategoryIndex() {
        assertEquals(0, dataset.getCategoryIndex("C1"));
        assertEquals(1, dataset.getCategoryIndex("C2"));
        assertEquals(-1, dataset.getCategoryIndex("C3"));
    }

    @Test
    public void testGetColumnKey() {
        assertEquals("C1", dataset.getColumnKey(0));
        assertEquals("C2", dataset.getColumnKey(1));
    }

    @Test
    public void testGetColumnIndex() {
        assertEquals(0, dataset.getColumnIndex("C1"));
        assertEquals(1, dataset.getColumnIndex("C2"));
        try {
            dataset.getColumnIndex(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetRowIndex() {
        assertEquals(0, dataset.getRowIndex("S1"));
        assertEquals(1, dataset.getRowIndex("S2"));
        assertEquals(-1, dataset.getRowIndex("S3"));
    }

    @Test
    public void testGetRowKeys() {
        List keys = dataset.getRowKeys();
        assertEquals(2, keys.size());
        try {
            keys.add("S3");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        DefaultIntervalCategoryDataset nullData = new DefaultIntervalCategoryDataset((Number[][]) null, null);
        assertNotNull(nullData.getRowKeys());
        assertEquals(0, nullData.getRowKeys().size());
    }

    @Test
    public void testGetRowKey() {
        assertEquals("S1", dataset.getRowKey(0));
        assertEquals("S2", dataset.getRowKey(1));
        try {
            dataset.getRowKey(2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            dataset.getRowKey(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetColumnCount() {
        assertEquals(2, dataset.getColumnCount());
    }

    @Test
    public void testGetRowCount() {
        assertEquals(2, dataset.getRowCount());
    }

    @Test
    public void testEquals() {
        DefaultIntervalCategoryDataset d1 = new DefaultIntervalCategoryDataset(SERIES_KEYS, CATEGORY_KEYS, START_DATA, END_DATA);
        DefaultIntervalCategoryDataset d2 = new DefaultIntervalCategoryDataset(SERIES_KEYS, CATEGORY_KEYS, START_DATA, END_DATA);
        assertTrue(d1.equals(d2));
        assertTrue(d1.equals(d1));
        assertFalse(d1.equals(null));
        assertFalse(d1.equals(new Object()));
        d2.setSeriesKeys(new Comparable[]{"S1", "S3"});
        assertFalse(d1.equals(d2));
        d2.setSeriesKeys(SERIES_KEYS);
        d2.setCategoryKeys(new Comparable[]{"C1", "C3"});
        assertFalse(d1.equals(d2));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        DefaultIntervalCategoryDataset cloned = (DefaultIntervalCategoryDataset) dataset.clone();
        assertNotSame(dataset, cloned);
        assertEquals(dataset, cloned);
        assertNotSame(dataset.startData, cloned.startData);
        assertNotSame(dataset.endData, cloned.endData);
        assertNotSame(dataset.startData[0], cloned.startData[0]);
        assertNotSame(dataset.endData[0], cloned.endData[0]);
        cloned.setStartValue(0, "C1", 100.0);
        assertFalse(dataset.equals(cloned));
    }

    @Test
    public void testEqual() {
        Number[][] a = {{1.0, 2.0}, {3.0, 4.0}};
        Number[][] b = {{1.0, 2.0}, {3.0, 4.0}};
        assertTrue(DefaultIntervalCategoryDataset.equal(a, a));
        assertTrue(DefaultIntervalCategoryDataset.equal(a, b));
        assertTrue(DefaultIntervalCategoryDataset.equal(null, null));
        assertFalse(DefaultIntervalCategoryDataset.equal(a, null));
        assertFalse(DefaultIntervalCategoryDataset.equal(null, a));
        Number[][] c = {{1.0, 2.0}, {3.0, 5.0}};
        assertFalse(DefaultIntervalCategoryDataset.equal(a, c));
        Number[][] d = {{1.0, 2.0}};
        assertFalse(DefaultIntervalCategoryDataset.equal(a, d));
    }

    @Test
    public void testCloneArray() {
        Number[][] a = {{1.0, 2.0}, {3.0, 4.0}};
        Number[][] clone = DefaultIntervalCategoryDataset.clone(a);
        assertNotSame(a, clone);
        assertEquals(a.length, clone.length);
        for (int i = 0; i < a.length; i++) {
            assertNotSame(a[i], clone[i]);
            assertEquals(a[i].length, clone[i].length);
            for (int j = 0; j < a[i].length; j++) {
                assertEquals(a[i][j], clone[i][j]);
            }
        }
        try {
            DefaultIntervalCategoryDataset.clone(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}