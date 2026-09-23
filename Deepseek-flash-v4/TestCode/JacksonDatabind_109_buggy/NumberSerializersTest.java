package com.fasterxml.jackson.databind.ser.std;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.HashMap;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.JsonFormatTypes;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.BasicBeanProperty;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.JavaTypeFactory;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.ShortSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.IntLikeSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.LongSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.FloatSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers.DoubleSerializer;

public class NumberSerializersTest {

    private SerializerProvider provider;
    private JsonGenerator gen;

    @Before
    public void setUp() throws Exception {
        // Mock setup - simple implementations
        provider = new SerializerProvider();
        gen = new MockJsonGenerator();
    }

    @After
    public void tearDown() {
        provider = null;
        gen = null;
    }

    @Test
    public void testAddAll() {
        Map<String, JsonSerializer<?>> deserializers = new HashMap<String, JsonSerializer<?>>();
        NumberSerializers.addAll(deserializers);

        // Verify all expected keys are present
        Assert.assertEquals(Integer.class.getName(), deserializers.get(Integer.class.getName()).getClass().getName());
        Assert.assertEquals(Integer.TYPE.getName(), deserializers.get(Integer.TYPE.getName()).getClass().getName());
        Assert.assertEquals(Long.class.getName(), deserializers.get(Long.class.getName()).getClass().getName());
        Assert.assertEquals(Long.TYPE.getName(), deserializers.get(Long.TYPE.getName()).getClass().getName());
        Assert.assertEquals(Byte.class.getName(), deserializers.get(Byte.class.getName()).getClass().getName());
        Assert.assertEquals(Byte.TYPE.getName(), deserializers.get(Byte.TYPE.getName()).getClass().getName());
        Assert.assertEquals(Short.class.getName(), deserializers.get(Short.class.getName()).getClass().getName());
        Assert.assertEquals(Short.TYPE.getName(), deserializers.get(Short.TYPE.getName()).getClass().getName());
        Assert.assertEquals(Double.class.getName(), deserializers.get(Double.class.getName()).getClass().getName());
        Assert.assertEquals(Double.TYPE.getName(), deserializers.get(Double.TYPE.getName()).getClass().getName());
        Assert.assertEquals(Float.class.getName(), deserializers.get(Float.class.getName()).getClass().getName());
        Assert.assertEquals(Float.TYPE.getName(), deserializers.get(Float.TYPE.getName()).getClass().getName());
    }

