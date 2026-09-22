import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.junit.Assert.*;

public class SetUniqueListTest {
    private SetUniqueList list;
    private List<String> baseList;

    @Before
    public void setUp() {
        baseList = new ArrayList<String>();
        list = new SetUniqueList(baseList, new HashSet<Object>());
    }

    @Test
    public void testDecorateNullListThrows() {
        try {
            SetUniqueList.decorate(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("List must not be null", e.getMessage());
        }
    }

    @Test
    public void testDecorateWithNonEmptyListRemovesDuplicates() {
        List<String> input = Arrays.asList("a", "b", "a", "c");
        SetUniqueList result = SetUniqueList.decorate(new ArrayList<String>(input));
        assertEquals(3, result.size());
        assertTrue(result.contains("a"));
        assertTrue(result.contains("b"));
        assertTrue(result.contains("c"));
    }

    @Test
    public void testConstructorNullSetThrows() {
        try {
            new SetUniqueList(new ArrayList<Object>(), null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Set must not be null", e.getMessage());
        }
    }

    @Test
    public void testAddUniqueElement() {
        assertTrue(list.add("x"));
        assertEquals(1, list.size());
        assertTrue(list.contains("x"));
    }

    @Test
    public void testAddDuplicateElement() {
        list.add("x");
        assertFalse(list.add("x"));
        assertEquals(1, list.size());
    }

    @Test
    public void testAddAtIndexUnique() {
        list.add("a");
        list.add("c");
        list.add(1, "b");
        assertEquals(3, list.size());
        assertEquals("b", list.get(1));
    }

    @Test
    public void testAddAtIndexDuplicate() {
        list.add("a");
        list.add("b");
        list.add(1, "a");
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testAddAllWithDuplicates() {
        list.add("a");
        list.addAll(Arrays.asList("b", "a", "c"));
        assertEquals(3, list.size());
        assertTrue(list.containsAll(Arrays.asList("a", "b", "c")));
    }

    @Test
    public void testAddAllAtIndexDuplicates() {
        list.addAll(Arrays.asList("a", "c"));
        list.addAll(1, Arrays.asList("b", "a", "d"));
        assertEquals(4, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("d", list.get(2));
        assertEquals("c", list.get(3));
    }

    @Test
    public void testSetUniqueAtIndex() {
        list.add("a");
        list.add("b");
        Object prev = list.set(1, "c");
        assertEquals("b", prev);
        assertEquals("c", list.get(1));
        assertEquals(2, list.size());
    }

    @Test
    public void testSetDuplicateMovesElement() {
        list.add("a");
        list.add("b");
        list.add("c");
        Object prev = list.set(0, "c");
        assertEquals("a", prev);
        assertEquals(2, list.size());
        assertEquals("c", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testSetSameObject() {
        list.add("a");
        list.add("b");
        Object prev = list.set(0, "a");
        assertEquals("a", prev);
        assertEquals(2, list.size());
        assertEquals("a", list.get(0));
    }

    @Test
    public void testRemoveByObject() {
        list.add("a");
        list.add("b");
        assertTrue(list.remove("a"));
        assertFalse(list.remove("zzz"));
        assertEquals(1, list.size());
        assertFalse(list.contains("a"));
    }

    @Test
    public void testRemoveByIndex() {
        list.add("a");
        list.add("b");
        Object removed = list.remove(0);
        assertEquals("a", removed);
        assertEquals(1, list.size());
        assertFalse(list.contains("a"));
    }

    @Test
    public void testRemoveAll() {
        list.addAll(Arrays.asList("a", "b", "c"));
        assertTrue(list.removeAll(Arrays.asList("b", "zzz")));
        assertEquals(2, list.size());
        assertFalse(list.contains("b"));
        assertTrue(list.contains("a"));
        assertTrue(list.contains("c"));
    }

    @Test
    public void testRetainAll() {
        list.addAll(Arrays.asList("a", "b", "c"));
        assertTrue(list.retainAll(Arrays.asList("a", "c")));
        assertEquals(2, list.size());
        assertTrue(list.contains("a"));
        assertTrue(list.contains("c"));
        assertFalse(list.contains("b"));
    }

    @Test
    public void testClear() {
        list.add("a");
        list.clear();
        assertTrue(list.isEmpty());
        assertFalse(list.contains("a"));
    }

    @Test
    public void testContainsAll() {
        list.addAll(Arrays.asList("a", "b"));
        assertTrue(list.containsAll(Arrays.asList("a", "b")));
        assertFalse(list.containsAll(Arrays.asList("b", "c")));
    }

    @Test
    public void testIteratorRemove() {
        list.addAll(Arrays.asList("a", "b", "c"));
        java.util.Iterator<Object> it = list.iterator();
        it.next();
        it.remove();
        assertEquals(2, list.size());
        assertFalse(list.contains("a"));
    }

    @Test
    public void testListIteratorAdd() {
        list.addAll(Arrays.asList("a", "c"));
        java.util.ListIterator<Object> lit = list.listIterator(1);
        lit.add("b");
        assertEquals(3, list.size());
        assertTrue(list.contains("b"));
        assertTrue(list.contains("a"));
        assertTrue(list.contains("c"));
    }

    @Test
    public void testListIteratorSetUnsupported() {
        list.add("a");
        java.util.ListIterator<Object> lit = list.listIterator();
        lit.next();
        try {
            lit.set("b");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAsSetReturnsUnmodifiable() {
        list.add("a");
        Set asSet = list.asSet();
        assertTrue(asSet.contains("a"));
        assertTrue(list.asSet() instanceof org.apache.commons.collections.set.UnmodifiableSet);
    }

    @Test
    public void testSubList() {
        list.addAll(Arrays.asList("a", "b", "c"));
        List sub = list.subList(0, 2);
        assertEquals(2, sub.size());
        assertEquals("a", sub.get(0));
        assertEquals("b", sub.get(1));
    }
}