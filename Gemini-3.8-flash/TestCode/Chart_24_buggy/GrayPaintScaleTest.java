package org.jfree.chart.renderer;

import java.awt.Color;
import java.awt.Paint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test suite for {@link GrayPaintScale}.
 */
public class GrayPaintScaleTest {

    private static final double EPSILON = 0.000000001;

    @Test
    public void constructor_givenDefaultParameters_shouldSetDefaultBounds() {
        // Arrange & Act
        GrayPaintScale scale = new GrayPaintScale();

        // Assert
        Assert.assertEquals(0.0, scale.getLowerBound(), EPSILON);
        Assert.assertEquals(1.0, scale.getUpperBound(), EPSILON);
    }

    @Test
    public void constructor_givenValidBounds_shouldInitializeCorrectly() {
        // Arrange & Act
        GrayPaintScale scale = new GrayPaintScale(-10.0, 20.0);

        // Assert
        Assert.assertEquals(-10.0, scale.getLowerBound(), EPSILON);
        Assert.assertEquals(20.0, scale.getUpperBound(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenLowerBoundEqualsUpperBound_shouldThrowException() {
        // Arrange, Act & Assert
        new GrayPaintScale(5.0, 5.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenLowerBoundGreaterThanUpperBound_shouldThrowException() {
        // Arrange, Act & Assert
        new GrayPaintScale(10.0, 5.0);
    }

    @Test
    public void getLowerBound_givenInstance_shouldReturnLowerBound() {
        // Arrange
        GrayPaintScale scale = new GrayPaintScale(2.5, 7.5);

        // Act
        double lower = scale.getLowerBound();

        // Assert
        Assert.assertEquals(2.5, lower, EPSILON);
    }

    @Test
    public void getUpperBound_givenInstance_shouldReturnUpperBound() {
        // Arrange
        GrayPaintScale scale = new GrayPaintScale(2.5, 7.5);

        // Act
        double upper = scale.getUpperBound();

        // Assert
        Assert.assertEquals(7.5, upper, EPSILON);
    }

    @Test
    public void getPaint_givenLowerBoundValue_shouldReturnBlack() {
        // Arrange
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);

        // Act
        Paint paint = scale.getPaint(0.0);

        // Assert
        Assert.assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        Assert.assertEquals(new Color(0, 0, 0), color);
    }

    @Test
    public void getPaint_givenUpperBoundValue_shouldReturnWhite() {
        // Arrange
        GrayPaintScale scale = new GrayPaintScale(0.0, 1.0);

        // Act
        Paint paint = scale.getPaint(1.0);

        // Assert
        Assert.assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        Assert.assertEquals(new Color(255, 255, 255), color);
    }

    @Test
    public void getPaint_givenMidPointValue_shouldReturnMidGray() {
        // Arrange
        GrayPaintScale scale = new GrayPaintScale(0.0, 100.0);

        // Act
        Paint paint = scale.getPaint(50.0);

        // Assert
        Assert.assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        Assert.assertEquals(new Color(127, 127, 127), color);
    }

    @Test
    public void getPaint_givenNegativeRange_shouldCalculateCorrectShade() {
        // Arrange
        GrayPaintScale scale = new GrayPaintScale(-100.0, 0.0);

        // Act
        Paint paint = scale.getPaint(-50.0);

        // Assert
        Assert.assertTrue(paint instanceof Color);
        Color color = (Color) paint;
        Assert.assertEquals(new Color(127, 127, 127), color);
    }

    @Test
    public void equals_givenSameReference_shouldReturnTrue() {
        // Arrange
        GrayPaintScale scale = new GrayPaintScale(10.0, 20.0);

        // Act & Assert
        Assert.assertTrue(scale.equals(scale));
    }

    @Test
    public void equals_givenNull_shouldReturnFalse() {
        // Arrange
        GrayPaintScale scale = new GrayPaintScale(10.0, 20.0);

        // Act & Assert
        Assert.assertFalse(scale.equals(null));
    }

    @Test
    public void equals_givenDifferentClass_shouldReturnFalse() {
        // Arrange
        GrayPaintScale scale = new GrayPaintScale(10.0, 20.0);

        // Act & Assert
        Assert.assertFalse(scale.equals("NotAGrayPaintScale"));
    }

    @Test
    public void equals_givenIdenticalAttributes_shouldReturnTrue() {
        // Arrange
        GrayPaintScale scale1 = new GrayPaintScale(5.0, 15.0);
        GrayPaintScale scale2 = new GrayPaintScale(5.0, 15.0);

        // Act & Assert
        Assert.assertTrue(scale1.equals(scale2));
        Assert.assertTrue(scale2.equals(scale1));
    }

    @Test
    public void equals_givenDifferentLowerBound_shouldReturnFalse() {
        // Arrange
        GrayPaintScale scale1 = new GrayPaintScale(5.0, 15.0);
        GrayPaintScale scale2 = new GrayPaintScale(6.0, 15.0);

        // Act & Assert
        Assert.assertFalse(scale1.equals(scale2));
    }

    @Test
    public void equals_givenDifferentUpperBound_shouldReturnFalse() {
        // Arrange
        GrayPaintScale scale1 = new GrayPaintScale(5.0, 15.0);
        GrayPaintScale scale2 = new GrayPaintScale(5.0, 16.0);

        // Act & Assert
        Assert.assertFalse(scale1.equals(scale2));
    }

    @Test
    public void clone_givenInstance_shouldReturnClonedCopy() throws CloneNotSupportedException {
        // Arrange
        GrayPaintScale original = new GrayPaintScale(10.0, 50.0);

        // Act
        GrayPaintScale cloned = (GrayPaintScale) original.clone();

        // Assert
        Assert.assertNotSame(original, cloned);
        Assert.assertEquals(original.getClass(), cloned.getClass());
        Assert.assertEquals(original, cloned);
        Assert.assertEquals(original.getLowerBound(), cloned.getLowerBound(), EPSILON);
        Assert.assertEquals(original.getUpperBound(), cloned.getUpperBound(), EPSILON);
    }

    @Test
    public void serialization_givenInstance_shouldSerializeAndDeserializeCorrectly() throws Exception {
        // Arrange
        GrayPaintScale scale1 = new GrayPaintScale(10.0, 20.0);

        // Act
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(scale1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        GrayPaintScale scale2 = (GrayPaintScale) in.readObject();
        in.close();

        // Assert
        Assert.assertNotSame(scale1, scale2);
        Assert.assertEquals(scale1, scale2);
        Assert.assertEquals(scale1.getLowerBound(), scale2.getLowerBound(), EPSILON);
        Assert.assertEquals(scale1.getUpperBound(), scale2.getUpperBound(), EPSILON);
    }
}