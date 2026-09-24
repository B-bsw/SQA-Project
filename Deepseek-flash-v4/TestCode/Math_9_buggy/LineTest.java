package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.IntervalsSet;
import org.apache.commons.math3.util.FastMath;
import org.apache.commons.math3.util.Precision;

public class LineTest {

    private Line line;
    private static final double EPS = 1e-10;

    @Before
    public void setUp() {
        // line along x-axis through (1,0,0) and (2,0,0); zero = (0,0,0)
        line = new Line(new Vector3D(1, 0, 0), new Vector3D(2, 0, 0));
    }

    @Test
    public void testConstructorValid() {
        assertEquals(1.0, line.getDirection().getNorm(), EPS);
        assertEquals(0.0, line.getOrigin().getX(), EPS);
        assertEquals(0.0, line.getOrigin().getY(), EPS);
        assertEquals(0.0, line.getOrigin().getZ(), EPS);
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testConstructorEqualPoints() {
        new Line(new Vector3D(1, 1, 1), new Vector3D(1, 1, 1));
    }

    @Test
    public void testCopyConstructor() {
        Line copy = new Line(line);
        assertEquals(line.getDirection(), copy.getDirection());
        assertEquals(line.getOrigin(), copy.getOrigin());
    }

    @Test
    public void testReset() {
        line.reset(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));
        assertEquals(0.0, line.getDirection().getX(), EPS);
        assertEquals(1.0, line.getDirection().getY(), EPS);
        assertTrue(line.contains(new Vector3D(0, 0, 0)));
    }

    @Test(expected = MathIllegalArgumentException.class)
    public void testResetEqualPoints() {
        line.reset(new Vector3D(0, 0, 0), new Vector3D(0, 0, 0));
    }

    @Test
    public void testRevert() {
        Line reverted = line.revert();
        assertEquals(-line.getDirection().getX(), reverted.getDirection().getX(), EPS);
        assertEquals(line.getOrigin().getX(), reverted.getOrigin().getX(), EPS);
    }

    @Test
    public void testGetDirection() {
        Vector3D dir = line.getDirection();
        assertEquals(1.0, dir.getX(), EPS);
        assertEquals(0.0, dir.getY(), EPS);
        assertEquals(0.0, dir.getZ(), EPS);
    }

    @Test
    public void testGetOrigin() {
        Vector3D origin = line.getOrigin();
        assertEquals(0.0, origin.getX(), EPS);
        assertEquals(0.0, origin.getY(), EPS);
        assertEquals(0.0, origin.getZ(), EPS);
    }

    @Test
    public void testGetAbscissa() {
        assertEquals(2.0, line.getAbscissa(new Vector3D(2, 0, 0)), EPS);
        assertEquals(1.0, line.getAbscissa(new Vector3D(1, 0, 0)), EPS);
        assertEquals(1.0, line.getAbscissa(new Vector3D(1, 1, 0)), EPS);
    }

    @Test
    public void testPointAt() {
        Vector3D p = line.pointAt(3.0);
        assertEquals(3.0, p.getX(), EPS);
        assertEquals(0.0, p.getY(), EPS);
        assertEquals(0.0, p.getZ(), EPS);
    }

    @Test
    public void testToSubSpace() {
        Vector1D sub = line.toSubSpace(new Vector3D(2, 0, 0));
        assertEquals(2.0, sub.getX(), EPS);
    }

    @Test
    public void testToSpace() {
        Vector3D p = line.toSpace(new Vector1D(2.0));
        assertEquals(2.0, p.getX(), EPS);
        assertEquals(0.0, p.getY(), EPS);
        assertEquals(0.0, p.getZ(), EPS);
    }

    @Test
    public void testContains() {
        assertTrue(line.contains(new Vector3D(2, 0, 0)));
        assertTrue(line.contains(new Vector3D(0, 0, 0)));
        assertFalse(line.contains(new Vector3D(1, 1, 0)));
    }

    @Test
    public void testDistanceVector() {
        assertEquals(0.0, line.distance(new Vector3D(3, 0, 0)), EPS);
        assertEquals(1.0, line.distance(new Vector3D(1, 1, 0)), EPS);
    }

    @Test
    public void testDistanceLineParallel() {
        Line parallel = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0));
        assertEquals(1.0, line.distance(parallel), EPS);
    }

    @Test
    public void testDistanceLineNonParallel() {
        Line yAxis = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));
        assertEquals(0.0, line.distance(yAxis), EPS);
        Line shiftedY = new Line(new Vector3D(0, 0, 1), new Vector3D(0, 1, 1));
        assertEquals(1.0, line.distance(shiftedY), EPS);
    }

    @Test
    public void testClosestPointParallel() {
        Line parallel = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0));
        Vector3D cp = line.closestPoint(parallel);
        assertEquals(line.getOrigin().getX(), cp.getX(), EPS);
        assertEquals(line.getOrigin().getY(), cp.getY(), EPS);
        assertEquals(line.getOrigin().getZ(), cp.getZ(), EPS);
    }

    @Test
    public void testClosestPointNonParallel() {
        Line yAxis = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));
        Vector3D cp = line.closestPoint(yAxis);
        assertEquals(0.0, cp.getX(), EPS);
        assertEquals(0.0, cp.getY(), EPS);
        assertEquals(0.0, cp.getZ(), EPS);
        Line shiftedY = new Line(new Vector3D(0, 0, 1), new Vector3D(0, 1, 1));
        cp = line.closestPoint(shiftedY);
        assertEquals(0.0, cp.getX(), EPS);
        assertEquals(0.0, cp.getY(), EPS);
        assertEquals(0.0, cp.getZ(), EPS);
    }

    @Test
    public void testIntersectionParallel() {
        Line parallel = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0));
        assertNull(line.intersection(parallel));
    }

    @Test
    public void testIntersectionIntersecting() {
        Line yAxis = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));
        Vector3D inter = line.intersection(yAxis);
        assertNotNull(inter);
        assertEquals(0.0, inter.getX(), EPS);
        assertEquals(0.0, inter.getY(), EPS);
        assertEquals(0.0, inter.getZ(), EPS);
    }

    @Test
    public void testIntersectionSkew() {
        Line skewed = new Line(new Vector3D(0, 0, 1), new Vector3D(0, 1, 1));
        assertNull(line.intersection(skewed));
    }

    @Test
    public void testIsSimilarToSameDirection() {
        Line same = new Line(new Vector3D(1, 0, 0), new Vector3D(2, 0, 0));
        assertTrue(line.isSimilarTo(same));
    }

    @Test
    public void testIsSimilarToOppositeDirection() {
        Line opposite = new Line(new Vector3D(0, 0, 0), new Vector3D(-1, 0, 0));
        assertTrue(line.isSimilarTo(opposite));
    }

    @Test
    public void testIsSimilarToDifferent() {
        Line different = new Line(new Vector3D(0, 0, 0), new Vector3D(0, 1, 0));
        assertFalse(line.isSimilarTo(different));
    }

    @Test
    public void testIsSimilarToParallelOffset() {
        Line offset = new Line(new Vector3D(0, 1, 0), new Vector3D(1, 1, 0));
        assertFalse(line.isSimilarTo(offset));
    }

    @Test
    public void testWholeLine() {
        SubLine whole = line.wholeLine();
        assertNotNull(whole);
    }
}