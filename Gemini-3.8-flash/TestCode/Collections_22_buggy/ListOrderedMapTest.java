package org.apache.commons.collections4.map;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.collections4.OrderedMapIterator;
import org.junit.Assert;
import org.junit.Test;

public class ListOrderedMapTest {

    @Test
    public void testFactoryMethod_givenEmptyMap_shouldInitializeCorrectly() {
        Map<String, String> baseMap = new HashMap<String, String>();
        ListOrderedMap<String, String> map = ListOrderedMap.listOrderedMap(baseMap);
        Assert.assertNotNull(map);
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(0, map.size());
    }

    @Test
    public void testConstructor_withPopulatedMap_shouldPreserveInitialOrder() {
        Map<String, Integer> source = new LinkedHashMap<String, Integer>();
        source.put("A", Integer.valueOf(1));
        source.put("B", Integer.valueOf(2));
        source.put("C", Integer.valueOf(3));

        ListOrderedMap<String, Integer> map = new ListOrderedMap<String, Integer>(source);
        Assert.assertEquals(3, map.size());
        Assert.assertEquals("A", map.get(0));
        Assert.assertEquals("B", map.get(1));
        Assert.assertEquals("C", map.get(2));
        Assert.assertEquals(Integer.valueOf(1), map.getValue(0));
        Assert.assertEquals(Integer.valueOf(2), map.getValue(1));
        Assert.assertEquals(Integer.valueOf(3), map.getValue(2));
    }

    @Test
    public void testSerialization_givenPopulatedMap_shouldRestoreOrderAndEntries() throws Exception {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        @SuppressWarnings("unchecked")
        ListOrderedMap<String, String> deserialized = (ListOrderedMap<String, String>) ois.readObject();
        ois.close();

        Assert.assertEquals(3, deserialized.size());
        Assert.assertEquals("one", deserialized.get(0));
        Assert.assertEquals("two", deserialized.get(1));
        Assert.assertEquals("three", deserialized.get(2));
        Assert.assertEquals("1", deserialized.get("one"));
        Assert.assertEquals("2", deserialized.get("two"));
        Assert.assertEquals("3", deserialized.get("three"));
    }

