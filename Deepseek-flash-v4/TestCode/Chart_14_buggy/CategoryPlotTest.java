package org.jfree.chart.plot;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.jfree.chart.ChartColor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.RenderingOrder;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import java.util.List;
import java.util.ArrayList;

public class CategoryPlotTest {

    private CategoryPlot plot;
    private DefaultCategoryDataset dataset;

    @Before
    public void setUp() {
        plot = new CategoryPlot();
        dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        dataset.addValue(2.0, "Row1", "Col2");
        dataset.addValue(3.0, "Row2", "Col1");
        dataset.addValue(4.0, "Row2", "Col2");
    }

    @After
    public void tearDown() {
        plot = null;
        dataset = null;
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(null, plot.getDataset());
        assertEquals(null, plot.getDomainAxis());
        assertEquals(null, plot.getRangeAxis());
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        assertEquals(true, plot.isDomainGridlinesVisible());
        assertEquals(true, plot.isRangeGridlinesVisible());
        assertEquals(1, plot.getDomainAxisCount());
        assertEquals(1, plot.getRangeAxisCount());
        assertEquals(0, plot.getDatasetCount());
        assertEquals(0, plot.getRendererCount());
        assertNotNull(plot.getAnnotations());
        assertEquals(SortOrder.ASCENDING, plot.getRowRenderingOrder());
        assertEquals(SortOrder.ASCENDING, plot.getColumnRenderingOrder());
        assertEquals(DatasetRenderingOrder.REVERSE, plot.getDatasetRenderingOrder());
        assertEquals(RenderingOrder.REVERSE, plot.getRenderingOrder());
        assertNotNull(plot.getDomainGridlineStroke());
        assertNotNull(plot.getRangeGridlineStroke());
        assertNotNull(plot.getDomainGridlinePaint());
        assertNotNull(plot.getRangeGridlinePaint());
    }

    @Test
    public void testSetDataset() {
        assertNull(plot.getDataset());
        plot.setDataset(dataset);
        assertSame(dataset, plot.getDataset());
        assertEquals(1, plot.getDatasetCount());
    }

    @Test
    public void testSetDatasetNull() {
        plot.setDataset(null);
        assertNull(plot.getDataset());
        assertEquals(0, plot.getDatasetCount());
    }

