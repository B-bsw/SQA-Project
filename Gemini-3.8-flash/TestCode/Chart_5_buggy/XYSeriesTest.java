package org.jfree.data.xy;

import org.junit.Test;
import static org.junit.Assert.*;

import org.jfree.data.general.SeriesException;

/**
 * Comprehensive Unit Tests for {@link XYSeries}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class XYSeriesTest {

    @Test
    public void add_withAutoSort_shouldMaintainAscendingOrder() {
        // Arrange
        XYSeries series = new XYSeries("Series1", true, true);

        // Act
        series.add(3.0, 30.0);
        series.add(1.0, 10.0);
        series.add(2.0, 20.0);

        // Assert
        assertEquals(3, series.getItemCount());
        assertEquals(Double.valueOf(1.0), series.getX(0));
        assertEquals(Double.valueOf(10.0), series.getY(0));
        assertEquals(Double.valueOf(2.0), series.getX(1));
        assertEquals(Double.valueOf(20.0), series.getY(1));
        assertEquals(Double.valueOf(3.0), series.getX(2));
        assertEquals(Double.valueOf(30.0), series.getY(2));
    }

    @Test
    public void addOrUpdate_givenExistingAndNewX_shouldUpdateOrInsert() {
        // Arrange
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 100.0);
        series.add(2.0, 200.0);

        // Act - Update existing x = 1.0
        series.addOrUpdate(1.0, 150.0);
        // Act - Insert new x = 3.0
        series.addOrUpdate(3.0, 300.0);

        // Assert
        assertEquals(3, series.getItemCount());
        assertEquals(Double.valueOf(150.0), series.getY(0));
        assertEquals(Double.valueOf(300.0), series.getY(2));
    }

    @Test
    public void addOrUpdate_withAutoSortFalse_shouldOperateCorrectly() {
        // Arrange
        XYSeries series = new XYSeries("Unsorted", false, true);
        series.add(2.0, 20.0);
        series.add(1.0, 10.0);

        // Act
        series.addOrUpdate(1.0, 15.0);
        series.addOrUpdate(3.0, 30.0);

        // Assert
        assertEquals(3, series.getItemCount());
        assertEquals(Double.valueOf(2.0), series.getX(0));
        assertEquals(Double.valueOf(1.0), series.getX(1));
        assertEquals(Double.valueOf(15.0), series.getY(1));
        assertEquals(Double.valueOf(3.0), series.getX(2));
    }

    @Test(expected = SeriesException.class)
    public void add_withNoDuplicatesAllowed_shouldThrowSeriesException() {
        // Arrange
        XYSeries series = new XYSeries("NoDup", true, false);

        // Act
        series.add(1.0, 10.0);
        series.add(1.0, 20.0);
    }

    @Test
    public void deleteAndRemove_shouldRemoveItemsCorrectly() {
        // Arrange
        XYSeries series = new XYSeries("Series");
        series.add(1.0, 10.0);
        series.add(2.0, 20.0);
        series.add(3.0, 30.0);

        // Act - remove by index
        XYDataItem removed = series.remove(1);
        assertEquals(Double.valueOf(2.0), removed.getX());
        assertEquals(2, series.getItemCount());

        // Act - clear all
        series.clear();
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void setMaximumItemCount_shouldPruneOldItems() {
        // Arrange
        XYSeries series = new XYSeries("Limited");
        series.setMaximumItemCount(2);

        // Act
        series.add(1.0, 10.0);
        series.add(2.0, 20.0);
        series.add(3.0, 30.0);

        // Assert
        assertEquals(2, series.getItemCount());
        assertEquals(Double.valueOf(2.0), series.getX(0));
        assertEquals(Double.valueOf(3.0), series.getX(1));
    }

    @Test
    public void toArray_shouldReturn2DCoordinates() {
        // Arrange
        XYSeries series = new XYSeries("Coordinates");
        series.add(1.0, 5.0);
        series.add(2.0, 10.0);

        // Act
        double[][] array = series.toArray();

        // Assert
        assertNotNull(array);
        assertEquals(2, array.length);
        assertEquals(1.0, array[0][0], 0.0001);
        assertEquals(2.0, array[0][1], 0.0001);
        assertEquals(5.0, array[1][0], 0.0001);
        assertEquals(10.0, array[1][1], 0.0001);
    }

    @Test
    public void createCopy_shouldProduceIndependentSubseries() throws Exception {
        // Arrange
        XYSeries series = new XYSeries("Original");
        series.add(1.0, 10.0);
        series.add(2.0, 20.0);
        series.add(3.0, 30.0);

        // Act
        XYSeries copy = series.createCopy(0, 1);

        // Assert
        assertNotNull(copy);
        assertEquals(2, copy.getItemCount());
        assertEquals(Double.valueOf(1.0), copy.getX(0));
        assertEquals(Double.valueOf(2.0), copy.getX(1));
    }

    @Test
    public void equalsAndHashCode_shouldAdhereToContract() {
        // Arrange
        XYSeries s1 = new XYSeries("Key");
        s1.add(1.0, 10.0);

        XYSeries s2 = new XYSeries("Key");
        s2.add(1.0, 10.0);

        XYSeries s3 = new XYSeries("Other");

        // Act & Assert
        assertTrue(s1.equals(s2));
        assertFalse(s1.equals(s3));
        assertEquals(s1.hashCode(), s2.hashCode());
    }
}
