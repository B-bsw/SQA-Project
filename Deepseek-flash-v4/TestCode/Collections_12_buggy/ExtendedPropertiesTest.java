package org.apache.commons.collections;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import static org.junit.Assert.*;

public class ExtendedPropertiesTest {
    private ExtendedProperties props;
    private ExtendedProperties propsWithDefaults;
    private ExtendedProperties defaults;

    @Before
    public void setUp() throws Exception {
        props = new ExtendedProperties();
        defaults = new ExtendedProperties();
        defaults.setProperty("default.key", "defaultValue");
        defaults.setProperty("default.number", "42");
        defaults.setProperty("default.flag", "true");
        propsWithDefaults = new ExtendedProperties();
        propsWithDefaults.setDefaults(defaults);
    }

    @Test
    public void testDefaultConstructor() {
        ExtendedProperties ep = new ExtendedProperties();
        assertNotNull(ep);
        assertFalse(ep.isInitialized());
        assertTrue(ep.isEmpty());
    }

    @Test
    public void testFileConstructorWithNullFile() throws IOException {
        ExtendedProperties ep = new ExtendedProperties((String) null);
        assertNotNull(ep);
        assertFalse(ep.isInitialized());
    }

    @Test
    public void testLoadWithInputStream() throws IOException {
        InputStream is = new ByteArrayInputStream("key1=value1\nkey2=value2\n".getBytes(StandardCharsets.ISO_8859_1));
        ExtendedProperties ep = new ExtendedProperties();
        ep.load(is);
        assertTrue(ep.isInitialized());
        assertEquals("value1", ep.getString("key1"));
        assertEquals("value2", ep.getString("key2"));
    }

    @Test
    public void testLoadWithInputEmptyString() throws IOException {
        InputStream is = new ByteArrayInputStream("".getBytes(StandardCharsets.ISO_8859_1));
        ExtendedProperties ep = new ExtendedProperties();
        ep.load(is);
        assertTrue(ep.isEmpty());
    }

    @Test(expected = IOException.class)
    public void testLoadWithNullInput() throws IOException {
        ExtendedProperties ep = new ExtendedProperties();
        ep.load((InputStream) null);
    }

    @Test
    public void testLoadWithEncoding() throws IOException {
        InputStream is = new ByteArrayInputStream("key=value".getBytes(StandardCharsets.UTF_8));
        ExtendedProperties ep = new ExtendedProperties();
        ep.load(is, "UTF-8");
        assertEquals("value", ep.getString("key"));
    }

    @Test
    public void testInterpolateWithSimpleProperty() {
        props.setProperty("name", "John");
        props.setProperty("greeting", "Hello ${name}");
        assertEquals("Hello John", props.getString("greeting"));
    }

    @Test
    public void testNull() {
        assertNull(props.interpolate(null));
    }

    @Test
    public void testInterpolateWithRecursiveReference() {
        props.setProperty("a", "${b}");
        props.setProperty("b", "value");
        assertEquals("value", props.getString("a"));
    }