    @Test
    public void testSetOrientation() {
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetOrientationNull() {
        plot.setOrientation(null);
    }

    @Test
    public void testSetDomainAxis() {
        CategoryAxis axis = new CategoryAxis("Domain");
        plot.setDomainAxis(axis);
        assertSame(axis, plot.getDomainAxis());
    }

    @Test
    public void testSetRangeAxis() {
        NumberAxis axis = new NumberAxis("Range");
        plot.setRangeAxis(axis);
        assertSame(axis, plot.getRangeAxis());
    }

    @Test
    public void testSetRenderer() {
        CategoryItemRenderer renderer = new LineAndShapeRenderer();
        plot.setRenderer(renderer);
        assertSame(renderer, plot.getRenderer());
    }

    @Test
    public void testSetDatasetForIndex() {
        plot.setDataset(2, dataset);
        assertEquals(3, plot.getDatasetCount());
        assertSame(dataset, plot.getDataset(2));
    }

    @Test
    public void testGetDomainAxisCount() {
        assertEquals(1, plot.getDomainAxisCount());
        plot.setDomainAxis(new CategoryAxis());
        assertEquals(1, plot.getDomainAxisCount());
    }

    @Test
    public void testGetRangeAxisCount() {
        assertEquals(1, plot.getRangeAxisCount());
        plot.setRangeAxis(new NumberAxis());
        assertEquals(1, plot.getRangeAxisCount());
    }

    @Test
    public void testSetOrientationVertical() {
        plot.setOrientation(PlotOrientation.VERTICAL);
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
    }

    @Test
    public void testGetPlotType() {
        assertEquals("Category_Plot", plot.getPlotType());
    }

    @Test
    public void testSetDomainGridlinesVisible() {
        plot.setDomainGridlinesVisible(false);
        assertFalse(plot.isDomainGridlinesVisible());
        plot.setDomainGridlinesVisible(true);
        assertTrue(plot.isDomainGridlinesVisible());
    }

    @Test
    public void testSetRangeGridlinesVisible() {
        plot.setRangeGridlinesVisible(false);
        assertFalse(plot.isRangeGridlinesVisible());
        plot.setRangeGridlinesVisible(true);
        assertTrue(plot.isRangeGridlinesVisible());
    }

    @Test
    public void testSetDomainGridlineStroke() {
        Stroke stroke = new BasicStroke(2.0f);
        plot.setDomainGridlineStroke(stroke);
        assertSame(stroke, plot.getDomainGridlineStroke());
    }

    @Test
    public void testSetRangeGridlineStroke() {
        Stroke stroke = new BasicStroke(2.0f);
        plot.setRangeGridlineStroke(stroke);
        assertSame(stroke, plot.getRangeGridlineStroke());
    }

    @Test
    public void testSetDomainGridlinePaint() {
        Paint paint = Color.RED;
        plot.setDomainGridlinePaint(paint);
        assertEquals(paint, plot.getDomainGridlinePaint());
    }

    @Test
    public void testSetRangeGridlinePaint() {
        Paint paint = Color.BLUE;
        plot.setRangeGridlinePaint(paint);
        assertEquals(paint, plot.getRangeGridlinePaint());
    }

    @Test
    public void testSetAnchorValue() {
        plot.setAnchorValue(10.0);
        assertEquals(10.0, plot.getAnchorValue(), 0.0);
    }

    @Test
    public void testSetAnchorValueNotify() {
        plot.setAnchorValue(5.0, false);
        assertEquals(5.0, plot.getAnchorValue(), 0.0);
    }

    @Test
    public void testEquals() {
        CategoryPlot plot2 = new CategoryPlot();
        assertTrue(plot.equals(plot2));
        plot.setAnchorValue(3.14);
        assertFalse(plot.equals(plot2));
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(plot.equals(plot));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(plot.equals("test"));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(plot.equals(null));
    }

    @Test
    public void testGetRangeCrosshairValue() {
        assertEquals(0.0, plot.getRangeCrosshairValue(), 0.0);
        plot.setRangeCrosshairValue(10.5);
        assertEquals(10.5, plot.getRangeCrosshairValue(), 0.0);
    }

    @Test
    public void testSetRangeCrosshairValue() {
        plot.setRangeCrosshairValue(7.5);
        assertEquals(7.5, plot.getRangeCrosshairValue(), 0.0);
    }

    @Test
    public void testIsRangeCrosshairVisible() {
        assertFalse(plot.isRangeCrosshairVisible());
        plot.setRangeCrosshairVisible(true);
        assertTrue(plot.isRangeCrosshairVisible());
    }

    @Test
    public void testSetRangeCrosshairLockedOnData() {
        assertTrue(plot.isRangeCrosshairLockedOnData());
        plot.setRangeCrosshairLockedOnData(false);
        assertFalse(plot.isRangeCrosshairLockedOnData());
    }

    @Test
    public void testSetRangeCrosshairStroke() {
        Stroke stroke = new BasicStroke(1.5f);
        plot.setRangeCrosshairStroke(stroke);
        assertSame(stroke, plot.getRangeCrosshairStroke());
    }

    @Test
    public void testSetRangeCrosshairPaint() {
        Paint paint = Color.GREEN;
        plot.setRangeCrosshairPaint(paint);
        assertEquals(paint, plot.getRangeCrosshairPaint());
    }

    @Test
    public void testSetFixedDomainAxisSpace() {
        plot.setFixedDomainAxisSpace(null);
        assertNull(plot.getFixedDomainAxisSpace());
    }

    @Test
    public void testSetFixedRangeAxisSpace() {
        plot.setFixedRangeAxisSpace(null);
        assertNull(plot.getFixedRangeAxisSpace());
    }

    @Test
    public void testAddDataset() {
        plot.setDataset(0, dataset);
        assertEquals(1, plot.getDatasetCount());
        assertSame(dataset, plot.getDataset(0));
    }

    @Test
    public void testGetDatasetIndex() {
        plot.setDataset(0, dataset);
        assertEquals(0, plot.getDatasetIndex(dataset));
    }
}