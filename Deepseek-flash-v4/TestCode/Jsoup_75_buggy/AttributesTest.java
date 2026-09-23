package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

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
    public void testGetEmptyAttributes() {
        assertEquals("", attributes.get("nonexistent"));
        assertEquals("", attributes.getIgnoreCase("nonexistent"));
        assertFalse(attributes.hasKey("nonexistent"));
        assertFalse(attributes.hasKeyIgnoreCase("nonexistent"));
        assertEquals(0, attributes.size());
    }

    @Test
    public void testPutAndGetBasic() {
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        assertEquals("value1", attributes.get("key1"));
        assertEquals("value2", attributes.get("key2"));
        assertEquals(2, attributes.size());
    }

    @Test
    public void testPutOverwriteValue() {
        attributes.put("key", "value1");
        attributes.put("key", "value2");
        assertEquals("value2", attributes.get("key"));
        assertEquals(1, attributes.size());
    }

    @Test
    public void testPutNullValue() {
        attributes.put("key", null);
        assertEquals("", attributes.get("key"));
        assertTrue(attributes.hasKey("key"));
    }

    @Test
    public void testPutBooleanValue() {
        attributes.put("key", true);
        assertTrue(attributes.hasKey("key"));
        assertEquals("", attributes.get("key"));
        attributes.put("key", false);
        assertFalse(attributes.hasKey("key"));
    }

    @Test
    public void testPutAttribute() {
        Attribute attr = new Attribute("key", "value");
        attributes.put(attr);
        assertEquals("value", attributes.get("key"));
        assertEquals(1, attributes.size());
    }

    @Test
    public void testPutNullAttribute() {
        try {
            attributes.put((Attribute) null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testPutIgnoreCase() {
        attributes.put("Key", "value");
        attributes.putIgnoreCase("KEY", "newValue");
        assertEquals("newValue", attributes.get("Key"));
        assertEquals(1, attributes.size());
    }

    @Test
    public void testPutIgnoreCaseNewKey() {
        attributes.putIgnoreCase("Key", "value");
        assertEquals("value", attributes.get("Key"));
        assertEquals(1, attributes.size());
    }

    @Test
    public void testRemove() {
        attributes.put("key", "value");
        attributes.remove("key");
        assertFalse(attributes.hasKey("key"));
        assertEquals(0, attributes.size());
    }

    @Test
    public void testRemoveNonexistent() {
        attributes.put("key", "value");
        attributes.remove("nonexistent");
        assertEquals(1, attributes.size());
    }

    @Test
    public void testRemoveIgnoreCase() {
        attributes.put("Key", "value");
        attributes.removeIgnoreCase("key");
        assertFalse(attributes.hasKey("Key"));
        assertEquals(0, attributes.size());
    }

    @Test
    public void testAddAll() {
        Attributes incoming = new Attributes();
        incoming.put("key1", "value1");
        incoming.put("key2", "value2");
        attributes.addAll(incoming);
        assertEquals(2, attributes.size());
        assertEquals("value1", attributes.get("key1"));
        assertEquals("value2", attributes.get("key2"));
    }

    @Test
    public void testAddAllEmpty() {
        Attributes incoming = new Attributes();
        attributes.addAll(incoming);
        assertEquals(0, attributes.size());
    }

    @Test
    public void testIterator() {
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");
        Iterator<Attribute> iterator = attributes.iterator();
        assertTrue(iterator.hasNext());
        Attribute attr1 = iterator.next();
        assertEquals("key1", attr1.getKey());
        assertEquals("value1", attr1.getValue());
        iterator.remove();
        assertEquals(1, attributes.size());
        assertTrue(iterator.hasNext());
        Attribute attr2 = iterator.next();
        assertEquals("key2", attr2.getKey());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testIteratorEmpty() {
        Iterator<Attribute> iterator = attributes.iterator();
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testAsList() {
        attributes.put("key1", "value1");
        attributes.put("key2", null);
        List<Attribute> list = attributes.asList();
        assertEquals(2, list.size());
        assertEquals("key1", list.get(0).getKey());
        assertEquals("value1", list.get(0).getValue());
        assertEquals("key2", list.get(1).getKey());
        assertEquals("", list.get(1).getValue());
    }

    @Test
    public void testAsListUnmodifiable() {
        attributes.put("key", "value");
        List<Attribute> list = attributes.asList();
        try {
            list.add(new Attribute("key2", "value2"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testDataset() {
        attributes.put("data-key1", "value1");
        attributes.put("key2", "value2");
        Map<String, String> dataset = attributes.dataset();
        assertEquals(1, dataset.size());
        assertTrue(dataset.containsKey("key1"));
        assertEquals("value1", dataset.get("key1"));
        assertFalse(dataset.containsKey("key2"));
    }

    @Test
    public void testDatasetPut() {
        Map<String, String> dataset = attributes.dataset();
        String oldValue = dataset.put("key1", "value1");
        assertNull(oldValue);
        assertEquals("value1", attributes.get("data-key1"));
        oldValue = dataset.put("key1", "newValue");
        assertEquals("value1", oldValue);
        assertEquals("newValue", attributes.get("data-key1"));
    }

    @Test
    public void testDatasetEntrySet() {
        attributes.put("data-key1", "value1");
        attributes.put("data-key2", "value2");
        Map<String, String> dataset = attributes.dataset();
        Set<Map.Entry<String, String>> entrySet = dataset.entrySet();
        assertEquals(2, entrySet.size());
        for (Map.Entry<String, String> entry : entrySet) {
            assertTrue(entry.getKey().startsWith("key"));
            assertNotNull(entry.getValue());
        }
    }

    @Test
    public void testDatasetRemove() {
        attributes.put("data-key1", "value1");
        Map<String, String> dataset = attributes.dataset();
        dataset.remove("key1");
        assertFalse(attributes.hasKey("data-key1"));
        assertEquals(0, attributes.size());
    }

    @Test
    public void testHtml() {
        attributes.put("key1", "value1");
        attributes.put("checked", null);
        attributes.put("selected", "selected");
        String html = attributes.html();
        assertTrue(html.contains("key1=\"value1\""));
        assertTrue(html.contains(" checked"));
        assertTrue(html.contains("selected=\"selected\""));
    }

    @Test
    public void testHtmlEmpty() {
        assertEquals("", attributes.html());
    }

    @Test
    public void testToString() {
        attributes.put("key", "value");
        assertEquals(attributes.html(), attributes.toString());
    }

    @Test
    public void testEquals() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key", "value");
        Attributes attrs2 = new Attributes();
        attrs2.put("key", "value");
        assertEquals(attrs1, attrs2);
        assertEquals(attrs1.hashCode(), attrs2.hashCode());
    }

    @Test
    public void testNotEquals() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key", "value");
        Attributes attrs2 = new Attributes();
        attrs2.put("key", "different");
        assertNotEquals(attrs1, attrs2);
        attrs2.put("key", "value");
        attrs2.put("extra", "value");
        assertNotEquals(attrs1, attrs2);
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(attributes.equals(attributes));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(attributes.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(attributes.equals("string"));
    }

    @Test
    public void testClone() {
        attributes.put("key", "value");
        Attributes clone = attributes.clone();
        assertEquals(attributes, clone);
        assertNotSame(attributes, clone);
        clone.put("key", "different");
        assertNotEquals(attributes, clone);
    }

    @Test
    public void testNormalize() {
        attributes.put("KEY", "value");
        attributes.put("OTHER_KEY", "value2");
        attributes.normalize();
        assertTrue(attributes.hasKey("key"));
        assertTrue(attributes.hasKey("other_key"));
        assertFalse(attributes.hasKey("KEY"));
    }

    @Test
    public void testCheckCapacityGrow() {
        for (int i = 0; i < 10; i++) {
            attributes.put("key" + i, "value" + i);
        }
        assertEquals(10, attributes.size());
        assertEquals("value9", attributes.get("key9"));
    }

    @Test
    public void testGetIgnoreCaseBasic() {
        attributes.put("Key", "value");
        assertEquals("value", attributes.getIgnoreCase("key"));
        assertEquals("value", attributes.getIgnoreCase("KEY"));
        assertEquals("", attributes.getIgnoreCase("nonexistent"));
    }

    @Test
    public void testBooleanAttributeCheck() {
        attributes.put("disabled", true);
        assertTrue(attributes.hasKey("disabled"));
        assertEquals("", attributes.get("disabled"));
        attributes.put("disabled", false);
        assertFalse(attributes.hasKey("disabled"));
    }
}