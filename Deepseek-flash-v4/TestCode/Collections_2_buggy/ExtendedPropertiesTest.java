package org.apache.commons.collections;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.*;

import static org.junit.Assert.*;

public class ExtendedPropertiesTest {

    private ExtendedProperties props;

    @Before
    public void setUp() throws IOException {
        props = new ExtendedProperties();
    }

    @Test
    public void testDefaultConstructor() {
        ExtendedProperties ep = new ExtendedProperties();
        assertNotNull(ep);
        assertEquals(0, ep.size());
    }

    @Test
    public void testLoadStringDefaultFile() throws IOException {
        File temp = File.createTempFile("test", ".properties");
        try (PrintWriter pw = new PrintWriter(temp, "UTF-8")) {
            pw.println("key1=value1");
            pw.println("key2=value2");
        }

        File defaultFile = File.createTempFile("default", ".properties");
        try (PrintWriter pw = new PrintWriter(defaultFile, "UTF-8")) {
            pw.println("defaultKey=defaultValue");
        }

        ExtendedProperties ep = new ExtendedProperties(temp.getAbsolutePath(), defaultFile.getAbsolutePath());
        assertEquals("value1", ep.getProperty("key1"));
        assertEquals("defaultValue", ep.getProperty("defaultKey"));
        assertTrue(ep.isInitialized());

        temp.delete();
        defaultFile.delete();
    }

    @Test
    public void testLoadFromInputStream() throws IOException {
        String content = "key1=value1\nkey2=value2\n";
        InputStream is = new ByteArrayInputStream(content.getBytes("UTF-8"));

        props.load(is);
        assertEquals("value1", props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
    }

    @Test(expected = IOException.class)
    public void testLoadNonexistentFile() throws IOException {
        ExtendedProperties ep = new ExtendedProperties("/nonexistent/file.properties");
    }

    @Test
    public void testGetPropertyWithDefault() {
        props.addProperty("key", "value");
        assertEquals("value", props.getProperty("key", "default"));
        assertEquals("default", props.getProperty("missing", "default"));

        props.defaults = new ExtendedProperties();
        props.defaults.addProperty("defaultKey", "defaultValue");
        assertEquals("defaultValue", props.getProperty("missing", "defaultValue"));
    }

    @Test
    public void testAddPropertyVariousTypes() {
        // String with delimiter
        props.addProperty("listKey", "a,b,c");
        List list = props.getList("listKey");
        assertEquals(3, list.size());

        // Regular string
        props.addProperty("stringKey", "hello");
        assertEquals("hello", props.getProperty("stringKey"));

        // Existing key becomes list
        props.addProperty("stringKey", "world");
        assertEquals("hello", props.getProperty("stringKey"));
    }

    @Test
    public void testSetAndGetProperty() {
        props.setProperty("key", "value");
        assertEquals("value", props.getProperty("key"));

        props.setProperty("num", "42");
        assertEquals(42, props.getInt("num"));

        props.setProperty("bool", "true");
        assertTrue(props.getBoolean("bool"));
    }

    @Test
    public void testGetListMethods() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        props.put("key", list);

        assertEquals(list, props.getList("key"));

        // String with comma becomes list
        props.put("key2", "x,y,z");
        List result = props.getList("key2");
        assertEquals(3, result.size());
        assertEquals("x", result.get(0));

        // Default value
        List<String> defaultValue = new ArrayList<>();
        defaultValue.add("d");
        assertEquals(defaultValue, props.getList("missing", defaultValue));
    }

    @Test
    public void testGetVectorMethods() {
        List<String> list = new ArrayList<>();
        list.add("a");
        props.put("listKey", list);

        Vector vector = props.getVector("listKey");
        assertNotNull(vector);
        assertEquals(1, vector.size());
        assertEquals("a", vector.get(0));

        Vector defaultVector = new Vector();
        assertNotNull(props.getVector("missing", defaultVector));
    }

    @Test
    public void testBooleanMethods() {
        props.addProperty("trueKey", "true");
        props.addProperty("onKey", "on");
        props.addProperty("yesKey", "yes");
        props.addProperty("falseKey", "false");
        props.addProperty("offKey", "off");
        props.addProperty("noKey", "no");
        props.addProperty("boolKey", new Boolean(true));

        assertTrue(props.getBoolean("trueKey"));
        assertTrue(props.getBoolean("onKey", true));
        assertTrue(props.getBoolean("yesKey", false));
        assertTrue(props.getBoolean("boolKey"));

        assertFalse(props.getBoolean("falseKey"));
        assertFalse(props.getBoolean("offKey"));
        assertFalse(props.getBoolean("noKey"));

        assertTrue(props.getBoolean("missing", true));
        assertFalse(props.getBoolean("missing2", false));

        props.addProperty("badBool", "notabool");
        assertTrue(props.getBoolean("badBool", true));
    }

