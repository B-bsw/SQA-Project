package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;

public class KeyedObjects2DTest {

    @Test
    public void setAndGetObject() {
        KeyedObjects2D ko = new KeyedObjects2D();
        ko.setObject("Val", "R1", "C1");
        assertEquals(1, ko.getRowCount());
        assertEquals(1, ko.getColumnCount());
        assertEquals("Val", ko.getObject("R1", "C1"));
    }
}
