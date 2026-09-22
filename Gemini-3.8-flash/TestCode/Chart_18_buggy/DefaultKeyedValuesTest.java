package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;

public class DefaultKeyedValuesTest {

    @Test
    public void addAndRetrieveValues() {
        DefaultKeyedValues kv = new DefaultKeyedValues();
        kv.addValue("A", 10.0);
        kv.addValue("B", 20.0);
        assertEquals(2, kv.getItemCount());
        assertEquals(Double.valueOf(10.0), kv.getValue("A"));
        assertEquals(Double.valueOf(20.0), kv.getValue(1));
    }
}
