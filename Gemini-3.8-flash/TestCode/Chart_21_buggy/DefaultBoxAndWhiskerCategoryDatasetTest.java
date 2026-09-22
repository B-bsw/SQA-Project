package org.jfree.data.statistics;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class DefaultBoxAndWhiskerCategoryDatasetTest {

    @Test
    public void addAndRetrieveBoxAndWhisker() {
        DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset();
        List list = new ArrayList();
        list.add(Double.valueOf(10.0));
        list.add(Double.valueOf(20.0));
        dataset.add(list, "Row1", "Col1");
        assertEquals(1, dataset.getRowCount());
        assertEquals(1, dataset.getColumnCount());
        assertNotNull(dataset.getItem(0, 0));
    }
}
