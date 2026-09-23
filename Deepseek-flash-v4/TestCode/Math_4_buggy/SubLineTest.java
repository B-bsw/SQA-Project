package org.apache.commons.math3.geometry.euclidean.twod;

import java.util.List;
import org.junit.Test;
import org.junit.Assert;
import org.apache.commons.math3.geometry.euclidean.oned.Interval;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.partitioning.Region.Location;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;

public class SubLineTest {

    @Test
    public void testConstructorFromPointsAndGetSegments() {
        Vector2D start = new Vector2D(0, 0);
        Vector2D end = new Vector2D(10, 0);
        SubLine sub = new SubLine(start, end);
        List<Segment> segments = sub.getSegments();
        Assert.assertEquals(1, segments.size());
        Segment seg = segments.get(0);
        Assert.assertEquals(0.0, seg.getStart().getX(), 1e-12);
        Assert.assertEquals(0.0, seg.getStart().getY(), 1e-12);
        Assert.assertEquals(10.0, seg.getEnd().getX(), 1e-12);
        Assert.assertEquals(0.0, seg.getEnd().getY(), 1e-12);
    }

    @Test
    public void testGetSegmentsWithReversedPoints() {
        Vector2D start = new Vector2D(5, 5);
        Vector2D end = new Vector2D(-3, 5);
        SubLine sub = new SubLine(start, end);
        List<Segment> segments = sub.getSegments();
        Assert.assertEquals(1, segments.size());
        Segment seg = segments.get(0);
        Assert.assertEquals(-3.0, seg.getStart().getX(), 1e-12);
        Assert.assertEquals(5.0, seg.getStart().getY(), 1e-12);
        Assert.assertEquals(5.0, seg.getEnd().getX(), 1e-12);
        Assert.assertEquals(5.0, seg.getEnd().getY(), 1e-12);
    }

    @Test
    public void testGetSegmentsHorizontal() {
        SubLine sub = new SubLine(new Vector2D(0, 0), new Vector2D(1, 0));
        List<Segment> segments = sub.getSegments();
        Assert.assertEquals(1, segments.size());
        Assert.assertEquals(0.0, segments.get(0).getLength(), 1e-12);
    }

    @Test
    public void testIntersectionParallelNonOverlapping() {
        SubLine sub1 = new SubLine(new Vector2D(0, 0), new Vector2D(1, 0));
        SubLine sub2 = new SubLine(new Vector2D(0, 1), new Vector2D(1, 1));
        Assert.assertNull(sub1.intersection(sub2, true));
        Assert.assertNull(sub1.intersection(sub2, false));
    }

    @Test
    public void testIntersectionParallelOverlapping() {
        SubLine sub1 = new SubLine(new Vector2D(0, 0), new Vector2D(2, 0));
        SubLine sub2 = new SubLine(new Vector2D(1, 0), new Vector2D(3, 0));
        Assert.assertNull(sub1.intersection(sub2, true));
        Assert.assertNull(sub1.intersection(sub2, false));
    }

    @Test
    public void testIntersectionIntersectingLines() {
        SubLine sub1 = new SubLine(new Vector2D(0, 0), new Vector2D(2, 2));
        SubLine sub2 = new SubLine(new Vector2D(0, 2), new Vector2D(2, 0));
        Vector2D result = sub1.intersection(sub2, true);
        Assert.assertNotNull(result);
        Assert.assertEquals(1.0, result.getX(), 1e-10);
        Assert.assertEquals(1.0, result.getY(), 1e-10);
    }

    @Test
    public void testIntersectionAtEndpointIncludeEndpointsTrue() {
        SubLine sub1 = new SubLine(new Vector2D(0, 0), new Vector2D(1, 0));
        SubLine sub2 = new SubLine(new Vector2D(1, 0), new Vector2D(2, 0));
        Vector2D result = sub1.intersection(sub2, true);
        Assert.assertNotNull(result);
        Assert.assertEquals(1.0, result.getX(), 1e-10);
        Assert.assertEquals(0.0, result.getY(), 1e-10);
    }

    @Test
    public void testIntersectionAtEndpointIncludeEndpointsFalse() {
        SubLine sub1 = new SubLine(new Vector2D(0, 0), new Vector2D(1, 0));
        SubLine sub2 = new SubLine(new Vector2D(1, 0), new Vector2D(2, 0));
        Assert.assertNull(sub1.intersection(sub2, false));
    }

    @Test
    public void testIntersectionNoIntersectionParallelDifferentPoint() {
        SubLine sub1 = new SubLine(new Vector2D(0, 0), new Vector2D(1, 0));
        SubLine sub2 = new SubLine(new Vector2D(0, 1), new Vector2D(1, 1));
        Assert.assertNull(sub1.intersection(sub2, true));
    }

    @Test
    public void testIntersectionSameLineOverlap() {
        SubLine sub1 = new SubLine(new Vector2D(0, 0), new Vector2D(2, 0));
        SubLine sub2 = new SubLine(new Vector2D(0, 0), new Vector2D(2, 0));
        Vector2D result = sub1.intersection(sub2, true);
        Assert.assertNull(result);
    }

