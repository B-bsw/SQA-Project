package org.apache.commons.collections;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class ExtendedPropertiesTest {
    private ExtendedProperties props;
    private static final String TEST_FILE = "test.properties";
    private static final String TEST_FILE_ENCODED = "test_encoded.properties";
    private static final String TEST_FILE_DEFAULT = "test_default.properties";

    @Before
    public void setUp() throws IOException {
        props = new ExtendedProperties();
        writeTestFile(TEST_FILE);
        writeEncodedFile(TEST_FILE_ENCODED);
        writeDefaultFile(TEST_FILE_DEFAULT);
    }

    @After
    public void tearDown() {
        new File(TEST_FILE).delete();
        new File(TEST_FILE_ENCODED).delete();
        new File(TEST_FILE_DEFAULT).delete();
    }

    private void writeTestFile(String filename) throws IOException {
        try (PrintWriter out = new PrintWriter(new FileWriter(filename))) {
            out.println("string.key=hello");
            out.println("int.key=42");
            out.println("long.key=123456789L");
            out.println("float.key=3.14f");
            out.println("double.key=2.71828");
            out.println("bool.key=true");
            out.println("list.key=one,two,three");
            out.println("list.escaped=one\\,two");
            out.println("string.cont=first\\");
            out.println("  second");
            out.println("include=inc");
            out.println("empty.key=");
            out.println("# comment");
        }
    }

    private void writeEncodedFile(String filename) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filename);
             PrintWriter out = new PrintWriter(new OutputStreamWriter(fos, "UTF-8"))) {
            out.println("unicode.key=\u00e9\u00e8");
        }
    }

    private void writeDefaultFile(String filename) throws IOException {
        try (PrintWriter out = new PrintWriter(new FileWriter(filename))) {
            out.println("default.string=default_value");
            out.println("default.int=99");
            out.println("default.bool=false");
        }
    }

    @Test
    public void testDefaultConstructor() {
        assertNotNull(props);
        assertFalse(props.isInitialized());
        assertNull(props.file);
        assertNull(props.basePath);
        assertNull(props.defaults);
        assertTrue(props.keysAsListed.isEmpty());
    }

    @Test
    public void testConstructorWithFile() throws IOException {
        ExtendedProperties p = new ExtendedProperties(TEST_FILE);
        assertTrue(p.isInitialized());
        assertNotNull(p.get("string.key"));
    }

    @Test(expected = IOException.class)
    public void testConstructorWithNonExistentFile() throws IOException {
        new ExtendedProperties("nonexistent_file_xyz.properties");
    }

    @Test
    public void testConstructorWithFileAndDefault() throws IOException {
        ExtendedProperties p = new ExtendedProperties(TEST_FILE, TEST_FILE_DEFAULT);
        assertTrue(p.isInitialized());
        assertEquals("hello", p.getString("string.key"));
        assertEquals("default_value", p.getString("default.string"));
    }

    @Test
    public void testGetString() {
        assertEquals("hello", props.getString("string.key"));
    }

    @Test
    public void testGetStringWithDefault() {
        assertEquals("default", props.getString("nonexistent", "default"));
    }
    
    @Test
    public void testGetStringNullDefault() {
        assertNull(props.getString("nonexistent"));
    }

    @Test
    public void testGetStringFromDefault() {
        props.setProperty("test.key", "value");
        ExtendedProperties defs = new ExtendedProperties();
        defs.setProperty("fallback", "fb");
        props.defaults = defs;
        assertEquals("fb", props.getString("fallback"));
    }

    @Test
    public void testGetInt() throws IOException {
        props.load(new FileInputStream(TEST_FILE));
        assertEquals(42, props.getInt("int.key"));
    }
    
    @Test
    public void testGetIntDefaultValue() {
        assertEquals(42, props.getInt("int.key", 100));
        assertEquals(100, props.getInt("missing", 100));
    }
    
    @Test(expected = NumberFormatException.class)
    public void testGetIntOnString() {
        props.setProperty("bad", "notAnInt");
        props.getInt("bad");
    }

    @Test
    public void testGetIntegerObject() {
        props.setProperty("int.key", "42");
        assertEquals(Integer.valueOf(42), props.getInteger("int.key"));
        assertNull(props.getInteger("missing"));
        assertEquals(Integer.valueOf(7), props.getInteger("missing", 7));
        props.setProperty("wrapped", 10);
        assertEquals(Integer.valueOf(10), props.getInteger("wrapped"));
    }

    @Test
    public void testGetLong() throws IOException {
        props.load(new FileInputStream(TEST_FILE));
        assertEquals(123456789L, props.getLong("long.key"));
        assertEquals(99L, props.getLong("missing", 99L));
    }

    @Test
    public void testGetLongObject() {
        props.setProperty("long.key", "777L");
        assertEquals(Long.valueOf(777L), props.getLong("long.key", Long.valueOf(1L)));
        props.setProperty("long2", 888L);
        assertEquals(Long.valueOf(888L), props.getLong("long2"));
        assertEquals(Long.valueOf(5L), props.getLong("missing", Long.valueOf(5L)));
    }

    @Test
    public void testGetFloat() throws IOException {
        props.load(new FileInputStream(TEST_FILE));
        assertEquals(3.14f, props.getFloat("float.key"), 0.001f);
        assertEquals(2.5f, props.getFloat("missing", 2.5f), 0.001f);
    }

    @Test
    public void testGetFloatObject() {
        props.setProperty("float.key", "2.5f");
        assertEquals(Float.valueOf(2.5f), props.getFloat("float.key", Float.valueOf(1f)));
        props.setProperty("float2", 1.75f);
        assertEquals(Float.valueOf(1.75f), props.getFloat("float2"));
        assertNull(props.getFloat("missing"));
    }

    @Test
    public void testGetDouble() throws IOException {
        props.load(new FileInputStream(TEST_FILE));
        assertEquals(2.71828, props.getDouble("double.key"), 0.0001);
        assertEquals(3.14, props.getDouble("missing", 3.14), 0.001);
    }

    @Test
    public void testGetDoubleObject() {
        props.setProperty("double.key", "1.23");
        assertEquals(Double.valueOf(1.23), props.getDouble("double.key", Double.valueOf(5.0)));
        props.setProperty("double2", 4.56);
        assertEquals(Double.valueOf(4.56), props.getDouble("double2"));
        assertNull(props.getDouble("missing"));
    }

    @Test
    public void testGetBoolean() {
        props.setProperty("bool.true", "on");
        props.setProperty("bool.false", "off");
        assertTrue(props.getBoolean("bool.true"));
        assertFalse(props.getBoolean("bool.false"));
        assertTrue(props.getBoolean("bool.missing", true));
        assertFalse(props.getBoolean("bool.missing2", false));
    }

    @Test
    public void testGetBooleanObject() throws IOException {
        props.load(new FileInputStream(TEST_FILE));
        assertEquals(Boolean.TRUE, props.getBoolean("bool.key"));
        assertEquals(Boolean.FALSE, props.getBoolean("missing", false));
        props.setProperty("bool.yes", true);
        assertEquals(Boolean.TRUE, props.getBoolean("bool.yes"));
    }

    @Test
    public void testTestBoolean() {
        assertEquals("true", props.testBoolean("true"));
        assertEquals("true", props.testBoolean("YES"));
        assertEquals("false", props.testBoolean("no"));
        assertEquals("false", props.testBoolean("Off"));
        assertNull(props.testBoolean("invalid"));
        assertNull(props.testBoolean(null));
    }

    @Test
    public void testGetStringArray() {
        props.setProperty("list.key", "a,b,c");
        String[] result = props.getStringArray("list.key");
        assertArrayEquals(new String[]{"a", "b", "c"}, result);
        
        props.setProperty("single", "solo");
        assertArrayEquals(new String[]{"solo"}, props.getStringArray("single"));
        
        assertNull(props.getStringArray("missing"));
    }

    @Test(expected = ClassCastException.class)
    public void testGetStringArrayWithList() {
        props.setProperty("list", new ArrayList<String>(Arrays.asList("a", "b")));
        String[] result = props.getStringArray("list");
        assertArrayEquals(new String[]{"a", "b"}, result);
    }

    @Test
    public void testGetVector() {
        props.setProperty("list.key", "x,y,z");
        Vector<String> v = props.getVector("list.key");
        assertEquals(3, v.size());
        assertTrue(v.contains("x"));
        assertTrue(v.contains("y"));
        assertTrue(v.contains("z"));
        
        Vector<String> dv = new Vector<>(Arrays.asList("default"));
        assertEquals(dv, props.getVector("missing", dv));
        assertNull(props.getVector("missing"));
    }

    @Test
    public void testGetVectorWithListValue() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b"));
        props.setProperty("list", list);
        Vector<String> v = props.getVector("list");
        assertEquals(list, v);
    }

    @Test
    public void testGetList() {
        props.setProperty("list.key", "a,b,c");
        List<String> result = props.getList("list.key");
        assertEquals(3, result.size());
        
        List<String> defaultList = new ArrayList<>(Arrays.asList("default"));
        assertEquals(defaultList, props.getList("missing", defaultList));
        assertNull(props.getList("missing"));
    }

    @Test
    public void testAddPropertySimple() {
        props.addProperty("key1", "value1");
        assertEquals("value1", props.get("key1"));
        props.addProperty("key2", 100);
        assertEquals(100, props.get("key2"));
    }

    @Test
    public void testAddPropertyList() {
        props.addProperty("key", "a,b,c");
        props.addProperty("key", "d");
        List<String> list = (List<String>) props.get("key");
        assertEquals(Arrays.asList("a", "b", "c", "d"), list);
    }

    @Test
    public void testAddPropertyListWithEscapedCommas() {
        props.addProperty("key", "a\\,b,c");
        List<String> list = (List<String>) props.get("key");
        assertEquals(Arrays.asList("a,b", "c"), list);
    }

    @Test
    public void testSetPropertyOverride() {
        props.setProperty("key", "value1");
        props.setProperty("key", "value2");
        assertEquals("value2", props.get("key"));
    }

    @Test
    public void testClearProperty() {
        props.setProperty("key1", "value1");
        props.setProperty("key2", "value2");
        props.clearProperty("key1");
        assertNull(props.get("key1"));
        assertEquals("value2", props.get("key2"));
        props.clearProperty("missing"); // no exception
    }

    @Test
    public void testGetKeys() {
        props.setProperty("key1", "v1");
        props.setProperty("key2", "v2");
        Iterator<String> it = props.getKeys();
        List<String> keys = new ArrayList<>();
        while (it.hasNext()) {
            keys.add(it.next());
        }
        assertEquals(Arrays.asList("key1", "key2"), keys);
    }

    @Test
    public void testGetKeysWithPrefix() {
        props.setProperty("prefix.key1", "v1");
        props.setProperty("prefix.key2", "v2");
        props.setProperty("other", "v3");
        
        Iterator<String> it = props.getKeys("prefix");
        List<String> keys = new ArrayList<>();
        while (it.hasNext()) {
            keys.add(it.next());
        }
        assertEquals(2, keys.size());
        assertTrue(keys.contains("prefix.key1"));
        assertTrue(keys.contains("prefix.key2"));
    }

    @Test
    public void testSubset() {
        props.setProperty("sub.key1", "v1");
        props.setProperty("sub.key2", "v2");
        props.setProperty("sub", "direct");
        props.setProperty("other", "v3");
        
        ExtendedProperties subset = props.subset("sub");
        assertNotNull(subset);
        assertEquals("v1", subset.get("key1"));
        assertEquals("v2", subset.get("key2"));
        assertEquals("direct", subset.get(""));
    }

    @Test
    public void testSubsetInvalid() {
        props.setProperty("sub.key1", "v1");
        assertNull(props.subset("invalid"));
    }

    @Test
    public void testGetProperties() throws IOException {
        props.load(new FileInputStream(TEST_FILE));
        props.setProperty("user.name", "bob");
        props.setProperty("user.age", "30");
        
        Properties result = props.getProperties("user.");
        assertNotNull(result);
        assertEquals("bob", result.getProperty("name"));
        assertEquals("30", result.getProperty("age"));
    }

    @Test
    public void testGetPropertiesDefault() {
        Properties defaultProps = new Properties();
        defaultProps.setProperty("name", "default");
        Properties result = props.getProperties("missing.", defaultProps);
        assertEquals(defaultProps, result);
        
        result = props.getProperties("missing.");
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCombine() throws IOException {
        ExtendedProperties other = new ExtendedProperties();
        other.setProperty("new.key", "value");
        other.setProperty("string.key", "overridden");
        
        props.load(new FileInputStream(TEST_FILE));
        props.combine(other);
        assertEquals("overridden", props.getString("string.key"));
        assertEquals("value", props.getString("new.key"));
    }

    @Test
    public void testCombineWithDefaults() {
        ExtendedProperties other = new ExtendedProperties();
        other.setProperty("key", "value");
        ExtendedProperties defaultsInOther = new ExtendedProperties();
        defaultsInOther.setProperty("def.key", "defVal");
        other.defaults = defaultsInOther;
        
        props.combine(other);
        assertEquals("value", props.getString("key"));
    }

    @Test
    public void testConvertProperties() {
        Properties original = new Properties();
        original.setProperty("key", "value");
        original.setProperty("list", "a,b,c");
        
        ExtendedProperties result = ExtendedProperties.convertProperties(original);
        assertEquals("value", result.getString("key"));
        assertEquals("a,b,c", result.getString("list"));
    }

    @Test
    public void testPut() {
        Object old = props.put("key", "value");
        assertNull(old);
        assertEquals("value", props.get("key"));
        
        old = props.put("key", "newValue");
        assertEquals("value", old);
        assertEquals("newValue", props.get("key"));
    }

    @Test
    public void testPutAll() {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "v1");
        map.put("key2", "v2");
        
        props.putAll(map);
        assertEquals("v1", props.get("key1"));
        assertEquals("v2", props.get("key2"));
    }

    @Test
    public void testPutAllWithExtendedProperties() {
        ExtendedProperties other = new ExtendedProperties();
        other.setProperty("key1", "v1");
        other.setProperty("key2", "v2");
        
        props.putAll(other);
        assertEquals("v1", props.get("key1"));
        assertEquals("v2", props.get("key2"));
    }

    @Test
    public void testRemove() {
        props.setProperty("key", "value");
        Object removed = props.remove("key");
        assertEquals("value", removed);
        assertNull(props.get("key"));
        
        assertNull(props.remove("missing"));
    }

    @Test
    public void testGetInclude() {
        assertEquals("include", props.getInclude());
        props.setInclude("custom");
        assertEquals("custom", props.getInclude());
        props.setInclude("");
        assertEquals("", props.getInclude());
    }

    @Test
    public void testSetIncludeNull() {
        props.setInclude(null);
        assertNull(props.includePropertyName);
        assertEquals("include", props.getInclude());
    }

    @Test
    public void testSave() throws IOException {
        props.setProperty("key1", "value1");
        props.setProperty("key2", "value2");
        props.setProperty("list", "a,b,c");
        
        File temp = File.createTempFile("test", ".properties");
        try (FileOutputStream fos = new FileOutputStream(temp)) {
            props.save(fos, "Test Header");
        }
        
        ExtendedProperties loaded = new ExtendedProperties();
        try (FileInputStream fis = new FileInputStream(temp)) {
            loaded.load(fis);
        }
        assertEquals("value1", loaded.getString("key1"));
        assertEquals("value2", loaded.getString("key2"));
        assertEquals("a,b,c", loaded.getString("list"));
        temp.delete();
    }

    @Test(expected = IOException.class)
    public void testSaveNullOutput() throws IOException {
        props.save(null, "header");
    }

    @Test
    public void testLoadWithEncoding() throws IOException {
        ExtendedProperties p = new ExtendedProperties();
        try (FileInputStream fis = new FileInputStream(TEST_FILE_ENCODED)) {
            p.load(fis, "UTF-8");
        }
        assertEquals("\u00e9\u00e8", p.getString("unicode.key"));
    }

    @Test
    public void testLoadWithUnsupportedEncoding() throws IOException {
        ExtendedProperties p = new ExtendedProperties();
        try (FileInputStream fis = new FileInputStream(TEST_FILE)) {
            p.load(fis, "invalid_encoding");
        }
        assertEquals("hello", p.getString("string.key"));
    }

    @Test
    public void testLoadWithEmptyLine() throws IOException {
        File f = File.createTempFile("test_empty", ".properties");
        try (PrintWriter out = new PrintWriter(new FileWriter(f))) {
            out.println("");
            out.println("key=value");
        }
        ExtendedProperties p = new ExtendedProperties();
        try (FileInputStream fis = new FileInputStream(f)) {
            p.load(fis);
        }
        assertEquals("value", p.getString("key"));
        f.delete();
    }

    @Test
    public void testLoadWithEscapedContinuation() throws IOException {
        File f = File.createTempFile("test_cont", ".properties");
        try (PrintWriter out = new PrintWriter(new FileWriter(f))) {
            out.println("key=line1\\");
            out.println("line2");
        }
        ExtendedProperties p = new ExtendedProperties();
        try (FileInputStream fis = new FileInputStream(f)) {
            p.load(fis);
        }
        assertEquals("line1line2", p.getString("key"));
        f.delete();
    }

    @Test
    public void testGetPropertyFromDefault() {
        props.setProperty("custom", "customValue");
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("defaultKey", "defaultValue");
        props.defaults = defaults;
        
        assertEquals("customValue", props.getProperty("custom"));
        assertEquals("defaultValue", props.getProperty("defaultKey"));
        assertNull(props.getProperty("missing"));
    }

    @Test
    public void testGetPropertyDirectContainment() {
        props.setProperty("key", "value");
        assertEquals("value", props.getProperty("key"));
    }

    @Test
    public void testIsInitialized() {
        assertFalse(props.isInitialized());
        try {
            props.load(new FileInputStream(TEST_FILE));
            assertTrue(props.isInitialized());
        } catch (IOException e) {
            fail("Should not throw IOException");
        }
    }

    @Test
    public void testGetByte() {
        props.setProperty("byte.key", "65");
        assertEquals((byte) 65, props.getByte("byte.key"));
        assertEquals((byte) 65, props.getByte("missing", (byte) 65));
        assertEquals(Byte.valueOf((byte) 65), props.getByte("missing", new Byte((byte) 65)));
    }

    @Test
    public void testGetShort() throws IOException {
        props.load(new FileInputStream(TEST_FILE));
        props.setProperty("short.key", "123");
        assertEquals((short) 123, props.getShort("short.key"));
        props.setProperty("short2", Short.valueOf((short) 42));
        assertEquals((short) 42, props.getShort("short2"));
        assertEquals((short) 7, props.getShort("missing", (short) 7));
    }

    @Test
    public void testGetShortObject() {
        props.setProperty("short.key", "123");
        assertEquals(Short.valueOf((short) 123), props.getShort("short.key", Short.valueOf((short) 1)));
        props.setProperty("short2", Short.valueOf((short) 42));
        assertEquals(Short.valueOf((short) 42), props.getShort("short2"));
        assertEquals(Short.valueOf((short) 7), props.getShort("missing", Short.valueOf((short) 7)));
    }

    @Test
    public void testGetIntegerWithDefault() {
        props.setProperty("int.key", "42");
        assertEquals(42, props.getInteger("int.key", 1));
        props.setProperty("neg", "-1");
        assertEquals(-1, props.getInteger("neg", 0));
        assertEquals(100, props.getInteger("missing", 100));
    }

    @Test
    public void testGetLongWithDefault() {
        props.setProperty("long.key", "42");
        assertEquals(42L, props.getLong("long.key", 1L));
        assertEquals(42L, props.getLong("long.key", Long.valueOf(1L)));
        assertEquals(100L, props.getLong("missing", 100L));
    }

    @Test
    public void testGetFloatWithDefault() {
        props.setProperty("float.key", "3.14f");
        assertEquals(3.14f, props.getFloat("float.key", 1.0f), 0.01f);
        props.setProperty("float2", Float.valueOf(2.5f));
        assertEquals(2.5f, props.getFloat("float2", 1.0f), 0.01f);
        assertEquals(1.0f, props.getFloat("missing", 1.0f), 0.01f);
    }

    @Test
    public void testGetDoubleWithDefault() {
        props.setProperty("double.key", "2.5");
        assertEquals(2.5, props.getDouble("double.key", 1.0), 0.01);
        props.setProperty("double2", Double.valueOf(3.5));
        assertEquals(3.5, props.getDouble("double2", 1.0), 0.01);
        assertEquals(1.0, props.getDouble("missing", 1.0), 0.01);
    }

    @Test
    public void testGetPropertiesWithDefaults() {
        props.setProperty("user.name", "bob");
        props.setProperty("user.age", "30");
        
        Properties defaults = new Properties();
        defaults.setProperty("user.country", "US");
        Properties result = props.getProperties("user.", defaults);
        assertEquals("bob", result.getProperty("name"));
        assertEquals("30", result.getProperty("age"));
        assertEquals("US", result.getProperty("country"));
    }

    @Test
    public void testGetPropertiesDirectProperty() {
        props.setProperty("user.name", "bob");
        props.setProperty("user.age", "30");
        
        Properties result = props.getProperties("user");
        assertNotNull(result);
        assertEquals("bob", result.getProperty("name"));
    }

    @Test
    public void testGetPropertiesListValue() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b"));
        props.setProperty("list", list);
        Properties result = props.getProperties("list");
        assertNotNull(result);
        assertNull(result.getProperty("a"));
    }
}