package org.jfree.chart.renderer.category;

import org.junit.Before;
import org.junit.Test;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import javax.swing.Icon;
import static org.junit.Assert.*;

public class MinMaxCategoryRendererTest {

    private MinMaxCategoryRenderer renderer;

    @Before
    public void setUp() {
        renderer = new MinMaxCategoryRenderer();
    }

    @Test
    public void testDefaultConstructor() {
        assertTrue(renderer.isDrawLines() == false);
        assertEquals(Color.black, renderer.getGroupPaint());
        assertNotNull(renderer.getGroupStroke());
        assertNotNull(renderer.getObjectIcon());
        assertNotNull(renderer.getMaxIcon());
        assertNotNull(renderer.getMinIcon());
    }

    @Test
    public void testIsDrawLinesInitialValue() {
        assertFalse(renderer.isDrawLines());
    }

    @Test
    public void testSetDrawLinesTrue() {
        renderer.setDrawLines(true);
        assertTrue(renderer.isDrawLines());
    }

    @Test
    public void testSetDrawLinesFalse() {
        renderer.setDrawLines(true);
        renderer.setDrawLines(false);
        assertFalse(renderer.isDrawLines());
    }

    @Test
    public void testSetDrawLinesSameValueNoChange() {
        renderer.setDrawLines(false);
        assertFalse(renderer.isDrawLines());
    }

    @Test
    public void testGetGroupPaintDefault() {
        assertEquals(Color.black, renderer.getGroupPaint());
    }

    @Test
    public void testSetGroupPaint() {
        Paint paint = Color.red;
        renderer.setGroupPaint(paint);
        assertSame(paint, renderer.getGroupPaint());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupPaintNull() {
        renderer.setGroupPaint(null);
    }

    @Test
    public void testGetGroupStrokeDefault() {
        assertNotNull(renderer.getGroupStroke());
        assertEquals(new BasicStroke(1.0f), renderer.getGroupStroke());
    }

    @Test
    public void testSetGroupStroke() {
        Stroke stroke = new BasicStroke(2.0f);
        renderer.setGroupStroke(stroke);
        assertSame(stroke, renderer.getGroupStroke());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGroupStrokeNull() {
        renderer.setGroupStroke(null);
    }

    @Test
    public void testGetObjectIconNotNull() {
        assertNotNull(renderer.getObjectIcon());
    }

    @Test
    public void testSetObjectIcon() {
        Icon icon = new Icon() {
            public void paintIcon(Component c, Graphics g, int x, int y) {}
            public int getIconWidth() { return 10; }
            public int getIconHeight() { return 10; }
        };
        renderer.setObjectIcon(icon);
        assertSame(icon, renderer.getObjectIcon());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetObjectIconNull() {
        renderer.setObjectIcon(null);
    }

    @Test
    public void testGetMaxIconNotNull() {
        assertNotNull(renderer.getMaxIcon());
    }

    @Test
    public void testSetMaxIcon() {
        Icon icon = new Icon() {
            public void paintIcon(Component c, Graphics g, int x, int y) {}
            public int getIconWidth() { return 10; }
            public int getIconHeight() { return 10; }
        };
        renderer.setMaxIcon(icon);
        assertSame(icon, renderer.getMaxIcon());
    }

    @Test
    public void testSetMaxIconNull() {
        renderer.setMaxIcon(null);
        assertNull(renderer.getMaxIcon());
    }

    @Test
    public void testGetMinIconNotNull() {
        assertNotNull(renderer.getMinIcon());
    }

    @Test
    public void testSetMinIcon() {
        Icon icon = new Icon() {
            public void paintIcon(Component c, Graphics g, int x, int y) {}
            public int getIconWidth() { return 10; }
            public int getIconHeight() { return 10; }
        };
        renderer.setMinIcon(icon);
        assertSame(icon, renderer.getMinIcon());
    }

    @Test
    public void testSetMinIconNull() {
        renderer.setMinIcon(null);
        assertNull(renderer.getMinIcon());
    }

    @Test
    public void testSetGroupPaintAndNotify() {
        final boolean[] notified = new boolean[1];
        renderer.addChangeListener(event -> notified[0] = true);
        renderer.setGroupPaint(Color.blue);
        assertTrue(notified[0]);
    }

    @Test
    public void testSetGroupStrokeAndNotify() {
        final boolean[] notified = new boolean[1];
        renderer.addChangeListener(event -> notified[0] = true);
        renderer.setGroupStroke(new BasicStroke(2.0f));
        assertTrue(notified[0]);
    }

    @Test
    public void testSetDrawLinesAndNotify() {
        final boolean[] notified = new boolean[1];
        renderer.addChangeListener(event -> notified[0] = true);
        renderer.setDrawLines(true);
        assertTrue(notified[0]);
    }

    @Test
    public void testEqualsSameInstance() {
        assertEquals(renderer, renderer);
    }

    @Test
    public void testEqualsNull() {
        assertFalse(renderer.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(renderer.equals(new Object()));
    }

    @Test
    public void testEqualsDifferentDrawLines() {
        MinMaxCategoryRenderer other = new MinMaxCategoryRenderer();
        renderer.setDrawLines(true);
        other.setDrawLines(false);
        assertFalse(renderer.equals(other));
    }

    @Test
    public void testEqualsDifferentGroupPaint() {
        MinMaxCategoryRenderer other = new MinMaxCategoryRenderer();
        renderer.setGroupPaint(Color.red);
        other.setGroupPaint(Color.blue);
        assertFalse(renderer.equals(other));
    }

    @Test
    public void testEqualsDifferentGroupStroke() {
        MinMaxCategoryRenderer other = new MinMaxCategoryRenderer();
        renderer.setGroupStroke(new BasicStroke(2.0f));
        other.setGroupStroke(new BasicStroke(3.0f));
        assertFalse(renderer.equals(other));
    }

    @Test
    public void testEqualsDifferentObjectIcon() {
        MinMaxCategoryRenderer other = new MinMaxCategoryRenderer();
        Icon icon = new Icon() {
            public void paintIcon(Component c, Graphics g, int x, int y) {}
            public int getIconWidth() { return 5; }
            public int getIconHeight() { return 5; }
        };
        renderer.setObjectIcon(icon);
        other.setObjectIcon(null);
        assertFalse(renderer.equals(other));
    }

    @Test
    public void testEqualsDifferentMaxIcon() {
        MinMaxCategoryRenderer other = new MinMaxCategoryRenderer();
        Icon icon = new Icon() {
            public void paintIcon(Component c, Graphics g, int x, int y) {}
            public int getIconWidth() { return 5; }
            public int getIconHeight() { return 5; }
        };
        renderer.setMaxIcon(icon);
        other.setMaxIcon(null);
        assertFalse(renderer.equals(other));
    }

    @Test
    public void testEqualsDifferentMinIcon() {
        MinMaxCategoryRenderer other = new MinMaxCategoryRenderer();
        Icon icon = new Icon() {
            public void paintIcon(Component c, Graphics g, int x, int y) {}
            public int getIconWidth() { return 5; }
            public int getIconHeight() { return 5; }
        };
        renderer.setMinIcon(icon);
        other.setMinIcon(null);
        assertFalse(renderer.equals(other));
    }

    @Test
    public void testEqualsSameValues() {
        MinMaxCategoryRenderer other = new MinMaxCategoryRenderer();
        assertTrue(renderer.equals(other));
    }
}