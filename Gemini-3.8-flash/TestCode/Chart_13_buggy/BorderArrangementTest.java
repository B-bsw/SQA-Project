package org.jfree.chart.block;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BorderArrangementTest {

    private static final double EPSILON = 0.0000001;

    private static class TestBlock extends EmptyBlock {
        private static final long serialVersionUID = 1L;
        private Size2D returnSize;
        private Rectangle2D lastBounds;

        public TestBlock(double width, double height) {
            super(width, height);
            this.returnSize = new Size2D(width, height);
        }

        public Size2D arrange(Graphics2D g2, RectangleConstraint constraint) {
            return this.returnSize;
        }

        public void setBounds(Rectangle2D bounds) {
            super.setBounds(bounds);
            this.lastBounds = bounds;
        }

        public Rectangle2D getBounds() {
            return this.lastBounds;
        }
    }

    private BorderArrangement arrangement;
    private BlockContainer container;

    @Before
    public void setUp() {
        this.arrangement = new BorderArrangement();
        this.container = new BlockContainer();
    }

    @Test
    public void add_givenNullKey_shouldAssignCenterBlock() {
        TestBlock block = new TestBlock(10.0, 10.0);
        this.arrangement.add(block, null);

        BorderArrangement other = new BorderArrangement();
        other.add(block, null);

        Assert.assertTrue(this.arrangement.equals(other));
    }

    @Test
    public void add_givenTopEdge_shouldAssignTopBlock() {
        TestBlock block = new TestBlock(10.0, 10.0);
        this.arrangement.add(block, RectangleEdge.TOP);

        BorderArrangement other = new BorderArrangement();
        other.add(block, RectangleEdge.TOP);

        Assert.assertTrue(this.arrangement.equals(other));
    }

    @Test
    public void add_givenBottomEdge_shouldAssignBottomBlock() {
        TestBlock block = new TestBlock(10.0, 10.0);
        this.arrangement.add(block, RectangleEdge.BOTTOM);

        BorderArrangement other = new BorderArrangement();
        other.add(block, RectangleEdge.BOTTOM);

        Assert.assertTrue(this.arrangement.equals(other));
    }

    @Test
    public void add_givenLeftEdge_shouldAssignLeftBlock() {
        TestBlock block = new TestBlock(10.0, 10.0);
        this.arrangement.add(block, RectangleEdge.LEFT);

        BorderArrangement other = new BorderArrangement();
        other.add(block, RectangleEdge.LEFT);

        Assert.assertTrue(this.arrangement.equals(other));
    }

    @Test
    public void add_givenRightEdge_shouldAssignRightBlock() {
        TestBlock block = new TestBlock(10.0, 10.0);
        this.arrangement.add(block, RectangleEdge.RIGHT);

        BorderArrangement other = new BorderArrangement();
        other.add(block, RectangleEdge.RIGHT);

        Assert.assertTrue(this.arrangement.equals(other));
    }

    @Test
    public void clear_givenPopulatedArrangement_shouldRemoveAllBlocks() {
        this.arrangement.add(new TestBlock(10.0, 10.0), RectangleEdge.TOP);
        this.arrangement.add(new TestBlock(10.0, 10.0), RectangleEdge.BOTTOM);
        this.arrangement.add(new TestBlock(10.0, 10.0), RectangleEdge.LEFT);
        this.arrangement.add(new TestBlock(10.0, 10.0), RectangleEdge.RIGHT);
        this.arrangement.add(new TestBlock(10.0, 10.0), null);

        this.arrangement.clear();

        BorderArrangement emptyArrangement = new BorderArrangement();
        Assert.assertTrue(this.arrangement.equals(emptyArrangement));
    }

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        Assert.assertTrue(this.arrangement.equals(this.arrangement));
    }

    @Test
    public void equals_givenNull_shouldReturnFalse() {
        Assert.assertFalse(this.arrangement.equals(null));
    }

    @Test
    public void equals_givenDifferentClass_shouldReturnFalse() {
        Assert.assertFalse(this.arrangement.equals("Not an arrangement"));
    }

    @Test
    public void equals_givenDifferentTopBlock_shouldReturnFalse() {
        BorderArrangement arr1 = new BorderArrangement();
        arr1.add(new TestBlock(10.0, 10.0), RectangleEdge.TOP);

        BorderArrangement arr2 = new BorderArrangement();
        arr2.add(new TestBlock(20.0, 20.0), RectangleEdge.TOP);

        Assert.assertFalse(arr1.equals(arr2));
    }

    @Test
    public void equals_givenDifferentBottomBlock_shouldReturnFalse() {
        BorderArrangement arr1 = new BorderArrangement();
        arr1.add(new TestBlock(10.0, 10.0), RectangleEdge.BOTTOM);

        BorderArrangement arr2 = new BorderArrangement();
        arr2.add(new TestBlock(20.0, 20.0), RectangleEdge.BOTTOM);

        Assert.assertFalse(arr1.equals(arr2));
    }

    @Test
    public void equals_givenDifferentLeftBlock_shouldReturnFalse() {
        BorderArrangement arr1 = new BorderArrangement();
        arr1.add(new TestBlock(10.0, 10.0), RectangleEdge.LEFT);

        BorderArrangement arr2 = new BorderArrangement();
        arr2.add(new TestBlock(20.0, 20.0), RectangleEdge.LEFT);

        Assert.assertFalse(arr1.equals(arr2));
    }

    @Test
    public void equals_givenDifferentRightBlock_shouldReturnFalse() {
        BorderArrangement arr1 = new BorderArrangement();
        arr1.add(new TestBlock(10.0, 10.0), RectangleEdge.RIGHT);

        BorderArrangement arr2 = new BorderArrangement();
        arr2.add(new TestBlock(20.0, 20.0), RectangleEdge.RIGHT);

        Assert.assertFalse(arr1.equals(arr2));
    }

    @Test
    public void equals_givenDifferentCenterBlock_shouldReturnFalse() {
        BorderArrangement arr1 = new BorderArrangement();
        arr1.add(new TestBlock(10.0, 10.0), null);

        BorderArrangement arr2 = new BorderArrangement();
        arr2.add(new TestBlock(20.0, 20.0), null);

        Assert.assertFalse(arr1.equals(arr2));
    }

    @Test
    public void equals_givenIdenticalBlocks_shouldReturnTrue() {
        TestBlock top = new TestBlock(10.0, 10.0);
        TestBlock bottom = new TestBlock(10.0, 10.0);
        TestBlock left = new TestBlock(10.0, 10.0);
        TestBlock right = new TestBlock(10.0, 10.0);
        TestBlock center = new TestBlock(10.0, 10.0);

        BorderArrangement arr1 = new BorderArrangement();
        arr1.add(top, RectangleEdge.TOP);
        arr1.add(bottom, RectangleEdge.BOTTOM);
        arr1.add(left, RectangleEdge.LEFT);
        arr1.add(right, RectangleEdge.RIGHT);
        arr1.add(center, null);

        BorderArrangement arr2 = new BorderArrangement();
        arr2.add(top, RectangleEdge.TOP);
        arr2.add(bottom, RectangleEdge.BOTTOM);
        arr2.add(left, RectangleEdge.LEFT);
        arr2.add(right, RectangleEdge.RIGHT);
        arr2.add(center, null);

        Assert.assertTrue(arr1.equals(arr2));
    }

    @Test(expected = RuntimeException.class)
    public void arrange_givenWidthNoneHeightFixed_shouldThrowException() {
        RectangleConstraint constraint = new RectangleConstraint(0.0, null,
                LengthConstraintType.NONE, 50.0, null, LengthConstraintType.FIXED);
        this.arrangement.arrange(this.container, null, constraint);
    }

    @Test(expected = RuntimeException.class)
    public void arrange_givenWidthNoneHeightRange_shouldThrowException() {
        RectangleConstraint constraint = new RectangleConstraint(0.0, null,
                LengthConstraintType.NONE, 0.0, new Range(0.0, 50.0), LengthConstraintType.RANGE);
        this.arrangement.arrange(this.container, null, constraint);
    }

    @Test(expected = RuntimeException.class)
    public void arrange_givenWidthRangeHeightNone_shouldThrowException() {
        RectangleConstraint constraint = new RectangleConstraint(0.0, new Range(0.0, 50.0),
                LengthConstraintType.RANGE, 0.0, null, LengthConstraintType.NONE);
        this.arrangement.arrange(this.container, null, constraint);
    }

    @Test(expected = RuntimeException.class)
    public void arrange_givenWidthRangeHeightFixed_shouldThrowException() {
        RectangleConstraint constraint = new RectangleConstraint(0.0, new Range(0.0, 50.0),
                LengthConstraintType.RANGE, 50.0, null, LengthConstraintType.FIXED);
        this.arrangement.arrange(this.container, null, constraint);
    }

    @Test
    public void arrangeNN_givenEmptyContainer_shouldReturnZeroSize() {
        Size2D size = this.arrangement.arrange(this.container, null, RectangleConstraint.NONE);
        Assert.assertEquals(0.0, size.getWidth(), EPSILON);
        Assert.assertEquals(0.0, size.getHeight(), EPSILON);
    }

    @Test
    public void arrangeNN_givenAllBlocks_shouldCalculateDimensionsAndSetBounds() {
        TestBlock top = new TestBlock(50.0, 10.0);
        TestBlock bottom = new TestBlock(50.0, 15.0);
        TestBlock left = new TestBlock(20.0, 30.0);
        TestBlock right = new TestBlock(25.0, 20.0);
        TestBlock center = new TestBlock(40.0, 25.0);

        this.arrangement.add(top, RectangleEdge.TOP);
        this.arrangement.add(bottom, RectangleEdge.BOTTOM);
        this.arrangement.add(left, RectangleEdge.LEFT);
        this.arrangement.add(right, RectangleEdge.RIGHT);
        this.arrangement.add(center, null);

        Size2D size = this.arrangement.arrange(this.container, null, RectangleConstraint.NONE);

        double expectedWidth = Math.max(50.0, Math.max(50.0, 20.0 + 40.0 + 25.0));
        double centerHeight = Math.max(Math.max(30.0, 20.0), 25.0);
        double expectedHeight = 10.0 + 15.0 + centerHeight;

        Assert.assertEquals(expectedWidth, size.getWidth(), EPSILON);
        Assert.assertEquals(expectedHeight, size.getHeight(), EPSILON);

        Assert.assertEquals(new Rectangle2D.Double(0.0, 0.0, expectedWidth, 10.0), top.getBounds());
        Assert.assertEquals(new Rectangle2D.Double(0.0, expectedHeight - 15.0, expectedWidth, 15.0), bottom.getBounds());
        Assert.assertEquals(new Rectangle2D.Double(0.0, 10.0, 20.0, centerHeight), left.getBounds());
        Assert.assertEquals(new Rectangle2D.Double(expectedWidth - 25.0, 10.0, 25.0, centerHeight), right.getBounds());
        Assert.assertEquals(new Rectangle2D.Double(20.0, 10.0, expectedWidth - 20.0 - 25.0, centerHeight), center.getBounds());
    }

    @Test
    public void arrangeFF_givenEmptyContainer_shouldReturnFixedSize() {
        RectangleConstraint constraint = new RectangleConstraint(100.0, 80.0);
        Size2D size = this.arrangement.arrange(this.container, null, constraint);

        Assert.assertEquals(100.0, size.getWidth(), EPSILON);
        Assert.assertEquals(80.0, size.getHeight(), EPSILON);
    }

    @Test
    public void arrangeFF_givenAllBlocks_shouldCalculateDimensionsAndSetBounds() {
        TestBlock top = new TestBlock(100.0, 15.0);
        TestBlock bottom = new TestBlock(100.0, 15.0);
        TestBlock left = new TestBlock(20.0, 50.0);
        TestBlock right = new TestBlock(25.0, 50.0);
        TestBlock center = new TestBlock(55.0, 50.0);

        this.arrangement.add(top, RectangleEdge.TOP);
        this.arrangement.add(bottom, RectangleEdge.BOTTOM);
        this.arrangement.add(left, RectangleEdge.LEFT);
        this.arrangement.add(right, RectangleEdge.RIGHT);
        this.arrangement.add(center, null);

        RectangleConstraint constraint = new RectangleConstraint(100.0, 80.0);
        Size2D size = this.arrangement.arrange(this.container, null, constraint);

        Assert.assertEquals(100.0, size.getWidth(), EPSILON);
        Assert.assertEquals(80.0, size.getHeight(), EPSILON);

        double middleHeight = 80.0 - 15.0 - 15.0;
        Assert.assertEquals(new Rectangle2D.Double(0.0, 0.0, 100.0, 15.0), top.getBounds());
        Assert.assertEquals(new Rectangle2D.Double(0.0, 15.0 + middleHeight, 100.0, 15.0), bottom.getBounds());
        Assert.assertEquals(new Rectangle2D.Double(0.0, 15.0, 20.0, middleHeight), left.getBounds());
        Assert.assertEquals(new Rectangle2D.Double(20.0 + (100.0 - 25.0 - 20.0), 15.0, 25.0, middleHeight), right.getBounds());
        Assert.assertEquals(new Rectangle2D.Double(20.0, 15.0, 100.0 - 25.0 - 20.0, middleHeight), center.getBounds());
    }

    @Test
    public void arrangeFN_givenAllBlocks_shouldCalculateAndSetBounds() {
        TestBlock top = new TestBlock(100.0, 10.0);
        TestBlock bottom = new TestBlock(100.0, 10.0);
        TestBlock left = new TestBlock(20.0, 30.0);
        TestBlock right = new TestBlock(20.0, 30.0);
        TestBlock center = new TestBlock(60.0, 25.0);

        this.arrangement.add(top, RectangleEdge.TOP);
        this.arrangement.add(bottom, RectangleEdge.BOTTOM);
        this.arrangement.add(left, RectangleEdge.LEFT);
        this.arrangement.add(right, RectangleEdge.RIGHT);
        this.arrangement.add(center, null);

        RectangleConstraint constraint = new RectangleConstraint(100.0, null,
                LengthConstraintType.FIXED, 0.0, null, LengthConstraintType.NONE);

        Size2D size = this.arrangement.arrange(this.container, null, constraint);

        Assert.assertEquals(100.0, size.getWidth(), EPSILON);
        Assert.assertEquals(50.0, size.getHeight(), EPSILON);
    }

    @Test
    public void arrangeFR_givenHeightWithinRange_shouldReturnFNSize() {
        TestBlock center = new TestBlock(100.0, 40.0);
        this.arrangement.add(center, null);

        RectangleConstraint constraint = new RectangleConstraint(100.0, null,
                LengthConstraintType.FIXED, 0.0, new Range(30.0, 60.0), LengthConstraintType.RANGE);

        Size2D size = this.arrangement.arrange(this.container, null, constraint);

        Assert.assertEquals(100.0, size.getWidth(), EPSILON);
        Assert.assertEquals(40.0, size.getHeight(), EPSILON);
    }

    @Test
    public void arrangeFR_givenHeightOutsideRange_shouldConstrainHeight() {
        TestBlock center = new TestBlock(100.0, 80.0);
        this.arrangement.add(center, null);

        RectangleConstraint constraint = new RectangleConstraint(100.0, null,
                LengthConstraintType.FIXED, 0.0, new Range(30.0, 60.0), LengthConstraintType.RANGE);

        Size2D size = this.arrangement.arrange(this.container, null, constraint);

        Assert.assertEquals(100.0, size.getWidth(), EPSILON);
        Assert.assertEquals(60.0, size.getHeight(), EPSILON);
    }

    @Test
    public void arrangeRR_givenEmptyContainer_shouldReturnZeroSize() {
        RectangleConstraint constraint = new RectangleConstraint(new Range(0.0, 100.0), new Range(0.0, 80.0));
        Size2D size = this.arrangement.arrange(this.container, null, constraint);

        Assert.assertEquals(0.0, size.getWidth(), EPSILON);
        Assert.assertEquals(0.0, size.getHeight(), EPSILON);
    }

    @Test
    public void arrangeRR_givenAllBlocks_shouldCalculateDimensionsAndSetBounds() {
        TestBlock top = new TestBlock(50.0, 10.0);
        TestBlock bottom = new TestBlock(50.0, 10.0);
        TestBlock left = new TestBlock(20.0, 30.0);
        TestBlock right = new TestBlock(25.0, 20.0);
        TestBlock center = new TestBlock(30.0, 25.0);

        this.arrangement.add(top, RectangleEdge.TOP);
        this.arrangement.add(bottom, RectangleEdge.BOTTOM);
        this.arrangement.add(left, RectangleEdge.LEFT);
        this.arrangement.add(right, RectangleEdge.RIGHT);
        this.arrangement.add(center, null);

        RectangleConstraint constraint = new RectangleConstraint(new Range(0.0, 200.0), new Range(0.0, 150.0));
        Size2D size = this.arrangement.arrange(this.container, null, constraint);

        double expectedWidth = Math.max(50.0, Math.max(50.0, 20.0 + 30.0 + 25.0));
        double centerHeight = Math.max(30.0, 25.0);
        double expectedHeight = 10.0 + 10.0 + centerHeight;

        Assert.assertEquals(expectedWidth, size.getWidth(), EPSILON);
        Assert.assertEquals(expectedHeight, size.getHeight(), EPSILON);

        Assert.assertEquals(new Rectangle2D.Double(0.0, 0.0, expectedWidth, 10.0), top.getBounds());
        Assert.assertEquals(new Rectangle2D.Double(0.0, expectedHeight - 10.0, expectedWidth, 10.0), bottom.getBounds());
        Assert.assertEquals(new Rectangle2D.Double(0.0, 10.0, 20.0, 30.0), left.getBounds());
        Assert.assertEquals(new Rectangle2D.Double(expectedWidth - 25.0, 10.0, 25.0, 30.0), right.getBounds());
        Assert.assertEquals(new Rectangle2D.Double(20.0, 10.0, expectedWidth - 20.0 - 25.0, expectedHeight - 10.0 - 10.0), center.getBounds());
    }

    @Test
    public void serialization_givenBorderArrangement_shouldSerializeAndDeserialize() throws Exception {
        this.arrangement.add(new EmptyBlock(10.0, 10.0), RectangleEdge.TOP);
        this.arrangement.add(new EmptyBlock(20.0, 20.0), RectangleEdge.BOTTOM);
        this.arrangement.add(new EmptyBlock(30.0, 30.0), RectangleEdge.LEFT);
        this.arrangement.add(new EmptyBlock(40.0, 40.0), RectangleEdge.RIGHT);
        this.arrangement.add(new EmptyBlock(50.0, 50.0), null);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(this.arrangement);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        BorderArrangement deserialized = (BorderArrangement) in.readObject();
        in.close();

        Assert.assertTrue(this.arrangement.equals(deserialized));
    }
}