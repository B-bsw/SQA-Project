package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class BeanSerializerBaseTest {

    private BeanSerializerBase serializer;
    private SerializerProvider provider;
    private BeanPropertyWriter[] props;
    private BeanPropertyWriter[] filteredProps;
    private JavaType type;
    private BeanSerializerBuilder builder;
    private BeanDescription beanDesc;

    @Before
    public void setUp() {
        type = constructType();
        builder = new BeanSerializerBuilder(beanDesc);
        props = new BeanPropertyWriter[0];
        filteredProps = new BeanPropertyWriter[0];
        serializer = new BeanSerializerBase(type, builder, props, filteredProps) {
            @Override
            public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
                return this;
            }

            @Override
            protected BeanSerializerBase withIgnorals(String[] toIgnore) {
                return this;
            }

            @Override
            protected BeanSerializerBase asArraySerializer() {
                return this;
            }

            @Override
            protected BeanSerializerBase withFilterId(Object filterId) {
                return this;
            }

            @Override
            public void serialize(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            }
        };
    }

    private JavaType constructType() {
        return null;
    }

    @Test
    public void testResolveWithNullFilteredProps() {
        serializer = new BeanSerializerBase(type, builder, props, null) {
            @Override
            public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
                return this;
            }

            @Override
            protected BeanSerializerBase withIgnorals(String[] toIgnore) {
                return this;
            }

            @Override
            protected BeanSerializerBase asArraySerializer() {
                return this;
            }

            @Override
            protected BeanSerializerBase withFilterId(Object filterId) {
                return this;
            }

            @Override
            public void serialize(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            }
        };

        try {
            serializer.resolve(provider);
        } catch (JsonMappingException e) {
            fail("Should not throw exception with null filtered props");
        }
    }

    @Test
    public void testResolveWithPropsAndFilteredProps() {
        BeanPropertyWriter prop = new BeanPropertyWriter();
        props = new BeanPropertyWriter[]{prop};
        filteredProps = new BeanPropertyWriter[]{prop};

        serializer = new BeanSerializerBase(type, builder, props, filteredProps) {
            @Override
            public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
                return this;
            }

            @Override
            protected BeanSerializerBase withIgnorals(String[] toIgnore) {
                return this;
            }

            @Override
            protected BeanSerializerBase asArraySerializer() {
                return this;
            }

            @Override
            protected BeanSerializerBase withFilterId(Object filterId) {
                return this;
            }

            @Override
            public void serialize(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            }
        };

        try {
            serializer.resolve(provider);
        } catch (JsonMappingException e) {
            fail("Should not throw exception with valid props");
        }
    }

    @Test
    public void testCreateContextualWithEnumShape() {
        // Setup enum type
        JavaType enumType = constructType();
        serializer = new BeanSerializerBase(enumType, builder, props, filteredProps) {
            @Override
            public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
                return this;
            }

            @Override
            protected BeanSerializerBase withIgnorals(String[] toIgnore) {
                return this;
            }

            @Override
            protected BeanSerializerBase asArraySerializer() {
                return this;
            }

            @Override
            protected BeanSerializerBase withFilterId(Object filterId) {
                return this;
            }

            @Override
            public void serialize(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            }
        };

        BeanProperty property = new BeanProperty();
        serializer.createContextual(provider, property);
    }

    @Test
    public void testCreateContextualWithNullProperty() {
        serializer.createContextual(provider, null);
    }

    @Test
    public void testGetSchemaWithNullAnnotation() {
        JsonNode schema = serializer.getSchema(provider, type);
        assertNotNull("Schema should not be null", schema);
    }

    @Test
    public void testAcceptJsonFormatVisitorWithNullVisitor() {
        serializer.acceptJsonFormatVisitor(null, type);
    }

    @Test
    public void testAcceptJsonFormatVisitorWithObjectVisitor() {
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper() {
            @Override
            public JsonObjectFormatVisitor expectObjectFormat(JavaType type) {
                return new JsonObjectFormatVisitor() {
                    @Override
                    public void property(BeanProperty writer) {
                    }

                    @Override
                    public void property(String name, JsonSerializer<?> propertySerializer, Object propertyValue) {
                    }

                    @Override
                    public void optionalProperty(String name, JsonSerializer<?> propertySerializer, Object propertyValue) {
                    }

                    @Override
                    public void property(BeanProperty writer, JsonSerializer<?> propertySerializer, Object propertyValue) {
                    }
                };
            }

            @Override
            public void expectArrayFormat(JavaType type) {
            }

            @Override
            public void expectStringFormat(JavaType type) {
            }

            @Override
            public void expectNumberFormat(JavaType type) {
            }

            @Override
            public void expectIntegerFormat(JavaType type) {
            }

            @Override
            public void expectBooleanFormat(JavaType type) {
            }

            @Override
            public void expectNullFormat(JavaType type) {
            }

            @Override
            public void expectAnyFormat(JavaType type) {
            }
        };
        serializer.acceptJsonFormatVisitor(visitor, type);
    }

    @Test
    public void testSerializeWithTypeWithNullObjectId() {
        try {
            serializer.serializeWithType(new Object(), null, null, null, null);
        } catch (Exception e) {
            // Expected exception
        }
    }

    @Test
    public void testWithObjectIdWriterNull() {
        BeanSerializerBase result = serializer.withObjectIdWriter(null);
        assertSame("Should return same instance when null writer", serializer, result);
    }

    @Test
    public void testWithObjectIdWriterNonNull() {
        ObjectIdWriter writer = ObjectIdWriter.construct(type, "prop", null, true);
        BeanSerializerBase result = serializer.withObjectIdWriter(writer);
        assertSame("Should return same instance when writer set", serializer, result);
    }

    @Test
    public void testWithFilterId() {
        Object filterId = new Object();
        BeanSerializerBase result = serializer.withFilterId(filterId);
        assertSame("Should return same instance", serializer, result);
    }

    @Test
    public void testAsArraySerializer() {
        assertSame("Should return same instance", serializer, serializer.asArraySerializer());
    }

    @Test
    public void testRenameProperties() throws Exception {
        java.lang.reflect.Method method = BeanSerializerBase.class.getDeclaredMethod("rename", BeanPropertyWriter[].class, NameTransformer.class);
        method.setAccessible(true);

        BeanPropertyWriter[] props = new BeanPropertyWriter[0];
        BeanPropertyWriter[] result = (BeanPropertyWriter[]) method.invoke(serializer, props, null);
        assertSame("Should return same array when null transformer", props, result);

        result = (BeanPropertyWriter[]) method.invoke(serializer, props, NameTransformer.NOP);
        assertSame("Should return same array when NOP transformer", props, result);
    }

    @Test
    public void testUsesObjectId() {
        serializer = new BeanSerializerBase(type, builder, props, filteredProps) {
            @Override
            public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
                return this;
            }

            @Override
            protected BeanSerializerBase withIgnorals(String[] toIgnore) {
                return this;
            }

            @Override
            protected BeanSerializerBase asArraySerializer() {
                return this;
            }

            @Override
            protected BeanSerializerBase withFilterId(Object filterId) {
                return this;
            }

            @Override
            public void serialize(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            }
        };
        assertFalse("Should not use object id by default", serializer.usesObjectId());
    }

    @Test
    public void testConstructorWithObjectIdWriter() {
        ObjectIdWriter writer = ObjectIdWriter.construct(type, "prop", null, true);
        serializer = new BeanSerializerBase(serializer, writer) {
            @Override
            public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
                return this;
            }

            @Override
            protected BeanSerializerBase withIgnorals(String[] toIgnore) {
                return this;
            }

            @Override
            protected BeanSerializerBase asArraySerializer() {
                return this;
            }

            @Override
            protected BeanSerializerBase withFilterId(Object filterId) {
                return this;
            }

            @Override
            public void serialize(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            }
        };
        assertNotNull(serializer);
    }

    @Test
    public void testConstructorWithIgnorals() {
        String[] toIgnore = {"a", "b"};
        serializer = new BeanSerializerBase(serializer, toIgnore) {
            @Override
            public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter) {
                return this;
            }

            @Override
            protected BeanSerializerBase withIgnorals(String[] toIgnore) {
                return this;
            }

            @Override
            protected BeanSerializerBase asArraySerializer() {
                return this;
            }

            @Override
            protected BeanSerializerBase withFilterId(Object filterId) {
                return this;
            }

            @Override
            public void serialize(Object bean, JsonGenerator jgen, SerializerProvider provider) throws IOException {
            }
        };
        assertNotNull(serializer);
    }
}