package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanPropertyMapTest {

    private static class TestBean {
        Map<String, String> values = new LinkedHashMap<String, String>();
    }

    @SuppressWarnings("serial")
    private static class FakeProperty extends SettableBeanProperty {
        private final String _name;
        private final JavaType _type;
        private final JsonDeserializer<?> _valueDeser;

        FakeProperty(String name) {
            this(name, TypeFactory.defaultInstance().constructType(String.class), null);
        }

        FakeProperty(String name, JavaType type, JsonDeserializer<?> valueDeser) {
            super(name, type, null, null, valueDeser, null);
            _name = name;
            _type = type;
            _valueDeser = valueDeser;
        }

        @Override
        public String getName() {
            return _name;
        }

        @Override
        public JavaType getType() {
            return _type;
        }

        @Override
        public JsonDeserializer<?> getValueDeserializer() {
            return _valueDeser;
        }

        @Override
        public SettableBeanProperty withName(String name) {
            return new FakeProperty(name, _type, _valueDeser);
        }

        @Override
        public SettableBeanProperty withSimpleName(String simpleName) {
            return new FakeProperty(simpleName, _type, _valueDeser);
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return new FakeProperty(_name, _type, deser);
        }

        @Override
        public void fixAccess(DeserializationConfig config) { }

        @Override
        public <T> T deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            if (instance instanceof TestBean) {
                ((TestBean) instance).values.put(_name, _name);
            } else if (instance instanceof Map) {
                @SuppressWarnings("unchecked")
                Map<Object, Object> map = (Map<Object, Object>) instance;
                map.put(_name, _name);
            }
            return null;
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            if (instance instanceof TestBean) {
                ((TestBean) instance).values.put(_name, String.valueOf(value));
            } else if (instance instanceof Map) {
                @SuppressWarnings("unchecked")
                Map<Object, Object> map = (Map<Object, Object>) instance;
                map.put(_name, value);
            }
        }
    }

    private static SettableBeanProperty prop(String name) {
        return new FakeProperty(name);
    }

    private static BeanPropertyMap map(boolean caseInsensitive, String... names) {
        List<SettableBeanProperty> props = new ArrayList<SettableBeanProperty>();
        for (String name : names) {
            props.add(prop(name));
        }
        return new BeanPropertyMap(caseInsensitive, props);
    }

    @Test
    public void testEmptyMap() {
        BeanPropertyMap m = new BeanPropertyMap(false, Collections.<SettableBeanProperty>emptyList());
        assertEquals(0, m.size());
        assertNull(m.find("a"));
        assertFalse(m.iterator().hasNext());
        assertEquals("Properties=[]", m.toString());
    }

    @Test
    public void testConstructSkipsNullProperty() {
        SettableBeanProperty a = prop("a");
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(a, null));
        assertSame(a, m.find("a"));
        assertNull(m.find("b"));
    }

    @Test
    public void testBasicFindAndSize() {
        SettableBeanProperty a = prop("a");
        SettableBeanProperty b = prop("b");
        SettableBeanProperty c = prop("c");
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(a, b, c));
        assertEquals(3, m.size());
        assertSame(a, m.find("a"));
        assertSame(b, m.find("b"));
        assertSame(c, m.find("c"));
        assertNull(m.find("d"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindNullKeyThrows() {
        map(false, "a").find(null);
    }

    @Test
    public void testCaseInsensitiveFind() {
        SettableBeanProperty a = prop("a");
        BeanPropertyMap ci = new BeanPropertyMap(true, Arrays.asList(a));
        assertSame(a, ci.find("A"));
        assertSame(a, ci.find("a"));
        assertNull(ci.find("b"));

        BeanPropertyMap cs = new BeanPropertyMap(false, Arrays.asList(a));
        assertNull(cs.find("A"));
        assertSame(a, cs.find("a"));
    }

    @Test
    public void testWithCaseInsensitivity() {
        SettableBeanProperty a = prop("a");
        BeanPropertyMap cs = new BeanPropertyMap(false, Arrays.asList(a));
        assertSame(cs, cs.withCaseInsensitivity(false));
        BeanPropertyMap ci = cs.withCaseInsensitivity(true);
        assertNotSame(cs, ci);
        assertSame(a, ci.find("A"));
        assertNull(cs.find("A"));
    }

    @Test
    public void testAssignIndexesAndFindIndex() {
        SettableBeanProperty a = prop("a");
        SettableBeanProperty b = prop("b");
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(a, b));
        assertSame(m, m.assignIndexes());
        assertEquals(0, a.getPropertyIndex());
        assertEquals(1, b.getPropertyIndex());
        assertSame(a, m.find(0));
        assertSame(b, m.find(1));
        assertNull(m.find(99));
    }

    @Test
    public void testGetPropertiesInInsertionOrder() {
        SettableBeanProperty a = prop("a");
        SettableBeanProperty b = prop("b");
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(a, b));
        assertArrayEquals(new SettableBeanProperty[] { a, b }, m.getPropertiesInInsertionOrder());
    }

    @Test
    public void testWithPropertyAddAndReplace() {
        SettableBeanProperty a = prop("a");
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(a));
        SettableBeanProperty b = prop("b");

        assertSame(m, m.withProperty(b));
        assertSame(b, m.find("b"));
        assertSame(a, m.find("a"));

        SettableBeanProperty a2 = prop("a");
        m.withProperty(a2);
        assertSame(a2, m.find("a"));
        assertSame(a2, m.getPropertiesInInsertionOrder()[0]);
    }

    @Test
    public void testReplace() {
        SettableBeanProperty a = prop("a");
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(a));
        SettableBeanProperty a2 = prop("a");
        m.replace(a2);
        assertSame(a2, m.find("a"));
        assertSame(a2, m.getPropertiesInInsertionOrder()[0]);
    }

    @Test(expected = NoSuchElementException.class)
    public void testReplaceMissingThrows() {
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(prop("a")));
        m.replace(prop("b"));
    }

    @Test
    public void testRemove() {
        SettableBeanProperty a = prop("a");
        SettableBeanProperty b = prop("b");
        SettableBeanProperty c = prop("c");
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(a, b, c));
        m.remove(b);
        assertEquals(2, m.size());
        assertNull(m.find("b"));
        assertSame(a, m.find("a"));
        assertSame(c, m.find("c"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveMissingThrows() {
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(prop("a")));
        m.remove(prop("b"));
    }

    @Test
    public void testWithoutProperties() {
        SettableBeanProperty a = prop("a");
        SettableBeanProperty b = prop("b");
        SettableBeanProperty c = prop("c");
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(a, b, c));
        BeanPropertyMap m2 = m.withoutProperties(Arrays.asList("b"));
        assertNotSame(m, m2);
        assertEquals(2, m2.size());
        assertNull(m2.find("b"));
        assertSame(a, m2.find("a"));
        assertSame(c, m2.find("c"));
        assertSame(b, m.find("b"));
    }

    @Test
    public void testWithoutPropertiesEmptyReturnsSame() {
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(prop("a")));
        assertSame(m, m.withoutProperties(Collections.<String>emptyList()));
    }

    @Test
    public void testRenameAll() {
        SettableBeanProperty a = prop("a");
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(a));
        BeanPropertyMap renamed = m.renameAll(NameTransformer.simpleTransformer("prefix", ""));
        assertNotSame(m, renamed);
        assertSame(a, m.find("a"));
        assertNull(renamed.find("a"));
        assertNotNull(renamed.find("prefixa"));
        assertEquals("prefixa", renamed.iterator().next().getName());
    }

    @Test
    public void testRenameAllNullOrNopReturnsSame() {
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(prop("a")));
        assertSame(m, m.renameAll(null));
        assertSame(m, m.renameAll(NameTransformer.NOP));
    }

    @Test
    public void testIteratorAndToString() {
        BeanPropertyMap m = map(false, "a", "b");
        Set<String> names = new HashSet<String>();
        for (SettableBeanProperty p : m) {
            names.add(p.getName());
        }
        assertEquals(new HashSet<String>(Arrays.asList("a", "b")), names);
        String s = m.toString();
        assertTrue(s.contains("a"));
        assertTrue(s.contains("b"));
    }

    @Test
    public void testFindDeserializeAndSet() throws IOException {
        BeanPropertyMap m = map(false, "a");
        TestBean bean = new TestBean();
        assertTrue(m.findDeserializeAndSet(null, null, bean, "a"));
        assertEquals("a", bean.values.get("a"));
        assertFalse(m.findDeserializeAndSet(null, null, bean, "x"));
        assertEquals(1, bean.values.size());
    }

    @Test
    public void testCollisionSpillBranches() {
        SettableBeanProperty a = prop("a");
        SettableBeanProperty i = prop("i");
        SettableBeanProperty q = prop("q");
        SettableBeanProperty y = prop("y");
        BeanPropertyMap m = new BeanPropertyMap(false, Arrays.asList(a, i, q, y));
        assertSame(a, m.find("a"));
        assertSame(i, m.find("i"));
        assertSame(q, m.find("q"));
        assertSame(y, m.find("y"));
        assertNull(m.find("z"));
        assertEquals(4, m.size());
    }
}