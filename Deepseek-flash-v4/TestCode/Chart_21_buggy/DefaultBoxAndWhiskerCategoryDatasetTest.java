package org.jfree.data.statistics;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import org.jfree.data.Range;

public class DefaultBoxAndWhiskerCategoryDatasetTest {
    private DefaultBoxAndWhiskerCategoryDataset dataset;
    private static final double EPSILON = 0.000000001;

    @Before
    public void setUp() {
        dataset = new DefaultBoxAndWhiskerCategoryDataset();
    }

    @Test
    public void testGetRowCountInitial() {
        assertEquals("Row count should be zero initially", 0, dataset.getRowCount());
    }

    @Test
    public void testGetColumnCountInitial() {
        assertEquals("Column count should be zero initially", 0, dataset.getColumnCount());
    }

    @Test
    public void testGetRowKeysInitial() {
        assertTrue("Row keys should be empty", dataset.getRowKeys().isEmpty());
    }

    @Test
    public void testGetColumnKeysInitial() {
        assertTrue("Column keys should be empty", dataset.getColumnKeys().isEmpty());
    }

    @Test
    public void testAddWithListAndKeys() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        dataset.add(values, "Row1", "Col1");
        
        assertEquals("Row count should be 1 after adding", 1, dataset.getRowCount());
        assertEquals("Column count should be 1 after adding", 1, dataset.getColumnCount());
        assertEquals("Row key", "Row1", dataset.getRowKey(0));
        assertEquals("Column key", "Col1", dataset.getColumnKey(0));
    }

    @Test(expected = NullPointerException.class)
    public void testAddWithNullList() {
        dataset.add((List)null, "Row1", "Col1");
    }

    @Test(expected = NullPointerException.class)
    public void testAddWithNullRowKey() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        dataset.add(values, null, "Col1");
    }

    @Test(expected = NullPointerException.class)
    public void testAddWithNullColumnKey() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        dataset.add(values, "Row1", null);
    }

    @Test
    public void testGetValueByIndicesWhenEmpty() {
        assertNull("Value should be null for empty dataset", dataset.getValue(0, 0));
    }

    @Test
    public void testGetMeanValueByIndices() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        dataset.add(values, "Row1", "Col1");
        
        Number meanValue = dataset.getMeanValue(0, 0);
        assertNotNull("Mean value should not be null", meanValue);
        assertEquals("Mean value mismatch", 2.0, meanValue.doubleValue(), EPSILON);
    }

    @Test
    public void testGetMedianValueByIndices() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        dataset.add(values, "Row1", "Col1");
        
        Number medianValue = dataset.getMedianValue(0, 0);
        assertNotNull("Median value should not be null", medianValue);
        assertEquals("Median value mismatch", 2.0, medianValue.doubleValue(), EPSILON);
    }

    @Test
    public void testGetMeanValueByKeys() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        dataset.add(values, "Row1", "Col1");
        
        Number meanValue = dataset.getMeanValue("Row1", "Col1");
        assertNotNull("Mean value should not be null", meanValue);
        assertEquals("Mean value mismatch", 2.0, meanValue.doubleValue(), EPSILON);
    }

    @Test
    public void testGetMedianValueByKeys() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        dataset.add(values, "Row1", "Col1");
        
        Number medianValue = dataset.getMedianValue("Row1", "Col1");
        assertNotNull("Median value should not be null", medianValue);
        assertEquals("Median value mismatch", 2.0, medianValue.doubleValue(), EPSILON);
    }

    @Test
    public void testGetRangeLowerBoundInitial() {
        assertEquals("Initial lower bound should be NaN", Double.NaN, 
                     dataset.getRangeLowerBound(true), EPSILON);
    }

    @Test
    public void testGetRangeUpperBoundInitial() {
        assertEquals("Initial upper bound should be NaN", Double.NaN, 
                     dataset.getRangeUpperBound(true), EPSILON);
    }

    @Test
    public void testGetRangeBoundsInitial() {
        Range range = dataset.getRangeBounds(true);
        assertNotNull("Range bounds should not be null", range);
        assertEquals("Range lower bound mismatch", 0.0, range.getLowerBound(), EPSILON);
        assertEquals("Range upper bound mismatch", 0.0, range.getUpperBound(), EPSILON);
    }

    @Test
    public void testGetValueWithNullRowKey() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        dataset.add(values, "Row1", "Col1");
        
        assertNull("Value should be null for invalid row key", 
                   dataset.getValue("InvalidRow", "Col1"));
    }

    @Test
    public void testGetValueWithNullColumnKey() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        dataset.add(values, "Row1", "Col1");
        
        assertNull("Value should be null for invalid column key", 
                   dataset.getValue("Row1", "InvalidCol"));
    }

    @Test
    public void testGetColumnIndex() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        dataset.add(values, "Row1", "Col1");
        
        assertEquals("Column index mismatch", 0, dataset.getColumnIndex("Col1"));
        assertEquals("Nonexistent column should return -1", -1, dataset.getColumnIndex("Invalid"));
    }

    @Test
    public void testGetRowIndex() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        dataset.add(values, "Row1", "Col1");
        
        assertEquals("Row index mismatch", 0, dataset.getRowIndex("Row1"));
        assertEquals("Nonexistent row should return -1", -1, dataset.getRowIndex("Invalid"));
    }

    @Test
    public void testEqualsWithSameObject() {
        assertTrue("Dataset should equal itself", dataset.equals(dataset));
    }

    @Test
    public void testEqualsWithNull() {
        assertFalse("Dataset should not equal null", dataset.equals(null));
    }

    @Test
    public void testEqualsWithDifferentObjectType() {
        assertFalse("Dataset should not equal a different object type", dataset.equals("not a dataset"));
    }

    @Test
    public void testEqualsWithEqualDatasets() {
        DefaultBoxAndWhiskerCategoryDataset ds1 = new DefaultBoxAndWhiskerCategoryDataset();
        DefaultBoxAndWhiskerCategoryDataset ds2 = new DefaultBoxAndWhiskerCategoryDataset();
        
        List<Double> values1 = new ArrayList<>();
        values1.add(1.0);
        values1.add(2.0);
        
        ds1.add(values1, "Row1", "Col1");
        ds2.add(values1, "Row1", "Col1");
        
        assertTrue("Datasets with same data should be equal", ds1.equals(ds2));
    }

    @Test
    public void testEqualsWithDifferentDatasets() {
        DefaultBoxAndWhiskerCategoryDataset ds1 = new DefaultBoxAndWhiskerCategoryDataset();
        DefaultBoxAndWhiskerCategoryDataset ds2 = new DefaultBoxAndWhiskerCategoryDataset();
        
        List<Double> values1 = new ArrayList<>();
        values1.add(1.0);
        List<Double> values2 = new ArrayList<>();
        values2.add(5.0);
        
        ds1.add(values1, "Row1", "Col1");
        ds2.add(values2, "Row1", "Col1");
        
        assertFalse("Datasets with different data should not be equal", ds1.equals(ds2));
    }

    @Test
    public void testClone() throws Exception {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        dataset.add(values, "Row1", "Col1");
        
        DefaultBoxAndWhiskerCategoryDataset cloned = (DefaultBoxAndWhiskerCategoryDataset) dataset.clone();
        assertNotNull("Cloned dataset should not be null", cloned);
        assertNotSame("Cloned dataset should be a different object", dataset, cloned);
        assertTrue("Cloned dataset should be equal to original", dataset.equals(cloned));
    }

    @Test
    public void testAddMultipleRowsColumns() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(2.0);
        
        dataset.add(values, "Row1", "Col1");
        dataset.add(values, "Row1", "Col2");
        dataset.add(values, "Row2", "Col1");
        
        assertEquals("Row count mismatch", 2, dataset.getRowCount());
        assertEquals("Column count mismatch", 2, dataset.getColumnCount());
    }

    @Test
    public void testGetMinRegularValueByIndices() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        dataset.add(values, "Row1", "Col1");
        
        Number minValue = dataset.getMinRegularValue(0, 0);
        assertNotNull("Min regular value should not be null", minValue);
        assertEquals("Min regular value mismatch", 1.0, minValue.doubleValue(), EPSILON);
    }

    @Test
    public void testGetMaxRegularValueByIndices() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        dataset.add(values, "Row1", "Col1");
        
        Number maxValue = dataset.getMaxRegularValue(0, 0);
        assertNotNull("Max regular value should not be null", maxValue);
        assertEquals("Max regular value mismatch", 3.0, maxValue.doubleValue(), EPSILON);
    }

    @Test
    public void testGetRangeBoundsAfterAdd() {
        List<Double> values = new ArrayList<>();
        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        dataset.add(values, "Row1", "Col1");
        
        double lower = dataset.getRangeLowerBound(true);
        double upper = dataset.getRangeUpperBound(true);
        
        assertTrue("Lower bound should be <= 3.0", lower <= 3.0);
        assertTrue("Upper bound should be >= 1.0", upper >= 1.0);
        assertTrue("Lower bound should be <= upper bound", lower <= upper);
    }
}