    @Test
    public void testByteMethods() {
        props.addProperty("byteKey", "127");
        assertEquals((byte) 127, props.getByte("byteKey"));

        assertEquals((byte) 10, props.getByte("missing", (byte) 10));

        props.addProperty("byteObj", new Byte((byte) 42));
        assertEquals((byte) 42, props.getByte("byteObj"));

        assertEquals((byte) 42, props.getByte("byteObj", (byte) 1));

        // Override with default
        props.addProperty("stringByte", "55");
        assertEquals((byte) 55, props.getByte("stringByte", (byte) 1));
    }

    @Test
    public void testShortMethods() {
        props.addProperty("key", "32767");
        assertEquals((short) 32767, props.getShort("key"));

        assertEquals((short) 42, props.getShort("missing", (short) 42));

        props.addProperty("shortObj", new Short((short) 277));
        assertEquals((short) 277, props.getShort("shortObj"));

        assertEquals((short) 1, props.getShort("missing", (short) 1));
    }

    @Test
    public void testIntegerMethods() {
        props.addProperty("intKey", "100");
        assertEquals(100, props.getInt("intKey"));
        assertEquals(100, props.getInteger("intKey"));
        assertEquals(100, (int) props.getInteger("intKey"));

        props.addProperty("objKey", new Integer(50));
        assertEquals(50, (int) props.getInteger("objKey"));
        assertEquals(50, (int) props.getInteger("objKey", new Integer(1)));

        props.addProperty("stringKey", "300");
        assertEquals(300, (int) props.getInteger("stringKey", new Integer(1)));

        assertEquals(100, props.getInt("intKey", 200));
        assertEquals(200, props.getInt("missing", 200));

        Integer defaultInt = 400;
        assertEquals(200, (int) props.getInteger("intKey", defaultInt));
        assertEquals(400, (int) props.getInteger("missing", defaultInt));
    }

    @Test
    public void testLongMethods() {
        props.addProperty("longKey", "100000");
        assertEquals(100000L, props.getLong("longKey"));

        props.addProperty("longObj", "200000");
        Long longVal = props.getLong("longObj", 300000L);
        assertNotNull(longVal);
        assertEquals(200000L, (long) longVal);

        props.addProperty("longString", "123456");
        assertEquals(123456L, (long) props.getLong("longString", 2L));
    }

    @Test
    public void testFloatMethods() {
        props.addProperty("floatKey", "3.14");
        float f = props.getFloat("floatKey");
        assertEquals(3.14f, f, 0.001f);

        props.addProperty("floatObj", "2.71");
        Float floatVal = props.getFloat("floatObj", 1.1f);
        assertEquals(4.71f, props.getFloat("missing", 4.71f), 0.001f);

        props.addProperty("floatStr", "9.99");
        assertEquals(9.99f, props.getFloat("floatStr", 1.1f), 0.001f);
    }

    @Test
    public void testDoubleMethods() {
        props.addProperty("doubleKey", "3.14159");
        assertEquals(3.14159, props.getDouble("doubleKey"), 0.00001);

        props.addProperty("doubleObj", "2.71828");
        Double doubleVal = props.getDouble("doubleObj", 1.1);
        assertEquals(2.71828, doubleVal, 0.00001);

        props.addProperty("doubleStr", "1.234567");
        assertEquals(1.234567, props.getDouble("doubleStr", 1.1), 0.00001);
    }

    @Test
    public void testConvertProperties() throws Exception {
        Properties p = new Properties();
        p.setProperty("key1", "value1");
        p.setProperty("key2", "value2");

        ExtendedProperties ep = ExtendedProperties.convertProperties(p);

        assertEquals("value1", ep.getProperty("key1"));
        assertEquals("value2", ep.getProperty("key2"));
        assertTrue(ep.isInitialized());
    }

    @Test
    public void testGetKeysMethods() throws IOException {
        File temp = File.createTempFile("keys", ".properties");
        try (PrintWriter pw = new PrintWriter(temp, "UTF-8")) {
            pw.println("key1=value1");
            pw.println("key2=value2");
            pw.println("other3=value3");
            pw.println("key4=value4");
        }

        ExtendedProperties ep = new ExtendedProperties();
        try (InputStream is = new FileInputStream(temp)) {
            ep.load(is);
        }

        Iterator<String> it = ep.getKeys();
        assertTrue(it.hasNext());
        it.next();
        it.next();
        it.next();
        it.next();
        assertFalse(it.hasNext());

        Iterator<String> keyIt = ep.getKeys("key");
        List<String> result = new ArrayList<>();
        while (keyIt.hasNext()) {
            result.add(keyIt.next());
        }
        assertEquals(3, result.size());
    }

