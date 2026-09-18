package org.jfree.chart.plot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.jfree.chart.event.MarkerChangeEvent;
import org.jfree.chart.event.MarkerChangeListener;
import org.junit.Assert;
import org.junit.Test;

public class ValueMarkerTest {

    private static class CustomMarkerChangeListener implements MarkerChangeListener {
        private boolean notified;
        private MarkerChangeEvent event;

        public CustomMarkerChangeListener() {
            this.notified = false;
            this.event = null;
        }

        public void markerChanged(MarkerChangeEvent event) {
            this.notified = true;
            this.event = event;
        }

        public boolean isNotified() {
            return this.notified;
        }

        public MarkerChangeEvent getEvent() {
            return this.event;
        }
    }

    @Test
    public void constructor_givenSingleValue_shouldInitializeCorrectly() {
        // Arrange & Act
        double expectedValue = 50.0;
        ValueMarker marker = new ValueMarker(expectedValue);

        // Assert
        Assert.assertEquals(expectedValue, marker.getValue(), 0.000001);
    }

    @Test
    public void constructor_givenThreeParams_shouldInitializeCorrectly() {
        // Arrange
        double expectedValue = 25.5;
        Paint paint = Color.RED;
        Stroke stroke = new BasicStroke(1.5f);

        // Act
        ValueMarker marker = new ValueMarker(expectedValue, paint, stroke);

        // Assert
        Assert.assertEquals(expectedValue, marker.getValue(), 0.000001);
        Assert.assertEquals(paint, marker.getPaint());
        Assert.assertEquals(stroke, marker.getStroke());
        Assert.assertEquals(paint, marker.getOutlinePaint());
        Assert.assertEquals(stroke, marker.getOutlineStroke());
        Assert.assertEquals(1.0f, marker.getAlpha(), 0.000001f);
    }

    @Test
    public void constructor_givenAllParams_shouldInitializeCorrectly() {
        // Arrange
        double expectedValue = 75.25;
        Paint paint = Color.BLUE;
        Stroke stroke = new BasicStroke(2.0f);
        Paint outlinePaint = Color.YELLOW;
        Stroke outlineStroke = new BasicStroke(0.5f);
        float alpha = 0.8f;

        // Act
        ValueMarker marker = new ValueMarker(expectedValue, paint, stroke, outlinePaint, outlineStroke, alpha);

        // Assert
        Assert.assertEquals(expectedValue, marker.getValue(), 0.000001);
        Assert.assertEquals(paint, marker.getPaint());
        Assert.assertEquals(stroke, marker.getStroke());
        Assert.assertEquals(outlinePaint, marker.getOutlinePaint());
        Assert.assertEquals(outlineStroke, marker.getOutlineStroke());
        Assert.assertEquals(alpha, marker.getAlpha(), 0.000001f);
    }

    @Test
    public void getValue_givenValueMarker_shouldReturnCurrentValue() {
        // Arrange
        double expectedValue = -123.456;
        ValueMarker marker = new ValueMarker(expectedValue);

        // Act
        double actualValue = marker.getValue();

        // Assert
        Assert.assertEquals(expectedValue, actualValue, 0.000001);
    }

    @Test
    public void setValue_givenNewValue_shouldUpdateValueAndNotifyListeners() {
        // Arrange
        ValueMarker marker = new ValueMarker(10.0);
        CustomMarkerChangeListener listener = new CustomMarkerChangeListener();
        marker.addChangeListener(listener);

        double newValue = 99.9;

        // Act
        marker.setValue(newValue);

        // Assert
        Assert.assertEquals(newValue, marker.getValue(), 0.000001);
        Assert.assertTrue(listener.isNotified());
        Assert.assertNotNull(listener.getEvent());
        Assert.assertSame(marker, listener.getEvent().getMarker());
    }

    @Test
    public void setValue_givenSameValue_shouldStillNotifyListeners() {
        // Arrange
        double value = 42.0;
        ValueMarker marker = new ValueMarker(value);
        CustomMarkerChangeListener listener = new CustomMarkerChangeListener();
        marker.addChangeListener(listener);

        // Act
        marker.setValue(value);

        // Assert
        Assert.assertEquals(value, marker.getValue(), 0.000001);
        Assert.assertTrue(listener.isNotified());
    }

    @Test
    public void setValue_givenBoundaryValues_shouldStoreCorrectly() {
        // Arrange
        ValueMarker marker = new ValueMarker(0.0);

        // Act & Assert: Double.MAX_VALUE
        marker.setValue(Double.MAX_VALUE);
        Assert.assertEquals(Double.MAX_VALUE, marker.getValue(), 0.0);

        // Act & Assert: Double.MIN_VALUE
        marker.setValue(Double.MIN_VALUE);
        Assert.assertEquals(Double.MIN_VALUE, marker.getValue(), 0.0);

        // Act & Assert: Double.POSITIVE_INFINITY
        marker.setValue(Double.POSITIVE_INFINITY);
        Assert.assertTrue(Double.isInfinite(marker.getValue()));
        Assert.assertTrue(marker.getValue() > 0);

        // Act & Assert: Double.NEGATIVE_INFINITY
        marker.setValue(Double.NEGATIVE_INFINITY);
        Assert.assertTrue(Double.isInfinite(marker.getValue()));
        Assert.assertTrue(marker.getValue() < 0);

        // Act & Assert: Double.NaN
        marker.setValue(Double.NaN);
        Assert.assertTrue(Double.isNaN(marker.getValue()));
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        // Arrange
        ValueMarker marker = new ValueMarker(10.0);

        // Act & Assert
        Assert.assertTrue(marker.equals(marker));
    }

