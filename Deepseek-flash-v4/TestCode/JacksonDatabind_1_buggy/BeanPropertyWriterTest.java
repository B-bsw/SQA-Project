package com.fasterxml.jackson.databind.ser;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.NameTransformer;

public class BeanPropertyWriterTest {
    private static class TestAnnotations implements Annotations {
        private final HashMap<Class<?>, Annotation> annotations = new HashMap<>();
        
        public void addAnnotation(Class<?> cls, Annotation ann) {
            annotations.put(cls, ann);
        }
        
        @Override
        public <A extends Annotation> A get(Class<A> acls) {
            return acls.cast(annotations.get(acls));
        }
        
        @Override
        public boolean has(Class<?> acls) {
            return annotations.containsKey(acls);
        }
        
        @Override
        public boolean hasOneOf(Class<? extends Annotation>[] acls) {
            for (Class<?> cls : acls) {
                if (annotations.containsKey(cls)) return true;
            }
            return false;
        }
        
        @Override
        public int size() {
            return annotations.size();
        }
    }
    
    private static class TestAnnotatedMember extends AnnotatedMember {
        private final MemberInfo memberInfo;
        
        TestAnnotatedMember(MemberInfo memberInfo) {
            super(null, null);
            this.memberInfo = memberInfo;
        }
        
        @Override
        public Class<?> getRawType() {
            return null;
        }
        
        @Override
        public Object getValue(Object pojo) throws Exception {
            return null;
        }
        
        @Override
        public void setValue(Object pojo, Object value) throws Exception {
        }
        
        @Override
        public Annotation getAnnotation(Class<?> acls) {
            return null;
        }
        
        @Override
        public String getName() {
            return memberInfo.name;
        }
        
        @Override
        public java.lang.reflect.AnnotatedElement getAnnotated() {
            return null;
        }
        
