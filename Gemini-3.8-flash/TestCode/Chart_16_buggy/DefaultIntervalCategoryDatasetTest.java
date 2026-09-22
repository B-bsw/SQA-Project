package org.jfree.data.category;

import org.junit.Test;
import static org.junit.Assert.*;

public class DefaultIntervalCategoryDatasetTest {

    @Test
    public void datasetCreationAndAccess() {
        Double[][] starts = new Double[][] { { Double.valueOf(1.0) } };
        Double[][] ends = new Double[][] { { Double.valueOf(2.0) } };
        DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(starts, ends);
        assertEquals(1, d.getRowCount());
        assertEquals(1, d.getColumnCount());
        assertEquals(Double.valueOf(1.0), d.getStartValue(0, 0));
        assertEquals(Double.valueOf(2.0), d.getEndValue(0, 0));
    }
}
