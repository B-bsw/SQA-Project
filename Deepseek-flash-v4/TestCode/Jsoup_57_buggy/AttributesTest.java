package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.jsoup.SerializationException;

import java.util.Map;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class AttributesTest {

    private Attributes attributes;

    @Before
    public void setUp() {
        attributes = new Attributes();
    }

    @After
    public void tearDown() {
        attributes = null;
    }

    @Test
    public void testGetWhenEmpty() {
        assertEquals("", attributes.get("key"));
    }

    @Test
    public void testGetWhenKeyNotFound() {
        attributes.put("existing", "value");
        assertEquals("", attributes.get("nonexistent"));
    }

    @Test
    public void testGetWhenKeyExists() {
        attributes.put("key1", "value1");
        assertEquals("value1", attributes.get("key1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetWithNullKey() {
        attributes.get(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetWithEmptyKey() {
        attributes.get("");
    }

    @Test
    public void testGetIgnoreCaseWhenEmpty() {
        assertEquals("", attributes.getIgnoreCase("KEY"));
    }

    @Test
    public void testGetIgnoreCaseWhenNotFound() {
        attributes.put("key", "value");
        assertEquals("", attributes.getIgnoreCase("nope"));
    }

    @Test
    public void testGetIgnoreCaseCaseInsensitive() {
        attributes.put("KeY", "value1");
        assertEquals("value1", attributes.getIgnoreCase("kEy"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIgnoreCaseWithNull() {
        attributes.getIgnoreCase(null);
    }

    @Test
    public void testPutStringStringNewAttribute() {
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
        assertEquals(1, attributes.size());
    }

    @Test
    public void testPutStringStringReplaceExisting() {
        attributes.put("key", "value1");
        attributes.put("key", "value2");
        assertEquals("value2", attributes.get("key"));
        assertEquals(1, attributes.size());
    }

    @Test
    public void testPutBooleanAttributeTrue() {
        attributes.put("key", true);
        assertTrue(attributes.hasKey("key"));
        assertEquals("", attributes.get("key"));
    }

    @Test
    public void testPutBooleanAttributeFalse() {
        attributes.put("key", "value");
        attributes.put("key", false);
        assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void testPutAttributeObject() {
        Attribute attr = new Attribute("key", "value");
        attributes.put(attr);
        assertEquals("value", attributes.get("key"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutNullAttribute() {
        attributes.put((Attribute) null);
    }

    @Test
    public void testRemoveWhenEmpty() {
        attributes.remove("key");
        assertEquals(0, attributes.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveWithNullKey() {
        attributes.remove(null);
    }

    @Test
    public void testRemoveExistingKey() {
        attributes.put("key", "value");
        attributes.remove("key");
        assertFalse(attributes.hasKey("key"));
        assertEquals(0, attributes.size());
    }

    @Test
    public void testRemoveNonExistingKey() {
        attributes.put("key", "value");
        attributes.remove("other");
        assertEquals(1, attributes.size());
    }

    @Test
    public void testRemoveIgnoreCaseWhenEmpty() {
        attributes.removeIgnoreCase("KEY");
        assertEquals(0, attributes.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveIgnoreCaseWithNull() {
        attributes.removeIgnoreCase(null);
    }

    @Test
    public void testRemoveIgnoreCaseCaseInsensitive() {
        attributes.put("KeY", "value");
        attributes.removeIgnoreCase("kEy");
        assertEquals(0, attributes.size());
    }

    @Test
    public void testHasKeyWhenEmpty() {
        assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void testHasKeyWithExistingKey() {
        attributes.put("key", "value");
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void testHasKeyWithDifferentCase() {
        attributes.put("key", "value");
        assertFalse(attributes.hasKey("KEY"));
    }

    @Test
    public void testHasKeyIgnoreCaseWhenEmpty() {
        assertFalse(attributes.hasKeyIgnoreCase("key"));
    }

    @Test
    public void testHasKeyIgnoreCaseWithDifferentCase() {
        attributes.put("KeY", "value");
        assertTrue(attributes.hasKeyIgnoreCase("kEy"));
    }

    @Test
    public void testSizeWhenEmpty() {
        assertEquals(0, attributes.size());
    }

    @Test
    public void testSizeWithMultipleAttributes() {
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        assertEquals(2, attributes.size());
    }

    @Test
    public void testAddAllWithEmptyIncoming() {
        Attributes incoming = new Attributes();
        attributes.put("key", "value");
        attributes.addAll(incoming);
        assertEquals(1, attributes.size());
    }

    @Test
    public void testAddAllWithNonEmptyIncoming() {
        Attributes incoming = new Attributes();
        incoming.put("key2", "value2");
        attributes.put("key1", "value1");
        attributes.addAll(incoming);
        assertEquals(2, attributes.size());
        assertEquals("value2", attributes.get("key2"));
    }

    @Test
    public void testIteratorWhenEmpty() {
        assertFalse(attributes.iterator().hasNext());
    }

    @Test
    public void testIteratorWithElements() {
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        Iterator<Attribute> it = attributes.iterator();
        assertTrue(it.hasNext());
        assertEquals("key1", it.next().getKey());
        assertTrue(it.hasNext());
        assertEquals("key2", it.next().getKey());
        assertFalse(it.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void testIteratorNextOnEmpty() {
        attributes.iterator().next();
    }

    @Test
    public void testAsListWhenEmpty() {
        List<Attribute> list = attributes.asList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAsListWithElements() {
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        List<Attribute> list = attributes.asList();
        assertEquals(2, list.size());
        assertEquals("key1", list.get(0).getKey());
        assertEquals("key2", list.get(1).getKey());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAsListIsUnmodifiable() {
        attributes.put("key", "value");
        List<Attribute> list = attributes.asList();
        list.clear();
    }

    @Test
    public void testDatasetWhenEmpty() {
        Map<String, String> dataset = attributes.dataset();
        assertTrue(dataset.isEmpty());
    }

    @Test
    public void testDatasetWithDataAttributes() {
        attributes.put("data-key", "value");
        attributes.put("normal", "notdata");
        Map<String, String> dataset = attributes.dataset();
        assertEquals(1, dataset.size());
        assertEquals("value", dataset.get("key"));
    }

    @Test
    public void testDatasetWithMultipleDataAttributes() {
        attributes.put("data-key1", "value1");
        attributes.put("data-key2", "value2");
        Map<String, String> dataset = attributes.dataset();
        assertEquals(2, dataset.size());
        assertTrue(dataset.containsKey("key1"));
        assertTrue(dataset.containsKey("key2"));
    }

    @Test
    public void testDatasetPut() {
        Map<String, String> dataset = attributes.dataset();
        String oldValue = dataset.put("testkey", "testvalue");
        assertNull(oldValue);
        assertEquals("testvalue", attributes.get("data-testkey"));
    }

    @Test
    public void testDatasetPutOverwrite() {
        attributes.put("data-key", "oldvalue");
        Map<String, String> dataset = attributes.dataset();
        String oldValue = dataset.put("key", "newvalue");
        assertEquals("oldvalue", oldValue);
        assertEquals("newvalue", attributes.get("data-key"));
    }

    @Test
    public void testHtmlWhenEmpty() {
        assertEquals("", attributes.html());
    }

    @Test
    public void testHtmlWithAttribute() {
        attributes.put("key", "value");
        assertEquals(" key=\"value\"", attributes.html());
    }

    @Test
    public void testToString() {
        attributes.put("key", "value");
        assertEquals(" key=\"value\"", attributes.toString());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(attributes.equals(attributes));
    }

    @Test
    public void testEqualsDifferentType() {
        assertFalse(attributes.equals("string"));
    }

    @Test
    public void testEqualsTwoEmpty() {
        Attributes other = new Attributes();
        assertTrue(attributes.equals(other));
    }

    @Test
    public void testEqualsBothEmptyButOneNull() {
        Attributes other = new Attributes();
        other.put("key", "value");
        assertFalse(attributes.equals(other));
    }

    @Test
    public void testEqualsWithSameContent() {
        attributes.put("key", "value");
        Attributes other = new Attributes();
        other.put("key", "value");
        assertTrue(attributes.equals(other));
    }

    @Test
    public void testEqualsWithDifferentContent() {
        attributes.put("key1", "value1");
        Attributes other = new Attributes();
        other.put("key2", "value2");
        assertFalse(attributes.equals(other));
    }

    @Test
    public void testHashCodeWhenEmpty() {
        Attributes other = new Attributes();
        assertEquals(other.hashCode(), attributes.hashCode());
    }

    @Test
    public void testHashCodeWithAttributes() {
        attributes.put("key", "value");
        Attributes other = new Attributes();
        other.put("key", "value");
        assertEquals(other.hashCode(), attributes.hashCode());
    }

    @Test
    public void testCloneWhenEmpty() {
        Attributes clone = attributes.clone();
        assertNotNull(clone);
        assertEquals(0, clone.size());
        assertNotSame(attributes, clone);
    }

    @Test
    public void testCloneWithAttributes() {
        attributes.put("key", "value");
        Attributes clone = attributes.clone();
        assertEquals(1, clone.size());
        assertEquals("value", clone.get("key"));
        assertNotSame(attributes, clone);
    }

    @Test
    public void testCloneIndependent() {
        attributes.put("key", "original");
        Attributes clone = attributes.clone();
        clone.put("key", "changed");
        assertEquals("original", attributes.get("key"));
        assertEquals("changed", clone.get("key"));
    }

    @Test
    public void testHtmlWithDataAttribute() {
        attributes.put("data-test", "value");
        String html = attributes.html();
        assertTrue(html.contains("data-test=\"value\""));
    }

    @Test
    public void testDatasetEntrySet() {
        attributes.put("data-key", "value");
        Map<String, String> dataset = attributes.dataset();
        assertFalse(dataset.entrySet().isEmpty());
        assertEquals(1, dataset.entrySet().size());
    }

    @Test
    public void testDatasetIteratorRemove() {
        attributes.put("data-key", "value");
        attributes.put("data-key2", "value2");
        Map<String, String> dataset = attributes.dataset();
        Iterator<Map.Entry<String, String>> it = dataset.entrySet().iterator();
        assertTrue(it.hasNext());
        it.next();
        it.remove();
        assertEquals(1, dataset.size());
    }
}