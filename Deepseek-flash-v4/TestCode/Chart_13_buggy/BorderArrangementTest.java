package org.jfree.chart.block;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.jfree.chart.block.Block;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;
import org.junit.Before;
import org.junit.Test;

public class BorderArrangementTest {

    private BorderArrangement arrangement;

    @Before
    public void setUp() {
        arrangement = new BorderArrangement();
    }

    @Test
    public void testAddNullKey() {
        Block block = new EmptyBlock(10.0, 10.0);
        arrangement.add(block, null);
        // Verify centerBlock is set
        assertEquals(block, getCenterBlock(arrangement));
    }

    @Test
    public void testAddTopKey() {
        Block block = new EmptyBlock(10.0, 10.0);
        arrangement.add(block, RectangleEdge.TOP);
        assertEquals(block, getTopBlock(arrangement));
    }

    @Test
    public void testAddBottomKey() {
        Block block = new EmptyBlock(10.0, 10.0);
        arrangement.add(block, RectangleEdge.BOTTOM);
        assertEquals(block, getBottomBlock(arrangement));
    }

    @Test
    public void testAddLeftKey() {
        Block block = new EmptyBlock(10.0, 10.0);
        arrangement.add(block, RectangleEdge.LEFT);
        assertEquals(block, getLeftBlock(arrangement));
    }

    @Test
    public void testAddRightKey() {
        Block block = new EmptyBlock(10.0, 10.0);
        arrangement.add(block, RectangleEdge.RIGHT);
        assertEquals(block, getRightBlock(arrangement));
    }

    @Test
    public void testAddInvalidKey() {
        Block block = new EmptyBlock(10.0, 10.0);
        try {
            arrangement.add(block, "invalid");
            fail("Expected ClassCastException");
        } catch (ClassCastException e) {
            // expected
        }
    }

    @Test
    public void testClear() {
        arrangement.add(new EmptyBlock(10.0, 10.0), RectangleEdge.TOP);
        arrangement.add(new EmptyBlock(10.0, 10.0), RectangleEdge.BOTTOM);
        arrangement.clear();
        assertNull(getTopBlock(arrangement));
        assertNull(getBottomBlock(arrangement));
    }

    @Test
    public void testEquals() {
        BorderArrangement a1 = new BorderArrangement();
        BorderArrangement a2 = new BorderArrangement();
        assertTrue(a1.equals(a2));
        assertTrue(a1.equals(a1));
        assertFalse(a1.equals(null));
        assertFalse(a1.equals("not an arrangement"));

        a1.add(new EmptyBlock(10.0, 10.0), RectangleEdge.TOP);
        assertFalse(a1.equals(a2));
        a2.add(new EmptyBlock(10.0, 10.0), RectangleEdge.TOP);
        assertTrue(a1.equals(a2));

        a1.add(new EmptyBlock(20.0, 20.0), RectangleEdge.BOTTOM);
        assertFalse(a1.equals(a2));
        a2.add(new EmptyBlock(20.0, 20.0), RectangleEdge.BOTTOM);
        assertTrue(a1.equals(a2));

        a1.add(new EmptyBlock(30.0, 30.0), RectangleEdge.LEFT);
        assertFalse(a1.equals(a2));
        a2.add(new EmptyBlock(30.0, 30.0), RectangleEdge.LEFT);
        assertTrue(a1.equals(a2));

        a1.add(new EmptyBlock(40.0, 40.0), RectangleEdge.RIGHT);
        assertFalse(a1.equals(a2));
        a2.add(new EmptyBlock(40.0, 40.0), RectangleEdge.RIGHT);
        assertTrue(a1.equals(a2));

        a1.add(new EmptyBlock(50.0, 50.0), null);
        assertFalse(a1.equals(a2));
        a2.add(new EmptyBlock(50.0, 50.0), null);
        assertTrue(a1.equals(a2));
    }

    @Test
    public void testArrangeNN() {
        BlockContainer container = new BlockContainer(arrangement);
        Graphics2D g2 = null; // dummy
        Size2D size = arrangement.arrangeNN(container, g2);
        assertEquals(0.0, size.width, 0.01);
        assertEquals(0.0, size.height, 0.01);
    }

    @Test
    public void testArrangeFN() {
        BlockContainer container = new BlockContainer(arrangement);
        Graphics2D g2 = null; // dummy
        double width = 100.0;
        Block topBlock = new EmptyBlock(50.0, 20.0);
        Block bottomBlock = new EmptyBlock(60.0, 30.0);
        Block leftBlock = new EmptyBlock(10.0, 10.0);
        Block rightBlock = new EmptyBlock(20.0, 10.0);
        Block centerBlock = new EmptyBlock(30.0, 40.0);
        arrangement.add(topBlock, RectangleEdge.TOP);
        arrangement.add(bottomBlock, RectangleEdge.BOTTOM);
        arrangement.add(leftBlock, RectangleEdge.LEFT);
        arrangement.add(rightBlock, RectangleEdge.RIGHT);
        arrangement.add(centerBlock, null);

        Size2D result = arrangement.arrangeFN(container, g2, width);
        assertEquals(width, result.width, 0.01);
        assertEquals(20.0 + 30.0 + Math.max(10.0, 10.0), result.height, 0.01); // top + bottom + max(left,right)
    }

