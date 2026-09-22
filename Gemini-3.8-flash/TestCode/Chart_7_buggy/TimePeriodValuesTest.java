package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;

public class TimePeriodValuesTest {

    @Test
    public void addAndGetItemCount_shouldWork() {
        TimePeriodValues s = new TimePeriodValues("Test");
        s.add(new SimpleTimePeriod(100L, 200L), 50.0);
        assertEquals(1, s.getItemCount());
        assertEquals(Double.valueOf(50.0), s.getValue(0));
    }
}
