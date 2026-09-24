package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;

import org.junit.Test;

public class BeanDeserializerFactoryTest {

    @Test
    public void testWithConfigSameInstance() {
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(cfg);
        assertSame(factory, factory.withConfig(cfg));
    }

    @Test
    public void testWithConfigDifferentInstance() {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        DeserializerFactory result = factory.withConfig(new DeserializerFactoryConfig());
        assertNotNull(result);
        assertTrue(result instanceof BeanDeserializerFactory);
        assertNotSame(factory, result);
    }

    @Test
    public void testWithConfigSubtypeThrows() {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig()) {
            private static final long serialVersionUID = 1L;
        };
        try {
            factory.withConfig(new DeserializerFactoryConfig());
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Subtype"));
        }
    }

    @Test
    public void testSimpleBeanAndBoundaryValue() throws Exception {
        SimpleBean bean = new ObjectMapper().readValue("{\"name\":\"\",\"age\":0}", SimpleBean.class);
        assertEquals("", bean.getName());
        assertEquals(0, bean.getAge());
    }

    @Test
    public void testEmptyBean() throws Exception {
        EmptyBean bean = new ObjectMapper().readValue("{}", EmptyBean.class);
        assertNotNull(bean);
    }

    @Test
    public void testIgnoredNamedProperties() throws Exception {
        IgnoreNamedBean bean = new ObjectMapper().readValue(
                "{\"visible\":\"yes\",\"secret\":\"no\"}", IgnoreNamedBean.class);
        assertEquals("yes", bean.getVisible());
        assertNull(bean.getSecret());
    }

    @Test
    public void testIgnoreUnknownProperties() throws Exception {
        IgnoreUnknownBean bean = new ObjectMapper().readValue(
                "{\"a\":\"x\",\"unknown\":1}", IgnoreUnknownBean.class);
        assertEquals("x", bean.getA());
    }

    @Test
    public void testCreatorProperties() throws Exception {
        CreatorBean bean = new ObjectMapper().readValue("{\"x\":5,\"y\":\"z\"}", CreatorBean.class);
        assertEquals(5, bean.getX());
        assertEquals("z", bean.getY());
    }

    @Test
    public void testBuilderBasedDeserializerWithCustomBuildMethod() throws Exception {
        Value v = new ObjectMapper().readValue("{\"id\":3,\"label\":\"c\"}", Value.class);
        assertEquals(3, v.getId());
        assertEquals("c", v.getLabel());
    }

    @Test
    public void testAnySetterMethod() throws Exception {
        AnySetterBean bean = new ObjectMapper().readValue("{\"a\":1,\"b\":\"x\"}", AnySetterBean.class);
        assertEquals(1, ((Number) bean.getExtra().get("a")).intValue());
        assertEquals("x", bean.getExtra().get("b"));
    }

    @Test
    public void testAnySetterField() throws Exception {
        AnySetterFieldBean bean = new ObjectMapper().readValue("{\"a\":1}", AnySetterFieldBean.class);
        assertEquals(1, ((Number) bean.extra.get("a")).intValue());
    }

    @Test
    public void testPublicFieldProperty() throws Exception {
        PublicFieldBean bean = new ObjectMapper().readValue("{\"value\":\"v\"}", PublicFieldBean.class);
        assertEquals("v", bean.value);
    }

    @Test
    public void testSetterlessCollectionProperty() throws Exception {
        GetterAsSetterBean bean = new ObjectMapper().readValue(
                "{\"items\":[\"a\",\"b\"]}", GetterAsSetterBean.class);
        assertEquals(Arrays.asList("a", "b"), bean.getItems());
    }

    @Test
    public void testObjectIdReaderPropertyGenerator() throws Exception {
        Node node = new ObjectMapper().readValue("{\"id\":1,\"next\":{\"id\":2}}", Node.class);
        assertEquals(1, node.getId());
        assertNotNull(node.getNext());
        assertEquals(2, node.getNext().getId());
    }

    @Test
    public void testThrowableDeserializer() throws Exception {
        MyProblem problem = new ObjectMapper().readValue("{\"code\":42}", MyProblem.class);
        assertNotNull(problem);
        assertEquals(42, problem.getCode());
    }

    @Test
    public void testIsPotentialBeanTypeAcceptsRegularClass() {
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        assertTrue(factory.isPotentialBeanType(SimpleBean.class));
    }

    @Test
    public void testIsPotentialBeanTypeRejectsLocalClass() {
        class LocalBean {
        }
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        try {
            factory.isPotentialBeanType(LocalBean.class);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testIsIgnorableTypeWithJsonIgnoreType() {
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig();
        BeanDeserializerFactory factory = new BeanDeserializerFactory(new DeserializerFactoryConfig());
        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        assertTrue(factory.isIgnorableType(config, null, IgnoredType.class, cache));
        assertFalse(factory.isIgnorableType(config, null, SimpleBean.class, cache));
    }

    public static class SimpleBean {
        private String name;
        private int age;

        public SimpleBean() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static class EmptyBean {
        public EmptyBean() {
        }
    }

    @JsonIgnoreProperties({"secret"})
    public static class IgnoreNamedBean {
        private String visible;
        private String secret;

        public IgnoreNamedBean() {
        }

        public void setVisible(String visible) {
            this.visible = visible;
        }

        public String getVisible() {
            return visible;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }

        public String getSecret() {
            return secret;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class IgnoreUnknownBean {
        private String a;

        public IgnoreUnknownBean() {
        }

        public void setA(String a) {
            this.a = a;
        }

        public String getA() {
            return a;
        }
    }

    public static class CreatorBean {
        private final int x;
        private String y;

        @JsonCreator
        public CreatorBean(@JsonProperty("x") int x) {
            this.x = x;
        }

        public int getX() {
            return x;
        }

        public String getY() {
            return y;
        }

        public void setY(String y) {
            this.y = y;
        }
    }

    @JsonDeserialize(builder = ValueBuilder.class)
    public static class Value {
        private final int id;
        private final String label;

        private Value(int id, String label) {
            this.id = id;
            this.label = label;
        }

        public int getId() {
            return id;
        }

        public String getLabel() {
            return label;
        }
    }

    @JsonPOJOBuilder(buildMethodName = "construct")
    public static class ValueBuilder {
        private int id;
        private String label;

        public ValueBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public ValueBuilder withLabel(String label) {
            this.label = label;
            return this;
        }

        public Value construct() {
            return new Value(id, label);
        }
    }

    public static class AnySetterBean {
        private Map<String, Object> extra = new HashMap<String, Object>();

        @JsonAnySetter
        public void add(String name, Object value) {
            extra.put(name, value);
        }

        @JsonIgnore
        public Map<String, Object> getExtra() {
            return extra;
        }
    }

    public static class AnySetterFieldBean {
        @JsonAnySetter
        public Map<String, Object> extra = new HashMap<String, Object>();
    }

    public static class PublicFieldBean {
        public String value;

        public PublicFieldBean() {
        }
    }

    public static class GetterAsSetterBean {
        private List<String> items = new ArrayList<String>();

        public GetterAsSetterBean() {
        }

        public List<String> getItems() {
            return items;
        }
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class Node {
        private int id;
        private Node next;

        public Node() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static class MyProblem extends Exception {
        private int code;

        public MyProblem() {
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }

    @JsonIgnoreType
    public static class IgnoredType {
        public IgnoredType() {
        }
    }
}