    @Test(expected = NoSuchElementException.class)
    public void firstKey_givenEmptyMap_shouldThrowNoSuchElementException() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.firstKey();
    }

    @Test
    public void firstKey_givenNonEmptyMap_shouldReturnFirstKey() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("first", "v1");
        map.put("second", "v2");
        Assert.assertEquals("first", map.firstKey());
    }

    @Test(expected = NoSuchElementException.class)
    public void lastKey_givenEmptyMap_shouldThrowNoSuchElementException() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.lastKey();
    }

    @Test
    public void lastKey_givenNonEmptyMap_shouldReturnLastKey() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("first", "v1");
        map.put("second", "v2");
        Assert.assertEquals("second", map.lastKey());
    }

    @Test
    public void nextKey_givenVariousKeys_shouldReturnNextOrNull() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        Assert.assertEquals("k2", map.nextKey("k1"));
        Assert.assertEquals("k3", map.nextKey("k2"));
        Assert.assertNull(map.nextKey("k3"));
        Assert.assertNull(map.nextKey("nonExistent"));
    }

    @Test
    public void previousKey_givenVariousKeys_shouldReturnPreviousOrNull() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        Assert.assertNull(map.previousKey("k1"));
        Assert.assertEquals("k1", map.previousKey("k2"));
        Assert.assertEquals("k2", map.previousKey("k3"));
        Assert.assertNull(map.previousKey("nonExistent"));
    }

    @Test
    public void put_givenNewKeyAndExistingKey_shouldUpdateAndMaintainOrder() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        String oldVal1 = map.put("a", "1");
        Assert.assertNull(oldVal1);
        Assert.assertEquals(1, map.size());

        String oldVal2 = map.put("b", "2");
        Assert.assertNull(oldVal2);
        Assert.assertEquals(2, map.size());

        String replaced = map.put("a", "10");
        Assert.assertEquals("1", replaced);
        Assert.assertEquals(2, map.size());
        Assert.assertEquals("a", map.get(0));
        Assert.assertEquals("b", map.get(1));
        Assert.assertEquals("10", map.getValue(0));
    }

    @Test
    public void putAll_givenMap_shouldAppendInOrder() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("init", "0");

        Map<String, String> addition = new LinkedHashMap<String, String>();
        addition.put("a", "1");
        addition.put("b", "2");
        addition.put("init", "100");

        map.putAll(addition);
        Assert.assertEquals(3, map.size());
        Assert.assertEquals("init", map.get(0));
        Assert.assertEquals("a", map.get(1));
        Assert.assertEquals("b", map.get(2));
        Assert.assertEquals("100", map.getValue(0));
    }

    @Test
    public void putAllWithIndex_givenNewEntries_shouldInsertSequentially() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k4", "v4");

        Map<String, String> toInsert = new LinkedHashMap<String, String>();
        toInsert.put("k2", "v2");
        toInsert.put("k3", "v3");

        map.putAll(1, toInsert);

        Assert.assertEquals(4, map.size());
        Assert.assertEquals("k1", map.get(0));
        Assert.assertEquals("k2", map.get(1));
        Assert.assertEquals("k3", map.get(2));
        Assert.assertEquals("k4", map.get(3));
    }

    @Test
    public void putAllWithIndex_givenExistingEntries_shouldUpdateAndReposition() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        Map<String, String> toInsert = new LinkedHashMap<String, String>();
        toInsert.put("k3", "newV3");
        toInsert.put("k4", "v4");

        map.putAll(0, toInsert);

        Assert.assertEquals(4, map.size());
        Assert.assertEquals("k3", map.get(0));
        Assert.assertEquals("k4", map.get(1));
        Assert.assertEquals("k1", map.get(2));
        Assert.assertEquals("k2", map.get(3));
        Assert.assertEquals("newV3", map.get("k3"));
    }

    @Test
    public void remove_byKey_shouldRemoveAndReturnOldValue() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");

        String nonExistent = map.remove("missing");
        Assert.assertNull(nonExistent);
        Assert.assertEquals(2, map.size());

        String removed = map.remove("k1");
        Assert.assertEquals("v1", removed);
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("k2", map.get(0));
        Assert.assertEquals(-1, map.indexOf("k1"));
    }

    @Test
    public void remove_byIndex_shouldRemoveAndReturnOldValue() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        String removed = map.remove(1);
        Assert.assertEquals("v2", removed);
        Assert.assertEquals(2, map.size());
        Assert.assertEquals("k1", map.get(0));
        Assert.assertEquals("k3", map.get(1));
    }

    @Test
    public void clear_givenPopulatedMap_shouldBeEmpty() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");

        map.clear();
        Assert.assertEquals(0, map.size());
        Assert.assertTrue(map.isEmpty());
        Assert.assertEquals(-1, map.indexOf("k1"));
    }

    @Test
    public void indexOf_givenKeys_shouldReturnCorrectIndex() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");

        Assert.assertEquals(0, map.indexOf("k1"));
        Assert.assertEquals(1, map.indexOf("k2"));
        Assert.assertEquals(-1, map.indexOf("unknown"));
    }

    @Test
    public void setValue_givenIndexAndValue_shouldUpdateMap() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");

        String oldVal = map.setValue(1, "v2_updated");
        Assert.assertEquals("v2", oldVal);
        Assert.assertEquals("v2_updated", map.getValue(1));
        Assert.assertEquals("v2_updated", map.get("k2"));
    }

    @Test
    public void putAtIndex_givenNewKey_shouldInsertAtSpecifiedIndex() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k3", "v3");

        String res = map.put(1, "k2", "v2");
        Assert.assertNull(res);
        Assert.assertEquals(3, map.size());
        Assert.assertEquals("k1", map.get(0));
        Assert.assertEquals("k2", map.get(1));
        Assert.assertEquals("k3", map.get(2));
    }

    @Test
    public void putAtIndex_givenExistingKeyWithPosLessThanIndex_shouldReorderCorrectly() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        String oldVal = map.put(2, "k1", "new_v1");
        Assert.assertEquals("v1", oldVal);
        Assert.assertEquals(3, map.size());
        Assert.assertEquals("k2", map.get(0));
        Assert.assertEquals("k1", map.get(1));
        Assert.assertEquals("k3", map.get(2));
        Assert.assertEquals("new_v1", map.getValue(1));
    }

    @Test
    public void putAtIndex_givenExistingKeyWithPosGreaterThanOrEqualToIndex_shouldReorderCorrectly() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        String oldVal = map.put(0, "k3", "new_v3");
        Assert.assertEquals("v3", oldVal);
        Assert.assertEquals(3, map.size());
        Assert.assertEquals("k3", map.get(0));
        Assert.assertEquals("k1", map.get(1));
        Assert.assertEquals("k2", map.get(2));
        Assert.assertEquals("new_v3", map.getValue(0));
    }

    @Test
    public void asList_andKeyList_shouldReturnUnmodifiableKeys() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("a", "1");
        map.put("b", "2");

        List<String> list = map.asList();
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("a", list.get(0));
        Assert.assertEquals("b", list.get(1));

        try {
            list.add("c");
            Assert.fail("keyList / asList should be unmodifiable");
        } catch (UnsupportedOperationException expected) {
            // Success
        }

        Assert.assertEquals(list, map.keyList());
    }

    @Test
    public void toString_whenEmpty_shouldReturnEmptyBraces() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        Assert.assertEquals("{}", map.toString());
    }

    @Test
    public void toString_whenPopulated_shouldFormatCorrectly() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        Assert.assertEquals("{k1=v1, k2=v2}", map.toString());
    }

    @Test
    public void toString_withSelfReference_shouldHandleGracefully() {
        ListOrderedMap<Object, Object> map = new ListOrderedMap<Object, Object>();
        map.put(map, "val");
        Assert.assertEquals("{(this Map)=val}", map.toString());

        map.clear();
        map.put("key", map);
        Assert.assertEquals("{key=(this Map)}", map.toString());
    }

    @Test
    public void keySetView_operations_shouldReflectMapAndSupportIteration() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");

        Set<String> keys = map.keySet();
        Assert.assertEquals(2, keys.size());
        Assert.assertTrue(keys.contains("k1"));
        Assert.assertFalse(keys.contains("k3"));

        Iterator<String> it = keys.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("k1", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("k2", it.next());
        Assert.assertFalse(it.hasNext());

        keys.clear();
        Assert.assertEquals(0, map.size());
        Assert.assertEquals(0, keys.size());
    }

    @Test
    public void valuesView_operations_shouldReflectMapAndSupportMutations() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");

        Collection<String> values = map.values();
        List<String> valList = map.valueList();

        Assert.assertEquals(2, values.size());
        Assert.assertTrue(values.contains("v1"));
        Assert.assertFalse(values.contains("missing"));
        Assert.assertEquals("v1", valList.get(0));
        Assert.assertEquals("v2", valList.get(1));

        Iterator<String> it = values.iterator();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("v1", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("v2", it.next());
        Assert.assertFalse(it.hasNext());

        String oldSet = valList.set(1, "v2_updated");
        Assert.assertEquals("v2", oldSet);
        Assert.assertEquals("v2_updated", map.get("k2"));

        String removedVal = valList.remove(0);
        Assert.assertEquals("v1", removedVal);
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("k2", map.get(0));

        values.clear();
        Assert.assertEquals(0, map.size());
    }

    @Test
    public void entrySetView_basicOperations_shouldFunctionProperly() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Assert.assertEquals(2, entrySet.size());
        Assert.assertFalse(entrySet.isEmpty());
        Assert.assertTrue(entrySet.hashCode() != 0);
        Assert.assertNotNull(entrySet.toString());

        Assert.assertTrue(entrySet.equals(entrySet));
        Map<String, String> stdMap = new HashMap<String, String>();
        stdMap.put("k1", "v1");
        stdMap.put("k2", "v2");
        Assert.assertTrue(entrySet.equals(stdMap.entrySet()));

        Assert.assertFalse(entrySet.contains("stringObject"));
        Assert.assertTrue(entrySet.containsAll(stdMap.entrySet()));

        Assert.assertFalse(entrySet.remove("notAnEntry"));

        Map.Entry<String, String> nonExistentEntry = new Map.Entry<String, String>() {
            public String getKey() {
                return "unknown";
            }
            public String getValue() {
                return "val";
            }
            public String setValue(String value) {
                return null;
            }
        };
        Assert.assertFalse(entrySet.remove(nonExistentEntry));

        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        Map.Entry<String, String> firstEntry = it.next();
        Assert.assertEquals("k1", firstEntry.getKey());
        Assert.assertEquals("v1", firstEntry.getValue());
        firstEntry.setValue("v1_mod");
        Assert.assertEquals("v1_mod", map.get("k1"));

        it.remove();
        Assert.assertEquals(1, map.size());
        Assert.assertFalse(map.containsKey("k1"));

        boolean removed = entrySet.remove(new Map.Entry<String, String>() {
            public String getKey() {
                return "k2";
            }
            public String getValue() {
                return "v2";
            }
            public String setValue(String value) {
                return null;
            }
        });
        Assert.assertTrue(removed);
        Assert.assertEquals(0, map.size());

        map.put("a", "1");
        map.put("b", "2");
        entrySet.clear();
        Assert.assertEquals(0, map.size());
    }

    @Test
    public void mapIterator_fullNavigationAndMutation_shouldWorkCorrectly() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        map.put("k2", "v2");

        OrderedMapIterator<String, String> it = map.mapIterator();
        Assert.assertEquals("Iterator[]", it.toString());
        Assert.assertTrue(it.hasNext());
        Assert.assertFalse(it.hasPrevious());

        Assert.assertEquals("k1", it.next());
        Assert.assertEquals("k1", it.getKey());
        Assert.assertEquals("v1", it.getValue());
        Assert.assertEquals("Iterator[k1=v1]", it.toString());

        it.setValue("v1_modified");
        Assert.assertEquals("v1_modified", map.get("k1"));
        Assert.assertEquals("v1_modified", it.getValue());

        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("k2", it.next());
        Assert.assertEquals("k2", it.getKey());
        Assert.assertEquals("v2", it.getValue());

        Assert.assertTrue(it.hasPrevious());
        Assert.assertEquals("k2", it.previous());
        Assert.assertEquals("k2", it.getKey());

        Assert.assertEquals("k1", it.previous());
        Assert.assertEquals("k1", it.getKey());

        it.remove();
        Assert.assertEquals(1, map.size());
        Assert.assertFalse(map.containsKey("k1"));
        Assert.assertEquals("Iterator[]", it.toString());

        it.reset();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("k2", it.next());
    }

    @Test(expected = IllegalStateException.class)
    public void mapIterator_getKeyWithoutNext_shouldThrowIllegalStateException() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        OrderedMapIterator<String, String> it = map.mapIterator();
        it.getKey();
    }

    @Test(expected = IllegalStateException.class)
    public void mapIterator_getValueWithoutNext_shouldThrowIllegalStateException() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        OrderedMapIterator<String, String> it = map.mapIterator();
        it.getValue();
    }

    @Test(expected = IllegalStateException.class)
    public void mapIterator_setValueWithoutNext_shouldThrowIllegalStateException() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        OrderedMapIterator<String, String> it = map.mapIterator();
        it.setValue("fail");
    }

    @Test(expected = IllegalStateException.class)
    public void mapIterator_removeWithoutNext_shouldThrowIllegalStateException() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        OrderedMapIterator<String, String> it = map.mapIterator();
        it.remove();
    }

    @Test(expected = IllegalStateException.class)
    public void mapIterator_removeTwice_shouldThrowIllegalStateException() {
        ListOrderedMap<String, String> map = new ListOrderedMap<String, String>();
        map.put("k1", "v1");
        OrderedMapIterator<String, String> it = map.mapIterator();
        it.next();
        it.remove();
        it.remove();
    }
}