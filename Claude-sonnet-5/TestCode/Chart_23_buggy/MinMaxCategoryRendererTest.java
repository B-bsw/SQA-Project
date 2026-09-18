package org.jfree.chart.renderer.category;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;

import javax.swing.Icon;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.Before;
import org.junit.Test;

public class MinMaxCategoryRendererTest {

    private MinMaxCategoryRenderer renderer;

    @Before
    public void setUp() {
        this.renderer = new MinMaxCategoryRenderer();
    }

    // ---------- helper reflection utility ----------
    private Object getPrivateField(Object obj, String name) throws Exception {
        Field f = MinMaxCategoryRenderer.class.getDeclaredField(name);
        f.setAccessible(true);
        return f.get(obj);
    }

    // ---------- simple listener to detect notifications ----------
    private static class TestListener implements RendererChangeListener {
        boolean called = false;
        public void rendererChanged(RendererChangeEvent event) {
            this.called = true;
        }
    }

    // ================= Constructor / defaults =================

    @Test
    public void testDefaults() {
        assertFalse(this.renderer.isDrawLines());
        assertEquals(Color.black, this.renderer.getGroupPaint());
        assertTrue(this.renderer.getGroupStroke() instanceof BasicStroke);
        assertNotNull(this.renderer.getObjectIcon());
        assertNotNull(this.renderer.getMinIcon());
        assertNotNull(this.renderer.getMaxIcon());
    }

    // ================= isDrawLines / setDrawLines =================

    @Test
    public void testSetDrawLinesChangesValueAndNotifies() {
        TestListener listener = new TestListener();
        this.renderer.addChangeListener(listener);
        this.renderer.setDrawLines(true);
        assertTrue(this.renderer.isDrawLines());
        assertTrue(listener.called);
    }

    @Test
    public void testSetDrawLinesSameValueDoesNotNotify() {
        TestListener listener = new TestListener();
        this.renderer.addChangeListener(listener);
        // default is false, setting false again should not notify
        this.renderer.setDrawLines(false);
        assertFalse(listener.called);
    }

    // ================= GroupPaint =================

    @Test
    public void testSetGroupPaintNullThrowsException() {
        try {
            this.renderer.setGroupPaint(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetGroupPaintValid() {
        TestListener listener = new TestListener();
        this.renderer.addChangeListener(listener);
        this.renderer.setGroupPaint(Color.red);
        assertEquals(Color.red, this.renderer.getGroupPaint());
        assertTrue(listener.called);
    }

    // ================= GroupStroke =================

    @Test
    public void testSetGroupStrokeNullThrowsException() {
        try {
            this.renderer.setGroupStroke(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetGroupStrokeValid() {
        TestListener listener = new TestListener();
        this.renderer.addChangeListener(listener);
        BasicStroke stroke = new BasicStroke(2.5f);
        this.renderer.setGroupStroke(stroke);
        assertEquals(stroke, this.renderer.getGroupStroke());
        assertTrue(listener.called);
    }

    // ================= ObjectIcon =================

    @Test
    public void testSetObjectIconNullThrowsException() {
        try {
            this.renderer.setObjectIcon(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetObjectIconValid() {
        TestListener listener = new TestListener();
        this.renderer.addChangeListener(listener);
        Icon icon = new DummyIcon();
        this.renderer.setObjectIcon(icon);
        assertEquals(icon, this.renderer.getObjectIcon());
        assertTrue(listener.called);
    }

    // ================= MaxIcon =================

    @Test
    public void testSetMaxIconNullThrowsException() {
        try {
            this.renderer.setMaxIcon(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetMaxIconValid() {
        TestListener listener = new TestListener();
        this.renderer.addChangeListener(listener);
        Icon icon = new DummyIcon();
        this.renderer.setMaxIcon(icon);
        assertEquals(icon, this.renderer.getMaxIcon());
        assertTrue(listener.called);
    }

    // ================= MinIcon =================

    @Test
    public void testSetMinIconNullThrowsException() {
        try {
            this.renderer.setMinIcon(null);
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetMinIconValid() {
        TestListener listener = new TestListener();
        this.renderer.addChangeListener(listener);
        Icon icon = new DummyIcon();
        this.renderer.setMinIcon(icon);
        assertEquals(icon, this.renderer.getMinIcon());
        assertTrue(listener.called);
    }

    // ================= drawItem =================

    private Graphics2D createGraphics() {
        BufferedImage img = new BufferedImage(400, 400,
                BufferedImage.TYPE_INT_RGB);
        return img.createGraphics();
    }

    @Test
    public void testDrawItemNullValueDoesNothing() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(null, "S1", "C1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                this.renderer);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 300, 300);
        Graphics2D g2 = createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState(null);

        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis,
                rangeAxis, dataset, 0, 0, 0);

        int lastCategory = (Integer) getPrivateField(this.renderer,
                "lastCategory");
        assertEquals(-1, lastCategory);
    }

    @Test
    public void testDrawItemFirstCallResetsMinMax() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "S1", "C1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                this.renderer);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 300, 300);
        Graphics2D g2 = createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState(null);

        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis,
                rangeAxis, dataset, 0, 0, 0);

        int lastCategory = (Integer) getPrivateField(this.renderer,
                "lastCategory");
        double min = (Double) getPrivateField(this.renderer, "min");
        double max = (Double) getPrivateField(this.renderer, "max");
        assertEquals(0, lastCategory);
        assertEquals(10.0, min, 0.0001);
        assertEquals(10.0, max, 0.0001);
    }

    @Test
    public void testDrawItemSecondCallSameColumnTriggersMinMaxDraw()
            throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "S1", "C1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                this.renderer);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 300, 300);
        Graphics2D g2 = createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState(null);

        // first call resets lastCategory to 0
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis,
                rangeAxis, dataset, 0, 0, 0);
        // second call with same row/column: lastCategory == column,
        // and since dataset has only 1 row, rowCount-1 == row -> draws line
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis,
                rangeAxis, dataset, 0, 0, 0);

        double min = (Double) getPrivateField(this.renderer, "min");
        double max = (Double) getPrivateField(this.renderer, "max");
        assertEquals(10.0, min, 0.0001);
        assertEquals(10.0, max, 0.0001);
    }

    @Test
    public void testDrawItemTwoRowsUpdatesMinMaxCorrectly() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(15.0, "S1", "C1");
        dataset.addValue(5.0, "S2", "C1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                this.renderer);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 300, 300);
        Graphics2D g2 = createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState(null);

        // row 0: resets lastCategory = 0, min = max = 15.0
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis,
                rangeAxis, dataset, 0, 0, 0);
        // row 1: lastCategory == column(0), value 5.0 < min -> min updated,
        // and since row==rowCount-1 (last row), draws min/max line
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis,
                rangeAxis, dataset, 1, 0, 0);

        double min = (Double) getPrivateField(this.renderer, "min");
        double max = (Double) getPrivateField(this.renderer, "max");
        assertEquals(5.0, min, 0.0001);
        assertEquals(15.0, max, 0.0001);
    }

    @Test
    public void testDrawItemHorizontalOrientation() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(15.0, "S1", "C1");
        dataset.addValue(5.0, "S2", "C1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                this.renderer);
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 300, 300);
        Graphics2D g2 = createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState(null);

        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis,
                rangeAxis, dataset, 0, 0, 0);
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis,
                rangeAxis, dataset, 1, 0, 0);

        double min = (Double) getPrivateField(this.renderer, "min");
        double max = (Double) getPrivateField(this.renderer, "max");
        assertEquals(5.0, min, 0.0001);
        assertEquals(15.0, max, 0.0001);
    }

    @Test
    public void testDrawItemWithPlotLinesPreviousValuePresent()
            throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "S1", "C1");
        dataset.addValue(8.0, "S1", "C2");

        this.renderer.setDrawLines(true);

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                this.renderer);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 300, 300);
        Graphics2D g2 = createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState(null);

