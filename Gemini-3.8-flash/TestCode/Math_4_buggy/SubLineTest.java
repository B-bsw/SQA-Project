package org.apache.commons.math3.geometry.euclidean.threed;

import java.util.List;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Interval;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.junit.Assert;
import org.junit.Test;

public class SubLineTest {

    private static final double EPSILON = 1.0e-10;

    @Test
    public void constructor_givenTwoDistinctPoints_shouldCreateValidSubLine() {
        // Arrange
        Vector3D p1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D p2 = new Vector3D(4.0, 5.0, 6.0);

        // Act
        SubLine subLine = new SubLine(p1, p2);
        List<Segment> segments = subLine.getSegments();

        // Assert
        Assert.assertNotNull(segments);
        Assert.assertEquals(1, segments.size());
        Segment segment = segments.get(0);
        Assert.assertEquals(0.0, p1.distance(segment.getStart()), EPSILON);
        Assert.assertEquals(0.0, p2.distance(segment.getEnd()), EPSILON);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void constructor_givenIdenticalPoints_shouldThrowMathIllegalArgumentException() {
        // Arrange
        Vector3D p = new Vector3D(1.0, 2.0, 3.0);

        // Act & Assert
        new SubLine(p, p);
    }

    @Test
    public void constructor_givenValidSegment_shouldCreateValidSubLine() {
        // Arrange
        Vector3D p1 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(2.0, 0.0, 0.0);
        Line line = new Line(p1, p2);
        Segment segment = new Segment(p1, p2, line);

        // Act
        SubLine subLine = new SubLine(segment);
        List<Segment> segments = subLine.getSegments();

        // Assert
        Assert.assertNotNull(segments);
        Assert.assertEquals(1, segments.size());
        Segment resultSegment = segments.get(0);
        Assert.assertEquals(0.0, p1.distance(resultSegment.getStart()), EPSILON);
        Assert.assertEquals(0.0, p2.distance(resultSegment.getEnd()), EPSILON);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void constructor_givenSegmentWithIdenticalPoints_shouldThrowMathIllegalArgumentException() {
        // Arrange
        Vector3D p1 = new Vector3D(1.0, 1.0, 1.0);
        Vector3D dummy = new Vector3D(2.0, 1.0, 1.0);
        Line line = new Line(p1, dummy);
        Segment degenerateSegment = new Segment(p1, p1, line);

        // Act & Assert
        new SubLine(degenerateSegment);
    }

    @Test
    public void constructor_givenLineAndIntervalsSet_shouldInitializeProperly() {
        // Arrange
        Vector3D p1 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(1.0, 0.0, 0.0);
        Line line = new Line(p1, p2);
        IntervalsSet set = new IntervalsSet(0.0, 1.0);

        // Act
        SubLine subLine = new SubLine(line, set);
        List<Segment> segments = subLine.getSegments();

        // Assert
        Assert.assertNotNull(segments);
        Assert.assertEquals(1, segments.size());
        Assert.assertEquals(0.0, line.toSpace(new Vector1D(0.0)).distance(segments.get(0).getStart()), EPSILON);
        Assert.assertEquals(0.0, line.toSpace(new Vector1D(1.0)).distance(segments.get(0).getEnd()), EPSILON);
    }

    @Test
    public void getSegments_givenEmptyIntervalsSet_shouldReturnEmptyList() {
        // Arrange
        Vector3D p1 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(1.0, 0.0, 0.0);
        Line line = new Line(p1, p2);
        BSPTree<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D> emptyTree =
            new BSPTree<org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D>(Boolean.FALSE);
        IntervalsSet emptyIntervals = new IntervalsSet(emptyTree);

        // Act
        SubLine subLine = new SubLine(line, emptyIntervals);
        List<Segment> segments = subLine.getSegments();

        // Assert
        Assert.assertNotNull(segments);
        Assert.assertTrue(segments.isEmpty());
    }

    @Test
    public void getSegments_givenUnboundedIntervalsSet_shouldReturnSegmentWithInfiniteCoordinates() {
        // Arrange
        Vector3D p1 = new Vector3D(0.0, 0.0, 0.0);
        Vector3D p2 = new Vector3D(1.0, 0.0, 0.0);
        Line line = new Line(p1, p2);
        IntervalsSet wholeLine = new IntervalsSet();

        // Act
        SubLine subLine = new SubLine(line, wholeLine);
        List<Segment> segments = subLine.getSegments();

        // Assert
        Assert.assertNotNull(segments);
        Assert.assertEquals(1, segments.size());
        Segment segment = segments.get(0);
        Assert.assertTrue(Double.isInfinite(segment.getStart().getX()));
        Assert.assertTrue(Double.isInfinite(segment.getEnd().getX()));
    }

    @Test
    public void intersection_givenCrossingInsideInside_includeEndPointsTrue_shouldReturnIntersection() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(-2.0, 0.0, 0.0), new Vector3D(2.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(0.0, -2.0, 0.0), new Vector3D(0.0, 2.0, 0.0));

        // Act
        Vector3D result = sub1.intersection(sub2, true);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getX(), EPSILON);
        Assert.assertEquals(0.0, result.getY(), EPSILON);
        Assert.assertEquals(0.0, result.getZ(), EPSILON);
    }

