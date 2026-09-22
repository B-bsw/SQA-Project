package org.jfree.data.general;

import org.junit.Test;
import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Comprehensive Unit Tests for {@link DatasetUtilities}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class DatasetUtilitiesTest {

    @Test
    public void createNumberArray_givenDoubleArray_shouldReturnNumberArray() {
        // Arrange
        double[] input = new double[] { 1.5, 2.5, 3.5 };

        // Act
        Number[] result = DatasetUtilities.createNumberArray(input);

        // Assert
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals(Double.valueOf(1.5), result[0]);
        assertEquals(Double.valueOf(2.5), result[1]);
        assertEquals(Double.valueOf(3.5), result[2]);
    }

    @Test
    public void createNumberArray2D_given2DDoubleArray_shouldReturn2DNumberArray() {
        // Arrange
        double[][] input = new double[][] {
            { 1.0, 2.0 },
            { 3.0, 4.0 }
        };

        // Act
        Number[][] result = DatasetUtilities.createNumberArray2D(input);

        // Assert
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals(Double.valueOf(1.0), result[0][0]);
        assertEquals(Double.valueOf(4.0), result[1][1]);
    }

    @Test
    public void calculatePieDatasetTotal_givenPieDataset_shouldSumValues() {
        // Arrange
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 10.0);
        dataset.setValue("B", 20.0);
        dataset.setValue("C", 30.0);

        // Act
        double total = DatasetUtilities.calculatePieDatasetTotal(dataset);

        // Assert
        assertEquals(60.0, total, 0.0001);
    }

    @Test
    public void isEmptyOrNull_givenPieDataset_shouldDetectEmptyState() {
        // Arrange
        DefaultPieDataset empty = new DefaultPieDataset();
        DefaultPieDataset populated = new DefaultPieDataset();
        populated.setValue("Item", 5.0);

        // Act & Assert
        assertTrue(DatasetUtilities.isEmptyOrNull((PieDataset) null));
        assertTrue(DatasetUtilities.isEmptyOrNull(empty));
        assertFalse(DatasetUtilities.isEmptyOrNull(populated));
    }

    @Test
    public void createCategoryDataset_givenDataAndPrefixes_shouldPopulateDataset() {
        // Arrange
        double[][] data = new double[][] {
            { 10.0, 20.0 },
            { 30.0, 40.0 }
        };

        // Act
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset("Row", "Col", data);

        // Assert
        assertNotNull(dataset);
        assertEquals(2, dataset.getRowCount());
        assertEquals(2, dataset.getColumnCount());
        assertEquals(Double.valueOf(10.0), dataset.getValue("Row0", "Col0"));
        assertEquals(Double.valueOf(40.0), dataset.getValue("Row1", "Col1"));
    }

    @Test
    public void findRangeBounds_givenCategoryDataset_shouldCalculateMinAndMax() {
        // Arrange
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(15.0, "R1", "C1");
        dataset.addValue(5.0, "R1", "C2");
        dataset.addValue(25.0, "R2", "C1");

        // Act
        Range range = DatasetUtilities.findRangeBounds(dataset);

        // Assert
        assertNotNull(range);
        assertEquals(5.0, range.getLowerBound(), 0.0001);
        assertEquals(25.0, range.getUpperBound(), 0.0001);
    }
}