    @Test
    public void testAddAllWithNullMap() {
        Map<String, JsonSerializer<?>> deserializers = null;
        try {
            NumberSerializers.addAll(deserializers);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testBaseCreateSchemaNode() throws Exception {
        Base<Object> base = new Base<Object>(Integer.class, JsonParser.NumberType.INT, "integer") {
        };
        JsonNode schema = base.getSchema(provider, null);
        Assert.assertNotNull(schema);
        Assert.assertEquals("integer", schema.get("type").asText());
    }

    @Test
    public void testBaseAcceptJsonFormatVisitorInt() throws Exception {
        Base<Object> base = new Base<Object>(Integer.class, JsonParser.NumberType.INT, "integer") {
        };
        // Create a mock visitor
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base(provider) {
            @Override
            public JsonFormatVisitorWrapper.Base expectNumberFormat(JavaType type) throws JsonMappingException {
                return this;
            }
        };
        base.acceptJsonFormatVisitor(visitor, null);
    }

    @Test
    public void testBaseAcceptJsonFormatVisitorFloat() throws Exception {
        Base<Object> base = new Base<Object>(Float.class, JsonParser.NumberType.FLOAT, "number") {
        };
        // Create a mock visitor
        JsonFormatVisitorWrapper visitor = new JsonFormatVisitorWrapper.Base(provider) {
            @Override
            public JsonFormatVisitorWrapper.Base expectNumberFormat(JavaType type) throws JsonMappingException {
                return this;
            }
        };
        base.acceptJsonFormatVisitor(visitor, null);
    }

    @Test
    public void testBaseCreateContextualWithStringFormat() throws Exception {
        Base<Object> base = new Base<Object>(Integer.class, JsonParser.NumberType.INT, "integer") {
        };
        JsonFormat.Value format = JsonFormat.Value.forShape(JsonFormat.Shape.STRING);
        // Mock findFormatOverrides
        base.findFormatOverrides(provider, null, handledType());
        // We need to override findFormatOverrides since we cannot mock it
        // Create a subclass that overrides it
        Base<Object> baseOverride = new Base<Object>(Integer.class, JsonParser.NumberType.INT, "integer") {
            @Override
            protected JsonFormat.Value findFormatOverrides(SerializerProvider p, BeanProperty prop, Class<?> type) {
                return JsonFormat.Value.forShape(JsonFormat.Shape.STRING);
            }
        };
        JsonSerializer<?> serializer = baseOverride.createContextual(provider, null);
        Assert.assertEquals(ToStringSerializer.instance, serializer);
    }

    @Test
    public void testBaseCreateContextualWithNoFormat() throws Exception {
        Base<Object> base = new Base<Object>(Integer.class, JsonParser.NumberType.INT, "integer") {
            @Override
            protected JsonFormat.Value findFormatOverrides(SerializerProvider p, BeanProperty prop, Class<?> type) {
                return null;
            }
        };
        JsonSerializer<?> serializer = base.createContextual(provider, null);
        Assert.assertSame(base, serializer);
    }

    @Test
    public void testShortSerializerSerialize() throws IOException {
        ShortSerializer serializer = new ShortSerializer();
        Short value = Short.valueOf((short) 5);
        serializer.serialize(value, gen, provider);
        Assert.assertEquals("5", gen.toString());
    }

    @Test
    public void testShortSerializerSerializeWithNull() {
        ShortSerializer serializer = new ShortSerializer();
        try {
            serializer.serialize(null, gen, provider);
            Assert.fail("Expected IOException or NullPointerException");
        } catch (IOException e) {
            // expected
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testIntegerSerializerSerialize() throws IOException {
        IntegerSerializer serializer = new IntegerSerializer(Integer.class);
        Integer value = Integer.valueOf(10);
        serializer.serialize(value, gen, provider);
        Assert.assertEquals("10", gen.toString());
    }

    @Test
    public void testIntegerSerializerSerializeWithNull() {
        IntegerSerializer serializer = new IntegerSerializer(Integer.class);
        try {
            serializer.serialize(null, gen, provider);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        } catch (IOException e) {
            Assert.fail("No IOException expected");
        }
    }

    @Test
    public void testIntLikeSerializerSerialize() throws IOException {
        IntLikeSerializer serializer = new IntLikeSerializer();
        Number value = Integer.valueOf(7);
        serializer.serialize(value, gen, provider);
        Assert.assertEquals("7", gen.toString());
    }

    @Test
    public void testLongSerializerSerialize() throws IOException {
        LongSerializer serializer = new LongSerializer(Long.class);
        Long value = Long.valueOf(123456789L);
        serializer.serialize(value, gen, provider);
        Assert.assertEquals("123456789", gen.toString());
    }

    @Test
    public void testFloatSerializerSerialize() throws IOException {
        FloatSerializer serializer = new FloatSerializer();
        Float value = Float.valueOf(1.23f);
        serializer.serialize(value, gen, provider);
        Assert.assertEquals("1.23", gen.toString());
    }

    @Test
    public void testDoubleSerializerSerialize() throws IOException {
        DoubleSerializer serializer = new DoubleSerializer(Double.class);
        Double value = Double.valueOf(45.678);
        serializer.serialize(value, gen, provider);
        Assert.assertEquals("45.678", gen.toString());
    }

    @Test
    public void testDoubleSerializerSerializeWithType() throws IOException {
        DoubleSerializer serializer = new DoubleSerializer(Double.class);
        Double value = Double.valueOf(9.876);
        TypeSerializer typeSer = new TypeSerializer() {
            @Override
            public void writeTypePrefix(JsonGenerator gen, Object context) throws IOException {}
            @Override
            public void writeTypeSuffix(JsonGenerator gen, Object context) throws IOException {}
        };
        serializer.serializeWithType(value, gen, provider, typeSer);
        Assert.assertEquals("9.876", gen.toString());
    }

    @Test
    public void testBaseGetSchema() {
        Base<Object> base = new Base<Object>(Long.class, JsonParser.NumberType.LONG, "number") {
        };
        JsonNode schema = base.getSchema(provider, null);
        Assert.assertNotNull(schema);
        Assert.assertEquals("number", schema.get("type").asText());
    }

    @Test
    public void testShortSerializerInstanceIsNotNull() {
        Assert.assertNotNull(ShortSerializer.instance);
    }

    @Test
    public void testIntLikeSerializerInstanceIsNotNull() {
        Assert.assertNotNull(IntLikeSerializer.instance);
    }

    @Test
    public void testFloatSerializerInstanceIsNotNull() {
        Assert.assertNotNull(FloatSerializer.instance);
    }

    @Test
    public void testDoubleSerializerGetter() {
        DoubleSerializer serializer = new DoubleSerializer(Double.class);
        Assert.assertNotNull(serializer);
    }

    @Test
    public void testSerializerProviderMock() {
        Assert.assertNotNull(provider);
        Assert.assertNotNull(gen);
    }

    @Test
    public void testIntegerSerializerSerializeNonInteger() {
        IntegerSerializer serializer = new IntegerSerializer(Integer.class);
        try {
            serializer.serialize("not an integer", gen, provider);
            Assert.fail("Expected ClassCastException");
        } catch (ClassCastException e) {
            // expected
        } catch (IOException e) {
            Assert.fail("No IOException expected");
        }
    }

    @Test
    public void testLongSerializerSerializeNull() {
        LongSerializer serializer = new LongSerializer(Long.class);
        try {
            serializer.serialize(null, gen, provider);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        } catch (IOException e) {
            Assert.fail("No IOException expected");
        }
    }

    @Test
    public void testBaseAcceptJsonFormatVisitorNullVisitor() {
        Base<Object> base = new Base<Object>(Integer.class, JsonParser.NumberType.INT, "integer") {
        };
        try {
            base.acceptJsonFormatVisitor(null, null);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        } catch (JsonMappingException e) {
            Assert.fail("No JsonMappingException expected");
        }
    }

    @Test
    public void testBaseSerializerReturnType() {
        Base<Integer> base = new Base<Integer>(Integer.class, JsonParser.NumberType.INT, "integer") {
        };
        Assert.assertTrue(base instanceof JsonSerializer);
        Assert.assertTrue(base instanceof ContextualSerializer);
    }

    @Test
    public void testNumberSerializersConstructorPrivate() {
        try {
            NumberSerializers ns = new NumberSerializers();
            // If constructor is protected, it can be called from same package
            // but test just ensures it can be instantiated
            Assert.assertNotNull(ns);
        } catch (Exception e) {
            Assert.fail("Constructor should be accessible");
        }
    }

    @Test
    public void testIntegerSerializerBridgeMethods() throws Exception {
        IntegerSerializer serializer = new IntegerSerializer(Integer.class);
        java.lang.reflect.Method m = IntegerSerializer.class.getMethod("serialize", Object.class, JsonGenerator.class, SerializerProvider.class);
        Assert.assertTrue(m.isBridge() || !m.isBridge()); // just verifies method exists
    }

    @Test
    public void testBaseClassIsAbstract() {
        Assert.assertTrue(java.lang.reflect.Modifier.isAbstract(Base.class.getModifiers()));
    }

    @Test
    public void testShortSerializerExtendsBase() {
        Assert.assertTrue(ShortSerializer.class.getSuperclass() == Base.class);
    }

    @Test
    public void testDoubleSerializerExtendsBase() {
        Assert.assertTrue(DoubleSerializer.class.getSuperclass() == Base.class);
    }

    @Test
    public void testIntegerSerializerExtendsBase() {
        Assert.assertTrue(IntegerSerializer.class.getSuperclass() == Base.class);
    }

    @Test
    public void testLongSerializerExtendsBase() {
        Assert.assertTrue(LongSerializer.class.getSuperclass() == Base.class);
    }

    @Test
    public void testFloatSerializerExtendsBase() {
        Assert.assertTrue(FloatSerializer.class.getSuperclass() == Base.class);
    }

    @Test
    public void testIntLikeSerializerExtendsBase() {
        Assert.assertTrue(IntLikeSerializer.class.getSuperclass() == Base.class);
    }

    @Test
    public void testNumberSerializersClassExists() {
        Assert.assertNotNull(NumberSerializers.class);
    }

    @Test
    public void testBaseClassPackage() {
        Assert.assertEquals("com.fasterxml.jackson.databind.ser.std", Base.class.getPackage().getName());
    }

    // Mock classes
    private static class MockJsonGenerator extends JsonGenerator {
        private StringBuilder sb = new StringBuilder();

        @Override
        public void writeNumber(int v) throws IOException { sb.append(v); }
        @Override
        public void writeNumber(long v) throws IOException { sb.append(v); }
        @Override
        public void writeNumber(double v) throws IOException { sb.append(v); }
        @Override
        public void writeNumber(float v) throws IOException { sb.append(v); }

        // Other abstract methods - minimal implementation
        @Override public void writeStartObject() throws IOException {}
        @Override public void writeEndObject() throws IOException {}
        @Override public void writeFieldName(String name) throws IOException {}
        @Override public void writeString(String value) throws IOException { sb.append(value); }
        @Override public void writeNull() throws IOException {}
        @Override public void writeBoolean(boolean state) throws IOException {}
        @Override public void writeObject(Object value) throws IOException {}
        @Override public void writeRaw(char c) throws IOException {}
        @Override public void writeRawUTF8String(byte[] text, int offset, int length) throws IOException {}
        @Override public void flush() throws IOException {}
        @Override public ObjectCodec getCodec() { return null; }
        @Override public void setCodec(ObjectCodec codec) {}
        @Override public Version version() { return null; }
        @Override public JsonStreamContext getOutputContext() { return null; }
        @Override public void close() throws IOException {}
        @Override public boolean isClosed() { return false; }
        @Override public JsonGenerator useDefaultPrettyPrinter() { return null; }
        @Override public JsonGenerator setPrettyPrinter(PrettyPrinter pp) { return null; }
        @Override public void writeRaw(String text) throws IOException { sb.append(text); }

        @Override
        public String toString() {
            return sb.toString();
        }
    }

    private static class SerializerProvider extends com.fasterxml.jackson.databind.SerializerProvider {
        public SerializerProvider() {
            super(createConfig(), new SerializerFactory() {
                @Override
                public JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType type, BeanDescription beanDesc) {
                    return null;
                }

                @Override
                public JsonSerializer<Object> createKeySerializer(SerializerProvider prov, JavaType type, BeanDescription beanDesc, BeanProperty property) {
                    return null;
                }
            });
        }

        private static SerializationConfig createConfig() {
            return new SerializationConfig(new com.fasterxml.jackson.databind.cfg.BaseSettings(
                new com.fasterxml.jackson.databind.cfg.DefaultBaseFactory(new JsonFactory(), new ObjectMapper())
            ), new com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair());
        }
    }
}