    @Test
    public void intersection_givenCrossingInsideInside_includeEndPointsFalse_shouldReturnIntersection() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(-2.0, 0.0, 0.0), new Vector3D(2.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(0.0, -2.0, 0.0), new Vector3D(0.0, 2.0, 0.0));

        // Act
        Vector3D result = sub1.intersection(sub2, false);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getX(), EPSILON);
        Assert.assertEquals(0.0, result.getY(), EPSILON);
        Assert.assertEquals(0.0, result.getZ(), EPSILON);
    }

    @Test
    public void intersection_givenCrossingAtEndpoint_includeEndPointsTrue_shouldReturnIntersection() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(0.0, 0.0, 0.0), new Vector3D(2.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(0.0, -2.0, 0.0), new Vector3D(0.0, 2.0, 0.0));

        // Act
        Vector3D result = sub1.intersection(sub2, true);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getX(), EPSILON);
        Assert.assertEquals(0.0, result.getY(), EPSILON);
        Assert.assertEquals(0.0, result.getZ(), EPSILON);
    }

    @Test
    public void intersection_givenCrossingAtEndpoint_includeEndPointsFalse_shouldReturnNull() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(0.0, 0.0, 0.0), new Vector3D(2.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(0.0, -2.0, 0.0), new Vector3D(0.0, 2.0, 0.0));

        // Act
        Vector3D result = sub1.intersection(sub2, false);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void intersection_givenCrossingAtBothEndpoints_includeEndPointsTrue_shouldReturnIntersection() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(0.0, 0.0, 0.0), new Vector3D(2.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(0.0, 0.0, 0.0), new Vector3D(0.0, 2.0, 0.0));

        // Act
        Vector3D result = sub1.intersection(sub2, true);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getX(), EPSILON);
        Assert.assertEquals(0.0, result.getY(), EPSILON);
        Assert.assertEquals(0.0, result.getZ(), EPSILON);
    }

    @Test
    public void intersection_givenCrossingAtBothEndpoints_includeEndPointsFalse_shouldReturnNull() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(0.0, 0.0, 0.0), new Vector3D(2.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(0.0, 0.0, 0.0), new Vector3D(0.0, 2.0, 0.0));

        // Act
        Vector3D result = sub1.intersection(sub2, false);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void intersection_givenFirstInsideSecondOutside_includeEndPointsTrue_shouldReturnNull() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(-2.0, 0.0, 0.0), new Vector3D(2.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(0.0, 1.0, 0.0), new Vector3D(0.0, 3.0, 0.0));

        // Act
        Vector3D result = sub1.intersection(sub2, true);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void intersection_givenFirstInsideSecondOutside_includeEndPointsFalse_shouldReturnNull() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(-2.0, 0.0, 0.0), new Vector3D(2.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(0.0, 1.0, 0.0), new Vector3D(0.0, 3.0, 0.0));

        // Act
        Vector3D result = sub1.intersection(sub2, false);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void intersection_givenFirstOutsideSecondInside_includeEndPointsTrue_shouldReturnNull() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(1.0, 0.0, 0.0), new Vector3D(3.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(0.0, -2.0, 0.0), new Vector3D(0.0, 2.0, 0.0));

        // Act
        Vector3D result = sub1.intersection(sub2, true);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void intersection_givenBothOutside_includeEndPointsTrue_shouldReturnNull() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(1.0, 0.0, 0.0), new Vector3D(3.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(0.0, 1.0, 0.0), new Vector3D(0.0, 3.0, 0.0));

        // Act
        Vector3D result = sub1.intersection(sub2, true);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void intersection_givenFirstBoundarySecondOutside_includeEndPointsTrue_shouldReturnNull() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(0.0, 0.0, 0.0), new Vector3D(2.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(0.0, 1.0, 0.0), new Vector3D(0.0, 3.0, 0.0));

        // Act
        Vector3D result = sub1.intersection(sub2, true);

        // Assert
        Assert.assertNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void intersection_givenParallelDisjointLines_shouldThrowNullPointerException() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(0.0, 1.0, 0.0), new Vector3D(1.0, 1.0, 0.0));

        // Act & Assert
        // Underlying Line.intersection returns null for parallel lines, causing NullPointerException
        sub1.intersection(sub2, true);
    }

    @Test(expected = NullPointerException.class)
    public void intersection_givenSkewLines_shouldThrowNullPointerException() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(0.0, 0.0, 0.0), new Vector3D(1.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(0.0, 1.0, 1.0), new Vector3D(0.0, 2.0, 1.0));

        // Act & Assert
        // Skew lines do not intersect, line.intersection returns null
        sub1.intersection(sub2, true);
    }

    @Test
    public void intersection_givenCollinearOverlappingLines_includeEndPointsTrue_shouldReturnOverlapPoint() {
        // Arrange
        SubLine sub1 = new SubLine(new Vector3D(0.0, 0.0, 0.0), new Vector3D(2.0, 0.0, 0.0));
        SubLine sub2 = new SubLine(new Vector3D(1.0, 0.0, 0.0), new Vector3D(3.0, 0.0, 0.0));

        // Act
        Vector3D result = sub1.intersection(sub2, true);

        // Assert
        // Identical infinite lines return the origin of the line in Line.intersection
        Assert.assertNotNull(result);
    }
}