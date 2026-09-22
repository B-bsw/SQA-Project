package org.jfree.chart.plot;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PlotState;
import org.jfree.chart.plot.TableOrder;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.title.TextTitle;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.Map;

public class MultiplePiePlotTest {

    private MultiplePiePlot plot;

    @Before
    public void setUp() {
        this.plot = new MultiplePiePlot(createDataset());
    }

    @After
    public void tearDown() {
        this.plot = null;
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Col1");
        dataset.addValue(2.0, "Row2", "Col1");
        dataset.addValue(3.0, "Row1", "Col2");
        dataset.addValue(4.0, "Row2", "Col2");
        return dataset;
    }

    @Test
    public void testDefaultConstructor() {
        MultiplePiePlot p = new MultiplePiePlot();
        Assert.assertNull(p.getDataset());
        Assert.assertEquals(TableOrder.BY_COLUMN, p.getDataExtractOrder());
        Assert.assertEquals(0.0, p.getLimit(), 0.0);
        Assert.assertNotNull(p.getPieChart());
        Assert.assertEquals("Multiple Pie Plot", p.getPlotType());
    }

    @Test
    public void testConstructorWithDataset() {
        MultiplePiePlot p = new MultiplePiePlot(createDataset());
        Assert.assertNotNull(p.getDataset());
        Assert.assertEquals(2, p.getDataset().getRowCount());
        Assert.assertEquals(2, p.getDataset().getColumnCount());
    }

    @Test
    public void testSetDataset() {
        CategoryDataset newDataset = createDataset();
        this.plot.setDataset(newDataset);
        Assert.assertSame(newDataset, this.plot.getDataset());
        
        this.plot.setDataset(null);
        Assert.assertNull(this.plot.getDataset());
    }

    @Test
    public void testSetPieChart() {
        JFreeChart chart = new JFreeChart(new PiePlot());
        this.plot.setPieChart(chart);
        Assert.assertSame(chart, this.plot.getPieChart());
    }

    @Test
    public void testSetPieChartNull() {
        try {
            this.plot.setPieChart(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Null 'pieChart' argument.", e.getMessage());
        }
    }

    @Test
    public void testSetPieChartWithNonPiePlot() {
        JFreeChart chart = new JFreeChart(new org.jfree.chart.plot.XYPlot());
        try {
            this.plot.setPieChart(chart);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("The 'pieChart' argument must be a chart based on a PiePlot.", e.getMessage());
        }
    }

    @Test
    public void testSetDataExtractOrder() {
        this.plot.setDataExtractOrder(TableOrder.BY_ROW);
        Assert.assertEquals(TableOrder.BY_ROW, this.plot.getDataExtractOrder());
    }

    @Test
    public void testSetDataExtractOrderNull() {
        try {
            this.plot.setDataExtractOrder(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Null 'order' argument", e.getMessage());
        }
    }

    @Test
    public void testSetLimit() {
        this.plot.setLimit(0.5);
        Assert.assertEquals(0.5, this.plot.getLimit(), 0.0001);
        this.plot.setLimit(0.0);
        Assert.assertEquals(0.0, this.plot.getLimit(), 0.0001);
    }

    @Test
    public void testSetAggregatedItemsKey() {
        this.plot.setAggregatedItemsKey("Other");
        Assert.assertEquals("Other", this.plot.getAggregatedItemsKey());
    }

    @Test
    public void testSetAggregatedItemsKeyNull() {
        try {
            this.plot.setAggregatedItemsKey(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Null 'key' argument.", e.getMessage());
        }
    }

    @Test
    public void testGetAggregatedItemsPaint() {
        Assert.assertEquals(Color.lightGray, this.plot.getAggregatedItemsPaint());
    }

    @Test
    public void testSetAggregatedItemsPaint() {
        this.plot.setAggregatedItemsPaint(Color.red);
        Assert.assertEquals(Color.red, this.plot.getAggregatedItemsPaint());
    }

    @Test
    public void testSetAggregatedItemsPaintNull() {
        try {
            this.plot.setAggregatedItemsPaint(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Null 'paint' argument.", e.getMessage());
        }
    }

    @Test
    public void testDrawWithEmptyDataset() {
        MultiplePiePlot p = new MultiplePiePlot(null);
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new java.awt.Rectangle(0, 0, 200, 200);
        p.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDrawWithDatasetByRow() {
        this.plot.setDataExtractOrder(TableOrder.BY_ROW);
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new java.awt.Rectangle(0, 0, 200, 200);
        this.plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testDrawWithDatasetByColumn() {
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new java.awt.Rectangle(0, 0, 200, 200);
        this.plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testGetLegendItemsByRow() {
        this.plot.setDataExtractOrder(TableOrder.BY_ROW);
        LegendItemCollection legendItems = this.plot.getLegendItems();
        Assert.assertNotNull(legendItems);
        Assert.assertTrue(legendItems.getItemCount() > 0);
    }

    @Test
    public void testGetLegendItemsByColumn() {
        LegendItemCollection legendItems = this.plot.getLegendItems();
        Assert.assertNotNull(legendItems);
        Assert.assertTrue(legendItems.getItemCount() > 0);
    }

    @Test
    public void testGetLegendItemsEmptyDataset() {
        MultiplePiePlot p = new MultiplePiePlot(null);
        LegendItemCollection legendItems = p.getLegendItems();
        Assert.assertNull(legendItems);
    }

    @Test
    public void testEqualsSameObject() {
        Assert.assertTrue(this.plot.equals(this.plot));
    }

    @Test
    public void testEqualsDifferentObject() {
        Assert.assertFalse(this.plot.equals(new Object()));
    }

    @Test
    public void testEqualsNull() {
        Assert.assertFalse(this.plot.equals(null));
    }

    @Test
    public void testEqualsDifferentChart() {
        MultiplePiePlot other = new MultiplePiePlot(null);
        Assert.assertFalse(this.plot.equals(other));
    }

    @Test
    public void testSetDatasetWithNullAndCheckListeners() {
        assertTrue(this.plot.hasListener());
        this.plot.setDataset(null);
        Assert.assertFalse(this.plot.hasListener());
    }

    @Test
    public void testDrawWithLimitAggregation() {
        this.plot.setLimit(100.0);
        BufferedImage image = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = image.createGraphics();
        Rectangle2D area = new java.awt.Rectangle(0, 0, 200, 200);
        this.plot.draw(g2, area, null, null, null);
        g2.dispose();
    }

    @Test
    public void testSetAggregatedItemsKeyValidString() {
        this.plot.setAggregatedItemsKey("TestKey");
        Assert.assertEquals("TestKey", this.plot.getAggregatedItemsKey());
    }
}