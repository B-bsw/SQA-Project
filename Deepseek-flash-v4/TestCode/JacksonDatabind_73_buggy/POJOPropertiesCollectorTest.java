package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;

public class POJOPropertiesCollectorTest {

    public static class SimpleBean {
        public int id;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class CreatorBean {
        private int x;
        private String y;

        @JsonCreator
        public CreatorBean(@JsonProperty("x") int x, @JsonProperty("y") String y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class IgnoredBean {
        public String getIgnored() {
            return "x";
        }

        @JsonIgnore
        public void setIgnored(String ignored) {
        }
    }

    public static class RenamedBean {
        @JsonProperty("renamed")
        public int original;
    }

    public static class PrefixBean {
        private String value;

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class AnyGetterBean {
        @JsonAnyGetter
        public Map<String, String> any() {
            return null;
        }
    }

    public static class DupAnyGetterBean {
        @JsonAnyGetter
        public Map<String, String> one() {
            return null;
        }

        @JsonAnyGetter
        public Map<String, String> two() {
            return null;
        }
    }

    public static class JsonValueBean {
        @JsonValue
        public String value() {
            return "v";
        }
    }

    public static class DupJsonValueBean {
        @JsonValue
        public String one() {
            return "1";
        }

        @JsonValue
        public String two() {
            return "2";
        }
    }

    public static class AnySetterBean {
        @JsonAnySetter
        public void put(String key, String value) {
        }
    }

    public static class DupAnySetterBean {
        @JsonAnySetter
        public void put1(String key, String value) {
        }

        @JsonAnySetter
        public void put2(String key, String value) {
        }
    }

    public static class AnySetterFieldBean {
        @JsonAnySetter
        public Map<String, String> map = new HashMap<String, String>();
    }

    public static class InjectableBean {
        @JacksonInject("x")
        public String value;
    }

    public static class DupInjectableBean {
        @JacksonInject("x")
        public String a;

        @JacksonInject("x")
        public String b;
    }

    @Test
    public void testAccessors() {
        POJOPropertiesCollector c = createCollector(SimpleBean.class, true, true);
        assertNotNull(c.getConfig());
        assertNotNull(c.getType());
        assertNotNull(c.getClassDef());
        assertNotNull(c.getAnnotationIntrospector());
    }

    @Test
    public void testCollectSerializationProperties() {
        POJOPropertiesCollector c = createCollector(SimpleBean.class, true, true);
        Set<String> names = propertyNames(c);
        assertTrue(names.contains("id"));
        assertTrue(names.contains("name"));
    }

    @Test
    public void testCollectWithAnnotationProcessingDisabled() {
        POJOPropertiesCollector c = createCollector(SimpleBean.class, true, false);
        assertNull(c.getAnnotationIntrospector());
        Set<String> names = propertyNames(c);
        assertTrue(names.contains("id"));
        assertTrue(names.contains("name"));
    }

    @Test
    public void testNullMutatorPrefixDefaultsToSet() {
        POJOPropertiesCollector c = createCollector(PrefixBean.class, false, true, null);
        assertTrue(propertyNames(c).contains("value"));
    }

    @Test
    public void testDeserializationCollectsCreatorProperties() {
        POJOPropertiesCollector c = createCollector(CreatorBean.class, false, true);
        Set<String> names = propertyNames(c);
        assertTrue(names.contains("x"));
        assertTrue(names.contains("y"));
    }

    @Test
    public void testIgnoredPropertyNameCollected() {
        POJOPropertiesCollector c = createCollector(IgnoredBean.class, false, true);
        assertTrue(c.getProperties().isEmpty());
        assertNotNull(c.getIgnoredPropertyNames());
        assertTrue(c.getIgnoredPropertyNames().contains("ignored"));
    }

    @Test
    public void testRenameWithJsonProperty() {
        POJOPropertiesCollector c = createCollector(RenamedBean.class, true, true);
        Set<String> names = propertyNames(c);
        assertTrue(names.contains("renamed"));
        assertFalse(names.contains("original"));
    }

    @Test
    public void testGettersReturnNullWithoutSpecialAnnotations() {
        POJOPropertiesCollector c = createCollector(SimpleBean.class, true, true);
        assertNull(c.getJsonValueMethod());
        assertNull(c.getAnyGetter());
        assertNull(c.getAnySetterMethod());
        assertNull(c.getAnySetterField());
        assertNull(c.getInjectables());
        assertNull(c.getObjectIdInfo());
        assertNull(c.findPOJOBuilderClass());
    }

    @Test
    public void testAnyGetterDetected() {
        POJOPropertiesCollector c = createCollector(AnyGetterBean.class, true, true);
        assertEquals("any", c.getAnyGetter().getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateAnyGetterFails() {
        createCollector(DupAnyGetterBean.class, true, true).getAnyGetter();
    }

    @Test
    public void testJsonValueMethodDetected() {
        POJOPropertiesCollector c = createCollector(JsonValueBean.class, true, true);
        assertEquals("value", c.getJsonValueMethod().getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateJsonValueFails() {
        createCollector(DupJsonValueBean.class, true, true).getJsonValueMethod();
    }

    @Test
    public void testAnySetterMethodDetected() {
        POJOPropertiesCollector c = createCollector(AnySetterBean.class, false, true);
        assertEquals("put", c.getAnySetterMethod().getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateAnySetterFails() {
        createCollector(DupAnySetterBean.class, false, true).getAnySetterMethod();
    }

    @Test
    public void testAnySetterFieldDetected() {
        POJOPropertiesCollector c = createCollector(AnySetterFieldBean.class, true, true);
        assertEquals("map", c.getAnySetterField().getName());
    }

    @Test
    public void testInjectableCollected() {
        POJOPropertiesCollector c = createCollector(InjectableBean.class, true, true);
        Map<Object, AnnotatedMember> injectables = c.getInjectables();
        assertNotNull(injectables);
        assertEquals(1, injectables.size());
        assertEquals("value", injectables.values().iterator().next().getName());
    }

    @Test
    public void testDuplicateInjectableFails() {
        POJOPropertiesCollector c = createCollector(DupInjectableBean.class, true, true);
        try {
            c.getInjectables();
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Duplicate"));
        }
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testCollectReturnsThis() {
        POJOPropertiesCollector c = createCollector(SimpleBean.class, true, true);
        assertSame(c, c.collect());
    }

    private POJOPropertiesCollector createCollector(Class<?> cls, boolean forSerialization,
            boolean useAnnotations) {
        return createCollector(cls, forSerialization, useAnnotations, "set");
    }

    private POJOPropertiesCollector createCollector(Class<?> cls, boolean forSerialization,
            boolean useAnnotations, String mutatorPrefix) {
        ObjectMapper mapper = new ObjectMapper();
        if (forSerialization) {
            SerializationConfig config = mapper.getSerializationConfig();
            if (!useAnnotations) {
                config = config.without(MapperFeature.USE_ANNOTATIONS);
            }
            JavaType type = config.getTypeFactory().constructType(cls);
            AnnotatedClass classDef = config.introspect(type).getClassInfo();
            return new POJOPropertiesCollector(config, true, type, classDef, mutatorPrefix);
        }
        DeserializationConfig config = mapper.getDeserializationConfig();
        if (!useAnnotations) {
            config = config.without(MapperFeature.USE_ANNOTATIONS);
        }
        JavaType type = config.getTypeFactory().constructType(cls);
        AnnotatedClass classDef = config.introspect(type).getClassInfo();
        return new POJOPropertiesCollector(config, false, type, classDef, mutatorPrefix);
    }

    private Set<String> propertyNames(POJOPropertiesCollector collector) {
        Set<String> names = new HashSet<String>();
        for (BeanPropertyDefinition prop : collector.getProperties()) {
            names.add(prop.getName());
        }
        return names;
    }
}