    @Test
    public void testArrangeRR() {
        BlockContainer container = new BlockContainer(arrangement);
        Graphics2D g2 = null; // dummy
        Range widthRange = new Range(0.0, 100.0);
        Range heightRange = new Range(0.0, 100.0);
        Block topBlock = new EmptyBlock(50.0, 20.0);
        Block bottomBlock = new EmptyBlock(60.0, 30.0);
        Block leftBlock = new EmptyBlock(10.0, 10.0);
        Block rightBlock = new EmptyBlock(20.0, 10.0);
        Block centerBlock = new EmptyBlock(30.0, 40.0);
        arrangement.add(topBlock, RectangleEdge.TOP);
        arrangement.add(bottomBlock, RectangleEdge.BOTTOM);
        arrangement.add(leftBlock, RectangleEdge.LEFT);
        arrangement.add(rightBlock, RectangleEdge.RIGHT);
        arrangement.add(centerBlock, null);

        Size2D result = arrangement.arrangeRR(container, widthRange, heightRange, g2);
        assertNotNull(result);
    }

    @Test
    public void testArrangeWithNoConstraints() {
        BlockContainer container = new BlockContainer(arrangement);
        Graphics2D g2 = null; // dummy
        RectangleConstraint constraint = new RectangleConstraint(0.0, null, LengthConstraintType.NONE, 0.0, null, LengthConstraintType.NONE);
        Size2D result = arrangement.arrange(container, g2, constraint);
        assertEquals(0.0, result.width, 0.01);
        assertEquals(0.0, result.height, 0.01);
    }

    @Test
    public void testSerialize() throws Exception {
        BorderArrangement a1 = new BorderArrangement();
        a1.add(new EmptyBlock(10.0, 10.0), RectangleEdge.TOP);
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(buffer);
        out.writeObject(a1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray()));
        BorderArrangement a2 = (BorderArrangement) in.readObject();
        in.close();
        assertTrue(a1.equals(a2));
    }

    private Block getCenterBlock(BorderArrangement arr) {
        try {
            java.lang.reflect.Field field = BorderArrangement.class.getDeclaredField("centerBlock");
            field.setAccessible(true);
            return (Block) field.get(arr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Block getTopBlock(BorderArrangement arr) {
        try {
            java.lang.reflect.Field field = BorderArrangement.class.getDeclaredField("topBlock");
            field.setAccessible(true);
            return (Block) field.get(arr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Block getBottomBlock(BorderArrangement arr) {
        try {
            java.lang.reflect.Field field = BorderArrangement.class.getDeclaredField("bottomBlock");
            field.setAccessible(true);
            return (Block) field.get(arr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Block getLeftBlock(BorderArrangement arr) {
        try {
            java.lang.reflect.Field field = BorderArrangement.class.getDeclaredField("leftBlock");
            field.setAccessible(true);
            return (Block) field.get(arr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Block getRightBlock(BorderArrangement arr) {
        try {
            java.lang.reflect.Field field = BorderArrangement.class.getDeclaredField("rightBlock");
            field.setAccessible(true);
            return (Block) field.get(arr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static class EmptyBlock implements Block {
        private double width;
        private double height;

        public EmptyBlock(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public Size2D arrange(Graphics2D g2, RectangleConstraint constraint) {
            return new Size2D(width, height);
        }

        @Override
        public void draw(Graphics2D g2, Rectangle2D area) {
            // no-op
        }

        @Override
        public Size2D arrange(Graphics2D g2) {
            return new Size2D(width, height);
        }

        @Override
        public double getWidth() {
            return width;
        }

        @Override
        public double getHeight() {
            return height;
        }

        @Override
        public void setBounds(Rectangle2D bounds) {
            this.width = bounds.getWidth();
            this.height = bounds.getHeight();
        }

        @Override
        public Rectangle2D getBounds() {
            return new Rectangle2D.Double(0, 0, width, height);
        }

        @Override
        public Object draw(Graphics2D g2, Rectangle2D area, Object params) {
            return params;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EmptyBlock)) {
                return false;
            }
            EmptyBlock other = (EmptyBlock) obj;
            return this.width == other.width && this.height == other.height;
        }

        @Override
        public int hashCode() {
            int result = 17;
            long bits = Double.doubleToLongBits(width);
            result = 31 * result + (int) (bits ^ (bits >>> 32));
            bits = Double.doubleToLongBits(height);
            result = 31 * result + (int) (bits ^ (bits >>> 32));
            return result;
        }
    }
}