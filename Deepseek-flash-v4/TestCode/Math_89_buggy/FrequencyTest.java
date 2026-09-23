package org.apache.commons.math.stat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FrequencyTest {

    @Test
    public void testCountsAndSum() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2L);
        f.addValue(Integer.valueOf(3));
        f.addValue((Object) Integer.valueOf(4));
        f.addValue(2);
        assertEquals(1L, f.getCount(1));
        assertEquals(2L, f.getCount(2));
        assertEquals(1L, f.getCount(3));
        assertEquals(1L, f.getCount(4));
        assertEquals(1L, f.getCount(Integer.valueOf(4)));
        assertEquals(5L, f.getSumFreq());
    }

    @Test
    public void testCharCounts() {
        Frequency f = new Frequency();
        f.addValue('a');
        f.addValue('b');
        f.addValue('a');
        assertEquals(2L, f.getCount('a'));
        assertEquals(1L, f.getCount('b'));
        assertEquals(3L, f.getSumFreq());
    }

    @Test
    public void testPctAndCumPct() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(1);
        f.addValue(2);
        assertEquals(2.0 / 3.0, f.getPct(1), 1e-12);
        assertEquals(1.0 / 3.0, f.getPct(2), 1e-12);
        assertEquals(0.0, f.getPct(3), 1e-12);
        assertEquals(2.0 / 3.0, f.getCumPct(1), 1e-12);
        assertEquals(1.0, f.getCumPct(2), 1e-12);
        assertEquals(0.0, f.getCumPct(0), 1e-12);
    }

    @Test
    public void testEmptyFrequency() {
        Frequency f = new Frequency();
        assertEquals(0L, f.getSumFreq());
        assertEquals(0L, f.getCount(1));
        assertTrue(Double.isNaN(f.getPct(1)));
        assertEquals(0L, f.getCumFreq(1));
        assertTrue(Double.isNaN(f.getCumPct(1)));
    }

    @Test
    public void testCumFreqBoundaries() {
        Frequency f = new Frequency();
        f.addValue(5);
        f.addValue(10);
        f.addValue(10);
        f.addValue(20);
        assertEquals(0L, f.getCumFreq(4));
        assertEquals(1L, f.getCumFreq(5));
        assertEquals(3L, f.getCumFreq(10));
        assertEquals(3L, f.getCumFreq(19));
        assertEquals(4L, f.getCumFreq(20));
        assertEquals(4L, f.getCumFreq(21));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddIncompatibleTypesThrows() {
        Frequency f = new Frequency();
        f.addValue("a");
        f.addValue(1);
    }

    @Test
    public void testCustomComparator() {
        java.util.Comparator cmp = new java.util.Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) o2).compareTo(o1);
            }
        };
        Frequency f = new Frequency(cmp);
        f.addValue(1);
        f.addValue(2);
        f.addValue(2);
        assertEquals(2L, f.getCount(2));
        assertEquals(3L, f.getSumFreq());
        assertEquals(2L, f.getCumFreq(2));
        assertEquals(3L, f.getCumFreq(1));
    }

    @Test
    public void testClear() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(1);
        f.clear();
        assertEquals(0L, f.getSumFreq());
        assertEquals(0L, f.getCount(1));
    }

    @Test
    public void testToString() {
        Frequency f = new Frequency();
        f.addValue(1);
        f.addValue(2);
        String s = f.toString();
        assertTrue(s.contains("Value"));
        assertTrue(s.contains("1"));
        assertTrue(s.contains("2"));
        assertTrue(s.contains("50%"));
    }
}