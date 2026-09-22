package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.PropertyFilter;

public class AnyGetterWriterTest {
    private AnyGetterWriter writer;
    private AnnotatedMember accessor;
    private BeanProperty property;
    private MapSerializer mapSerializer;
    private JsonGenerator gen;
    private SerializerProvider provider;
    private PropertyFilter filter;

    @Before
    public void setUp() {
        accessor = new TestAnnotatedMember();
        property = new TestBeanProperty();
        mapSerializer = new TestMapSerializer();
        gen = new TestJsonGenerator();
        provider = new TestSerializerProvider();
        filter = new TestPropertyFilter();
        writer = new AnyGetterWriter(property, accessor, mapSerializer);
    }

    @Test
    public void testGetAndSerializeWithNullValue() throws Exception {
        ((TestAnnotatedMember) accessor).value = null;
        writer.getAndSerialize(new Object(), gen, provider);
        assertTrue(true);
    }

    @Test
    public void testGetAndSerializeWithNonNullValue() throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key", "value");
        ((TestAnnotatedMember) accessor).value = map;
        writer.getAndSerialize(new Object(), gen, provider);
        assertNotNull(((TestJsonGenerator) gen).serializedValue);
    }

    @Test(expected = JsonMappingException.class)
    public void testGetAndSerializeWithNonMapValue() throws Exception {
        ((TestAnnotatedMember) accessor).value = new Object();
        writer.getAndSerialize(new Object(), gen, provider);
    }

    @Test
    public void testGetAndFilterWithNullValue() throws Exception {
        ((TestAnnotatedMember) accessor).value = null;
        writer.getAndFilter(new Object(), gen, provider, filter);
    }

    @Test
    public void testGetAndFilterWithNonNullValue() throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key", "value");
        ((TestAnnotatedMember) accessor).value = map;
        writer.getAndFilter(new Object(), gen, provider, filter);
        assertNotNull(((TestJsonGenerator) gen).serializedValue);
    }

    @Test(expected = JsonMappingException.class)
    public void testGetAndFilterWithNonMapValue() throws Exception {
        ((TestAnnotatedMember) accessor).value = new Object();
        writer.getAndFilter(new Object(), gen, provider, filter);
    }

    @Test
    public void testResolve() throws Exception {
        writer.resolve(provider);
        assertNotNull(writer);
    }

    static class TestAnnotatedMember extends AnnotatedMember {
        Object value;

        public TestAnnotatedMember() {
            super(null, null, null);
        }

        @Override
        public Object getValue(Object pojo) {
            return value;
        }

        @Override
        public void setValue(Object pojo, Object value) {
            this.value = value;
        }

        @Override
        public AnnotatedMember withValue() {
            return this;
        }

        @Override
        public com.fasterxml.jackson.databind.introspect.Annotated withValue() {
            return this;
        }
    }

    static class TestBeanProperty extends BeanProperty {
        public TestBeanProperty() {
            super();
        }
    }

    static class TestMapSerializer extends MapSerializer {
        public TestMapSerializer() {
            super();
        }

        @Override
        public void serializeFields(Map<?, ?> map, JsonGenerator gen, SerializerProvider provider) {
            gen.setSerializedValue(map);
        }

        @Override
        public void serializeFilteredFields(Map<?, ?> map, JsonGenerator gen, SerializerProvider provider,
                PropertyFilter filter, Object value) {
            gen.setSerializedValue(map);
        }
    }

    static class TestJsonGenerator extends JsonGenerator {
        private Object serializedValue;

        public void setSerializedValue(Object value) {
            this.serializedValue = value;
        }

        @Override
        public com.fasterxml.jackson.core.JsonGenerator setCodec(com.fasterxml.jackson.databind.ObjectMapper mapper) {
            return this;
        }

        @Override
        public com.fasterxml.jackson.databind.ObjectMapper getCodec() {
            return null;
        }

        @Override
        public com.fasterxml.jackson.core.JsonParser parser() {
            return null;
        }

        @Override
        public com.fasterxml.jackson.core.ObjectCodec codec() {
            return null;
        }

        @Override
        public com.fasterxml.jackson.core.JsonStreamContext getOutputContext() {
            return null;
        }

        @Override
        public void writeStartObject()throws java.io.IOException {
        }

        @Override
        public void writeEndObject()throws java.io.IOException {
        }

        @Override
        public void writeFieldName(String name)throws java.io.IOException {
        }

        @Override
        public void writeFieldName(SerializableString name)throws java.io.IOException {
        }

        @Override
        public void writeString(String value)throws java.io.IOException {
        }

        @Override
        public void writeString(char[] text, int offset, int len)throws java.io.IOException {
        }

        @Override
        public void writeString(SerializableString value)throws java.io.IOException {
        }

        @Override
        public void writeRawUTF8String(byte[] text, int offset, int len)throws java.io.IOException {
        }

        @Override
        public void writeUTF8String(byte[] text, int offset, int len)throws java.io.IOException {
        }

        @Override
        public void writeRaw(String text)throws java.io.IOException {
        }

        @Override
        public void writeRaw(String text, int offset, int len)throws java.io.IOException {
        }

        @Override
        public void writeRaw(char[] text, int offset, int len)throws java.io.IOException {
        }

        @Override
        public void writeRaw(char c)throws java.io.IOException {
        }

        @Override
        public void writeRawValue(String text)throws java.io.IOException {
        }

        @Override
        public void writeRawValue(String text, int offset, int len)throws java.io.IOException {
        }

        @Override
        public void writeRawValue(char[] text, int offset, int len)throws java.io.IOException {
        }

        @Override
        public void writeBinary(byte[] data, int offset, int len)throws java.io.IOException {
        }

        @Override
        public void writeBinary(byte[] data)throws java.io.IOException {
        }

        @Override
        public void writeBoolean(boolean state)throws java.io.IOException {
        }

        @Override
        public void writeNull()throws java.io.IOException {
        }

        @Override
        public void writeNumber(int v)throws java.io.IOException {
        }

        @Override
        public int writeBinary(byte[] data, int dataOffset, int dataLength)throws java.io.IOException {
            return 0;
        }

        @Override
        public int writeBinary(com.fasterxml.jackson.core.io.SerializedString value, byte[] data, int dataOffset,
                int dataLength)throws java.io.IOException {
            return 0;
        }

        @Override
        public void writeNumber(long v)throws java.io.IOException {
        }

        @Override
        public void writeNumber(java.math.BigInteger v)throws java.io.IOException {
        }

        @Override
        public void writeNumber(double v)throws java.io.IOException {
        }

        @Override
        public void writeNumber(float v)throws java.io.IOException {
        }

        @Override
        public void writeNumber(java.math.BigDecimal v)throws java.io.IOException {
        }

        @Override
        public void writeNumber(String encodedValue)throws java.io.IOException {
        }

        @Override
        public void writeStartArray()throws java.io.IOException {
        }

        @Override
        public void writeEndArray()throws java.io.IOException {
        }

        @Override
        public void writeObject(Object value)throws java.io.IOException {
        }

        @Override
        public void writeTree(com.fasterxml.jackson.core.TreeNode root)throws java.io.IOException {
        }

        @Override
        public boolean isClosed() {
            return false;
        }

        @Override
        public void flush()throws java.io.IOException {
        }

        @Override
        public void close()throws java.io.IOException {
        }

        @Override
        public void writeStartObject(Object forValue)throws java.io.IOException {
        }

        @Override
        public void writeEndObject(Object forValue)throws java.io.IOException {
        }

        @Override
        public void writeStartArray(int size)throws java.io.IOException {
        }

        @Override
        public void writeStartArray(Object forValue)throws java.io.IOException {
        }

        @Override
        public void writeFieldName(com.fasterxml.jackson.core.io.SerializedString name)throws java.io.IOException {
        }

        @Override
        public void writeFieldId(long id)throws java.io.IOException {
        }

        @Override
        public void writeString(java.util.Scanner sc)throws java.io.IOException {
        }

        @Override
        public void copyCurrentEvent(com.fasterxml.jackson.core.JsonParser p)throws java.io.IOException {
        }

        @Override
        public void copyCurrentStructure(com.fasterxml.jackson.core.JsonParser p)throws java.io.IOException {
        }

        @Override
        public void setSchema(com.fasterxml.jackson.core.FormatSchema schema) {
        }

        @Override
        public java.lang.Object getOutputTarget() {
            return null;
        }

        @Override
        public int getOutputBuffered() {
            return 0;
        }

        @Override
        public boolean canWriteObjectId() {
            return false;
        }

        @Override
        public boolean canWriteTypeId() {
            return false;
        }

        @Override
        public void writeObjectId(Object id)throws java.io.IOException {
        }

        @Override
        public void writeTypeId(Object id)throws java.io.IOException {
        }

        @Override
        public void useDefaultPrettyPrinter() {
        }

        @Override
        public com.fasterxml.jackson.core.PrettyPrinter getPrettyPrinter() {
            return null;
        }

        @Override
        public com.fasterxml.jackson.core.JsonGenerator setPrettyPrinter(com.fasterxml.jackson.core.PrettyPrinter pp) {
            return this;
        }

        @Override
        public com.fasterxml.jackson.core.JsonGenerator enable(com.fasterxml.jackson.core.JsonParser.Feature f) {
            return this;
        }

        @Override
        public com.fasterxml.jackson.core.JsonGenerator disable(com.fasterxml.jackson.core.JsonParser.Feature f) {
            return this;
        }

        @Override
        public com.fasterxml.jackson.core.JsonGenerator configure(com.fasterxml.jackson.core.JsonParser.Feature f,
                boolean state) {
            return this;
        }

        @Override
        public com.fasterxml.jackson.core.JsonGenerator setFeature(com.fasterxml.jackson.core.JsonParser.Feature f,
                boolean state) {
            return this;
        }

        @Override
        public com.fasterxml.jackson.core.JsonGenerator setFormatFeatures(com.fasterxml.jackson.core.FormatFeature f,
                boolean state) {
            return this;
        }

        @Override
        public com.fasterxml.jackson.core.JsonGenerator setFormatSchema(com.fasterxml.jackson.core.FormatSchema schema) {
            return this;
        }

        @Override
        public boolean isResourceManaged() {
            return false;
        }

        @Override
        public void setResourceContext(com.fasterxml.jackson.databind.cfg.Context context) {
        }

        @Override
        public JsonGenerator setCodec(com.fasterxml.jackson.core.ObjectCodec oc) {
            return this;
        }

        @Override
        public void writeStartArray(Object forValue, int size)throws java.io.IOException {
        }

        @Override
        public void writeEndArray(Object forValue)throws java.io.IOException {
        }

        @Override
        public void writeStartObject(Object forValue, int size)throws java.io.IOException {
        }

        @Override
        public void writeEndObject(Object forValue, int size)throws java.io.IOException {
        }
    }

    static class TestSerializerProvider extends SerializerProvider {
        public TestSerializerProvider() {
            super();
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findValueSerializer(
                com.fasterxml.jackson.databind.JavaType type) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findValueSerializer(Class<?> type) {
            return null;
        }

        @Override
        public int getGeneratorFeatures() {
            return 0;
        }

        @Override
        public int getFormatFeatures() {
            return 0;
        }

        @Override
        public java.lang.Object serializeValue(com.fasterxml.jackson.databind.SerializationConfig config,
                com.fasterxml.jackson.core.JsonGenerator gen, Object value) throws java.io.IOException {
            return null;
        }

        @Override
        public java.lang.Object serializeValue(com.fasterxml.jackson.databind.SerializationConfig config,
                com.fasterxml.jackson.core.JsonGenerator gen, Object value, com.fasterxml.jackson.databind.JavaType type)
                throws java.io.IOException {
            return null;
        }

        @Override
        public java.lang.Object serializeValue(com.fasterxml.jackson.databind.SerializationConfig config,
                com.fasterxml.jackson.core.JsonGenerator gen, Object value,
                com.fasterxml.jackson.databind.JavaType type,
                com.fasterxml.jackson.databind.JsonSerializer<Object> serializer) throws java.io.IOException {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findTypedValueSerializer(
                com.fasterxml.jackson.databind.JavaType type, boolean req) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findTypedValueSerializer(Class<?> type,
                boolean req) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findTypeSerializer(
                com.fasterxml.jackson.databind.JavaType type) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findTypeSerializer(Class<?> type) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findNullValueSerializer() {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findNullKeySerializer() {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findKeySerializer(
                com.fasterxml.jackson.databind.JavaType type, com.fasterxml.jackson.databind.BeanProperty prop) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findKeySerializer(Class<?> type,
                com.fasterxml.jackson.databind.BeanProperty prop) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findContentSerializer(
                com.fasterxml.jackson.databind.JavaType type, com.fasterxml.jackson.databind.BeanProperty prop) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findContentSerializer(Class<?> type,
                com.fasterxml.jackson.databind.BeanProperty prop) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findNullValueSerializer(
                com.fasterxml.jackson.databind.BeanProperty prop) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findTypedValueSerializer(
                com.fasterxml.jackson.databind.JavaType type, boolean req, com.fasterxml.jackson.databind.BeanProperty prop) {
            return null;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonSerializer<Object> findKeySerializer(
                com.fasterxml.jackson.databind.JavaType type, com.fasterxml.jackson.databind.BeanProperty prop,
                com.fasterxml.jackson.databind.JsonSerializer<Object> defaultSerializer) {
            return null;
        }
    }

    static class TestPropertyFilter implements PropertyFilter {
        @Override
        public void serializeAsField(Object pojo, com.fasterxml.jackson.core.JsonGenerator gen,
                com.fasterxml.jackson.databind.SerializerProvider prov,
                com.fasterxml.jackson.databind.ser.PropertyWriter writer)
                throws Exception {
        }

        @Override
        public void serializeAsElement(Object elementValue, com.fasterxml.jackson.core.JsonGenerator gen,
                com.fasterxml.jackson.databind.SerializerProvider prov,
                com.fasterxml.jackson.databind.ser.PropertyWriter writer)
                throws Exception {
        }
    }
}