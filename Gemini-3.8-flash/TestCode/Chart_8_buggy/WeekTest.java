package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;

public class WeekTest {

    @Test
    public void weekConstructorsAndAccessors() {
        Week w = new Week(1, 2026);
        assertEquals(1, w.getWeek());
        assertEquals(2026, w.getYearValue());
        assertNotNull(w.previous());
        assertNotNull(w.next());
    }
}
