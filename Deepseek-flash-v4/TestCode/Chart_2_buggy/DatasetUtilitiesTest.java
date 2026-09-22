package org.jfree.data.general;

import org.jfree.data.pie.PieDataset;
import org.jfree.data.pie.DefaultPieDataset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jfree.data.DomainInfo;
import org.jfree.data.KeyToGroupMap;
import org.jfree.data.KeyedValues;
import org.jfree.data.Range;
import org.jfree.data.RangeInfo;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.CategoryRangeInfo;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.function.Function2D;
import org.jfree.data.statistics.BoxAndWhiskerCategoryDataset;
import org.jfree.data.statistics.BoxAndWhiskerXYDataset;
import org.jfree.data.statistics.MultiValueCategoryDataset;
import org.jfree.data.statistics.StatisticalCategoryDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.OHLCDataset;
import org.jfree.data.xy.TableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYDomainInfo;
import org.jfree.data.xy.XYRangeInfo;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class DatasetUtilitiesTest {
    private DefaultPieDataset pieDataset;
    private DefaultCategoryDataset categoryDataset;
    private XYSeriesCollection xyDataset;
    private XYSeries series;

    @Before
    public void setUp() {
        pieDataset = new DefaultPieDataset();
        categoryDataset = new DefaultCategoryDataset();
        xyDataset = new XYSeriesCollection();
        series = new XYSeries("test");
    }

    @After
    public void tearDown() {
        pieDataset = null;
        categoryDataset = null;
        xyDataset = null;
        series = null;
    }

    // Test cases for calculatePieDatasetTotal
    @Test
    public void testCalculatePieDatasetTotal_Null() {
        try {
            DatasetUtilities.calculatePieDatasetTotal(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Null 'dataset' argument.", e.getMessage());
        }
    }

    @Test
    public void testCalculatePieDatasetTotal_Empty() {
        Assert.assertEquals(0.0, DatasetUtilities.calculatePieDatasetTotal(new DefaultPieDataset()), 0.0001);
    }

    @Test
    public void testCalculatePieDatasetTotal_PositiveValues() {
        pieDataset.setValue("A", 10.0);
        pieDataset.setValue("B", 5.0);
        pieDataset.setValue("C", 0.0);
        pieDataset.setValue("D", -3.0);
        Assert.assertEquals(15.0, DatasetUtilities.calculatePieDatasetTotal(pieDataset), 0.0001);
    }

    @Test
    public void testCalculatePieDatasetTotal_NullValue() {
        pieDataset.setValue("A", null);
        pieDataset.setValue("B", 2.0);
        Assert.assertEquals(2.0, DatasetUtilities.calculatePieDatasetTotal(pieDataset), 0.0001);
    }

    // Test cases for createPieDatasetForRow
    @Test
    public void testCreatePieDatasetForRow_EmptyDataset() {
        PieDataset result = DatasetUtilities.createPieDatasetForRow(categoryDataset, "row");
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.getItemCount());
    }

    @Test
    public void testCreatePieDatasetForRow_Valid() {
        categoryDataset.addValue(1.0, "row1", "col1");
        categoryDataset.addValue(2.0, "row1", "col2");
        categoryDataset.addValue(3.0, "row2", "col1");
        PieDataset result = DatasetUtilities.createPieDatasetForRow(categoryDataset, "row1");
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.getItemCount());
        Assert.assertEquals(1.0, result.getValue("col1").doubleValue(), 0.0001);
        Assert.assertEquals(2.0, result.getValue("col2").doubleValue(), 0.0001);
    }

    @Test
    public void testCreatePieDatasetForRow_MissingRow() {
        categoryDataset.addValue(1.0, "row1", "col1");
        PieDataset result = DatasetUtilities.createPieDatasetForRow(categoryDataset, "nonexistent");
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.getItemCount());
    }

    // Test cases for createPieDatasetForColumn
    @Test
    public void testCreatePieDatasetForColumn_Valid() {
        categoryDataset.addValue(1.0, "row1", "col1");
        categoryDataset.addValue(2.0, "row2", "col1");
        categoryDataset.addValue(3.0, "row1", "col2");
        PieDataset result = DatasetUtilities.createPieDatasetForColumn(categoryDataset, "col1");
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.getItemCount());
        Assert.assertEquals(1.0, result.getValue("row1").doubleValue(), 0.0001);
        Assert.assertEquals(2.0, result.getValue("row2").doubleValue(), 0.0001);
    }

    @Test
    public void testCreatePieDatasetForColumn_EmptyDataset() {
        PieDataset result = DatasetUtilities.createPieDatasetForColumn(categoryDataset, "col");
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.getItemCount());
    }

    // Test cases for createConsolidatedPieDataset
    @Test
    public void testCreateConsolidatedPieDataset_AllOthers() {
        DefaultPieDataset source = new DefaultPieDataset();
        source.setValue("A", 80.0);
        source.setValue("B", 10.0);
        source.setValue("C", 10.0);
        PieDataset result = DatasetUtilities.createConsolidatedPieDataset(source, "OTHER", 0.15, 2);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.getItemCount());
        Assert.assertNotNull(result.getValue("OTHER"));
        Assert.assertEquals(20.0, result.getValue("OTHER").doubleValue(), 0.0001);
        Assert.assertNull(result.getValue("B"));
        Assert.assertEquals(80.0, result.getValue("A").doubleValue(), 0.0001);
    }

    @Test
    public void testCreateConsolidatedPieDataset_NoConsolidation() {
        DefaultPieDataset source = new DefaultPieDataset();
        source.setValue("A", 50.0);
        source.setValue("B", 50.0);
        PieDataset result = DatasetUtilities.createConsolidatedPieDataset(source, "OTHER", 0.1, 2);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.getItemCount());
        Assert.assertNull(result.getValue("OTHER"));
    }

    @Test
    public void testCreateConsolidatedPieDataset_EmptyInput() {
        DefaultPieDataset source = new DefaultPieDataset();
        PieDataset result = DatasetUtilities.createConsolidatedPieDataset(source, "OTHER", 0.1, 2);
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.getItemCount());
    }

    // Test cases for createCategoryDataset
    @Test
    public void testCreateCategoryDataset_DoubleArray() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        CategoryDataset result = DatasetUtilities.createCategoryDataset("row", "col", data);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.getRowCount());
        Assert.assertEquals(2, result.getColumnCount());
        Assert.assertEquals(1.0, result.getValue(0, 0).doubleValue(), 0.0001);
    }

    @Test
    public void testCreateCategoryDataset_NumberArray() {
        Number[][] data = {{1, 2}, {3, 4}};
        CategoryDataset result = DatasetUtilities.createCategoryDataset("row", "col", data);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.getRowCount());
        Assert.assertEquals(2, result.getColumnCount());
        Assert.assertEquals(1, result.getValue(0, 0).intValue());
    }

    @Test
    public void testCreateCategoryDataset_NullRowKeys() {
        double[][] data = {{1.0}};
        try {
            DatasetUtilities.createCategoryDataset((Comparable[]) null, new String[]{"col"}, data);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Null 'rowKeys' argument.", e.getMessage());
        }
    }

    @Test
    public void testCreateCategoryDataset_DuplicateRowKeys() {
        double[][] data = {{1.0}, {2.0}};
        try {
            DatasetUtilities.createCategoryDataset(new String[]{"a", "a"}, new String[]{"c", "d"}, data);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCreateCategoryDataset_KeyMismatch() {
        double[][] data = {{1.0, 2.0}};
        try {
            DatasetUtilities.createCategoryDataset(new String[]{"a"}, new String[]{"c", "d"}, data);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCreateCategoryDataset_NullRowKey() {
        double[][] data = {{1.0}};
        try {
            DatasetUtilities.createCategoryDataset((Comparable) null, "col", data);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Null 'rowKey' argument.", e.getMessage());
        }
    }

    // Test cases for sampleFunction2D
    @Test
    public void testSampleFunction2D_NullFunction() {
        try {
            DatasetUtilities.sampleFunction2D(null, 0.0, 1.0, 10, "test");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Null 'f' argument.", e.getMessage());
        }
    }

    @Test
    public void testSampleFunction2D_NullSeriesKey() {
        try {
            DatasetUtilities.sampleFunction2D(new Function2D() {
                @Override
                public double getValue(double x) { return x; }
            }, 0.0, 1.0, 10, null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Null 'seriesKey' argument.", e.getMessage());
        }
    }

    @Test
    public void testSampleFunction2D_InvalidRange() {
        try {
            DatasetUtilities.sampleFunction2D(new Function2D() {
                @Override
                public double getValue(double x) { return x; }
            }, 1.0, 0.0, 10, "test");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Requires start <= end.", e.getMessage());
        }
    }

    @Test
    public void testSampleFunction2D_InvalidSamples() {
        try {
            DatasetUtilities.sampleFunction2D(new Function2D() {
                @Override
                public double getValue(double x) { return x; }
            }, 0.0, 1.0, 1, "test");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Requires samples >= 2.", e.getMessage());
        }
    }

    @Test
    public void testSampleFunction2D_Valid() {
        XYSeries result = DatasetUtilities.sampleFunction2D(new Function2D() {
            @Override
            public double getValue(double x) { return x * 2; }
        }, 0.0, 2.0, 3, "test");
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.getItemCount());
        Assert.assertEquals(0.0, result.getYValue(0), 0.0001);
        Assert.assertEquals(2.0, result.getYValue(1), 0.0001);
        Assert.assertEquals(4.0, result.getYValue(2), 0.0001);
    }

    // Test cases for isEmptyOrNull
    @Test
    public void testIsEmptyOrNull_NullPieDataset() {
        Assert.assertTrue(DatasetUtilities.isEmptyOrNull((PieDataset) null));
    }

    @Test
    public void testIsEmptyOrNull_EmptyPieDataset() {
        Assert.assertTrue(DatasetUtilities.isEmptyOrNull(new DefaultPieDataset()));
    }

    @Test
    public void testIsEmptyOrNull_NonEmptyPieDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 1.0);
        Assert.assertFalse(DatasetUtilities.isEmptyOrNull(dataset));
    }

    @Test
    public void testIsEmptyOrNull_NullCategoryDataset() {
        Assert.assertTrue(DatasetUtilities.isEmptyOrNull((CategoryDataset) null));
    }

    @Test
    public void testIsEmptyOrNull_EmptyCategoryDataset() {
        Assert.assertTrue(DatasetUtilities.isEmptyOrNull(new DefaultCategoryDataset()));
    }

    @Test
    public void testIsEmptyOrNull_NonEmptyCategoryDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "row", "col");
        Assert.assertFalse(DatasetUtilities.isEmptyOrNull(dataset));
    }

    @Test
    public void testIsEmptyOrNull_NullXYDataset() {
        Assert.assertTrue(DatasetUtilities.isEmptyOrNull((XYDataset) null));
    }

    @Test
    public void testIsEmptyOrNull_EmptyXYDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        Assert.assertTrue(DatasetUtilities.isEmptyOrNull(dataset));
    }

    @Test
    public void testIsEmptyOrNull_NonEmptyXYDataset() {
        XYSeries s = new XYSeries("test");
        s.add(1.0, 2.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s);
        Assert.assertFalse(DatasetUtilities.isEmptyOrNull(dataset));
    }

    // Test cases for iterateDomainBounds
    @Test
    public void testIterateDomainBounds_NullDataset() {
        try {
            DatasetUtilities.iterateDomainBounds((XYDataset) null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Null 'dataset' argument.", e.getMessage());
        }
    }

    @Test
    public void testIterateDomainBounds_EmptyDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        Range result = DatasetUtilities.iterateDomainBounds(dataset);
        Assert.assertNull(result);
    }

    @Test
    public void testIterateDomainBounds_WithData() {
        XYSeries s = new XYSeries("test");
        s.add(0.5, 1.0);
        s.add(1.5, 2.0);
        s.add(2.0, 3.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s);
        Range result = DatasetUtilities.iterateDomainBounds(dataset);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.5, result.getLowerBound(), 0.0001);
        Assert.assertEquals(2.0, result.getUpperBound(), 0.0001);
    }

    @Test
    public void testIterateDomainBounds_Interval() {
        IntervalXYDataset intervalData = new IntervalXYDataset() {
            @Override
            public double getStartXValue(int series, int item) { return 0.0; }
            @Override
            public double getEndXValue(int series, int item) { return 2.0; }
            @Override
            public double getStartYValue(int series, int item) { return 0.0; }
            @Override
            public double getEndYValue(int series, int item) { return 1.0; }
            @Override
            public int getSeriesCount() { return 1; }
            @Override
            public Comparable getSeriesKey(int series) { return "test"; }
            @Override
            public int getItemCount(int series) { return 1; }
            @Override
            public double getXValue(int series, int item) { return 1.0; }
            @Override
            public Number getX(int series, int item) { return 1.0; }
            @Override
            public double getYValue(int series, int item) { return 0.5; }
            @Override
            public Number getY(int series, int item) { return 0.5; }
        };
        Range result = DatasetUtilities.iterateDomainBounds(intervalData, true);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getLowerBound(), 0.0001);
        Assert.assertEquals(2.0, result.getUpperBound(), 0.0001);
    }

    @Test
    public void testIterateDomainBounds_NaN() {
        XYSeries s = new XYSeries("test");
        s.add(Double.NaN, 1.0);
        s.add(1.0, 2.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s);
        Range result = DatasetUtilities.iterateDomainBounds(dataset, true);
        Assert.assertNotNull(result);
        Assert.assertEquals(1.0, result.getLowerBound(), 0.0001);
        Assert.assertEquals(1.0, result.getUpperBound(), 0.0001);
    }

    // Test cases for iterateRangeBounds
    @Test
    public void testIterateRangeBounds_CategoryDataset_NaN() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(Double.NaN, "row1", "col1");
        Range result = DatasetUtilities.iterateRangeBounds(dataset);
        Assert.assertNull(result);
    }

    @Test
    public void testIterateRangeBounds_CategoryDataset_WithData() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "row1", "col1");
        dataset.addValue(2.0, "row1", "col2");
        dataset.addValue(-1.0, "row1", "col3");
        Range result = DatasetUtilities.iterateRangeBounds(dataset, true);
        Assert.assertNotNull(result);
        Assert.assertEquals(-1.0, result.getLowerBound(), 0.0001);
        Assert.assertEquals(2.0, result.getUpperBound(), 0.0001);
    }

    @Test
    public void testIterateRangeBounds_CategoryDataset_Interval() {
        IntervalCategoryDataset intervalDataset = new IntervalCategoryDataset() {
            @Override
            public Number getStartValue(int row, int column) { return 0.0; }
            @Override
            public Number getEndValue(int row, int column) { return 2.0; }
            @Override
            public int getRowCount() { return 1; }
            @Override
            public int getColumnCount() { return 1; }
            @Override
            public Number getValue(int row, int column) { return 1.0; }
            @Override
            public Comparable getRowKey(int row) { return "row"; }
            @Override
            public int getRowIndex(Comparable key) { return 0; }
            @Override
            public Comparable getColumnKey(int column) { return "col"; }
            @Override
            public int getColumnIndex(Comparable key) { return 0; }
            @Override
            public Number getValue(Comparable rowKey, Comparable columnKey) { return 1.0; }
            @Override
            public int getRowIndex(String rowKey) { return 0; }
            @Override
            public int getColumnIndex(String columnKey) { return 0; }
        };
        Range result = DatasetUtilities.iterateRangeBounds(intervalDataset, true);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getLowerBound(), 0.0001);
        Assert.assertEquals(2.0, result.getUpperBound(), 0.0001);
    }

    // Test cases for findMinimumRangeValue and findMaximumRangeValue
    @Test
    public void testFindMinimumRangeValue_EmptyCategoryDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Number result = DatasetUtilities.findMinimumRangeValue(dataset);
        Assert.assertNull(result);
    }

    @Test
    public void testFindMinimumRangeValue_CategoryDataset_Valid() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "row1", "col1");
        dataset.addValue(2.0, "row1", "col2");
        Number result = DatasetUtilities.findMinimumRangeValue(dataset);
        Assert.assertEquals(2.0, result.doubleValue(), 0.0001);
    }

    @Test
    public void testFindMinimumRangeValue_IntervalCategoryDataset() {
        IntervalCategoryDataset intervalDataset = new IntervalCategoryDataset() {
            @Override
            public Number getStartValue(int row, int column) { return 2.0; }
            @Override
            public Number getEndValue(int row, int column) { return 5.0; }
            @Override
            public int getRowCount() { return 1; }
            @Override
            public int getColumnCount() { return 1; }
            @Override
            public Number getValue(int row, int column) { return 3.0; }
            @Override
            public Comparable getRowKey(int row) { return "row"; }
            @Override
            public int getRowIndex(Comparable key) { return 0; }
            @Override
            public Comparable getColumnKey(int column) { return "col"; }
            @Override
            public int getColumnIndex(Comparable key) { return 0; }
            @Override
            public Number getValue(Comparable rowKey, Comparable columnKey) { return 3.0; }
            @Override
            public int getRowIndex(String rowKey) { return 0; }
            @Override
            public int getColumnIndex(String columnKey) { return 0; }
        };
        Number result = DatasetUtilities.findMinimumRangeValue(intervalDataset);
        Assert.assertEquals(2.0, result.doubleValue(), 0.0001);
    }

    @Test
    public void testFindMaximumRangeValue_CategoryDataset_Valid() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "row1", "col1");
        dataset.addValue(2.0, "row1", "col2");
        Number result = DatasetUtilities.findMaximumRangeValue(dataset);
        Assert.assertEquals(5.0, result.doubleValue(), 0.0001);
    }

    @Test
    public void testFindMaximumRangeValue_EmptyCategoryDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Number result = DatasetUtilities.findMaximumRangeValue(dataset);
        Assert.assertNull(result);
    }

    // Test cases for findStackedRangeBounds
    @Test
    public void testFindStackedRangeBounds_EmptyCategoryDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Range result = DatasetUtilities.findStackedRangeBounds(dataset);
        Assert.assertNull(result);
    }

    @Test
    public void testFindStackedRangeBounds_WithData() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "row1", "col1");
        dataset.addValue(2.0, "row1", "col2");
        dataset.addValue(-1.0, "row2", "col1");
        Range result = DatasetUtilities.findStackedRangeBounds(dataset);
        Assert.assertNotNull(result);
        Assert.assertEquals(-1.0, result.getLowerBound(), 0.0001);
        Assert.assertEquals(3.0, result.getUpperBound(), 0.0001);
    }

    @Test
    public void testFindStackedRangeBounds_WithNaN() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(Double.NaN, "row1", "col1");
        dataset.addValue(2.0, "row1", "col2");
        Range result = DatasetUtilities.findStackedRangeBounds(dataset);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getLowerBound(), 0.0001);
        Assert.assertEquals(2.0, result.getUpperBound(), 0.0001);
    }

    // Test cases for findMinimumStackedRangeValue
    @Test
    public void testFindMinimumStackedRangeValue_NullDataset() {
        Number result = DatasetUtilities.findMinimumStackedRangeValue(null);
        Assert.assertNull(result);
    }

    @Test
    public void testFindMinimumStackedRangeValue_EmptyDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Number result = DatasetUtilities.findMinimumStackedRangeValue(dataset);
        Assert.assertNull(result);
    }

    @Test
    public void testFindMinimumStackedRangeValue_WithData() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(-3.0, "row1", "col1");
        dataset.addValue(2.0, "row1", "col2");
        dataset.addValue(-1.0, "row2", "col1");
        Number result = DatasetUtilities.findMinimumStackedRangeValue(dataset);
        Assert.assertEquals(-3.0, result.doubleValue(), 0.0001);
    }

    // Test cases for findMaximumStackedRangeValue
    @Test
    public void testFindMaximumStackedRangeValue_NullDataset() {
        Number result = DatasetUtilities.findMaximumStackedRangeValue(null);
        Assert.assertNull(result);
    }

    @Test
    public void testFindMaximumStackedRangeValue_EmptyDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Number result = DatasetUtilities.findMaximumStackedRangeValue(dataset);
        Assert.assertNull(result);
    }

    @Test
    public void testFindMaximumStackedRangeValue_WithData() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(3.0, "row1", "col1");
        dataset.addValue(2.0, "row1", "col2");
        dataset.addValue(-1.0, "row2", "col1");
        Number result = DatasetUtilities.findMaximumStackedRangeValue(dataset);
        Assert.assertEquals(3.0, result.doubleValue(), 0.0001);
    }

    // Test cases for findStackedRangeBounds (TableXYDataset)
    @Test
    public void testFindStackedRangeBounds_TableXYDataset_Null() {
        Range result = DatasetUtilities.findStackedRangeBounds((TableXYDataset) null);
        Assert.assertNull(result);
    }

    @Test
    public void testFindStackedRangeBounds_TableXYDataset_Empty() {
        TableXYDataset dataset = new TableXYDataset() {
            @Override
            public int getItemCount() { return 0; }
            @Override
            public int getSeriesCount() { return 1; }
            @Override
            public Comparable getSeriesKey(int series) { return "test"; }
            @Override
            public double getXValue(int series, int item) { return 0; }
            @Override
            public Number getX(int series, int item) { return 0; }
            @Override
            public double getYValue(int series, int item) { return 1.0; }
            @Override
            public Number getY(int series, int item) { return 1.0; }
        };
        Range result = DatasetUtilities.findStackedRangeBounds(dataset);
        Assert.assertNull(result);
    }

    @Test
    public void testFindStackedRangeBounds_TableXYDataset_WithData() {
        TableXYDataset dataset = new TableXYDataset() {
            @Override
            public int getItemCount() { return 3; }
            @Override
            public int getSeriesCount() { return 2; }
            @Override
            public Comparable getSeriesKey(int series) { return "test"; }
            @Override
            public double getXValue(int series, int item) { return item; }
            @Override
            public Number getX(int series, int item) { return item; }
            @Override
            public double getYValue(int series, int item) { return series == 0 ? 1.0 : 2.0; }
            @Override
            public Number getY(int series, int item) { return series == 0 ? 1.0 : 2.0; }
        };
        Range result = DatasetUtilities.findStackedRangeBounds(dataset);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getLowerBound(), 0.0001);
        Assert.assertEquals(2.0, result.getUpperBound(), 0.0001);
    }

    // Test cases for calculateStackTotal
    @Test
    public void testCalculateStackTotal_Valid() {
        TableXYDataset dataset = new TableXYDataset() {
            @Override
            public int getItemCount() { return 1; }
            @Override
            public int getSeriesCount() { return 3; }
            @Override
            public Comparable getSeriesKey(int series) { return "test"; }
            @Override
            public double getXValue(int series, int item) { return 0; }
            @Override
            public Number getX(int series, int item) { return 0; }
            @Override
            public double getYValue(int series, int item) { return series + 1.0; }
            @Override
            public Number getY(int series, int item) { return series + 1.0; }
        };
        Assert.assertEquals(6.0, DatasetUtilities.calculateStackTotal(dataset, 0), 0.0001);
    }

    @Test
    public void testCalculateStackTotal_ZeroItem() {
        TableXYDataset dataset = new TableXYDataset() {
            @Override
            public int getItemCount() { return 1; }
            @Override
            public int getSeriesCount() { return 0; }
            @Override
            public Comparable getSeriesKey(int series) { return "test"; }
            @Override
            public double getXValue(int series, int item) { return 0; }
            @Override
            public Number getX(int series, int item) { return 0; }
            @Override
            public double getYValue(int series, int item) { return 0; }
            @Override
            public Number getY(int series, int item) { return 0; }
        };
        Assert.assertEquals(0.0, DatasetUtilities.calculateStackTotal(dataset, 0), 0.0001);
    }

    // Test cases for findMinimumRangeValue (XYDataset)
    @Test
    public void testFindMinimumRangeValue_XYDataset_Empty() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        Number result = DatasetUtilities.findMinimumRangeValue(dataset);
        Assert.assertNull(result);
    }

    @Test
    public void testFindMinimumRangeValue_XYDataset_Valid() {
        XYSeries s = new XYSeries("test");
        s.add(0.0, 3.0);
        s.add(1.0, -2.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s);
        Number result = DatasetUtilities.findMinimumRangeValue(dataset);
        Assert.assertEquals(-2.0, result.doubleValue(), 0.0001);
    }

    @Test
    public void testFindMaximumRangeValue_XYDataset_Valid() {
        XYSeries s = new XYSeries("test");
        s.add(0.0, 3.0);
        s.add(1.0, -2.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s);
        Number result = DatasetUtilities.findMaximumRangeValue(dataset);
        Assert.assertEquals(3.0, result.doubleValue(), 0.0001);
    }

    @Test
    public void testFindMaximumRangeValue_XYDataset_Empty() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        Number result = DatasetUtilities.findMaximumRangeValue(dataset);
        Assert.assertNull(result);
    }

    // Test cases for findDomainBounds
    @Test
    public void testFindDomainBounds_Empty() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        Range result = DatasetUtilities.findDomainBounds(dataset);
        Assert.assertNull(result);
    }

    @Test
    public void testFindDomainBounds_Valid() {
        XYSeries s = new XYSeries("test");
        s.add(0.5, 1.0);
        s.add(1.5, 2.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s);
        Range result = DatasetUtilities.findDomainBounds(dataset);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.5, result.getLowerBound(), 0.0001);
        Assert.assertEquals(1.5, result.getUpperBound(), 0.0001);
    }

    // Test cases for iterateToFindDomainBounds
    @Test
    public void testIterateToFindDomainBounds_Empty() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        Range result = DatasetUtilities.iterateToFindDomainBounds(dataset, true);
        Assert.assertNull(result);
    }

    @Test
    public void testIterateToFindDomainBounds_Valid() {
        XYSeries s = new XYSeries("test");
        s.add(1.0, 2.0);
        s.add(3.0, 4.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s);
        Range result = DatasetUtilities.iterateToFindDomainBounds(dataset, true);
        Assert.assertNotNull(result);
        Assert.assertEquals(1.0, result.getLowerBound(), 0.0001);
        Assert.assertEquals(3.0, result.getUpperBound(), 0.0001);
    }

    // Test cases for iterateToFindRangeBounds
    @Test
    public void testIterateToFindRangeBounds_Empty() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        Range result = DatasetUtilities.iterateToFindRangeBounds(dataset, true);
        Assert.assertNull(result);
    }

    @Test
    public void testIterateToFindRangeBounds_Valid() {
        XYSeries s = new XYSeries("test");
        s.add(0.0, 2.0);
        s.add(1.0, 5.0);
        s.add(2.0, -1.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s);
        Range result = DatasetUtilities.iterateToFindRangeBounds(dataset, true);
        Assert.assertNotNull(result);
        Assert.assertEquals(-1.0, result.getLowerBound(), 0.0001);
        Assert.assertEquals(5.0, result.getUpperBound(), 0.0001);
    }

    @Test
    public void testIterateToFindRangeBounds_OHLC() {
        OHLCDataset dataset = new OHLCDataset() {
            @Override
            public double getHighValue(int series, int item) { return 5.0; }
            @Override
            public double getLowValue(int series, int item) { return -1.0; }
            @Override
            public double getOpenValue(int series, int item) { return 0; }
            @Override
            public double getCloseValue(int series, int item) { return 1.0; }
            @Override
            public double getVolumeValue(int series, int item) { return 0; }
            @Override
            public int getSeriesCount() { return 1; }
            @Override
            public Comparable getSeriesKey(int series) { return "test"; }
            @Override
            public int getItemCount(int series) { return 1; }
            @Override
            public double getXValue(int series, int item) { return 0; }
            @Override
            public Number getX(int series, int item) { return 0; }
            @Override
            public double getYValue(int series, int item) { return 1.0; }
            @Override
            public Number getY(int series, int item) { return 1.0; }
            @Override
            public Number getHigh(int series, int item) { return 5.0; }
            @Override
            public long getHighTick(int series, int item) { return 0; }
            @Override
            public Number getLow(int series, int item) { return -1.0; }
            @Override
            public long getLowTick(int series, int item) { return 0; }
            @Override
            public Number getOpen(int series, int item) { return 0.0; }
            @Override
            public long getOpenTick(int series, int item) { return 0; }
            @Override
            public Number getClose(int series, int item) { return 1.0; }
            @Override
            public long getCloseTick(int series, int item) { return 0; }
            @Override
            public Number getVolume(int series, int item) { return 0; }
            @Override
            public long getVolumeTick(int series, int item) { return 0; }
        };
        Range result = DatasetUtilities.iterateToFindRangeBounds(dataset, true);
        Assert.assertNotNull(result);
        Assert.assertEquals(-1.0, result.getLowerBound(), 0.0001);
        Assert.assertEquals(5.0, result.getUpperBound(), 0.0001);
    }

    @Test
    public void testIterateToFindRangeBounds_IntervalXY() {
        IntervalXYDataset dataset = new IntervalXYDataset() {
            @Override
            public double getStartXValue(int series, int item) { return 0.0; }
            @Override
            public double getEndXValue(int series, int item) { return 2.0; }
            @Override
            public double getStartYValue(int series, int item) { return -1.0; }
            @Override
            public double getEndYValue(int series, int item) { return 3.0; }
            @Override
            public int getSeriesCount() { return 1; }
            @Override
            public Comparable getSeriesKey(int series) { return "test"; }
            @Override
            public int getItemCount(int series) { return 1; }
            @Override
            public double getXValue(int series, int item) { return 1.0; }
            @Override
            public Number getX(int series, int item) { return 1.0; }
            @Override
            public double getYValue(int series, int item) { return 1.0; }
            @Override
            public Number getY(int series, int item) { return 1.0; }
        };
        Range result = DatasetUtilities.iterateToFindRangeBounds(dataset, true);
        Assert.assertNotNull(result);
        Assert.assertEquals(-1.0, result.getLowerBound(), 0.0001);
        Assert.assertEquals(3.0, result.getUpperBound(), 0.0001);
    }

    @Test
    public void testIterateToFindRangeBounds_NaN() {
        XYSeries s = new XYSeries("test");
        s.add(0.0, Double.NaN);
        s.add(1.0, 2.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s);
        Range result = DatasetUtilities.iterateToFindRangeBounds(dataset, true);
        Assert.assertNotNull(result);
        Assert.assertEquals(2.0, result.getLowerBound(), 0.0001);
        Assert.assertEquals(2.0, result.getUpperBound(), 0.0001);
    }

    // Test cases for findCumulativeRangeBounds
    @Test
    public void testFindCumulativeRangeBounds_Empty() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Range result = DatasetUtilities.findCumulativeRangeBounds(dataset);
        Assert.assertNull(result);
    }

    @Test
    public void testFindCumulativeRangeBounds_Valid() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "row1", "col1");
        dataset.addValue(2.0, "row1", "col2");
        dataset.addValue(-1.0, "row1", "col3");
        Range result = DatasetUtilities.findCumulativeRangeBounds(dataset);
        Assert.assertNotNull(result);
        Assert.assertEquals(-1.0, result.getLowerBound(), 0.0001);
        Assert.assertEquals(2.0, result.getUpperBound(), 0.0001);
    }

    @Test
    public void testFindCumulativeRangeBounds_AllNull() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(null, "row1", "col1");
        dataset.addValue(null, "row1", "col2");
        Range result = DatasetUtilities.findCumulativeRangeBounds(dataset);
        Assert.assertNull(result);
    }
}