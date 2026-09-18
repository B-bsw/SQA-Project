package org.jfree.chart.axis;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxisTest {

    private static class TestAxis extends Axis {
        private static final long serialVersionUID = 1L;
        private boolean configureCalled = false;

        public TestAxis(String label) {
            super(label);
        }

        public void configure() {
            this.configureCalled = true;
        }

        public boolean isConfigureCalled() {
            return this.configureCalled;
        }

        public void resetConfigureCalled() {
            this.configureCalled = false;
        }

        public AxisSpace reserveSpace(Graphics2D g2, Plot plot,
                                      Rectangle2D plotArea,
                                      RectangleEdge edge,
                                      AxisSpace space) {
            return space;
        }

        public AxisState draw(Graphics2D g2,
                              double cursor,
                              Rectangle2D plotArea,
                              Rectangle2D dataArea,
                              RectangleEdge edge,
                              PlotRenderingInfo plotState) {
            return new AxisState(cursor);
        }

        public List refreshTicks(Graphics2D g2,
                                 AxisState state,
                                 Rectangle2D dataArea,
                                 RectangleEdge edge) {
            return Arrays.asList(new Object[0]);
        }

        public Rectangle2D testGetLabelEnclosure(Graphics2D g2, RectangleEdge edge) {
            return getLabelEnclosure(g2, edge);
        }

        public AxisState testDrawLabel(String label, Graphics2D g2,
                                      Rectangle2D plotArea, Rectangle2D dataArea,
                                      RectangleEdge edge, AxisState state,
                                      PlotRenderingInfo plotState) {
            return drawLabel(label, g2, plotArea, dataArea, edge, state, plotState);
        }

        public void testDrawAxisLine(Graphics2D g2, double cursor,
                                     Rectangle2D dataArea, RectangleEdge edge) {
            drawAxisLine(g2, cursor, dataArea, edge);
        }
    }

    private static class TestListener implements AxisChangeListener {
        private int eventCount = 0;
        private AxisChangeEvent lastEvent;

        public void axisChanged(AxisChangeEvent event) {
            this.eventCount++;
            this.lastEvent = event;
        }

        public int getEventCount() {
            return this.eventCount;
        }

        public AxisChangeEvent getLastEvent() {
            return this.lastEvent;
        }

        public void reset() {
            this.eventCount = 0;
            this.lastEvent = null;
        }
    }

    private TestAxis axis;
    private TestListener listener;
    private Graphics2D g2;

    @Before
    public void setUp() {
        this.axis = new TestAxis("Test Axis");
        this.listener = new TestListener();
        this.axis.addChangeListener(this.listener);

        BufferedImage img = new BufferedImage(300, 300, BufferedImage.TYPE_INT_ARGB);
        this.g2 = img.createGraphics();
    }

    private Axis serializeAndDeserialize(Axis source) throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(buffer);
        oos.writeObject(source);
        oos.flush();
        oos.close();

        ByteArrayInputStream in = new ByteArrayInputStream(buffer.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(in);
        Axis result = (Axis) ois.readObject();
        ois.close();
        return result;
    }

    @Test
    public void constructor_givenInitialLabel_shouldSetExpectedDefaults() {
        TestAxis a = new TestAxis("Label A");

        Assert.assertTrue(a.isVisible());
        Assert.assertEquals("Label A", a.getLabel());
        Assert.assertEquals(Axis.DEFAULT_AXIS_LABEL_FONT, a.getLabelFont());
        Assert.assertEquals(Axis.DEFAULT_AXIS_LABEL_PAINT, a.getLabelPaint());
        Assert.assertEquals(Axis.DEFAULT_AXIS_LABEL_INSETS, a.getLabelInsets());
        Assert.assertEquals(0.0, a.getLabelAngle(), 0.0001);
        Assert.assertNull(a.getLabelToolTip());
        Assert.assertNull(a.getLabelURL());

        Assert.assertTrue(a.isAxisLineVisible());
        Assert.assertEquals(Axis.DEFAULT_AXIS_LINE_PAINT, a.getAxisLinePaint());
        Assert.assertEquals(Axis.DEFAULT_AXIS_LINE_STROKE, a.getAxisLineStroke());

        Assert.assertTrue(a.isTickLabelsVisible());
        Assert.assertEquals(Axis.DEFAULT_TICK_LABEL_FONT, a.getTickLabelFont());
        Assert.assertEquals(Axis.DEFAULT_TICK_LABEL_PAINT, a.getTickLabelPaint());
        Assert.assertEquals(Axis.DEFAULT_TICK_LABEL_INSETS, a.getTickLabelInsets());

        Assert.assertTrue(a.isTickMarksVisible());
        Assert.assertEquals(Axis.DEFAULT_TICK_MARK_STROKE, a.getTickMarkStroke());
        Assert.assertEquals(Axis.DEFAULT_TICK_MARK_PAINT, a.getTickMarkPaint());
        Assert.assertEquals(Axis.DEFAULT_TICK_MARK_INSIDE_LENGTH, a.getTickMarkInsideLength(), 0.0001f);
        Assert.assertEquals(Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH, a.getTickMarkOutsideLength(), 0.0001f);

        Assert.assertNull(a.getPlot());
        Assert.assertEquals(0.0, a.getFixedDimension(), 0.0001);
    }

    @Test
    public void setVisible_givenSameValue_shouldNotNotifyListeners() {
        this.axis.setVisible(true);
        Assert.assertEquals(0, this.listener.getEventCount());
    }

    @Test
    public void setVisible_givenDifferentValue_shouldUpdateAndNotifyListeners() {
        this.axis.setVisible(false);
        Assert.assertFalse(this.axis.isVisible());
        Assert.assertEquals(1, this.listener.getEventCount());
        Assert.assertSame(this.axis, this.listener.getLastEvent().getAxis());
    }

    @Test
    public void setLabel_givenSameString_shouldNotNotifyListeners() {
        this.axis.setLabel("Test Axis");
        Assert.assertEquals(0, this.listener.getEventCount());
    }

    @Test
    public void setLabel_givenDifferentString_shouldUpdateAndNotifyListeners() {
        this.axis.setLabel("Updated Axis");
        Assert.assertEquals("Updated Axis", this.axis.getLabel());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test
    public void setLabel_givenExistingNonNullAndNewNull_shouldUpdateAndNotifyListeners() {
        this.axis.setLabel(null);
        Assert.assertNull(this.axis.getLabel());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test
    public void setLabel_givenExistingNullAndNewNull_shouldNotNotifyListeners() {
        this.axis.setLabel(null);
        this.listener.reset();

        this.axis.setLabel(null);
        Assert.assertNull(this.axis.getLabel());
        Assert.assertEquals(0, this.listener.getEventCount());
    }

    @Test
    public void setLabel_givenExistingNullAndNewNonNull_shouldUpdateAndNotifyListeners() {
        this.axis.setLabel(null);
        this.listener.reset();

        this.axis.setLabel("Restored Label");
        Assert.assertEquals("Restored Label", this.axis.getLabel());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setLabelFont_givenNull_shouldThrowException() {
        this.axis.setLabelFont(null);
    }

    @Test
    public void setLabelFont_givenSameFont_shouldNotNotifyListeners() {
        this.axis.setLabelFont(Axis.DEFAULT_AXIS_LABEL_FONT);
        Assert.assertEquals(0, this.listener.getEventCount());
    }

    @Test
    public void setLabelFont_givenNewFont_shouldUpdateAndNotifyListeners() {
        Font font = new Font("Dialog", Font.BOLD, 14);
        this.axis.setLabelFont(font);
        Assert.assertEquals(font, this.axis.getLabelFont());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setLabelPaint_givenNull_shouldThrowException() {
        this.axis.setLabelPaint(null);
    }

    @Test
    public void setLabelPaint_givenValidPaint_shouldUpdateAndNotifyListeners() {
        this.axis.setLabelPaint(Color.red);
        Assert.assertEquals(Color.red, this.axis.getLabelPaint());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setLabelInsets_givenNull_shouldThrowException() {
        this.axis.setLabelInsets(null);
    }

    @Test
    public void setLabelInsets_givenSameInsets_shouldNotNotifyListeners() {
        this.axis.setLabelInsets(Axis.DEFAULT_AXIS_LABEL_INSETS);
        Assert.assertEquals(0, this.listener.getEventCount());
    }

    @Test
    public void setLabelInsets_givenDifferentInsets_shouldUpdateAndNotifyListeners() {
        RectangleInsets insets = new RectangleInsets(5.0, 5.0, 5.0, 5.0);
        this.axis.setLabelInsets(insets);
        Assert.assertEquals(insets, this.axis.getLabelInsets());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test
    public void setLabelAngle_givenAngle_shouldUpdateAndNotifyListeners() {
        this.axis.setLabelAngle(Math.PI / 4.0);
        Assert.assertEquals(Math.PI / 4.0, this.axis.getLabelAngle(), 0.0001);
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test
    public void setLabelToolTip_givenText_shouldUpdateAndNotifyListeners() {
        this.axis.setLabelToolTip("Tooltip text");
        Assert.assertEquals("Tooltip text", this.axis.getLabelToolTip());
        Assert.assertEquals(1, this.listener.getEventCount());

        this.axis.setLabelToolTip(null);
        Assert.assertNull(this.axis.getLabelToolTip());
        Assert.assertEquals(2, this.listener.getEventCount());
    }

    @Test
    public void setLabelURL_givenUrl_shouldUpdateAndNotifyListeners() {
        this.axis.setLabelURL("http://example.com");
        Assert.assertEquals("http://example.com", this.axis.getLabelURL());
        Assert.assertEquals(1, this.listener.getEventCount());

        this.axis.setLabelURL(null);
        Assert.assertNull(this.axis.getLabelURL());
        Assert.assertEquals(2, this.listener.getEventCount());
    }

    @Test
    public void setAxisLineVisible_givenFlag_shouldUpdateAndNotifyListeners() {
        this.axis.setAxisLineVisible(false);
        Assert.assertFalse(this.axis.isAxisLineVisible());
        Assert.assertEquals(1, this.listener.getEventCount());

        this.axis.setAxisLineVisible(true);
        Assert.assertTrue(this.axis.isAxisLineVisible());
        Assert.assertEquals(2, this.listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setAxisLinePaint_givenNull_shouldThrowException() {
        this.axis.setAxisLinePaint(null);
    }

    @Test
    public void setAxisLinePaint_givenValidPaint_shouldUpdateAndNotifyListeners() {
        this.axis.setAxisLinePaint(Color.blue);
        Assert.assertEquals(Color.blue, this.axis.getAxisLinePaint());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setAxisLineStroke_givenNull_shouldThrowException() {
        this.axis.setAxisLineStroke(null);
    }

    @Test
    public void setAxisLineStroke_givenValidStroke_shouldUpdateAndNotifyListeners() {
        Stroke stroke = new BasicStroke(2.5f);
        this.axis.setAxisLineStroke(stroke);
        Assert.assertEquals(stroke, this.axis.getAxisLineStroke());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test
    public void setTickLabelsVisible_givenSameFlag_shouldNotNotifyListeners() {
        this.axis.setTickLabelsVisible(true);
        Assert.assertEquals(0, this.listener.getEventCount());
    }

    @Test
    public void setTickLabelsVisible_givenDifferentFlag_shouldUpdateAndNotifyListeners() {
        this.axis.setTickLabelsVisible(false);
        Assert.assertFalse(this.axis.isTickLabelsVisible());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTickLabelFont_givenNull_shouldThrowException() {
        this.axis.setTickLabelFont(null);
    }

    @Test
    public void setTickLabelFont_givenSameFont_shouldNotNotifyListeners() {
        this.axis.setTickLabelFont(Axis.DEFAULT_TICK_LABEL_FONT);
        Assert.assertEquals(0, this.listener.getEventCount());
    }

    @Test
    public void setTickLabelFont_givenDifferentFont_shouldUpdateAndNotifyListeners() {
        Font font = new Font("Serif", Font.PLAIN, 11);
        this.axis.setTickLabelFont(font);
        Assert.assertEquals(font, this.axis.getTickLabelFont());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTickLabelPaint_givenNull_shouldThrowException() {
        this.axis.setTickLabelPaint(null);
    }

    @Test
    public void setTickLabelPaint_givenValidPaint_shouldUpdateAndNotifyListeners() {
        this.axis.setTickLabelPaint(Color.magenta);
        Assert.assertEquals(Color.magenta, this.axis.getTickLabelPaint());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTickLabelInsets_givenNull_shouldThrowException() {
        this.axis.setTickLabelInsets(null);
    }

    @Test
    public void setTickLabelInsets_givenSameInsets_shouldNotNotifyListeners() {
        this.axis.setTickLabelInsets(Axis.DEFAULT_TICK_LABEL_INSETS);
        Assert.assertEquals(0, this.listener.getEventCount());
    }

    @Test
    public void setTickLabelInsets_givenDifferentInsets_shouldUpdateAndNotifyListeners() {
        RectangleInsets insets = new RectangleInsets(1.0, 1.0, 1.0, 1.0);
        this.axis.setTickLabelInsets(insets);
        Assert.assertEquals(insets, this.axis.getTickLabelInsets());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test
    public void setTickMarksVisible_givenSameFlag_shouldNotNotifyListeners() {
        this.axis.setTickMarksVisible(true);
        Assert.assertEquals(0, this.listener.getEventCount());
    }

    @Test
    public void setTickMarksVisible_givenDifferentFlag_shouldUpdateAndNotifyListeners() {
        this.axis.setTickMarksVisible(false);
        Assert.assertFalse(this.axis.isTickMarksVisible());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test
    public void setTickMarkInsideLength_givenLength_shouldUpdateAndNotifyListeners() {
        this.axis.setTickMarkInsideLength(1.5f);
        Assert.assertEquals(1.5f, this.axis.getTickMarkInsideLength(), 0.0001f);
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test
    public void setTickMarkOutsideLength_givenLength_shouldUpdateAndNotifyListeners() {
        this.axis.setTickMarkOutsideLength(4.0f);
        Assert.assertEquals(4.0f, this.axis.getTickMarkOutsideLength(), 0.0001f);
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTickMarkStroke_givenNull_shouldThrowException() {
        this.axis.setTickMarkStroke(null);
    }

    @Test
    public void setTickMarkStroke_givenSameStroke_shouldNotNotifyListeners() {
        this.axis.setTickMarkStroke(Axis.DEFAULT_TICK_MARK_STROKE);
        Assert.assertEquals(0, this.listener.getEventCount());
    }

    @Test
    public void setTickMarkStroke_givenDifferentStroke_shouldUpdateAndNotifyListeners() {
        Stroke stroke = new BasicStroke(3.0f);
        this.axis.setTickMarkStroke(stroke);
        Assert.assertEquals(stroke, this.axis.getTickMarkStroke());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTickMarkPaint_givenNull_shouldThrowException() {
        this.axis.setTickMarkPaint(null);
    }

    @Test
    public void setTickMarkPaint_givenValidPaint_shouldUpdateAndNotifyListeners() {
        this.axis.setTickMarkPaint(Color.orange);
        Assert.assertEquals(Color.orange, this.axis.getTickMarkPaint());
        Assert.assertEquals(1, this.listener.getEventCount());
    }

    @Test
    public void setPlot_givenPlot_shouldSetPlotAndCallConfigure() {
        Assert.assertFalse(this.axis.isConfigureCalled());
        this.axis.setPlot(null);
        Assert.assertNull(this.axis.getPlot());
        Assert.assertTrue(this.axis.isConfigureCalled());
    }

    @Test
    public void setFixedDimension_givenDimension_shouldUpdateValue() {
        this.axis.setFixedDimension(42.5);
        Assert.assertEquals(42.5, this.axis.getFixedDimension(), 0.0001);
    }

    @Test
    public void listenerManagement_givenListener_shouldAddRemoveAndCheckCorrectly() {
        TestListener listenerTwo = new TestListener();
        Assert.assertTrue(this.axis.hasListener(this.listener));
        Assert.assertFalse(this.axis.hasListener(listenerTwo));

        this.axis.addChangeListener(listenerTwo);
        Assert.assertTrue(this.axis.hasListener(listenerTwo));

        this.axis.setVisible(false);
        Assert.assertEquals(1, this.listener.getEventCount());
        Assert.assertEquals(1, listenerTwo.getEventCount());

        this.axis.removeChangeListener(listenerTwo);
        Assert.assertFalse(this.axis.hasListener(listenerTwo));

        this.axis.setVisible(true);
        Assert.assertEquals(2, this.listener.getEventCount());
        Assert.assertEquals(1, listenerTwo.getEventCount());
    }

    @Test
    public void getLabelEnclosure_givenNullOrEmptyLabel_shouldReturnEmptyBounds() {
        this.axis.setLabel(null);
        Rectangle2D boundsNull = this.axis.testGetLabelEnclosure(this.g2, RectangleEdge.TOP);
        Assert.assertEquals(0.0, boundsNull.getWidth(), 0.0001);
        Assert.assertEquals(0.0, boundsNull.getHeight(), 0.0001);

        this.axis.setLabel("");
        Rectangle2D boundsEmpty = this.axis.testGetLabelEnclosure(this.g2, RectangleEdge.BOTTOM);
        Assert.assertEquals(0.0, boundsEmpty.getWidth(), 0.0001);
        Assert.assertEquals(0.0, boundsEmpty.getHeight(), 0.0001);
    }

    @Test
    public void getLabelEnclosure_givenHorizontalAndVerticalEdges_shouldReturnNonEmptyBounds() {
        this.axis.setLabel("Test Axis Label");

        Rectangle2D boundsTop = this.axis.testGetLabelEnclosure(this.g2, RectangleEdge.TOP);
        Assert.assertTrue(boundsTop.getWidth() > 0.0);
        Assert.assertTrue(boundsTop.getHeight() > 0.0);

        Rectangle2D boundsLeft = this.axis.testGetLabelEnclosure(this.g2, RectangleEdge.LEFT);
        Assert.assertTrue(boundsLeft.getWidth() > 0.0);
        Assert.assertTrue(boundsLeft.getHeight() > 0.0);

        Rectangle2D boundsRight = this.axis.testGetLabelEnclosure(this.g2, RectangleEdge.RIGHT);
        Assert.assertTrue(boundsRight.getWidth() > 0.0);
        Assert.assertTrue(boundsRight.getHeight() > 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void drawLabel_givenNullState_shouldThrowException() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        this.axis.testDrawLabel("Label", this.g2, area, area, RectangleEdge.TOP, null, null);
    }

    @Test
    public void drawLabel_givenNullOrEmptyLabel_shouldReturnUnmodifiedState() {
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        AxisState state1 = new AxisState(50.0);
        AxisState result1 = this.axis.testDrawLabel(null, this.g2, area, area, RectangleEdge.TOP, state1, null);
        Assert.assertSame(state1, result1);
        Assert.assertEquals(50.0, result1.getCursor(), 0.0001);

        AxisState state2 = new AxisState(50.0);
        AxisState result2 = this.axis.testDrawLabel("", this.g2, area, area, RectangleEdge.TOP, state2, null);
        Assert.assertSame(state2, result2);
        Assert.assertEquals(50.0, result2.getCursor(), 0.0001);
    }

    @Test
    public void drawLabel_givenAllEdgesAndPlotStateWithEntities_shouldDrawAndAddEntity() {
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D dataArea = new Rectangle2D.Double(20, 20, 160, 160);
        this.axis.setLabelToolTip("Axis ToolTip");
        this.axis.setLabelURL("http://axis.org");

        ChartRenderingInfo info = new ChartRenderingInfo();
        PlotRenderingInfo plotState = new PlotRenderingInfo(info);

        AxisState stateTop = new AxisState(20.0);
        AxisState resultTop = this.axis.testDrawLabel("Top Label", this.g2, plotArea, dataArea,
                RectangleEdge.TOP, stateTop, plotState);
        Assert.assertTrue(resultTop.getCursor() < 20.0);

        AxisState stateBottom = new AxisState(180.0);
        AxisState resultBottom = this.axis.testDrawLabel("Bottom Label", this.g2, plotArea, dataArea,
                RectangleEdge.BOTTOM, stateBottom, plotState);
        Assert.assertTrue(resultBottom.getCursor() > 180.0);

        AxisState stateLeft = new AxisState(20.0);
        AxisState resultLeft = this.axis.testDrawLabel("Left Label", this.g2, plotArea, dataArea,
                RectangleEdge.LEFT, stateLeft, plotState);
        Assert.assertTrue(resultLeft.getCursor() < 20.0);

        AxisState stateRight = new AxisState(180.0);
        AxisState resultRight = this.axis.testDrawLabel("Right Label", this.g2, plotArea, dataArea,
                RectangleEdge.RIGHT, stateRight, plotState);
        Assert.assertTrue(resultRight.getCursor() > 180.0);

        EntityCollection entities = info.getEntityCollection();
        Assert.assertNotNull(entities);
        Assert.assertEquals(4, entities.getEntityCount());
    }

    @Test
    public void drawLabel_givenNullPlotStateOrNullEntities_shouldExecuteWithoutEntityAddition() {
        Rectangle2D plotArea = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D dataArea = new Rectangle2D.Double(20, 20, 160, 160);

        AxisState state1 = new AxisState(20.0);
        AxisState result1 = this.axis.testDrawLabel("Label 1", this.g2, plotArea, dataArea,
                RectangleEdge.TOP, state1, null);
        Assert.assertTrue(result1.getCursor() < 20.0);

        ChartRenderingInfo info = new ChartRenderingInfo();
        info.setEntityCollection(null);
        PlotRenderingInfo plotState = new PlotRenderingInfo(info);

        AxisState state2 = new AxisState(180.0);
        AxisState result2 = this.axis.testDrawLabel("Label 2", this.g2, plotArea, dataArea,
                RectangleEdge.BOTTOM, state2, plotState);
        Assert.assertTrue(result2.getCursor() > 180.0);
    }

    @Test
    public void drawAxisLine_givenAllEdges_shouldExecuteWithoutException() {
        Rectangle2D dataArea = new Rectangle2D.Double(20.0, 30.0, 100.0, 120.0);

        this.axis.testDrawAxisLine(this.g2, 30.0, dataArea, RectangleEdge.TOP);
        this.axis.testDrawAxisLine(this.g2, 150.0, dataArea, RectangleEdge.BOTTOM);
        this.axis.testDrawAxisLine(this.g2, 20.0, dataArea, RectangleEdge.LEFT);
        this.axis.testDrawAxisLine(this.g2, 120.0, dataArea, RectangleEdge.RIGHT);
    }

    @Test
    public void clone_shouldCreateIndependentCopy() throws Exception {
        this.axis.setLabelToolTip("Tip");
        this.axis.setLabelURL("URL");
        this.axis.setPlot(null);

        TestAxis clone = (TestAxis) this.axis.clone();

        Assert.assertNotSame(this.axis, clone);
        Assert.assertEquals(this.axis, clone);
        Assert.assertNull(clone.getPlot());
        Assert.assertFalse(clone.hasListener(this.listener));

        TestListener cloneListener = new TestListener();
        clone.addChangeListener(cloneListener);
        clone.setVisible(false);

        Assert.assertEquals(0, this.listener.getEventCount());
        Assert.assertEquals(1, cloneListener.getEventCount());
    }

    @Test
    public void equals_givenVariousScenarios_shouldCheckAllFields() {
        TestAxis a1 = new TestAxis("Axis");
        TestAxis a2 = new TestAxis("Axis");

        Assert.assertTrue(a1.equals(a1));
        Assert.assertFalse(a1.equals(null));
        Assert.assertFalse(a1.equals("Not an Axis"));
        Assert.assertTrue(a1.equals(a2));

        a2.setVisible(false);
        Assert.assertFalse(a1.equals(a2));
        a2.setVisible(true);
        Assert.assertTrue(a1.equals(a2));

        a1.setLabel(null);
        Assert.assertFalse(a1.equals(a2));
        a2.setLabel(null);
        Assert.assertTrue(a1.equals(a2));
        a1.setLabel("Axis A");
        a2.setLabel("Axis B");
        Assert.assertFalse(a1.equals(a2));
        a2.setLabel("Axis A");
        Assert.assertTrue(a1.equals(a2));

        a2.setLabelFont(new Font("Dialog", Font.BOLD, 15));
        Assert.assertFalse(a1.equals(a2));
        a2.setLabelFont(a1.getLabelFont());
        Assert.assertTrue(a1.equals(a2));

        a2.setLabelPaint(Color.red);
        Assert.assertFalse(a1.equals(a2));
        a2.setLabelPaint(a1.getLabelPaint());
        Assert.assertTrue(a1.equals(a2));

        a2.setLabelInsets(new RectangleInsets(10.0, 10.0, 10.0, 10.0));
        Assert.assertFalse(a1.equals(a2));
        a2.setLabelInsets(a1.getLabelInsets());
        Assert.assertTrue(a1.equals(a2));

        a2.setLabelAngle(0.45);
        Assert.assertFalse(a1.equals(a2));
        a2.setLabelAngle(0.0);
        Assert.assertTrue(a1.equals(a2));

        a1.setLabelToolTip("Tip");
        Assert.assertFalse(a1.equals(a2));
        a2.setLabelToolTip("Tip");
        Assert.assertTrue(a1.equals(a2));

        a1.setLabelURL("URL");
        Assert.assertFalse(a1.equals(a2));
        a2.setLabelURL("URL");
        Assert.assertTrue(a1.equals(a2));

        a2.setAxisLineVisible(false);
        Assert.assertFalse(a1.equals(a2));
        a2.setAxisLineVisible(true);
        Assert.assertTrue(a1.equals(a2));

        a2.setAxisLineStroke(new BasicStroke(4.0f));
        Assert.assertFalse(a1.equals(a2));
        a2.setAxisLineStroke(a1.getAxisLineStroke());
        Assert.assertTrue(a1.equals(a2));

        a2.setAxisLinePaint(Color.cyan);
        Assert.assertFalse(a1.equals(a2));
        a2.setAxisLinePaint(a1.getAxisLinePaint());
        Assert.assertTrue(a1.equals(a2));

        a2.setTickLabelsVisible(false);
        Assert.assertFalse(a1.equals(a2));
        a2.setTickLabelsVisible(true);
        Assert.assertTrue(a1.equals(a2));

        a2.setTickLabelFont(new Font("Monospaced", Font.PLAIN, 8));
        Assert.assertFalse(a1.equals(a2));
        a2.setTickLabelFont(a1.getTickLabelFont());
        Assert.assertTrue(a1.equals(a2));

        a2.setTickLabelPaint(Color.green);
        Assert.assertFalse(a1.equals(a2));
        a2.setTickLabelPaint(a1.getTickLabelPaint());
        Assert.assertTrue(a1.equals(a2));

        a2.setTickLabelInsets(new RectangleInsets(3.0, 3.0, 3.0, 3.0));
        Assert.assertFalse(a1.equals(a2));
        a2.setTickLabelInsets(a1.getTickLabelInsets());
        Assert.assertTrue(a1.equals(a2));

        a2.setTickMarksVisible(false);
        Assert.assertFalse(a1.equals(a2));
        a2.setTickMarksVisible(true);
        Assert.assertTrue(a1.equals(a2));

        a2.setTickMarkInsideLength(3.0f);
        Assert.assertFalse(a1.equals(a2));
        a2.setTickMarkInsideLength(0.0f);
        Assert.assertTrue(a1.equals(a2));

        a2.setTickMarkOutsideLength(5.0f);
        Assert.assertFalse(a1.equals(a2));
        a2.setTickMarkOutsideLength(2.0f);
        Assert.assertTrue(a1.equals(a2));

        a2.setTickMarkPaint(Color.pink);
        Assert.assertFalse(a1.equals(a2));
        a2.setTickMarkPaint(a1.getTickMarkPaint());
        Assert.assertTrue(a1.equals(a2));

        a2.setTickMarkStroke(new BasicStroke(5.0f));
        Assert.assertFalse(a1.equals(a2));
        a2.setTickMarkStroke(a1.getTickMarkStroke());
        Assert.assertTrue(a1.equals(a2));

        a2.setFixedDimension(100.0);
        Assert.assertFalse(a1.equals(a2));
        a2.setFixedDimension(0.0);
        Assert.assertTrue(a1.equals(a2));
    }

    @Test
    public void serialization_shouldPreserveStateAndResetTransientFields() throws Exception {
        this.axis.setLabel("Serialized Axis");
        this.axis.setLabelToolTip("Tooltip");
        this.axis.setLabelURL("http://serialized.org");
        this.axis.setLabelPaint(Color.blue);
        this.axis.setTickLabelPaint(Color.red);
        this.axis.setAxisLinePaint(Color.yellow);
        this.axis.setTickMarkPaint(Color.green);
        this.axis.setAxisLineStroke(new BasicStroke(2.0f));
        this.axis.setTickMarkStroke(new BasicStroke(3.0f));
        this.axis.setFixedDimension(75.0);

        Axis deserialized = serializeAndDeserialize(this.axis);

        Assert.assertEquals(this.axis, deserialized);
        Assert.assertNull(deserialized.getPlot());
        Assert.assertFalse(deserialized.hasListener(this.listener));

        TestListener newListener = new TestListener();
        deserialized.addChangeListener(newListener);
        deserialized.setVisible(false);
        Assert.assertEquals(1, newListener.getEventCount());
    }
}