    @Test
    public void testSubset() {
        props.addProperty("a.b.c", "value1");
        props.addProperty("a.b.d", "value2");
        props.addProperty("x.y", "value3");

        ExtendedProperties subset = props.subset("a.b");
        assertNotNull(subset);
        assertEquals(2, subset.size());
    }

    @Test
    public void testCombine() {
        ExtendedProperties other = new ExtendedProperties();
        other.addProperty("key1", "value1");
        other.addProperty("key2", "value2");

        props.addProperty("key0", "value0");
        props.combine(other);

        assertEquals("value0", props.getProperty("key0"));
        assertEquals("value1", props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
    }

    @Test
    public void testClearProperty() {
        props.addProperty("key", "value");
        props.addProperty("key2", "value2");

        props.clearProperty("key");
        assertNull(props.getProperty("key"));
        assertNotNull(props.getProperty("key2"));
    }

    @Test
    public void testIsInitialized() {
        assertFalse(props.isInitialized());

        props.addProperty("key", "value");
        assertTrue(props.isInitialized());
    }

    @Test
    public void testIncludeAndGetSet() {
        assertEquals("include", props.getInclude());
        props.setInclude("myInclude");
        assertEquals("myInclude", props.getInclude());

        props.setInclude("include");
        assertEquals(props.getInclude(), props.getInclude());
    }

    @Test
    public void testGetStringArray() {
        props.addProperty("arrayKey", "a,b,c");
        String[] arr = props.getStringArray("arrayKey");

        assertNotNull(arr);
        assertEquals(3, arr.length);

        String[] missingArr = props.getStringArray("missing");
        assertNotNull(missingArr);
        assertEquals(0, missingArr.length);
    }

    @Test
    public void testGetPropertiesMethod() {
        props.addProperty("prop.key1", "value1");
        props.addProperty("prop.key2", "value2");

        Properties p = props.getProperties("prop");
        assertNotNull(p);
        assertEquals(2, p.size());
    }

    @Test
    public void testDisplay() {
        props.addProperty("key", "value");

        // Should not throw exceptions
        try {
            props.display();
        } catch (Exception e) {
            fail("display() should not throw");
        }
    }

    @Test
    public void testSaveAndLoad() throws IOException {
        File temp = new File(System.getProperty("java.io.tmpdir"), "testSave_" + System.nanoTime() + ".properties");
        props.addProperty("key1", "value1");
        props.addProperty("listKey", "a,b,c");
        props.addProperty("bool", true);

        try (FileOutputStream fos = new FileOutputStream(temp)) {
            props.save(fos, "Test Header");
        }

        ExtendedProperties loaded = new ExtendedProperties();
        try (FileInputStream fis = new FileInputStream(temp)) {
            loaded.load(fis);
        }

        assertEquals("value1", loaded.getProperty("key1"));
        assertEquals("true", loaded.getProperty("bool"));
        assertNotNull(loaded.getProperty("listKey"));

        temp.delete();
    }

    @Test
    public void testInterpolation() {
        props.addProperty("name", "world");
        props.addProperty("greeting", "hello ${name}");

        String result = props.getProperty("greeting");
        assertEquals("hello world", result);
    }

    @Test
    public void testInterpolationWithDefaults() {
        ExtendedProperties def = new ExtendedProperties();
        def.addProperty("defaultName", "defaultWorld");
        props.defaults = def;

        props.put("greeting2", "hello ${defaultName}");
        String greeting = props.getString("greeting2");
        assertEquals("hello defaultWorld", greeting);
    }

    @Test
    public void testInterpolationSelfReference() {
        props.addProperty("a", "${b}");
        props.addProperty("b", "${a}");

        try {
            props.getProperty("a");
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testSaveWithNullHeaderAndNullOutput() throws IOException {
        try {
            props.save(null, null);
            fail("Should throw IOException");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testGetBooleanWithTypeAndConversion() {
        props.addProperty("boolTrue", "TRUE");
        props.addProperty("boolOn", "ON");
        props.addProperty("boolYes", "YES");
        props.addProperty("boolFalse", "FALSE");
        props.addProperty("boolOff", "OFF");
        props.addProperty("boolNo", "NO");

        assertTrue(props.getBoolean("boolTrue"));
        assertTrue(props.getBoolean("boolOn"));
        assertTrue(props.getBoolean("boolYes"));
        assertFalse(props.getBoolean("boolFalse"));
        assertFalse(props.getBoolean("boolOff"));
        assertFalse(props.getBoolean("boolNo"));
    }
}