    @Test
    public void testInterpolateWithCircularReference() {
        props.setProperty("a", "${b}");
        props.setProperty("b", "${a}");
        try {
            props.getString("a");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("infinite loop"));
        }
    }

    @Test
    public void testInterpolateWithDefault() {
        propsWithDefaults.setProperty("key", "${missing}");
        assertEquals("${missing}", propsWithDefaults.getString("key"));
    }

    @Test
    public void testGetStringWithDefaultFromDefaults() {
        assertEquals("defaultValue", propsWithDefaults.getString("default.key", "fallback"));
    }

    @Test
    public void testGetStringWithDefaultWhenValueExists() {
        props.setProperty("key", "value");
        assertEquals("value", props.getString("key", "fallback"));
    }

    @Test
    public void testGetStringFromDefaultsWithDefault() {
        assertEquals("defaultValue", propsWithDefaults.getString("default.key", "fallback"));
    }

    @Test
    public void testGetStringFromDefaultsWithoutProperty() {
        assertEquals("fallback", propsWithDefaults.getString("missing", "fallback"));
    }

    @Test
    public void testGetStringFromListValue() {
        props.addProperty("key", "first");
        props.addProperty("key", "second");
        assertEquals("first", props.getString("key"));
    }

    @Test
    public void testGetBooleanTrueVariants() {
        props.setProperty("t", "true");
        props.setProperty("o", "on");
        props.setProperty("y", "yes");
        assertTrue(props.getBoolean("t", false));
        assertTrue(props.getBoolean("o", false));
        assertTrue(props.getBoolean("y", false));
    }

    @Test
    public void testGetBooleanFalseVariants() {
        props.setProperty("f", "false");
        props.setProperty("o", "off");
        props.setProperty("n", "no");
        assertFalse(props.getBoolean("f", true));
        assertFalse(props.getBoolean("o", true));
        assertFalse(props.getBoolean("n", true));
    }

    @Test
    public void testGetBooleanWithDefault() {
        assertTrue(props.getBoolean("missing", true));
        assertFalse(props.getBoolean("missing", false));
    }

    @Test
    public void testGetBooleanWithBooleanType() {
        props.put("key", Boolean.TRUE);
        assertEquals(Boolean.TRUE, props.getBoolean("key", Boolean.FALSE));
    }

    @Test
    public void testGetBooleanAsWrapperFromString() {
        props.setProperty("key", "true");
        assertEquals(Boolean.TRUE, props.getBoolean("key", Boolean.FALSE));
    }

    @Test
    public void testGetBooleanWithDefaults() {
        assertEquals(Boolean.TRUE, propsWithDefaults.getBoolean("default.flag", Boolean.FALSE));
    }

    @Test
    public void testGetIntegerWithDefault() {
        assertEquals(42, props.getInteger("missing", 42));
        props.setProperty("key", "17");
        assertEquals(17, props.getInteger("key", 42));
    }

    @Test
    public void testGetIntegerFromDefaults() {
        assertEquals(42, propsWithDefaults.getInteger("default.number", 0));
    }

    @Test
    public void testGetIntegerWithNoDefault() {
        props.setProperty("key", "10");
        assertEquals(10, props.getInteger("key"));
        assertEquals(0, props.getInteger("missing"));
    }

    @Test
    public void testGetIntegerWithNullDefault() {
        try {
            props.getInteger("missing", (Integer) null);
            fail("Expected NumberFormatException");
        } catch (NumberFormatException e) {
            assertEquals("null", e.getMessage());
        }
    }

    @Test
    public void testGetIntegerFromDefaultsWithNullDefault() {
        defaults.setProperty("num", "5");
        assertEquals(Integer.valueOf(5), propsWithDefaults.getInteger("num", null));
    }

    @Test
    public void testGetIntWithDefault() {
        assertEquals(5, props.getInt("missing", 5));
        props.setProperty("k", "3");
        assertEquals(3, props.getInt("k", 5));
    }

    @Test
    public void testGetShortDefault() {
        props.setProperty("s", "12");
        assertEquals((short) 12, props.getShort("s", (short) 0));
    }

    @Test
    public void testGetShortWithDefaultValue() {
        props.setProperty("s", "5");
        assertEquals((short) 5, props.getShort("s", (short) 9));
    }

    @Test
    public void testGetShortFromWrapper() {
        props.put("s", Short.valueOf((short) 7));
        assertEquals((short) 7, props.getShort("s", (short) 0));
    }

    @Test
    public void testGetShortFromStringWithDefault() {
        props.setProperty("s", "15");
        assertEquals((short) 15, props.getShort("s", (short) 0));
    }

    @Test
    public void testGetShortMissingWithDefault() {
        assertEquals((short) 3, props.getShort("missing", (short) 3));
    }

    @Test
    public void testGetFloatDefault() {
        props.setProperty("f", "1.5");
        assertEquals(1.5f, props.getFloat("f", 0.0f), 0.01f);
    }

    @Test
    public void testGetFloatNoDefault() {
        props.setProperty("f", "2.5");
        assertEquals(2.5f, props.getFloat("f"), 0.01f);
        assertEquals(0.0f, props.getFloat("missing"), 0.01f);
    }

    @Test
    public void testGetFloatWithDefaultValue() {
        assertEquals(1.0f, props.getFloat("missing", 1.0f), 0.01f);
    }

    @Test
    public void testGetFloatWrapper() {
        props.put("f", Float.valueOf(3.5f));
        assertEquals(Float.valueOf(3.5f), props.getFloat("f", Float.valueOf(0.0f)));
    }

    @Test
    public void testGetDoubleDefault() {
        props.setProperty("d", "1.25");
        assertEquals(1.25, props.getDouble("d", 0.0), 0.001);
    }

    @Test
    public void testGetDoubleNoDefault() {
        props.setProperty("d", "2.5");
        assertEquals(2.5, props.getDouble("d"), 0.001);
        assertEquals(0.0, props.getDouble("missing"), 0.001);
    }

    @Test
    public void testGetDoubleWithDefault() {
        assertEquals(1.5, props.getDouble("missing", 1.5), 0.001);
    }

    @Test
    public void testGetDoubleWrapper() {
        props.put("d", Double.valueOf(3.25));
        assertEquals(Double.valueOf(3.25), props.getDouble("d", Double.valueOf(0.0)));
    }

    @Test
    public void testGetProperties() {
        props.setProperty("p.a", "1");
        props.setProperty("p.b", "2");
        Properties result = props.getProperties("p.");
        assertEquals("1", result.getProperty("a"));
        assertEquals("2", result.getProperty("b"));
    }

    @Test
    public void testGetPropertiesWithDefault() {
        props.setProperty("k.a", "x");
        Properties defaultsProps = new Properties();
        defaultsProps.setProperty("a", "default");
        Properties result = props.getProperties("k.", defaultsProps);
        assertEquals("x", result.getProperty("a"));
        assertEquals("default", result.getProperty("missing"));
    }

    @Test
    public void testGetStringArrayFromList() {
        props.addProperty("key", "a,b,c");
        String[] arr = props.getStringArray("key");
        assertArrayEquals(new String[]{"a", "b", "c"}, arr);
    }

    @Test
    public void testGetStringArrayMissing() {
        String[] arr = props.getStringArray("missing");
        assertArrayEquals(new String[0], arr);
    }

    @Test
    public void testGetStringArrayFromDefaults() {
        defaults.addProperty("arr", "x,y");
        propsWithDefaults.setDefaults(defaults);
        String[] arr = propsWithDefaults.getStringArray("arr");
        assertArrayEquals(new String[]{"x", "y"}, arr);
    }

    @Test
    public void testGetVectorFromList() {
        props.addProperty("key", "a");
        props.addProperty("key", "b");
        Vector v = props.getVector("key");
        assertEquals(2, v.size());
        assertEquals("a", v.get(0));
        assertEquals("b", v.get(1));
    }

    @Test
    public void testGetVectorFromString() {
        props.setProperty("key", "a,b,c");
        Vector v = props.getVector("key");
        assertEquals(3, v.size());
        assertEquals("a", v.get(0));
    }

    @Test
    public void testGetVectorWithDefault() {
        Vector def = new Vector();
        def.add("d");
        Vector result = props.getVector("missing", def);
        assertEquals(1, result.size());
        assertEquals("d", result.get(0));
    }

    @Test
    public void testGetVectorFromDefaultsWithDefault() {
        defaults.addProperty("vec", "x");
        Vector def = new Vector();
        def.add("d");
        Vector result = propsWithDefaults.getVector("vec", def);
        assertEquals(1, result.size());
        assertEquals("x", result.get(0));
    }

    @Test
    public void testGetVectorNullDefault() {
        Vector result = props.getVector("missing", null);
        assertNull(result);
    }

    @Test
    public void testGetListFromListValue() {
        props.addProperty("key", "a");
        props.addProperty("key", "b");
        List l = props.getList("key");
        assertEquals(2, l.size());
    }

    @Test
    public void testGetListWithDefault() {
        List def = new ArrayList();
        def.add("d");
        List result = props.getList("missing", def);
        assertEquals(def, result);
    }

    @Test
    public void testGetListFromDefaultsWithDefault() {
        defaults.addProperty("list", "x");
        List def = new ArrayList();
        def.add("d");
        List result = propsWithDefaults.getList("list", def);
        assertEquals(1, result.size());
        assertEquals("x", result.get(0));
    }

    @Test
    public void testGetListNullDefault() {
        assertNull(props.getList("missing", null));
    }

    @Test
    public void testAddPropertyWithListValue() {
        props.addProperty("key", "a");
        props.addProperty("key", "b");
        Object val = props.get("key");
        assertTrue(val instanceof List);
        assertEquals(2, ((List) val).size());
    }

    @Test
    public void testAddPropertyWithSingleValue() {
        props.addProperty("key", "value");
        Object val = props.get("key");
        assertEquals("value", val);
    }

    @Test
    public void testAddPropertyWithCommaString() {
        props.addProperty("key", "a,b,c");
        Object val = props.get("key");
        assertTrue(val instanceof List);
        assertEquals(3, ((List) val).size());
    }

    @Test
    public void testAddPropertyNullKey() {
        props.addProperty(null, "value");
        assertNull(props.get(null));
    }

    @Test
    public void testSetPropertyOverwrites() {
        props.setProperty("key", "first");
        props.setProperty("key", "second");
        assertEquals("second", props.getString("key"));
    }

    @Test
    public void testSetPropertyAddsToKeyList() {
        props.setProperty("a", "1");
        props.setProperty("b", "2");
        assertEquals(2, props.size());
    }

    @Test
    public void testPutWithAddProperty() {
        Object ret = props.put("key", "value");
        assertNull(ret);
        assertEquals("value", props.get("key"));
    }

    @Test
    public void testPutWithExistingKey() {
        props.setProperty("key", "old");
        Object ret = props.put("key", "new");
        assertEquals("old", ret);
    }

    @Test
    public void testPutAllWithExtendedProperties() {
        props.setProperty("a", "1");
        ExtendedProperties other = new ExtendedProperties();
        other.setProperty("b", "2");
        props.putAll(other);
        assertEquals(2, props.size());
        assertEquals("2", props.get("b"));
    }

    @Test
    public void testPutAllWithRegularMap() {
        props.put("a", "1");
        java.util.Map m = new java.util.HashMap();
        m.put("b", "2");
        props.putAll(m);
        assertEquals("2", props.get("b"));
    }

    @Test
    public void testRemoveExisting() {
        props.setProperty("a", "1");
        props.setProperty("b", "2");
        Object removed = props.remove("a");
        assertEquals("1", removed);
        assertNull(props.get("a"));
        assertEquals(1, props.size());
    }

    @Test
    public void testRemoveNonExisting() {
        assertNull(props.remove("missing"));
    }

    @Test
    public void testClearPropertyExisting() {
        props.setProperty("a", "1");
        props.setProperty("b", "2");
        props.clearProperty("a");
        assertNull(props.get("a"));
        assertEquals(1, props.size());
    }

    @Test
    public void testClearPropertyNonExisting() {
        props.setProperty("a", "1");
        props.clearProperty("b");
        assertEquals(1, props.size());
    }

    @Test
    public void testGetKeysNoElements() {
        ExtendedProperties ep = new ExtendedProperties();
        assertFalse(ep.getKeys().hasNext());
    }

    @Test
    public void testGetKeysWithSingle() {
        props.setProperty("a", "1");
        assertEquals("a", props.getKeys().next());
    }

    @Test
    public void testGetKeysWithMany() {
        props.setProperty("a", "1");
        props.setProperty("b", "2");
        int count = 0;
        java.util.Iterator it = props.getKeys();
        while (it.hasNext()) {
            it.next();
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testGetKeysWithPrefix() {
        props.setProperty("prefix.key", "1");
        props.setProperty("other", "2");
        java.util.Iterator it = props.getKeys("prefix.");
        assertTrue(it.hasNext());
        assertEquals("prefix.key", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetKeysWithPrefixNoMatch() {
        props.setProperty("a", "1");
        props.setProperty("b", "2");
        java.util.Iterator it = props.getKeys("z.");
        assertFalse(it.hasNext());
    }

    @Test
    public void testSubsetValid() {
        props.setProperty("a.b.c", "1");
        props.setProperty("a.b.d", "2");
        props.setProperty("x.y", "3");
        ExtendedProperties sub = props.subset("a.b.");
        assertNotNull(sub);
        assertEquals(2, sub.size());
        assertEquals("1", sub.getString("a.b.c"));
        assertEquals("2", sub.getString("a.b.d"));
    }

    @Test
    public void testSubsetInvalid() {
        props.setProperty("a", "1");
        ExtendedProperties sub = props.subset("b.");
        assertNull(sub);
    }

    @Test
    public void testSubsetPrefixEqual() {
        props.setProperty("key", "1");
        props.setProperty("key.sub", "2");
        ExtendedProperties sub = props.subset("key");
        assertNotNull(sub);
        assertEquals(2, sub.size());
    }

    @Test
    public void testCombineWithOther() {
        props.setProperty("a", "1");
        ExtendedProperties other = new ExtendedProperties();
        other.setProperty("b", "2");
        props.combine(other);
        assertEquals(2, props.size());
        assertEquals("2", props.get("b"));
    }

    @Test
    public void testSaveWithHeader() throws IOException {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("key", "value");
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        ep.save(out, "header");
        String result = out.toString("ISO-8859-1");
        assertTrue(result.contains("header"));
        assertTrue(result.contains("key=value"));
    }

    @Test
    public void testSaveWithoutHeader() throws IOException {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("key", "value");
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        ep.save(out, null);
        String result = out.toString("ISO-8859-1");
        assertTrue(result.contains("key=value"));
    }

    @Test(expected = IOException.class)
    public void testSaveWithNullOutput() throws IOException {
        props.setProperty("key", "value");
        props.save(null, "header");
    }

    @Test
    public void testSaveWithListValue() throws IOException {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("key", "a");
        ep.addProperty("key", "b");
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        ep.save(out, null);
        String result = out.toString("ISO-8859-1");
        assertTrue(result.contains("a"));
        assertTrue(result.contains("b"));
    }

    @Test
    public void testLoadWithInclude() throws IOException {
        String content = "include=sub.properties\nkey=value";
        InputStream is = new ByteArrayInputStream(content.getBytes(StandardCharsets.ISO_8859_1));
        ExtendedProperties ep = new ExtendedProperties();
        ep.setInclude("include");
        ep.load(is);
        assertTrue(ep.containsKey("key"));
    }

    @Test
    public void testLoadWithDefaultEncoding() throws IOException {
        String content = "key=value";
        InputStream is = new ByteArrayInputStream(content.getBytes(StandardCharsets.ISO_8859_1));
        ExtendedProperties ep = new ExtendedProperties();
        ep.load(is, "invalid");
        assertEquals("value", ep.getString("key"));
    }

    @Test
    public void testGetIncludeDefault() {
        ExtendedProperties ep = new ExtendedProperties();
        assertEquals("include", ep.getInclude());
    }

    @Test
    public void testGetIncludeCustom() {
        props.setInclude("custom");
        assertEquals("custom", props.getInclude());
    }

    @Test
    public void testGetIncludeEmpty() {
        props.setInclude("");
        assertEquals("", props.getInclude());
    }

    @Test
    public void testSetIncludeNull() {
        props.setInclude(null);
        assertEquals("include", props.getInclude());
    }

    @Test
    public void testGetBooleanKeyFromDefaults() {
        defaults.setProperty("flag", "true");
        propsWithDefaults.setDefaults(defaults);
        assertTrue(propsWithDefaults.getBoolean("flag", false));
    }

    @Test
    public void testGetBooleanKeyFromDefaultsWithDefault() {
        defaults.setProperty("flag", "true");
        propsWithDefaults.setDefaults(defaults);
        assertTrue(propsWithDefaults.getBoolean("missing", true));
    }

    @Test
    public void testGetIntegerKeyFromDefaults() {
        defaults.setProperty("num", "5");
        propsWithDefaults.setDefaults(defaults);
        assertEquals(5, propsWithDefaults.getInteger("num", 0));
    }

    @Test
    public void testGetIntegerKeyFromDefaultsMissing() {
        defaults.setProperty("num", "5");
        propsWithDefaults.setDefaults(defaults);
        assertEquals(10, propsWithDefaults.getInteger("missing", 10));
    }

    @Test
    public void testGetFloatKeyFromDefaults() {
        defaults.setProperty("float", "1.5");
        propsWithDefaults.setDefaults(defaults);
        assertEquals(1.5f, propsWithDefaults.getFloat("float", 0.0f), 0.01f);
    }

    @Test
    public void testGetDoubleKeyFromDefaults() {
        defaults.setProperty("d", "2.5");
        propsWithDefaults.setDefaults(defaults);
        assertEquals(2.5, propsWithDefaults.getDouble("d", 0.0), 0.01);
    }

    @Test
    public void testGetBooleanNativeFromDefaults() {
        defaults.setProperty("flag", "true");
        propsWithDefaults.setDefaults(defaults);
        assertTrue(propsWithDefaults.getBoolean("flag"));
    }

    @Test
    public void testGetBooleanNativeMissing() {
        assertFalse(props.getBoolean("missing"));
    }

    @Test
    public void testGetShortNative() {
        props.setProperty("s", "5");
        assertEquals((short) 5, props.getShort("s", (short) 0));
    }

    @Test
    public void testGetShortMissingNative() {
        assertEquals((short) 0, props.getShort("missing", (short) 0));
    }

    @Test
    public void testGetShortFromString() {
        props.setProperty("s", "12");
        assertEquals((short) 12, props.getShort("s", (short) 0));
    }

    @Test
    public void testGetShortFromDefaults() {
        defaults.setProperty("s", "7");
        propsWithDefaults.setDefaults(defaults);
        assertEquals((short) 7, propsWithDefaults.getShort("s", (short) 0));
    }

    @Test
    public void testGetShortFromDefaultsMissing() {
        defaults.setProperty("s", "7");
        propsWithDefaults.setDefaults(defaults);
        assertEquals((short) 0, propsWithDefaults.getShort("missing", (short) 0));
    }

    @Test
    public void testGetShortFromWrapperDefault() {
        props.put("s", Short.valueOf((short) 9));
        assertEquals((short) 9, props.getShort("s", (short) 0));
    }

    @Test
    public void testGetShortFromStringWithDefaultValue() {
        props.setProperty("s", "3");
        assertEquals((short) 3, props.getShort("s", (short) 0));
    }

    @Test
    public void testGetFloatKey() {
        props.setProperty("f", "1.5");
        assertEquals(1.5f, props.getFloat("f"), 0.01f);
    }

    @Test
    public void testGetFloatMissing() {
        assertEquals(0.0f, props.getFloat("missing"), 0.01f);
    }

    @Test
    public void testGetFloatFromDefaults() {
        defaults.setProperty("f", "2.5");
        propsWithDefaults.setDefaults(defaults);
        assertEquals(2.5f, propsWithDefaults.getFloat("f"), 0.01f);
    }

    @Test
    public void testGetFloatFromDefaultsMissing() {
        defaults.setProperty("f", "2.5");
        propsWithDefaults.setDefaults(defaults);
        assertEquals(0.0f, propsWithDefaults.getFloat("missing"), 0.01f);
    }

    @Test
    public void testGetFloatFromString() {
        props.setProperty("f", "3.5");
        assertEquals(3.5f, props.getFloat("f"), 0.01f);
    }

    @Test
    public void testGetDoubleKey() {
        props.setProperty("d", "1.5");
        assertEquals(1.5, props.getDouble("d"), 0.01);
    }

    @Test
    public void testGetDoubleMissing() {
        assertEquals(0.0, props.getDouble("missing"), 0.01);
    }

    @Test
    public void testGetDoubleFromDefaults() {
        defaults.setProperty("d", "2.5");
        propsWithDefaults.setDefaults(defaults);
        assertEquals(2.5, propsWithDefaults.getDouble("d"), 0.01);
    }

    @Test
    public void testGetDoubleFromDefaultsMissing() {
        defaults.setProperty("d", "2.5");
        propsWithDefaults.setDefaults(defaults);
        assertEquals(0.0, propsWithDefaults.getDouble("missing"), 0.01);
    }

    @Test
    public void testGetDoubleFromString() {
        props.setProperty("d", "3.5");
        assertEquals(3.5, props.getDouble("d"), 0.01);
    }

    @Test
    public void testConvertPropertiesWithExtendedProperties() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("a", "1");
        Properties converted = ExtendedProperties.convertProperties(ep);
        assertEquals("1", converted.getProperty("a"));
    }

    @Test
    public void testConvertPropertiesWithRegularMap() {
        Properties original = new Properties();
        original.setProperty("a", "1");
        ExtendedProperties ep = ExtendedProperties.convertProperties(original);
        assertEquals("1", ep.getString("a"));
    }

    @Test
    public void testConvertPropertiesWithListValue() {
        Properties original = new Properties();
        original.put("lst", java.util.Arrays.asList("a", "b"));
        ExtendedProperties ep = ExtendedProperties.convertProperties(original);
        assertTrue(ep.get("lst") instanceof List);
    }

    @Test
    public void testConvertPropertiesWithNonString() {
        Properties original = new Properties();
        original.put("num", 42);
        ExtendedProperties ep = ExtendedProperties.convertProperties(original);
        assertEquals(42, ep.get("num"));
    }
}