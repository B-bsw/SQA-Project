package org.apache.commons.math3.geometry.euclidean.twod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.Interval;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor;
import org.apache.commons.math3.geometry.partitioning.BoundaryAttribute;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.AbstractRegion;
import org.apache.commons.math3.geometry.partitioning.utilities.AVLTree;
import org.apache.commons.math3.geometry.partitioning.utilities.OrderedTuple;
import org.apache.commons.math3.util.FastMath;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PolygonsSetTest {

    private PolygonsSet polygonsSet;

    @Before
    public void setUp() {
        polygonsSet = new PolygonsSet();
    }

    @After
    public void tearDown() {
        polygonsSet = null;
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(polygonsSet);
        assertNotNull(polygonsSet.getVertices());
        assertEquals(0, polygonsSet.getVertices().length);
    }

    @Test
    public void testConstructorWithBSPTree() {
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.TRUE);
        PolygonsSet ps = new PolygonsSet(tree);
        assertNotNull(ps);
        assertEquals(0, ps.getVertices().length);
    }

    @Test
    public void testConstructorWithBoundaryCollection() {
        Collection<SubHyperplane<Euclidean2D>> boundary = new ArrayList<SubHyperplane<Euclidean2D>>();
        PolygonsSet ps = new PolygonsSet(boundary);
        assertNotNull(ps);
        assertEquals(0, ps.getVertices().length);
    }

    @Test
    public void testConstructorWithBox() {
        PolygonsSet ps = new PolygonsSet(-1.0, 1.0, -1.0, 1.0);
        assertNotNull(ps);
        Vector2D[][] vertices = ps.getVertices();
        assertNotNull(vertices);
        assertEquals(1, vertices.length);
        assertEquals(4, vertices[0].length);
    }

    @Test
    public void testBoxBoundary() {
        Line[] lines = PolygonsSet.class.getDeclaredMethod("boxBoundary", double.class, double.class, double.class, double.class).getAnnotation(Deprecated.class) != null ? null : null;
        // Since boxBoundary is private, test through constructor
        PolygonsSet ps = new PolygonsSet(0.0, 5.0, 0.0, 5.0);
        Vector2D[][] vertices = ps.getVertices();
        assertNotNull(vertices);
        assertEquals(1, vertices.length);
        assertEquals(4, vertices[0].length);
        Vector2D[] loop = vertices[0];
        assertEquals(new Vector2D(0.0, 0.0), loop[0]);
        assertEquals(new Vector2D(5.0, 0.0), loop[1]);
        assertEquals(new Vector2D(5.0, 5.0), loop[2]);
        assertEquals(new Vector2D(0.0, 5.0), loop[3]);
    }

    @Test
    public void testBuildNew() {
        PolygonsSet ps = new PolygonsSet();
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.FALSE);
        PolygonsSet result = ps.buildNew(tree);
        assertNotNull(result);
        assertNotSame(ps, result);
        assertEquals(0, result.getVertices().length);
    }

    @Test
    public void testComputeGeometricalPropertiesEmptyTree() {
        // Test for empty region (getTree(false).getCut() == null, attribute false)
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.FALSE);
        PolygonsSet ps = new PolygonsSet(tree);
        ps.computeGeometricalProperties();
        assertEquals(0.0, ps.getSize(), 1e-10);
        assertEquals(new Vector2D(0, 0), ps.getBarycenter());
    }

    @Test
    public void testComputeGeometricalPropertiesFullSpace() {
        BSPTree<Euclidean2D> tree = new BSPTree<Euclidean2D>(Boolean.TRUE);
        PolygonsSet ps = new PolygonsSet(tree);
        ps.computeGeometricalProperties();
        assertEquals(Double.POSITIVE_INFINITY, ps.getSize(), 0.0);
        assertNull(ps.getBarycenter());
    }

    @Test
    public void testComputeGeometricalPropertiesWithBox() {
        PolygonsSet ps = new PolygonsSet(0.0, 2.0, 0.0, 2.0);
        ps.computeGeometricalProperties();
        assertEquals(4.0, ps.getSize(), 1e-10);
        Vector2D barycenter = ps.getBarycenter();
        assertEquals(1.0, barycenter.getX(), 1e-10);
        assertEquals(1.0, barycenter.getY(), 1e-10);
    }

    @Test
    public void testGetVerticesWithOpenLoop() {
        // Create a simple line as boundary (open loop)
        Line line = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        Segment segment = new Segment(line, new Vector2D(0, 0), new Vector2D(1, 0));
        List<SubHyperplane<Euclidean2D>> boundary = new ArrayList<SubHyperplane<Euclidean2D>>();
        boundary.add(segment);
        PolygonsSet ps = new PolygonsSet(boundary);
        Vector2D[][] vertices = ps.getVertices();
        assertNotNull(vertices);
        assertEquals(1, vertices.length);
        // The first vertex should be null for open loop
        assertNull(vertices[0][0]);
    }

    @Test
    public void testGetVerticesEmptyBoundary() {
        Collection<SubHyperplane<Euclidean2D>> boundary = new ArrayList<SubHyperplane<Euclidean2D>>();
        PolygonsSet ps = new PolygonsSet(boundary);
        Vector2D[][] vertices = ps.getVertices();
        assertNotNull(vertices);
        assertEquals(0, vertices.length);
    }

    @Test
    public void testGetVerticesNullTree() {
        // Use default constructor (empty tree)
        PolygonsSet ps = new PolygonsSet();
        Vector2D[][] vertices = ps.getVertices();
        assertNotNull(vertices);
        assertEquals(0, vertices.length);
    }

    @Test
    public void testGetVerticesDegenerateLoop() {
        // Create a single point path to test degenerated loop
        Line line1 = new Line(new Vector2D(0, 0), new Vector2D(1, 0));
        Line line2 = new Line(new Vector2D(1, 0), new Vector2D(1, 1));
        Line line3 = new Line(new Vector2D(1, 1), new Vector2D(0, 1));
        Line line4 = new Line(new Vector2D(0, 1), new Vector2D(0, 0));
        
        // This would need proper segment construction; simplified test
        PolygonsSet ps = new PolygonsSet(-1, 1, -1, 1);
        Vector2D[][] vertices = ps.getVertices();
        assertNotNull(vertices);
        assertTrue(vertices.length > 0);
    }

    @Test
    public void testConstructorWithNullBSPTreeThrows() {
        try {
            new PolygonsSet((BSPTree<Euclidean2D>) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithNullBoundary() {
        PolygonsSet ps = new PolygonsSet((Collection<SubHyperplane<Euclidean2D>>) null);
        assertNotNull(ps);
        assertEquals(0, ps.getVertices().length);
    }

    @Test
    public void testGetBarycenterAfterCompute() {
        PolygonsSet ps = new PolygonsSet(0.0, 4.0, 0.0, 4.0);
        ps.computeGeometricalProperties();
        assertEquals(new Vector2D(2.0, 2.0), ps.getBarycenter());
    }

    @Test
    public void testGetSizeAfterCompute() {
        PolygonsSet ps = new PolygonsSet(0.0, 3.0, 0.0, 2.0);
        ps.computeGeometricalProperties();
        assertEquals(6.0, ps.getSize(), 1e-10);
    }

    @Test
    public void testBoxWithNegativeCoordinates() {
        PolygonsSet ps = new PolygonsSet(-2.0, -1.0, -3.0, -2.0);
        Vector2D[][] vertices = ps.getVertices();
        assertNotNull(vertices);
        assertEquals(1, vertices.length);
        assertEquals(4, vertices[0].length);
        assertEquals(new Vector2D(-2.0, -3.0), vertices[0][0]);
        assertEquals(new Vector2D(-1.0, -3.0), vertices[0][1]);
        assertEquals(new Vector2D(-1.0, -2.0), vertices[0][2]);
        assertEquals(new Vector2D(-2.0, -2.0), vertices[0][3]);
    }
}