    @Test
    public void equals_givenNull_shouldReturnFalse() {
        // Arrange
        ValueMarker marker = new ValueMarker(10.0);

        // Act & Assert
        Assert.assertFalse(marker.equals(null));
    }

    @Test
    public void equals_givenDifferentClass_shouldReturnFalse() {
        // Arrange
        ValueMarker marker = new ValueMarker(10.0);
        String otherObject = "Not a ValueMarker";

        // Act & Assert
        Assert.assertFalse(marker.equals(otherObject));
    }

    @Test
    public void equals_givenIdenticalObjects_shouldReturnTrue() {
        // Arrange
        ValueMarker marker1 = new ValueMarker(15.0, Color.BLUE, new BasicStroke(1.0f));
        ValueMarker marker2 = new ValueMarker(15.0, Color.BLUE, new BasicStroke(1.0f));

        // Act & Assert
        Assert.assertTrue(marker1.equals(marker2));
        Assert.assertTrue(marker2.equals(marker1));
        Assert.assertEquals(marker1.hashCode(), marker2.hashCode());
    }

    @Test
    public void equals_givenDifferentValue_shouldReturnFalse() {
        // Arrange
        ValueMarker marker1 = new ValueMarker(15.0, Color.BLUE, new BasicStroke(1.0f));
        ValueMarker marker2 = new ValueMarker(15.1, Color.BLUE, new BasicStroke(1.0f));

        // Act & Assert
        Assert.assertFalse(marker1.equals(marker2));
        Assert.assertFalse(marker2.equals(marker1));
    }

    @Test
    public void equals_givenDifferentPaint_shouldReturnFalse() {
        // Arrange
        ValueMarker marker1 = new ValueMarker(15.0, Color.BLUE, new BasicStroke(1.0f));
        ValueMarker marker2 = new ValueMarker(15.0, Color.RED, new BasicStroke(1.0f));

        // Act & Assert
        Assert.assertFalse(marker1.equals(marker2));
        Assert.assertFalse(marker2.equals(marker1));
    }

    @Test
    public void equals_givenDifferentStroke_shouldReturnFalse() {
        // Arrange
        ValueMarker marker1 = new ValueMarker(15.0, Color.BLUE, new BasicStroke(1.0f));
        ValueMarker marker2 = new ValueMarker(15.0, Color.BLUE, new BasicStroke(2.0f));

        // Act & Assert
        Assert.assertFalse(marker1.equals(marker2));
        Assert.assertFalse(marker2.equals(marker1));
    }

    @Test
    public void equals_givenDifferentOutlinePaint_shouldReturnFalse() {
        // Arrange
        ValueMarker marker1 = new ValueMarker(15.0, Color.BLUE, new BasicStroke(1.0f), Color.GREEN, new BasicStroke(1.0f), 1.0f);
        ValueMarker marker2 = new ValueMarker(15.0, Color.BLUE, new BasicStroke(1.0f), Color.BLACK, new BasicStroke(1.0f), 1.0f);

        // Act & Assert
        Assert.assertFalse(marker1.equals(marker2));
        Assert.assertFalse(marker2.equals(marker1));
    }

    @Test
    public void equals_givenDifferentOutlineStroke_shouldReturnFalse() {
        // Arrange
        ValueMarker marker1 = new ValueMarker(15.0, Color.BLUE, new BasicStroke(1.0f), Color.GREEN, new BasicStroke(1.0f), 1.0f);
        ValueMarker marker2 = new ValueMarker(15.0, Color.BLUE, new BasicStroke(1.0f), Color.GREEN, new BasicStroke(2.0f), 1.0f);

        // Act & Assert
        Assert.assertFalse(marker1.equals(marker2));
        Assert.assertFalse(marker2.equals(marker1));
    }

    @Test
    public void equals_givenDifferentAlpha_shouldReturnFalse() {
        // Arrange
        ValueMarker marker1 = new ValueMarker(15.0, Color.BLUE, new BasicStroke(1.0f), Color.GREEN, new BasicStroke(1.0f), 0.5f);
        ValueMarker marker2 = new ValueMarker(15.0, Color.BLUE, new BasicStroke(1.0f), Color.GREEN, new BasicStroke(1.0f), 0.8f);

        // Act & Assert
        Assert.assertFalse(marker1.equals(marker2));
        Assert.assertFalse(marker2.equals(marker1));
    }

    @Test
    public void clone_givenValidMarker_shouldProduceEqualClone() throws CloneNotSupportedException {
        // Arrange
        ValueMarker original = new ValueMarker(45.0, Color.RED, new BasicStroke(1.2f));

        // Act
        ValueMarker copy = (ValueMarker) original.clone();

        // Assert
        Assert.assertNotSame(original, copy);
        Assert.assertSame(original.getClass(), copy.getClass());
        Assert.assertEquals(original, copy);
        Assert.assertEquals(original.getValue(), copy.getValue(), 0.000001);
    }

    @Test
    public void serialization_givenValidMarker_shouldSerializeAndDeserializeCorrectly() throws Exception {
        // Arrange
        ValueMarker original = new ValueMarker(88.8, Color.MAGENTA, new BasicStroke(1.0f));
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);

        // Act
        out.writeObject(original);
        out.close();

        ByteArrayInputStream inBuffer = new ByteArrayInputStream(buffer.toByteArray());
        ObjectInputStream in = new ObjectInputStream(inBuffer);
        ValueMarker deserialized = (ValueMarker) in.readObject();
        in.close();

        // Assert
        Assert.assertNotSame(original, deserialized);
        Assert.assertEquals(original, deserialized);
        Assert.assertEquals(original.getValue(), deserialized.getValue(), 0.000001);
    }
}