        @Override
        public Annotations getContextAnnotations() {
            return null;
        }
        
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TestAnnotatedMember) {
                return ((TestAnnotatedMember) obj).memberInfo.equals(memberInfo);
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return memberInfo.hashCode();
        }
    }
    
    private static class MemberInfo {
        private final String name;
        private final Class<?> type;
        
        MemberInfo(String name, Class<?> type) {
            this.name = name;
            this.type = type;
        }
        
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MemberInfo) {
                MemberInfo other = (MemberInfo) obj;
                return name.equals(other.name) && type.equals(other.type);
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return name.hashCode() * 31 + type.hashCode();
        }
    }
    
    private static class TestBeanPropertyDefinition extends BeanPropertyDefinition {
        private final String name;
        private final boolean required;
        private final MemberInfo memberInfo;
        
        TestBeanPropertyDefinition(String name, boolean required, MemberInfo memberInfo) {
            this.name = name;
            this.required = required;
            this.memberInfo = memberInfo;
        }
        
        @Override
        public String getName() {
            return name;
        }
        
        @Override
        public String getInternalName() {
            return name;
        }
        
        @Override
        public PropertyName getFullName() {
            return new PropertyName(name);
        }
        
        @Override
        public PropertyName getWrapperName() {
            return null;
        }
        
        @Override
        public boolean isRequired() {
            return required;
        }
        
        @Override
        public boolean hasGetter() {
            return memberInfo != null;
        }
        
        @Override
        public AnnotatedMethod getGetter() {
            return null;
        }
        
        @Override
        public AnnotatedMethod getPrimaryMember() {
            return null;
        }
        
        @Override
        public AnnotatedMethod getNonConstructorMutator() {
            return null;
        }
        
        @Override
        public AnnotatedMethod getConstructorParameter() {
            return null;
        }
        
        @Override
        public AnnotatedMethod getMutator() {
            return null;
        }
        
        @Override
        public AnnotatedMethod getNonConstructorAccessor() {
            return null;
        }
        
        @Override
        public AnnotatedMethod getAccessor() {
            return null;
        }
        
        @Override
        public AnnotatedParameter getConstructorParameter(int index) {
            return null;
        }
        
        @Override
        public AnnotatedMember getMember() {
            return new TestAnnotatedMember(memberInfo);
        }
        
        @Override
        public Class<?>[] findViews() {
            return null;
        }
        
        @Override
        public Class<?> getRawPrimaryType() {
            return memberInfo != null ? memberInfo.type : null;
        }
        
        @Override
        public JavaType getPrimaryType() {
            return null;
        }
    }
    
    private static class TestJsonSerializer extends JsonSerializer<Object> {
        private final boolean empty;
        private final boolean objectId;
        
        TestJsonSerializer(boolean empty, boolean objectId) {
            this.empty = empty;
            this.objectId = objectId;
        }
        
        @Override
        public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws java.io.IOException {
            gen.writeObject(value);
        }
        
        @Override
        public boolean isEmpty(SerializerProvider serializers, Object value) {
            return empty;
        }
        
        @Override
        public boolean usesObjectId() {
            return objectId;
        }
    }
    
    private BeanPropertyWriter writer;
    private SerializerProvider provider;
    private JsonGenerator jgen;
    private ObjectNode objectNode;
    
    @Before
    public void setUp() throws Exception {
        provider = new com.fasterxml.jackson.databind.ser.impl.SimpleSerializerProvider();
        jgen = new com.fasterxml.jackson.core.json.UTF8JsonGenerator(
            null, null, null, 0, null, 0);
        objectNode = new ObjectNode(com.fasterxml.jackson.databind.node.JsonNodeFactory.instance);
    }
    
    @After
    public void tearDown() {
        writer = null;
        provider = null;
        jgen = null;
        objectNode = null;
    }
    
    private BeanPropertyWriter createWriter(MemberInfo memberInfo, boolean required, boolean suppressNulls) {
        TestBeanPropertyDefinition def = new TestBeanPropertyDefinition("test", required, memberInfo);
        AnnotatedMember member = new TestAnnotatedMember(memberInfo);
        TestAnnotations ctxAnnotations = new TestAnnotations();
        JavaType declaredType = TypeFactory.defaultInstance().constructType(memberInfo.type);
        
        return new BeanPropertyWriter(def, member, ctxAnnotations, declaredType,
                null, null, null, suppressNulls, null);
    }
    
    @Test
    public void testGetName() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        assertEquals("test", writer.getName());
    }
    
    @Test
    public void testGetType() {
        writer = createWriter(new MemberInfo("test", Integer.class), false, false);
        assertEquals(Integer.class, writer.getType().getRawClass());
    }
    
    @Test
    public void testGetWrapperName() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        assertNull(writer.getWrapperName());
    }
    
    @Test
    public void testIsRequired() {
        writer = createWriter(new MemberInfo("test", String.class), true, false);
        assertTrue(writer.isRequired());
    }
    
    @Test
    public void testGetAnnotation() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        assertNull(writer.getAnnotation(Deprecated.class));
    }
    
    @Test
    public void testGetContextAnnotation() {
        TestBeanPropertyDefinition def = new TestBeanPropertyDefinition("test", false,
                new MemberInfo("test", String.class));
        AnnotatedMember member = new TestAnnotatedMember(new MemberInfo("test", String.class));
        TestAnnotations ctx = new TestAnnotations();
        Deprecated dep = new Deprecated() {
            public boolean equals(Object obj) { return this == obj; }
            public int hashCode() { return 0; }
            public Class<? extends Annotation> annotationType() { return Deprecated.class; }
        };
        ctx.addAnnotation(Deprecated.class, dep);
        
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        writer = new BeanPropertyWriter(def, member, ctx, declaredType,
                null, null, null, false, null);
        assertEquals(dep, writer.getContextAnnotation(Deprecated.class));
    }
    
    @Test
    public void testGetMember() {
        MemberInfo info = new MemberInfo("test", String.class);
        writer = createWriter(info, false, false);
        assertNotNull(writer.getMember());
    }
    
    @Test
    public void testGetInternalSettingWithNullSettings() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        assertNull(writer.getInternalSetting("key"));
    }
    
    @Test
    public void testSetInternalSetting() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        assertNull(writer.setInternalSetting("key", "value"));
        assertEquals("value", writer.getInternalSetting("key"));
    }
    
    @Test
    public void testSetInternalSettingOverwrites() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        writer.setInternalSetting("key", "value1");
        Object oldValue = writer.setInternalSetting("key", "value2");
        assertEquals("value1", oldValue);
        assertEquals("value2", writer.getInternalSetting("key"));
    }
    
    @Test
    public void testRemoveInternalSettingWithNullSettings() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        assertNull(writer.removeInternalSetting("key"));
    }
    
    @Test
    public void testRemoveInternalSetting() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        writer.setInternalSetting("key", Object.class);
        Object removed = writer.removeInternalSetting("key");
        assertNotNull(removed);
        assertNull(writer.getInternalSetting("key"));
    }
    
    @Test
    public void testGetSerializedName() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        assertEquals(new SerializedString("test"), writer.getSerializedName());
    }
    
    @Test
    public void testHasSerializer() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        assertFalse(writer.hasSerializer());
    }
    
    @Test
    public void testHasNullSerializer() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        assertFalse(writer.hasNullSerializer());
    }
    
    @Test
    public void testWillSuppressNulls() {
        writer = createWriter(new MemberInfo("test", String.class), false, true);
        assertTrue(writer.willSuppressNulls());
    }
    
    @Test
    public void testGetSerializer() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        assertNull(writer.getSerializer());
    }
    
    @Test
    public void testGetSerializationType() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        assertNull(writer.getSerializationType());
    }
    
    @Test
    public void testGetPropertyTypeWithAccessorMethod() throws Exception {
        Method method = getClass().getMethod("testMethod");
        AnnotatedMethod annotatedMethod = new AnnotatedMethod(null, null, method, null, null);
        TestBeanPropertyDefinition def = new TestBeanPropertyDefinition("test", false, null);
        Annotations ctx = new TestAnnotations();
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        writer = new BeanPropertyWriter(def, annotatedMethod, ctx, declaredType,
                null, null, null, false, null);
        assertEquals(String.class, writer.getPropertyType());
    }
    
    @Test
    public void testGetPropertyTypeWithField() throws NoSuchFieldException {
        Field field = BeanPropertyWriterTest.class.getDeclaredField("writer");
        AnnotatedField annotatedField = new AnnotatedField(null, field, null);
        TestBeanPropertyDefinition def = new TestBeanPropertyDefinition("test", false, null);
        Annotations ctx = new TestAnnotations();
        JavaType declaredType = TypeFactory.defaultInstance().constructType(BeanPropertyWriter.class);
        writer = new BeanPropertyWriter(def, annotatedField, ctx, declaredType,
                null, null, null, false, null);
        assertEquals(BeanPropertyWriter.class, writer.getPropertyType());
    }
    
    @Test
    public void testGetGenericPropertyType() throws Exception {
        Method method = getClass().getMethod("testMethod");
        AnnotatedMethod annotatedMethod = new AnnotatedMethod(null, null, method, null, null);
        TestBeanPropertyDefinition def = new TestBeanPropertyDefinition("test", false, null);
        Annotations ctx = new TestAnnotations();
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        writer = new BeanPropertyWriter(def, annotatedMethod, ctx, declaredType,
                null, null, null, false, null);
        assertEquals(String.class, writer.getGenericPropertyType());
    }
    
    @Test
    public void testGetViewsWithNull() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        assertArrayEquals(null, writer.getViews());
    }
    
    @Test
    public void testSerializeAsFieldWithNullValueAndNoNullSerializer() throws Exception {
        writer = createWriter(new MemberInfo("test", String.class), false, true);
        writer.serializeAsField(new Object(), jgen, provider);
    }
    
    @Test
    public void testSerializeAsFieldWithNullValueAndNullSerializer() throws Exception {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        TestJsonSerializer nullSer = new TestJsonSerializer(false, false);
        writer.assignNullSerializer(nullSer);
        writer.serializeAsField(null, jgen, provider);
    }
    
    @Test
    public void testSerializeAsFieldWithNonNullValue() throws Exception {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        TestJsonSerializer ser = new TestJsonSerializer(false, false);
        writer.assignSerializer(ser);
        writer.serializeAsField("value", jgen, provider);
    }
    
    @Test
    public void testSerializeAsFieldWithNonNullValueAndSuppressNulls() throws Exception {
        writer = createWriter(new MemberInfo("test", String.class), false, true);
        TestJsonSerializer ser = new TestJsonSerializer(false, false);
        writer.assignSerializer(ser);
        writer.serializeAsField("value", jgen, provider);
    }
    
    @Test
    public void testSerializeAsFieldWithEmptySuppressableValue() throws Exception {
        TestBeanPropertyDefinition def = new TestBeanPropertyDefinition("test", false,
                new MemberInfo("test", String.class));
        AnnotatedMember member = new TestAnnotatedMember(new MemberInfo("test", String.class));
        TestAnnotations ctx = new TestAnnotations();
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        writer = new BeanPropertyWriter(def, member, ctx, declaredType,
                null, null, null, false, MARKER_FOR_EMPTY);
        TestJsonSerializer ser = new TestJsonSerializer(true, false);
        writer.assignSerializer(ser);
        writer.serializeAsField("value", jgen, provider);
    }
    
    @Test
    public void testSerializeAsFieldWithSuppressableValue() throws Exception {
        TestBeanPropertyDefinition def = new TestBeanPropertyDefinition("test", false,
                new MemberInfo("test", String.class));
        AnnotatedMember member = new TestAnnotatedMember(new MemberInfo("test", String.class));
        TestAnnotations ctx = new TestAnnotations();
        JavaType declaredType = TypeFactory.defaultInstance().constructType(String.class);
        writer = new BeanPropertyWriter(def, member, ctx, declaredType,
                null, null, null, false, "suppress");
        TestJsonSerializer ser = new TestJsonSerializer(false, false);
        writer.assignSerializer(ser);
        writer.serializeAsField("suppress", jgen, provider);
    }
    
    @Test
    public void testSerializeAsColumnWithNullValueAndSuppressNulls() throws Exception {
        writer = createWriter(new MemberInfo("test", String.class), false, true);
        writer.serializeAsColumn(null, jgen, provider);
    }
    
    @Test
    public void testSerializeAsColumnWithNullValueAndNoNullHandler() throws Exception {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        TestJsonSerializer nullSer = new TestJsonSerializer(false, false);
        writer.assignNullSerializer(nullSer);
        writer.serializeAsColumn(null, jgen, provider);
    }
    
    @Test
    public void testSerializeAsColumnWithNonNullValue() throws Exception {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        TestJsonSerializer ser = new TestJsonSerializer(false, false);
        writer.assignSerializer(ser);
        writer.serializeAsColumn("value", jgen, provider);
    }
    
    @Test
    public void testToStringWithNonNullSerializer() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        TestJsonSerializer ser = new TestJsonSerializer(false, false);
        writer.assignSerializer(ser);
        assertNotNull(writer.toString());
    }
    
    @Test
    public void testDepositSchemaPropertyWithNullVisitor() throws Exception {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        writer.depositSchemaProperty(null, provider);
    }
    
    @Test
    public void testSetNonTrivialBaseType() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        writer.setNonTrivialBaseType(type);
    }
    
    @Test
    public void testRename() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        BeanPropertyWriter renamed = writer.rename(new NameTransformer() {
            @Override
            public String transform(String name) {
                return name + "_renamed";
            }
        });
        assertNotEquals(writer, renamed);
        assertNotNull(renamed.getName());
    }
    
    @Test
    public void testRenameWithinRange() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        BeanPropertyWriter renamed = writer.rename(new NameTransformer() {
            @Override
            public String transform(String name) {
                return name;
            }
        });
        assertSame(writer, renamed);
    }
    
    @Test
    public void testAssignSerializer() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        TestJsonSerializer ser = new TestJsonSerializer(false, false);
        assertNull(writer.getSerializer());
        writer.assignSerializer(ser);
        assertSame(ser, writer.getSerializer());
    }
    
    @Test
    public void testAssignSerializerOverwrites() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        TestJsonSerializer ser1 = new TestJsonSerializer(false, false);
        TestJsonSerializer ser2 = new TestJsonSerializer(false, false);
        writer.assignSerializer(ser1);
        writer.assignSerializer(ser2);
        assertSame(ser2, writer.getSerializer());
    }
    
    @Test
    public void testAssignNullSerializer() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        TestJsonSerializer nullSer = new TestJsonSerializer(false, false);
        assertFalse(writer.hasNullSerializer());
        writer.assignNullSerializer(nullSer);
        assertSame(nullSer, writer.getSerializer());
    }
    
    @Test
    public void testUnwrappingWriter() {
        writer = createWriter(new MemberInfo("test", String.class), false, false);
        TestJsonSerializer ser = new TestJsonSerializer(false, false);
        writer.assignSerializer(ser);
        BeanPropertyWriter unwrapped = writer.unwrappingWriter(null);
        assertNotNull(unwrapped);
    }
    
    private String testMethod() {
        return "test";
    }
}