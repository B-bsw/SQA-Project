package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;

public class DefaultKeyedValues2DTest {

    @Test
    public void addAndRetrieve2DValues() {
        DefaultKeyedValues2D kv2D = new DefaultKeyedValues2D();
        kv2D.addValue(Double.valueOf(100.0), "R1", "C1");
        assertEquals(1, kv2D.getRowCount());
        assertEquals(1, kv2D.getColumnCount());
        assertEquals(Double.valueOf(100.0), kv2D.getValue("R1", "C1"));
    }
}
