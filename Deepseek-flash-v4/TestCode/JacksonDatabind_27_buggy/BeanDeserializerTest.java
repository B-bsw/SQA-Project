package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;

public class BeanDeserializerTest {

    private static class TestBean {
        private String name;
        private int age;
        public TestBean() {}
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
    }

    private static class TestBeanDeserializer extends BeanDeserializer {
        private static final long serialVersionUID = 1L;
        public TestBeanDeserializer() {
            super(constructBase(), null, null, null, null, false, false);
        }
        private static BeanDeserializerBase constructBase() {
            return null;
        }
    }

    private JsonParser parser;
    private DeserializationContext ctxt;
    private ObjectMapper mapper;
    private BeanDeserializerBuilder builder;
    private JavaType type;

    @Before
    public void setUp() throws Exception {
        mapper = new ObjectMapper();
        type = mapper.constructType(TestBean.class);
        builder = new BeanDeserializerBuilder(new BeanDescription(type, null, mapper), null, false);
    }

    @Test
    public void testUnwrappingDeserializerWhenClassNotExact() {
        BeanDeserializer base = new BeanDeserializer(builder, null, null, null, null, false, false);
        BeanDeserializer subclass = new BeanDeserializer(base, false) {
            private static final long serialVersionUID = 1L;
        };
        assertSame(subclass, subclass.unwrappingDeserializer(null));
    }

    @Test
    public void testWithObjectIdReader() throws Exception {
        BeanDeserializer deser = new BeanDeserializer(builder, null, null, null, null, false, false);
        ObjectIdReader oir = null;
        BeanDeserializer result = deser.withObjectIdReader(oir);
        assertNotNull(result);
        assertEquals(oir, result.getObjectIdReader());
    }

    @Test
    public void testWithIgnorableProperties() {
        BeanDeserializer deser = new BeanDeserializer(builder, null, null, null, null, false, false);
        HashSet<String> ignorable = new HashSet<>();
        ignorable.add("test");
        BeanDeserializer result = deser.withIgnorableProperties(ignorable);
        assertNotNull(result);
        assertNotNull(result.getObjectIdReader());
    }

    @Test
    public void testDeserializeWithNullToken() throws IOException {
        BeanDeserializer deser = new BeanDeserializer(builder, null, null, null, null, false, false);
        parser = mapper.getFactory().createParser("null");
        parser.nextToken();
        try {
            deser.deserialize(parser, ctxt);
            fail("Should throw exception for null token");
        } catch (IOException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test(expected = IOException.class)
    public void testDeserializeWithMissingToken() throws IOException {
        BeanDeserializer deser = new BeanDeserializer(builder, null, null, null, null, false, false);
        parser = mapper.getFactory().createParser("");
        deser.deserialize(parser, ctxt);
    }

    @Test
    public void testVanillaDeserialize() throws IOException {
        builder.addProperty(new SettableBeanProperty("name", 0, type, null, false));
        BeanDeserializer deser = new BeanDeserializer(builder, null, null, null, null, false, false);
        String json = "{\"name\":\"test\"}";
        parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        parser.nextToken();
        Object result = deser.deserialize(parser, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserializeUsingPropertyBasedWithUnwrapped() throws IOException {
        builder.addCreatorProperty(new SettableBeanProperty("id", 0, type, null, false));
        BeanDeserializer deser = new BeanDeserializer(builder, null, null, null, null, false, false);
        String json = "{\"id\":1,\"name\":\"test\"}";
        parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        parser.nextToken();
        try {
            deser.deserialize(parser, ctxt);
            fail("Expected exception");
        } catch (Exception e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testDeserializeWithObjectId() throws IOException {
        builder.addProperty(new SettableBeanProperty("name", 0, type, null, false));
        BeanDeserializer deser = new BeanDeserializer(builder, null, null, null, null, false, false);
        String json = "{\"@id\":\"abc\",\"name\":\"test\"}";
        parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        parser.nextToken();
        Object result = deser.deserialize(parser, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserializeFromObjectWithUnknownProperties() throws IOException {
        builder.addProperty(new SettableBeanProperty("name", 0, type, null, false));
        HashSet<String> ignorable = new HashSet<>();
        ignorable.add("ignored");
        BeanDeserializer deser = new BeanDeserializer(builder, null, null, null, ignorable, true, false);
        String json = "{\"name\":\"test\",\"unknown\":\"value\"}";
        parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        parser.nextToken();
        Object result = deser.deserialize(parser, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserializeWithExternalTypeId() throws IOException {
        builder.addProperty(new SettableBeanProperty("name", 0, type, null, false));
        BeanDeserializer deser = new BeanDeserializer(builder, null, null, null, null, false, false);
        String json = "{\"@type\":\"test\",\"name\":\"value\"}";
        parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        parser.nextToken();
        try {
            deser.deserialize(parser, ctxt);
            fail("Expected exception");
        } catch (Exception e) {
            assertNotNull(e.getMessage());
        }
    }
}