package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.util.NameTransformer;

import sun.misc.Unsafe;

public class BeanDeserializerBaseTest {

    private static final Unsafe UNSAFE = getUnsafe();
    private static final ObjectMapper MAPPER = new ObjectMapper();

    private TestBeanDeserializer deser;

    @Before
    public void setUp() {
        deser = newDeserializer();
    }

    private static Unsafe getUnsafe() {
        try {
            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            return (Unsafe) f.get(null);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    private static void setField(Object target, String name, Object value) {
        try {
            Field f = BeanDeserializerBase.class.getDeclaredField(name);
            long offset = UNSAFE.objectFieldOffset(f);
            Class<?> type = f.getType();
            if (type == boolean.class) {
                UNSAFE.putBoolean(target, offset, ((Boolean) value).booleanValue());
            } else if (type == int.class) {
                UNSAFE.putInt(target, offset, ((Integer) value).intValue());
            } else {
                UNSAFE.putObject(target, offset, value);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static BeanPropertyMap emptyBeanPropertyMap() {
        try {
            for (Method m : BeanPropertyMap.class.getDeclaredMethods()) {
                if (m.getName().equals("construct")
                        && Modifier.isStatic(m.getModifiers())
                        && m.getParameterTypes().length == 2
                        && m.getParameterTypes()[1] == Boolean.TYPE) {
                    m.setAccessible(true);
                    return (BeanPropertyMap) m.invoke(null,
                            new LinkedHashMap<String, SettableBeanProperty>(),
                            Boolean.FALSE);
                }
            }
            throw new IllegalStateException("Cannot find BeanPropertyMap.construct");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static TestBeanDeserializer newDeserializer() {
        try {
            TestBeanDeserializer d = (TestBeanDeserializer) UNSAFE.allocateInstance(TestBeanDeserializer.class);
            setField(d, "_beanType", MAPPER.constructType(SimpleBean.class));
            setField(d, "_beanProperties", emptyBeanPropertyMap());
            setField(d, "_valueInstantiator", new StubValueInstantiator());
            setField(d, "_ignorableProps", null);
            setField(d, "_ignoreAllUnknown", Boolean.FALSE);
            setField(d, "_needViewProcesing", Boolean.FALSE);
            setField(d, "_backRefs", null);
            setField(d, "_injectables", null);
            setField(d, "_objectIdReader", null);
            setField(d, "_delegateDeserializer", null);
            setField(d, "_arrayDelegateDeserializer", null);
            setField(d, "_propertyBasedCreator", null);
            setField(d, "_unwrappedPropertyHandler", null);
            setField(d, "_externalTypeIdHandler", null);
            setField(d, "_subDeserializers", null);
            setField(d, "_anySetter", null);
            setField(d, "_nonStandardCreation", Boolean.FALSE);
            setField(d, "_vanillaProcessing", Boolean.TRUE);
            setField(d, "_serializationShape", null);
            return d;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static DeserializationContext createContext(ObjectMapper mapper, JsonParser p) {
        try {
            Method m = ObjectMapper.class.getDeclaredMethod(
                    "createDeserializationContext", JsonParser.class, DeserializationConfig.class);
            m.setAccessible(true);
            return (DeserializationContext) m.invoke(mapper, p, mapper.getDeserializationConfig());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testBasicMetadata() {
        assertTrue(deser.isCachable());
        assertEquals(SimpleBean.class, deser.handledType());
        assertEquals(SimpleBean.class, deser.getBeanClass());
        assertEquals(SimpleBean.class, deser.getValueType().getRawClass());
        assertEquals("stub", deser.getValueInstantiator().getValueTypeDesc());
    }

    @Test
    public void testEmptyPropertyAccessors() {
        assertFalse(deser.hasViews());
        assertEquals(0, deser.getPropertyCount());
        assertFalse(deser.hasProperty("name"));
        assertEquals(0, deser.getKnownPropertyNames().size());
        assertFalse(deser.properties().hasNext());
        assertFalse(deser.creatorProperties().hasNext());
        assertNull(deser.findProperty("name"));
        assertNull(deser.findProperty(new PropertyName("name")));
        assertNull(deser.findProperty(0));
        assertNull(deser.findBackReference("back"));
    }

    @Test
    public void testNullBeanPropertyMapBehavior() {
        setField(deser, "_beanProperties", null);
        try {
            deser.properties();
            fail("Should throw IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
        assertNull(deser.findProperty("name"));
        assertNull(deser.findProperty(new PropertyName("name")));
        assertNull(deser.findProperty(0));
    }

    @Test
    public void testWithBeanPropertiesUnsupported() {
        try {
            deser.withBeanProperties(emptyBeanPropertyMap());
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testDeserializeFromString() throws Exception {
        JsonParser p = MAPPER.getFactory().createParser("\"hello\"");
        p.nextToken();
        DeserializationContext ctxt = createContext(MAPPER, p);
        Object result = deser.deserializeFromString(p, ctxt);
        assertNotNull(result);
        assertTrue(result instanceof SimpleBean);
        p.close();
    }

    @Test
    public void testDeserializeFromNumber() throws Exception {
        JsonParser p = MAPPER.getFactory().createParser("42");
        p.nextToken();
        DeserializationContext ctxt = createContext(MAPPER, p);
        Object result = deser.deserializeFromNumber(p, ctxt);
        assertNotNull(result);
        assertTrue(result instanceof SimpleBean);
        p.close();
    }

    @Test
    public void testDeserializeFromDouble() throws Exception {
        JsonParser p = MAPPER.getFactory().createParser("3.25");
        p.nextToken();
        DeserializationContext ctxt = createContext(MAPPER, p);
        Object result = deser.deserializeFromDouble(p, ctxt);
        assertNotNull(result);
        assertTrue(result instanceof SimpleBean);
        p.close();
    }

    @Test
    public void testDeserializeFromBoolean() throws Exception {
        JsonParser p = MAPPER.getFactory().createParser("true");
        p.nextToken();
        DeserializationContext ctxt = createContext(MAPPER, p);
        Object result = deser.deserializeFromBoolean(p, ctxt);
        assertNotNull(result);
        assertTrue(result instanceof SimpleBean);
        p.close();
    }

    @Test
    public void testDeserializeFromArrayRejected() throws Exception {
        JsonParser p = MAPPER.getFactory().createParser("[]");
        p.nextToken();
        DeserializationContext ctxt = createContext(MAPPER, p);
        try {
            deser.deserializeFromArray(p, ctxt);
            fail("Should throw JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
        p.close();
    }

    @Test
    public void testDeserializeFromObjectUsingNonDefaultWithDelegate() throws Exception {
        setField(deser, "_delegateDeserializer", new StubDeserializer("delegate"));
        Object result = deser.callDeserializeFromObjectUsingNonDefault(null, null);
        assertNotNull(result);
        assertTrue(result instanceof SimpleBean);
    }

    @Test
    public void testDeserializeFromObjectUsingNonDefaultMissing() throws Exception {
        JsonParser p = MAPPER.getFactory().createParser("{}");
        p.nextToken();
        DeserializationContext ctxt = createContext(MAPPER, p);
        try {
            deser.callDeserializeFromObjectUsingNonDefault(p, ctxt);
            fail("Should throw JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
        p.close();
    }

    @Test
    public void testHandleUnknownPropertyIgnoreAll() throws Exception {
        setField(deser, "_ignoreAllUnknown", Boolean.TRUE);
        JsonParser p = MAPPER.getFactory().createParser("{}");
        p.nextToken();
        DeserializationContext ctxt = createContext(MAPPER, p);
        deser.callHandleUnknownProperty(p, ctxt, new SimpleBean(), "unknown");
        p.close();
    }

    @Test
    public void testHandleIgnoredPropertyFailsWhenConfigured() throws Exception {
        ObjectMapper failingMapper = new ObjectMapper();
        failingMapper.enable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
        setField(deser, "_ignorableProps", new HashSet<String>(Arrays.asList("ignored")));

        JsonParser p = failingMapper.getFactory().createParser("{\"ignored\":1}");
        p.nextToken();
        p.nextToken();
        DeserializationContext ctxt = createContext(failingMapper, p);
        try {
            deser.callHandleIgnoredProperty(p, ctxt, new SimpleBean(), "ignored");
            fail("Should throw IgnoredPropertyException");
        } catch (IgnoredPropertyException e) {
            // expected
        }
        p.close();
    }

    @Test
    public void testWrapAndThrowVariants() throws IOException {
        try {
            deser.wrapAndThrow(new RuntimeException("runtime"), new SimpleBean(), "field", null);
            fail("Should throw JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }

        try {
            deser.wrapAndThrow(new IOException("io"), new SimpleBean(), "field", null);
            fail("Should throw IOException");
        } catch (IOException e) {
            assertEquals("io", e.getMessage());
        }

        try {
            deser.wrapAndThrow(new AssertionError("err"), new SimpleBean(), "field", null);
            fail("Should throw AssertionError");
        } catch (AssertionError e) {
            assertEquals("err", e.getMessage());
        }
    }

    public static class SimpleBean {
        public String name;
        public int age;
    }

    static class StubValueInstantiator extends ValueInstantiator {
        @Override
        public String getValueTypeDesc() {
            return "stub";
        }

        @Override
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override
        public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
            return new SimpleBean();
        }

        @Override
        public boolean canCreateUsingDelegate() {
            return true;
        }

        @Override
        public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException {
            return new SimpleBean();
        }

        @Override
        public boolean canCreateUsingArrayDelegate() {
            return false;
        }

        @Override
        public boolean canCreateFromObjectWith() {
            return false;
        }

        @Override
        public boolean canCreateFromInt() {
            return true;
        }

        @Override
        public Object createFromInt(DeserializationContext ctxt, int value) throws IOException {
            return new SimpleBean();
        }

        @Override
        public boolean canCreateFromLong() {
            return true;
        }

        @Override
        public Object createFromLong(DeserializationContext ctxt, long value) throws IOException {
            return new SimpleBean();
        }

        @Override
        public boolean canCreateFromString() {
            return true;
        }

        @Override
        public Object createFromString(DeserializationContext ctxt, String value) throws IOException {
            return new SimpleBean();
        }

        @Override
        public boolean canCreateFromDouble() {
            return true;
        }

        @Override
        public Object createFromDouble(DeserializationContext ctxt, double value) throws IOException {
            return new SimpleBean();
        }

        @Override
        public boolean canCreateFromBoolean() {
            return true;
        }

        @Override
        public Object createFromBoolean(DeserializationContext ctxt, boolean value) throws IOException {
            return new SimpleBean();
        }
    }

    static class StubDeserializer extends JsonDeserializer<Object> {
        private final Object value;

        StubDeserializer(Object value) {
            this.value = value;
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return value;
        }
    }

    static class TestBeanDeserializer extends BeanDeserializerBase {
        TestBeanDeserializer() {
            super((BeanDeserializerBase) null);
        }

        @Override
        public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper) {
            return this;
        }

        @Override
        public BeanDeserializerBase withObjectIdReader(ObjectIdReader oir) {
            return this;
        }

        @Override
        public BeanDeserializerBase withIgnorableProperties(Set<String> ignorableProps) {
            return this;
        }

        @Override
        protected BeanDeserializerBase asArrayDeserializer() {
            return this;
        }

        @Override
        public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            return null;
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        public Object callDeserializeFromObjectUsingNonDefault(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            return deserializeFromObjectUsingNonDefault(p, ctxt);
        }

        public void callHandleUnknownProperty(JsonParser p, DeserializationContext ctxt,
                Object bean, String propName) throws IOException {
            handleUnknownProperty(p, ctxt, bean, propName);
        }

        public void callHandleIgnoredProperty(JsonParser p, DeserializationContext ctxt,
                Object bean, String propName) throws IOException {
            handleIgnoredProperty(p, ctxt, bean, propName);
        }
    }
}