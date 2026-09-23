package org.apache.commons.math.util;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;

public class MultidimensionalCounterTest {
    private static final double DELTA = 1e-15;
    private MultidimensionalCounter counter;
    private MultidimensionalCounter counter2D;

    @Before
    public void setUp() {
        counter = new MultidimensionalCounter(2, 3, 4);
        counter2D = new MultidimensionalCounter(3, 5);
    }

    @After
    public void tearDown() {
        counter = null;
        counter2D = null;
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("Dimension mismatch", 3, counter.getDimension());
        assertArrayEquals(new int[]{2, 3, 4}, counter.getSizes());
        assertEquals("Total size mismatch", 24, counter.getSize());
        
        assertArrayEquals("Size for 2D counter", new int[]{3, 5}, counter2D.getSizes());
        assertEquals("Total size for 2D counter", 15, counter2D.getSize());
        assertEquals("Dimension for 2D counter", 2, counter2D.getDimension());
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorZeroSize() {
        new MultidimensionalCounter(2, 0, 3);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorNegativeSize() {
        new MultidimensionalCounter(2, -1, 3);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorAllZero() {
        new MultidimensionalCounter(0, 0);
    }

    @Test
    public void testGetCountsBasic() {
        assertArrayEquals("Index 0", new int[]{0, 0, 0}, counter.getCounts(0));
        assertArrayEquals("Index 1", new int[]{0, 0, 1}, counter.getCounts(1));
        assertArrayEquals("Index 2", new int[]{0, 0, 2}, counter.getCounts(2));
        assertArrayEquals("Index 3", new int[]{0, 0, 3}, counter.getCounts(3));
        assertArrayEquals("Index 12", new int[]{1, 0, 0}, counter.getCounts(12));
        assertArrayEquals("Index 23", new int[]{1, 2, 3}, counter.getCounts(23));
    }

    @Test
    public void testGetCountsBoundaryIndices() {
        assertArrayEquals("Index 0 for 2D", new int[]{0, 0}, counter2D.getCounts(0));
        assertArrayEquals("Index 14 for 2D", new int[]{2, 4}, counter2D.getCounts(14));
        
        assertArrayEquals("Max index", new int[]{1, 2, 3}, counter.getCounts(23));
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountsNegativeIndex() {
        counter.getCounts(-1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountsIndexTooLarge() {
        counter.getCounts(24);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountsIndexEqualToTotalSize() {
        counter.getCounts(counter.getSize());
    }

    @Test
    public void testGetCount() {
        assertEquals("Count for (0,0,0)", 0, counter.getCount(0, 0, 0));
        assertEquals("Count for (0,0,1)", 1, counter.getCount(0, 0, 1));
        assertEquals("Count for (1,0,0)", 12, counter.getCount(1, 0, 0));
        assertEquals("Count for (1,2,3)", 23, counter.getCount(1, 2, 3));
        
        assertEquals("Count for (0,0) 2D", 0, counter2D.getCount(0, 0));
        assertEquals("Count for (2,4) 2D", 14, counter2D.getCount(2, 4));
        assertEquals("Count for (3,5) 2D", 15, counter2D.getCount(3, 5));
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetCountWrongDimension() {
        counter.getCount(1, 2);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetCountTooManyDimensions() {
        counter2D.getCount(1, 2, 3);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountNegativeValue() {
        counter.getCount(-1, 0, 0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountValueEqualSize() {
        counter.getCount(2, 0, 0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetCountValueExceedsSize() {
        counter2D.getCount(3, 4);
    }

    @Test
    public void testGetCountsRoundTrip() {
        assertArrayEquals("Round trip 12", new int[]{1, 0, 0}, counter.getCounts(counter.getCount(1, 0, 0)));
        assertArrayEquals("Round trip 23", new int[]{1, 2, 3}, counter.getCounts(counter.getCount(1, 2, 3)));
        assertArrayEquals("Round trip 5", new int[]{0, 1, 1}, counter.getCounts(counter.getCount(0, 1, 1)));
    }

    @Test
    public void testIterator() {
        MultidimensionalCounter.Iterator iterator = counter.iterator();
        assertTrue("Has next", iterator.hasNext());
        assertEquals("First count", 0, iterator.next().intValue());
        assertEquals("First count via getCount", 0, iterator.getCount());
        assertArrayEquals("First counts", new int[]{0, 0, 0}, iterator.getCounts());
        
        for (int i = 1; i < counter.getSize(); i++) {
            assertTrue("Has next for i=" + i, iterator.hasNext());
            assertEquals("Next count " + i, i, iterator.next().intValue());
        }
        assertFalse("No more elements", iterator.hasNext());
    }

    @Test
    public void testIteratorFullIteration() {
        int count = 0;
        for (Integer i : counter) {
            assertEquals("Iteration index", count, i.intValue());
            count++;
        }
        assertEquals("Iteration count mismatch", counter.getSize(), count);
    }

    @Test
    public void testIteratorSingleElement() {
        MultidimensionalCounter single = new MultidimensionalCounter(1);
        MultidimensionalCounter.Iterator iterator = single.iterator();
        assertTrue("Has next for single", iterator.hasNext());
        assertEquals(0, iterator.next().intValue());
        assertFalse("No next after single", iterator.hasNext());
        assertEquals("Single total size", 1, single.getSize());
    }

    @Test
    public void testIteratorSingleDimensionMultipleValues() {
        MultidimensionalCounter multi = new MultidimensionalCounter(3);
        assertEquals("Single dimension size", 3, multi.getSize());
        MultidimensionalCounter.Iterator iterator = multi.iterator();
        assertEquals(0, iterator.next().intValue());
        assertEquals(1, iterator.next().intValue());
        assertEquals(2, iterator.next().intValue());
        assertFalse("No next after all", iterator.hasNext());
    }

    @Test
    public void testIteratorGetCounts() {
        MultidimensionalCounter.Iterator iterator = counter.iterator();
        assertArrayEquals("Initial counts", new int[]{0, 0, 0}, iterator.getCounts());
        iterator.next();
        iterator.next();
        iterator.next();
        assertArrayEquals("Counts after 3 steps", new int[]{0, 0, 3}, iterator.getCounts());
        iterator.next(); // Move to (0,1,0)
        assertArrayEquals("Counts after 4 steps", new int[]{0, 1, 0}, iterator.getCounts());
    }

    @Test
    public void testGetCountForDimension() {
        MultidimensionalCounter.Iterator iterator = counter.iterator();
        iterator.next(); // (0,0,0)
        iterator.next(); // (0,0,1)
        assertEquals(0, iterator.getCount(0));
        assertEquals(0, iterator.getCount(1));
        assertEquals(1, iterator.getCount(2));
        
        iterator.next(); // (0,0,2)
        assertEquals(0, iterator.getCount(0));
        assertEquals(0, iterator.getCount(1));
        assertEquals(2, iterator.getCount(2));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIteratorRemoveUnsupported() {
        MultidimensionalCounter.Iterator iterator = counter.iterator();
        iterator.remove();
    }

    @Test
    public void testToString() {
        assertEquals("toString for initial state", "[0][0][0]", counter.toString());
        
        MultidimensionalCounter.Iterator iterator = counter.iterator();
        iterator.next();
        iterator.next();
        iterator.next();
        assertEquals("toString after 3 iterations", "[0][0][3]", counter.toString());
        
        iterator.next(); // (0,1,0)
        assertEquals("toString after 4 iterations", "[0][1][0]", counter.toString());
    }

    @Test
    public void testIteratorWithWrapping() {
        MultidimensionalCounter.Iterator iterator = counter.iterator();
        // Move to near end of first dimension
        for (int i = 0; i < 23; i++) {
            iterator.next();
        }
        assertTrue("Has next at end", iterator.hasNext());
        assertEquals("Last element", 23, iterator.next().intValue());
        assertFalse("No more after last", iterator.hasNext());
    }

    @Test
    public void testGetCountsRoundTripMany() {
        for (int i = 0; i < counter.getSize(); i++) {
            int[] counts = counter.getCounts(i);
            assertEquals("Count at index " + i, i, counter.getCount(counts));
        }
    }

    @Test
    public void testGetCountsWithZeroDimension() {
        MultidimensionalCounter zero = new MultidimensionalCounter(0);
        assertEquals("Zero dimension total size", 0, zero.getSize());
        assertArrayEquals("Zero dimension sizes", new int[]{0}, zero.getSizes());
    }
}