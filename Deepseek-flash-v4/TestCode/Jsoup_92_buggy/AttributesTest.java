package org.jsoup.nodes;

import org.junit.Test;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import static org.junit.Assert.*;

public class AttributesTest {

    @Test
    public void testInitialSize() {
        assertEquals(0, new Attributes().size());
    }

    @Test
    public void testPutGet() {
        Attributes attrs = new Attributes();
        assertSame(attrs, attrs.put("key", "value"));
        assertEquals("value", attrs.get("key"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testPutOverwrite() {
        Attributes attrs = new Attributes();
        attrs.put("key", "v1");
        attrs.put("key", "v2");
        assertEquals("v2", attrs.get("key"));
        assertEquals(1, attrs.size());
    }

    @Test
    public void testGetMissing() {
        assertEquals("", new Attributes().get("missing"));
    }

    @Test
    public void testPutNullValue() {
        Attributes attrs = new Attributes();
        attrs.put("key", null);
        assertEquals("", attrs.get("key"));
        assertTrue(attrs.hasKey("key"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNullKey() {
        new Attributes().get(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutNullKey() {
        new Attributes().put(null, "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPutNullAttribute() {
        new Attributes().put((Attribute) null);
    }

    @Test
    public void testRemove() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        attrs.remove("key");
        assertFalse(attrs.hasKey("key"));
        assertEquals(0, attrs.size());
        attrs.remove("nonexistent");
    }

    @Test
    public void testRemoveMiddle() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("b", "2");
        attrs.put("c", "3");
        attrs.remove("b");
        assertEquals(2, attrs.size());
        assertEquals("1", attrs.get("a"));
        assertEquals("3", attrs.get("c"));
        assertFalse(attrs.hasKey("b"));
    }

    @Test
    public void testRemoveIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.put("Key", "value");
        attrs.removeIgnoreCase("key");
        assertFalse(attrs.hasKey("Key"));
    }

    @Test
    public void testHasKeyIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.put("Key", "value");
        assertTrue(attrs.hasKeyIgnoreCase("key"));
        assertFalse(attrs.hasKey("key"));
    }

    @Test
    public void testGetIgnoreCase() {
        Attributes attrs = new Attributes();
        attrs.put("KEY", "value");
        assertEquals("value", attrs.getIgnoreCase("key"));
    }

    @Test
    public void testPutBooleanTrueAndFalse() {
        Attributes attrs = new Attributes();
        attrs.put("checked", true);
        assertEquals("", attrs.get("checked"));
        assertTrue(attrs.hasKey("checked"));
        attrs.put("checked", false);
        assertFalse(attrs.hasKey("checked"));
        assertEquals(0, attrs.size());
    }

    @Test
    public void testPutBooleanUpdatesKeyCase() {
        Attributes attrs = new Attributes();
        attrs.put("checked", "true");
        attrs.put("CHECKED", true);
        assertEquals("", attrs.get("CHECKED"));
        assertFalse(attrs.hasKey("checked"));
    }

    @Test
    public void testPutAttribute() {
        Attributes attrs = new Attributes();
        Attribute attr = new Attribute("key", "value");
        attrs.put(attr);
        assertEquals("value", attrs.get("key"));
        assertSame(attrs, attr.parent);
    }

    @Test
    public void testAddAll() {
        Attributes base = new Attributes();
        base.put("a", "1");
        Attributes incoming = new Attributes();
        incoming.put("b", "2");
        base.addAll(incoming);
        assertEquals(2, base.size());
        assertEquals("1", base.get("a"));
        assertEquals("2", base.get("b"));
    }

    @Test
    public void testAddAllEmpty() {
        Attributes base = new Attributes();
        base.put("a", "1");
        base.addAll(new Attributes());
        assertEquals(1, base.size());
    }

    @Test
    public void testManyAttributes() {
        Attributes attrs = new Attributes();
        for (int i = 0; i < 10; i++) {
            attrs.put("key" + i, "val" + i);
        }
        assertEquals(10, attrs.size());
        assertEquals("val9", attrs.get("key9"));
    }

    @Test
    public void testIteratorEmpty() {
        assertFalse(new Attributes().iterator().hasNext());
    }

    @Test
    public void testIteratorAndRemove() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("b", "2");
        Iterator<Attribute> it = attrs.iterator();
        assertTrue(it.hasNext());
        Attribute first = it.next();
        assertEquals("a", first.getKey());
        it.remove();
        assertFalse(attrs.hasKey("a"));
        assertEquals(1, attrs.size());
        assertTrue(it.hasNext());
        assertEquals("b", it.next().getKey());
    }

    @Test
    public void testAsList() {
        Attributes attrs = new Attributes();
        attrs.put("a", "1");
        attrs.put("b", null);
        List<Attribute> list = attrs.asList();
        assertEquals(2, list.size());
        assertEquals("a", list.get(0).getKey());
        assertEquals("b", list.get(1).getKey());
        try {
            list.add(new Attribute("x", "y"));
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // expected
        }
    }

    @Test
    public void testDataset() {
        Attributes attrs = new Attributes();
        attrs.put("data-role", "page");
        attrs.put("normal", "value");
        Map<String, String> data = attrs.dataset();
        assertEquals(1, data.size());
        assertEquals("page", data.get("role"));
        data.put("custom", "x");
        assertEquals("x", attrs.get("data-custom"));
        assertEquals(3, attrs.size());
    }

    @Test
    public void testHtml() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals(" key=\"value\"", attrs.html());
        assertEquals(attrs.html(), attrs.toString());
    }

    @Test
    public void testHtmlBooleanAttribute() {
        Attributes attrs = new Attributes();
        attrs.put("disabled", true);
        assertEquals(" disabled", attrs.html());
    }

    @Test
    public void testEqualsAndHashCode() {
        Attributes a = new Attributes();
        a.put("k", "v");
        Attributes b = new Attributes();
        b.put("k", "v");
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
        b.put("x", "y");
        assertNotEquals(a, b);
    }

    @Test
    public void testClone() {
        Attributes attrs = new Attributes();
        attrs.put("k", "v");
        Attributes clone = attrs.clone();
        assertNotSame(attrs, clone);
        assertEquals(attrs, clone);
        clone.put("k", "changed");
        assertEquals("v", attrs.get("k"));
        assertEquals("changed", clone.get("k"));
    }

    @Test
    public void testNormalize() {
        Attributes attrs = new Attributes();
        attrs.put("KEY", "value");
        attrs.normalize();
        assertEquals("key", attrs.asList().get(0).getKey());
    }
}