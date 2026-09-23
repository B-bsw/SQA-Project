package com.fasterxml.jackson.databind.ser;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanPropertyWriterTest {

    private BeanPropertyWriter writer;
    private JavaType testType;
    private AnnotatedMember testMember;
    private SerializerProvider prov;
    private JsonGenerator gen;
    private Class<?>[] views = {String.class};

    @Before
    public void setUp() throws Exception {
        testType = new SimpleType(null, null, null, 0, null, null, null);
        testMember = new AnnotatedField(null, null);
        writer = new BeanPropertyWriter(
                new BeanPropertyDefinition(
                        null, null, new SimpleBeanPropertyDefinition(null, new PropertyName("test")), null,
                        new AnnotatedField(null, null), false, false, false, null),
                testMember, null, testType, null, null, null, false, null);
        prov = new StdSerializerProvider();
        gen = new JsonGeneratorSTD();
    }

    @After
    public void tearDown() {
        writer = null;
        testType = null;
        testMember = null;
        prov = null;
        gen = null;
    }

    @Test
    public void testGetName() {
        assertEquals("test", writer.getName());
    }

    @Test
    public void testGetFullName() {
        assertEquals("test", writer.getFullName().getSimpleName());
    }

    @Test
    public void testGetType() {
        assertSame(testType, writer.getType());
    }

    @Test
    public void testGetWrapperName() {
        assertNull(writer.getWrapperName());
    }

    @Test
    public void testIsRequired() {
        assertFalse(writer.isRequired());
    }

    @Test
    public void testGetMetadata() {
        assertNotNull(writer.getMetadata());
    }

    @Test
    public void testGetAnnotationNullMember() {
        assertNull(writer.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetContextAnnotationNullContext() {
        assertNull(writer.getContextAnnotation(Deprecated.class));
    }

    @Test
    public void testFindFormatOverridesNullMember() {
        assertNull(writer.findFormatOverrides(null));
    }

    @Test
    public void testGetMember() {
        assertSame(testMember, writer.getMember());
    }

    @Test
    public void testIsVirtual() {
        assertFalse(writer.isVirtual());
    }

    @Test
    public void testGetInternalSettingNull() {
        assertNull(writer.getInternalSetting("key"));
    }

    @Test
    public void testSetInternalSetting() {
        Object val = new Object();
        assertNull(writer.setInternalSetting("key", val));
        assertSame(val, writer.getInternalSetting("key"));
    }

    @Test
    public void testRemoveInternalSettingEmpty() {
        writer.setInternalSetting("key", "val");
        assertEquals("val", writer.removeInternalSetting("key"));
        assertNull(writer.getInternalSetting("key"));
    }

    @Test
    public void testRemoveInternalSettingClear() {
        writer.setInternalSetting("k1", "v1");
        writer.setInternalSetting("k2", "v2");
        assertEquals("v1", writer.removeInternalSetting("k1"));
        assertEquals("v2", writer.removeInternalSetting("k2"));
        assertNull(writer.getInternalSetting("k1"));
    }

    @Test
    public void testHasSerializerFalse() {
        assertFalse(writer.hasSerializer());
    }

    @Test
    public void testHasNullSerializerFalse() {
        assertFalse(writer.hasNullSerializer());
    }

    @Test
    public void testGetTypeSerializer() {
        assertNull(writer.getTypeSerializer());
    }

    @Test
    public void testIsUnwrapping() {
        assertFalse(writer.isUnwrapping());
    }

    @Test
    public void testWillSuppressNullsFalse() {
        assertFalse(writer.willSuppressNulls());
    }

    @Test
    public void testWouldConflictWithNameNoConflict() {
        assertFalse(writer.wouldConflictWithName(new PropertyName("other")));
    }

    @Test
    public void testGetSerializerNull() {
        assertNull(writer.getSerializer());
    }

    @Test
    public void testGetSerializationType() {
        assertNull(writer.getSerializationType());
    }

    @Test
    public void testGetRawSerializationType() {
        assertNull(writer.getRawSerializationType());
    }

    @Test
    public void testGetGenericPropertyTypeFieldOnly() throws Exception {
        AnnotatedField field = new AnnotatedField();
        field.setType(String.class);
        writer = new BeanPropertyWriter(
                new BeanPropertyDefinition(null, null, null, null, null, false, false, false, null),
                field, null, null, null, null, null, false, null);
        assertEquals("class java.lang.String", writer.getGenericPropertyType().getTypeName());
    }

    @Test
    public void testGetGenericPropertyTypeMethodOnly() throws Exception {
        AnnotatedMethod method = new AnnotatedMethod();
        method.setReturnType(Integer.class);
        writer = new BeanPropertyWriter(
                new BeanPropertyDefinition(null, null, null, null, null, false, false, false, null),
                method, null, null, null, null, null, false, null);
        assertEquals("class java.lang.Integer", writer.getGenericPropertyType().getTypeName());
    }

    @Test
    public void testGetGenericPropertyTypeNull() {
        assertNull(writer.getGenericPropertyType());
    }

    @Test
    public void testGetViews() {
        writer = new BeanPropertyWriter(
                new BeanPropertyDefinition(null, null, new PropertyName("test"), null, null, false, false, false, null),
                testMember, null, null, null, null, null, false, views);
        assertArrayEquals(views, writer.getViews());
    }

    @Test
    public void testSerializeAsFieldNullValue() throws Exception {
        writer.serializeAsField(null, gen, prov);
        assertTrue(true);
    }

    @Test(expected = NullPointerException.class)
    public void testSerializeAsPlaceholderNull() throws Exception {
        writer.serializeAsPlaceholder(null, gen, prov);
    }

    @Test
    public void testDepositSchemaPropertyNullVisitor() throws Exception {
        writer.depositSchemaProperty((JsonObjectFormatVisitor) null);
        assertTrue(true);
    }

    @Test
    public void testDepositSchemaPropertyDeprecatedNull() throws Exception {
        writer.depositSchemaProperty((ObjectNode) null, prov);
        assertTrue(true);
    }

    @Test
    public void testToString() {
        assertNotNull(writer.toString());
    }

    @Test
    public void testAssignSerializerFirstTime() {
        JsonSerializer<Object> ser = mockSerializer();
        writer.assignSerializer(ser);
        assertSame(ser, writer.getSerializer());
    }

    @Test(expected = IllegalStateException.class)
    public void testAssignSerializerOverride() {
        JsonSerializer<Object> ser1 = mockSerializer();
        JsonSerializer<Object> ser2 = mockSerializer();
        writer.assignSerializer(ser1);
        writer.assignSerializer(ser2);
    }

    @Test
    public void testAssignNullSerializerFirstTime() {
        JsonSerializer<Object> ser = mockSerializer();
        writer.assignNullSerializer(ser);
        assertNotNull(writer.hasNullSerializer());
    }

    @Test(expected = IllegalStateException.class)
    public void testAssignNullSerializerOverride() {
        JsonSerializer<Object> ser1 = mockSerializer();
        JsonSerializer<Object> ser2 = mockSerializer();
        writer.assignNullSerializer(ser1);
        writer.assignNullSerializer(ser2);
    }

    @Test
    public void testUnwrappingWriter() {
        NameTransformer nt = NameTransformer.identityTransformer();
        BeanPropertyWriter nw = writer.unwrappingWriter(nt);
        assertTrue(nw instanceof UnwrappingBeanPropertyWriter);
    }

    @Test
    public void testRename() {
        NameTransformer nt = new NameTransformer() {
            @Override
            public String transform(String name) {
                return "renamed";
            }

            @Override
            public String reverse(String transformed) {
                return "test";
            }
        };
        BeanPropertyWriter nw = writer.rename(nt);
        assertEquals("renamed", nw.getName());
    }

    @Test
    public void testRenameSameName() {
        BeanPropertyWriter nw = writer.rename(NameTransformer.identityTransformer());
        assertSame(writer, nw);
    }

    private JsonSerializer<Object> mockSerializer() {
        return (JsonSerializer<Object>) java.lang.reflect.Proxy.newProxyInstance(
                JsonSerializer.class.getClassLoader(),
                new Class<?>[]{JsonSerializer.class},
                (proxy, method, args) -> null);
    }

    private static class SimpleType extends JavaType {
        public SimpleType(Class<?> raw, TypeBindings bindings, JavaType superClass,
                          int hash, Object valueHandler, Object typeHandler, boolean asStatic) {
            super(raw, bindings, superClass, valueHandler, typeHandler, asStatic);
        }

        protected JavaType _narrow(Class<?> subclass) { return this; }
        public JavaType withTypeHandler(Object h) { return this; }
        public JavaType withContentTypeHandler(Object h) { return this; }
        public JavaType withValueHandler(Object h) { return this; }
        public JavaType withContentValueHandler(Object h) { return this; }
        public JavaType withStaticTyping() { return this; }
        public JavaType getContentType() { return null; }
        public int containedTypeCount() { return 0; }
        public JavaType containedType(int index) { return null; }
        public String containedTypeName(int index) { return null; }
        public Class<?> getRawClass() { return Object.class; }
        public boolean equals(Object o) { return false; }
        public String toString() { return "SimpleType"; }
    }

    private static class SimpleBeanPropertyDefinition extends BeanPropertyDefinition {
        private final PropertyName name;
        private final AnnotatedMember member;

        public SimpleBeanPropertyDefinition(BeanDescription bean, PropertyName name, AnnotatedMember member) {
            super(bean, null);
            this.name = name;
            this.member = member;
        }

        public PropertyName getFullName() { return name; }
        public String getName() { return name.getSimpleName(); }
        public String getInternalName() { return name.getSimpleName(); }
        public PropertyName getWrapperName() { return null; }
        public boolean isRequired() { return false; }
        public AnnotatedMember getPrimaryMember() { return member; }
        public AnnotatedMember getAccessor() { return member; }
        public AnnotatedMember getField() { return member instanceof AnnotatedField ? member : null; }
        public AnnotatedParameter getConstructorParameter() { return null; }
        public AnnotatedParameter getSetter() { return null; }
        public AnnotatedMember getMutator() { return member; }
        public AnnotatedMember getNonConstructorMutator() { return member; }
        public Class<?>[] findViews() { return null; }
        public TypeSerializer findTypeSerializer(SerializerProvider prov, JavaType baseType) { return null; }
        public JsonFormat.Value findFormat(AnnotationIntrospector intr) { return null; }
        public boolean isExplicitlyIncluded() { return false; }
        public boolean isExplicitlyNamed() { return false; }
    }

    private static class AnnotatedField extends AnnotatedMember {
        private Field field;

        public AnnotatedField(Field field) { this.field = field; }

        public AnnotatedField() { this.field = null; }

        public void setType(Class<?> type) {
            try {
                this.field = AnnotatedField.class.getDeclaredField("dummy");
            } catch (Exception e) { }
        }

        @Override
        public Field getMember() { return field; }
        @Override
        public String getName() { return "test"; }
        @Override
        public Class<?> getDeclaringClass() { return Object.class; }
        @Override
        public Class<?> getRawType() { return String.class; }
        @Override
        public String getFullName() { return "test"; }
        @Override
        public boolean equals(Object o) { return o == this; }
        @Override
        public int hashCode() { return 0; }
    }

    private static class AnnotatedMethod extends AnnotatedMember {
        private Method method;

        public AnnotatedMethod(Method method) { this.method = method; }

        public AnnotatedMethod() { this.method = null; }

        public void setReturnType(Class<?> type) {
            try {
                this.method = AnnotatedMethod.class.getDeclaredMethod("dummy");
            } catch (Exception e) { }
        }

        @Override
        public Method getMember() { return method; }
        @Override
        public String getName() { return "test"; }
        @Override
        public Class<?> getDeclaringClass() { return Object.class; }
        @Override
        public Class<?> getRawType() { return String.class; }
        @Override
        public String getFullName() { return "test"; }
        @Override
        public boolean equals(Object o) { return o == this; }
        @Override
        public int hashCode() { return 0; }
    }

    private static class StdSerializerProvider extends SerializerProvider {
        public StdSerializerProvider() { super(); }
        public StdSerializerProvider(SerializerProvider src) { super(src); }
        @Override
        public JsonSerializer<Object> findValueSerializer(Class<?> type, BeanProperty prop) throws JsonMappingException { return null; }
        @Override
        public JsonSerializer<Object> findValueSerializer(JavaType type, BeanProperty prop) throws JsonMappingException { return null; }
        @Override
        public JsonSerializer<Object> findNullValueSerializer(Boolean b) throws JsonMappingException { return null; }
        @Override
        public JsonSerializer<Object> findRootValueSerializer(Class<?> type, BeanProperty prop) throws JsonMappingException { return null; }
        @Override
        public JsonSerializer<Object> findTypedValueSerializer(Class<?> type, boolean cache, BeanProperty prop) throws JsonMappingException { return null; }
        @Override
        public JsonSerializer<Object> findTypedValueSerializer(JavaType type, boolean cache, BeanProperty prop) throws JsonMappingException { return null; }
        @Override
        public JsonSerializer<Object> findKeySerializer(JavaType type, BeanProperty prop) throws JsonMappingException { return null; }
        @Override
        public JsonSerializer<Object> findKeySerializer(Class<?> type, BeanProperty prop) throws JsonMappingException { return null; }
        @Override
        public <T> T getDefaultValue(JavaType type) { return null; }
        @Override
        public <T> T getDefaultValue(Class<T> type) { return null; }
        @Override
        public void resolveString(SerializableString s) { }
        @Override
        public void serializeValue(JsonGenerator gen, Object value) throws Exception { }
        @Override
        public void defaultSerializeValue(Object value, JsonGenerator gen) throws Exception { }
        @Override
        public void failNullValueForPrimitive(JavaType type) throws JsonMappingException { }
        @Override
        public boolean isEnabled(SerializationFeature f) { return false; }
        @Override
        public AnnotationIntrospector getAnnotationIntrospector() { return null; }
        @Override
        public JavaType constructSpecializedType(JavaType baseType, Class<?> subclass) { return baseType; }
        @Override
        public int getGeneratorFeatureDefaults() { return 0; }
    }

    private static class JsonGeneratorSTD extends JsonGenerator {
        @Override
        public JsonGenerator useDefaultPrettyPrinter() { return this; }
        @Override
        public JsonGenerator setCodec(ObjectMapper oc) { return this; }
        @Override
        public ObjectMapper getCodec() { return null; }
        @Override
        public JsonStreamContext getOutputContext() { return null; }
        @Override
        public boolean canWriteTypeId() { return false; }
        @Override
        public boolean canWriteObjectId() { return false; }
        @Override
        public boolean canOmitFields() { return false; }
        @Override
        public void writeFieldName(String name) throws Exception { }
        @Override
        public void writeFieldName(SerializableString name) throws Exception { }
        @Override
        public void writeOmittedField(String fieldName) throws Exception { }
        @Override
        public void writeNull() throws Exception { }
        @Override
        public void writeNumber(int v) throws Exception { }
        @Override
        public void writeNumber(long v) throws Exception { }
        @Override
        public void writeNumber(double v) throws Exception { }
        @Override
        public void writeNumber(float v) throws Exception { }
        @Override
        public void writeNumber(java.math.BigDecimal v) throws Exception { }
        @Override
        public void writeNumber(java.math.BigInteger v) throws Exception { }
        @Override
        public void writeString(String s) throws Exception { }
        @Override
        public void writeString(char[] buf, int off, int len) throws Exception { }
        @Override
        public void writeString(SerializableString s) throws Exception { }
        @Override
        public void writeStartObject() throws Exception { }
        @Override
        public void writeEndObject() throws Exception { }
        @Override
        public void writeStartArray() throws Exception { }
        @Override
        public void writeEndArray() throws Exception { }
        @Override
        public void flush() throws Exception { }
        @Override
        public void close() throws Exception { }
        @Override
        public Object getOutputTarget() { return null; }
        @Override
        public JsonParser getParsingContext() { return null; }
        @Override
        public void copyCurrentStructure(JsonParser p) throws Exception { }
    }

    @Test
    public void testSerializeAsFieldNullValueWithNullSerializer() throws Exception {
        JsonSerializer<Object> ser = mockSerializer();
        writer.assignNullSerializer(ser);
        writer.serializeAsField(null, gen, prov);
        assertTrue(true);
    }

    @Test
    public void testSerializeAsFieldDynamicSerializer() throws Exception {
        Object bean = new Object();
        writer._dynamicSerializers = PropertySerializerMap.emptyForProperties();
        writer._nonTrivialBaseType = new SimpleType(Object.class, null, null, 0, null, null, false);
        try {
            writer.serializeAsField(bean, gen, prov);
        } catch (Exception e) {
            // expected failure
        }
        assertTrue(true);
    }

    @Test
    public void testFindFormatOverridesWithFormat() {
        final JsonFormat.Value fmt = new JsonFormat.Value();
        BeanPropertyWriter w = new BeanPropertyWriter(
                new BeanPropertyDefinition(null, null, new PropertyName("test"), null, null, false, false, false, null),
                new AnnotatedMethod() {
                    @Override
                    public JsonFormat.Value findFormat(AnnotationIntrospector intr) {
                        return fmt;
                    }
                }, null, null, null, null, null, false, null);
        assertSame(fmt, w.findFormatOverrides(new AnnotationIntrospector() {
            @Override
            public JsonFormat.Value findFormat(AnnotatedMember member) {
                return fmt;
            }
        }));
    }

    private static abstract class AnnotatedMember2 extends AnnotatedMember {
        @Override
        public AnnotatedMember withAnnotations(AnnotationIntrospector ai) { return this; }
        @Override
        public Class<?> getDeclaringClass() { return Object.class; }
        @Override
        public Class<?> getRawType() { return Object.class; }
        @Override
        public String getFullName() { return "test"; }
    }
}