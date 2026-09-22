package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link TimeSeries}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class TimeSeriesTest {

    @Test
    public void addAndGetItemCount_shouldStoreAndCountItems() {
        // Arrange
        TimeSeries series = new TimeSeries("Sales");

        // Act
        series.add(new Year(2024), 100.0);
        series.add(new Year(2025), 200.0);
        series.add(new Year(2026), 300.0);

        // Assert
        assertEquals(3, series.getItemCount());
        assertEquals(Double.valueOf(100.0), series.getValue(0));
        assertEquals(Double.valueOf(200.0), series.getValue(new Year(2025)));
        assertEquals(100.0, series.getMinY(), 0.0001);
        assertEquals(300.0, series.getMaxY(), 0.0001);
    }

    @Test
    public void addOrUpdate_givenExistingPeriod_shouldUpdateValue() {
        // Arrange
        TimeSeries series = new TimeSeries("Temp");
        Year y2026 = new Year(2026);
        series.add(y2026, 25.0);

        // Act
        series.addOrUpdate(y2026, 30.0);

        // Assert
        assertEquals(1, series.getItemCount());
        assertEquals(Double.valueOf(30.0), series.getValue(y2026));
    }

    @Test
    public void deleteAndClear_shouldRemoveItems() {
        // Arrange
        TimeSeries series = new TimeSeries("Data");
        series.add(new Year(2024), 10.0);
        series.add(new Year(2025), 20.0);
        series.add(new Year(2026), 30.0);

        // Act - delete middle item
        series.delete(1, 1);
        assertEquals(2, series.getItemCount());
        assertEquals(new Year(2024), series.getTimePeriod(0));
        assertEquals(new Year(2026), series.getTimePeriod(1));

        // Act - clear all
        series.clear();

        // Assert
        assertEquals(0, series.getItemCount());
    }

    @Test
    public void setMaximumItemCount_shouldRetainOnlyLatestItems() {
        // Arrange
        TimeSeries series = new TimeSeries("Limited");
        series.setMaximumItemCount(2);

        // Act
        series.add(new Year(2024), 1.0);
        series.add(new Year(2025), 2.0);
        series.add(new Year(2026), 3.0);

        // Assert
        assertEquals(2, series.getItemCount());
        assertEquals(new Year(2025), series.getTimePeriod(0));
        assertEquals(new Year(2026), series.getTimePeriod(1));
    }

    @Test
    public void createCopy_shouldProduceIndependentClone() throws Exception {
        // Arrange
        TimeSeries series = new TimeSeries("Original");
        series.add(new Year(2024), 10.0);
        series.add(new Year(2025), 20.0);
        series.add(new Year(2026), 30.0);

        // Act
        TimeSeries copy = series.createCopy(0, 1);

        // Assert
        assertNotNull(copy);
        assertEquals(2, copy.getItemCount());
        assertEquals(Double.valueOf(10.0), copy.getValue(0));
        assertEquals(Double.valueOf(20.0), copy.getValue(1));
    }

    @Test
    public void equalsAndHashCode_shouldAdhereToContract() {
        // Arrange
        TimeSeries s1 = new TimeSeries("Series");
        s1.add(new Year(2026), 50.0);

        TimeSeries s2 = new TimeSeries("Series");
        s2.add(new Year(2026), 50.0);

        TimeSeries s3 = new TimeSeries("Other");

        // Act & Assert
        assertTrue(s1.equals(s2));
        assertFalse(s1.equals(s3));
        assertEquals(s1.hashCode(), s2.hashCode());
    }
}
