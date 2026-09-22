package org.apache.commons.collections;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Vector;

public class ExtendedPropertiesTest {
    private ExtendedProperties props;

    @Before
    public void setUp() {
        props = new ExtendedProperties();
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(props);
        assertFalse(props.isInitialized());
        assertTrue(props.isEmpty());
    }

    @Test
    public void testLoadAndGetProperty() throws IOException {
        String content = "key1=value1\nkey2=value2\n";
        InputStream is = new ByteArrayInputStream(content.getBytes());
        props.load(is);
        assertEquals("value1", props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
    }

    @Test
    public void testLoadWithCommentAndEmptyLines() throws IOException {
        String content = "# comment\n\nkey1=value1\n\n";
        props.load(new ByteArrayInputStream(content.getBytes()));
        assertEquals("value1", props.getProperty("key1"));
    }

    @Test(expected = IOException.class)
    public void testLoadNullInput() throws IOException {
        props.load((InputStream) null);
    }

    @Test
    public void testAddPropertyAndGetString() {
        props.addProperty("key", "value");
        assertEquals("value", props.getString("key"));
    }

    @Test
    public void testGetStringWithDefault() {
        assertEquals("default", props.getString("missing", "default"));
        props.addProperty("key", "value");
        assertEquals("value", props.getString("key", "default"));
    }

    @Test
    public void testGetBoolean() {
        props.addProperty("t", "true");
        props.addProperty("f", "false");
        assertEquals(true, props.getBoolean("t"));
        assertEquals(false, props.getBoolean("f"));
        assertEquals(true, props.getBoolean("missing", true));
        assertEquals(false, props.getBoolean("missing", false));
    }

    @Test
    public void testGetBooleanWithDefault() {
        props.addProperty("y", "yes");
        props.addProperty("n", "no");
        assertEquals(true, props.getBoolean("y", false));
        assertEquals(false, props.getBoolean("n", true));
    }

    @Test
    public void testGetByte() {
        props.addProperty("b", "10");
        assertEquals((byte) 10, props.getByte("b"));
        assertEquals((byte) 20, props.getByte("b", (byte) 20));
        assertEquals((byte) 10, props.getByte("b", (byte) 20));
        assertEquals((byte) 15, props.getByte("missing", (byte) 15));
    }

    @Test
    public void testGetShort() {
        props.addProperty("s", "100");
        assertEquals((short) 100, props.getShort("s"));
        assertEquals((short) 100, props.getShort("s", (short) 200));
        assertEquals((short) 200, props.getShort("missing", (short) 200));
    }

    @Test
    public void testGetInt() {
        props.addProperty("i", "42");
        assertEquals(42, props.getInt("i"));
        assertEquals(42, props.getInt("i", 100));
        assertEquals(100, props.getInt("missing", 100));
    }

    @Test
    public void testGetIntegerWithDefault() {
        props.addProperty("i", "42");
        assertEquals(new Integer(42), props.getInteger("i", new Integer(100)));
        assertEquals(new Integer(100), props.getInteger("missing", new Integer(100)));
    }

    @Test
    public void testGetLong() {
        props.addProperty("l", "123456789");
        assertEquals(123456789L, props.getLong("l"));
        assertEquals(123456789L, props.getLong("l", 999L));
        assertEquals(999L, props.getLong("missing", 999L));
    }

    @Test
    public void testGetFloat() {
        props.addProperty("f", "1.5");
        assertEquals(1.5f, props.getFloat("f"), 0.001f);
        assertEquals(1.5f, props.getFloat("f", 2.5f), 0.001f);
        assertEquals(2.5f, props.getFloat("missing", 2.5f), 0.001f);
    }

    @Test
    public void testGetDouble() {
        props.addProperty("d", "3.14");
        assertEquals(3.14, props.getDouble("d"), 0.001);
        assertEquals(3.14, props.getDouble("d", 2.71), 0.001);
        assertEquals(2.71, props.getDouble("missing", 2.71), 0.001);
    }

    @Test
    public void testGetVector() {
        props.addProperty("v", "a,b,c");
        Vector<String> vec = props.getVector("v");
        assertEquals(3, vec.size());
        assertEquals("a", vec.get(0));
        assertEquals("b", vec.get(1));
        assertEquals("c", vec.get(2));
    }

    @Test
    public void testGetList() {
        props.addProperty("l", "x,y,z");
        List<String> list = props.getList("l");
        assertEquals(3, list.size());
        assertEquals("x", list.get(0));
    }

    @Test
    public void testGetStringArray() {
        props.addProperty("a", "1,2,3");
        String[] arr = props.getStringArray("a");
        assertEquals(3, arr.length);
        assertEquals("1", arr[0]);
        assertEquals("3", arr[2]);
    }

    @Test
    public void testGetKeys() {
        props.addProperty("a", "1");
        props.addProperty("b", "2");
        props.addProperty("c", "3");
        Iterator<String> keys = props.getKeys();
        assertTrue(keys.hasNext());
        assertEquals("a", keys.next());
        assertEquals("b", keys.next());
        assertEquals("c", keys.next());
        assertFalse(keys.hasNext());
    }

    @Test
    public void testGetKeysWithPrefix() {
        props.addProperty("test.a", "1");
        props.addProperty("test.b", "2");
        props.addProperty("other.c", "3");
        Iterator<String> keys = props.getKeys("test");
        assertTrue(keys.hasNext());
        assertEquals("test.a", keys.next());
        assertEquals("test.b", keys.next());
        assertFalse(keys.hasNext());
    }

    @Test
    public void testSubset() {
        props.addProperty("a.x", "1");
        props.addProperty("a.y", "2");
        props.addProperty("b.z", "3");
        ExtendedProperties subset = props.subset("a");
        assertNotNull(subset);
        assertEquals("1", subset.getString("x"));
        assertEquals("2", subset.getString("y"));
        assertNull(subset.getString("z"));
    }

    @Test
    public void testSubsetInvalidPrefix() {
        props.addProperty("a.x", "1");
        ExtendedProperties subset = props.subset("nonexistent");
        assertNull(subset);
    }

    @Test
    public void testClearProperty() {
        props.addProperty("key", "value");
        assertNotNull(props.getProperty("key"));
        props.clearProperty("key");
        assertNull(props.getProperty("key"));
    }

    @Test
    public void testClearMissingProperty() {
        props.clearProperty("missing");
        assertTrue(props.isEmpty());
    }

    @Test
    public void testIsInitializedAfterFileAsString() throws IOException {
        String content = "a=1\n";
        ExtendedProperties props2 = new ExtendedProperties();
        props2.load(new ByteArrayInputStream(content.getBytes()));
        assertTrue(props2.isInitialized());
    }

    @Test
    public void testCombine() {
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("newKey", "newValue");
        props.addProperty("oldKey", "oldValue");
        props.combine(other);
        assertEquals("oldValue", props.getString("oldKey"));
        assertEquals("newValue", props.getString("newKey"));
    }

    @Test
    public void testConvertProperties() {
        java.util.Properties p = new java.util.Properties();
        p.setProperty("k", "v");
        ExtendedProperties ext = ExtendedProperties.convertProperties(p);
        assertEquals("v", ext.getString("k"));
    }

    @Test
    public void testSetPropertyAndGetString() {
        props.setProperty("key", "value");
        assertEquals("value", props.getString("key"));
        props.setProperty("key2", "value2");
        assertEquals("value2", props.getString("key2"));
    }

    @Test
    public void testEscapeAndUnescapeInValues() {
        props.addProperty("comma", "a,b");
        assertEquals("a,b", props.getString("comma"));
        props.addProperty("backslash", "a\\b");
        assertEquals("a\\b", props.getString("backslash"));
    }

    @Test
    public void testGetStringWithListValue() {
        Vector<String> vec = new Vector<>();
        vec.add("first");
        props.addProperty("key", vec);
        assertEquals("first", props.getString("key"));
    }

    @Test
    public void testGetBooleanWithNonStringValue() {
        props.put("boolKey", Boolean.TRUE);
        assertEquals(Boolean.TRUE, props.getBoolean("boolKey", Boolean.FALSE));
    }

    @Test
    public void testGetIntegerWithIntegerValue() {
        props.put("intKey", new Integer(5));
        assertEquals(new Integer(5), props.getInteger("intKey", new Integer(0)));
    }

    @Test
    public void testGetLongWithLongValue() {
        props.put("longKey", new Long(500L));
        assertEquals(new Long(500L), props.getLong("longKey", new Long(0)));
    }

    @Test
    public void testGetFloatWithFloatValue() {
        props.put("floatKey", new Float(1.5f));
        assertEquals(new Float(1.5f), props.getFloat("floatKey", new Float(0)));
    }

    @Test
    public void testGetDoubleWithDoubleValue() {
        props.put("doubleKey", new Double(2.5));
        assertEquals(new Double(2.5), props.getDouble("doubleKey", new Double(0)));
    }
}