    @Test
    public void testSideParallelLines() {
        SubLine sub = new SubLine(new Vector2D(0, 0), new Vector2D(1, 0));
        Line parallelLine = new Line(new Vector2D(0, 1), new Vector2D(1, 1));
        Side side = sub.side(parallelLine);
        Assert.assertEquals(Side.PLUS, side);
    }

    @Test
    public void testSideParallelLinesNegativeOffset() {
        SubLine sub = new SubLine(new Vector2D(0, 1), new Vector2D(1, 1));
        Line parallelLine = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        Side side = sub.side(parallelLine);
        Assert.assertEquals(Side.MINUS, side);
    }

    @Test
    public void testSideParallelLinesNearlyEqual() {
        SubLine sub = new SubLine(new Vector2D(0, 0), new Vector2D(1, 0));
        Line parallelLine = new Line(new Vector2D(0, 1e-11), new Vector2D(1, 1e-11));
        Side side = sub.side(parallelLine);
        Assert.assertEquals(Side.HYPER, side);
    }

    @Test
    public void testSideIntersectingLinesDirect() {
        SubLine sub1 = new SubLine(new Vector2D(0, 0), new Vector2D(2, 2));
        SubLine sub2 = new SubLine(new Vector2D(0, 2), new Vector2D(2, 0));
        Side side = sub1.side(sub2.getHyperplane());
        Assert.assertNotNull(side);
        Assert.assertEquals(Side.PLUS, side);
    }

    @Test
    public void testSplitParallelLine() {
        SubLine thisSub = new SubLine(new Vector2D(0, 0), new Vector2D(2, 0));
        Line otherLine = new Line(new Vector2D(0, 1), new Vector2D(1, 1));
        SubHyperplane.SplitSubHyperplane<Euclidean2D> split = thisSub.split(otherLine);
        Assert.assertNotNull(split);
        Assert.assertNotNull(split.getPlus());
        Assert.assertNull(split.getMinus());
    }

    @Test
    public void testSplitIntersectingLine() {
        SubLine thisSub = new SubLine(new Vector2D(0, 0), new Vector2D(2, 2));
        Line otherLine = new Line(new Vector2D(0, 2), new Vector2D(2, 0));
        SubHyperplane.SplitSubHyperplane<Euclidean2D> split = thisSub.split(otherLine);
        Assert.assertNotNull(split);
        Assert.assertNotNull(split.getPlus());
        Assert.assertNotNull(split.getMinus());
    }

    @Test
    public void testSplitParallelNonIntersecting() {
        SubLine thisSub = new SubLine(new Vector2D(0, 0), new Vector2D(2, 0));
        Line otherLine = new Line(new Vector2D(0, 1), new Vector2D(1, 1));
        SubHyperplane.SplitSubHyperplane<Euclidean2D> split = thisSub.split(otherLine);
        Assert.assertEquals(Side.PLUS, split.getSide());
    }

    @Test
    public void testBuildIntervalSetWithNegativeDirection() {
        Vector2D start = new Vector2D(5, 0);
        Vector2D end = new Vector2D(-5, 0);
        SubLine sub = new SubLine(start, end);
        List<Segment> segments = sub.getSegments();
        Assert.assertEquals(1, segments.size());
        Assert.assertEquals(-5.0, segments.get(0).getStart().getX(), 1e-12);
        Assert.assertEquals(5.0, segments.get(0).getEnd().getX(), 1e-12);
    }

    @Test
    public void testGetSegmentsVerticalLine() {
        SubLine sub = new SubLine(new Vector2D(0, 0), new Vector2D(0, 10));
        List<Segment> segments = sub.getSegments();
        Assert.assertEquals(1, segments.size());
        Assert.assertEquals(0.0, segments.get(0).getStart().getX(), 1e-12);
        Assert.assertEquals(0.0, segments.get(0).getStart().getY(), 1e-12);
        Assert.assertEquals(10.0, segments.get(0).getEnd().getY(), 1e-12);
    }

    @Test
    public void testIntersectionPerpendicular() {
        SubLine sub1 = new SubLine(new Vector2D(-1, 0), new Vector2D(1, 0));
        SubLine sub2 = new SubLine(new Vector2D(0, -1), new Vector2D(0, 1));
        Vector2D result = sub1.intersection(sub2, true);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getX(), 1e-10);
        Assert.assertEquals(0.0, result.getY(), 1e-10);
    }

    @Test
    public void testSideIntersectingLinesDirectWrap() {
        SubLine sub1 = new SubLine(new Vector2D(0, 0), new Vector2D(2, 2));
        SubLine sub2 = new SubLine(new Vector2D(0, 2), new Vector2D(-2, 0));
        Side side = sub1.side(sub2.getHyperplane());
        Assert.assertNotNull(side);
        Assert.assertEquals(Side.PLUS, side);
    }

    @Test
    public void testIntersectionWithEmptyLine() {
        SubLine sub1 = new SubLine(new Vector2D(0, 0), new Vector2D(2, 0));
        SubLine sub2 = new SubLine(new Vector2D(3, 0), new Vector2D(4, 0));
        Assert.assertNull(sub1.intersection(sub2, true));
        Assert.assertNull(sub1.intersection(sub2, false));
    }
}