package org.jfree.chart.plot;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.util.Rotation;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.general.DefaultPieDataset;

public class PiePlotTest {

    private PiePlot plot;

    @Before
    public void setUp() {
        plot = new PiePlot();
    }

    @After
    public void tearDown() {
        plot = null;
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(plot);
        assertNull(plot.getDataset());
        assertEquals(0.0, plot.getStartAngle(), 0.0001);
        assertEquals(Rotation.ANTICLOCKWISE, plot.getDirection());
        assertEquals(0.0, plot.getInteriorGap(), 0.0001);
        assertTrue(plot.isCircular());
        assertFalse(plot.getIgnoreNullValues());
        assertFalse(plot.getIgnoreZeroValues());
    }

    @Test
    public void testConstructorWithDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 1.0);
        plot = new PiePlot(dataset);
        assertNotNull(plot.getDataset());
        assertEquals("A", plot.getDataset().getKey(0));
    }

    @Test
    public void testConstructorWithNullDataset() {
        plot = new PiePlot(null);
        assertNull(plot.getDataset());
    }

    @Test
    public void testSetDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 1.0);
        plot.setDataset(dataset);
        assertSame(dataset, plot.getDataset());
        plot.setDataset(null);
        assertNull(plot.getDataset());
    }

    @Test
    public void testSetPieIndex() {
        plot.setPieIndex(5);
        assertEquals(5, plot.getPieIndex());
        plot.setPieIndex(0);
        assertEquals(0, plot.getPieIndex());
    }

    @Test
    public void testSetStartAngle() {
        plot.setStartAngle(90.0);
        assertEquals(90.0, plot.getStartAngle(), 0.0001);
        plot.setStartAngle(0.0);
        assertEquals(0.0, plot.getStartAngle(), 0.0001);
        plot.setStartAngle(-45.5);
        assertEquals(-45.5, plot.getStartAngle(), 0.0001);
    }

    @Test
    public void testSetDirection() {
        plot.setDirection(Rotation.CLOCKWISE);
        assertEquals(Rotation.CLOCKWISE, plot.getDirection());
        plot.setDirection(Rotation.ANTICLOCKWISE);
        assertEquals(Rotation.ANTICLOCKWISE, plot.getDirection());
        plot.setDirection(null);
        assertEquals(Rotation.ANTICLOCKWISE, plot.getDirection());
    }

    @Test
    public void testSetInteriorGap() {
        plot.setInteriorGap(0.25);
        assertEquals(0.25, plot.getInteriorGap(), 0.0001);
        plot.setInteriorGap(0.0);
        assertEquals(0.0, plot.getInteriorGap(), 0.0001);
        plot.setInteriorGap(-0.1);
        assertEquals(-0.1, plot.getInteriorGap(), 0.0001);
    }

    @Test
    public void testSetCircular() {
        plot.setCircular(true);
        assertTrue(plot.isCircular());
        plot.setCircular(false);
        assertFalse(plot.isCircular());
        plot.setCircular(true);
        assertTrue(plot.isCircular());
    }

    @Test
    public void testSetIgnoreNullValues() {
        plot.setIgnoreNullValues(true);
        assertTrue(plot.getIgnoreNullValues());
        plot.setIgnoreNullValues(false);
        assertFalse(plot.getIgnoreNullValues());
    }

    @Test
    public void testSetIgnoreZeroValues() {
        plot.setIgnoreZeroValues(true);
        assertTrue(plot.getIgnoreZeroValues());
        plot.setIgnoreZeroValues(false);
        assertFalse(plot.getIgnoreZeroValues());
    }

    @Test
    public void testSetBaseSectionPaint() {
        plot.setBaseSectionPaint(Color.RED);
        assertEquals(Color.RED, plot.getBaseSectionPaint());
        plot.setBaseSectionPaint(null);
        assertNull(plot.getBaseSectionPaint());
    }

    @Test
    public void testSetShadowPaint() {
        plot.setShadowPaint(Color.GRAY);
        assertEquals(Color.GRAY, plot.getShadowPaint());
        plot.setShadowPaint(null);
        assertNull(plot.getShadowPaint());
    }

    @Test
    public void testSetShadowXOffset() {
        plot.setShadowXOffset(5.0);
        assertEquals(5.0, plot.getShadowXOffset(), 0.0001);
        plot.setShadowXOffset(0.0);
        assertEquals(0.0, plot.getShadowXOffset(), 0.0001);
    }

    @Test
    public void testSetShadowYOffset() {
        plot.setShadowYOffset(10.0);
        assertEquals(10.0, plot.getShadowYOffset(), 0.0001);
        plot.setShadowYOffset(0.0);
        assertEquals(0.0, plot.getShadowYOffset(), 0.0001);
    }

    @Test
    public void testSetLabelFont() {
        Font font = new Font("Arial", Font.BOLD, 14);
        plot.setLabelFont(font);
        assertEquals(font, plot.getLabelFont());
        plot.setLabelFont(null);
        assertNotNull(plot.getLabelFont());
    }

    @Test
    public void testSetLabelLinkMargin() {
        plot.setLabelLinkMargin(0.2);
        assertEquals(0.2, plot.getLabelLinkMargin(), 0.0001);
        plot.setLabelLinkMargin(0.0);
        assertEquals(0.0, plot.getLabelLinkMargin(), 0.0001);
    }

    @Test
    public void testSetLabelLinkPaint() {
        plot.setLabelLinkPaint(Color.BLUE);
        assertEquals(Color.BLUE, plot.getLabelLinkPaint());
        plot.setLabelLinkPaint(null);
        assertEquals(Color.BLUE, plot.getLabelLinkPaint());
    }

    @Test
    public void testSetLabelBackgroundPaint() {
        plot.setLabelBackgroundPaint(Color.YELLOW);
        assertEquals(Color.YELLOW, plot.getLabelBackgroundPaint());
        plot.setLabelBackgroundPaint(null);
        assertNull(plot.getLabelBackgroundPaint());
    }

    @Test
    public void testSetLabelOutlinePaint() {
        plot.setLabelOutlinePaint(Color.GREEN);
        assertEquals(Color.GREEN, plot.getLabelOutlinePaint());
        plot.setLabelOutlinePaint(null);
        assertNull(plot.getLabelOutlinePaint());
    }

    @Test
    public void testSetLabelPadding() {
        RectangleInsets padding = new RectangleInsets(1.0, 2.0, 3.0, 4.0);
        plot.setLabelPadding(padding);
        assertEquals(padding, plot.getLabelPadding());
        plot.setLabelPadding(null);
        assertNotNull(plot.getLabelPadding());
    }

    @Test
    public void testSetExplodePercent() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 1.0);
        plot.setDataset(dataset);
        plot.setExplodePercent("A", 0.0);
        assertEquals(0.0, plot.getExplodePercent("A"), 0.0001);
        plot.setExplodePercent("A", 0.5);
        assertEquals(0.5, plot.getExplodePercent("A"), 0.0001);
        plot.setExplodePercent("A", 1.0);
        assertEquals(1.0, plot.getExplodePercent("A"), 0.0001);
        plot.setExplodePercent("A", -0.1);
        assertEquals(0.0, plot.getExplodePercent("A"), 0.0001);
    }

    @Test
    public void testExplodePercentWithNullKey() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 1.0);
        plot.setDataset(dataset);
        plot.setExplodePercent(null, 0.5);
        assertEquals(Double.NaN, plot.getExplodePercent("A"), 0.0001);
    }

    @Test
    public void testSetNoDataMessage() {
        plot.setNoDataMessage("No data available");
        assertEquals("No data available", plot.getNoDataMessage());
        plot.setNoDataMessage(null);
        assertNull(plot.getNoDataMessage());
    }

    @Test
    public void testSetLabelLinksVisible() {
        plot.setLabelLinksVisible(true);
        assertTrue(plot.getLabelLinksVisible());
        plot.setLabelLinksVisible(false);
        assertFalse(plot.getLabelLinksVisible());
    }

    @Test
    public void testSetSimpleLabels() {
        plot.setSimpleLabels(true);
        assertTrue(plot.getSimpleLabels());
        plot.setSimpleLabels(false);
        assertFalse(plot.getSimpleLabels());
    }

    @Test
    public void testSetToolTipGenerator() {
        plot.setToolTipGenerator(null);
        assertNull(plot.getToolTipGenerator());
    }

    @Test
    public void testSetLegendLabelGenerator() {
        plot.setLegendLabelGenerator(null);
        assertNull(plot.getLegendLabelGenerator());
    }

    @Test
    public void testSetLabelGenerator() {
        plot.setLabelGenerator(null);
        assertNull(plot.getLabelGenerator());
    }

    @Test
    public void testGetPlotType() {
        assertNotNull(plot.getPlotType());
        assertTrue(plot.getPlotType().length() > 0);
    }

    @Test
    public void testEquals() {
        PiePlot other = new PiePlot();
        assertTrue(plot.equals(other));
        plot.setPieIndex(1);
        assertFalse(plot.equals(other));
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 1.0);
        plot.setDataset(dataset);
        plot.setExplodePercent("A", 0.2);
        PiePlot clone = (PiePlot) plot.clone();
        assertNotSame(plot, clone);
        assertEquals(plot, clone);
        assertNotSame(plot.getDataset(), clone.getDataset());
    }

    @Test
    public void testGetSectionPaintWithEmptyDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        plot.setDataset(dataset);
        assertEquals(plot.getBaseSectionPaint(), plot.getSectionPaint("A"));
    }

    @Test
    public void testGetSectionPaintWithDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 1.0);
        plot.setDataset(dataset);
        assertNotNull(plot.getSectionPaint("A"));
    }

    @Test
    public void testGetExplodePercentWhenExplodeMapNull() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 1.0);
        plot.setDataset(dataset);
        assertEquals(0.0, plot.getExplodePercent("A"), 0.0001);
    }

    @Test
    public void testGetMaximumExplodePercent() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("A", 1.0);
        dataset.setValue("B", 2.0);
        plot.setDataset(dataset);
        plot.setExplodePercent("A", 0.3);
        plot.setExplodePercent("B", 0.6);
        assertEquals(0.6, plot.getMaximumExplodePercent(), 0.0001);
    }
}