        // column 1, previous value at column 0 is 5.0 (non-null)
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis,
                rangeAxis, dataset, 0, 1, 0);

        // no exception means line was drawn successfully
        assertTrue(this.renderer.isDrawLines());
    }

    @Test
    public void testDrawItemWithPlotLinesPreviousValueNull() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(null, "S1", "C1");
        dataset.addValue(8.0, "S1", "C2");

        this.renderer.setDrawLines(true);

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                this.renderer);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 300, 300);
        Graphics2D g2 = createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState(null);

        // column 1, previous value at column 0 is null -> skip line drawing
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis,
                rangeAxis, dataset, 0, 1, 0);

        assertTrue(this.renderer.isDrawLines());
    }

    @Test
    public void testDrawItemColumnZeroWithPlotLinesDoesNotLookForPrevious()
            throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(5.0, "S1", "C1");

        this.renderer.setDrawLines(true);

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                this.renderer);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 300, 300);
        Graphics2D g2 = createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState(null);

        // column == 0, so no attempt to fetch previous value
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis,
                rangeAxis, dataset, 0, 0, 0);

        assertTrue(this.renderer.isDrawLines());
    }

    @Test
    public void testDrawItemAddsEntity() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "S1", "C1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                this.renderer);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 300, 300);
        Graphics2D g2 = createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState(null);

        EntityCollection entities = new StandardEntityCollection();
        state.setEntityCollection(entities);

        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis,
                rangeAxis, dataset, 0, 0, 0);

        assertEquals(1, entities.getEntityCount());
    }

    @Test
    public void testDrawItemNoEntityCollection() throws Exception {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10.0, "S1", "C1");

        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis,
                this.renderer);
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 300, 300);
        Graphics2D g2 = createGraphics();
        CategoryItemRendererState state = new CategoryItemRendererState(null);

        // no entity collection set -> should not throw exception
        this.renderer.drawItem(g2, state, dataArea, plot, domainAxis,
                rangeAxis, dataset, 0, 0, 0);

        // if we reach here without exception the test passes
        assertNotNull(state);
    }

    // ================= Serialization =================

    @Test
    public void testSerialization() throws Exception {
        this.renderer.setGroupPaint(Color.blue);
        this.renderer.setGroupStroke(new BasicStroke(3.0f));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this.renderer);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(
                baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        MinMaxCategoryRenderer restored =
                (MinMaxCategoryRenderer) ois.readObject();
        ois.close();

        assertEquals(Color.blue, restored.getGroupPaint());
        assertTrue(restored.getGroupStroke() instanceof BasicStroke);
        BasicStroke restoredStroke = (BasicStroke) restored.getGroupStroke();
        assertEquals(3.0f, restoredStroke.getLineWidth(), 0.0001f);
        assertNotNull(restored.getMinIcon());
        assertNotNull(restored.getMaxIcon());
        assertNotNull(restored.getObjectIcon());
    }

    // ---------- dummy Icon implementation for tests ----------
    private static class DummyIcon implements Icon {
        public void paintIcon(java.awt.Component c, java.awt.Graphics g,
                int x, int y) {
            // no-op
        }

        public int getIconWidth() {
            return 8;
        }

        public int getIconHeight() {
            return 8;
        }
    }
}