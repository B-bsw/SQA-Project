package org.apache.commons.collections;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import static org.junit.Assert.*;

public class ExtendedPropertiesTest {
    private ExtendedProperties props;
    private static final String TEST_PREFIX = "test";

    @Before
    public void setUp() {
        props = new ExtendedProperties();
    }

    @Test
    public void testPutAndGetProperty() {
        props.put("key1", "value1");
        assertEquals("value1", props.getProperty("key1"));
        assertNotNull(props.get("key1"));
        assertEquals(1, props.size());
    }

    @Test
    public void testPutNullValue() {
        props.put("key", null);
        assertNull(props.getProperty("key"));
    }

    @Test
    public void testAddPropertyString() {
        props.addProperty("key", "value");
        assertEquals("value", props.getProperty("key"));
    }

    @Test
    public void testAddPropertyMultipleValues() {
        props.addProperty("key", "value1,value2,value3");
        List values = props.getList("key");
        assertNotNull(values);
        assertEquals(3, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value3", values.get(2));
    }

    @Test
    public void testAddPropertyWithListValue() {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        list.add("one");
        list.add("two");
        props.addProperty("key", list);
        List result = props.getList("key");
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    public void testGetPropertyWithDefaults() {
        props.put("key", "value");
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.put("key", "default");
        props.setDefaults(defaults);
        assertEquals("value", props.getProperty("key"));
    }

    @Test
    public void testGetPropertyFromDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.put("key", "default");
        props.setDefaults(defaults);
        assertEquals("default", props.getProperty("key"));
    }

    @Test
    public void testContainsKey() {
        props.put("key", "value");
        assertTrue(props.containsKey("key"));
        assertFalse(props.containsKey("nonexistent"));
    }

    @Test
    public void testGetKeys() {
        props.put("key1", "value1");
        props.put("key2", "value2");
        props.put("key3", "value3");
        java.util.Iterator it = props.getKeys();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(3, count);
    }

    @Test
    public void testGetKeysEmpty() {
        java.util.Iterator it = props.getKeys();
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetKeysWithPrefix() {
        props.put("prefix.key1", "value1");
        props.put("prefix.key2", "value2");
        props.put("other.key3", "value3");
        java.util.Iterator it = props.getKeys("prefix");
        int count = 0;
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testSubset() {
        props.put("prefix.key1", "value1");
        props.put("prefix.key2", "value2");
        ExtendedProperties subset = props.subset("prefix");
        assertNotNull(subset);
        assertEquals(2, subset.size());
        assertEquals("value1", subset.getProperty("key1"));
        assertEquals("value2", subset.getProperty("key2"));
    }

    @Test
    public void testGetBoolean() {
        assertEquals(Boolean.TRUE, props.getBoolean("true-key", Boolean.TRUE));
        props.put("bool1", "true");
        assertEquals(Boolean.TRUE, props.getBoolean("bool1", Boolean.FALSE));
        props.put("bool2", "false");
        assertEquals(Boolean.FALSE, props.getBoolean("bool2", Boolean.TRUE));
    }

    @Test
    public void testGetBooleanPrimitive() {
        props.put("flag", "true");
        assertTrue(props.getBoolean("flag"));
        assertFalse(props.getBoolean("nonexistent"));
        assertFalse(props.getBoolean("nonexistent", false));
    }

    @Test
    public void testGetByte() {
        props.put("byte-key", "10");
        assertEquals((byte) 10, props.getByte("byte-key"));
        assertEquals((byte) 5, props.getByte("default-key", (byte) 5));
    }

    @Test
    public void testGetByteWithDefault() {
        byte def = 10;
        assertEquals(def, props.getByte("nonexistent", def));
        props.put("key", "42");
        assertEquals((byte) 42, props.getByte("key", def));
    }

    @Test
    public void testGetShort() {
        props.put("short-key", "100");
        assertEquals((short) 100, props.getShort("short-key"));
        assertEquals((short) 7, props.getShort("default-key", (short) 7));
    }

    @Test
    public void testGetInt() {
        props.put("int-key", "42");
        assertEquals(42, props.getInt("int-key"));
        assertEquals(0, props.getInt("missing-key"));
        assertEquals(0, props.getInt("missing-key", 0));
    }

    @Test
    public void testGetInteger() {
        props.put("int-key", "42");
        assertEquals(Integer.valueOf(42), props.getInteger("int-key"));
        assertEquals(Integer.valueOf(10), props.getInteger("missing-key", 10));
    }

    @Test
    public void testGetLong() {
        props.put("long-key", "1000000");
        assertEquals(1000000L, props.getLong("long-key"));
        assertEquals(999L, props.getLong("missing-key", 999L));
    }

    @Test
    public void testGetFloat() {
        props.put("float-key", "3.14");
        assertEquals(3.14f, props.getFloat("float-key"), 0.001f);
        assertEquals(1.0f, props.getFloat("missing", 1.0f), 0.001f);
    }

    @Test
    public void testGetDouble() {
        props.put("double-key", "2.718");
        assertEquals(2.718, props.getDouble("double-key"), 0.001);
        assertEquals(1.5, props.getDouble("missing", 1.5), 0.001);
    }

    @Test
    public void testGetList() {
        props.put("list", "a,b,c");
        List<String> result = props.getList("list");
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("a", result.get(0));
        assertEquals("c", result.get(2));
    }

    @Test
    public void testGetListWithDefault() {
        java.util.ArrayList<String> defaults = new java.util.ArrayList<>();
        defaults.add("x");
        List<String> result = props.getList("nonexistent", defaults);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("x", result.get(0));
    }

    @Test
    public void testGetVector() {
        props.put("vec", "1,2,3");
        Vector result = props.getVector("vec");
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("1", result.get(0));
        assertEquals("3", result.get(2));
    }

    @Test
    public void testGetVectorWithDefault() {
        Vector defaults = new Vector();
        defaults.add("x");
        Vector result = props.getVector("nonexistent", defaults);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("x", result.get(0));
    }

    @Test
    public void testGetStringArray() {
        props.put("arr", "one,two,three");
        String[] result = props.getStringArray("arr");
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals("one", result[0]);
        assertEquals("three", result[2]);
    }

    @Test
    public void testClearProperty() {
        props.put("key", "value");
        props.clearProperty("key");
        assertFalse(props.containsKey("key"));
    }

    @Test
    public void testClearPropertyWithList() {
        props.addProperty("key", "one,two");
        props.clearProperty("key");
        assertFalse(props.containsKey("key"));
    }

    @Test
    public void testClearNonexistentProperty() {
        props.clearProperty("nonexistent");
        assertFalse(props.containsKey("nonexistent"));
    }

    @Test
    public void testRemoveProperty() {
        props.put("key", "value");
        Object removed = props.remove("key");
        assertEquals("value", removed);
        assertFalse(props.containsKey("key"));
    }

    @Test
    public void testCombine() {
        ExtendedProperties other = new ExtendedProperties();
        other.put("key1", "value1");
        other.put("key2", "value2");
        props.combine(other);
        assertTrue(props.containsKey("key1"));
        assertTrue(props.containsKey("key2"));
        assertEquals("value1", props.getProperty("key1"));
    }

    @Test
    public void testSaveWithList() throws IOException {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        props.addProperty("key", "value1,value2");
        props.save(out, "test");
        String result = out.toString("8859_1");
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testLoadFromInputStream() throws IOException {
        String content = "key1=value1\nkey2=value2\n";
        InputStream is = new ByteArrayInputStream(content.getBytes(StandardCharsets.ISO_8859_1));
        props.load(is);
        assertEquals("value1", props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
    }

    @Test
    public void testLoadWithCommentsAndBlanks() throws IOException {
        String content = "# comment\n\nkey1=value1\n\n# another\nkey2=value2\n";
        InputStream is = new ByteArrayInputStream(content.getBytes(StandardCharsets.ISO_8859_1));
        props.load(is);
        assertEquals(2, props.size());
        assertNotNull(props.getProperty("key1"));
        assertNotNull(props.getProperty("key2"));
    }

    @Test
    public void testLoadWithUnicode() throws UnsupportedEncodingException, IOException {
        String content = "key=\u00e9\u00e8\u00ea";
        props = new ExtendedProperties();
        props.load(new java.io.ByteArrayInputStream(content.getBytes(StandardCharsets.ISO_8859_1)), "8859_1");
        assertEquals("\u00e9\u00e8\u00ea", props.getProperty("key"));
    }

    @Test
    public void testLoadWithListValue() throws IOException {
        String content = "key=value1,value2,value3\n";
        props = new ExtendedProperties();
        props.load(new java.io.ByteArrayInputStream(content.getBytes(StandardCharsets.ISO_8859_1)));
        List<String> list = props.getList("key");
        assertNotNull(list);
        assertEquals(3, list.size());
    }

    @Test
    public void testIsInitializedFalse() {
        ExtendedProperties p = new ExtendedProperties();
        assertFalse(p.isInitialized());
    }

    @Test
    public void testToStringArrayWithList() {
        props.put("key", java.util.Arrays.asList("a", "b"));
        String[] arr = props.getStringArray("key");
        assertNotNull(arr);
        assertEquals(2, arr.length);
    }

    @Test
    public void testGetWithInterpolation() {
        props.put("a", "value");
        props.put("b", "${a}-suffix");
        assertEquals("value-suffix", props.getProperty("b"));
    }

    @Test
    public void testGetWithInterpolationAndDefaults() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.put("x", "default");
        props.setDefaults(defaults);
        assertEquals("default", props.getProperty("x"));
    }

    @Test
    public void testConvertProperties() {
        Properties p = new Properties();
        p.put("key1", "value1");
        p.put("key2", "value2");
        ExtendedProperties result = ExtendedProperties.convertProperties(p);
        assertNotNull(result);
        assertEquals("value1", result.getProperty("key1"));
        assertEquals(2, result.size());
    }
}