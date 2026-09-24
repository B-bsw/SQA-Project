package org.apache.commons.math.stat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FrequencyTest {

    private Frequency freq;

    @Before
    public void setUp() {
        freq = new Frequency();
    }

    @After
    public void tearDown() {
        freq = null;
    }

    @Test
    public void testEmptyFrequency() {
        assertEquals(0L, freq.getSumFreq());
        assertEquals(0L, freq.getCount("x"));
        assertEquals(0L, freq.getCumFreq("x"));
        assertTrue(Double.isNaN(freq.getPct("x")));
        assertTrue(Double.isNaN(freq.getCumPct("x")));
    }

    @Test
    public void testAddIntegralValuesAndEquivalence() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(2L);
        freq.addValue(Integer.valueOf(2));
        freq.addValue((Object) Integer.valueOf(3));
        freq.addValue(3L);

        assertEquals(6L, freq.getSumFreq());
        assertEquals(1L, freq.getCount(1));
        assertEquals(3L, freq.getCount(2));
        assertEquals(1L, freq.getCount(Integer.valueOf(1)));
        assertEquals(3L, freq.getCount(2L));
        assertEquals(2L, freq.getCount(3));
        assertEquals(1L, freq.getCount(Long.valueOf(1)));
        assertEquals(3L, freq.getCount((Object) Integer.valueOf(2)));
    }

    @Test
    public void testPctAndCumPct() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(2);

        assertEquals(3L, freq.getSumFreq());
        assertEquals(1.0 / 3.0, freq.getPct(1), 1e-12);
        assertEquals(2.0 / 3.0, freq.getPct(2), 1e-12);
        assertEquals(1.0 / 3.0, freq.getCumPct(1), 1e-12);
        assertEquals(1.0, freq.getCumPct(2), 1e-12);
        assertEquals(0.0, freq.getCumPct(0), 1e-12);
        assertEquals(0.0, freq.getPct(0), 1e-12);
        assertEquals(3L, freq.getCumFreq((Object) Integer.valueOf(2)));
    }

    @Test
    public void testCumFreqBoundaries() {
        freq.addValue(10);
        freq.addValue(20);
        freq.addValue(20);
        freq.addValue(30);

        assertEquals(0L, freq.getCumFreq(5));
        assertEquals(1L, freq.getCumFreq(10));
        assertEquals(2L, freq.getCumFreq(15));
        assertEquals(3L, freq.getCumFreq(20));
        assertEquals(4L, freq.getCumFreq(30));
        assertEquals(4L, freq.getCumFreq(50));
    }

    @Test
    public void testCharValues() {
        freq.addValue('a');
        freq.addValue('b');
        freq.addValue('b');

        assertEquals(3L, freq.getSumFreq());
        assertEquals(1L, freq.getCount('a'));
        assertEquals(2L, freq.getCount('b'));
        assertEquals(2.0 / 3.0, freq.getPct('b'), 1e-12);
        assertEquals(1L, freq.getCumFreq('a'));
        assertEquals(3L, freq.getCumFreq('b'));
        assertEquals(1.0, freq.getCumPct('b'), 1e-12);
    }

    @Test
    public void testValuesIteratorAndClear() {
        freq.addValue(3);
        freq.addValue(1);
        freq.addValue(2);

        Iterator it = freq.valuesIterator();
        List<Long> values = new ArrayList<Long>();
        while (it.hasNext()) {
            values.add((Long) it.next());
        }
        List<Long> expected = new ArrayList<Long>();
        expected.add(1L);
        expected.add(2L);
        expected.add(3L);
        assertEquals(expected, values);

        freq.clear();
        assertEquals(0L, freq.getSumFreq());
        assertEquals(0L, freq.getCount(1));
        assertTrue(Double.isNaN(freq.getPct(1)));
    }

    @Test
    public void testIncompatibleValueReturnsZero() {
        freq.addValue(1);

        assertEquals(0L, freq.getCount("not comparable"));
        assertEquals(0L, freq.getCumFreq("not comparable"));
        assertEquals(0.0, freq.getPct("not comparable"), 1e-12);
        assertEquals(0.0, freq.getCumPct("not comparable"), 1e-12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueNonComparableThrows() {
        freq.addValue(1);
        freq.addValue(new Object());
    }

    @Test
    public void testCustomComparator() {
        Frequency byLength = new Frequency(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        byLength.addValue("a");
        byLength.addValue("bb");
        byLength.addValue("ccc");

        assertEquals(3L, byLength.getSumFreq());
        assertEquals(1L, byLength.getCount("bb"));

        Iterator it = byLength.valuesIterator();
        assertEquals("a", it.next());
        assertEquals("bb", it.next());
        assertEquals("ccc", it.next());

        assertEquals(1L, byLength.getCumFreq("a"));
        assertEquals(2L, byLength.getCumFreq("bb"));
        assertEquals(3L, byLength.getCumFreq("ccc"));
    }
}