package org.jfree.chart.block;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class BorderArrangementTest {

    private Graphics2D g2;
    private BlockContainer container;

    @Before
    public void setUp() {
        BufferedImage image = new BufferedImage(400, 400,
                BufferedImage.TYPE_INT_RGB);
        this.g2 = image.createGraphics();
        this.container = new BlockContainer();
    }

    // ---------------------------------------------------------------
    // add() tests
    // ---------------------------------------------------------------

    @Test
    public void testAddNullKeySetsCenterBlock() {
        BorderArrangement arrangement = new BorderArrangement();
        EmptyBlock center = new EmptyBlock(40.0, 25.0);
        arrangement.add(center, null);
        Size2D size = arrangement.arrangeNN(this.container, this.g2);
        assertEquals(40.0, size.getWidth(), 0.001);
        assertEquals(25.0, size.getHeight(), 0.001);
        assertEquals(new Rectangle2D.Double(0.0, 0.0, 40.0, 25.0),
                center.getBounds());
    }

    @Test
    public void testAddTopEdge() {
        BorderArrangement arrangement = new BorderArrangement();
        EmptyBlock top = new EmptyBlock(60.0, 15.0);
        arrangement.add(top, RectangleEdge.TOP);
        Size2D size = arrangement.arrangeNN(this.container, this.g2);
        assertEquals(60.0, size.getWidth(), 0.001);
        assertEquals(15.0, size.getHeight(), 0.001);
        assertEquals(new Rectangle2D.Double(0.0, 0.0, 60.0, 15.0),
                top.getBounds());
    }

    @Test
    public void testAddBottomEdge() {
        BorderArrangement arrangement = new BorderArrangement();
        EmptyBlock bottom = new EmptyBlock(50.0, 12.0);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        Size2D size = arrangement.arrangeNN(this.container, this.g2);
        assertEquals(50.0, size.getWidth(), 0.001);
        assertEquals(12.0, size.getHeight(), 0.001);
        assertEquals(new Rectangle2D.Double(0.0, 0.0, 50.0, 12.0),
                bottom.getBounds());
    }

    @Test
    public void testAddLeftEdge() {
        BorderArrangement arrangement = new BorderArrangement();
        EmptyBlock left = new EmptyBlock(20.0, 40.0);
        arrangement.add(left, RectangleEdge.LEFT);
        Size2D size = arrangement.arrangeNN(this.container, this.g2);
        assertEquals(20.0, size.getWidth(), 0.001);
        assertEquals(40.0, size.getHeight(), 0.001);
        assertEquals(new Rectangle2D.Double(0.0, 0.0, 20.0, 40.0),
                left.getBounds());
    }

    @Test
    public void testAddRightEdge() {
        BorderArrangement arrangement = new BorderArrangement();
        EmptyBlock right = new EmptyBlock(22.0, 44.0);
        arrangement.add(right, RectangleEdge.RIGHT);
        Size2D size = arrangement.arrangeNN(this.container, this.g2);
        assertEquals(22.0, size.getWidth(), 0.001);
        assertEquals(44.0, size.getHeight(), 0.001);
        assertEquals(new Rectangle2D.Double(0.0, 0.0, 22.0, 44.0),
                right.getBounds());
    }

    // ---------------------------------------------------------------
    // clear() tests
    // ---------------------------------------------------------------

    @Test
    public void testClear() {
        BorderArrangement arrangement = new BorderArrangement();
        arrangement.add(new EmptyBlock(10.0, 10.0), null);
        arrangement.add(new EmptyBlock(10.0, 10.0), RectangleEdge.TOP);
        arrangement.add(new EmptyBlock(10.0, 10.0), RectangleEdge.BOTTOM);
        arrangement.add(new EmptyBlock(10.0, 10.0), RectangleEdge.LEFT);
        arrangement.add(new EmptyBlock(10.0, 10.0), RectangleEdge.RIGHT);
        arrangement.clear();
        Size2D size = arrangement.arrangeNN(this.container, this.g2);
        assertEquals(0.0, size.getWidth(), 0.0);
        assertEquals(0.0, size.getHeight(), 0.0);
    }

    // ---------------------------------------------------------------
    // equals() tests
    // ---------------------------------------------------------------

    @Test
    public void testEqualsSameInstance() {
        BorderArrangement a = new BorderArrangement();
        assertTrue(a.equals(a));
    }

    @Test
    public void testEqualsDifferentClass() {
        BorderArrangement a = new BorderArrangement();
        assertFalse(a.equals("not a BorderArrangement"));
    }

    @Test
    public void testEqualsAllFieldsEqual() {
        BorderArrangement a = new BorderArrangement();
        BorderArrangement b = new BorderArrangement();
        EmptyBlock top = new EmptyBlock(10.0, 10.0);
        EmptyBlock bottom = new EmptyBlock(11.0, 11.0);
        EmptyBlock left = new EmptyBlock(12.0, 12.0);
        EmptyBlock right = new EmptyBlock(13.0, 13.0);
        EmptyBlock center = new EmptyBlock(14.0, 14.0);
        a.add(top, RectangleEdge.TOP);
        a.add(bottom, RectangleEdge.BOTTOM);
        a.add(left, RectangleEdge.LEFT);
        a.add(right, RectangleEdge.RIGHT);
        a.add(center, null);
        b.add(top, RectangleEdge.TOP);
        b.add(bottom, RectangleEdge.BOTTOM);
        b.add(left, RectangleEdge.LEFT);
        b.add(right, RectangleEdge.RIGHT);
        b.add(center, null);
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }

    @Test
    public void testEqualsDifferentTop() {
        BorderArrangement a = new BorderArrangement();
        BorderArrangement b = new BorderArrangement();
        a.add(new EmptyBlock(10.0, 10.0), RectangleEdge.TOP);
        b.add(new EmptyBlock(20.0, 20.0), RectangleEdge.TOP);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentBottom() {
        BorderArrangement a = new BorderArrangement();
        BorderArrangement b = new BorderArrangement();
        a.add(new EmptyBlock(10.0, 10.0), RectangleEdge.BOTTOM);
        b.add(new EmptyBlock(20.0, 20.0), RectangleEdge.BOTTOM);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentLeft() {
        BorderArrangement a = new BorderArrangement();
        BorderArrangement b = new BorderArrangement();
        a.add(new EmptyBlock(10.0, 10.0), RectangleEdge.LEFT);
        b.add(new EmptyBlock(20.0, 20.0), RectangleEdge.LEFT);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentRight() {
        BorderArrangement a = new BorderArrangement();
        BorderArrangement b = new BorderArrangement();
        a.add(new EmptyBlock(10.0, 10.0), RectangleEdge.RIGHT);
        b.add(new EmptyBlock(20.0, 20.0), RectangleEdge.RIGHT);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEqualsDifferentCenter() {
        BorderArrangement a = new BorderArrangement();
        BorderArrangement b = new BorderArrangement();
        a.add(new EmptyBlock(10.0, 10.0), null);
        b.add(new EmptyBlock(20.0, 20.0), null);
        assertFalse(a.equals(b));
    }

    // ---------------------------------------------------------------
    // arrangeNN() tests
    // ---------------------------------------------------------------

    @Test
    public void testArrangeNNNoBlocks() {
        BorderArrangement arrangement = new BorderArrangement();
        Size2D size = arrangement.arrangeNN(this.container, this.g2);
        assertEquals(0.0, size.getWidth(), 0.0);
        assertEquals(0.0, size.getHeight(), 0.0);
    }

    @Test
    public void testArrangeNNAllBlocks() {
        BorderArrangement arrangement = new BorderArrangement();
        EmptyBlock top = new EmptyBlock(100.0, 20.0);
        EmptyBlock bottom = new EmptyBlock(100.0, 20.0);
        EmptyBlock left = new EmptyBlock(30.0, 60.0);
        EmptyBlock right = new EmptyBlock(30.0, 60.0);
        EmptyBlock center = new EmptyBlock(80.0, 60.0);
        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        Size2D size = arrangement.arrangeNN(this.container, this.g2);
        assertEquals(140.0, size.getWidth(), 0.001);
        assertEquals(100.0, size.getHeight(), 0.001);

        assertEquals(new Rectangle2D.Double(0.0, 0.0, 140.0, 20.0),
                top.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 80.0, 140.0, 20.0),
                bottom.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 20.0, 30.0, 60.0),
                left.getBounds());
        assertEquals(new Rectangle2D.Double(110.0, 20.0, 30.0, 60.0),
                right.getBounds());
        assertEquals(new Rectangle2D.Double(30.0, 20.0, 80.0, 60.0),
                center.getBounds());
    }

    // ---------------------------------------------------------------
    // arrangeFN() tests
    // ---------------------------------------------------------------

    @Test
    public void testArrangeFN() {
        BorderArrangement arrangement = new BorderArrangement();
        EmptyBlock top = new EmptyBlock(100.0, 20.0);
        EmptyBlock bottom = new EmptyBlock(100.0, 20.0);
        EmptyBlock left = new EmptyBlock(30.0, 60.0);
        EmptyBlock right = new EmptyBlock(30.0, 60.0);
        EmptyBlock center = new EmptyBlock(80.0, 60.0);
        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        Size2D size = arrangement.arrangeFN(this.container, this.g2, 200.0);
        assertEquals(200.0, size.getWidth(), 0.001);
        assertEquals(100.0, size.getHeight(), 0.001);

        assertEquals(new Rectangle2D.Double(0.0, 0.0, 200.0, 20.0),
                top.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 80.0, 200.0, 20.0),
                bottom.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 20.0, 30.0, 60.0),
                left.getBounds());
        assertEquals(new Rectangle2D.Double(170.0, 20.0, 30.0, 60.0),
                right.getBounds());
        assertEquals(new Rectangle2D.Double(30.0, 20.0, 140.0, 60.0),
                center.getBounds());
    }

    // ---------------------------------------------------------------
    // arrangeFF() tests
    // ---------------------------------------------------------------

    @Test
    public void testArrangeFF() {
        BorderArrangement arrangement = new BorderArrangement();
        EmptyBlock top = new EmptyBlock(100.0, 20.0);
        EmptyBlock bottom = new EmptyBlock(100.0, 20.0);
        EmptyBlock left = new EmptyBlock(30.0, 60.0);
        EmptyBlock right = new EmptyBlock(30.0, 60.0);
        EmptyBlock center = new EmptyBlock(80.0, 60.0);
        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        RectangleConstraint constraint = new RectangleConstraint(200.0,
                100.0);
        Size2D size = arrangement.arrangeFF(this.container, this.g2,
                constraint);
        assertEquals(200.0, size.getWidth(), 0.001);
        assertEquals(100.0, size.getHeight(), 0.001);

        assertEquals(new Rectangle2D.Double(0.0, 0.0, 200.0, 20.0),
                top.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 80.0, 200.0, 20.0),
                bottom.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 20.0, 30.0, 60.0),
                left.getBounds());
        assertEquals(new Rectangle2D.Double(170.0, 20.0, 30.0, 60.0),
                right.getBounds());
        assertEquals(new Rectangle2D.Double(30.0, 20.0, 140.0, 60.0),
                center.getBounds());
    }

    // ---------------------------------------------------------------
    // arrangeFR() tests
    // ---------------------------------------------------------------

    @Test
    public void testArrangeFRContainsCase() {
        BorderArrangement arrangement = new BorderArrangement();
        EmptyBlock top = new EmptyBlock(100.0, 20.0);
        EmptyBlock bottom = new EmptyBlock(100.0, 20.0);
        EmptyBlock left = new EmptyBlock(30.0, 60.0);
        EmptyBlock right = new EmptyBlock(30.0, 60.0);
        EmptyBlock center = new EmptyBlock(80.0, 60.0);
        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        RectangleConstraint constraint = new RectangleConstraint(200.0,
                null, LengthConstraintType.FIXED, 0.0,
                new Range(50.0, 150.0), LengthConstraintType.RANGE);
        Size2D size = arrangement.arrangeFR(this.container, this.g2,
                constraint);
        assertEquals(200.0, size.getWidth(), 0.001);
        assertEquals(100.0, size.getHeight(), 0.001);
    }

    @Test
    public void testArrangeFRNotContainsCase() {
        BorderArrangement arrangement = new BorderArrangement();
        EmptyBlock top = new EmptyBlock(100.0, 20.0);
        EmptyBlock bottom = new EmptyBlock(100.0, 20.0);
        EmptyBlock left = new EmptyBlock(30.0, 60.0);
        EmptyBlock right = new EmptyBlock(30.0, 60.0);
        EmptyBlock center = new EmptyBlock(80.0, 60.0);
        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        RectangleConstraint constraint = new RectangleConstraint(200.0,
                null, LengthConstraintType.FIXED, 0.0,
                new Range(0.0, 50.0), LengthConstraintType.RANGE);
        Size2D size = arrangement.arrangeFR(this.container, this.g2,
                constraint);
        assertEquals(200.0, size.getWidth(), 0.001);
        assertEquals(50.0, size.getHeight(), 0.001);

        assertEquals(new Rectangle2D.Double(0.0, 0.0, 200.0, 20.0),
                top.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 30.0, 200.0, 20.0),
                bottom.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 20.0, 30.0, 10.0),
                left.getBounds());
        assertEquals(new Rectangle2D.Double(170.0, 20.0, 30.0, 10.0),
                right.getBounds());
        assertEquals(new Rectangle2D.Double(30.0, 20.0, 140.0, 10.0),
                center.getBounds());
    }

    // ---------------------------------------------------------------
    // arrangeRR() tests
    // ---------------------------------------------------------------

    @Test
    public void testArrangeRREmpty() {
        BorderArrangement arrangement = new BorderArrangement();
        Size2D size = arrangement.arrangeRR(this.container,
                new Range(0.0, 100.0), new Range(0.0, 100.0), this.g2);
        assertEquals(0.0, size.getWidth(), 0.0);
        assertEquals(0.0, size.getHeight(), 0.0);
    }

    @Test
    public void testArrangeRRAllBlocks() {
        BorderArrangement arrangement = new BorderArrangement();
        EmptyBlock top = new EmptyBlock(100.0, 20.0);
        EmptyBlock bottom = new EmptyBlock(100.0, 20.0);
        EmptyBlock left = new EmptyBlock(30.0, 60.0);
        EmptyBlock right = new EmptyBlock(30.0, 60.0);
        EmptyBlock center = new EmptyBlock(80.0, 60.0);
        arrangement.add(top, RectangleEdge.TOP);
        arrangement.add(bottom, RectangleEdge.BOTTOM);
        arrangement.add(left, RectangleEdge.LEFT);
        arrangement.add(right, RectangleEdge.RIGHT);
        arrangement.add(center, null);

        Range widthRange = new Range(0.0, 300.0);
        Range heightRange = new Range(0.0, 300.0);
        Size2D size = arrangement.arrangeRR(this.container, widthRange,
                heightRange, this.g2);
        assertEquals(140.0, size.getWidth(), 0.001);
        assertEquals(100.0, size.getHeight(), 0.001);

        assertEquals(new Rectangle2D.Double(0.0, 0.0, 140.0, 20.0),
                top.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 80.0, 140.0, 20.0),
                bottom.getBounds());
        assertEquals(new Rectangle2D.Double(0.0, 20.0, 30.0, 60.0),
                left.getBounds());
        assertEquals(new Rectangle2D.Double(110.0, 20.0, 30.0, 60.0),
                right.getBounds());
        assertEquals(new Rectangle2D.Double(30.0, 20.0, 80.0, 60.0),
                center.getBounds());
    }

    // ---------------------------------------------------------------
    // Public arrange() dispatch tests
    // ---------------------------------------------------------------

    private BorderArrangement buildFullArrangement() {
        BorderArrangement arrangement = new BorderArrangement();
        arrangement.add(new EmptyBlock(100.0, 20.0), RectangleEdge.TOP);
        arrangement.add(new EmptyBlock(100.0, 20.0), RectangleEdge.BOTTOM);
        arrangement.add(new EmptyBlock(30.0, 60.0), RectangleEdge.LEFT);
        arrangement.add(new EmptyBlock(30.0, 60.0), RectangleEdge.RIGHT);
        arrangement.add(new EmptyBlock(80.0, 60.0), null);
        return arrangement;
    }

    @Test
    public void testArrangePublicNoneNone() {
        BorderArrangement arrangement = buildFullArrangement();
        Size2D size = arrangement.arrange(this.container, this.g2,
                RectangleConstraint.NONE);
        assertEquals(140.0, size.getWidth(), 0.001);
        assertEquals(100.0, size.getHeight(), 0.001);
    }

    @Test
    public void testArrangePublicFixedNone() {
        BorderArrangement arrangement = buildFullArrangement();
        RectangleConstraint constraint = new RectangleConstraint(200.0,
                null, LengthConstraintType.FIXED, 0.0, null,
                LengthConstraintType.NONE);
        Size2D size = arrangement.arrange(this.container, this.g2,
                constraint);
        assertEquals(200.0, size.getWidth(), 0.001);
        assertEquals(100.0, size.getHeight(), 0.001);
    }

    @Test
    public void testArrangePublicFixedFixed() {
        BorderArrangement arrangement = buildFullArrangement();
        RectangleConstraint constraint = new RectangleConstraint(200.0,
                100.0);
        Size2D size = arrangement.arrange(this.container, this.g2,
                constraint);
        assertEquals(200.0, size.getWidth(), 0.001);
        assertEquals(100.0, size.getHeight(), 0.001);
    }

    @Test
    public void testArrangePublicFixedRange() {
        BorderArrangement arrangement = buildFullArrangement();
        RectangleConstraint constraint = new RectangleConstraint(200.0,
                null, LengthConstraintType.FIXED, 0.0,
                new Range(50.0, 150.0), LengthConstraintType.RANGE);
        Size2D size = arrangement.arrange(this.container, this.g2,
                constraint);
        assertEquals(200.0, size.getWidth(), 0.001);
        assertEquals(100.0, size.getHeight(), 0.001);
    }

    @Test
    public void testArrangePublicRangeRange() {
        BorderArrangement arrangement = buildFullArrangement();
        RectangleConstraint constraint = new RectangleConstraint(
                new Range(0.0, 300.0), new Range(0.0, 300.0));
        Size2D size = arrangement.arrange(this.container, this.g2,
                constraint);
        assertEquals(140.0, size.getWidth(), 0.001);
        assertEquals(100.0, size.getHeight(), 0.001);
    }

    @Test
    public void testArrangePublicNoneFixedThrowsException() {
        BorderArrangement arrangement = buildFullArrangement();
        RectangleConstraint constraint = new RectangleConstraint(0.0,
                null, LengthConstraintType.NONE, 100.0, null,
                LengthConstraintType.FIXED);
        try {
            arrangement.arrange(this.container, this.g2, constraint);
            fail("Expected a RuntimeException to be thrown.");
        }
        catch (RuntimeException e) {
            assertEquals("Not implemented.", e.getMessage());
        }
    }

    @Test
    public void testArrangePublicNoneRangeThrowsException() {
        BorderArrangement arrangement = buildFullArrangement();
        RectangleConstraint constraint = new RectangleConstraint(0.0,
                null, LengthConstraintType.NONE, 0.0,
                new Range(50.0, 150.0), LengthConstraintType.RANGE);
        try {
            arrangement.arrange(this.container, this.g2, constraint);
            fail("Expected a RuntimeException to be thrown.");
        }
        catch (RuntimeException e) {
            assertEquals("Not implemented.", e.getMessage());
        }
    }

    @Test
    public void testArrangePublicRangeNoneThrowsException() {
        BorderArrangement arrangement = buildFullArrangement();
        RectangleConstraint constraint = new RectangleConstraint(0.0,
                new Range(50.0, 150.0), LengthConstraintType.RANGE, 0.0,
                null, LengthConstraintType.NONE);
        try {
            arrangement.arrange(this.container, this.g2, constraint);
            fail("Expected a RuntimeException to be thrown.");
        }
        catch (RuntimeException e) {
            assertEquals("Not implemented.", e.getMessage());
        }
    }

    @Test
    public void testArrangePublicRangeFixedThrowsException() {
        BorderArrangement arrangement = buildFullArrangement();
        RectangleConstraint constraint = new RectangleConstraint(0.0,
                new Range(50.0, 150.0), LengthConstraintType.RANGE, 100.0,
                null, LengthConstraintType.FIXED);
        try {
            arrangement.arrange(this.container, this.g2, constraint);
            fail("Expected a RuntimeException to be thrown.");
        }
        catch (RuntimeException e) {
            assertEquals("Not implemented.", e.getMessage());
        }
    }
}