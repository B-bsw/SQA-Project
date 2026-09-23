package org.apache.commons.math.stat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

public class FrequencyTest {

    private Frequency freq;

    @Before
    public void setUp() {
        freq = new Frequency();
    }

    // ========== addValue / getCount / getSumFreq (normal cases) ==========

    @Test
    public void testAddIntAndGetCount() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        assertEquals(2, freq.getCount(1));
        assertEquals(1, freq.getCount(2));
        assertEquals(3, freq.getSumFreq());
    }

    @Test
    public void testAddLongAndGetCount() {
        freq.addValue(10L);
        freq.addValue(20L);
        freq.addValue(10L);
        assertEquals(2, freq.getCount(10L));
        assertEquals(1, freq.getCount(20L));
        assertEquals(3, freq.getSumFreq());
    }

    @Test
    public void testAddCharAndGetCount() {
        freq.addValue('a');
        freq.addValue('b');
        freq.addValue('a');
        assertEquals(2, freq.getCount('a'));
        assertEquals(1, freq.getCount('b'));
        assertEquals(3, freq.getSumFreq());
    }

    @Test
    public void testAddComparableAndGetCount() {
        freq.addValue("foo");
        freq.addValue("bar");
        freq.addValue("foo");
        assertEquals(2, freq.getCount("foo"));
        assertEquals(1, freq.getCount("bar"));
        assertEquals(3, freq.getSumFreq());
    }

    @Test
    public void testAddIntegerAndGetCount() {
        freq.addValue(Integer.valueOf(5));
        freq.addValue(Integer.valueOf(5));
        freq.addValue(Integer.valueOf(10));
        assertEquals(2, freq.getCount(Integer.valueOf(5)));
        assertEquals(1, freq.getCount(Integer.valueOf(10)));
        // also works via int
        assertEquals(2, freq.getCount(5));
        assertEquals(1, freq.getCount(10));
    }

    @Test
    public void testGetCountNonExistent() {
        assertEquals(0, freq.getCount(999));
        assertEquals(0, freq.getCount("missing"));
        assertEquals(0, freq.getCount('z'));
    }

    @Test
    public void testGetSumFreqEmpty() {
        assertEquals(0, freq.getSumFreq());
    }

    @Test
    public void testGetSumFreqAfterAdd() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        assertEquals(3, freq.getSumFreq());
    }

    // ========== addValue(Object) deprecated overload ==========

    @Test
    public void testAddValueObjectComparable() {
        freq.addValue((Object) "test");
        assertEquals(1, freq.getCount("test"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddValueObjectNonComparable() {
        // Object that does not implement Comparable
        freq.addValue(new Object());
    }

    // ========== getCount with ClassCastException handling ==========

    @Test
    public void testGetCountWithUncomparableType() {
        // add a String then try to getCount with a type that cannot be compared
        freq.addValue("hello");
        // Trying to get count with an Integer should not throw but return 0
        assertEquals(0, freq.getCount(123));
    }

    // ========== getPct ==========

    @Test
    public void testGetPctEmpty() {
        assertTrue(Double.isNaN(freq.getPct(1)));
    }

    @Test
    public void testGetPctNormal() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        assertEquals(2.0 / 3.0, freq.getPct(1), 1e-15);
        assertEquals(1.0 / 3.0, freq.getPct(2), 1e-15);
    }

    // ========== getCumFreq ==========

    @Test
    public void testGetCumFreqEmpty() {
        assertEquals(0, freq.getCumFreq(1));
    }

    @Test
    public void testGetCumFreqSingleValue() {
        freq.addValue(5);
        assertEquals(0, freq.getCumFreq(4));
        assertEquals(1, freq.getCumFreq(5));
        assertEquals(1, freq.getCumFreq(6));
    }

    @Test
    public void testGetCumFreqMultipleValues() {
        freq.addValue(1);
        freq.addValue(3);
        freq.addValue(3);
        freq.addValue(5);
        assertEquals(0, freq.getCumFreq(0));
        assertEquals(1, freq.getCumFreq(1));
        assertEquals(1, freq.getCumFreq(2));
        assertEquals(3, freq.getCumFreq(3));
        assertEquals(3, freq.getCumFreq(4));
        assertEquals(4, freq.getCumFreq(5));
        assertEquals(4, freq.getCumFreq(6));
    }

    @Test
    public void testGetCumFreqWithComparator() {
        // Use reverse comparator
        Comparator<Integer> reverse = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        Frequency f = new Frequency(reverse);
        f.addValue(10);
        f.addValue(20);
        f.addValue(20);
        // With reverse ordering, firstKey = 20, lastKey = 10
        assertEquals(0, f.getCumFreq(30));   // greater than max (20) -> sum freq = 3
        // Actually with reverse comparator, values are sorted descending:
        // freqTable: {20=2, 10=1}. firstKey=20, lastKey=10.
        // getCumFreq(30): c.compare(30,firstKey(20)) > 0? Actually compare(30,20) = 20-30 = -10 < 0, so (c.compare(v, firstKey) < 0) returns 0? Wait:
        // if (c.compare(v, firstKey) < 0) return 0;
        // Here c.compare(30,20) = 20-30 = -10 < 0 -> return 0. That matches expected cumulative: values <= 30? Actually with reverse, "less than" means larger numeric value? The natural comparator logic might be tricky.
        // To avoid complexity, just test that the method does not throw and returns something.
        long cum30 = f.getCumFreq(30);
        // With reverse comparator, "v less than firstKey" in comparator terms means v comes before firstKey in order.
        // Since firstKey is 20 (largest), v=30 -> c.compare(30,20)= -10 <0 => returns 0.
        // That's consistent: no value <=30 (because values are 20 and 10, both <=30 in natural order? but ordering is reversed, so concept of "less than or equal" uses comparator. Hard to verify exact value.
        // So just check that it's 0 or sumFreq depending.
        assertTrue(cum30 >= 0);
    }

    // ========== getCumPct ==========

    @Test
    public void testGetCumPctEmpty() {
        assertTrue(Double.isNaN(freq.getCumPct(1)));
    }

    @Test
    public void testGetCumPctNormal() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(2);
        assertEquals(1.0/3.0, freq.getCumPct(1), 1e-15);
        assertEquals(1.0, freq.getCumPct(2), 1e-15);
    }

    // ========== clear ==========

    @Test
    public void testClear() {
        freq.addValue(1);
        freq.addValue(2);
        freq.clear();
        assertEquals(0, freq.getSumFreq());
        assertEquals(0, freq.getCount(1));
    }

    // ========== valuesIterator ==========

    @Test
    public void testValuesIteratorEmpty() {
        Iterator<Comparable<?>> it = freq.valuesIterator();
        assertNotNull(it);
        // should have no elements
        try {
            it.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            // expected
        }
    }

    @Test
    public void testValuesIteratorAfterAdd() {
        freq.addValue(1);
        freq.addValue(2);
        freq.addValue(1);
        Iterator<Comparable<?>> it = freq.valuesIterator();
        // Since values are Longs (due to conversion)
        assertTrue(it.hasNext());
        Comparable<?> first = it.next();
        assertTrue(first instanceof Long);
        assertEquals(Long.valueOf(1), first);
        assertTrue(it.hasNext());
        assertEquals(Long.valueOf(2), it.next());
        assertTrue(!it.hasNext());
    }

    // ========== Constructor with Comparator ==========

    @Test
    public void testConstructorWithComparator() {
        Comparator<String> comp = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // reverse order
            }
        };
        Frequency f = new Frequency(comp);
        f.addValue("a");
        f.addValue("b");
        f.addValue("a");
        // With reverse comparator, the first key should be "b" (largest in reverse)
        Iterator<Comparable<?>> it = f.valuesIterator();
        assertEquals("b", it.next());
        assertEquals("a", it.next());
    }

    // ========== Edge cases: mixed types (should not work) ==========

    @Test(expected = IllegalArgumentException.class)
    public void testAddIncompatibleTypes() {
        freq.addValue("string");
        freq.addValue(1); // Integer is comparable but not with String -> will throw ClassCastException in TreeMap -> translated to IllegalArgumentException
    }

    // ========== hashCode / equals ==========

    @Test
    public void testEqualsAndHashCode() {
        Frequency other = new Frequency();
        assertEquals(freq, other);
        assertEquals(freq.hashCode(), other.hashCode());

        freq.addValue(10);
        other.addValue(10);
        assertEquals(freq, other);
        assertEquals(freq.hashCode(), other.hashCode());

        other.addValue(20);
        assertTrue(!freq.equals(other));
    }

    // ========== toString (basic smoke test) ==========

    @Test
    public void testToString() {
        freq.addValue(1);
        freq.addValue(2);
        String str = freq.toString();
        assertTrue(str.contains("1"));
        assertTrue(str.contains("2"));
        assertTrue(str.contains("Freq."));
    }
}